package linkedlists;

public class LinkedList
{
    private LinkedListNode _head;

    public LinkedListNode GetHead()
    {
        return _head;
    }

    public void Add(int value)
    {
        if(_head == null)
            _head = new LinkedListNode(value); 
        else
        {
            LinkedListNode node = _head;
            while(node.next != null)
                node = node.next;
            node.next = new LinkedListNode(value);
        }
    }

    public void AddByPos(int value, int position)
    {
        if(position < 0 || (_head == null && position != 0))
            return;
        LinkedListNode node =  new LinkedListNode(value);
        if(position == 0)
        {
            node.next = _head;
            _head = node;
            return;
        }
        LinkedListNode temp = _head;
        while(position != 1 && temp != null)
        {
            --position;
            temp = temp.next;
        }
        if (temp == null)
            return;
        node.next = temp.next;
        temp.next = node;
    }

    public boolean Delete(int value)
    {
        if(_head == null)
            return false;
        else if (_head.data == value)
        {
            _head = _head.next;
            return true;
        }
        LinkedListNode node = _head, prev = null;
        while(node != null && node.data != value)
        {
            prev = node;
            node = node.next;
        }
        if (node == null)
            return false;
        prev.next = node.next;
        return true;
    }

    public boolean DeleteByPos(int pos)
    {
        if(pos < 1 || _head == null)
            return false;
        else if (pos == 1)
        {
            _head = _head.next;
            return true;
        }
        LinkedListNode node = _head, prev = null;
        while(pos != 1 && node != null)
        {
            prev = node;
            node = node.next;
            --pos;
        }
        if (node == null)
            return false;
        prev.next = node.next;
        return true;
    }
    public void View() { View(_head); }
    public void View(LinkedListNode node)
    {
        while(node != null)
        {
            System.out.println(node.data);
            node = node.next;
        }
    }

    public void ViewRecursive() { ViewRecursive(_head); }
    public void ViewRecursive(LinkedListNode node)
    {
        if (node != null)
        {
            System.out.println(node.data);
            ViewRecursive(node.next);
        }
    }

    public void ViewRevRecursive() { ViewRevRecursive(_head); }
    public void ViewRevRecursive(LinkedListNode node)
    {
        if (node != null)
        {
            ViewRevRecursive(node.next);
            System.out.println(node.data);
        }
    }

    public int Getlength() { return Getlength(_head); }
    public int Getlength(LinkedListNode node)
    {
        int length = 0;
        while(node != null)
        {
            length++;
            node = node.next;
        }    
        return length;
    }

    public int GetLengthRecursive() { return GetLengthRecursive(_head); }
    public int GetLengthRecursive(LinkedListNode node)
    {
        return node == null ? 0 : 1 + GetLengthRecursive(node.next);
    }
}
