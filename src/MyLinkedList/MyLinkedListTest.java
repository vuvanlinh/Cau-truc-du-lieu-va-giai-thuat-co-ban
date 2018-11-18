package MyLinkedList;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList(10);
        linkedList.addFirst(11);
        linkedList.add(5,12);
        linkedList.printList();
    }
}