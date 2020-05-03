package Trees;
import java.util.Collection;

public class BST 
{
    private Tree _root;
    
    public void Add(int value)
    {
        if(_root == null)
        {
            _root = new Tree(value);
            return;
        }
        Tree temp = _root;
        while(temp != null)
        {
            if (temp.data > value)
                if(temp.Left == null)
                {
                    temp.Left = new Tree(value);
                    return;
                }
                else
                    temp = temp.Left;
            else if (temp.data < value)
                if(temp.Right == null)
                {
                    temp.Right = new Tree(value);
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

    public int getHeight() { return getHeight(_root); }
    public int getHeight(Tree node)
    {
        if (node == null)
            return 0;
        int lheight = getHeight(node.Left), rheight = getHeight(node.Right);
        return lheight > rheight ? lheight + 1 : rheight + 1;
    }

    public void inorder() { inorder(_root); }
    public void inorder(Tree node)
    {
        if (node.Left != null)
            inorder(node.Left);
        System.out.println(node.data);
        if (node.Right != null)
            inorder(node.Right);    
    }

    public void preorder() { preorder(_root); }
    public void preorder(Tree node)
    {
        System.out.println(node.data);
        if (node.Left != null)
            preorder(node.Left);
        if (node.Right != null)
            preorder(node.Right);    
    }

    public void postorder() { postorder(_root); }
    public void postorder(Tree node)
    {
        if (node.Left != null)
            postorder(node.Left);
        if (node.Right != null)
            postorder(node.Right);    
        System.out.println(node.data);    
    }
}
