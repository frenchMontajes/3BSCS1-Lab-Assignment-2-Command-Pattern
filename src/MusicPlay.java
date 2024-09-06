public class MusicPlay implements Command{
    private MusicPlayer music;

    public MusicPlay(MusicPlayer music){
        this.music = music;
    }
    @Override
    public String execute() {
        return music.MusicPlay();
    }
}
