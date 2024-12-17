package EVolume;

import java.util.Scanner;

/**
 * @author kk
 * @description TLV编码
 * @date 2024-12-5 14:22:33
 */
public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String tag = sc.nextLine();

        String line = sc.nextLine();

        String[] hexArray = line.split(" ");

        int index = 0;
        while(index < hexArray.length){
            int length = Integer.parseInt(hexArray[index + 2] + hexArray[index + 1],16);
            if(hexArray[index].equals(tag)){
                StringBuilder sb = new StringBuilder();
                for(int i = index + 3;i < index + 3 + length;i++){
                    sb.append(hexArray[i]).append(" ");
                }
                System.out.println(sb.toString().toUpperCase().trim());
                break;
            }else{
                index += (2 + length + 1);
            }
        }
    }
}
