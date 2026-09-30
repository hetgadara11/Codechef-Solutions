# LOCKDRAW - Chef and Lockout Draws

## 🔗 CodeChef Problem

[Open Problem on CodeChef](https://www.codechef.com/problems/LOCKDRAW?tab=Help)

## 📝 Problem Statement

Difficulty:982
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
		    if(a>=b+c)
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



Hello! I would be happy to help you review your code and improve it.

Observations & Feedback:
Logic Error: Your current condition if (a >= b + c) only checks if the first problem's points are greater than or equal to the sum of the other two. However, any of the three problems could potentially be the one with the highest point value (which Bob would solve). You need to check all three possible combinations: 
𝐴
=
𝐵
+
𝐶
A=B+C, 
𝐵
=
𝐴
+
𝐶
B=A+C, or 
𝐶
=
𝐴
+
𝐵
C=A+B.
Alternative Approach: A much cleaner and more concise way to check this condition is to find the maximum of the three numbers. If a draw is possible, the largest problem's points must equal the sum of the other two. This is equivalent to checking if twice the maximum value equals the sum of all three values (
2
×
max
⁡
(
𝐴
,
𝐵
,
𝐶
)
=
𝐴
+
𝐵
+
𝐶
2×max(A,B,C)=A+B+C).
I/O Performance: Using Scanner is fine for this problem since 
𝑇
≤
1000
T≤1000, but for larger inputs, using BufferedReader and StringTokenizer is a best practice in Java.
Corrected Code:

Here is the corrected and optimized version of your Java code:

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
            
            // Find the maximum value among a, b, and c
            int max = Math.max(a, Math.max(b, c));
            
            // A draw is possible if the largest value equals the sum of the other two,
            // which is the same as checking if 2 * max == (a + b + c)
            if (2 * max == (a + b + c)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}

Complexity:
Time Complexity: 
𝑂
(
1
)
O(1) per testcase, resulting in 
𝑂
(
𝑇
)
O(T) overall, which easily passes within the time limit.
Space Complexity: 
𝑂
(
1
)
O(1) as we only use a few variables to store the points.
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
23
24
25
26
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
            if(2*(Math.max(a,Math.max(b,c)))==a+b+c)
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
        }
 
Test against Custom Input
Correct Answer
Submission ID:
1366982441
Sub-Task	Task #	Result
(time)
1	0	Correct
(0.11)
Subtask Score: 34%	Result - Correct
2	1	Correct
(0.17)
Subtask Score: 33%	Result - Correct
3	2	Correct
(0.17)
Subtask Score: 33%	Result - Correct
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
