
import java.util.ArrayList;
import java.util.List;

public class LargestSum {
    /**
     * Get the largest possible sum that can be obtained from a pair of values in the list. A number can't be added
     * to itself, unless there are duplicates.
     *
     * @param nums a list of ints.
     * @return the largest possible sum of separate numbers from nums.
     */
    public int bigSum(List<Integer> nums){
       
        

        
        int first = 0;
        int firstNumberIndex = 0 ;
        int second = 0; 
        //Given the list {0, 1, 2, 3, 4}, the largest sum is 7 (3+4).
        for (int i = 0; i < nums.size(); i++){
            if(nums.get(i) > first){
                first = nums.get(i);
                firstNumberIndex = i; 
            }
        }
            System.out.println(first);
            nums.remove(firstNumberIndex);
        for(int l = 0; l < nums.size(); l++ ){
            if(nums.get(l) > second){
            second = nums.get(l);
            }
        }

        System.out.println(second);

        return second + first;
    }
}