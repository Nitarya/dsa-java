public void delete(int key)
{
    if(head == null)
        return;
    Node temp = head;

    while(temp != null && temp.data != key)
    {
        temp = temp.next;
    }

    if(temp == null)
        System.out.println("Key Not Found");
    else if(temp == head)
    {
        head = head.next;
        head.prev = null;
    }
    else if(temp.next == null)
        temp.prev.next = null;
    else
    {
        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;
    }
}

//Time complexity - O(1) best case
//O(n) worst case