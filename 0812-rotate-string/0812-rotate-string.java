class Solution {
    public boolean rotateString(String s, String goal) {
        int l=s.length()-1;
        for(int i=0;i<=l;i++){
            String a=s.substring(l-i)+s.substring(0,l-i);
            if(a.equals(goal)){
                return true;
            }
        }
        return false;
    }
}