using DS;

System.Console.WriteLine("Program started...");

int[] arr = {1,2,3,4,5};

SinglyLinkedList list = new();
list.Populate();
list.Print();
for (int i = 0; i < 10; i++)
{
    System.Console.WriteLine(list.Pop());
}
list.Print();

// foreach (int item in arr)
// {
//     list.Add(item);
//     System.Console.WriteLine(list.Length);
// }

System.Console.WriteLine("Program Exited...");