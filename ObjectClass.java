public class ObjectClass {

    Object  ob;

    ObjectClass(Object ob) {

        this.ob = ob;
    }

    Object getData() {

        return ob;
    }

    void type() {

        System.out.println(ob.getClass().getSimpleName());
    }


    public static void main(String[] args) {

        ObjectClass temp1 = new ObjectClass((Integer)12); 
        ObjectClass temp2 = new ObjectClass((Double)12.12);
        temp1.type();
        temp2.type();
    }
}
