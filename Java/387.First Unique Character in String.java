class Solution {
    public int firstUniqChar(String s) {
        char[] chars = s.toCharArray();
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for(int i=0; i < chars.length; i++){
            if(map.containsKey(chars[i])){
                map.put(chars[i], map.get(chars[i]) + 1);
            }
            else {
            	map.put(chars[i], 1);
            }  
        }
        for(int i=0; i < chars.length; i++){
            if(map.get(chars[i]) == 1) {
            	return i;
            }	
        }
        return -1;
    }
}