    public static int childSumParent(Node n1){
        if(n1==null){
            return 0;
        }else if(n1.left !=null && n1.right!=null){
            if(n1.left.data+n1.right.data!=n1.data){
                return 0;
            }
            childSumParent(n1.left);
            childSumParent(n1.right);

        }

        return 1;
    }
