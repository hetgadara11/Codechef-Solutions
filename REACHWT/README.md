# REACHWT - Reach Weight

## 🔗 CodeChef Problem

[Open Problem on CodeChef](https://www.codechef.com/problems/REACHWT?tab=Help)

## 📝 Problem Statement

Difficulty:530
Expand
Prev
Next
Statement
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
		Scanner sc =new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		    int n=sc.nextInt();
		    
		}

	}
}



Hello! It looks like you've started the problem by setting up the basic input structure with Scanner and the test case loop, but you haven't added the logic to compute the minimum cost yet.

Observations and Insights
Input Handling: Your boilerplate code correctly handles multiple test cases using a while(t-->0) loop.
Greedy Approach: To get the minimum cost, we should prioritize the 
2
2 kg weights because they offer a better rate (15 rupees per kg) compared to the 
1
1 kg weights (20 rupees per kg).
Parity Check:
If 
𝑁
N is even, we can just buy 
𝑁
2
2
N
	​

 units of the 
2
2 kg weight.
If 
𝑁
N is odd, we buy as many 
2
2 kg weights as possible (which is 
𝑁
−
1
2
2
N−1
	​

) and exactly one 
1
1 kg weight to cover the remaining 
1
1 kg.

We can express this cleanly in Java using integer division and the modulo operator: 
Cost
=
30
×
(
𝑁
2
)
+
20
×
(
𝑁
(
m
o
d
2
)
)
Cost=30×(
2
N
	​

)+20×(N(mod2))

Corrected Code

Here is your completed code incorporating the logic:

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int n = sc.nextInt();
            
            // Calculate minimum cost
            int cost = 30 * (n / 2) + 20 * (n % 2);
            
            System.out.println(cost);
        }
        sc.close();
    }
}

Complexity
Time Complexity: 
𝑂
(
1
)
O(1) per test case since it only involves a few basic arithmetic operations.
Space Complexity: 
𝑂
(
1
)
O(1) as we are only using a few variables for input and calculation.
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
import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc =new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            System.out.println(30*(n/2)+20*(n%2));
        }
    }
}
Test against Custom Input
Correct Answer
Submission ID:
1354244336
Sub-Task	Task #	Result
(time)
1	0	Correct
(0.07)
1	1	Correct
(0.08)
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
