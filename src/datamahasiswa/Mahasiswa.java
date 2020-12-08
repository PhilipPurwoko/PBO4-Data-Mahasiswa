package datamahasiswa;
import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
        
public class Mahasiswa {
    String nim,nama,tglLahirStr,genderStr;
    Date tglLahir;
    int gender;
    
    /*
    - nim : String
    - nama : String
    - tglLahir : Date
    - gender : int (0: Laki-laki, 1: Perempuan)
    */
    
    public Mahasiswa(String nim, String nama, String date, int gender){
        this.nim = nim;
        this.nama = nama;
        this.tglLahirStr = date;
        try {
            this.tglLahir = new SimpleDateFormat("dd/MM/yyyy").parse(date);
        } catch (ParseException ex) {
            Logger.getLogger(Mahasiswa.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.gender = gender;
        this.genderStr = (gender == 0) ? "Laki - laki" : "Perempuan";
    }
}
