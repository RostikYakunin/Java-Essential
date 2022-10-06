package task4;
    /*
    Смотреть задание 2. Переопределить методы equals & hashCode в каждом классе.
    Создать класс Main, в котором создать объекты классов и продемонстрировать переопределенные методы.
     */

import java.util.Objects;

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

    @Override
    public String toString() {
        return "EthernetAdapter{" + "manufacturer='" + super.getManufacturer() +
                '\'' + ", price=" + super.getPrice() +
                ", serialNumber='" + super.getSerialNumber() + '\'' +
                ", speed=" + speed +
                ", mac='" + mac + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EthernetAdapter that = (EthernetAdapter) o;
        return speed == that.speed && mac.equals(that.mac);
    }

    @Override
    public int hashCode() {
        return Objects.hash(speed, mac);
    }
}
