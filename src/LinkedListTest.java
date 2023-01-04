public class LinkedListTest {
    public static void main(String[] args) {
        MyLinkedList<String> myLinkedList = new MyLinkedList();
        myLinkedList.add("Oak");
        myLinkedList.add("Ash");
        myLinkedList.add("Maple");
        System.out.println("myLinkedList " + myLinkedList.size());
        System.out.println("myLinkedList " + myLinkedList.get(0));
        System.out.println("myLinkedList " + myLinkedList.get(1));
        System.out.println("myLinkedList " + myLinkedList.get(2));
        myLinkedList.clear();
        System.out.println("myLinkedList " + myLinkedList.size());
        myLinkedList.add("Oak");
        myLinkedList.add("Ash");
        myLinkedList.add("Maple");
        System.out.println("myLinkedList " + myLinkedList.size());
    }
}
