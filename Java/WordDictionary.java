package tries;

public class WordDictionary {

    /** Initialize your data structure here. */
    class WD{
    	char value;
        WD[] child = new WD[26];
        boolean isWord = false;
    }
    
    WD root;
    
    public WordDictionary() {
        root = new WD();
    }
    
    /** Adds a word into the data structure. */
    public void addWord(String word) {
        WD current = root;
        for(Character c: word.toCharArray()){
            if(current.child[c-'a'] == null){
                current.child[c-'a'] = new WD();
                current.child[c-'a'].value = c;
            }
            current = current.child[c-'a'];
        }
        current.isWord = true;
    }
    
    /** Returns if the word is in the data structure. A word could contain the dot character '.' to represent any one letter. */
   public boolean search(String word) {
       return helper(word, 0, root);
    }
    
    private boolean helper(String word, int index, WD node){
        if(index == word.length()) 
            return node.isWord;
        char ch = word.charAt(index);
        if(ch != '.'){
            return node.child[ch-'a'] != null && helper(word, index+1, node.child[ch-'a']);
        }
        else{
            for (int i = 0; i < 26; i++) {
                if (node.child[i] != null && helper(word, index+1, node.child[i])) return true;
            }
            return false;
        }
    }
    public static void main(String[] args) {
		// TODO Auto-generated method stub
    	WordDictionary obj = new WordDictionary();
    	obj.addWord("bad");
    	boolean param_2 = obj.search("b.t");
    	System.out.println(param_2);
	}
}