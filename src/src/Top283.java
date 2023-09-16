/**
 * @projectName: algorithm
 * @package: PACKAGE_NAME
 * @className: Top283
 * @author: 施博杰
 * @description: TODO
 * @date: 2023/9/15 19:39
 * @version: 1.0
 */
public class Top283 {
    public void moveZeroes(int[] nums) {
        int temp=0;
        for(int num:nums){
            if( num==0 ){
                continue;
            }else{
                nums[temp]=num;
                temp++;
            }
        }
        for(int i = temp;i<nums.length;i++){
            nums[i]=0;
        }
    }
}
