# REGCLN - Regular Cleaning

## 🔗 CodeChef Problem

[Open Problem on CodeChef](https://www.codechef.com/problems/REGCLN?tab=Help)

## 📝 Problem Statement

Difficulty:113
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
		int n=sc.nextInt();
		

	}
}



Hello! I would be happy to help you with your CodeChef problem.

Observations and Insights:
Incomplete Code: Your current solution reads the input into the integer variable n, but it does not perform the necessary calculation or print the output.
Logic Needed: Since Chef cleans the house on multiples of 
10
10 (i.e., 
10
,
20
,
30
,
…
10,20,30,…), the next cleaning day strictly after day 
𝑁
N will be the smallest multiple of 
10
10 that is strictly greater than 
𝑁
N.
Mathematical Approach: Using modular arithmetic, the remainder of 
𝑁
N divided by 
10
10 (N % 10) tells us how many days have passed since the last cleaning. Subtracting this remainder from 
10
10 (i.e., 10 - (N % 10)) gives us the exact number of days remaining until the next cleaning day.
Suggestions for Improvement:
Make sure to compute 10 - (n % 10) and print the result using System.out.println().
The time complexity of this approach is 
𝑂
(
1
)
O(1) and space complexity is 
𝑂
(
1
)
O(1), which is extremely optimal.
Corrected Code:

Here is the complete and corrected Java code for the problem:

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // Read input from the user
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        // Calculate the days remaining until the next cleaning
        int daysToNextCleaning = 10 - (n % 10);
        
        // Output the result
        System.out.println(daysToNextCleaning);
    }
}


Keep up the good work, and feel free to ask if you have any questions about this approach!

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
        System.out.println(10-(n%10));
    }
}
Test against Custom Input
Correct Answer
Submission ID:
1348464841
Sub-Task	Task #	Result
(time)
1	0	Correct
(0.07)
1	1	Correct
(0.07)
1	2	Correct
(0.07)
1	3	Correct
(0.08)
1	4	Correct
(0.10)
1	5	Correct
(0.07)
Subtask Score: 100%	Result - Correct
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
