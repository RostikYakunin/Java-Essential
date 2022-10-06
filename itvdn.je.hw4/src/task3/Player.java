package task3;

public class Player implements Playable, Recodable{
    public void play() {
        System.out.println("Something play");
    }
    public void pause(){
        System.out.println("Pause");
    }
    public void stop(){
        System.out.println("Stop play");
    }
    public void record(){
        System.out.println("Start recording");
    }
}
