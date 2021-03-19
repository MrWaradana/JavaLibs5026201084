import javax.swing.*;

public class JavaLibs5026201084 {

    public static void main(String[] args) {
	String inputNama = (String) JOptionPane.showInputDialog("Masukkan namamu"); //input1
	int inputUmur = Integer.parseInt(JOptionPane.showInputDialog("Masukkan umurmu"));//input2
	double inputMath = Double.parseDouble(JOptionPane.showInputDialog("2.5 + 5 ="));//input3
    	JOptionPane.showMessageDialog(null, "Oke, sekarang aku udah tau namamu " + inputNama + ".\n"
                                   + "Umurmu " + inputUmur + " tahun.\n"
                                   + "Kamu menjawab 2.5 + 5 dengan jawaban " + inputMath + ".", "Sedikit tentang kamu",1); //Cerita Pendek
 	  int inputMath2 = Integer.parseInt( JOptionPane.showInputDialog("5 + 5 = ")); //input4
   	double inputDouble = Double.parseDouble( JOptionPane.showInputDialog("Pilih angka dari 0 - 1,\n cth: 0.5")); //input5
  	  String inputWarna = (String) JOptionPane.showInputDialog("Warna kesukaanmu apa?"); //input6
  	  String inputAsal = (String) JOptionPane.showInputDialog("Kamu berasal dari?"); //input7
  	  String inputGender = (String) JOptionPane.showInputDialog("Kamu Cewek atau Cowok?"); //input8
	   int inputLaptop = Integer.parseInt(JOptionPane.showInputDialog("Sekarang kamu pakai berapa laptop?")); //input9
  	  double inputHalf = Double.parseDouble(JOptionPane.showInputDialog("Kalo kue dimakan setengah, sisanya tinggal berapa","double")); //input10
  	  JOptionPane.showMessageDialog(null,"Terima kasih telah menggunakan aplikasi ini. :D"); //Penutup


    }
}
