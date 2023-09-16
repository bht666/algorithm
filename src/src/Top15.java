import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @projectName: algorithm
 * @package: PACKAGE_NAME
 * @className: Top15
 * @author: 施博杰
 * @description: TODO
 * @date: 2023/9/16 14:47
 * @version: 1.0
 */
public class Top15 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans= new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        for(int i=0 ; i< nums.length;i++){
            if( i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int k=nums.length-1;
            for(int j=i+1;j<nums.length;j++){
                if(j>i+1 && nums[j]==nums[j-1]){
                    continue;
                }
                while(j<k && nums[i]+nums[j]+nums[k] > 0){
                    k--;
                }
                if(j==k) break;
                if(nums[i]+nums[j]+nums[k]==0){
                    List<Integer> list=new ArrayList<Integer>();
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(nums[k]);
                    ans.add(list);
                }
            }
        }
        return ans;
    }
}
