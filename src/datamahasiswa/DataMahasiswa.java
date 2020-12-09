package datamahasiswa;
import java.util.ArrayList;
import java.util.Scanner;

public class DataMahasiswa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Mahasiswa> data = new ArrayList<>();
        
        while (true){
            System.out.println("Data Mahasiswa");
            System.out.println("1. Lihat Data");
            System.out.println("2. Tambah Data");
            System.out.println("3. Cari Data");
            System.out.println("4. Hapus Data");
            System.out.println("5. Exit");
            System.out.print("Menu : ");
            
            int menu = input.nextInt();
            input.nextLine();
            if (menu == 1){
                if (data.isEmpty()){
                    System.out.println("Data Kosong");
                } else {
                    data.forEach((n) -> System.out.println(n.nim + " - "+ n.nama + " - " + n.tglLahirStr + " - " + n.genderStr)); 
                }
            } else if (menu == 2){
                System.out.print("NIM : ");
                String nim = input.nextLine();
                System.out.print("Nama : ");
                String nama = input.nextLine();
                System.out.print("Tanggal Lahir (dd/mm/yyyy): ");
                String tgl = input.nextLine();
                System.out.print("Gender (Masukan 0 untuk Pria, 1 untuk Wanita) : ");
                int gender = input.nextInt();
                data.add(new Mahasiswa(nim,nama,tgl,gender));
            } else if (menu == 3){
                System.out.println("1. Berdasarkan NIM");
                System.out.println("2. Berdasarkan Gender");
                int filter = input.nextInt();
                input.nextLine();
                ArrayList<Mahasiswa> filterd_data = new ArrayList<>(data);
                if (filter == 1){
                    System.out.print("NIM : ");
                    String nim = input.nextLine();
                    filterd_data.removeIf(t -> !t.nim.equals(nim));
                } else if(filter == 2){
                    System.out.print("Gender (Masukan 0 untuk Pria, 1 untuk Wanita) : ");
                    int gender = input.nextInt();
                    filterd_data.removeIf(t -> t.gender != gender);
                }
                
                
                if (filterd_data.isEmpty()){
                    System.out.println("Tidak Ditemukan");
                } else {
                    filterd_data.forEach((n) -> System.out.println(n.nim + " - "+ n.nama + " - " + n.tglLahirStr + " - " + n.genderStr)); 
                }
            } else if (menu == 4){
                System.out.print("NIM : ");
                String nim = input.nextLine();
                data.removeIf(t -> t.nim.equals(nim));
            } else if (menu == 5){
                System.exit(0);
            }
            System.out.println("");
        }
    }
    
}
