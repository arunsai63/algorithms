#include <iostream>
using namespace std;

void swap(int* num1, int* num2)
{
    *num1 = *num1 + *num2;
    *num2 = *num1 - *num2;
    *num1 = *num1 - *num2;
}

void sort(int* arr, int len)
{
    for(int i = 0; i < len - 1; i++)
        for(int j = i + 1; j < len; j++)
            if(arr[i] > arr[j])
                swap(&arr[i], &arr[j]); 
}

void sortDesc(int* arr, int len)
{
    for(int i = 0; i < len - 1; i++)
        for(int j = i + 1; j < len; j++)
            if(arr[i] < arr[j])
                swap(&arr[i], &arr[j]); 
}

void printArr(int* arr, int len)
{
    for(int i = 0; i < len; i++)
        cout << arr[i] << " ";
    cout << endl;
}

int main()
{
    int arr[10] = {10,9,8,7,6,5,4,3,2,1};
    printArr(arr, 10);
    insertSort(arr, 10);
    printArr(arr, 10); 
    return 0;
}
