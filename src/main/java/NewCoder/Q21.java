package NewCoder;

/**
 * @author kk
 * @description 旋转数组的最小数字
 * @date 2024-12-12 10:26:15
 */
public class Q21 {
    public int minNumberInRotateArray (int[] nums) {
        // write code here
        if(nums.length == 0){
            return 0;
        }
        int l = 0;
        int r = nums.length - 1;
        while(l < r){
            int mid = (l + r) /2;
            if(nums[mid] > nums[r]){
                l = mid + 1;
            }else if(nums[mid] < nums[r]){
                r = mid;
            }else{
                r--;
            }
        }
        return nums[l];
    }
}
