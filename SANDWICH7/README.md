# SANDWICH7 - Sandwiches

## 🔗 CodeChef Problem

[Open Problem on CodeChef](https://www.codechef.com/problems/SANDWICH7?tab=statement)

## 📝 Problem Statement

Difficulty:303
Expand
Prev
Next
Statement
Submissions
Solution
AI Help
Switch to AI Tutor Mode
NEW
Sandwiches

Chef is running a sandwich shop. He has 
𝐵
B pieces of bread, 
𝐻
H pieces of ham, and 
𝐶
C pieces of cheese.

To make a sandwich, Chef uses 
2
2 pieces of bread, and one piece of either ham or cheese, not both.

Find the maximum number of sandwiches Chef can make.

Input Format
The first line contains 
3
3 integers - 
𝐵
B, 
𝐻
H and 
𝐶
C.
Output Format

Output the maximum number of sandwiches Chef can make.

Constraints
1
≤
𝐵
,
𝐻
,
𝐶
≤
10
1≤B,H,C≤10
Sample 1:
Input
Output
8 3 1

4

Explanation:

Chef can make 
3
3 ham sandwiches, and 
1
1 cheese sandwich, using exactly 
8
8 pieces of bread, 
3
3 pieces of ham, and 
1
1 piece of cheese.

Sample 2:
Input
Output
3 2 2

1

Did you like the problem statement?
61 users found this helpful
More Info
Time limit1 secs
Memory limit1.5 GB
Source Limit50000 Bytes
Contributors
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
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc=new Scanner(System.in);
        int b=sc.nextInt();
        int h=sc.nextInt();
        int c=sc.nextInt();
        System.out.println(Math.min(b/2,h+c));
    }
}
Test against Custom Input
Correct Answer
Submission ID:
1367682209
Sub-Task	Task #	Result
(time)
1	0	Correct
(0.09)
1	1	Correct
(0.09)
1	2	Correct
(0.08)
1	3	Correct
(0.08)
1	4	Correct
(0.08)
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
