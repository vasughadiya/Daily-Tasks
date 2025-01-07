public class t1 {
    public static void main(String[] args) {
        String s = "WELCOME TO MV CLOUDS";
        String new_str = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                new_str += s.charAt(i);
            }
        }
        System.out.println(new_str);
    }
}
