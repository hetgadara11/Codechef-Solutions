# MISSINGNUM7 - Missing Number

## 🔗 CodeChef Problem

[Open Problem on CodeChef](https://www.codechef.com/problems/MISSINGNUM7)

## 📝 Problem Statement

Difficulty:151
Expand
Prev
Next
Statement
Submissions
Solution
AI Help
Go to Top
Switch to AI Tutor Mode
NEW
Missing Number

Chef had 
4
4 pieces of paper with him, one paper with 
1
1 written on it, one paper with 
2
2, one paper with 
3
3 and finally one paper with 
4
4.

Now, Chef lost one of the pieces of paper, and noticed that the other numbers on his papers add up to 
𝑆
S. Find the number on the missing paper.

Input Format
The first and only line of input contains a single integer 
𝑆
S.
Output Format

Output the number on the missing paper.

Constraints
6
≤
𝑆
≤
9
6≤S≤9
Sample 1:
Input
Output
6

4

Explanation:

Chef has the papers 
1
1, 
2
2 and 
3
3 with him; as they add up to 
6
6, so the missing has to be 
4
4.

Sample 2:
Input
Output
9

1

Did you like the problem statement?
39 users found this helpful
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
        int s=sc.nextInt();
        System.out.println(10-s);
    }
}
Test against Custom Input
Correct Answer
Submission ID:
1354236843
Sub-Task	Task #	Result
(time)
1	0	Correct
(0.08)
1	1	Correct
(0.10)
1	2	Correct
(0.10)
1	3	Correct
(0.10)
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
