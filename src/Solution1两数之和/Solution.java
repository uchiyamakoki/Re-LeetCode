package Solution1两数之和;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static int[] twoSum(int[] nums, int target) {
        int len=nums.length;
        int[] indexs=new int[2];
        Map<Integer,Integer> map=new HashMap<Integer,Integer>();
        for (int i=0;i<len;i++){
            map.put(target-nums[i],i);
        }

        for (int t=0;t<len;t++){
            if (map.get(nums[t])!=null&&map.get(nums[t])!=t){
                indexs[0]=t>map.get(nums[t])?map.get(nums[t]):t;
                indexs[1]=t>map.get(nums[t])?t:map.get(nums[t]);
            }
        }
        return  indexs;
    }

    public static void main(String[] args) {

        int[] nums={3,3};
        int[] indexs=new int[2];
        indexs=twoSum(nums,6);
        for (int i=0;i<indexs.length;i++){
            System.out.println(indexs[i]);
        }
    }
}
