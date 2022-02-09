// --> The binary tree is a Mirror image of itself .


public static boolean Symmetric(Node n1){
        return areMirrorTrees(n1,n1);
    }

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
//
public class Main {
    public static void main(String[] args) {
	    Binarytree binarytree=new Binarytree(10);
        binarytree.insertLeft(binarytree.root,5);
        binarytree.insertRight(binarytree.root, 5);

        System.out.println(binarytree.Symmetric(binarytree.root));
    }

}
