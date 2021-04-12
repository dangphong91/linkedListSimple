package phong.linkedlist;

public class Test {
    public static void main(String[] args) {
        MyLinkedList ll = new MyLinkedList(10);
        ll.addFirst(11);
        ll.addFirst(12);
        ll.addFirst(13);
        ll.printList();
        System.out.println("************************");

        ll.add(4,9);
        ll.add(2,9);
        ll.printList();
    }
}
