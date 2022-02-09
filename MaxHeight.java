public int findHeight(Node root) {
        int left=0;int right=0;
        if(root.left!=null){
            left=findHeight(root.left);
        }
        if(root.right!=null){
            right=findHeight(root.right);
        }
        if(right>left){     //+1 must otherwise it shows zero.
            return right+1;
        }else {
            return left+1;
        }
    }
