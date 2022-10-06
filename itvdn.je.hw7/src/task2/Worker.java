package task2;

public class Worker {
    private String surnameInitials ;
    private String position ;
    private int ageOfStart;
    static int id = 1;

    public String getSurnameInitials() {
        return surnameInitials;
    }

    public void setSurnameInitials(String surnameInitials) {
        this.surnameInitials = surnameInitials;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getAgeOfStart() {
        return ageOfStart;
    }

    public void setAgeOfStart(int ageOfStart) {
        this.ageOfStart = ageOfStart;
    }

    public Worker(String surnameInitials, String position, int ageOfStart) {
        this.surnameInitials = surnameInitials;
        this.position = position;
        this.ageOfStart = ageOfStart;
    }

    @Override
    public String toString() {
        return "Worker{ " + "ID " + id++ +
                " surnameInitials='" + surnameInitials + '\'' +
                ", position='" + position + '\'' +
                ", ageOfStart=" + ageOfStart +
                '}';
    }
}
