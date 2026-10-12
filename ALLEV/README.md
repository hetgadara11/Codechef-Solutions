# ALLEV - All Even

## 🔗 CodeChef Problem

[Open Problem on CodeChef](https://www.codechef.com/problems/ALLEV?tab=statement)

## 📝 Problem Statement

Difficulty:617
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
All Even

There are 
𝑁
N numbers written on a blackboard.
These 
𝑁
N values are denoted 
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

 from left to right.

You can modify the blackboard using the following three-step procedure, as long as 
𝑁
≥
2
N≥2:

First, add 
𝐴
𝑁
A
N
	​

 to 
𝐴
𝑁
−
1
A
N−1
	​

.
Then, erase 
𝐴
𝑁
A
N
	​

 from the blackboard.
Finally, reduce 
𝑁
N by 
1
1.

In simpler words, you can add the last value to the second-last value; then erase the last value from the blackboard.

You like even numbers, so you would like to know: is it possible to repeatedly perform this three-step procedure several times (possibly, zero times), so that eventually there are only even numbers written on the blackboard?

Input Format
The first line of input will contain a single integer 
𝑇
T, denoting the number of test cases.
Each test case consists of two lines of input.
The first line of each test case contains a single integer 
𝑁
N — the initial number of values on the blackboard.
The second line contains 
𝑁
N space-separated integers 
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

 — the values on the blackboard.
Output Format

For each test case, output on a new line the answer: either 
YES
YES or 
NO
NO, depending on whether it's possible to make every value on the blackboard even or not.

Each character of the output may be printed in either uppercase or lowercase, i.e. the strings 
NO
,
no
,
nO
,
NO,no,nO, and 
No
No will all be treated as equivalent.

Constraints
1
≤
𝑇
≤
100
1≤T≤100
2
≤
𝑁
≤
100
2≤N≤100
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
Sample 1:
Input
Output
4
3
2 1 1
3
1 2 3
4
1 3 1 2
5
2 2 1 4 1

Yes
Yes
No
Yes
Explanation:

Test case 
1
1: Initially, 
𝐴
=
[
2
,
1
,
1
]
A=[2,1,1]. Perform the given operation once, which adds 
𝐴
3
A
3
	​

 to 
𝐴
2
A
2
	​

 and then deletes 
𝐴
2
A
2
	​

 from the array.
This turns the array to 
𝐴
=
[
2
,
2
]
A=[2,2].
All its elements are now even, as we wanted.

Test case 
2
2: Initially, 
𝐴
=
[
1
,
2
,
3
]
A=[1,2,3].

Perform the operation once. Now, 
𝐴
=
[
1
,
5
]
A=[1,5].
Perform the operation again. Now, 
𝐴
=
[
6
]
A=[6], and all its elements are even.

Test case 
3
3: It can be shown that 
𝐴
A will always contain at least one odd number, no matter what we do.

Did you like the problem statement?
49 users found this helpful
More Info
Time limit1 secs
Memory limit1.5 GB
Source Limit50000 Bytes
Contributors
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
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int sum=0;
            
            for(int i=0;i<n;i++)
            {
                sum=sum+sc.nextInt();
            }
            if(sum%2==0)
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
        }
    }
}
 
Test against Custom Input
Correct Answer
Submission ID:
1373849620
Sub-Task	Task #	Result
(time)
1	0	Correct
(0.07)
Subtask Score: 34%	Result - Correct
2	1	Correct
(0.13)
Subtask Score: 33%	Result - Correct
3	2	Correct
(0.16)
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
