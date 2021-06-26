class Main {
    public static void main(String[] args) {
        int start = 3;
        int end = 4;
        int accumulator = 0;                   // (1)
        for (int i = start; i <= end; i++) {   // (2)
            accumulator += i;
            System.out.println(accumulator);// (3)
        }
    }
}