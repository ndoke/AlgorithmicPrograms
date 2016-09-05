import java.util.Stack;

public class CtrlShiftF {

	public static boolean formatVerify(String str) {
		Stack<String> stack = new Stack<String>();

		for (int i = 0; i < str.length(); i++) {
			String temp = str.charAt(i) + "";
			if (temp.equals("("))
				stack.push("(");
			else if (temp.equals("["))
				stack.push("[");
			else if (temp.equals("{"))
				stack.push("{");
			else if (temp.equals(")")) {
				if (stack.peek().equals("("))
					stack.pop();
				else
					return false;
			} else if (temp.equals("]")) {
				if (stack.peek().equals("["))
					stack.pop();
				else
					return false;
			} else if (temp.equals("}")) {
				if (stack.peek().equals("{"))
					stack.pop();
				else
					return false;
			}
		}

		if (stack.isEmpty())
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		System.out.println(formatVerify("{}{}()[]"));
		System.out.println(formatVerify("{([])}"));
		System.out.println(formatVerify("{[}]"));
		System.out.println(formatVerify("{()[]([{}])}"));
		System.out.println(formatVerify("(({}[]))"));
		System.out.println(formatVerify("({["));
	}

}
