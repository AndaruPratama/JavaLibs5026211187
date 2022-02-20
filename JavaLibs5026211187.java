import javax.swing.*;
import java.awt.*;

public class JavaLibs5026211187 {
    public static void main(String[] args) {

        String Nama, Hewan, Hewan1, Makanan, Game, Askot, Diskon, HargaMin, HargaMaks;
        int IntHargaMin, IntHargaMaks;
        double HitungDiskon, douDiskon;

        String[] options = new String[]{"Mau","Emm, nggak"};
        int introInt = JOptionPane.showOptionDialog(null, "Halo orang baik! Apakah kau mau membantuku membuat sebuah cerita?", "ALERT!!!", 0, 2, null, options, options[0]);
        if (introInt != 0 ){
            JOptionPane.showMessageDialog(null, "Oke kalau begitu, sampai jumpa","Yah ditolak :(",2);
            System.exit(0);
        };

        Nama = (String)JOptionPane.showInputDialog((Component) null, "Siapa nama kamu?", "Cerita Untukmu", 3, (Icon)null, (Object[])null, "" );

        Askot = (String)JOptionPane.showInputDialog((Component) null, "Darimana asalmu?", "Cerita Untukmu", 3, (Icon) null, (Object[]) null, "");

        Hewan = (String)JOptionPane.showInputDialog((Component) null, "Apa hewan kesukaan kamu?", "Cerita Untukmu", 3, (Icon)null, (Object[])null, "" );

        Hewan1 = (String)JOptionPane.showInputDialog((Component) null, "Akan kamu beri nama siapa " +Hewan + " itu?", "Cerita Untukmu", 3, (Icon)null, (Object[])null, "" );

        Makanan = (String)JOptionPane.showInputDialog((Component) null, "Apa makanan kesukaan kamu?", "Cerita Untukmu", 3, (Icon)null, (Object[])null, "" );

        Game = (String)JOptionPane.showInputDialog((Component) null, "Jika kamu sedang berkumpul dengan teman-temanmu, permainan apa yang biasanya kamu lakukan?", "Cerita Untukmu", 3, (Icon)null, (Object[])null, "" );

        HargaMin = (String)JOptionPane.showInputDialog((Component) null, "Berapa minimal harga makanan kamu setiap harinya? (dalam rupiah)", "Cerita Untukmu", 3, (Icon)null, (Object[])null, "" );

        HargaMaks = (String)JOptionPane.showInputDialog((Component) null, "Berapa maksimal harga makanan kamu setiap harinya? (dalam rupiah)", "Cerita Untukmu", 3, (Icon)null, (Object[])null, "" );

        Diskon = (String)JOptionPane.showInputDialog((Component) null, "Pilih angka yang kamu suka mulai dari 1-9!", "Cerita Untukmu", 3, (Icon)null, (Object[])null, "" );

        IntHargaMin = Integer.parseInt(HargaMin);
        IntHargaMaks = Integer.parseInt(HargaMaks);
        douDiskon = Double.parseDouble(Diskon);
        HitungDiskon = 0.001*douDiskon*IntHargaMaks;

        JOptionPane.showMessageDialog((Component) null, "Selamat! Cerita kamu sudah selesai! klik ok untuk melihatnya");

        JOptionPane.showMessageDialog((Component) null, "Pada suatu hari yang cerah di kota " +Askot+ ", Hiduplah seorang bijaksana bernama " +Nama+ ".\n Dia tinggal di rumah kecilnya " +
                "yang aman dan damai. Tinggal bersamanya seekor " +Hewan+ " yang lucu, " +Nama+ " memberinya nama " +Hewan1+ ".\n Nama yang sangat bagus untuk seekor " +Hewan+
                "." +Nama+ " sangat menyukai " +Game+ ". Dia biasa bermain " +Game+ " bersama teman-temannya.\nSetiap hari " +Nama+ " habiskan untuk bermain" +
                " serta makan " +Makanan+ " favoritnya.\n" +Nama+ " tidak keberatan karena dia selalu mendapat diskon sebesar " +Diskon+ "% setiap harinya\n sehingga dia hanya perlu membayar" +
                " sebesar " +HitungDiskon+ " dolar saja. Sungguh bahagia hidup " +Nama+ "." );

        JOptionPane.showMessageDialog((Component) null, "Terimakasih karena sudah mau berpartisipasi!", "Terimakasih", 2);
        JOptionPane.showMessageDialog((Component) null, "Ikan pari makan sapi\nSampai Jumpa lagi! Dadaah", "Dadaah", 2);





    }
}

