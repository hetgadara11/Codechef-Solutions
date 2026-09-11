# P2209 - Divisible Duel

## 🔗 CodeChef Problem

[Open Problem on CodeChef](https://www.codechef.com/problems/P2209?tab=Help)

## 📝 Problem Statement

Difficulty:628
Expand
Prev
Next
Statement
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
		    int x=sc.nextInt();
		    int y=sc.nextInt();
		    int se=0,so=0;
		    for(int i=x;x<=y;i++)
		    {
		        if(i%2==0)
		        {
		            se=se+i;
		        }
		        else
		        {
		            so=so+i;
		        }
		    }
		    if(se>so)
		    {
		        System.out.println("YES");
		    }
		    else
		    {
		        System.out.println("NO");
		    }
		}

	}
}



Hello! I would be happy to review your code and help you improve it.

Observations and Feedback:
Infinite Loop Bug: In your for loop condition, you wrote x <= y instead of i <= y. Because x never changes inside the loop, if the condition x <= y is true initially, it results in an infinite loop!
Logic Check: Your current loop checks every integer from x to y. However, the problem states that you only need to consider the numbers between 
𝑋
X and 
𝑌
Y that are divisible by 
𝑋
X (i.e., multiples of 
𝑋
X).
Constraints and Performance: Since 
𝑋
,
𝑌
≤
100
X,Y≤100, your brute-force approach with a loop is fine once fixed, but a mathematical 
𝑂
(
1
)
O(1) approach is much faster and cleaner.
Corrected Code (Brute-Force Approach):

Here is the corrected version of your code keeping your original loop structure, but fixing the loop condition and adding the check for multiples of 
𝑋
X:

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0)
		{
		    int x = sc.nextInt();
		    int y = sc.nextInt();
		    int se = 0, so = 0;
		    
		    // Fixed the loop condition from x<=y to i<=y
		    for(int i = x; i <= y; i++)
		    {
		        // Check if i is a multiple of x
		        if(i % x == 0)
		        {
		            if(i % 2 == 0)
		            {
		                se = se + i;
		            }
		            else
		            {
		                so = so + i;
		            }
		        }
		    }
		    
		    if(se >= so) // Note: problem says S_even >= S_odd means happy
		    {
		        System.out.println("YES");
		    }
		    else
		    {
		        System.out.println("NO");
		    }
		}
	}
}

Optimized Approach (
𝑂
(
1
)
O(1) Time Complexity):

Since the constraints are very small (
𝑋
,
𝑌
≤
100
X,Y≤100), we can also solve this mathematically without running a loop.

If 
𝑋
X is even, all its multiples are even, so 
𝑆
𝑒
𝑣
𝑒
𝑛
≥
𝑆
𝑜
𝑑
𝑑
S
even
	​

≥S
odd
	​

 is always YES.
If 
𝑋
X is odd, the parity of the multiples alternates. We just need to find 
𝑘
=
𝑌
/
𝑋
k=Y/X (the number of multiples). If 
𝑘
k is even, 
𝑆
𝑒
𝑣
𝑒
𝑛
≥
𝑆
𝑜
𝑑
𝑑
S
even
	​

≥S
odd
	​

 (YES), otherwise NO.

Here is how you can write the 
𝑂
(
1
)
O(1) solution in Java:

import java.util.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0)
		{
		    int x = sc.nextInt();
		    int y = sc.nextInt();
		    int k = y / x;
		    
		    if(x % 2 == 0 || k % 2 == 0) {
		        System.out.println("YES");
		    } else {
		        System.out.println("NO");
		    }
		}
	}
}

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
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int x=sc.nextInt();
            int y=sc.nextInt();
            int d=y/x;
            if(x%2==0 || d%2==0)
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
        }
    }
}
 
Test against Custom Input
Correct Answer
Submission ID:
1356276612
Sub-Task	Task #	Result
(time)
1	0	Correct
(0.07)
Subtask Score: 50%	Result - Correct
2	1	Correct
(0.22)
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
