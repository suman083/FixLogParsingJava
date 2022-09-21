public class Methods {
    public static void main(String[] args) {
        sayHelloWorld();
        sayHelloName("Suman");
        int num=returnInt();
        System.out.println(num);
        int squar=square_num(5);
        System.out.println(squar);
    }

    private static int square_num(int i) {
        return i*i;

    }

    private static int returnInt() {
        int ret=5;
        System.out.println(ret+"   will be the return value");
        return ret;
    }

    private  static void sayHelloWorld() {

        System.out.println("Hellow oworld");
    }
    public static void sayHelloName(String name){
        System.out.println("hello "+name);
    }

}
