/*
 * This is the IntegersWithEvenNumberDigits class that will be used to solve this problem. 
 *
 * Author: Nick Burkett
 * Date: 12/30/24
 *
 */
public class IntegersWithEvenNumberDigits{

        /*
         * Here is the main function for this solution - ExploreDigits
         * @params nums[] - Integer array that will contain the numbers in question
         * @return int - How many of the numbers are composed of an EVEN number of digits. 
         */
        public int exploreDigits(int[] nums){
                
                int totalCount = 0;    //Initialize var to keep track of total number of elements evenly divisible by 2.

                //Need a for-loop to iterate over the array. 
                for(int i: nums){
                        
                        int varX = i;        //Capture the ith element of the array.
                        int helper = 0;            //Initialize helper var to keep track of # digits/# in array. 
                        boolean boolVar = true;    //Initialize boolean for while-loop below.
                        
                        //Create while-loop for digit calculation. 
                        while(boolVar){
                                
                                int varY = varX/10;    //Divide the whole number by 10 - equals one digit.
                                helper +=1;            //Increment helper by one. 
                                
                                //Check if we are at zero or not. 
                                if(varY > 0){
                                        varX = varY;   //Update our number for the next iteration of the loop... more digits to count.
                                }
                                else{
                                        boolVar = false;    //Update the bool bec we are complete with this number. 
                                }
                        }

                        //Here is where I check to see if the total number of digits is even. 
                        if((helper % 2) == 0){
                                
                                totalCount += 1;   //Increment totalCount by one to account for the case.

                        }
                }

                return totalCount;     //Return the total number of elements in the array that have an even number of digits.
        }

        //Main function used for testing.
        public static void main(String[] args){
                
                int[] testerArr = {1, 22, 222, 2222, 222222, 22222222, 345};     //Create an array to test with. 
                
                IntegersWithEvenNumberDigits newObj = new IntegersWithEvenNumberDigits();   //Create instance of object. 
                
                System.out.println(newObj.exploreDigits(testerArr));       //Test my new func.
        }
}







