package linkedlists;
import java.util.*;

public class LinkedListsUtils 
{
    //https://www.geeksforgeeks.org/write-a-function-to-get-the-intersection-point-of-two-linked-lists/
    public static int getIntersectionNode(LinkedListNode head1, LinkedListNode head2)
    {
        LinkedList list = new LinkedList();
        int l1 = list.Getlength(head1), l2 = list.Getlength(head2);
        LinkedListNode temp1 = head1, temp2 = head2;
        if(l1 > l2)
            while(l1 != l2)
            {
                temp1 = temp1.next;
                l1--;
            }
        else
            while(l2 != l1)
            {
                temp2 = temp2.next;
                l2--;
            }
        while(temp1 != null || temp2 != null)
        {
            if(temp1 == temp2)
                return temp1.data;
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return -1; //no intersection
    }

    public static boolean detectCycleSet(LinkedListNode head)
    {
        if (head == null || head.next == null)
            return false;
        HashSet<LinkedListNode> set = new LinkedHashSet<>();
        while(head != null)
        {
            if(set.contains(head))
                return true;
            set.add(head);
            head = head.next;
        }
        return false; 
    }

    //Floyd’s Cycle-Finding Algorithm
    public static boolean detectCycleFloyd(LinkedListNode head)
    {
        if (head == null || head.next == null)
            return false;
        LinkedListNode slowPtr = head, fastPtr = head;
        while(fastPtr != null && fastPtr.next != null)
        {
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
            if(slowPtr == fastPtr)
                return true;
        }
        return false;
    }
}