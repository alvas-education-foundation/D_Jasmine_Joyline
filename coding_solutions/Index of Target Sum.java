/*Two Number Sum Problem Statement
Given an array of integers, return the indices of the two numbers whose sum is equal to a given target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.*/






import java.util.*;

public class TwoSum {

    
    public static int[] findTwoSum_Target(int[] nums, int target) {
        Map<Integer,Integer> numMap=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            int compliment=target-nums[i];
            if(numMap.containsKey(compliment))
            {
                  return new int[]{numMap.get(compliment),i};
              
            }
            else
            {
                numMap.put(nums[i],i);
            }
        }
        return new int[] {};
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int target = sc.nextInt();

        sc.close();

        int[] indices = findTwoSum_Target(nums, target);

        if (indices.length >= 2) {
            System.out.println("index1 : "+indices[0]+" and " + "index2 : " + indices[1]);
        } else {
            System.out.println("No solution found!");
        }
    }
}
