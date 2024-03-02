class Solution {
    public int[] sortedSquares(int[] nums) {
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            list.add(nums[i]*nums[i]);
        }
        for(int i=0;i<list.size();i++){
            nums[i]=list.get(i);
        }
        Arrays.sort(nums);
        return nums;
        
    }
}