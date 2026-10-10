# POSSROLL - Possible Roll

## 🔗 CodeChef Problem

[Open Problem on CodeChef](https://www.codechef.com/problems/POSSROLL)

## 📝 Problem Statement

Difficulty:289
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
Possible Roll

Nikhil is playing a board game with a wizard who uses a custom, magically forged 
𝑋
X-sided die.

Unlike normal dice, this die has a "base multiplier" 
𝐾
K. The faces of the die are not numbered 
1
,
2
,
3
…
𝑋
1,2,3…X. Instead, they are numbered with the first 
𝑋
X positive multiples of 
𝐾
K.

For example, if the die has 
4
4 sides and the base multiplier is 
3
3, the faces are numbered 
3
,
6
,
9
3,6,9, and 
12
12.

The wizard rolls the die behind a screen and claims the result is 
𝑌
Y. Given 
𝑋
X, 
𝐾
K, and 
𝑌
Y, determine if it is mathematically possible for this die to show the number 
𝑌
Y.

Input Format
The only line of input contains three space-separated integers 
𝑋
X, 
𝐾
K, and 
𝑌
Y, denoting the number of sides on the die, the base multiplier, and the wizard's claimed result, respectively.
Output Format

Output "YES" (without quotes) if it is mathematically possible for the die to show 
𝑌
Y, and "NO" otherwise.

You can output each letter in any case (lowercase or uppercase).

Constraints
1
≤
𝑋
≤
10
1≤X≤10
1
≤
𝐾
≤
10
1≤K≤10
1
≤
𝑌
≤
100
1≤Y≤100
Sample 1:
Input
Output
6 5 20

YES

Explanation:

The die has 
6
6 faces, numbered 
5
,
10
,
15
,
20
,
25
,
30
5,10,15,20,25,30. Since 
20
20 is one of these faces, the die can show 
20
20.

Sample 2:
Input
Output
4 3 15

NO

Explanation:

The die has 
4
4 faces, numbered 
3
,
6
,
9
,
12
3,6,9,12. Since 
15
15 is not one of these faces, the die cannot show 
15
15.

Did you like the problem statement?
29 users found this helpful
More Info
Time limit1 secs
Memory limit1.5 GB
Source Limit50000 Bytes
Contributors
Java
​
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
32
33
34
    {
        // your code goes here
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int k=sc.nextInt();
        int y=sc.nextInt();
        int sum=0;
        boolean check=false;
        for(int i=1;i<=x;i++)
        {
            sum=sum+k;
            if(sum==y)
            {
                check=true;
                break;
            }
           
        }
        if(check==true)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
 
Test against Custom Input
Correct Answer
Submission ID:
1372835871
Sub-Task	Task #	Result
(time)
1	0	Correct
(0.10)
1	1	Correct
(0.07)
1	2	Correct
(0.06)
1	3	Correct
(0.07)
1	4	Correct
(0.06)
1	5	Correct
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
