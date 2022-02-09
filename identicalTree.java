    public static boolean equals(BinaryTree.Node node1, BinaryTree.Node node2){
        if(node1!=null && node2!=null){
            if(node1.data!=node2.data){   //check every data values from top to bottom
                return false;
            }else{
                equals(node1.left,node2.left);
                equals(node1.right,node2.right);
            }
        }
        return true;
    }
