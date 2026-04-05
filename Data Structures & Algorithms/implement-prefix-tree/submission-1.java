class PrefixTree {
    TrieNode root;

    public PrefixTree() {
         root = new TrieNode();
    }

    public void insert(String word) {
        char[] word_array = word.toCharArray();
        TrieNode curr = root;
        for(char letter : word_array){
            int loc = letter - 'a';
            if(curr.children[loc]==null){
                curr.children[loc] = new TrieNode();
            }
            curr = curr.children[loc];
        }
        curr.endOfWord = true;
    }

    public boolean search(String word) {
        char[] word_array = word.toCharArray();
        TrieNode curr = root;
        for(char letter : word_array){
            int loc = letter - 'a';
            if(curr.children[loc]==null){
                return false;
            }
            curr = curr.children[loc];
        }

        return curr.endOfWord;
    }

    public boolean startsWith(String prefix) {
        char[] word_array = prefix.toCharArray();
        TrieNode curr = root;
        for(char letter : word_array){
            int loc = letter - 'a';
            if(curr.children[loc]==null){
                return false;
            }
            curr = curr.children[loc];
        }

        return true;
    }
}

public class TrieNode{
    TrieNode[] children = new TrieNode[26];
    boolean endOfWord = false;
}
