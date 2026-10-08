# CALLIM - Calorie Limit

## 🔗 CodeChef Problem

[Open Problem on CodeChef](https://www.codechef.com/problems/CALLIM?tab=statement)

## 📝 Problem Statement

Difficulty:719
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
Calorie Limit

Sushil is a diabetic patient. He is only allowed to eat at most 
𝐾
K calories in a day. However, he likes to eat sweets a lot.

There are 
𝑁
N sweets in front of him. The 
𝑖
i-th sweet has a calorie count of 
𝐴
𝑖
A
i
	​

.
Sushil will eat the sweets in order, i.e. he will start from the 
1
1-st sweet, then the 
2
2-nd, then the 
3
3-rd, and so on.
If eating the 
𝑖
i-th sweet would take him over his daily calorie limit, he will not eat it, and he will also not eat any further sweets.

Find the maximum number of sweets Sushil can eat without exceeding his calorie limit.

Input Format
The first line of input will contain a single integer 
𝑇
T, denoting the number of test cases.
Each test case consists of two lines of input.
The first line of each test case contains two space-separated integers 
𝑁
N and 
𝐾
K — the number of sweets and the calorie limit, respectively.
The second line contains 
𝑁
N space-separated integers — 
𝐴
1
,
𝐴
2
,
…
,
𝐴
𝑁
A
1
	​

,A
2
	​

,…,A
N
	​

.
Output Format

For each test case, output on a new line the maximum number of sweets Sushil can eat in order without exceeding his calorie limit.

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
≤
100
1≤N≤100
1
≤
𝐴
𝑖
≤
100
1≤A
i
	​

≤100
1
≤
𝐾
≤
10
4
1≤K≤10
4
Sample 1:
Input
Output
3
4 10
5 2 5 2
4 5
2 1 1 1
3 10
11 1 1

2
4
0
Explanation:

Test case 
1
1: Sushil can eat the first 
2
2 sweets for a total calorie count of 
5
+
2
=
7
5+2=7. If he tries to eat the 
3
3rd sweet, he exceeds his calorie limit of 
10
10, so he immediately stops.

Test case 
3
3: Sushil is unable to eat the first sweet itself because it has 
11
11 calories and he can have at most 
10
10 calories.

Did you like the problem statement?
54 users found this helpful
More Info
Time limit1 secs
Memory limit1.5 GB
Source Limit50000 Bytes
Contributors
Java
​
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
34
35
36
37
        while (t--> 0)
        {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] a = new int[n];
            int total = 0;
            int count = 0;
            for (int i = 0; i < n; i++)
            {
                a[i] = sc.nextInt();
            }
            for (int i = 0; i < n; i++)
            {
                if (a[i] + total > k)
                {
                    break;
                }
                total = total + a[i];
                count++;;
            }
            System.out.println(count);
        }
    }
}
 
Test against Custom Input
Correct Answer
Submission ID:
1371717882
Sub-Task	Task #	Result
(time)
1	0	Correct
(0.09)
Subtask Score: 25%	Result - Correct
2	1	Correct
(0.16)
Subtask Score: 25%	Result - Correct
3	2	Correct
(0.21)
Subtask Score: 25%	Result - Correct
4	3	Correct
(0.20)
Subtask Score: 25%	Result - Correct
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
