public class Myclass {
    String name;
    String surname;
    int age;
    String food;
    String[] lessons = {"Oop", "constructor", "array"};

    public Myclass() {

    }

    public Myclass(String name, String surname, int age, String[] lessons1) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.lessons = lessons1;
    }

    public Myclass(String name, String surname, int age, String food, String[] lessons) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.food = food;
        this.lessons = lessons;


    }


}
