package RKrivenko;
import RKrivenko.Animal;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    enum Command { ADD, LIST, EXIT }

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.setAge(20);
        animal.setName("Муся");
        animal.setColor("серая в полоску");
        animal.setWeight(3);

        System.out.println(animal.toString());

        Animal cat = new Cat();
        Animal dog = new Dog();
        Animal duck = new Duck();
        Duck myduck = new Duck();

        cat.say();
        dog.say();
        duck.say();
        myduck.fly();

        ArrayList<Animal> animals = new ArrayList<>();

        Scanner s = new Scanner(System.in);
        Command menuItem = Command.ADD;

        while (!menuItem.equals(Command.EXIT)){
            System.out.println("Add - добавить");
            System.out.println("List - печать");
            System.out.println("Exit - выход");
            menuItem = Command.valueOf(s.nextLine().toUpperCase().trim()) ;

            switch (menuItem){
                case ADD:
                    System.out.println("Какое у вас животное?" + "dog/cat/duck");
                    String str = s.nextLine().toUpperCase().trim();
                    switch (str){
                        case "DOG":
                            Dog adddog = new Dog();
                            System.out.println("Имя собаки?");
                            adddog.setName(s.nextLine());
                            System.out.println("Возраст собаки?");
                            adddog.setAge(Integer.parseInt(s.nextLine()));
                            System.out.println("Вес собаки?");
                            adddog.setWeight(Integer.parseInt(s.nextLine()));
                            System.out.println("Цвет собаки?");
                            adddog.setColor(s.nextLine());
                            adddog.say();
                            animals.add(adddog);
                            break;
                        case "CAT":
                            Cat addcat = new Cat();
                            System.out.println("Имя кошки?");
                            addcat.setName(s.nextLine());
                            System.out.println("Возраст кошки?");
                            addcat.setAge(Integer.parseInt(s.nextLine()));
                            System.out.println("Вес кошки?");
                            addcat.setWeight(Integer.parseInt(s.nextLine()));
                            System.out.println("Цвет кошки?");
                            addcat.setColor(s.nextLine());
                            addcat.say();
                            animals.add(addcat);
                            break;
                        case "DUCK":
                            Duck addduck = new Duck();
                            System.out.println("Имя утки?");
                            addduck.setName(s.nextLine());
                            System.out.println("Возраст утки?");
                            addduck.setAge(Integer.parseInt(s.nextLine()));
                            System.out.println("Вес утки?");
                            addduck.setWeight(Integer.parseInt(s.nextLine()));
                            System.out.println("Цвет утки?");
                            addduck.setColor(s.nextLine());
                            addduck.say();
                            animals.add(addduck);
                            break;

                        default:
                            System.out.println("Ошибка, попробуйте снова!");

                    }



                    break;

                case EXIT:
                    System.out.println("Пока!");
                    break;

                case LIST:
                    for (Animal item: animals)
                        System.out.println(item.toString());
            }
        }

    }

}
