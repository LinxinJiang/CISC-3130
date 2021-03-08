package HW;

public class ListTest {

    public static void main(String[] args){

        // create a linkedList
        LinkedList linkedList = new LinkedList();

        // added elements to the list
        linkedList.insert("SCHOOL");
        linkedList.insert("BOOK");
        linkedList.insert("FOOD");


        // loop the list
        linkedList.traverse();




        DoubleNodeLinkedList doubleNodeLinkedList = new DoubleNodeLinkedList();
        doubleNodeLinkedList.insert("1");    // 0
        doubleNodeLinkedList.insert("2");    // 1
        doubleNodeLinkedList.insert("3");    // 2
        doubleNodeLinkedList.insert("one");
        doubleNodeLinkedList.insert("Two");
        doubleNodeLinkedList.insert("Three");
        doubleNodeLinkedList.insert("Four");

        doubleNodeLinkedList.traverse();

        System.out.println();

        // Even ele
        System.out.println("Print out Even elements");
        doubleNodeLinkedList.traverseEvenData();

        System.out.println();

        // 3 spaces
        System.out.println("Print out 3 spaces elements");
        doubleNodeLinkedList.traverseByThreeData();

        System.out.println();

        // Doubly Linked List
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        doublyLinkedList.insert(1);
        doublyLinkedList.insert(2);

        System.out.println("Print out Doubly linked list");
        doublyLinkedList.traverse();

        // delete
        Object delete = doublyLinkedList.deleteEle(1);

        System.out.println();

        System.out.println("Delete ele is " + delete);

        System.out.println();

        System.out.println("Print out list(After delete)");
        doublyLinkedList.traverse();

        System.out.println();

        // delete not exist
        Object delete2 = doublyLinkedList.deleteEle(7);

    }
}


