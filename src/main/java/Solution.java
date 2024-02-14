import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {
    public String removeKdigits(String num, int k) {
        int n = num.length();
        Deque<Character> stack = new ArrayDeque();
        int i = 0;
        for(; i < n; i++){
            char ch = num.charAt(i);
            if(stack.isEmpty() || stack.peek() <= ch){
                stack.push(num.charAt(i));
                continue;
            }
            while(!stack.isEmpty() && stack.peek() > ch && k != 0){
                stack.poll();
                k--;
            }
            stack.push(ch);


        }
        System.out.println(stack);
        StringBuilder sb = new StringBuilder();
        while (k != 0 && !stack.isEmpty()){
            k--;
            stack.poll();
        }
        while(!stack.isEmpty()){
            sb.insert(0, stack.poll());
        }
        while (!sb.isEmpty() && sb.charAt(0) == '0'){
            sb.deleteCharAt(0);
        }
        for(; i < n; i++){
            sb.append(num.charAt(i));
        }
        return sb.isEmpty() ? "0" : sb.toString();
    }
}
