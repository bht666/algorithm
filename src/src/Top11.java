/**
 * @projectName: algorithm
 * @package: PACKAGE_NAME
 * @className: Top11
 * @author: 施博杰
 * @description: TODO
 * @date: 2023/9/15 19:44
 * @version: 1.0
 */
public class Top11 {
    public int maxArea(int[] height) {
        int ans=0, i=0 ,j = height.length-1;
        while(i<j){
            if(height[i] < height[j]){
                ans = Math.max(ans, (j-i)* height[i++]);
            }else{
                ans = Math.max(ans, (j-i)* height[j--]);
            }
        }
        return ans;
    }
}
