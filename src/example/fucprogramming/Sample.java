package example.fucprogramming;

public class Sample {
    public static void main(String[] args) {

        //일반식 활용
//        MyCalculator mc = new MyCalculator();
//        int result = mc.sum(3, 4);
//        System.out.println(result);

        //lamda식 사용하여 객체 생성 없이 바로 Calculator 사용.
//        Calculator mc = (int a, int b) -> a+b;
//        int result = mc.sum(3, 4);
//        System.out.println(result);

        //lamda식 한단계 더 발전
//        Calculator mc = (a, b) -> a + b;
//        int result = mc.sum(3, 4);
//        System.out.println(result);

        //(a, b) -> a+b == Integer.sum(int a, int b)
        Calculator mc = Integer::sum;
        int result = mc.sum(3, 4);
        System.out.println(result);
    }
}
