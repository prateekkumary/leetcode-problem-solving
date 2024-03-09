import java.util.*;
class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        
        HashSet<Integer>set=new HashSet<>();
        for(int i:nums1){
            set.add(i);
        }
        for(int i:nums2){
            if(set.contains(i)){
                return i;
            }
        }
        return -1;
//         int n=nums1.length;
//         int m=nums2.length;
//         int []a=new int[n+m+1];
//         for(int i=0;i<n;i++){
//             a[nums1[i]]++;
//         }
//          for(int i=0;i<m;i++){
//             a[nums2[i]]++;
//         }
//         int min=0;
//         for(int i=0;i<n+m;i++){
            
//             if(a[i]>=2){
//                 return a[i];
//             }
//         }
       // return -1;
        // int count=0;
        // for(int i=0;i<nums1.length;i++){
        //     for(int j=0;j<nums2.length;j++){
        //         if(nums1[i]==nums2[j]){
        //             count++;
        //         }
        //     }
      //}
        
//         return  2*count;
//  
    }
}