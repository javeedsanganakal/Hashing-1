class WordsPattern {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if(pattern.length() != words.length) return false;
        
        HashMap<Character, String> map = new HashMap();
        
        for(int i=0; i<pattern.length(); i++){
            char patternChar = pattern.charAt(i);
            
            if(map.containsKey(patternChar)){
                if(!(map.get(patternChar).equals(words[i]))) return false;    
            }
            else{
                if(map.containsValue(words[i])) return false;
                else map.put(patternChar, words[i]);     
            }
        }
        return true;
        
        
    }
}
