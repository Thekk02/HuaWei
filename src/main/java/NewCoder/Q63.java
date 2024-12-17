package NewCoder;

/**
 * @author kk
 * @description 跳台阶
 * @date 2024-12-12 11:41:21
 */
public class Q63 {
    public int jumpFloor (int number) {
        // write code here
        if(number == 1){
            return 1;
        }
        if(number == 2){
            return 2;
        }
        int[] ans = new int[number];
        ans[0] = 1;
        ans[1] = 2;
        for(int i = 2;i < number;i++){
            ans[i] = ans[i -2] * 2 + ans[i -1];
        }
        return ans[number - 1];
    }
}
