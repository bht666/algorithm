import java.util.HashMap;

/**
 * @projectName: algorithm
 * @package: PACKAGE_NAME
 * @className: Top1
 * @author: 施博杰
 * @description: TODO
 * @date: 2023/9/14 9:45
 * @version: 1.0
 */
public class Top1 {
    public int[] twoSum(int[] nums, int target) {
        int[] ans=new int[2];
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0; i<nums.length; i++){
            if(map.containsKey( (target - nums[i]))){
                return new int[]{ map.get(target - nums[i]) , i};
            }
            map.put(nums[i],i);
        }
        return null;
    }
}
