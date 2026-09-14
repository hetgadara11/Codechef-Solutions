# POLTHIEF - Police and Thief

## 🔗 CodeChef Problem

[Open Problem on CodeChef](https://www.codechef.com/problems/POLTHIEF)

## 📝 Problem Statement

Difficulty:639
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
Police and Thief

Chef discovered that his secret recipe has been stolen. He immediately informs the police of the theft.

It is known that the policeman and thief move on the number line. You are given that:

The initial location of the policeman on the number line is 
𝑋
X and his speed is 
2
2 units per second.
The initial location of the thief on the number line is 
𝑌
Y and his speed is 
1
1 unit per second.

Find the minimum time (in seconds) in which the policeman can catch the thief. Note that, the policeman catches the thief as soon as their locations become equal and the thief will try to evade the policeman for as long as possible.

Input Format
The first line of input will contain an integer 
𝑇
T — the number of test cases. The description of 
𝑇
T test cases follows.
The first and only line of each test case contains two integers 
𝑋
X and 
𝑌
Y, as described in the problem statement.
Output Format

For each test case, output in a single line the minimum time taken by the policeman to catch the thief.

Constraints
1
≤
𝑇
≤
1000
1≤T≤1000
−
10
5
≤
𝑋
,
𝑌
≤
10
5
−10
5
≤X,Y≤10
5
Sample 1:
Input
Output
3
1 3
2 1
1 1
2
1
0
Explanation:

Test case 
1
1: The initial locations of the policeman and thief are 
1
1 and 
3
3 respectively. The minimum time taken by the policeman to catch the thief is 
2
2 seconds, and this happens when both the policeman and the thief move towards the right.

Test case 
2
2: The initial location of the policeman and thief are 
2
2 and 
1
1 respectively. The minimum time taken by the policeman to catch the thief is 
1
1 second, and this happens when both the policeman and the thief move towards the left.

Test case 
3
3: The initial locations of the policeman and thief are 
1
1 and 
1
1 respectively. Because the police is already present at the location of thief, the time taken by police to catch the thief is 
0
0 seconds.

Did you like the problem statement?
142 users found this helpful
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
            System.out.println(Math.abs(x-y));
        }
    }
}
Test against Custom Input
Correct Answer
Submission ID:
1357025171
Sub-Task	Task #	Result
(time)
1	1	Correct
(0.10)
Subtask Score: 50%	Result - Correct
2	2	Correct
(0.14)
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
