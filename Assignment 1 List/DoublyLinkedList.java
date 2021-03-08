package HW;

import DualLinkedList.MyDualLinkedList;

import java.sql.SQLOutput;

public class DoublyLinkedList {
    private Node first;
    private Node last;
    private int size;

    private class Node{
        Object data;
        Node prev;
        Node next;

        public Node(Object data){
            super();
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }


    public void insert(Object e) {

        // create the node
        Node newNode = new Node(e);

        if(first == null){
            first = newNode;
        }else{

            Node temNode = first;
            // while temp is not the last one, keep looping
            while(temNode.next != null){
                temNode = temNode.next;
            }

            temNode.next = newNode;
            newNode.prev = temNode;

        }

    }

//    public void insertByOrder(Object e) {
//
//        // create the node
//        Node newNode = new Node(e);
//
//        if(first == null){
//            first = newNode;
//        }else{
//
//            Node temNode = first;
//            // while temp is not the last one, keep looping
//            while(temNode.next != null){
//                if(temNode.prev.data >= newNode.data && temNode.next.data >= newNode.data )
//                temNode = temNode.next;
//            }
//
//            temNode.next = newNode;
//            newNode.prev = temNode;
//
//        }

//    }





    public void traverse(){

        // make a tem, start from head
        Node tempNode = first;
        System.out.println("Doubly Linked List's elements are : ");
        // if tem is not null, print the data, and change the tem(to the next one)
        while(tempNode != null){
            System.out.print(tempNode.data + " ");
            tempNode = tempNode.next;
        }

    }

    public Object deleteEle(Object e){
        Node pNode = first;
        while(pNode != null){
            if(pNode.data == e){

                Node prev = pNode.prev;
                Node next = pNode.next;


                if(prev == null){
                    first = next;
                }else{
                    prev.next = next;
                }

                if(next == null){

                    last = prev;
                }else{
                    next.prev = prev;
                }

                break;

            }else{
                System.out.println("this data value does not exist");
            }

            pNode = pNode.next;
        }

        return e;
    }

}
