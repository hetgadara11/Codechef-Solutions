# NLVEL - Next Level

## 🔗 CodeChef Problem

[Open Problem on CodeChef](https://www.codechef.com/problems/NLVEL)

## 📝 Problem Statement

Difficulty:293
Expand
Prev
Next
Statement
Submissions
Solution
AI Help
Switch to AI Tutor Mode
NEW
Next Level

Chef is playing a video game and has collected 
𝑋
X stars. He needs at least 
60
60 stars to unlock the next level.

Determine whether Chef can unlock the next level.

Input Format

The only line contains an integer 
𝑋
X — the number of stars Chef has collected.

Output Format

Print YES if Chef can unlock the next level, otherwise print NO.

Each letter of the output may be printed in either uppercase or lowercase, i.e, the strings NO, no, No, and nO will all be treated as equivalent.

Constraints
1
≤
𝑋
≤
100
1≤X≤100
Sample 1:
Input
Output
45
No
Explanation:

Chef has 
45
45 stars, which is fewer than the required 
60
60 stars.

Sample 2:
Input
Output
80
Yes
Explanation:

Chef has 
80
80 stars, which is more than the required 
60
60 stars.

Sample 3:
Input
Output
60

Yes

Explanation:

Chef has 
60
60 stars, which is equal to the required 
60
60 stars.

Did you like the problem statement?
4 users found this helpful
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
import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        if(x>=60)
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
1370260454
Sub-Task	Task #	Result
(time)
1	0	Correct
(0.08)
Subtask Score: 20%	Result - Correct
2	1	Correct
(0.08)
Subtask Score: 20%	Result - Correct
3	2	Correct
(0.08)
Subtask Score: 20%	Result - Correct
4	3	Correct
(0.12)
Subtask Score: 20%	Result - Correct
5	4	Correct
(0.11)
Subtask Score: 20%	Result - Correct
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
