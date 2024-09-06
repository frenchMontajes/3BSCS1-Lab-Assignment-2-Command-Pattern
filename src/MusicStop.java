public class MusicStop implements Command{
    private MusicPlayer music;

    public MusicStop(MusicPlayer music){
        this.music = music;
    }
    @Override
    public String execute() {
        return music.MusicStop();
    }
}
