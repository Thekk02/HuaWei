package DVolume;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author kk
 * @description 堆内存申请
 * @date 2024-12-20 15:03:24
 */
public class Q1 {
    static class Memory{
        int offset;
        int size;
        public Memory(int offset,int size){
            this.offset = offset;
            this.size = size;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int malloc_size = sc.nextInt();
        ArrayList<Memory> used_memory = new ArrayList<>();
        while(sc.hasNextLine()){
            String line = sc.nextLine();
            if(line.length() == 0){
                break;
            }
            int[] tmp = Arrays.stream(line.split(" ")).mapToInt(Integer::parseInt).toArray();
            used_memory.add(new Memory(tmp[0],tmp[1]));
        }
//        System.out.println(malloc_size,used_memory);
    }
//    public static int helper(int malloc_size,ArrayList<Memory> used_memory){
//        if(malloc_size <= 0 || malloc_size > 100){
//            return  -1;
//        }
//        int free_offset = 0;
//        for(Memory used : used_memory){
//            if(used.offset < free_offset || used.offset > 99){
//                return -1;
//            }
//            if(used.offset > free_offset){
//                int free_memory_size = used.offset - free_offset;
//                if(free_memory_size >= malloc_size && free_memory_size < min_)
//            }
//        }
//    }
}
