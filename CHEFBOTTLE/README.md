# CHEFBOTTLE - Chef and Water Bottles

## 🔗 CodeChef Problem

[Open Problem on CodeChef](https://www.codechef.com/problems/CHEFBOTTLE)

## 📝 Problem Statement

Difficulty:662
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
Learn problem solving techniques required to solve this problem
Take our problem solving courses to understand how to attempt problems like these.
Start Learning
Chef and Water Bottles

Chef has 
𝑁
N empty bottles where each bottle has a capacity of 
𝑋
X litres.
There is a water tank in Chefland having 
𝐾
K litres of water. Chef wants to fill the empty bottles using the water in the tank.

Assuming that Chef does not spill any water while filling the bottles, find out the maximum number of bottles Chef can fill completely.

Input Format
First line will contain 
𝑇
T, number of test cases. Then the test cases follow.
Each test case contains of a single line of input, three integers 
𝑁
,
𝑋
,
N,X, and 
𝐾
K.
Output Format

For each test case, output in a single line answer, the maximum number of bottles Chef can fill completely.

Constraints
1
≤
𝑇
≤
100
1≤T≤100
1
≤
𝑁
,
𝑋
≤
10
5
1≤N,X≤10
5
0
≤
𝐾
≤
10
5
0≤K≤10
5
Sample 1:
Input
Output
3
5 2 8
10 5 4
3 1 4
4
0
3
Explanation:

Test Case 
1
1: The amount of water in the tank is 
8
8 litres. The capacity of each bottle is 
2
2 litres. Hence, 
4
4 water bottles can be filled completely.

Test Case 
2
2: The amount of water in the tank is 
4
4 litres. The capacity of each bottle is 
5
5 litres. Hence, no water bottle can be filled completely.

Test Case 
3
3: The amount of water in the tank is 
4
4 litres. The capacity of each bottle is 
1
1 litre. Chef has 
3
3 bottles available. He can fill all these bottles completely using 
3
3 litres of water.

Did you like the problem statement?
169 users found this helpful
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
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int x=sc.nextInt();
            int k=sc.nextInt();
            if(n>=k/x)
            {
                System.out.println(k/x);
            }
            else
            {
                System.out.println(n);
            }
        }
 
Test against Custom Input
Correct Answer
Submission ID:
1346947522
Sub-Task	Task #	Result
(time)
1	1	Correct
(0.09)
Subtask Score: 33%	Result - Correct
2	2	Correct
(0.09)
Subtask Score: 33%	Result - Correct
3	3	Correct
(0.09)
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
