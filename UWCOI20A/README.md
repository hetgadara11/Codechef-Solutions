# UWCOI20A - Find maximum in an Array

## 🔗 CodeChef Problem

[Open Problem on CodeChef](https://www.codechef.com/problems/UWCOI20A?tab=statement)

## 📝 Problem Statement

Difficulty:650
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
Find maximum in an Array

Given a list of 
𝑁
N integers, representing height of mountains. Find the height of the tallest mountain.

Input:
First line will contain 
𝑇
T, number of testcases. Then the testcases follow.
The first line in each testcase contains one integer, 
𝑁
N.
The following line contains 
𝑁
N space separated integers: the height of each mountains.
Output:

For each testcase, output one line with one integer: the height of the tallest mountain for that test case.

Constraints
1
≤
𝑇
≤
10
1≤T≤10
1
≤
𝑁
≤
100000
1≤N≤100000
0
≤
0≤ height of each mountain 
≤
10
9
≤10
9
Sample 1:
Input
Output
1
5
4 7 6 3 1
7
Did you like the problem statement?
1030 users found this helpful
More Info
Time limit1 secs
Memory limit1.5 GB
Source Limit50000 Bytes
Contributors
Java
​
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
31
32
33
        Scanner sc=new Scanner(System.in);
        int t =sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int[] a=new int[n];
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
            }
             int max = a[0];
            for (int i = 1; i < n; i++) {
                if (a[i] > max) {
                    max = a[i];
                }
            }
            System.out.println(max);
        }
    }
}
 
Test against Custom Input
Correct Answer
Submission ID:
1375010819
Sub-Task	Task #	Result
(time)
1	0	Correct
(0.90)
Subtask Score: 34%	Result - Correct
2	1	Correct
(0.07)
Subtask Score: 33%	Result - Correct
3	2	Correct
(0.08)
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
