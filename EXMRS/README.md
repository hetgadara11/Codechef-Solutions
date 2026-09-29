# EXMRS - Exam Result

## 🔗 CodeChef Problem

[Open Problem on CodeChef](https://www.codechef.com/problems/EXMRS)

## 📝 Problem Statement

Difficulty:284
Expand
Prev
Next
Statement
Hints
Submissions
Solution
AI Help
Switch to AI Tutor Mode
NEW
Exam Result

Chef has received his exam results. He answered 
𝐶
C questions correctly and 
𝑊
W questions incorrectly. Each correct answer earns 
𝑀
M marks, while each incorrect answer deducts 
𝑃
P marks.

Chef needs a final score of at least 
𝑅
R marks to pass. Determine whether he passes the exam. His final score may be negative.

Input Format

The only line contains five space-separated integers 
𝐶
C, 
𝑀
M, 
𝑊
W, 
𝑃
P, and 
𝑅
R.

Output Format

Print YES if Chef passes the exam, otherwise print NO.

Constraints
0
≤
𝐶
,
𝑊
≤
100
0≤C,W≤100
1
≤
𝑀
,
𝑃
≤
10
1≤M,P≤10
0
≤
𝑅
≤
1000
0≤R≤1000
Sample 1:
Input
Output
8 4 2 1 30
YES
Explanation:

Chef earns 
8
×
4
=
32
8×4=32 marks and loses 
2
×
1
=
2
2×1=2 marks. His final score is 
30
30, exactly the required score, so he passes.

Sample 2:
Input
Output
0 4 5 2 0
NO
Explanation:

Chef earns no marks and loses 
5
×
2
=
10
5×2=10 marks. His final score is 
−
10
−10, which is below the required score of 
0
0, so he fails.

Did you like the problem statement?
15 users found this helpful
More Info
Time limit1 secs
Memory limit1.5 GB
Source Limit50000 Bytes
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
        int c=sc.nextInt();
        int m=sc.nextInt();
        int w=sc.nextInt();
        int p=sc.nextInt();
        int r=sc.nextInt();
        if((c*m)-(w*p)>=r)
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
1365540335
Sub-Task	Task #	Result
(time)
1	0	Correct
(0.07)
Subtask Score: 8%	Result - Correct
2	1	Correct
(0.07)
Subtask Score: 8%	Result - Correct
3	2	Correct
(0.07)
Subtask Score: 8%	Result - Correct
4	3	Correct
(0.07)
Subtask Score: 8%	Result - Correct
5	4	Correct
(0.07)
Subtask Score: 8%	Result - Correct
6	5	Correct
(0.07)
Subtask Score: 8%	Result - Correct
7	6	Correct
(0.07)
Subtask Score: 8%	Result - Correct
8	7	Correct
(0.07)
Subtask Score: 8%	Result - Correct
9	8	Correct
(0.07)
Subtask Score: 8%	Result - Correct
10	9	Correct
(0.08)
Subtask Score: 7%	Result - Correct
11	10	Correct
(0.08)
Subtask Score: 7%	Result - Correct
12	11	Correct
(0.07)
Subtask Score: 7%	Result - Correct
13	12	Correct
(0.07)
Subtask Score: 7%	Result - Correct
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
