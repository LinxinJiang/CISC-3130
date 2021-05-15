public class RBTree {

    private Node root;



    public void insert(int data){

    }



    public void traverse(){

        // test if is not empty
        if(root != null){
            orderTraverse(root);
        }


    }

    private void orderTraverse(Node node) {


        if(node.getLeft() != null){
            orderTraverse(node.getLeft());
        }


        if(node.getRight() != null){
            orderTraverse(node.getRight());
        }

    }

    private void rightRotate(Node node){

        // check node's parent


    }

    private void leftRotate(Node node){

        // check node's parent

    }





    class Node {

        private String color;
        private Node left;
        private Node right;
        private int value;
        private Node parent;


        public Node(int value, String color) {
            this.value = value;
            this.color = color;
        }

        public String toString() {
            return value + " ";
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public Node getLeft() {
            return left;
        }

        public void setLeft(Node left) {
            this.left = left;
        }

        public Node getRight() {
            return right;
        }

        public void setRight(Node right) {
            this.right = right;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public Node getParent() {
            return parent;
        }

        public void setParent(Node parent) {
            this.parent = parent;
        }
    }

}
