import javax.swing.JOptionPane;
public class no4 {
    public static void main(String[] args) {
        int nilai1 = Integer.parseInt(
            JOptionPane.showInputDialog("Masukan Nilai 1: ")
        );
        int nilai2 = Integer.parseInt(
            JOptionPane.showInputDialog("Masukan Nilai 2: ")
        );
        int nilai3 = Integer.parseInt(
            JOptionPane.showInputDialog("Masukan Nilai 3: ")
        );

        int hasil = nilai1 * nilai2;
        int bagi = nilai3 / nilai2;

        JOptionPane.showMessageDialog(null, 
            "Nilai 1 = " + nilai1 +
            "\nNilai 2 = " + nilai2 +
            "\nNilai 3 = " + nilai3 +
            "\nHasil = " + hasil +
            "\nPembagian = " + bagi
        );
    }   
}
