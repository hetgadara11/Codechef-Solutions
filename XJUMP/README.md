# XJUMP - X Jumps

## 🔗 CodeChef Problem

[Open Problem on CodeChef](https://www.codechef.com/problems/XJUMP?tab=Help)

## 📝 Problem Statement

Difficulty:686
Expand
Prev
Next
Statement
Hints
Submissions
Solution
AI Help
Review Code with AI
English

Review my code and provide feedback on how to improve it




My current code:



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
		    int x=sc.nextInt();
		    int y=sc.nextInt();
		    int cx=0;
		    int xy=0;
		    if(x%y==0)
		    {
		        System.out.println(x/y);
		    }
		    else if(x%y!=0)
		    {
		        System.out.println();
		    }
		}

	}
}



Hello! I would be happy to help you review and improve your Java code for the XJUMP problem on CodeChef.

Observations and Feedback:
Incomplete Logic: In your current code, you handled the case where 
𝑋
X is divisible by 
𝑌
Y (x % y == 0), but for the else condition, you wrote System.out.println(); which just prints a blank line instead of calculating the minimum moves for the remainder.
Mathematical Approach: Since the problem asks for the minimum moves, a greedy approach is optimal. To minimize the moves, Chef should use the 
𝑌
Y-step climb as many times as possible (which is 
⌊
𝑋
/
𝑌
⌋
⌊X/Y⌋ or X / Y in integer division). The remaining steps can be covered using 
1
1-step climbs (which is 
𝑋
 
m
o
d
 
𝑌
XmodY or X % Y).
Time Complexity: This mathematical approach runs in 
𝑂
(
1
)
O(1) time per test case, which easily passes within the time limits.
Corrected Code:

Here is the updated and fully working Java code:

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // Using Scanner to read input
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int x = sc.nextInt();
            int y = sc.nextInt();
            
            // Minimum moves = (number of Y-step moves) + (remaining 1-step moves)
            int moves = (x / y) + (x % y);
            
            System.out.println(moves);
        }
        sc.close();
    }
}

Why this works:
x / y gives the maximum number of 
𝑌
Y-step jumps Chef can take.
x % y gives the remaining steps that Chef must climb one by one using 
1
1-step moves.
Adding them together directly gives the minimum total moves required, handling both divisible and non-divisible cases cleanly in a single line without needing if-else branches!
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
            int x=sc.nextInt();
            int y=sc.nextInt();
            System.out.println((x/y)+(x%y));
        }
    }
}
Test against Custom Input
Correct Answer
Submission ID:
1354784595
Sub-Task	Task #	Result
(time)
1	0	Correct
(0.07)
Subtask Score: 50%	Result - Correct
2	1	Correct
(0.12)
Subtask Score: 50%	Result - Correct
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
