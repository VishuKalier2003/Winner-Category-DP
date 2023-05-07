/* You are given an integer array nums. Two players are playing a game with this array: player 1 and player 2...
Player 1 and player 2 take turns, with player 1 starting first... Both players start the game with a score of 0...
At each turn, the player takes one of the numbers from either end of the array (i.e., nums[0] or 
nums[nums.length - 1]) which reduces the size of the array by 1... The player adds the chosen number to their 
score... The game ends when there are no more elements in the array... Return true if Player 1 can win the game... 
If the scores of both players are equal, then player 1 is still the winner, and you should also return true... 
You may assume that both players are playing optimally...
* Eg 1 : Input = [2,5,1]                                          Output = false
* Eg 2 : Input = [1,5,233,7]                                      Output = true
* Eg 3 : Input = [1,5,9,27,8]                                     Output = false
* Eg 4 : Input = [14,3,9,1,3]                                     Output = true
*/
import java.util.*;
public class Winner
{
      public boolean PredictTheWinner(int[] nums)
      {
            if(nums.length % 2 != 0)    // When the array length is odd...
            {
                  int sum = 0, sum1 = 0;      //* Variable => O(1)
                  for(int i = 0; i < nums.length; i = i + 2)     //! Comparison => O(N)
                        sum = sum + nums[i];    // Generating odd places sum...
                  for(int j = 1; j < nums.length; j = j + 2)     //! Comparison => O(N)
                        sum1 = sum1 + nums[j];  // Generating even places sum...
                  return (sum >= sum1) ? true : false;    // Ternary operators...
            }
            return true;    // In case of even array length, it is always possible to wim...
      }
      public static void main(String args[])
      {
            Scanner sc = new Scanner(System.in);
            int x;
            System.out.print("Enter number of elements : ");
            x = sc.nextInt();
            int nums[] = new int[x];
            for(int i = 0; i < nums.length; i++)
            {
                  System.out.print("Enter value : ");
                  nums[i] = sc.nextInt();
            }
            Winner winner = new Winner();     // Object creation...
            System.out.print("Chance of player 1 winning : "+winner.PredictTheWinner(nums));   // Function calling...
            sc.close();
      }
}


//! Time Complexity => O(N)
//* Space Complexity => O(1)

/** //? DEDUCTIONS :-
 * ? By observing test cases, we found out that the chance of player 1 loosing is possible only when the 
 * ? array length is odd...
 * ? Thus, we check the sum at odd and even places, and generate the result...
 */