public class Sample1 {
    public static void main(String[] args) {

        //q1
        System.out.println((80 + 75 + 55) / 3);

        //q2
        int a = 13;
        if (a % 2 == 1) {
            System.out.println("홀수");
        } else {
            System.out.println("짝수");
        }

        //q3
        String Identifier = "881120-1068234";
        String Birthday = Identifier.substring(0, 6);
        String Number = Identifier.substring(7);
        System.out.println("Birthday = " + Birthday);
        System.out.println("Number = " + Number);

        //q4
        char Sex = Identifier.charAt(7);
        System.out.println("Sex = " + Sex);

        //q5

    }
}

