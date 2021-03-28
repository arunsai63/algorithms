using System;

namespace DS
{
    public class SinglyLinkedList
    {
        private Node _head;

        public void Add(int data)
        {
            if (_head is null)
            {
                _head = new Node(data);
                return;
            }
            var node = _head;
            while (node.next is not null)
                node = node.next;

            node.next = new Node(data);
        }

        public int Length { get => GetLength(_head); }

        private int GetLength(Node node) => node is null ? 0 : (1 + GetLength(node.next));

        private int GetLength()
        {
            int length = 0;
            var node = _head;
            while (node is not null)
            {
                ++length;
                node = node.next;
            }
            return length;
        }

        public void Populate(int len = 10)
        {
            if (len < 1)
                throw new ArgumentException();

            var node = _head;
            while (len-- > 0)
            {
                if (node is null)
                {
                    _head = new Node(len);
                    node = _head;
                }
                else
                {
                    node.next = new Node(len);
                    node = node.next;
                }
            }
        }

        public void Print()
        {
            var node = _head;
            while (node is not null)
            {
                System.Console.Write($"{node.data} -> ");
                node = node.next;
            }
            System.Console.Write("END\n");
        }

        // pop the last node
        public int Pop()
        {
            if (_head is null)
                throw new System.InvalidOperationException();
            
            int data;
            if (_head.next is null)
            {
                data = _head.data;
                _head = null;
            }
            else
            {
                var node = _head;
                while (node.next.next is not null)
                    node = node.next;
                data = node.next.data;
                node.next = null;
            }
            return data;
        }

        private class Node
        {
            public int data { get; set; }
            public Node next { get; set; }

            private Node() { }
            public Node(int data)
            {
                this.data = data;
            }
        }
    }
}
