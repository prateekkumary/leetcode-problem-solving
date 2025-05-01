class Solution {
    public int titleToNumber(String columnTitle) {
        char[] ch=columnTitle.toCharArray();
        int colNum=0;
        for(int i=0;i<ch.length;i++){
            char c=ch[i];
            int value=c-'A'+1;
            colNum=colNum*26+value;
        }
        return colNum;
        
    }
}