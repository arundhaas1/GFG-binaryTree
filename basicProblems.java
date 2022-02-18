//Height of tree

public int findHeight(Node root) {
        if(root==null){
            return 0;
        }else{
            int lh=height(root.left);
            int rh=height(root.right);

            return (lh>rh?lh+1:rh+1);
        }
    }

//Number of Node

public int noOfNode(Node root) {
         if(root==null){
            return 0;
        }else{
            int lh=height(root.left);
            int rh=height(root.right);

            return lh+rh+1;
        }
    }

//Number of Leaf Nodes

public int noOfLeafNodes(Node root) {
         if(root==null){
            return 0;
        }else if(root.left==null && root.right==null){
            return 1;
        }else{
            int lh=height(root.left);
            int rh=height(root.right);

            return lh+rh;
        }
    }

