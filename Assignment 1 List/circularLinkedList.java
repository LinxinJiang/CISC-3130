package HW;

public class circularLinkedList {

    private Node last;


    class Node{
        Object data;
        Node next;

        public Node(Object data){
            this.data = data;
            this.next = null;
        }
    }

    public void insert(Object e){

        // create the node
        Node newNode = new Node(e);

        // if the last is empty, then new node point to itself
        if(last == null){
            newNode.next = newNode;
        }else{
            newNode.next = last.next;
            last.next = newNode;
        }

        // move the old last to new last
        last = newNode;
    }


}
