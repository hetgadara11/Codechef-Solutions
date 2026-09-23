# PASSINGGR - Passing Grade

## 🔗 CodeChef Problem

[Open Problem on CodeChef](https://www.codechef.com/problems/PASSINGGR?tab=Help)

## 📝 Problem Statement

Difficulty:629
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
		Scanner sc=new Scanner(System.in)

	}
}



Hello! It looks like your code is just getting started and currently only contains the boilerplate with an incomplete Scanner initialization (missing a semicolon ; at the end as well).

Observations and Insights
Problem Logic: Chef is student number 
1
1 with marks 
𝐴
1
A
1
	​

. To ensure Chef passes, the passing cutoff 
𝑋
X can be at most 
𝐴
1
A
1
	​

. To fail as many other students as possible, the professor should set the cutoff as high as possible, which means setting 
𝑋
=
𝐴
1
X=A
1
	​

.
Algorithm: Therefore, the optimal solution is simply to count how many students have marks greater than or equal to Chef's marks (
𝐴
1
A
1
	​

).
Time Complexity: 
𝑂
(
𝑁
)
O(N) per test case, which easily runs within the time limit.
Suggestions for Improvement
Read the number of test cases 
𝑇
T.
For each test case, read 
𝑁
N and the array of marks.
Store 
𝐴
1
A
1
	​

 (Chef's marks), iterate through all the elements, and count how many are 
≥
𝐴
1
≥A
1
	​

.
Use BufferedReader and StringTokenizer for faster I/O if needed, though Scanner is fine for small constraints (
𝑁
≤
100
,
𝑇
≤
100
N≤100,T≤100).
Corrected Java Code

Here is the complete and correct solution in Java:

import java.util.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                int[] a = new int[n];
                
                for (int i = 0; i < n; i++) {
                    a[i] = sc.nextInt();
                }
                
                int chefsMarks = a[0];
                int passingCount = 0;
                
                // Count how many students scored >= Chef's marks
                for (int i = 0; i < n; i++) {
                    if (a[i] >= chefsMarks) {
                        passingCount++;
                    }
                }
                
                System.out.println(passingCount);
            }
        }
        
        sc.close();
    }
}


Keep up the good work, and let me know if you have any questions about this approach!

Java
​
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
35
36
37
38
                int n = sc.nextInt();
                int[] a = new int[n];
                
                for (int i = 0; i < n; i++) {
                    a[i] = sc.nextInt();
                }
                
                int chefsMarks = a[0];
                int passingCount = 0;
                
                // Count how many students scored >= Chef's marks
                for (int i = 0; i < n; i++) {
                    if (a[i] >= chefsMarks) {
                        passingCount++;
                    }
                }
                
                System.out.println(passingCount);
            }
        }
        
        sc.close();
    }
}
 
Test against Custom Input
Correct Answer
Submission ID:
1362191756
Sub-Task	Task #	Result
(time)
1	0	Correct
(0.09)
Subtask Score: 34%	Result - Correct
2	1	Correct
(0.19)
Subtask Score: 33%	Result - Correct
3	2	Correct
(0.18)
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
