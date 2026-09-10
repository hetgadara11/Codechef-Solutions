# EGGBUY - Buying Eggs

## 🔗 CodeChef Problem

[Open Problem on CodeChef](https://www.codechef.com/problems/EGGBUY)

## 📝 Problem Statement

Difficulty:181
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
Buying Eggs

You want to buy 
12
12 eggs.

There are two shops that sell eggs.

The first shop is nearby, and sells eggs at a cost of 
𝑋
X coins each.
The second shop is far away, and sells eggs at a cost of 
𝑌
Y coins each.
However, since the second shop is far away, you also need to pay an additional 
𝐹
F coins in fuel costs to reach it.

Find the minimum possible cost of buying 
12
12 eggs.

Input Format
The first and only line of input will contain three space-separated integers 
𝑋
,
𝑌
,
X,Y, and 
𝐹
F — the costs of eggs in the first and second shops, and the fuel cost.
Output Format

Output a single integer: the minimum cost of buying 
12
12 eggs.

Constraints
1
≤
𝑋
,
𝑌
,
𝐹
≤
20
1≤X,Y,F≤20
Sample 1:
Input
Output
5 8 3

60
Explanation:

Buying 
12
12 eggs from the first shop has a cost of 
5
⋅
12
=
60
5⋅12=60 coins.
Buying 
12
12 eggs from the second shop has a cost of 
8
⋅
12
=
96
8⋅12=96 coins, with an additional 
𝐹
=
3
F=3 in fuel costs for a total of 
99
99.

It's better to buy from the first shop, spending 
60
60 coins.

Sample 2:
Input
Output
10 4 5

53
Explanation:

Buying 
12
12 eggs from the first shop has a cost of 
10
⋅
12
=
120
10⋅12=120 coins.
Buying 
12
12 eggs from the second shop has a cost of 
4
⋅
12
=
48
4⋅12=48 coins, with an additional 
𝐹
=
5
F=5 in fuel costs for a total of 
53
53.

It's better to buy from the second shop, spending 
53
53 coins.

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
        int x=sc.nextInt();
        int y=sc.nextInt();
        int f=sc.nextInt();
        if(x*12<=(y*12)+f)
        {
            System.out.println(x*12);
        }
        else
        {
            System.out.println((y*12)+f);
        }
    }
}
 
Test against Custom Input
Correct Answer
Submission ID:
1355879800
Sub-Task	Task #	Result
(time)
1	0	Correct
(0.08)
1	1	Correct
(0.07)
1	2	Correct
(0.07)
1	3	Correct
(0.07)
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
