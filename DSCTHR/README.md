# DSCTHR - Score

## 🔗 CodeChef Problem

[Open Problem on CodeChef](https://www.codechef.com/problems/DSCTHR)

## 📝 Problem Statement

Difficulty:622
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
Score

Chef takes part in a discus throw competition, where each player gets three throws. A player's final score is the longest distance achieved among their three throws.

Chef's throws cover distances of 
𝐴
A, 
𝐵
B, and 
𝐶
C units. Find his final score.

Input Format
The first line contains an integer 
𝑇
T — the number of test cases.
Each test case contains three space-separated integers 
𝐴
A, 
𝐵
B, and 
𝐶
C — the distances of Chef's three throws.
Output Format

For each test case, print Chef's final score on a separate line.

Constraints
1
≤
𝑇
≤
100
1≤T≤100
1
≤
𝐴
,
𝐵
,
𝐶
≤
100
1≤A,B,C≤100
Sample 1:
Input
Output
2
12 9 18
25 40 31
18
40
Explanation:

Test case 1: The third throw covers the longest distance, 
18
18 units, so Chef's final score is 
18
18.

Test case 2: The second throw covers the longest distance, 
40
40 units, so Chef's final score is 
40
40.

Sample 2:
Input
Output
2
24 24 24
50 17 50
24
50
Explanation:

Test case 1: All three throws cover 
24
24 units, so Chef's final score is 
24
24.

Test case 2: The first and third throws both cover 
50
50 units, the longest distance. Chef's final score is 
50
50.

Did you like the problem statement?
5 users found this helpful
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
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            System.out.println(Math.max(a,Math.max(b,c)));
        }
    }
}
Test against Custom Input
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
