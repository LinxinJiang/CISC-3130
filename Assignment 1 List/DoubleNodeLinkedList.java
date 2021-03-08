package HW;

public class DoubleNodeLinkedList {

    /*
        head: first node
        next: the next node for current Node
        nextNext: next of next
        data: the data of the node
    */

    private Node head;
    private Node next;
    private Node nextNext;
    private Object data;

    private class Node{
        Object data;
        Node next;
        Node nextNext;

        public Node(Object data){
            super();
            this.data = data;
            this.next = null;
            this.nextNext = null;
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
            temNode.nextNext = newNode.next;
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

    public void traverseEvenData(){

        // counter
        int count = 1;

        // make a tem, start from head
        Node tempNode = head;
        System.out.println("The even elements are : ");

        // if tem is not null
        while(tempNode != null){

            // even element
            if(count % 2 == 0){
                System.out.print(tempNode.data + " ");
                tempNode = tempNode.next;
            }else{
                tempNode = tempNode.next;
            }

            count ++;

        }


//        Node tempNode = head;
//        System.out.println("The even elements are : ");
//        while(tempNode != null){
//            System.out.print(tempNode.nextNext.data + " ");
//            tempNode = tempNode.next;
//        }


    }

    public void traverseByThreeData(){
        // counter
        int count = 1;

        // make a tem, start from head
        Node tempNode = head;
        System.out.println("The 3 spaces elements are : ");

        // print out the 0
        System.out.print(tempNode.data + " ");
        tempNode = tempNode.next;

        // if tem is not null
        while(tempNode != null){



            if(count % 3 == 0){
                System.out.print(tempNode.data + " ");
                tempNode = tempNode.next;
            }else{
                tempNode = tempNode.next;
            }

            count ++;

        }

    }



}
