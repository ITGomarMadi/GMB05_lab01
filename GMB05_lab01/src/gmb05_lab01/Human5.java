package gmb05_lab01;

/**
 * Класс "Человек5" этот класс наследник абстрактного класса "AHuman4"
 *
 * @author Admin
 */
public class Human5 extends AHuman4 {

    /**
     * Метод вывода зарплаты
     * @return вывод зарплаты
     */
    @Override
    public String outSalary() {
        if (getSalary() > 200000) {
            return "Хорошо зарабатываешь";
        } else {
            return "Отправляйся на работу";
        }
    }

}
