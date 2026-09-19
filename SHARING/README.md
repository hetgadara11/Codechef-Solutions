# SHARING - Sharing Cookies

## 🔗 CodeChef Problem

[Open Problem on CodeChef](https://www.codechef.com/problems/SHARING)

## 📝 Problem Statement

Difficulty:232
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
Sharing Cookies

Alice received 
𝐴
A cookies and Bob received 
𝐵
B cookies individually, but being good friends, they want to share them equally. Alice received more cookies than Bob, i.e. 
𝐴
>
𝐵
A>B.

Is it possible for Alice and Bob to share such that they both have equal number of cookies? Find the number of cookies Alice has to give Bob in that case, and otherwise print 
−
1
−1 to denote it is impossible.

Input Format
The first and only line contains 
2
2 integers 
𝐴
A and 
𝐵
B.
Output Format

Output the number of cookies Alice needs to give Bob or 
−
1
−1 if impossible.

Constraints
1
≤
𝐵
<
𝐴
≤
10
1≤B<A≤10
Sample 1:
Input
Output
6 2

2

Explanation:

If Alice gives Bob 
2
2 cookies, he has 
6
−
2
=
4
6−2=4 cookies left, and Bob has 
2
+
2
=
4
2+2=4 cookies. Hence, both have equal number of cookies.

Sample 2:
Input
Output
5 2

-1

Explanation:

The total number of cookies is 
7
7, which is not dividable fairly between Alice and Bob.

Did you like the problem statement?
30 users found this helpful
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
        if((a+b)%2==0)
        {
            System.out.println((a+b)/2-b);
        }
        else
        {
            System.out.println("-1");
        }
        
    }
}
 
Test against Custom Input
Correct Answer
Submission ID:
1359357468
Sub-Task	Task #	Result
(time)
1	0	Correct
(0.06)
1	1	Correct
(0.07)
1	2	Correct
(0.06)
1	3	Correct
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
