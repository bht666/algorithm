import java.util.HashSet;
import java.util.Set;

/**
 * @projectName: algorithm
 * @package: PACKAGE_NAME
 * @className: Top128
 * @author: 施博杰
 * @description: TODO
 * @date: 2023/9/15 19:04
 * @version: 1.0
 */
public class Top128 {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set=new HashSet<>();
        int ans=0;
        for(int num:nums){
            set.add(num);
        }
        for(int num:nums){
            int temp=1;
            if( !set.contains(num-1)){
                while(set.contains(num+1)){
                    ++num;
                    ++temp;
                }
                if(temp > ans){
                    ans = temp;
                }
            }
        }
        return ans;
    }
}
