package Practice;

import java.util.Stack;

public class parenthesis {
    public static void main(String[] args) {
        String str = "(({[]}))";

        char[] ch = str.toCharArray();
        Stack<Character> s = new Stack<>();

        for (char c : ch) {
            switch (c) {
                case '(':
                case '{':
                case '[':
                    s.push(c);
                    break;
                case ')':
                    if (s.peek() == '(') {
                        s.pop();
                    } else {
                        System.out.println("Not balanced");
                        System.exit(0);
                    }
                    break;
                case '}':
                    if (s.peek() == '{') {
                        s.pop();
                    } else {
                        System.out.println("Not balanced");
                        System.exit(0);

                    }
                    break;
                case ']':
                    if (s.peek() == '[') {
                        s.pop();
                    } else {
                        System.out.println("Not balanced");
                        System.exit(0);

                    }
                    break;
                default:
                    System.out.println("Wrong input!");
                    System.exit(0);
            }


        }
        if(s.isEmpty()){
            System.out.println("Balanced");
        }
    }
}
