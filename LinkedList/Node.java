package LinkedList;

public class Node {
    public Node nextNode;
    public int value;

    public Node(int value) {
        this.value = value;
        nextNode = null;
    }   

    public void append(int newValue) {
        Node newNode = new Node(newValue);
        Node curr = this; 

        while (curr.nextNode != null) {
            curr = curr.nextNode;
        }
        curr.nextNode = newNode;
    }

    public int get() {
        return this.value;
    }
}


