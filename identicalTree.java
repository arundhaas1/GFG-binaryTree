    public static boolean equals(BinaryTree.Node node1, BinaryTree.Node node2){
        if(node1!=null && node2!=null){
            if(node1.data!=node2.data){   //check every data values from top to bottom of left to left and right to right.
                return false;
            }else{
                equals(node1.left,node2.left);   
                equals(node1.right,node2.right);
            }
        }
        return true;
    }


//MIRROR TREE

    public static boolean equals(BinaryTree.Node node1, BinaryTree.Node node2){
        if(node1!=null && node2!=null){
            if(node1.data!=node2.data){
                return false;
            }else{
                equals(node1.left,node2.right);    //check every left value with right and every right value with left
                equals(node1.right,node2.left);
            }
        }
        return true;
    }
