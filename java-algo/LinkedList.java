

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

    public int GetRecursiveLength() { return GetRecursiveLength(_head); }
    public int GetRecursiveLength(LinkedListNode node)
    {
        return node == null ? 0 : 1 + GetRecursiveLength(node.next);
    }
}
