import java.util.Objects;

public class ComputerLab extends Room {
    private String so;

    public ComputerLab(String name, int cap, String so) {
        super(name, cap);
        this.so = so;
    }

    public String getSo() {
        return so;
    }

    public void setSo(String so) {
        this.so = so;
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
        return getName() + " (" + " cap=" + getCap() + "," + "lab" + "," + "Operating system " + ":" + getSo() + ")";
    }

}
