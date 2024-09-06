public class IncreaseMusicVol implements Command{
    private MusicPlayer music;

    public IncreaseMusicVol(MusicPlayer music){
        this.music = music;
    }
    @Override
    public String execute() {
        return music.IncreaseMusicVol();
    }
}
