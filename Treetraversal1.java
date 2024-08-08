class TreeNode{
    int data;
    TreeNode left;
    TreeNode right;
    TreeNode(int data){
        this.data=data;
        left=right=null;
    }
}
class Tree{
    public void Inorder(TreeNode node){
        if(node==null){
            return;
        }
        Inorder(node.left);
        System.out.print(node.data+" ");
        Inorder(node.right);
    }
    public void Preorder(TreeNode node){
        if(node==null){
            return;
        }
       System.out.print(+node.data+" ");
       Preorder(node.left);
       Preorder(node.right); 
    }
    public void Postorder(TreeNode node){
        if(node==null){
            return;
        }
        Postorder(node.left);
        Postorder(node.right);
        System.out.print(node.data+" ");
    }
    public static void main(String args[]){
        TreeNode obj = new TreeNode(4);
        obj.left = new TreeNode(2);
        obj.left.left=new TreeNode(3);
        obj.left.left.right=new TreeNode(9);
        obj.left.left.right.left=new TreeNode(1);
        obj.right=new TreeNode(5);
        obj.right.left=new TreeNode(7);
        obj.right.right=new TreeNode(6);
        obj.right.right.left=new TreeNode(8);
        Tree res = new Tree();
        System.out.println("Inorder");
        res.Inorder(obj);
        System.out.println("\n Preorder");
        res.Preorder(obj);
        System.out.println("\n Postorder");
        res.Postorder(obj);
    
    }
}