# MSTEX - Most Expensive Items

## 🔗 CodeChef Problem

[Open Problem on CodeChef](https://www.codechef.com/problems/MSTEX?tab=submissions)

## 📝 Problem Statement

Difficulty:635
Expand
Prev
Next
Statement
Submissions
Solution
AI Help
Explained Solutions
ID
	
Result
	
Lang
	
Author
	
Popularity
	


1373914272
	
	
JAVA
	
1
om_mali
	
0
	


1373976435
	
	
JAVA
	
1
odd_rainbow_37
	
0
	


1374487096
	
	
JAVA
	
1
arova
	
0
	


1373869244
	
	
PYTH 3
	
4
vu_251fa04915
	
0
	


1373877484
	
	
C++
	
4
rag_ring_78
	
0
	
Others' Submissions

You can view submissions of all participants here

View all submissions
My Submissions
ID
	
Result
	
Time
	
Mem
	
Lang
	
Date
	
Edit
	


1374583603
	
	
0.26s
	
51M
	
JAVA
	
12 seconds ago
	
	


1374583397
	
	
0.00s
	
0M
	
JAVA
	
34 seconds ago
	
	


1374581653
	
	
0.18s
	
50M
	
JAVA
	
4 minutes ago
	
	


1374581424
	
	
0.00s
	
0M
	
JAVA
	
4 minutes ago
	
	


1374581235
	
	
0.00s
	
0M
	
JAVA
	
4 minutes ago
	
	

1-5 of 5

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
