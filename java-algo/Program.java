// import linkedlists.*;
import Trees.*;

class Program
{
    public static void main(String[] args)
    {
        BST bst = new BST();
        int[] arr = {4, 2, 1, 3, 6, 5, 7};
        bst.AddCollection(arr);
        bst.inorder();
    }
}
