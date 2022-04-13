package gmb05_lab01;

/**
 * Основной класс программы для ее запуска на выполнение
 *
 * @author Admin
 */
public class GMB05_lab01 {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Human slava = new Human();
        slava.setAge(16);
        slava.setName("Slava");
        slava.setIsMan(true);

        System.out.println(slava.getAge());
        System.out.println(slava.getName());
        System.out.println(slava.isIsMan());

        System.out.println(slava);

        Human andrei = new Human();
        andrei.setName("Andrei");
        System.out.println(andrei);

        Human arman = new Human("Arman", true);
        System.out.println(arman);

        Human sasha = new Human(25, "Sasha", false);
        System.out.println(sasha);

        Human2 ilya = new Human2();
        System.out.println(ilya);

        Human2 kirill = new Human2(54, 85, 189);
        System.out.println(kirill);

        Human2 madi = new Human2(19, "Madi", true, 65, 170);
        System.out.println(madi);

        IAddress masha = new Human3();
        System.out.println(masha.getADDRESS());

        AHuman4 aziz = new AHuman4() {
            @Override
            public String outSalary() {
                if (getSalary() > 200000) {
                    return "Хорошо зарабатываешь";
                } else {
                    return "Отправляйся на работу";
                }
            }
        };

        aziz.setSalary(250000);
        System.out.println(aziz.getSalary());
        System.out.println(aziz.outSalary());
        System.out.println(aziz.getADDRESS());

        Human5 daniar = new Human5();
        System.out.println(daniar.outSalary());
    }
}
