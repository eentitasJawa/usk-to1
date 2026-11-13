import javax.swing.JOptionPane;

public class no3 {
    public static void main (String[] args){
        int nilai1 = Integer.parseInt(
            JOptionPane.showInputDialog("masukan nilai 1 ")
        );
        int nilai2 = Integer.parseInt(
            JOptionPane.showInputDialog("masukan nilai 2 ")
        );
        int nilai3 = Integer.parseInt(
            JOptionPane.showInputDialog("masukan nilai 3 ")
        );
        
        double avg = (nilai1 + nilai2 + nilai3)/3;

        String hasil;

        if(avg >= 60){
            hasil = "Lulus";
        } else{
            hasil = "tidak lulus";
        }

        String rata = Double.toString(avg);
        rata+= "0";
        
        JOptionPane.showMessageDialog(null,
            "Rata -Rata" +  rata +  
            "\nKeterangan :" + hasil );
    }

    
}
