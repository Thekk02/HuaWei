package EVolume;

import java.beans.PropertyEditorSupport;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @author kk
 * @description 内存资源分配
 * @date 2024-12-9 11:09:55
 */
public class Q23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String memory = sc.nextLine();
        String applylist = sc.nextLine();
        List<Integer> memorys = new ArrayList<>();
        List<String> memoryinfo = new ArrayList<>(Arrays.asList(memory.split(",")));
        for(String info : memoryinfo){
            String[] minfo = info.split(":");
            for(int i = 0;i < Integer.parseInt(minfo[1]);i++){
                memorys.add(Integer.parseInt(minfo[0]));
            }

        }
        memorys.sort((a,b) -> a - b);

        //申请信息
        List<Integer> applyMemoryList = new ArrayList<>();
        List<String> applyListList = new ArrayList<>(Arrays.asList(applylist.split(",")));
        for(String str: applyListList){
            applyMemoryList.add(Integer.parseInt(str));
        }


        List<Boolean> ans = new ArrayList<>();
        for(int applymemory : applyMemoryList){
            boolean flag = false;
            for(int i = 0;i < memorys.size();i++){
                if(memorys.get(i) >= applymemory){
                    memorys.remove(i);
                    break;
                }
            }
            ans.add(flag);
        }
        for(int i = 0;i < ans.size();i++){
            System.out.print(ans.get(i));
            if(i != ans.size() - 1){
                System.out.print(",");
            }
        }

    }
}
