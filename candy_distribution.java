/* 
*  input: candies: 7
*  input: number_people: 4
*  
*  index 0 1 2 3 
*        1 2 3 1
* 
*  output: [1, 2, 3, 1]
*/
class Main{
  public static void main(String args[]){
    // System.out.println("Hi Java");  
    
    for(int i : candyDistribution(7, 2)){
      System.out.print(i +  " ");
    }
    System.out.println();

    for(int i : candyDistribution(7, 4)){
      System.out.print(i +  " ");
    }
    System.out.println();

    for(int i : candyDistribution(11, 4)){
      System.out.print(i +  " ");
    }
    System.out.println();
  }
  
  public static int[] candyDistribution (int candies, int num_people){
    int[] result = new int[num_people];
    // no corner case such as 0
    // people distinguished by index
    
    // round / time of distribution
    int candy = 0;
    // candy already used 
    int distributed = 0;
    while(candies - distributed > 0){
      candy++;

      // index adjustment
      int index = candy%num_people == 0? (num_people-1): (candy%num_people - 1);

      if(candies - distributed >= candy + 1){
        
        result[index] = candy + result[index];
      } else {
        result[index] = result[index] + candies - distributed;
      }
      // System.out.println("result[candy%num_people]  " +candy%num_people + ": " + result[candy%num_people]);
      // System.out.println("result[index]  " +index + ": " + result[index]);
      distributed = distributed + candy;
      
    } 
    
    return result;
  }
}
