class Program
{
    public static void main(String[] args)
    {
        LinkedList list = new LinkedList();
        list.View();
        System.out.println(list.DeleteByPos(10));
        list.Add(-1);
        System.out.println(list.DeleteByPos(1));
        list.View();
        for(int i = 1; i <= 10; i++)
            list.Add(i);
        System.out.println(list.DeleteByPos(1));
        System.out.println(list.DeleteByPos(8));
        System.out.println(list.DeleteByPos(4));
        list.View();
    }
}
