# PBREV - Problem Reviews

## 🔗 CodeChef Problem

[Open Problem on CodeChef](https://www.codechef.com/problems/PBREV?tab=Help)

## 📝 Problem Statement

Difficulty:643
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
		    int n=sc.nextInt();
		    int[] s=new int[n];
		    for(int i=0;i<n;i++)
		    {
		        s[i]=sc.nextInt();
		    }
		    for(int i=0;i<n;i++)
		    {
		        if(s[i]<4)
		        {
		            System.out.println("NO");
		        }
		        else
		        {
		            System.out.println("YES");
		        }
		    }
		}

	}
}



Hello! I would be happy to review your code and help you improve it.

Observations and Feedback:
Logic Error (Multiple Outputs per Test Case): In your second for loop, you are checking each judge's score individually and printing "NO" or "YES" for every single judge. However, the problem requires you to determine if every judge gave a score strictly greater than 4. You should only print YES if all scores are 
>
4
>4, and NO if even a single score is 
≤
4
≤4.
Incorrect Condition: The problem states that a score must be strictly greater than 
4
4 (i.e., 
≥
5
≥5). Your condition s[i] < 4 misses the case where a judge gives a score of exactly 
4
4.
Efficiency & Approach: Instead of storing the scores in an array, you can process them on-the-fly using a boolean flag or by tracking the minimum score, which reduces space complexity to 
𝑂
(
1
)
O(1).
Corrected Code:

Here is the corrected version of your Java code that fixes the logic and correctly outputs the result once per test case:

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
            boolean isGood = true;
            
            for(int i = 0; i < n; i++)
            {
                int score = sc.nextInt();
                // If any judge gives 4 or less, the problem is not good
                if(score <= 4)
                {
                    isGood = false;
                }
            }
            
            if(isGood)
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}

Complexity:
Time Complexity: 
𝑂
(
𝑁
)
O(N) per test case, since we iterate through the 
𝑁
N scores once.
Space Complexity: 
𝑂
(
1
)
O(1) auxiliary space, as we process scores on-the-fly without needing an array.
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
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int count=0;
            for(int i=0;i<n;i++)
            {
                int s=sc.nextInt();
                if(s<=4)
                {
                    count++;
                }
            }
            if(count==0)
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
        }
 
Test against Custom Input
Correct Answer
Submission ID:
1346390086
Sub-Task	Task #	Result
(time)
1	0	Correct
(0.07)
Subtask Score: 25%	Result - Correct
2	1	Correct
(0.12)
Subtask Score: 25%	Result - Correct
3	2	Correct
(0.10)
Subtask Score: 25%	Result - Correct
4	3	Correct
(0.12)
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
