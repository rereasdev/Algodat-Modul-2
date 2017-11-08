
package algomod2;

import java.util.Scanner;

public class AlgoMod2 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        Database db = new Database();
        int mulai = 1, no;
        while(mulai == 1){
            System.out.println("\t\t =Phone Book=");
            System.out.println("1. Tambah kontak");
            System.out.println("2. Hapus kontak");
            System.out.println("3. Tampilkan kontak");
            System.out.println("4. Keluar");
            System.out.println("Masukkan Pilihan : ");
            try{    
            no = scan.nextInt();
            switch (no){
                    case 1:
                        db.Tambah();
                        break;
                    case 2:
                        db.Hapus();
                        break;
                    case 3:
                        db.Tampil();
                        break;
                    case 4:
                        mulai = 0;
                        break;
                    default :
                        System.out.println("Masukkan angka 1 - 4");
                        break;
                }
            }
            catch(java.util.InputMismatchException e){
                System.out.println("Masukkan Angka");
                mulai = 0;
            }
                
        }
    }
    
}
