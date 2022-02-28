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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Room room)) return false;
        return getName().equals(room.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }

    @Override
    public String toString() {
        return getName() + " (" + " cap=" + getCap() + "," + "lecture hall" + "," + "Video projector" + ":" + isVideoProjector() + ")";
    }
}



