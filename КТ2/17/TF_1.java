import java.util.Stack;
public class TF_1 {
    public static boolean function(String a){
        int count=0;
        if (a == null)
            return false;
        int lent= a.length();
        Stack stack = new Stack();
        char element;
        for (int i=0;i<lent;i++){
            element = a.charAt(i);

            if (element =='(') {
                stack.push(element);
                count=count+1;
            }
            else{
                if ((!stack.isEmpty()) && element ==')') {
                    stack.pop();
                    count=count-1;}


            }
        }
        if (stack.isEmpty() && count==0)
            return true;
        else
            return false;

    }
        public static void main(String[] args){
                System.out.println(function("()"));
                System.out.println(function("(((())()"));
            }
}


