public class ArgumentPassing {

    int a;

    static void method(ArgumentPassing obj) {

        obj.a = 2;
    }

    static int swap(int a, int b) {

        return a;
    }

    public static void main(String[] args) {

        ArgumentPassing obj = new ArgumentPassing();
        obj.a = 5;
        method(obj);
        System.out.println(obj.a);
        int a = 4, b = 9;
        System.out.println("a : " + a + " b : " + b);
        a = swap(b, b = a);
        System.out.println("a : " + a + " b :" + b); 
    } 
}
