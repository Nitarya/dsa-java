class string_builder {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("abcdefgh");
        System.out.println(str);
        str.setCharAt(2,'z');
        System.out,println(str);

        str.append("wire");
        System.out.println(str);
    }
}