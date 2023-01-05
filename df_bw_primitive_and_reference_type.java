public class df_bw_primitive_and_reference_type {
    public static void main(String[] args) {
        int a = 10;
        int b = a;
        a = 100;
        System.out.println("a= " + a + ", b= " + b);
        person alex = new person( "alex");
        person mariam = alex;
        System.out.println(alex.name + " " + mariam.name);
        mariam.name = "mariam";
        System.out.println("After change");
        System.out.println(alex.name + " " + mariam.name);
    }
    static class person{
        String name;

        person(String name){
            this.name=name;
        }
    }
}
