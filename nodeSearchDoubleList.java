public boolean search(int key)
{
    Node temp = head;

    while(temp != null)
    {
        if(temp.data == key)
            return true;
        temp = temp.next;
    }
    return false;
}

Time complexity = O(1)