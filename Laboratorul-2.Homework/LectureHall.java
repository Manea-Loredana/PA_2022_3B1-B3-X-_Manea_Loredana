import java.util.Objects;

public class LectureHall extends Room {
    private boolean videoProjector;


    public LectureHall(String name, int cap, boolean videoProjector) {
        super(name, cap);
        this.videoProjector = videoProjector;
    }

    public boolean isVideoProjector() {
        return videoProjector;
    }

    public void setVideoProjector(boolean videoProjector) {
        this.videoProjector = videoProjector;
    }


}



