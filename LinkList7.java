public class LinkList7
{
    public class Node
    {
        private int item;
        private Node next;

        public Node()
        {
            item = 0;
            next = null;
        }

        public Node(int item, Node next)
        {
            this.item = item;
            this.next = next;
        }

        public int getItem()
        {
            return item;
        }

        public Node getNext()
        {
            return next;
        }

        public void setItem(int item)
        {
            this.item = item;
        }

        public void setNext(Node next)
        {
            this.next = next;
        }

        @Override
        public String toString() {
            return "item: " + item + "\n";
        }
    }

    public LinkList7()
    {
        head = null;
    }

    private Node head;

    public void addBeginningNode(int number, Node next)
    {
        Node newHead = new Node(number, head);

        head = newHead;
    }

    public Node getHead()
    {
        return head;
    }



}
