# FLOW017 - Second Largest

## 🔗 CodeChef Problem

[Open Problem on CodeChef](https://www.codechef.com/problems/FLOW017?tab=statement)

## 📝 Problem Statement

Difficulty:730
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
Second Largest

Three numbers A, B and C are the inputs. Write a program to find second largest among them.

Input Format

The first line contains an integer T, the total number of testcases. Then T lines follow, each line contains three integers A, B and C.

Output Format

For each test case, display the second largest among A, B and C, in a new line.

Constraints
1 ≤ T ≤ 1000
1 ≤ A,B,C ≤ 1000000
Sample 1:
Input
Output
3 
120 11 400
10213 312 10
10 3 450
120
312
10
Did you like the problem statement?
209 users found this helpful
More Info
Time limit1 secs
Memory limit1.5 GB
Source Limit50000 Bytes
Contributors
Java
​
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
27
28
29
30
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
            if((a >= b && a <= c) || (a >= c && a <= b))
            {
                System.out.println(a);
            }
            else if((b >= a && b <= c) || (b >= c && b <= a))
            {
                System.out.println(b);
            }
            else
            {
                System.out.println(c);
            }
        }
 
Test against Custom Input
Correct Answer
Submission ID:
1370266814
Sub-Task	Task #	Result
(time)
1	0	Correct
(0.15)
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
