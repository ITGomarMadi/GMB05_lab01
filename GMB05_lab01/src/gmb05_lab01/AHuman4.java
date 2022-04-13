package gmb05_lab01;

/**
 * Абстрактный класс "Человек 4". Этот класс является наследником класса-предка
 * "Human2" и также должен реализовать интерфейс "IAddress"
 *
 * @author Admin
 */
public abstract class AHuman4 extends Human2 implements IAddress {

    /**
     * Поле "Зарплата"
     */
    private int salary;

    /**
     * Это конструктор по-умолчанию.
     */
    public AHuman4() {
        salary = 0;
    }

    /**
     * Геттер (получатель значения) для поля "salary"
     * @return зарплата
     */
    public int getSalary() {
        return salary;
    }

    /**
     * Сеттер (установщик значения) для поля "salary"
     * @param salary зарплата
     */
    public void setSalary(int salary) {
        this.salary = salary;
    }

    /**
     * Реализация метода из интерфейса "IAddress"
     * @return адрес
     */
    @Override
    public String getADDRESS() {
        return "Каирбаева 45";
    }

    /**
     * Объявление абстрактного метода для вывода зарплаты
     * @return вывод зарплаты
     */
    public abstract String outSalary();

}
