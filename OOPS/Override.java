class Override {
    public static void main(String[] args) {
        Parent p = new Parent();
        p.show();
        p = new Child(10,20);
        p.show();
        p = new Child2();
        p.show();
    }
}
