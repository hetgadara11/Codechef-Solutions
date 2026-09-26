# PGNATK - Pigeon Attack

## 🔗 CodeChef Problem

[Open Problem on CodeChef](https://www.codechef.com/problems/PGNATK?tab=Help)

## 📝 Problem Statement

Difficulty:620
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
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		if(s.charAt(0)==s.charAt(2) && s.charAt(1)==s.charAt(3))
		{
		    System.out.println("YES");
		}
		else
		{
		    System.out.println("NO");
		}

	}
}



Hello! I am here to help you with your Data Structures and Algorithms journey.

Observations & Feedback

It looks like your current code is solving a completely different problem! The code you provided reads a string and checks if characters at certain indices match, which doesn't match the Pigeon Net problem (N and K minutes) we are trying to solve here.

For this problem, we need to:

Read the number of test cases 
𝑇
T.
For each test case, read 
𝑁
N (minutes of work needed) and 
𝐾
K (pigeon interruption interval).
Simulate minute-by-minute or use a mathematical formula to find the total time elapsed when 
𝑁
N minutes of work are successfully completed.
Recommended Approach (Simulation)

Since the constraints are very small (
𝑁
≤
100
N≤100, 
𝐾
≤
100
K≤100), a simple simulation using a while or for loop is extremely efficient and easy to write. We can keep track of the total minutes passed and the work done. If the current minute is a multiple of 
𝐾
K, we skip working; otherwise, we increment our work count.

Here is the corrected and optimal Java solution for the problem:

Corrected Java Code
import java.util.Scanner;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        
        // Read the number of test cases
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                int k = sc.nextInt();
                
                int workDone = 0;
                int currentMinute = 0;
                
                // Simulate minute by minute until workDone reaches n
                while (workDone < n) {
                    currentMinute++;
                    // If the current minute is NOT a multiple of K, Chef works
                    if (currentMinute % k != 0) {
                        workDone++;
                    }
                }
                
                System.out.println(currentMinute);
            }
        }
        sc.close();
    }
}

Complexity Analysis
Time Complexity: 
𝑂
(
𝑁
)
O(N) per test case, because we need to loop up to roughly 
𝑁
+
𝑁
𝐾
−
1
N+
K−1
N
	​

 minutes, which is well under 
200
200 operations given the constraints.
Space Complexity: 
𝑂
(
1
)
O(1) as we only use a few variables for counting.
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
32
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc=new Scanner(System.in);
        if(sc.hasNextInt()){
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int k=sc.nextInt();
            int wd=0;
            int cm=0;
            while(wd<n)
            {
                cm++;
                if(cm%k !=0)
                {
                    wd++;
                }
            }
            System.out.println(cm);
        }
        }
    }
}
 
Test against Custom Input
Correct Answer
Submission ID:
1363678369
Sub-Task	Task #	Result
(time)
1	0	Correct
(0.08)
1	1	Correct
(0.49)
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
