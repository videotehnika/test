package video.person;

/**
 * Created by x on 19.07.2016.
 */
public class Program {
    public static void main(String[] args) {
    System.out.println (Person.count);
        Person p = new Person("Ivan", 5);
        p.show();
        Person p2 = new Person(17);
p2.show();
        System.out.println (Person.count);

    }
}
