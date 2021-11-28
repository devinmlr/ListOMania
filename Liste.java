public class Liste
{
    Node start;
    int length;
    Node nodepointer;
    
    public Liste(Object start)
    {
        this.start= new Node(start);
    }

    class Node {
        Node next;
        Object obj;
        public Node (Object obj) {
            this.obj = obj;
        }
        
        public void setNext(Node next) {
            this.next = next;
        }
        
        public Node getNext() {
            return next;
        }
        
        public String toString () {
            return ((Affe)obj).getName();
        }
    }
    
    public void initPointer () {
        nodepointer = start;
    }
    
    public void printNode (int stelle) {
        initPointer();
        for (int i=0; i<stelle; i++) {
            nodepointer = nodepointer.getNext();
        }
        System.out.println(nodepointer);
    }
    
    public void append (Object obj) {
        Node node = new Node(obj);
        initPointer();
        while (nodepointer.next != null) {
            nodepointer = nodepointer.getNext();
        } 
        nodepointer.setNext(node);
    }
    
    public void insert (int stelle, Object obj) {
        Node node = new Node(obj);
        initPointer();
        for (int i=1; i<stelle; i++) {
            nodepointer = nodepointer.getNext();
        }
        node.setNext(nodepointer.getNext());
        nodepointer.setNext(node);
    }
    
    public void delete (int stelle) {
        initPointer();
        for (int i=1; i<stelle-1; i++) {
            nodepointer = nodepointer.getNext();
        }
        nodepointer.setNext((nodepointer.getNext()).getNext());
    }
    
    public int getLength() {
        initPointer();
        int counter = 0;
        do {
            counter += 1;
            nodepointer = nodepointer.getNext();
        }while (nodepointer.next != null);
        return counter+1;
    }
}
