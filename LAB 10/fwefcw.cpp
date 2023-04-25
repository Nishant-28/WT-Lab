// A subarray is any contiguous block of an array's elements. Given an array of integers, find the sum of all elements of all subarrays of that array.

// Example :
// For example, a three element array [4, 5, 6] can be made into the following subarrays:
// 1 element subarrays: [4], [5], [6]
// 2 element subarrays: [4,5], [5,6]
// 3 element subarrays: [4, 5, 6]

// The sum of all subarrays is 4+5+6+(4+5)+(5+6)+(4+5+6) = 50.

// Function Description : subarraySum has the following parameter(s): int arr[n]: an array of integers to process
// Returns: int: an integer representing the sum of all subarrays of the given array


#include <bits/stdc++.h>
using namespace std;

// int subarraySum(int arr[], int n) {
//     int result = 0, temp = 0;
//     for (int i = 0; i < n; i++) {
//         temp = 0;
//         for (int j = i; j < n; j++) {
//             temp += arr[j];
//             result += temp;
//         }
//     }
//     return result;
// }

long subarraySum(vector<int> arr) {
    // long result = 0, temp = 0;
    // for (int i = 0; i < arr.size(); i++) {
    //     temp = 0;
    //     for (int j = i; j < arr.size(); j++) {
    //         temp += arr[j];
    //         result += temp;
    //     }
    // }
    // return result;

    // re write the above function in less time complexity
    long result = 0;
    for (int i = 0; i < arr.size(); i++) {
        result += (arr[i] * (i + 1) * (arr.size() - i));
    }
    return result;
}

int main(){

    // int arr[] = {1, 2, 3};
    // int n = sizeof(arr)/sizeof(arr[0]);
    // cout << subarraySum(arr, n);

    vector<int> arr = {1, 2, 3};
    cout << subarraySum(arr);

    return 0;
}
