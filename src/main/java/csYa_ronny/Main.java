package csYa_ronny;

public class Main {
    public static void main(String[] args) {
        Person tch1 = new Person("shem", "121212",2);

        Kita k1 = new Kita(tch1, "ya1",30);
        System.out.println(k1.addStudent(tch1));

    }
}