# StairCase-Problem

One Known Issue - It gives incorrect output when number of blocks are 14. Open for solution from all. As per me, it should give 4 stars but it currently gives 3 stairs.

This is my improved version of https://www.geeksforgeeks.org/find-number-stair-steps/

Problem Statement - exactly copied from GeeksForGeeks

Given the total number of bricks T, find the number of stair steps that can be formed by using given bricks such that if step S has bricks B, then step S+1 should have exactly B+1 bricks and total number of bricks used should be less than or equal to number of bricks available.
Note: Number of bricks required to make step 1 of stair is 2, i.e step S = 1 must have exactly B = 2 bricks.


Examples:

Input  : 15
Output : 4
Bricks should be arranged in this pattern to solve for T = 15:



Explanation:
Number of bricks at step increases by one.
At Step 1, Number of bricks = 2, Total = 2
At step 2, Number of bricks = 3, Total = 5
At step 3, Number of bricks = 4, Total = 9
At step 4, Number of bricks = 5, Total = 14

If we add 6 more bricks to form new step, 
then the total number of bricks available will surpass. 
Hence, number of steps that can be formed are 4 and
number of bricks used are 14 and we are left with 
1 brick which is useless.

Input  : 40
Output : 7
Bricks should be arranged in this pattern to solve for T = 40:


Explanation:
At Step 1, Number of bricks = 2, Total = 2
At step 2, Number of bricks = 3, Total = 5
At step 3, Number of bricks = 4, Total = 9
At step 4, Number of bricks = 5, Total = 14
At step 5, Number of bricks = 6, Total = 20
At step 6, Number of bricks = 7, Total = 27
At step 7, Number of bricks = 8, Total = 35

If we add 9 more bricks to form new step,
then the total number of bricks available will surpass.
Hence, number of steps that can be formed are 7 and 
number of bricks used are 35 and we are left with 
5 bricks which are useless.
