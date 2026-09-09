# VALENTINE - Valentine is Coming

## 🔗 CodeChef Problem

[Open Problem on CodeChef](https://www.codechef.com/problems/VALENTINE)

## 📝 Problem Statement

Difficulty:691
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
Valentine is Coming

Valentine's Day is approaching and thus Chef wants to buy some chocolates for someone special.

Chef has a total of 
𝑋
X rupees and one chocolate costs 
𝑌
Y rupees. What is the maximum number of chocolates Chef can buy?

Input Format
First line will contain 
𝑇
T, the number of test cases. Then the test cases follow.
Each test case contains a single line of input, two integers 
𝑋
,
𝑌
X,Y - the amount Chef has and the cost of one chocolate respectively.
Output Format

For each test case, output the maximum number of chocolates Chef can buy.

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
,
𝑌
≤
100
1≤X,Y≤100
Sample 1:
Input
Output
4
5 10
16 5
35 7
100 1

0
3
5
100

Explanation:

Test case-1: Chef has 
5
5 rupees but the cost of one chocolate is 
10
10 rupees. Therefore Chef can not buy any chocolates.

Test case-2: Chef has 
16
16 rupees and the cost of one chocolate is 
5
5 rupees. Therefore Chef can buy at max 
3
3 chocolates since buying 
4
4 chocolates would cost 
20
20 rupees.

Test case-3: Chef has 
35
35 rupees and the cost of one chocolate is 
7
7 rupees. Therefore Chef can buy at max 
5
5 chocolates for 
35
35 rupees.

Test case-4: Chef has 
100
100 rupees and the cost of one chocolate is 
1
1 rupee. Therefore Chef can buy at max 
100
100 chocolates for 
100
100 rupees.

Did you like the problem statement?
53 users found this helpful
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
            int x=sc.nextInt();
            int y=sc.nextInt();
            System.out.println(x/y);
        }
    }
}
Test against Custom Input
Correct Answer
Submission ID:
1355335715
Sub-Task	Task #	Result
(time)
1	1	Correct
(0.08)
Subtask Score: 33%	Result - Correct
2	2	Correct
(0.15)
Subtask Score: 33%	Result - Correct
3	3	Correct
(0.16)
Subtask Score: 34%	Result - Correct
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
