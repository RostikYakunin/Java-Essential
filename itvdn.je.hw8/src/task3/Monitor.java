package task3;
    /*
    Смотреть задание 2.
    В обоих классах переопределить метод toString, что бы вывод был следующим:
    Device: manufacturer =Samsung, price=120, serialNumber=AB1234567CD
    Monitor: manufacturer =Samsung, price=120, serialNumber=AB1234567CD, X=1280,Y=1024
     */

import task2.Device;

public class Monitor extends Device {
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

    @Override
    public String toString() {
        return "Monitor{" + "manufacturer='" + super.getManufacturer() +
                '\'' + ", price=" + super.getPrice() +
                ", serialNumber='" + super.getSerialNumber() + '\'' +
                ", resolutionX=" + resolutionX +
                ", resolutionY=" + resolutionY +
                '}';
    }
}
