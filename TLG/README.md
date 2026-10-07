# TLG - The Lead Game

## 🔗 CodeChef Problem

[Open Problem on CodeChef](https://www.codechef.com/problems/TLG)

## 📝 Problem Statement

Difficulty:790
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
The Lead Game

The game of billiards involves two players knocking 3 balls around on a green baize table. Well, there is more to it, but for our purposes this is sufficient.

The game consists of several rounds and in each round both players obtain a score, based on how well they played. Once all the rounds have been played, the total score of each player is determined by adding up the scores in all the rounds and the player with the higher total score is declared the winner.

The Siruseri Sports Club organises an annual billiards game where the top two players of Siruseri play against each other. The Manager of Siruseri Sports Club decided to add his own twist to the game by changing the rules for determining the winner. In his version, at the end of each round, the cumulative score for each player is calculated, and the leader and her current lead are found. Once all the rounds are over the player who had the maximum lead at the end of any round in the game is declared the winner.

Consider the following score sheet for a game with 5 rounds:

Round	Player 1	Player 2
1	140	82
2	89	134
3	90	110
4	112	106
5	88	90

The total scores of both players, the leader and the lead after each round for this game is given below:

Round	Player 1	Player 2	Leader	Lead
1	140	82	Player 1	58
2	229	216	Player 1	13
3	319	326	Player 2	7
4	431	432	Player 2	1
5	519	522	Player 2	3

Note that the above table contains the cumulative scores.

The winner of this game is Player 1 as he had the maximum lead (58 at the end of round 1) during the game.

Your task is to help the Manager find the winner and the winning lead. You may assume that the scores will be such that there will always be a single winner. That is, there are no ties.

Input

The first line of the input will contain a single integer N (N ≤ 10000) indicating the number of rounds in the game. Lines 2,3,...,N+1 describe the scores of the two players in the N rounds. Line i+1 contains two integer Si and Ti, the scores of the Player 1 and 2 respectively, in round i. You may assume that 1 ≤ Si ≤ 1000 and 1 ≤ Ti ≤ 1000.

Output

Your output must consist of a single line containing two integers W and L, where W is 1 or 2 and indicates the winner and L is the maximum lead attained by the winner.

Sample 1:
Input
Output
5
140 82
89 134
90 110
112 106
88 90
1 58
Did you like the problem statement?
904 users found this helpful
More Info
Time limit1 secs
Memory limit1.5 GB
Source Limit50000 Bytes
Contributors
Java
​
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
39
40
41
42
43
44
45
46
47
48
49
50
51
            // Calculate current lead
            int lead = Math.abs(p1 - p2);
            // Check if current lead is maximum
            if(lead > maxLead)
            {
                maxLead = lead;
                if(p1 > p2)
                {
                    winner = 1;
                }
                else
                {
                    winner = 2;
                }
            }
        }
        System.out.println(winner + " " + maxLead);
        
    }
}
 
Test against Custom Input
Correct Answer
Submission ID:
1371049892
Sub-Task	Task #	Result
(time)
1	0	Correct
(0.24)
Subtask Score: 14%	Result - Correct
2	1	Correct
(0.26)
Subtask Score: 14%	Result - Correct
3	2	Correct
(0.20)
Subtask Score: 14%	Result - Correct
4	3	Correct
(0.26)
Subtask Score: 14%	Result - Correct
5	4	Correct
(0.16)
Subtask Score: 14%	Result - Correct
6	5	Correct
(0.16)
Subtask Score: 14%	Result - Correct
7	6	Correct
(0.16)
Subtask Score: 16%	Result - Correct
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
