public void addLast(int val)
{
    Node newNode = new Node();
    newNode.data = val;
    newNode.next = null;
    else
    {
        Node lastNode = head;
        while(lastNode.next != null)
        {
            lastNode = lastNode.next;
        }
        lastNode.next = newNode;
    }
}