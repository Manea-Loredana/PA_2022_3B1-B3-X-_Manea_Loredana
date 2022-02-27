import java.util.Objects;

public class LectureHall extends Room {
    private boolean videoProjector;

    public boolean isVideoProjector() {
        return videoProjector;
    }

    public void setVideoProjector(boolean videoProjector) {
        this.videoProjector = videoProjector;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LectureHall that)) return false;
        if (!super.equals(o)) return false;
        return isVideoProjector() == that.isVideoProjector();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), isVideoProjector());
    }
}



