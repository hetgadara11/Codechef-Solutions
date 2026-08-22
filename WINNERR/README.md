# WINNERR - Determine the Winner

## 🔗 CodeChef Problem

[Open Problem on CodeChef](https://www.codechef.com/problems/WINNERR?tab=ide)

## 📝 Problem Statement

Determine the Winner

There is a contest containing 
2
2 problems 
𝐴
A and 
𝐵
B.

2
2 strong participants 
𝑃
P and 
𝑄
Q participated in the contest and solved both the problems.

𝑃
P made AC submissions on problems 
𝐴
A and 
𝐵
B at time instants 
𝑃
𝐴
P
A
	​

 and 
𝑃
𝐵
P
B
	​

 respectively while 
𝑄
Q made AC submissions on problems 
𝐴
A and 
𝐵
B at time instants 
𝑄
𝐴
Q
A
	​

 and 
𝑄
𝐵
Q
B
	​

.

It is given that the time penalty is the minimum time instant at which a participant has solved both the problems. Also the participant with the lower time penalty will have a better rank.

Determine which participant got the better rank or if there is a TIE.

Input Format
The first line will contain 
𝑇
T, number of test cases. Then the test cases follow.
Each test case contains a single line of input, four integers 
𝑃
𝐴
,
𝑃
𝐵
,
𝑄
𝐴
,
𝑄
𝐵
P
A
	​

,P
B
	​

,Q
A
	​

,Q
B
	​

.
Output Format

For each test case, output P if 
𝑃
P got a better rank, Q if 
𝑄
Q got a better rank, TIE otherwise.

Note that output is case-insensitive i.e. P and p both are considered the same.

Constraints
1
≤
𝑇
≤
1000
1≤T≤1000
1
≤
𝑃
𝐴
,
𝑃
𝐵
,
𝑄
𝐴
,
𝑄
𝐵
≤
100
1≤P
A
	​

,P
B
	​

,Q
A
	​

,Q
B
	​

≤100
Sample 1:
Input
Output
4
5 10 2 12
10 30 15 15
20 8 4 20
6 6 6 6

P
Q
TIE
TIE

Explanation:

Test Case 
1
1:

Time penalty incurred by participant 
𝑃
=
10
P=10.
Time penalty incurred by participant 
𝑄
=
12
Q=12.

Since 
10
<
12
10<12, 
𝑃
P gets a better rank.

Test Case 
2
2:

Time penalty incurred by participant 
𝑃
=
30
P=30.
Time penalty incurred by participant 
𝑄
=
15
Q=15.

Since 
15
<
30
15<30, 
𝑄
Q gets a better rank.

Test Case 
3
3:

Time penalty incurred by participant 
𝑃
=
20
P=20.
Time penalty incurred by participant 
𝑄
=
20
Q=20.

Since 
20
=
20
20=20, 
𝑃
P and 
𝑄
Q gets a same rank (TIE).

Test Case 
4
4:

Time penalty incurred by participant 
𝑃
=
6
P=6.
Time penalty incurred by participant 
𝑄
=
6
Q=6.

Since 
6
=
6
6=6, 
𝑃
P and 
𝑄
Q gets a same rank (TIE).

Did you like the problem statement?
51 users found this helpful
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
            int pa=sc.nextInt();
            int pb=sc.nextInt();
            int qa=sc.nextInt();
            int qb=sc.nextInt();
            int tp=Math.max(pa,pb);
            int tq=Math.max(qa,qb);
            if(tp < tq)
            {
                System.out.println("P");
            }
            else if(tq < tp)
            {
                System.out.println("Q");
 
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
