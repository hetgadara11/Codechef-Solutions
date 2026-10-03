# CHOCCUT - Chocolate Cutting

## 🔗 CodeChef Problem

[Open Problem on CodeChef](https://www.codechef.com/problems/CHOCCUT)

## 📝 Problem Statement

Difficulty:512
Expand
Prev
Next
Statement
Submissions
Solution
AI Help
Switch to AI Tutor Mode
NEW
Chocolate Cutting

Chef has a chocolate bar which is a rectangle-shaped of size 
𝑁
×
𝑀
N×M chocolate pieces.

He wants to divide this chocolate into 
2
2 equal pieces with a cut along a grid line. The cut needs to be parallel to the sides of the chocolate, and it cannot go through the middle of any chocolate piece.

Print 
Yes
Yes if it is possible to divide the chocolate into 
2
2 equal pieces following these rules, and 
No
No otherwise.

Input Format
The first line of input will contain a single integer 
𝑇
T, denoting the number of test cases.
Each test case consists of multiple lines of input.
The first and only line contains 
2
2 integers - 
𝑁
N and 
𝑀
M.
Output Format

For each test case, output on a new line 
Yes
Yes if it is possible to divide the chocolate bar into 
2
2 equal pieces and 
No
No otherwise.

Constraints
1
≤
𝑇
≤
100
1≤T≤100
1
≤
𝑁
,
𝑀
≤
10
1≤N,M≤10
Sample 1:
Input
Output
4
1 1
1 2
3 4
3 5

No
Yes
Yes
No

Explanation:

Test Case 1: There is only 
1
1 chocolate piece, so it would be impossible anyways to split into 
2
2.

Test Case 2: You can do one vertical cut to get 
2
2 
1
×
1
1×1 pieces.

Did you like the problem statement?
27 users found this helpful
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
            int n=sc.nextInt();
            int m=sc.nextInt();
            if((n*m)%2==0)
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
1368576525
Sub-Task	Task #	Result
(time)
1	0	Correct
(0.07)
1	1	Correct
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
