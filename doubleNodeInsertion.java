public void addFirst(int val)
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
        newNode.prev = null;
        newNode.next = head;
        head = newNode;
    }
    else
    {
        newNode.prev = null;
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }
}

// Time complexity = O(1)