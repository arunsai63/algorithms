class Program
{
    public static void main(String[] args)
    {
        LinkedList list = new LinkedList();
        list.View();
        for(int i = 1; i <= 10; i++)
            list.Add(i);
        list.ViewRecursive();
    }
}
