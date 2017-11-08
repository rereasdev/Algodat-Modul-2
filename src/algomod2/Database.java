
package algomod2;

import java.util.LinkedList;
import java.util.Scanner;

public class Database {
    
    LinkedList<DataTlp> pb = new LinkedList<>();
    Scanner scan = new Scanner(System.in);
    
    public void Tambah(){
        System.out.println("Masukkan jumlah kontak yang akan di masukkan");
        int a = scan.nextInt();
        scan.nextLine();
        for (int i = 0; i < a; i++){
            System.out.print("Masukkan Nama : ");

            String nama = scan.nextLine();
            
            System.out.print("Masukkan Alamat : ");
            String alamat = scan.nextLine();

            System.out.println("Masukkan nomor tlp (masukkan 0 bila tidak ada)");
            System.out.print("1. Rumah : ");
            String noRum = scan.nextLine();
            if(noRum.matches("[0-9]*")){
                System.out.print("2. No HP : ");
                String noHP = scan.nextLine();
                if(noHP.matches("[0-9]*")){
                    pb.add(new DataTlp(nama, alamat, noRum, noHP));
                }
                else{
                    System.out.println("No. hp harus Angka!");
                    System.out.println("Data gagal di masukkan");
                }     
            }
            else{
                System.out.println("No. Rumah harus Angka!");
                System.out.println("Data gagal di masukkan");
            }
        }
    }
    public void Tampil(){
        for(DataTlp a: pb){
            System.out.print(pb.indexOf(a));
            System.out.println("  Nama :\t\t"+a.getNama());
            System.out.println("   Alamat :\t"+a.getAlamat());
            System.out.println("   No HP :\t\t"+a.getNoHP());
            System.out.println("   No Rumah :\t"+a.getNoRum());
            
        }
    }
    
    public void Hapus(){
        Tampil();
        try{
            System.out.println("Masukkan index yang akan di hapus");
            int a = scan.nextInt();
            if(a<pb.size()){
                pb.remove(a);
            }
            else{
                System.out.println("index tidak ada, coba masukkan lagi");
            }
        }
        catch(java.util.InputMismatchException a){
            System.out.println("Masukkan angka!");
        }
    }
}
