# FARFROMO - Far from origin

## 🔗 CodeChef Problem

[Open Problem on CodeChef](https://www.codechef.com/problems/FARFROMO)

## 📝 Problem Statement

Difficulty:750
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
Far from origin

Alex, Bob, and, Chef are standing on the coordinate plane. Chef is standing at the origin (coordinates 
(
0
,
0
)
(0,0)) while the location of Alex and Bob are 
(
𝑋
1
,
𝑌
1
)
(X
1
	​

,Y
1
	​

) and 
(
𝑋
2
,
𝑌
2
)
(X
2
	​

,Y
2
	​

) respectively.

Amongst Alex and Bob, find out who is at a farther distance from Chef or determine if both are at the same distance from Chef.

Input Format
The first line of input will contain a single integer 
𝑇
T, denoting the number of test cases.
The first and only line of each test case contains four space-separated integers 
𝑋
1
,
𝑌
1
,
𝑋
2
,
X
1
	​

,Y
1
	​

,X
2
	​

, and 
𝑌
2
Y
2
	​

 — the coordinates of Alex and Bob.
Output Format

For each test case, output on a new line:

ALEX, if Alex is at a farther distance from Chef.
BOB, if Bob is at a farther distance from Chef.
EQUAL, if both are standing at the same distance from Chef.

You may print each character in uppercase or lowercase. For example, Bob, BOB, bob, and bOB, are all considered identical.

Constraints
1
≤
𝑇
≤
2000
1≤T≤2000
−
1000
≤
𝑋
1
,
𝑌
1
,
𝑋
2
,
𝑌
2
≤
1000
−1000≤X
1
	​

,Y
1
	​

,X
2
	​

,Y
2
	​

≤1000
Sample 1:
Input
Output
3
-1 0 3 4
3 4 -4 -3
8 -6 0 5

BOB
EQUAL
ALEX
Explanation:

Test case 
1
1: Alex is at a distance 
1
1 from Chef while Bob is at distance 
5
5 from Chef. Thus, Bob is at a farther distance.

Test case 
2
2: Alex is at a distance 
5
5 from Chef and Bob is also at distance 
5
5 from Chef. Thus, both are at the same distance.

Test case 
3
3: Alex is at a distance 
10
10 from Chef while Bob is at distance 
5
5 from Chef. Thus, Alex is at a farther distance.

Did you like the problem statement?
105 users found this helpful
More Info
Time limit1 secs
Memory limit1.5 GB
Source Limit50000 Bytes
Contributors
Java
​
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
34
        int t=sc.nextInt();
        while(t-->0)
        {
            int x1=sc.nextInt();
            int y1=sc.nextInt();
            int x2=sc.nextInt();
            int y2=sc.nextInt();
            if(Math.sqrt((x1*x1)+(y1*y1))>Math.sqrt((x2*x2)+(y2*y2)))
            {
                System.out.println("ALEX");
            }
            else if(Math.sqrt((x1*x1)+(y1*y1))==Math.sqrt((x2*x2)+(y2*y2)))
            {
                System.out.println("EQUAL");
            }
            else
            {
                System.out.println("BOB");
            }
        }
    }
}
 
Test against Custom Input
Correct Answer
Submission ID:
1364696515
Sub-Task	Task #	Result
(time)
1	0	Correct
(0.07)
Subtask Score: 34%	Result - Correct
2	1	Correct
(0.17)
Subtask Score: 33%	Result - Correct
3	2	Correct
(0.17)
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
