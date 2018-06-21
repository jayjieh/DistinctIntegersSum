# Distinct Integers Sum
Given an array of distinct integers and a sum value. Find count of triplets with sum smaller than given sum value. Expected Time Complexity is O(n 2 ).

### Prerequisite
* Ensure you have Java 8 installed ,


#### Using O(n 2 ). we do it through the below number of steps
* 1. sort the array in ascending order
        ```sh
           Arrays.sort(arr); 
        ```
* 2. Initialize the result to zero
        ```sh
           int ans = 0;  
        ```
* 3. Run a loop from i = 0 to n-2, this loop finds all triplets with arr[i] as first element.
     a) Initialize other two elements as corner elements of subarray
        ```sh
        arr[i+1..n-1], i.e., j = i+1 and k = n-1
        ```
     b) Move j and k toward each other until they meet
     ```sh
     while (j < k)
            (i) if (arr[i] + arr[j] + arr[k] >= sum), then do k  Else for current i and j, there can (k-j) possible third elements   that satisfy the constraint.
            (ii) Else Do ans += (k - j) followed by j++
     ```


License
----

Owori Juma





