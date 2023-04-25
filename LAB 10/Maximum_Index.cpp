// There is an infinite array of integers numbered consecutively from 0. At each step, a pointer can move from index/to index i + j or remain where it is. The value of /begins at 0. The value of /begins at 1 and at each step, /increments by 1. There is one known index that must be avoided. Determine the highest index that can be reached in given number of steps.

// Example: 
// steps = 7
// badElement = 6

// The Pointer is limited to 4 steps and should avoid the bad item 6.

// Senario 1:
// a. In the first step, j starts at 1. Move 1 unit to index 0 + 1 = 1 and j = 2.
// b. At step 2, move 2 units to index 1 + 2 = 3, and j = 3.
// c. At step 3, do not move. Otherwise, the pointer will move 3 units to the bad item 6. Now j = 4.
// d. At step 4, move 4 units to item 3 + 4 = 7

// Scenario 2:
// a. At step 1, remain at index 0. Now j = 2.
// b. At step 2, move 2 units to index 0 + 2 = 2 and j = 3.
// c. At step 3, move 3 units to index 2 + 3 = 5 and j = 4.
// d. At step 4, move 4 units to index 5 + 4 = 9.

// The maximum index that can be reached is 9.

// Function Description:
// Complete the function maxIndex in the editor below.

// maxIndex has the following parameter(s):
//  int steps : the number of steps to take
//  int badIndex : the bad __has_include_next

// Returns: 
// int : the maximum index that can be reached from 0

// steps: 3, badIndex = 3
// Output : 5
// Explanation: 
    // Senario 1: 
    //     At step 1, move 1 unit to index 0 + 1 = 1
    //     At step 2, remain at index 1. Otherwise the pointer will move to the bad index number 3.
    //     At step 3, move 3 units to index 1 + 3 = 4
        
    // Senario 1: 
    //     At step 1, remain at index 0.
    //     At step 2, moce 2 units to index 0 + 2 = 2
    //     At step 3, move 3 units to index 2 + 3 = 5


#include <bits/stdc++.h>
using namespace std;

int maxIndex(int N, int B) {
    int max = 0;
	for (int i = 1; i <= N; i++) 
		max += i;
	

	int cur = max, step = N;
	while (1) {
		while (cur > 0 && N > 0) {
			cur -= N;
			if (cur== B) {
				cur += N;
			}
			N--;
		}

		if (cur <= 0) {
			cout << max << endl;
			break;
		}else {
			N = step;
			cur = max - 1;
			max--;
			if (cur == B) {
				cur = max - 1;
					max--;
			}
		}
	}
}

int main() {
    int steps = 3, badIndex = 3;
    cout << maxIndex(steps, badIndex);
    return 0;
}