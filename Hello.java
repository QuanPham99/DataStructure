import LinkedList.Node;

public class Hello {
    public static void main(String args[]) {
        System.out.println("Hello World");

        Node one = new Node(10); 
        one.append(20);
        System.out.println(one.get());
        System.out.println(one.nextNode.get());

    }
}