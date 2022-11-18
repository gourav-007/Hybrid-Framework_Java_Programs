import java.util.Stack;

class Solution {
    public static String decodeString(String s) {

        Stack<Integer> countStack = new Stack<>();
        Stack<String> wordStack = new Stack<>();
        int number=0;
        StringBuilder word = new StringBuilder();

        for (int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            
            if (Character.isDigit(ch)){
                number = number * 10 + (ch-'0');
            } else if (Character.isLetter(ch)) {
                word.append(ch);
            }else if (ch=='['){
                countStack.push(number);
                wordStack.push(word.toString());
                //reset
                number=0;
                word = new StringBuilder();
            }else{
                int count = countStack.pop();
                StringBuilder duplicateWord = new StringBuilder(wordStack.pop());

                for (int j=1;j<=count;j++){
                    duplicateWord.append(word);
                }

                word=duplicateWord;
            }
        }

        return word.toString();
    }

    public static void main(String[] args) {
        String str = "3[a]2[bc]";
        System.out.println(decodeString(str));
    }

}


//Output: aaabcbc
