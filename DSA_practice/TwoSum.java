import java.util.*;
 public class TwoSum{
    public static int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        Map<Integer,Integer> seen = new HashMap<>();
        int count = 0;
        for(int i=0;i<n;i++)
        {
            count++;
            int comp=target-nums[i];
            if(seen.containsKey(comp))
            {
                System.out.println(count);
                return new int[]{seen.get(comp),i};
            }
                seen.put(nums[i],i);      
        }
        System.out.println(count);
        return new int[]{-1,-1};    
}
    public static void main(String[] args){
        int[] arr = new int[]{1, 1, 2};
        int target = 2;
        System.out.println(Arrays.toString(twoSum(arr,target)));
    }
}
  