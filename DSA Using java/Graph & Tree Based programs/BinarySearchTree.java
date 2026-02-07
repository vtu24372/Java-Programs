class BinarySearchTree{
    class TreeNode{
        int key;
        TreeNode left,right;
        TreeNode(int item){
            key = item;
            left=right=null;
        }
    }
    public class BST{
       private TreeNode root;
        public BST(){
            root=null;
        }
        public TreeNode insert(int key, TreeNode root){
            if(root==null){
                root=new TreeNode(root);
                return root;
            } else if(key<root.key){
                root.left=insert(key, root.left);
            } else
        }

    }
}