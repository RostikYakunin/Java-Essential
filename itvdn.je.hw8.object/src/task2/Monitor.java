package task2;
    /*
    Создать классы:
    1) Основной класс Device (manufacturer(String),
    price(float), serialNumber(String));
    2) Сабкалсс Monitor (resolutionX(int), resolutionY(int)) and
    EthernetAdapter (speed (int), mac (String));
    Добавить методы доступа. Конструктор.
     */

public class Monitor extends Device{
    private int resolutionX;
    private int resolutionY;

    public int getResolutionX() {
        return resolutionX;
    }

    public void setResolutionX(int resolutionX) {
        this.resolutionX = resolutionX;
    }

    public int getResolutionY() {
        return resolutionY;
    }

    public void setResolutionY(int resolutionY) {
        this.resolutionY = resolutionY;
    }

    public Monitor(String manufacturer, int price, String serialNumber, int resolutionX, int resolutionY) {
        super(manufacturer, price, serialNumber);
        this.resolutionX = resolutionX;
        this.resolutionY = resolutionY;
    }
}
