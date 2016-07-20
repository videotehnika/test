package video.person;
/** Created */
 public class Person
{
        public String name;
        public int age;
public static int count = 0;
    static
    {
        System.out.println ("Расчет количества сотрудников");
        count = 0;
    }
    public Person(String name, int age)
{
    this.name = name;
    this.age = age;
    count++;
}
    public Person(int age)
    {
        this("New Person", age);

    }
        public void show() {
            System.out.printf("%s - %d лет\n", name, age);
        }
}
