package gmb05_lab01;

/**
 * Класс "Человек2" с дополнительными методами
 *
 * @author Admin
 */
public class Human2 {

    private int age;
    private String name;
    private boolean isMan;
    private int weight;
    private int height;

    /**
     * Это конструктор по-умолчанию (без параметров)
     */
    public Human2() {
        age = -1;
        name = "???";
        isMan = true;
        weight = -1;
        height = -1;
    }

    /**
     * Это конструктор c 2 параметрами.Сигнатура метода: СТРОКА, ЛОГИЧЕСКОЕ
     *
     * @param name имя
     * @param isMan мужчина?
     */
    public Human2(String name, boolean isMan) {
        this.age = -1;
        this.name = name;
        this.isMan = isMan;
    }

    /**
     * Это конструктор c 3 параметрами.Сигнатура метода: ЦЕЛОЕ, СТРОКА,
     * ЛОГИЧЕСКОЕ
     *
     * @param age возраст
     * @param name имя
     * @param isMan мужчина?
     */
    public Human2(int age, String name, boolean isMan) {
        this.age = age;
        this.name = name;
        this.isMan = isMan;
    }

    /**
     * Это конструктор c 3 параметрами.Сигнатура метода: ЦЕЛОЕ, ЦЕЛОЕ, ЦЕЛОЕ
     *
     * @param age возраст
     * @param weight вес
     * @param height рост
     */
    public Human2(int age, int weight, int height) {
        this.age = age;
        this.name = "???";
        this.isMan = true;
        this.weight = weight;
        this.height = height;
    }

    /**
     * Это конструктор c 5 параметрами.Сигнатура метода: ЦЕЛОЕ, СТРОКА,
     * ЛОГИЧЕСКОЕ, ЦЕЛОЕ, ЦЕЛОЕ
     *
     * @param age возраст
     * @param name имя
     * @param isMan мужчина?
     * @param weight вес
     * @param height рост
     */
    public Human2(int age, String name, boolean isMan, int weight, int height) {
        this.age = age;
        this.name = name;
        this.isMan = isMan;
        this.weight = weight;
        this.height = height;
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
     * @return имя
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
     * Геттер (получатель значения) для поля "weight"
     * @return вес
     */
    public int getWeight() {
        return weight;
    }

    /**
     * Сеттер (установщик значения) для поля "weight"
     * @param weight вес
     */
    public void setWeight(int weight) {
        this.weight = weight;
    }

    /**
     * Геттер (получатель значения) для поля "height"
     * @return рост
     */
    public int getHeight() {
        return height;
    }

    /**
     * Сеттер (установщик значения) для поля "height"
     * @param height рост
     */
    public void setHeight(int height) {
        this.height = height;
    }

    /**
     * Метод для распечатки объекта этого класса в виде строки
     *
     * @return строка-представление объекта этого класса
     */
    @Override
    public String toString() {
        return "Human2{" + "age=" + age + ", name=" + name + ", isMan=" + isMan + ", weight=" + weight + ", height=" + height + '}';
    }

}
