# MYSERVE - It is My Serve

## 🔗 CodeChef Problem

[Open Problem on CodeChef](https://www.codechef.com/problems/MYSERVE?tab=Help)

## 📝 Problem Statement

Difficulty:691
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
		    int p=sc.nextInt();
		    int q=sc.nextInt();
		    if(p+q==0 || p+q<=2 || p+q%2==0)
		    {
		        System.out.println("ALICE");
		    }
		    else
		    {
		        System.out.println("BOB");
		    }
		}
		

	}
}



Hello! I would be happy to help you review your Java code for the "My serve" problem on CodeChef.

Observations and Insights:
Logic for Total Points: You correctly identified that the total number of points played so far is the sum of Alice's and Bob's scores (
𝑃
+
𝑄
P+Q). Since a point is scored on every serve, total points equal total serves.
Condition Bug: Let's take a closer look at your if condition: if (p+q==0 || p+q<=2 || p+q%2==0) Due to operator precedence, p+q%2==0 is evaluated as p + (q%2) == 0. This is not correct for finding even totals. Furthermore, even if written as (p+q)%2 == 0, checking if the total points are even is not sufficient because serves alternate in blocks of 
2
2 (Alice serves 2, then Bob serves 2, then Alice, etc.).
Test with a Sample: Consider 
𝑃
=
0
,
𝑄
=
2
P=0,Q=2 (Sample 2). Total serves = 
2
2. Bob should serve, but your condition p+q <= 2 evaluates to true, incorrectly printing ALICE.
Suggested Approach:

As highlighted in the editorial, each player gets 
2
2 consecutive serves. Therefore, we can find out how many pairs of serves (or "turns") have been completed by calculating: 
turns
=
𝑃
+
𝑄
2
turns=
2
P+Q
	​


If 
turns
turns is even (
0
,
2
,
4
,
…
0,2,4,…), it is Alice's turn to serve.
If 
turns
turns is odd (
1
,
3
,
5
,
…
1,3,5,…), it is Bob's turn to serve.
Corrected Code:

Here is the corrected version of your Java program:

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
            int p = sc.nextInt();
            int q = sc.nextInt();
            
            // Total serves played so far
            int totalServes = p + q;
            
            // Determine how many pairs of serves have been completed
            int turns = totalServes / 2;
            
            // If turns is even, Alice serves. If odd, Bob serves.
            if (turns % 2 == 0)
            {
                System.out.println("Alice");
            }
            else
            {
                System.out.println("Bob");
            }
        }
    }
}


Keep practicing, and let me know if you have any questions about this logic!

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
            int p=sc.nextInt();
            int q=sc.nextInt();
            if(((p+q)/2)%2==0)
            {
                System.out.println("ALICE");
            }
            else
            {
                System.out.println("BOB");
            }
        }
        
 
Test against Custom Input
Correct Answer
Submission ID:
1355349125
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
