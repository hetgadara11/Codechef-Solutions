# BLUEBLACK - Blue and Black Pens

## 🔗 CodeChef Problem

[Open Problem on CodeChef](https://www.codechef.com/problems/BLUEBLACK)

## 📝 Problem Statement

Difficulty:156
Expand
Prev
Next
Statement
Submissions
Solution
AI Help
Switch to AI Tutor Mode
NEW
Blue and Black Pens

Chef is particular about the colour of the pens he uses to write in any exam.

He needs either:

3
3 blue pens, or
1
1 blue pen and 
1
1 black pen.

One blue pen costs 
𝐴
A rupees, and one black pen costs 
𝐵
B rupees. Find the minimum cost Chef has to pay.

Input Format
The first and only line contains 
2
2 integers - 
𝐴
A and 
𝐵
B.
Output Format

Output the minimum cost Chef has to pay to buy pens satisfying his requirement.

Constraints
10
≤
𝐴
,
𝐵
≤
50
10≤A,B≤50
Sample 1:
Input
Output
10 10

20
Explanation:

Chef can buy one blue and one black pen for a cost of 
20
20.

Sample 2:
Input
Output
10 50

30

Explanation:

Chef can buy 
3
3 blue pens for a cost of 
30
30.

Did you like the problem statement?
45 users found this helpful
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
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a*3>=a+b)
        {
            System.out.println(a+b);
        }
        else
        {
            System.out.println(a*3);
        }
        
    }
}
 
Test against Custom Input
Correct Answer
Submission ID:
1375762321
Sub-Task	Task #	Result
(time)
1	0	Correct
(0.07)
1	1	Correct
(0.07)
1	2	Correct
(0.07)
1	3	Correct
(0.08)
1	4	Correct
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
