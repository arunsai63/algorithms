package Trees;
import java.util.Collection;

public class BST 
{
    private TreeNode _root;
    
    public boolean Contains(int value) { return Contains(_root, value); }
    public boolean Contains(TreeNode node, int value)
    {
        TreeNode temp = _root;
        while(temp != null)
        {
            if (temp.data > value)
                temp = temp.Left;
            else if (temp.data < value)
                temp = temp.Right;
            else
                return true;
        }
        return false;
    }

    public void Add(int value)
    {
        if(_root == null)
        {
            _root = new TreeNode(value);
            return;
        }
        TreeNode temp = _root;
        while(temp != null)
        {
            if (temp.data > value)
                if(temp.Left == null)
                {
                    temp.Left = new TreeNode(value);
                    return;
                }
                else
                    temp = temp.Left;
            else if (temp.data < value)
                if(temp.Right == null)
                {
                    temp.Right = new TreeNode(value);
                    return;
                }
                else
                    temp= temp.Right;
            else
                return;
        }
    }

    public void AddCollection(Collection<Integer> list)
    {
        list.forEach(x -> Add(x));
    }

    public void AddCollection(int[] list)
    {
        for (int i : list)
            Add(i);
    }

    public int GetHeight() { return GetHeight(_root); }
    public int GetHeight(TreeNode node)
    {
        if (node == null)
            return 0;
        int lheight = GetHeight(node.Left), rheight = GetHeight(node.Right);
        return lheight > rheight ? lheight + 1 : rheight + 1;
    }

    public void InOrder() { InOrder(_root); }
    public void InOrder(TreeNode node)
    {
        if (node.Left != null)
            InOrder(node.Left);
        System.out.println(node.data);
        if (node.Right != null)
            InOrder(node.Right);    
    }

    public void PreOrder() { PreOrder(_root); }
    public void PreOrder(TreeNode node)
    {
        System.out.println(node.data);
        if (node.Left != null)
            PreOrder(node.Left);
        if (node.Right != null)
            PreOrder(node.Right);    
    }

    public void PostOrder() { PostOrder(_root); }
    public void PostOrder(TreeNode node)
    {
        if (node.Left != null)
            PostOrder(node.Left);
        if (node.Right != null)
            PostOrder(node.Right);    
        System.out.println(node.data);    
    }
}
