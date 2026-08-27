# STICKCOMP - Brick Comparisions

## 🔗 CodeChef Problem

[Open Problem on CodeChef](https://www.codechef.com/problems/STICKCOMP?tab=Help)

## 📝 Problem Statement

Difficulty:625
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

	}
}



Hello! It looks like you haven't written the solution yet inside the main method. Let's work on solving this problem together.

Observations & Approach

To solve this problem, we can directly simulate the process described by the problem statement:

Start by assuming Chef holds the first brick (index 
1
1, or index 
0
0 in 0-indexed Java arrays). Keep track of both its index and its size.
Iterate through the remaining bricks from index 
2
2 to 
𝑁
N (or 
1
1 to 
𝑁
−
1
N−1 in 0-indexed arrays).
If you encounter a brick with a strictly larger size than the one Chef is currently holding, update Chef's current brick to this new one.
Finally, print the 1-based index of the brick Chef ends up with.

(Note: As mentioned in the editorial, an alternative way to think about this is that the answer is simply the index of the first occurrence of the maximum element in the array, because Chef only swaps for a strictly larger brick and never drops a brick for one of equal size).

Corrected Code (Java)

Here is the complete Java solution using the simulation approach:

import java.util.Scanner;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner scanner = new Scanner(System.in);
        
        // Check if there are test cases
        if (!scanner.hasNextInt()) return;
        int t = scanner.nextInt();
        
        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] a = new int[n];
            
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }
            
            // Chef starts with the first brick (index 0)
            int bestIndex = 0; 
            int maxSize = a[0];
            
            // Iterate through the remaining bricks
            for (int i = 1; i < n; i++) {
                // If the current brick is strictly larger, Chef picks it up
                if (a[i] > maxSize) {
                    maxSize = a[i];
                    bestIndex = i;
                }
            }
            
            // Print 1-based index
            System.out.println(bestIndex + 1);
        }
        
        scanner.close();
    }
}

Complexity Analysis
Time Complexity: 
𝑂
(
𝑁
)
O(N) per test case, since we iterate through the array of size 
𝑁
N just once.
Space Complexity: 
𝑂
(
𝑁
)
O(N) to store the array of brick sizes.
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
35
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int[] a=new int[n];
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
            }
            int best=0;
            int max=a[0];
            for(int i=1;i<n;i++)
            {
                if(a[i]>max)
                {
                    max=a[i];
                    best=i;
                }
            }
            System.out.println(best+1);
        }
    }
}
 
Test against Custom Input
Correct Answer
Submission ID:
1348468962
Sub-Task	Task #	Result
(time)
1	0	Correct
(0.09)
Subtask Score: 34%	Result - Correct
2	1	Correct
(0.11)
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
