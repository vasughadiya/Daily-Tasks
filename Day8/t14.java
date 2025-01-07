public class t14 {
    public static void main(String[] args) {
        String text = null;
        try {
            int length = text.length();
        } catch (NullPointerException e) {
            System.out.println("A NullPointerException occurred!");
            e.printStackTrace();
        }
    }
}
