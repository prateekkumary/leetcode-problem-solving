class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        ArrayList<Character>list=new ArrayList<>();
        char []a=jewels.toCharArray();
        char []b=stones.toCharArray();
        int j=a.length-1;
        while(j>=0){
        for(int i=0;i<b.length;i++){
            if(a[j]==b[i]){
                list.add(b[i]);
            }
            
        }
          j--;
        }
       
        return list.size();
    }
}