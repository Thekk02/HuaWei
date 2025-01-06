package DVolume;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author kk
 * @description 比较两个版本号的大小
 * @date 2025-1-6 11:43:59
 */
public class Q25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String v1 = sc.nextLine();
        String v2 = sc.nextLine();
        //System.out.println(helper(v1,v2));
    }
//    public static int helper(String v1,String v2){
//        String[] arr1 = convert(v1);
//        String[] arr2 = convert(v2);
//        int n = Math.max(arr1.length,arr2.length);
//        for(int i = 0;i < n;i++){
//            String tmp1 = arr1.length > i ? arr1[i] : "0";
//            String tmp2 = arr2.length > i ? arr2[i] : "0";
//            try{
//                int i1 = Integer.parseInt(tmp1);
//                int i2 = Integer.parseInt(tmp2);
//                if(i1 != i2){
//                    return i1 > i2 ? 1 : -1;
//                } catch (Exception e){
//                    int res = tmp1.compareTo(tmp2);
//                    if (res != 0) return res > 0 ? 1 : -1;
//                }
//            }
//
//        }
//        return 0;
//    }

    public static String[] convert(String version){
        return Arrays.stream(version.split("\\.")).map(
                sub ->{
                    String s = sub.replaceAll("^0+","");
                    return "".equals(s) ? "0" : s;
                }
        ).toArray(String[]::new);
    }
}
