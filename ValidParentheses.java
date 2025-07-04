// 🔹 Question: Valid Parentheses
// Difficulty: Easy

// Description:
// Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

// An input string is valid if:

// Open brackets must be closed by the same type of brackets.

// Open brackets must be closed in the correct order.


// Input: s = "()"
// Output: true

// Input: s = "(]"
// Output: false


import java.util.Stack;

public class ValidParentheses {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        
        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(')');
            } else if (c == '{') {
                stack.push('}');
            } else if (c == '[') {
                stack.push(']');
            } 
            else {
                if (stack.isEmpty() || stack.pop() != c) {
                    return false;
                }
            }
        }
        
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s1 = "()[]{}";
        String s2 = "(]";
        
        System.out.println(s1 + " -> " + isValid(s1)); // true
        System.out.println(s2 + " -> " + isValid(s2)); // false
    }
}
