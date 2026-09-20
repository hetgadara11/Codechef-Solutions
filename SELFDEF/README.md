# SELFDEF - Self Defence Training

## 🔗 CodeChef Problem

[Open Problem on CodeChef](https://www.codechef.com/problems/SELFDEF?tab=Help)

## 📝 Problem Statement

Difficulty:716
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
		int t=sc.nextInt();
		while(t-->0)
		{
		    int n=sc.nextInt();
		    int count=0;
		    int[] a=new int[n];
		    for(int i=0;i<n;i++)
		    {
		        a[i]=sc.nextInt();
		    }
		    for(int i=0;i<n;i++)
		    {
		        if(a[i]>=15 && a[i]<=60)
		        {
		            count=count+1;
		        }
		    }
		    System.out.println(count);
		}

	}
}



Here is a review of your solution and some suggestions for improvement.

Observations and Feedback:
Logic Error (Condition Check): The problem statement clearly mentions that a woman is eligible if her age is between 
10
10 and 
60
60 years, inclusive (i.e., 
10
≤
𝐴
𝑖
≤
60
10≤A
i
	​

≤60). In your code, you checked a[i] >= 15 && a[i] <= 60. Because of this, you are incorrectly missing women whose ages are between 
10
10 and 
14
14. Be sure to read the constraints carefully!
Memory Efficiency: You used an array int[] a = new int[n]; to store the ages. Since we only need to check each age once and can process it immediately as it is read from the input, we don't actually need to store the entire array. Eliminating the array reduces the space complexity from 
𝑂
(
𝑁
)
O(N) to 
𝑂
(
1
)
O(1).
I/O Performance: Using Scanner is fine for small inputs like 
𝑁
≤
100
N≤100, but for larger competitive programming problems, BufferedReader and StringTokenizer are recommended to handle fast I/O.
Corrected Code:

Here is the corrected version of your Java code incorporating the fixes:

import java.util.Scanner;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        
        // Check if there are test cases available
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                int count = 0;
                
                // We can read and check the ages on the fly without storing them in an array
                for (int i = 0; i < n; i++) {
                    int age = sc.nextInt();
                    // Fixed the condition to include ages from 10 to 60
                    if (age >= 10 && age <= 60) {
                        count++;
                    }
                }
                System.out.println(count);
            }
        }
        sc.close();
    }
}

Complexity Analysis:
Time Complexity: 
𝑂
(
𝑁
)
O(N) per test case, as we iterate through the 
𝑁
N ages once.
Space Complexity: 
𝑂
(
1
)
O(1) auxiliary space, since we process each age on the fly instead of storing them in an array.
Java
​
6
7
8
9
10
11
12
13
14
15
16
17
18
19
20
21
22
23
24
25
26
27
28
29
    {
        Scanner sc = new Scanner(System.in);
        
     
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                int count = 0;
                
                
                for (int i = 0; i < n; i++) {
                    int age = sc.nextInt();
                    
                    if (age >= 10 && age <= 60) {
                        count++;
                    }
                }
                System.out.println(count);
            }
        }
        sc.close();
    }
}
 
Test against Custom Input
Correct Answer
Submission ID:
1360022526
Sub-Task	Task #	Result
(time)
1	0	Correct
(0.08)
Subtask Score: 50%	Result - Correct
2	1	Correct
(0.09)
Subtask Score: 50%	Result - Correct
		Total Score = 100%

Visualize Code
Run
Submit

## 💡 Approach

This problem was solved in Java and accepted by CodeChef.

## ☕ Java Solution

See `Main.java`.

## 📊 Complexity

Analyze time and space complexity according to the solution.

---

Automatically uploaded using CodeChef GitHub Auto Uploader.
