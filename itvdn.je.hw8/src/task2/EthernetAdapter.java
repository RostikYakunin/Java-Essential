package task2;
    /*
    Создать классы:
    1) Основной класс Device (manufacturer(String),
    price(float), serialNumber(String));
    2) Сабкалсс Monitor (resolutionX(int), resolutionY(int)) and
    EthernetAdapter (speed (int), mac (String));
    Добавить методы доступа. Конструктор.
     */

public class EthernetAdapter extends Device {
    private int speed;
    private String mac;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public EthernetAdapter(String manufacturer, int price, String serialNumber, int speed, String mac) {
        super(manufacturer, price, serialNumber);
        this.speed = speed;
        this.mac = mac;
    }
}
