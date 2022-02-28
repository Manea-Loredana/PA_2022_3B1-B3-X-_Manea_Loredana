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


}
