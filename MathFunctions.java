public class MathFunctions {

    public static void main(String[] args) {

        double []arr = new double[4];
        for(int i = 0; i < arr.length; i++) {

            arr[i] = Math.random() * 100;
        }

        System.out.println("5 : " + Math.hypot(3, 4));

        System.out.println("loge^2 : " + Math.log(Math.pow(Math.E, 2)));

        System.out.println("log10 of 100 is " + Math.log10(100));

        System.out.println("Max of 1 and 2 is " + Math.max(1, 2));

        System.out.println("Round of 1.67 is " + Math.round(1.5) + " and 1.3 is " + Math.round(1.3));

        System.out.println("Floor of 1.67 is " + Math.floor(1.67));

        System.out.println("Ceil of 1.67 is " + Math.ceil(1.67));

        System.out.println("Sign of 1.67 is " + Math.signum(1.67));

        System.out.println("Abs of -1.67 is " + Math.abs(-1.67));

        System.out.println("sqrt of 100 is " + Math.sqrt(100));

        System.out.println("cbrt of 1000 is " + Math.cbrt(1000));


    }
}
