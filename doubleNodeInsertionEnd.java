public void addLast(int val)
{
    Node newNode = new Node();
    newNode.data = val;

    if(head == null)
    {
        newNode.prev = null;
        newNode.next = null;
        head = newNode;
    }
    else
    {
        Node last = head;
        while(last.next != null)
        {
            last = last.next;
        }
        last.next = newNode;
        newNode.prev = last;
        newNode.next = null;
    }
}

//Time complexity = O(n)