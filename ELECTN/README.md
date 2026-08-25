# ELECTN - Elections in Chefland

## 🔗 CodeChef Problem

[Open Problem on CodeChef](https://www.codechef.com/problems/ELECTN?tab=statement)

## 📝 Problem Statement

Difficulty:604
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
Learn problem solving techniques required to solve this problem
Take our problem solving courses to understand how to attempt problems like these.
Start Learning
Elections in Chefland

Election season has started in Chefland and the election commission wants to know the count of eligible voters.

There are 
𝑁
N people in Chefland where the age of the 
𝑖
𝑡
ℎ
i
th
 person in 
𝐴
𝑖
A
i
	​

.
Given that a person needs to be at least 
𝑋
X years old to vote, find the number of eligible voters.

Input Format
The first line of input will contain a single integer 
𝑇
T, denoting the number of test cases.
Each test case consists of multiple lines of input.
The first line of each test case contains two space-separated integers 
𝑁
N and 
𝑋
X — the number of people in Chefland, and the minimum age required for a person to vote in Chefland.
The next line contains 
𝑁
N space-separated integers, where the 
𝑖
𝑡
ℎ
i
th
 integer denotes the age of the 
𝑖
𝑡
ℎ
i
th
 person.
Output Format

For each test case, output on a new line, the number of eligible voters in Chefland.

Constraints
1
≤
𝑇
≤
200
1≤T≤200
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
,
𝑋
≤
100
1≤A
i
	​

,X≤100
Sample 1:
Input
Output
4
4 3
5 3 1 2
3 2
1 3 4
4 2
2 1 2 4
5 6
1 2 3 4 5

2
2
3
0

Explanation:

Test case 
1
1: The minimum age to vote in Chefland is 
3
3 years. There are 
2
2 people with age greater than equal to 
3
3 and thus, there are 
2
2 eligible voters.

Test case 
2
2: The minimum age to vote in Chefland is 
2
2 years. There are 
2
2 people with age greater than equal to 
2
2 and thus, there are 
2
2 eligible voters.

Test case 
3
3: The minimum age to vote in Chefland is 
2
2 years. There are 
3
3 people with age greater than equal to 
2
2 and thus, there are 
3
3 eligible voters.

Test case 
4
4: The minimum age to vote in Chefland is 
6
6 years. There are no people with age greater than equal to 
6
6 and thus, there are no eligible voters.

Did you like the problem statement?
147 users found this helpful
More Info
Time limit1 secs
Memory limit1.5 GB
Source Limit50000 Bytes
Contributors
Java
​
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
27
28
29
30
31
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int x=sc.nextInt();
            int count=0;
            for(int i=0;i<n;i++)
            {
                int age=sc.nextInt();
                if(age>=x)
                {
                    count++;
                }
            }
            System.out.println(count);
            
        }
    }
}
 
Test against Custom Input
Correct Answer
Submission ID:
1347453840
Sub-Task	Task #	Result
(time)
1	0	Correct
(0.07)
Subtask Score: 33%	Result - Correct
2	1	Correct
(0.10)
Subtask Score: 33%	Result - Correct
3	2	Correct
(0.20)
Subtask Score: 34%	Result - Correct
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
