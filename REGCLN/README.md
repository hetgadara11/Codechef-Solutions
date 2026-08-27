# REGCLN - Regular Cleaning

## 🔗 CodeChef Problem

[Open Problem on CodeChef](https://www.codechef.com/problems/REGCLN)

## 📝 Problem Statement

Difficulty:113
Expand
Prev
Next
Statement
Submissions
Solution
AI Help
Switch to AI Tutor Mode
NEW
Regular Cleaning

Chef will do a deep cleaning of his house every 
10
10 days - meaning on days numbered 
10
,
20
,
30
,
…
10,20,30,…

Today is day number 
𝑁
N.
How many more days are there until the next day strictly after today that Chef will deep clean?

Input Format
The only line of input will contain one integer 
𝑁
N, representing the current day number.
Output Format

Output a single integer: the number of days till the next deep cleaning.

Constraints
1
≤
𝑁
≤
100
1≤N≤100
Sample 1:
Input
Output
24

6

Explanation:

Today is day 
24
24. The next deep cleaning will be on day 
30
30, so the answer is 
30
−
24
=
6
30−24=6.

Sample 2:
Input
Output
30

10

Explanation:

Today is day 
30
30. The next deep cleaning after today will be on day 
40
40, so the answer is 
40
−
30
=
10
40−30=10.

Note that even though a deep cleaning is done on day 
30
30 itself, we want to know the number of days to the next day with cleaning.

Sample 3:
Input
Output
49

1

Explanation:

Today is day 
49
49. The next deep cleaning will be on day 
50
50, so the answer is 
50
−
49
=
1
50−49=1.

Did you like the problem statement?
40 users found this helpful
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
1348466853
Sub-Task	Task #	Result
(time)
1	0	Correct
(0.07)
1	1	Correct
(0.08)
1	2	Correct
(0.07)
1	3	Correct
(0.07)
1	4	Correct
(0.07)
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
