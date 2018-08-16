class Solution {
    public String[] uncommonFromSentences(String A, String B) {
        String[] arr = (A+" "+B).split(" ",0);
        Map<String, Integer> map = new HashMap<>();
        ArrayList<String> res = new ArrayList<>();
        for(String a: arr){
            map.put(a, map.getOrDefault(a,0)+1);
        }
        for(String s: map.keySet()){
            if(map.get(s) == 1){
               res.add(s); 
            }
        }
        return res.toArray(new String[0]);
    }
}