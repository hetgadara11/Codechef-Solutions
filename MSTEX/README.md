# MSTEX - Most Expensive Items

## 🔗 CodeChef Problem

[Open Problem on CodeChef](https://www.codechef.com/problems/MSTEX?tab=statement)

## 📝 Problem Statement

Difficulty:635
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
Most Expensive Items

Chef is given the prices of 
𝑁
N items and wants to buy exactly 
𝐾
K of them.

Find the maximum possible total price of the 
𝐾
K items he can choose.

Input Format

The first line contains an integer 
𝑇
T — the number of test cases.

For each test case:

The first line contains two space-separated integers 
𝑁
N and 
𝐾
K — the number of items and the number of items Chef wants to buy.
The second line contains 
𝑁
N space-separated integers 
𝐶
1
,
𝐶
2
,
…
,
𝐶
𝑁
C
1
	​

,C
2
	​

,…,C
N
	​

 — the prices of the items.
Output Format

For each test case, print a single integer — the total cost of the 
𝐾
K most expensive items.

Constraints
1
≤
𝑇
≤
100
1≤T≤100
1
≤
𝐾
≤
𝑁
≤
100
1≤K≤N≤100
1
≤
𝐶
𝑖
≤
100
1≤C
i
	​

≤100
Sample 1:
Input
Output
3
5 2
4 9 1 7 6
4 3
10 3 8 5
6 1
2 11 4 9 7 5
16
23
11
Explanation:

For the first test case, the two highest prices are 
9
9 and 
7
7.

9
+
7
=
16
9+7=16

For the second test case, the three highest prices are 
10
10, 
8
8, and 
5
5.

10
+
8
+
5
=
23
10+8+5=23

For the third test case, Chef buys only the most expensive item, which costs 
11
11.

Did you like the problem statement?
5 users found this helpful
More Info
Time limit1 secs
Memory limit1.5 GB
Source Limit50000 Bytes
Java
​
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
27
28
29
30
31
32
33
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t--> 0)
        {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] c = new int[n];
            for (int i = 0; i < n; i++)
            {
                c[i] = sc.nextInt();
            }
            Arrays.sort(c);
            int sum = 0;
            for (int i = n - 1; i >= n - k; i--) {
                sum += c[i];
            }
            System.out.println(sum);
        }
        }
    }
 
Test against Custom Input
Correct Answer
Submission ID:
1374583603
Sub-Task	Task #	Result
(time)
1	0	Correct
(0.08)
Subtask Score: 34%	Result - Correct
2	1	Correct
(0.11)
Subtask Score: 33%	Result - Correct
3	2	Correct
(0.26)
Subtask Score: 33%	Result - Correct
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
