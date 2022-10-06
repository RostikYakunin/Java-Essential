package task3;

    /*
    Смотреть задание 2.
    В обоих классах переопределить метод toString, что бы вывод был следующим:
    Device: manufacturer =Samsung, price=120, serialNumber=AB1234567CD
    Monitor: manufacturer =Samsung, price=120, serialNumber=AB1234567CD, X=1280,Y=1024
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

    @Override
    public String toString() {
        return "Device{" +
                "manufacturer='" + manufacturer + '\'' +
                ", price=" + price +
                ", serialNumber='" + serialNumber + '\'' +
                '}';
    }
}
