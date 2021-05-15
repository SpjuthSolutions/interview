public class Mystery {

    public static void main(String[] args) {
        mystery(4711);
    }

    public static int mystery(int number) {

        if (number < 10) {
            System.out.println(number);
            return number;
        }
        int no2 = number % 10 + (mystery(number / 10));
        System.out.println(no2);
        return no2;
    }
}
