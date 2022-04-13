package gmb05_lab01;

/**
 * Класс с именем "Человек"
 *
 * @author Admin
 */
public class Human {

    /**
     * Поле "Возраст"
     */
    private int age;
    /**
     * Поле "имя"
     */
    private String name;
    /**
     * Поле "Мужчина?"
     */
    private boolean isMan;

    /**
     * Это конструктор по умолчанию (без параметров)
     */
    public Human() {
        age = -1;
        name = "???";
        isMan = true;
    }

    /**
     * Это конструктор с параметрами. Сигнатура метода: СТРОКА, ЛОГИЧЕСКОЕ
     *
     * @param name имя
     * @param isMan мужчина?
     */
    public Human(String name, boolean isMan) {
        this.age = -1;
        this.name = name;
        this.isMan = isMan;
    }

    /**
     * Это конструктор с 3 параметрами. Сигнатура метода: ЦЕЛОЕ, СТРОКА,
     * ЛОГИЧЕСКОЕ
     *
     * @param age возраст
     * @param name имя
     * @param isMan мужчина?
     */
    public Human(int age, String name, boolean isMan) {
        this.age = age;
        this.name = name;
        this.isMan = isMan;
    }

    /**
     * Геттер (получатель значения) для поля "age"
     *
     * @return возраст
     */
    public int getAge() {
        return age;
    }

    /**
     * Сеттер (установщик значения) для поля "age"
     *
     * @param age возраст
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Геттер (получатель значения) для поля "name"
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * Сеттер (установщик значения) для поля "name"
     *
     * @param name имя
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Геттер (получатель значения) для поля "isMan"
     *
     * @return мужчина - true, женщина - false
     */
    public boolean isIsMan() {
        return isMan;
    }

    /**
     * Сеттер (установщик значения) для поля "isMan"
     *
     * @param isMan мужчина - true, женщина - false
     */
    public void setIsMan(boolean isMan) {
        this.isMan = isMan;
    }

    /**
     * Метод для распечатки объекта этого класса в виде строки
     *
     * @return строка-представление объекта этого класса
     */
    @Override
    public String toString() {
        return "Human{" + "age=" + age + ", name=" + name + ", isMan=" + isMan + '}';
    }
}
