# TSORT - Simple Sorting

## 🔗 CodeChef Problem

[Open Problem on CodeChef](https://www.codechef.com/problems/TSORT?tab=Help)

## 📝 Problem Statement

Difficulty:667
Expand
Prev
Next
Statement
Hints
Submissions
Solution
AI Help
Review Code with AI
English

Review my code and provide feedback on how to improve it




My current code:



import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)
		{
		    a[i] = sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
		    for(int j=i+1;j<n;j++)
		    {
		        if(a[i]>=a[j])
		        {
		            int temp=a[i];
		            a[i]=a[j];
		            a[j]=temp;
		        }
		    }
		    System.out.println(a[i]);
		}

	}
}



Hello! Let's review your solution to the sorting problem on CodeChef.

Observations and Insights
Correctness: Your logic correctly sorts the array using Bubble Sort (or Selection Sort variation) and prints the elements. However, you are printing elements inside the sorting loop, which is risky and usually incorrect for partial passes. Fortunately, your nested loops fully bubble the smallest elements to the front step-by-step, but this approach has a major flaw.
Time Complexity: Your sorting approach uses nested loops, which takes 
𝑂
(
𝑁
2
)
O(N
2
) time. Given the constraints where 
𝑁
≤
10
6
N≤10
6
, an 
𝑂
(
𝑁
2
)
O(N
2
) algorithm will take roughly 
10
12
10
12
 operations in the worst case. This will result in a Time Limit Exceeded (TLE) error on the CodeChef online judge.
I/O Performance: In Java, using Scanner and System.out.println for 
10
6
10
6
 elements is quite slow and can also contribute to TLE. It is recommended to use BufferedReader and PrintWriter or StringBuilder for large inputs and outputs.
Suggestions for Improvement
Use an Efficient Sorting Algorithm: Instead of writing your own 
𝑂
(
𝑁
2
)
O(N
2
) sorting loop, use Java's built-in Arrays.sort() which uses Dual-Pivot Quicksort (for primitives) running in 
𝑂
(
𝑁
log
⁡
𝑁
)
O(NlogN) time.
Fast I/O: For 
𝑁
=
10
6
N=10
6
, always prefer BufferedReader.
Corrected Code

Here is the optimized and accepted solution using BufferedReader and Arrays.sort():

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

class Codechef {
    public static void main(String[] args) throws IOException {
        // Using BufferedReader for fast I/O
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine().trim());
        int[] a = new int[n];
        
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(br.readLine().trim());
        }
        
        // O(N log N) sorting
        Arrays.sort(a);
        
        // Using StringBuilder for fast output
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(a[i]).append("\n");
        }
        System.out.print(sb);
    }
}


Keep up the good work, and always keep constraints in mind when choosing your algorithms!

Here is the optimized and accepted solution using BufferedReader and Arrays.sort():
without using this method give me answer




My current code:



import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)
		{
		    a[i] = sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
		    for(int j=i+1;j<n;j++)
		    {
		        if(a[i]>=a[j])
		        {
		            int temp=a[i];
		            a[i]=a[j];
		            a[j]=temp;
		        }
		    }
		    System.out.println(a[i]);
		}

	}
}



If you want to solve this problem without using Arrays.sort(), we need to look at the constraints:

1
≤
𝑁
≤
10
6
1≤N≤10
6
0
≤
elements
≤
10
6
0≤elements≤10
6

Because the maximum value of the elements is bounded by 
10
6
10
6
, we can use an alternative sorting technique called Counting Sort.

Why Counting Sort?

Comparison-based sorting algorithms (like Bubble Sort, Merge Sort, Quicksort) take at best 
𝑂
(
𝑁
log
⁡
𝑁
)
O(NlogN) time. However, Counting Sort runs in 
𝑂
(
𝑁
+
𝐾
)
O(N+K) time (where 
𝐾
K is the maximum element value). Since both 
𝑁
N and the maximum element value are 
10
6
10
6
, this approach will run extremely fast and easily pass within the time limit without using any built-in sorting methods.

Corrected Code (Using Counting Sort and Fast I/O)
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Codechef {
    public static void main(String[] args) throws IOException {
        // Using BufferedReader for fast input reading
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine().trim());
        
        // Since elements are between 0 and 10^6, we can use a frequency array
        int maxVal = 1000000;
        int[] freq = new int[maxVal + 1];
        
        for (int i = 0; i < n; i++) {
            int val = Integer.parseInt(br.readLine().trim());
            freq[val]++;
        }
        
        // Using StringBuilder for fast output printing
        StringBuilder sb = new StringBuilder();
        
        // Iterate through the frequency array and append elements in sorted order
        for (int i = 0; i <= maxVal; i++) {
            while (freq[i] > 0) {
                sb.append(i).append("\n");
                freq[i]--;
            }
        }
        
        System.out.print(sb);
    }
}

How this works:
We create a frequency array freq of size 
10
6
+
1
10
6
+1 to store the count of each number as we read it.
We iterate through our frequency array from 0 to 10^6. Since we iterate in strictly increasing order, the numbers are automatically sorted.
We print each number as man

## 💡 Approach

This problem was solved in Java and accepted by CodeChef.

## ☕ Java Solution

See `Main.java`.

## 📊 Complexity

Analyze time and space complexity according to the solution.

---

Automatically uploaded using CodeChef GitHub Auto Uploader.
