# MOVIE2X - Watching Movies at 2x

## 🔗 CodeChef Problem

[Open Problem on CodeChef](https://www.codechef.com/problems/MOVIE2X?tab=Help)

## 📝 Problem Statement

Difficulty:628
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
		    System.out.println((y/2)+(x-y));
		}

	}
}



Hello! I am your Data Structures and Algorithms tutor, and I'd be happy to review your Java solution for the "Movie 2X" problem on CodeChef.

Observations and Insights
Correct Logic: Your mathematical formulation (y / 2) + (x - y) is completely correct. You correctly calculated the time spent on the first 
𝑌
Y minutes at double speed (
𝑌
2
2
Y
	​

) and added it to the remaining time spent at normal speed (
𝑋
−
𝑌
X−Y).
Time and Space Complexity:
Time Complexity: 
𝑂
(
1
)
O(1) per test case, which is optimal.
Space Complexity: 
𝑂
(
1
)
O(1), as you are only using a few primitive variables.
Areas for Improvement
Test Case Handling: In this specific problem, the problem statement mentions that the input contains a single line with two space-separated integers 
𝑋
X and 
𝑌
Y representing a single test case (there is no outer 
𝑡
t loop for multiple test cases). Your code reads an integer t and loops 
𝑡
t times, which does not match the input format for this problem and might result in a "Wrong Answer" or "Runtime Error" on CodeChef.
Corrected Code

Here is the corrected Java code that properly aligns with the problem statement's input format (processing a single test case without the t loop):

import java.util.Scanner;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // Read input for X and Y
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        
        // Calculate total time: (Y / 2) minutes for the first Y minutes,
        // and (X - Y) minutes for the remaining movie.
        int totalTime = (y / 2) + (x - y);
        
        // Print the result
        System.out.println(totalTime);
        
        sc.close();
    }
}


Keep up the great work, and feel free to reach out if you have any more questions!

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
import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef
{
    public static void main(String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
     
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println((y / 2) + (x - y));
    }
}
Test against Custom Input
Correct Answer
Submission ID:
1349908295
Sub-Task	Task #	Result
(time)
1	0	Correct
(0.07)
Subtask Score: 20%	Result - Correct
2	1	Correct
(0.08)
Subtask Score: 20%	Result - Correct
3	2	Correct
(0.07)
Subtask Score: 20%	Result - Correct
4	3	Correct
(0.09)
Subtask Score: 20%	Result - Correct
5	4	Correct
(0.07)
Subtask Score: 20%	Result - Correct
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
