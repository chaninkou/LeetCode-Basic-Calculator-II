package leetcode227;

import java.util.Stack;

public class FindSolutionOfMathFunction {
public int calculate(String s) {
        // Error cechking
        if(s == null || s.length() == 0){
            return 0;
        }
        
        // previous number
        int num = 0;
        
        // + default since we just push it to the stack
        char sign = '+';
        
        // Add up the whole stack for total result
        Stack<Integer> stack = new Stack<>();
        
        for(int i = 0; i < s.length(); i++){
        	// If its digits
        	// num * 10 in case there number are more than one digit
            if(Character.isDigit(s.charAt(i))){
                num = num * 10 + s.charAt(i) - '0';
            }
            
            // if its sign and not empty space or last element
            if((!Character.isDigit(s.charAt(i)) && s.charAt(i) != ' ') || i == s.length() - 1){
                if(sign == '+'){
                    stack.push(num);
                }
                
                if(sign == '-'){
                    stack.push(-num);
                }
                
                if(sign == '*'){
                    stack.push(stack.pop() * num);
                }
                
                if(sign == '/'){
                    stack.push(stack.pop() / num);
                }
                
                // update the sign
                sign = s.charAt(i);
                
                // reset num
                num = 0;
            }
        }
        
        int result = 0;
        
        // add up everything from stack
        while(!stack.isEmpty()){
            result += stack.pop();
        }
        
        return result;
    }
}
