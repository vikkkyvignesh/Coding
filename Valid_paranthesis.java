import java.util.Stack;

public class Valid_paranthesis {
    public static void main(String[] args) {
        String s = "({)}[]";

        Stack<Character> st = new Stack<Character>();

        int n = s.length();

        for (int i=0;i<n;i++)
        {
            if(s.charAt(i) == '(' ||s.charAt(i) == '{'||s.charAt(i) == '[' )
            {
                st.push(s.charAt(i));
            } else if (s.charAt(i) == ')') {
                if(st.size() == 0)
                {
                    System.out.println("False");
                } else if (st.peek() == '(') {
                    st.pop();

                }
                else {
                    System.out.println("False");
                }
            }
            else if (s.charAt(i) == '}') {
                if(st.size() == 0)
                {
                    System.out.println("False");
                } else if (st.peek() == '{') {
                    st.pop();

                }
                else {
                    System.out.println("False");
                }
            }
            else if (s.charAt(i) == ']') {
                if(st.size() == 0)
                {
                    System.out.println("False");
                } else if (st.peek() == '[') {
                    st.pop();

                }
                else {
                    System.out.println("False");
                }
            }
        }


        if(st.size() == 0)
        {
            System.out.println("Valid");
        }
        else
        {
            System.out.println("Invalid");
        }
    }
}
