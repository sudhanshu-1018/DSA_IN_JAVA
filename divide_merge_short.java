public class divide_merge_short{
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void mergeSort(int arr[],int si, int end) {
        if(si>=end){
            return;
        }
        int mid=si+(end-si)/2;
        mergeSort(arr,si,mid);
        mergeSort(arr,mid+1,end);
        merge(arr,si,mid,end);
    }
    public static void merge(int arr[],int si,int mid,int end){
        int temp[]=new int[end-si+1];
        int i=si;
        int j=mid+1;
        int k=0;

        while(i<=mid && j<=end){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
            }else{
                temp[k]=arr[j];
                j++;
            }
            k++;
        }

        while(i<=mid){
            temp[k++]=arr[i++];
        }
        while(j<=end){
            temp[k++]=arr[j++];
        }

        for(k=0,i=si;k<temp.length;k++,i++){
            arr[i]=temp[k];
        }
    }

    public static void main(String args[]) {
        int arr[] = {5, 3, 6, 4, 7, 2, 0, 8, 9};
        mergeSort(arr,0, arr.length-1);
        printArray(arr); // Print the sorted array
    }
}


// Sure! Let’s break down the recursive calls step-by-step to show how the recursion moves through the array:

// 1.Initial Call:
//     mergeSort(arr, 0, 8);
//     AI-generated code. Review and use carefully. More info on FAQ.
//     si = 0, end = 8
//     mid = 0 + (8 - 0) / 2 = 4
//     Calls: mergeSort(arr, 0, 4) and mergeSort(arr, 5, 8)

// 2.First Half (mergeSort(arr, 0, 4)):
//     si = 0, end = 4
//     mid = 0 + (4 - 0) / 2 = 2
//     Calls: mergeSort(arr, 0, 2) and mergeSort(arr, 3, 4)

// 3.First Quarter (mergeSort(arr, 0, 2)):
//     si = 0, end = 2
//     mid = 0 + (2 - 0) / 2 = 1
//     Calls: mergeSort(arr, 0, 1) and mergeSort(arr, 2, 2)

// 4.First Eighth (mergeSort(arr, 0, 1)):
//     si = 0, end = 1
//     mid = 0 + (1 - 0) / 2 = 0
//     Calls: mergeSort(arr, 0, 0) and mergeSort(arr, 1, 1)

// 5.Base Cases:
//     mergeSort(arr, 0, 0) returns immediately because si >= end
//     mergeSort(arr, 1, 1) returns immediately because si >= end

// 6.Merge Step:
//     merge(arr, 0, 0, 1) merges the subarrays [5] and [3] into [3, 5]

// 7.Second Eighth (mergeSort(arr, 2, 2)):
//     mergeSort(arr, 2, 2) returns immediately because si >= end

// 8.Merge Step:
//     merge(arr, 0, 1, 2) merges the subarrays [3, 5] and [6] into [3, 5, 6]

// 9.Second Quarter (mergeSort(arr, 3, 4)):
//     si = 3, end = 4
//     mid = 3 + (4 - 3) / 2 = 3
//     Calls: mergeSort(arr, 3, 3) and mergeSort(arr, 4, 4)

// 10.Base Cases:
//     mergeSort(arr, 3, 3) returns immediately because si >= end
//     mergeSort(arr, 4, 4) returns immediately because si >= end

// 11.Merge Step:
//     rge(arr, 3, 3, 4) merges the subarrays [4] and [7] into [4, 7]

// 12.Merge Step:
//     merge(arr, 0, 2, 4) merges the subarrays [3, 5, 6] and [4, 7] into [3, 4, 5, 6, 7]

// 13.Second Half (mergeSort(arr, 5, 8)):
//     si = 5, end = 8
//     mid = 5 + (8 - 5) / 2 = 6
//     Calls: mergeSort(arr, 5, 6) and mergeSort(arr, 7, 8)

// 14.Third Quarter (mergeSort(arr, 5, 6)):
//     si = 5, end = 6
//     mid = 5 + (6 - 5) / 2 = 5
//     Calls: mergeSort(arr, 5, 5) and mergeSort(arr, 6, 6)

// 15.Base Cases:
//     mergeSort(arr, 5, 5) returns immediately because si >= end
//     mergeSort(arr, 6, 6) returns immediately because si >= end

// 16.Merge Step:
//     merge(arr, 5, 5, 6) merges the subarrays [2] and [0] into [0, 2]

// 17.Fourth Quarter (mergeSort(arr, 7, 8)):
//     si = 7, end = 8
//     mid = 7 + (8 - 7) / 2 = 7
//     Calls: mergeSort(arr, 7, 7) and mergeSort(arr, 8, 8)

// 18.Base Cases:
//     mergeSort(arr, 7, 7) returns immediately because si >= end
//     mergeSort(arr, 8, 8) returns immediately because si >= end

// 19.Merge Step:
//     merge(arr, 7, 7, 8) merges the subarrays [8] and [9] into [8, 9]

// 20.Merge Step:
//     merge(arr, 5, 6, 8) merges the subarrays [0, 2] and [8, 9] into [0, 2, 8, 9]

// 21.Final Merge Step:
//     merge(arr, 0, 4, 8) merges the subarrays [3, 4, 5, 6, 7] and [0, 2, 8, 9] into [0, 2, 3, 4, 5, 6, 7, 8, 9]


// This step-by-step breakdown shows how the recursion moves forward by dividing the array and then merges the sorted subarrays as it returns back up the call stack.






// The recursion moves forward because each recursive call processes a smaller segment of the array,
//  moving from the larger array to smaller subarrays until the base case is met.
//  Once the base case is reached, the function starts returning, and the merge function combines the sorted subarrays.

// In essence, the recursion moves forward by breaking down the problem into smaller subproblems (dividing the array)
//  and then solving these subproblems (sorting and merging) until the entire array is sorted.





// The recursion moves forward by breaking the array into smaller subarrays,
//  but the actual merging and printing of the sorted array happen as the function returns back up the call stack.

// So, the base case ensures that the recursion stops at the right point,
//  and the merging and printing happen as the function returns back up the call stack.
//  This is why you see the sorted array printed at the end.







// Why si Can Be Greater Than end:


// When the array is divided into smaller subarrays, the indices are adjusted accordingly.
// For example, if you have an array of size 2, the first recursive call will divide it into two subarrays of size 1 each.
//  The indices for these subarrays will be such that si can become greater than end in subsequent recursive calls.

// Let’s break it down with an example:
// Suppose you have an array [5, 3, 6, 4] and you call mergeSort(arr, 0, 3).

// The first division will be mergeSort(arr, 0, 1) and mergeSort(arr, 2, 3).

// Further dividing mergeSort(arr, 0, 1) will result in mergeSort(arr, 0, 0) and mergeSort(arr, 1, 1).

// Now, mergeSort(arr, 0, 0) will hit the base case because si (0) is equal to end (0).

// Similarly, mergeSort(arr, 1, 1) will hit the base case because si (1) is equal to end (1).