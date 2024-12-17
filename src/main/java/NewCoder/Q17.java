package NewCoder;

/**
 * @author kk
 * @description 二分查找
 * @date 2024-12-12 10:04:05
 */
public class Q17 {
    public int search (int[] nums, int target) {
        if(nums.length == 0){
            return -1;
        }
        int l = 0,r = nums.length - 1;
        while(l <= r){
            int mid = (l + r)/2;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] < target){
                l = mid +1;
            }else{
                r = mid - 1;
            }
        }
        return -1;
    }
}
