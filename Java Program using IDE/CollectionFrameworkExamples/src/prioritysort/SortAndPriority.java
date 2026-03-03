package prioritysort;

import java.util.*;
class MyComparator1 implements Comparator<Integer>{
    @Override
    public int compare(Integer o1, Integer o2) {
        return o1.compareTo(o2);
    }
}
public class SortAndPriority {

//    public static void relativeSort(int[] arr, int[] order){
//
//        HashMap<Integer, Integer> feqMap = new HashMap<>();
//        int[] result = new int[arr.length];
//        for(int num:arr){
//            feqMap.put(num, feqMap.getOrDefault(num,0)+1);
//        }
//
//
//        int index = 0;
//        for(int num:order){
//            if(feqMap.containsKey(num)){
//                int count = feqMap.get(num);
//
//                while(count>0){
//                    result[index++]=num;
//                    feqMap.put(num, --count);
//                }
//                feqMap.remove(num);
//            }
//
//
//        }
//        List<Integer> remaining = new ArrayList<>();
//        for(HashMap.Entry<Integer,Integer> entry: feqMap.entrySet()){
//            remaining.add(entry.getKey());
//        }
//        Collections.sort(remaining);
//        for(int rem:remaining){
//            result[index++] = rem;
//        }
//
//        for(int i=0; i<result.length;i++){
//            System.out.print(result[i]+", ");
//        }
//        System.out.println();
//
//
//
//
//    }
    public static void main(String[] args){
        int[] arr = {1,1,6,7,2,2,4,7,8,9,0,0,8,3,3,5,10};
        int[] order = {10,9,8,7,5,6,6,4,3,2,1,0};
        for(int n:arr){
            System.out.print(n+" ");
        }
        Arrays.sort (arr);
        System.out.println("");
        List<Integer> list = new ArrayList<>();

        for(int n:arr){
            list.add(n);
        }
        System.out.println("size "+list.size());
        //Collections.sort(list);
        Collections.sort(list,new  MyComparator1());

        //Collections.reverse(list);
        System.out.println("sorted "+list);
//        // Step 1: Create priority map
//        final Map<Integer, Integer> priorityMap =
//                new HashMap<Integer, Integer>();
//
//        for (int i = 0; i < order.length; i++) {
//            // first occurrence gets highest priority
//            if (!priorityMap.containsKey(order[i])) {
//                priorityMap.put(order[i], i);
//            }
//        }
//
//        // Step 2: Convert int[] to Integer[]
//        Integer[] boxedArr = new Integer[arr.length];
//        for (int i = 0; i < arr.length; i++) {
//            boxedArr[i] = arr[i];
//        }
//
//        // Step 3: Sort using Comparator
//        Arrays.sort(boxedArr, new Comparator<Integer>() {
//            public int compare(Integer a, Integer b) {
//
//                boolean aInMap = priorityMap.containsKey(a);
//                boolean bInMap = priorityMap.containsKey(b);
//
//                if (aInMap && bInMap) {
//                    return priorityMap.get(a) - priorityMap.get(b);
//                }
//
//                if (aInMap) return -1;
//                if (bInMap) return 1;
//
//                // if both not in order array → natural sort
//                return a - b;
//            }
//        });

        // Step 4: Print result
//        System.out.println(Arrays.toString(boxedArr));
//        relativeSort(arr,order);
    }
}
