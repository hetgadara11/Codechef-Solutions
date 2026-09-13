# FOODPLAN - Online or Offline

## 🔗 CodeChef Problem

[Open Problem on CodeChef](https://www.codechef.com/problems/FOODPLAN?tab=Help)

## 📝 Problem Statement

Difficulty:713
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
		    int m=sc.nextInt();
		    int o= n-(n/10);
		    if(o<m)
		    {
		        System.out.println("ONLINE");
		    }
		    else if(o==m)
		    {
		        System.out.println("EITHER");
		    }
		    else
		    {
		        System.out.println("DINING");
		    }
		}

	}
}



Hello! I would be happy to review your code and provide feedback.

Observations and Insights:
Correct Logic: Your approach to calculating the discounted online price (int o = n - (n / 10);) is correct. Since 
𝑁
N and 
𝑀
M are integers, integer division n / 10 correctly computes 
10
%
10% of 
𝑁
N (assuming standard floor division).
Clean I/O: Using Scanner with nextInt() is straightforward and works well for the given constraints (
𝑇
≤
1000
T≤1000).
Precision Trick Improvement: A common way to avoid potential floating-point or integer division rounding issues in competitive programming is to cross-multiply. Instead of comparing 
𝑁
−
𝑁
10
N−
10
N
	​

 with 
𝑀
M, you can compare 
9
𝑁
9N with 
10
𝑀
10M. This keeps everything in strict integer arithmetic without division.
Suggested Improvements:

While your current solution is fully correct and will pass on CodeChef, using cross-multiplication (as seen in the expected solution) is a great habit to form for problems involving percentages or fractions.

Here is the refined version of your code using the cross-multiplication approach:

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0)
		{
		    int n = sc.nextInt();
		    int m = sc.nextInt();
		    
		    // 10% discount on N means Chef pays 90% of N, which is 0.9 * N.
		    // Comparing (0.9 * N < M) is mathematically equivalent to comparing (9 * N < 10 * M).
		    int onlineCost = 9 * n;
		    int diningCost = 10 * m;
		    
		    if (onlineCost < diningCost)
		    {
		        System.out.println("ONLINE");
		    }
		    else if (onlineCost > diningCost)
		    {
		        System.out.println("DINING");
		    }
		    else
		    {
		        System.out.println("EITHER");
		    }
		}
		sc.close();
	}
}


Keep up the great work! Let me know if you have any questions.

Java
​
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
30
31
32
33
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int m=sc.nextInt();
            
            if(9*n<m*10)
            {
                System.out.println("ONLINE");
            }
            else if(9*n==m*10)
            {
                System.out.println("EITHER");
            }
            else
            {
                System.out.println("DINING");
            }
        }
    }
}
 
Test against Custom Input
Correct Answer
Submission ID:
1356791073
Sub-Task	Task #	Result
(time)
1	0	Correct
(0.10)
Subtask Score: 33%	Result - Correct
2	1	Correct
(0.21)
Subtask Score: 33%	Result - Correct
3	2	Correct
(0.14)
Subtask Score: 34%	Result - Correct
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
