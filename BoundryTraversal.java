    private static void leftSide(Node root){
        if(root==null){
            return;
        }else if(root.left!=null || root.right!=null){
            System.out.print(root.data+" ");
            leftSide(root.left);
        }
    }

    private static void leafNOde(Node root){
        if(root==null){
            return;
        }else if(root.left==null && root.right==null){
            System.out.print(root.data+" ");
        }else {
            leafNOde(root.left);
            leafNOde(root.right);
        }
    }

    private static void RightSide(Node root){
        if(root==null){
            return;
        }else if(root.left!=null || root.right!=null){
            RightSide(root.right);
            System.out.print(root.data+" ");
        }
    }

    public static void boundaryTraversal(Node root){
        leftSide(root);
        leafNOde(root);
        RightSide(root.right);  //to eliminate the root node again
    }

//MAIN

    public static void main(String args[]) {
        BinaryTree binaryTree=new BinaryTree(10);
        binaryTree.insertLeft(binaryTree.root,5);
        binaryTree.insertRight(binaryTree.root,15);
        binaryTree.insertLeft(binaryTree.root.left,3);
        binaryTree.insertRight(binaryTree.root.left,8);
        binaryTree.insertLeft(binaryTree.root.right,12);
        binaryTree.insertRight(binaryTree.root.right,111);
        
        binaryTree.boundaryTraversal(binaryTree.root);


    }
}
