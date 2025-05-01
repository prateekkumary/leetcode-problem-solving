class Solution {
    public int findComplement(int num) {
        String binaryString = Integer.toBinaryString(num);
        char [] binArray=binaryString.toCharArray();
        String s="";
        for(int i=0;i<binArray.length;i++){
            if(binArray[i]=='1'){
                s+='0';
            }
            else{
                s+='1';
            }
        }
        int number=Integer.parseInt(s,2);

        return number;
    }
}