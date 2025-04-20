public class simplify_path {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        String[] components = path.split("/");
        for (String s : components) {
            if (s.equals("") || s.equals(".")) {
                continue;  
            } else if (s.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop();  
                }
            } else {
                stack.push(s);  
            }
        }
        StringBuilder result = new StringBuilder();
        for (String s : stack) {
            result.append("/").append(s);
        }
        return result.length() > 0 ? result.toString() : "/";
    }
}
