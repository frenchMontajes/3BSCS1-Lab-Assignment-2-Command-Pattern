public class DecreaseMusicVol implements Command{
    private MusicPlayer music;

    public DecreaseMusicVol(MusicPlayer music){
        this.music = music;
    }
    @Override
    public String execute() {
        return music.DecreaseMusicVol();
    }
}
