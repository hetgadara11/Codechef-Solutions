# CRICUP - Cup Finals

## 🔗 CodeChef Problem

[Open Problem on CodeChef](https://www.codechef.com/problems/CRICUP?tab=Help)

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
		    int x=sc.nextInt();
		    int y=sc.nextInt();
		    int d=sc.nextInt();
		    if(x+y<=d)
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



Hello! I would be happy to help you review your code.

Observations & Feedback:
Logic Error: In your current code, you are checking if x + y <= d. However, the problem statement requires you to check the skill difference between the two teams, not their sum. The skill difference is represented by the absolute value of 
𝑋
−
𝑌
X−Y (i.e., 
∣
𝑋
−
𝑌
∣
∣X−Y∣).
Approach: To find the absolute difference in Java, you can use Math.abs(x - y) and then compare if that value is less than or equal to 
𝑑
d.
Time Complexity: Your solution processes each test case in 
𝑂
(
1
)
O(1) time, which is optimal and well within CodeChef's time limits.
Corrected Code:

Here is the updated Java code with the correct logic:

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
		    int d = sc.nextInt();
		    
		    // Calculate the absolute difference between the skills of the two teams
		    int diff = Math.abs(x - y);
		    
		    // Check if the difference is less than or equal to D
		    if(diff <= d)
		    {
		        System.out.println("YES");
		    }
		    else
		    {
		        System.out.println("NO");
		    }
		}
		sc.close();
	}
}


Keep practicing, and let me know if you have any questions about this problem or data structures and algorithms in general!

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
            int x=sc.nextInt();
            int y=sc.nextInt();
            int d=sc.nextInt();
            if(Math.abs(x-y)<=d)
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
        }
    }
 
Test against Custom Input
Correct Answer
Submission ID:
1365642148
Sub-Task	Task #	Result
(time)
1	1	Correct
(0.07)
Subtask Score: 50%	Result - Correct
2	2	Correct
(0.18)
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
