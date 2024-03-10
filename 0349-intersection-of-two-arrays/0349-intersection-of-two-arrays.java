import java.util.*;
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer>set=new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            set.add(nums1[i]);
     }
        // for(int i=0;i<nums2.length;i++){
        //     set.add(nums2[i]);
        // }
       // ArrayList<Integer>list=new ArrayList<>();
        Set<Integer>set1=new HashSet<>();{
            for(int i=0;i<nums2.length;i++){
                set1.add(nums2[i]);
            }
        }
        set.retainAll(set1);
       // ArrayList<Integer>list1=new ArrayList<>(set);
        
//         for(int i=0;i<list1.size();i++){
//             if(set.contains(list1.get(i)));
//             list.add(list1.get(i));
//         }
        int j=0;
        int[] a= new int[set.size()];
        for(int i:set){
            a[j++]=i;
        }
        

        return a;
    }
}