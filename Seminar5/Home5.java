// /*
//  * Написать метод, определяющую правильность расстановки скобок в выражении.
//  * Могут содержаться следующие скобки: ()[]{}<>
//  * () -> true
//  * []{}((<>)) -> true
//  * ) -> false
//  * [) -> false
//  * []{}(<)> -> false
//  */

package Seminars_Java.Seminar5;

import java.util.Stack;

public class Home5 {
    public static void main(String[] args) {

        System.out.println(isCorrectParentheses("()"));
        System.out.println(isCorrectParentheses("[]{}((<>))"));
        System.out.println(isCorrectParentheses(")"));
        System.out.println(isCorrectParentheses("[)"));
        System.out.println(isCorrectParentheses("[]{}(<)>"));
    }

    public static boolean isCorrectParentheses(String expression) {
        boolean correct;
        Stack<Character> stack = new Stack<>();
        if (correct = expression != null) {
            for (char symbol : expression.toCharArray()) {
                if (symbol == '(' || symbol == '[' || symbol == '{' || symbol == '<') {
                    stack.push(symbol);
                } else if (symbol == ')' || symbol == ']' || symbol == '}' || symbol == '>') {
                    if (stack.empty()) {
                        correct = false;
                        break;
                    } else {
                        char bracket = stack.pop();
                        if (!checkReverseBracket(bracket, symbol)) {
                            correct = false;
                            break;
                        }
                    }
                }
            }
            correct = correct && stack.empty();
        }
        return correct;
    }

    public static boolean checkReverseBracket(char on, char off) {
        return (on == '(' && off == ')') || (on == '[' && off == ']') || (on == '{' && off == '}')
                || (on == '<' && off == '>');
    }

}