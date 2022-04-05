import javax.swing.*;

public class ConfigPanel extends JPanel {
    final MainFrame frame;
    JLabel label;
    JSpinner spinner;
    JSpinner row;
    JSpinner col;


    public ConfigPanel(MainFrame frame) {
        this.frame = frame;
        init();
    }
    private void init() {
        //create the label and the spinner
        label = new Jlabel("Grid size:");
        spinner = new JSpinner(new SpinnerNumberModel(10, 2, 100, 1));
        row = new JSpinner(new SpinnerListModel());
        col = new JSpinner(new SpinnerListModel());
        //create spinners for rows and cols, and the button

        add(label); //JPanel uses FlowLayout by default
        add(spinner);
    }

    public JSpinner getRows() {
        return row;
    }

    public JSpinner getCols() {
        return col;
    }


    private class Jlabel extends JLabel {
        public Jlabel(String s) {
        }
    }
}
