# FSQRT - Finding Square Roots

## 🔗 CodeChef Problem

[Open Problem on CodeChef](https://www.codechef.com/problems/FSQRT)

## 📝 Problem Statement

Difficulty:668
Expand
Prev
Next
Statement
Hints
Submissions
Solution
AI Help
Go to Top
Switch to AI Tutor Mode
NEW
Learn problem solving techniques required to solve this problem
Take our problem solving courses to understand how to attempt problems like these.
Start Learning
Finding Square Roots

In olden days finding square roots seemed to be difficult but nowadays it can be easily done using in-built functions available across many languages .

Assume that you happen to hear the above words and you want to give a try in finding the square root of any given integer using in-built functions. So here's your chance.

Input

The first line of the input contains an integer T, the number of test cases. T lines follow. Each line contains an integer N whose square root needs to be computed.

Output

For each line of the input, output the square root of the input integer, rounded down to the nearest integer, in a new line.

Constraints

1<=T<=20
1<=N<=10000


Sample 1:
Input
Output
3
10
5
10000
3
2
100
Did you like the problem statement?
199 users found this helpful
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
            System.out.println((int)(Math.round(Math.sqrt(n))));
        }
    }
}
Test against Custom Input
Correct Answer
Submission ID:
1346953639
Sub-Task	Task #	Result
(time)
1	0	Correct
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
