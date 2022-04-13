package gmb05_lab01;

/**
 * Класс "Человек3" в котором реализуется интерфейс "IAddress"
 * @author Admin
 */
public class Human3 implements IAddress {

    /**
     * Геттер (получатель значения) для поля "ADDRESS"
     * @return 
     */
    @Override
    public String getADDRESS() {
        return "Ломова 53";
    }

}
