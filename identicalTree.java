//IDENTICAL TREE..

  public static boolean areIdenticalTrees(Node root1,Node root2){
        if(root1 == null && root2 == null)  //if both reaches leaf node 
            return true;
        if(root1 == null || root2 == null)   //only one reaches the leaf node
            return false;
        if(root1 != null  && root2 != null) {
            return ((root1.data == root2.data) &&
                    (areIdenticalTrees(root1.left, root2.left)) &&
                    (areIdenticalTrees(root1.right, root2.right)));
        }
        return false;
    }

//
public class Main {
    public static void main(String[] args) {
	    Binarytree binarytree=new Binarytree(10);
        binarytree.insertLeft(binarytree.root,5);
        binarytree.insertRight(binarytree.root, 12);

        Binarytree binarytree1=new Binarytree(10);
        binarytree.insertLeft(binarytree1.root,5);
        binarytree.insertRight(binarytree1.root, 12);

        System.out.println(binarytree.areIdenticalTrees(binarytree.root, binarytree1.root));
    }
}

//MIRROR TREE

public static boolean areMirrorTrees(Node root1,Node root2){
        if(root1 == null && root2 == null)
            return true;
        if(root1 == null || root2 == null)
            return false;
        if(root1 != null  && root2 != null) {
            return ((root1.data == root2.data) &&
                    (areMirrorTrees(root1.left, root2.right)) &&
                    (areMirrorTrees(root1.right, root2.left)));
        }
        return false;
    }
