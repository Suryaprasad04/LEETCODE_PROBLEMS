class Solution {
    public String sortSentence(String s) {
        String[] words = s.split(" ");

        String[] ans=new String[words.length];

        for(String word: words){
            int pos=word.charAt(word.length()-1)-'0';
            ans[pos-1]=word.substring(0,word.length()-1);
        }

        return String.join(" ", ans);
    }
}



class Solution {
    public String sortSentence(String s) {
        String[] words = s.split(" ");
        List<String> list = new ArrayList<>(Collections.nCopies(words.length, ""));

        for (String word : words) {
            int pos = word.charAt(word.length() - 1) - '0'; // Get position
            list.set(pos - 1, word.substring(0, word.length() - 1)); // Remove digit and set at correct index
        }

        return String.join(" ", list);
    }
}
