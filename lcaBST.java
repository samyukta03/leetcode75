public class lcaBST extends TreeNode{
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null) return null;
        if(p.val>root.val&&q.val>root.val) return lowestCommonAncestor(root.right,p,q);
        if(p.val<root.val&&q.val<root.val) return lowestCommonAncestor(root.left,p,q);
        if(p.val>root.val&&q.val<root.val || p.val<root.val&&q.val>root.val) return root;
    
    return root;
    }
    public static void main(String[] args) {
        TreeNode tree = new TreeNode(5, new TreeNode(3, new TreeNode(2,null,null), new TreeNode(4,null,null)), new TreeNode(7,new TreeNode(6,null,null),null));
        TreeNode ans = new TreeNode();
        lcaBST lca = new lcaBST();
        ans = lca.lowestCommonAncestor(tree,tree.right.left,tree.left.right);
        System.out.println(ans.val);
    }
}
