# LASTLEVELS - The Last Levels

## 🔗 CodeChef Problem

[Open Problem on CodeChef](https://www.codechef.com/problems/LASTLEVELS)

## 📝 Problem Statement

Difficulty:679
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
The Last Levels

Chef is playing a videogame, and is getting close to the end. He decides to finish the rest of the game in a single session.

There are 
𝑋
X levels remaining in the game, and each level takes Chef 
𝑌
Y minutes to complete. To protect against eye strain, Chef also decides that every time he completes 
3
3 levels, he will take a 
𝑍
Z minute break from playing. Note that there is no need to take this break if the game has been completed.

How much time (in minutes) will it take Chef to complete the game?

Input Format
The first line of input will contain a single integer 
𝑇
T, denoting the number of test cases.
The first and only line of input will contain three space-separated integers 
𝑋
X, 
𝑌
Y, and 
𝑍
Z.
Output Format

For each test case, output on a new line the answer — the length of Chef's gaming session.

Constraints
1
≤
𝑇
≤
100
1≤T≤100
1
≤
𝑋
≤
100
1≤X≤100
5
≤
𝑌
≤
100
5≤Y≤100
5
≤
𝑍
≤
15
5≤Z≤15
Sample 1:
Input
Output
4
2 12 10
3 12 10
7 20 8
24 45 15

24
36
156
1185
Explanation:

Test case 1: 2 12 10

X = 2 (2 levels remain)
Y = 12 (each level takes 12 minutes)
Z = 10 (Chef would take a 10-minute break every 3 levels, but since there are only 2 levels, no break is needed)

Since there are only 2 levels, and no break is needed (because Chef takes a break only after every 3 levels).

The total time = X × Y = 2 × 12 = 24 minutes.

Test case 3: 7 20 8

X = 7 (7 levels remain)
Y = 20 (each level takes 20 minutes)
Z = 8 (Chef takes an 8-minute break after every 3 levels)

Now, let's break this down:
Chef completes the first 3 levels: 3 x 20 = 60 minutes.
After completing these 3 levels, Chef takes an 8-minute break.
Chef completes another 3 levels: 3 x 20 = 60 minutes.
After completing these 3 levels, Chef takes another 8-minute break.
Now, Chef completes the remaining 1 level: 1 x 20 = 20 minutes.

So, the total time = 60 + 8 + 60 + 8 + 20 = 156 minutes.

Did you like the problem statement?
449 users found this helpful
More Info
Time limit1 secs
Memory limit1.5 GB
Source Limit50000 Bytes
Contributors
Java
​
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
27
28
29
30
class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int x=sc.nextInt();
            int y=sc.nextInt();
            int z=sc.nextInt();
            if(x<=3)
            {
                System.out.println(x*y);
            }
            else if(x%3!=0)
            {
                System.out.println((x*y)+(x/3)*z);
            }
            else
            {
                System.out.println((x*y)+((x/3)*z)-z);
            }
        }
 
Test against Custom Input
Correct Answer
Submission ID:
1346967309
Sub-Task	Task #	Result
(time)
1	0	Correct
(0.11)
Subtask Score: 33%	Result - Correct
2	1	Correct
(0.15)
Subtask Score: 33%	Result - Correct
3	2	Correct
(0.15)
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
