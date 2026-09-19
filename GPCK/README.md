# GPCK - Gift Packs

## 🔗 CodeChef Problem

[Open Problem on CodeChef](https://www.codechef.com/problems/GPCK)

## 📝 Problem Statement

Difficulty:263
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
Gift Packs

Chef is preparing gifts for a school event. He has 
𝐴
A notebooks and 
𝐵
B pens.

Each gift pack must contain one notebook and one pen. Each item can be used in only one pack.

Find the maximum number of complete gift packs Chef can prepare.

Input Format

The only line contains two integers 
𝐴
A and 
𝐵
B — the number of notebooks and pens.

Output Format

Print a single integer — the maximum number of complete gift packs.

Constraints
0
≤
𝐴
,
𝐵
≤
1000
0≤A,B≤1000
Sample 1:
Input
Output
5 3
3
Explanation:

Chef can prepare 
3
3 gift packs using 
3
3 notebooks and all 
3
3 pens. The remaining 
2
2 notebooks cannot form another complete pack.

Sample 2:
Input
Output
2 6
2
Explanation:

Chef has only 
2
2 notebooks, so he can prepare at most 
2
2 gift packs.

Did you like the problem statement?
2 users found this helpful
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
import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a>=b)
        {
            System.out.println(b);
        }
        else
        {
            System.out.println(a);
        }
    }
}
 
Test against Custom Input
Correct Answer
Submission ID:
1359358050
Sub-Task	Task #	Result
(time)
1	3	Correct
(0.07)
Subtask Score: 9%	Result - Correct
2	4	Correct
(0.06)
Subtask Score: 9%	Result - Correct
3	5	Correct
(0.06)
Subtask Score: 9%	Result - Correct
4	6	Correct
(0.06)
Subtask Score: 9%	Result - Correct
5	7	Correct
(0.06)
Subtask Score: 8%	Result - Correct
6	8	Correct
(0.06)
Subtask Score: 8%	Result - Correct
7	9	Correct
(0.07)
Subtask Score: 8%	Result - Correct
8	10	Correct
(0.06)
Subtask Score: 8%	Result - Correct
9	11	Correct
(0.06)
Subtask Score: 8%	Result - Correct
10	12	Correct
(0.07)
Subtask Score: 8%	Result - Correct
11	13	Correct
(0.07)
Subtask Score: 8%	Result - Correct
12	14	Correct
(0.07)
Subtask Score: 8%	Result - Correct
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
