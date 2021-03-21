#include <string.h>

namespace algos
{
    int fibonacci(int n)
    {
        return n < 2 ? n : fibonacci(n - 1) + fibonacci(n - 2);
    }

    int binarySearch(int* arr, int size, int data)
    {
        int low = 0, high = size - 1, mid;
        while (low <= high)
        {
            mid = (low + high) / 2;
            if (arr[mid] == data)
                return mid;
            else if (arr[mid] < data)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }

    class algos
    {
    private:
        /* data */
    public:
        algos(/* args */);
        ~algos();
    };

    algos::method1()
    {

    }
    
    algos::algos(/* args */)
    {
    }
    
    algos::~algos()
    {
    }
    
}
