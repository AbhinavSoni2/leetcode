package practice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class listNode
{
    int value;
    listNode next;
    listNode(int x)
    {
        value = x;
        next = null;
    }
}

class MergeTwoSortedList
{
    public static void print(listNode head)
    {
        while(head != null)
        {
            System.out.print(head.value + " ");
            head = head.next;
        }
        return;
    }
    public static listNode mergeTwoSortedLists(listNode l1 , listNode l2)
    {
        listNode dummy_head = new listNode(-1) , prehead = dummy_head;
        while(l1 != null && l2 != null)
        {
            if(l1.value < l2.value)
            {
                dummy_head.next = l1;
                l1 = l1.next;
            }
            else
            {
                dummy_head.next = l2;
                l2 = l2.next;
            }
            dummy_head = dummy_head.next;
        }
        dummy_head.next = ((l1 != null) ? l1 : l2);
        return prehead.next;
    }

	
	

	public static void main(String[] args) 
	{
		listNode l1 = new listNode(1);
        l1.next = new listNode(2);
        l1.next.next = new listNode(9);
        
        listNode l2 = new listNode(1);
        l2.next = new listNode(3);
        l2.next.next = new listNode(4);
        print(mergeTwoSortedLists(l1 , l2));
		

	}

}
