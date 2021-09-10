package co.com.sofka.exercise16;

public final class Person {
//Variables
    private String name = "";
    private int age = 0;
    private  String DNI;
    private char sex = 0;
    private double weight = 0;
    private double height = 0;
    private final char[] letters = {  'T', 'R', 'W',
            'A', 'G', 'M', 'Y', 'F', 'P', 'D',
            'X', 'B', 'N', 'J', 'Z', 'S', 'Q',
            'V', 'H', 'L', 'C', 'K', 'E'};

//Constructor por defecto
    public Person() {}

//Contructor name,age,sex
    public Person(String name, int age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

  //Contrctor all
    public Person(String name, int age, char sex, double weight, double height) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.weight = weight;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public String getDNI() {
        return DNI;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public int workoutIMC(){
        double weightWorkout = weight/(Math.pow(height,2));

        if (weightWorkout >= 20 && weightWorkout <=25){
            System.out.println("No tiene sobre peso");
            return 0;
        }else if (weightWorkout < 20){
            System.out.println("La persona esta por debajo de su peso");
            return -1;
        }else
            System.out.println("La persona tiene sobrepeso");
            return 1;
    }
    public boolean isAdult(){
        boolean older = false;
        if(age >= 18) older = true;return older;
    }
    //Validar bien
    private String checkSex(){
            if(this.sex == 0) return "Hombre";
            else return "Mujer";
    }
    public void generateDNI(){
        int numDNI = (int) (100000000 * Math.random());
        int rest = numDNI % 23;
        this.DNI = "" + numDNI + "" + letters[rest];
    }

    @Override
    public String toString() {
        return "Persona" + '\n' +
                "Nombre: " + name + '\n' +
                "Edad: "     + age + '\n' +
                "DNI: "     + DNI + '\n' +
                "Sexo: "    + sex + '\n' +
                "Peso:"    + weight+ '\n' +
                "Altura: "   + height;
    }

    public  void viewOlderAge(Person p){
        if (p.isAdult()) System.out.println("La persona es mayor de edad");
        else System.out.println("La persona no es mayor de edad");

    }


}
