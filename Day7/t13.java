
class t13 {

    public static void main(String args[]) {
        StringBuffer sb = new StringBuffer();
        sb.append("Hello");
        System.out.println(sb);
        sb.append("java is my favourite language");
        System.out.println(sb);
        sb.delete(0, 5);
        System.out.println(sb);
        sb.replace(5, 7, "are");
        System.out.println(sb);
        sb.deleteCharAt(7);
        System.out.println(sb);
        sb.delete(0, sb.length());
        System.out.println(sb);
    }
}
