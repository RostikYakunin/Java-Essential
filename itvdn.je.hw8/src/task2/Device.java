package task2;

    /*
    Создать классы:
    1) Основной класс Device (manufacturer(String),
    price(float), serialNumber(String));
    2) Сабкалсс Monitor (resolutionX(int), resolutionY(int)) and
    EthernetAdapter (speed (int),
    mac (String)); Добавить методы доступа. Конструктор.
     */

public class Device {

    private String manufacturer;
    private int price;
    private String serialNumber;

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public Device(String manufacturer, int price, String serialNumber) {
        this.manufacturer = manufacturer;
        this.price = price;
        this.serialNumber = serialNumber;
    }
}
