package task3;
    /*
    Смотреть задание 2.
    В обоих классах переопределить метод toString, что бы вывод был следующим:
    Device: manufacturer =Samsung, price=120, serialNumber=AB1234567CD
    Monitor: manufacturer =Samsung, price=120, serialNumber=AB1234567CD, X=1280,Y=1024
     */

import task2.Device;

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
        return "EthernetAdapter{" +
                "speed=" + speed +
                ", mac='" + mac + '\'' +
                '}';
    }
}
