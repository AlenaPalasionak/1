public class Dog {

    private String name;
    private String poroda;
    private int age;

    {
        System.out.println("Это нестатический блок инициализации!");
    }

    public Dog(String x, String y, int z){
        name = x;
        poroda = y;
        age = z;
    }

}


