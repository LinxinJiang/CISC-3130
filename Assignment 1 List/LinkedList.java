package HW;

import DualLinkedList.MyDualLinkedList;

public class LinkedList {

    /*
        head: first node
        next: the next node for current Node
        data: the data of the node
    */

    private Node head;
    private Node next;
    private Object data;

    private class Node{
        Object data;
        Node next;

        public Node(Object data){
            super();
            this.data = data;
            this.next = null;
        }

    }


    public void insert(Object e){

        // create the node
        Node newNode = new Node(e);

        // if the head is empty, then new node is the head
        if(head == null){
            head = newNode;
        }else{

            // if the head is not empty, then add this node at the end
            // create a temp for looping
            Node temNode = head;
            // while temp is not the last one, keep looping
            while(temNode.next != null){
                temNode = temNode.next;
            }
            // if temp is the last one(next is null), then it's next is newNode
            temNode.next = newNode;
        }

    }

    public void traverse(){

        // make a tem, start from head
        Node tempNode = head;
        System.out.println("The elements are : ");
        // if tem is not null, print the data, and change the tem(to the next one)
        while(tempNode != null){
            System.out.print(tempNode.data + " ");
            tempNode = tempNode.next;
        }

    }

}
