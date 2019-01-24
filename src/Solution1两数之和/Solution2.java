package Solution1两数之和;

import java.util.HashMap;
import java.util.Map;

public class Solution2 {
    public static int[] twoSum(int[] nums, int target) {
      Map<Integer,Integer> map=new HashMap<Integer, Integer>();
      for (int i=0;i<nums.length;i++){
          map.put(target-nums[i],i);
      }
      for (int t=0;t<nums.length;t++){
          if (map.get(nums[t])!=null&&t!=map.get(nums[t])){
               return new int[]{t,map.get(nums[t])};
          }
      }
      return new int[]{};
    }
}
