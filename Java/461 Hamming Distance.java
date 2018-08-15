class Solution {
    public int hammingDistance(int x, int y) {
        int xorValue = x^y;
        int count =0;
        String a = Integer.toBinaryString(xorValue);
        char[] achar = a.toCharArray();
        for(Character c: achar){
            if(c=='1'){
                count = count+1;
            }
        }
        return count;
    }
}