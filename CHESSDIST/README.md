# CHESSDIST - Chessboard Distance

## 🔗 CodeChef Problem

[Open Problem on CodeChef](https://www.codechef.com/problems/CHESSDIST)

## 📝 Problem Statement

Difficulty:690
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
Chessboard Distance

The Chessboard Distance for any two points 
(
𝑋
1
,
𝑌
1
)
(X
1
	​

,Y
1
	​

) and 
(
𝑋
2
,
𝑌
2
)
(X
2
	​

,Y
2
	​

) on a Cartesian plane is defined as 
𝑚
𝑎
𝑥
(
∣
𝑋
1
−
𝑋
2
∣
,
∣
𝑌
1
−
𝑌
2
∣
)
max(∣X
1
	​

−X
2
	​

∣,∣Y
1
	​

−Y
2
	​

∣).

You are given two points 
(
𝑋
1
,
𝑌
1
)
(X
1
	​

,Y
1
	​

) and 
(
𝑋
2
,
𝑌
2
)
(X
2
	​

,Y
2
	​

). Output their Chessboard Distance.

Note that, 
∣
𝑃
∣
∣P∣ denotes the absolute value of integer 
𝑃
P. For example, 
∣
−
4
∣
=
4
∣−4∣=4 and 
∣
7
∣
=
7
∣7∣=7.

Input Format
First line will contain 
𝑇
T, the number of test cases. Then the test cases follow.
Each test case consists of a single line of input containing 
4
4 space separated integers - 
𝑋
1
,
𝑌
1
,
𝑋
2
,
𝑌
2
X
1
	​

,Y
1
	​

,X
2
	​

,Y
2
	​

 - as defined in the problem statement.
Output Format

For each test case, output in a single line the chessboard distance between 
(
𝑋
1
,
𝑌
1
)
(X
1
	​

,Y
1
	​

) and 
(
𝑋
2
,
𝑌
2
)
(X
2
	​

,Y
2
	​

)

Constraints
1
≤
𝑇
≤
1000
1≤T≤1000
1
≤
𝑋
1
,
𝑌
1
,
𝑋
2
,
𝑌
2
≤
10
5
1≤X
1
	​

,Y
1
	​

,X
2
	​

,Y
2
	​

≤10
5
Subtasks

Subtask #1 (100 points): original constraints

Sample 1:
Input
Output
3
2 4 5 1
5 5 5 3
1 4 3 3

3
2
2

Explanation:

In the first case, the distance between 
(
2
,
4
)
(2,4) and 
(
5
,
1
)
(5,1) is 
𝑚
𝑎
𝑥
(
∣
2
−
5
∣
,
∣
4
−
1
∣
)
=
𝑚
𝑎
𝑥
(
∣
−
3
∣
,
∣
3
∣
)
=
3
max(∣2−5∣,∣4−1∣)=max(∣−3∣,∣3∣)=3.

In the second case, the distance between 
(
5
,
5
)
(5,5) and 
(
5
,
3
)
(5,3) is 
𝑚
𝑎
𝑥
(
∣
5
−
5
∣
,
∣
5
−
3
∣
)
=
𝑚
𝑎
𝑥
(
∣
0
∣
,
∣
2
∣
)
=
2
max(∣5−5∣,∣5−3∣)=max(∣0∣,∣2∣)=2.

In the third case, the distance between 
(
1
,
4
)
(1,4) and 
(
3
,
3
)
(3,3) is 
𝑚
𝑎
𝑥
(
∣
1
−
3
∣
,
∣
4
−
3
∣
)
=
𝑚
𝑎
𝑥
(
∣
−
2
∣
,
∣
1
∣
)
=
2
max(∣1−3∣,∣4−3∣)=max(∣−2∣,∣1∣)=2.

Did you like the problem statement?
103 users found this helpful
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
            int x1=sc.nextInt();
            int y1=sc.nextInt();
            int x2=sc.nextInt();
            int y2=sc.nextInt();
            int a= Math.abs(x1-x2);
            int b= Math.abs(y1-y2);
            System.out.println(Math.max(a,b));
        }
    }
}
 
Test against Custom Input
Correct Answer
Submission ID:
1355329355
Sub-Task	Task #	Result
(time)
1	0	Correct
(0.08)
Subtask Score: 50%	Result - Correct
2	1	Correct
(0.17)
Subtask Score: 50%	Result - Correct
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
