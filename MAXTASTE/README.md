# MAXTASTE - Maximise the Tastiness

## 🔗 CodeChef Problem

[Open Problem on CodeChef](https://www.codechef.com/problems/MAXTASTE?tab=Help)

## 📝 Problem Statement

Difficulty:627
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
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int d=sc.nextInt();
            if(a>b)
            {
                if(c>d)
                {
                    System.out.println(a+c);
                }
                else
                {
                    System.out.println(b+d);
                }
            }
            else
            {
                if(c>d)
                {
                    System.out.println(b+c);
                }
                else{
                    System.out.println(b+d);
                }
            }
        }
	}
}



Hello! Let's review your code for the "Maximum Taste" problem.

Observations & Insights:
Correctness: Your logic correctly identifies the maximum possible tastiness by comparing the ingredients. However, there is a small logical bug in your else branch. When 
𝑎
≤
𝑏
a≤b, you compared 
𝑐
c and 
𝑑
d, but if 
𝑐
≤
𝑑
c≤d, you printed b + d (which is correct), but if 
𝑐
>
𝑑
c>d, you printed b + c (which is also correct). Wait, let's look closer at your nested if-else for 
𝑎
>
𝑏
a>b:
If 
𝑎
>
𝑏
a>b and 
𝑐
>
𝑑
c>d, you print a + c. (Correct)
If 
𝑎
>
𝑏
a>b and 
𝑐
≤
𝑑
c≤d, you print b + d. (Incorrect! If 
𝑎
>
𝑏
a>b, we should pick 
𝑎
a, not 
𝑏
b. It should be a + d.)
Simplicity: Using nested if-else statements makes the code prone to human error (as seen above) and harder to read. Since the first ingredient is chosen independently of the second ingredient, we simply need to find the maximum of the first pair (
𝐴
A or 
𝐵
B) and add it to the maximum of the second pair (
𝐶
C or 
𝐷
D).
Java's Built-in Functions: You can use Math.max(x, y) to find the maximum of two numbers cleanly without writing manual if-else blocks.
Improved Approach:

Instead of branching out all 4 combinations manually, you can compute: 
Max Tastiness
=
max
⁡
(
𝑎
,
𝑏
)
+
max
⁡
(
𝑐
,
𝑑
)
Max Tastiness=max(a,b)+max(c,d)

This reduces the time complexity to 
𝑂
(
1
)
O(1) per test case and keeps your code short and bug-free.

Corrected Code:
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
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            
            // Find the maximum of the first group (a or b) 
            // plus the maximum of the second group (c or d)
            int maxTaste = Math.max(a, b) + Math.max(c, d);
            
            System.out.println(maxTaste);
        }
        sc.close();
	}
}


Keep up the great work, and happy coding on CodeChef!

Java
​
1
2
3
4
5
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
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int d=sc.nextInt();
            System.out.println(Math.max(a,b)+Math.max(c,d));
        }
    }
}
Test against Custom Input
Correct Answer
Submission ID:
1347920329
Sub-Task	Task #	Result
(time)
1	0	Correct
(0.08)
Subtask Score: 33%	Result - Correct
2	1	Correct
(0.16)
Subtask Score: 33%	Result - Correct
3	2	Correct
(0.10)
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
