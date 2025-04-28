public class removek_digits {
    public static String removeKdigits(String num, int k) {
        Deque<Character> deque = new ArrayDeque<>();
        for (char digit : num.toCharArray()) {
            while (!deque.isEmpty() && k > 0 && deque.peekLast() > digit) {
                deque.removeLast();
                k--;
            }
            deque.addLast(digit);
        }
        while (k > 0 && !deque.isEmpty()) {
            deque.removeLast();
            k--;
        }
        StringBuilder sb = new StringBuilder();
        while (!deque.isEmpty()) {
            sb.append(deque.removeFirst()); 
        }
        
        while (sb.length() > 1 && sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
        }
        return sb.length() == 0 ? "0" : sb.toString();
    }
}
