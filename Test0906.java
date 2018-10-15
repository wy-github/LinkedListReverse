public class Test0906 {
    public static void main(String[] args) {
        Integer a = 1;
        Integer b =2;
        System.out.println("a =" + a +",b =" + b);
        swap(a,b);
        System.out.println("a =" + a +",b =" + b);
    }

    public static void swap(Integer num1,Integer num2){
        Test0906 test = new Test0906();
        test.getClass().getInterfaces();
        Integer temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("num1 =" +num1 + ",num2 =" + num2);

    }
}
