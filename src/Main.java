import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /**
         * Срок сдачи : 14.02.2024 / 17:00
         * MyClass деген класс тузунуз
         *
         * Ал класста озунуз жонундо маалымат сактаган полелер болсун(атыныз, фамилияныз, жашыныз, Peaksoft то катышкан сабактарыныз(массив), жакшы коргон тамагыныз)
         *
         * Параметри эки башка болгон эки конструктор тузунуз
         *
         * MyClassтын 2 объектисин тузуп, конструктор аркылуу маани бериниз
         *
         * Эки объектке эки башка конструктор иштесин.
         *
         * Объекттердин маанилерин консольго чыгарыныз
         */
        Myclass myclass = new Myclass();
        Myclass myclass1 = new Myclass("Musa", "faziloz", 18, myclass.lessons);

        System.out.println("Имя: " + myclass1.name + "\n" + "Фамилия: " + myclass1.surname + "\n" + "Возрасть: " + myclass1.age
                + "\n" + "Уроки: " + Arrays.toString(myclass1.lessons));

        System.out.println(" ");

        Myclass myclass2 = new Myclass("Kuba", "gapurov", 17, "manty", myclass1.lessons);
        System.out.println("Имя: " + myclass2.name + "\n" + "Фамилия: " + myclass2.surname + "\n" + "Возрасть: " + myclass2.age
                + "\n" + "Уроки: " + Arrays.toString(myclass2.lessons));


    }
}