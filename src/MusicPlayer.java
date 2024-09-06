public class MusicPlayer {
    int vol = 1;
    public String IncreaseMusicVol(){
        return "Increasing Music Volume " + ++vol;
    }

    public String DecreaseMusicVol(){
        return "Decreasing Music Volume " + --vol;
    }

    public String MusicPlay(){
        return "Music is playing";
    }
    public String MusicStop(){
        return "Music has been paused";
    }
}
