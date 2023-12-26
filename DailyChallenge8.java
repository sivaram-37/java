/*
The program must accept an integer matrix of size NxN as the input. The program must modify the matrix 
based on the following conditions in the given order.

-> The top-right quadrant of the matrix is replaced by the bottom-left quadrant. 
-> The bottom-right quadrant of the matrix is replaced by the top-left quadrant. 
Finally, the program must print the modified matrix as the output.
Note: The value of N is always even.
Boundary Condition(s):
2 <= N <= 50
Input Format:
The first line contains N
The next N lines each contain N integers separated by a space.
Output Format:
The first N lines each contain N integers of the modified matrix separated by a space.
Example Input/Output 1:
Input:
4

25 28 84 71
68 51 56 70
17 19 79 29
87 90 52 75

Output:

25 28 17 19
68 51 87 90
17 19 25 28
87 90 68 51

Explanation:
The top-right and quadrant of the matrix are highlighted below.
25 28 84 71
68 51 56 70
      79 29
      52 75

The bottom-right and quadrant of the matrix are highlighted below.
54 71
56 70
17 19 79 29
87 90 52 75
 
After replacing the quadrants as per the given conditions, the matrix becomes

25 28 17 19 
68 51 87 90
17 19 25 28
87 90 68 51
 */

package com.skillrack;
import java.util.*;
public class DailyChallenge8 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int[][] m=new int [n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				m[i][j]=in.nextInt();
			}
		}
		in.close();
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i<n/2 && j<n/2) {
					m[i+n/2][j+n/2]=m[i][j];
				}
				if(i>=n/2 && j<n/2) {
					m[i-n/2][j+n/2]=m[i][j];	
				}	
			}
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(m[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
