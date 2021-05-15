public class BinaryTree {

    Node root;

    public static void main(String[] args) {

        BinaryTree binaryTree = new BinaryTree();

        // add
        binaryTree.addNode(100,"Cat");
        binaryTree.addNode(300,"Dog");
        binaryTree.addNode(10,"Bird");
        binaryTree.addNode(14,"Fish");

        // inorder Traverse
        binaryTree.inOrderTraverse(binaryTree.root);


    }




    public void addNode(int key, Object data){
        // create the node
        Node newNode = new Node(key, data);

        // check if root exist

        // if root doesn't exist
        if(root == null){
            root = newNode;
        }else {
            // if root exist
            // traverse though the tree, start from root
            Node pNode = root;

            Node parent;

            while(true){
                parent = pNode;

                // check if the node should go to the right or left

                // put node on the left
                if(key < parent.key){
                    pNode = pNode.lefChild;

                    if(pNode == null){
                        parent.lefChild = newNode;
                        return;
                    }
                }else{
                    // put node on the right
                    pNode = pNode.rightChild;

                    if(pNode == null){
                        parent.rightChild = newNode;
                        return;
                    }
                }
            }

        }

    }


    public void inOrderTraverse(Node pNode){
        if(pNode != null){
            // traverse the left node
            inOrderTraverse(pNode.lefChild);

            System.out.println(pNode.toString());

            // traverse the right node
            inOrderTraverse(pNode.rightChild);
        }
    }

    class Node{

        int key;
        Object data;

        Node lefChild;
        Node rightChild;

        // constructor
        Node(int key, Object data){
            this.key = key;
            this.data = data;
        }

        // print out
        public String toString() {
            return "Key: " + key + " Data: " + data;
        }
    }



}

