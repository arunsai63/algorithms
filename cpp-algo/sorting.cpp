#include <iostream>
using namespace std;

namespace sorting
{   
    void swap(int* num1, int* num2)
    {
        *num1 = *num1 + *num2;
        *num2 = *num1 - *num2;
        *num1 = *num1 - *num2;
    }

    void printArr(int* arr, int len)
    {
        for(int i = 0; i < len; i++)
            cout << arr[i] << " ";
        cout << endl;
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

    void insertSort(int* arr, int len)
    {
        int i, j, key;
        for(i = 1; i < len; i++)
        {
            key = arr[i]; 
            j = i - 1; 
            while(j >= 0 && arr[j] > key)
            {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
}