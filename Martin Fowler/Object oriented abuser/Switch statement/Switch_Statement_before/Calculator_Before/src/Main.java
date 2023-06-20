import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean loop = true;
        while(loop){
            System.out.println("CALCULATOR");
            System.out.println("----------");
            System.out.println("Keterangan:");
            System.out.println("a adalah angka didepan");
            System.out.println("b adalah angka dibelakang");
            System.out.println("Sehingga jika ingin pembagian akan jadi a / b");
            System.out.println("----------");
            Scanner scan = new Scanner(System.in);

            System.out.print("Masukkan nilai a: ");
                Integer a = scan.nextInt(); scan.nextLine();
            System.out.print("Masukkan nilai b: ");
                Integer b = scan.nextInt(); scan.nextLine();

            System.out.print("Pilih Operasi yang ingin dilakukan [tambah | kurang | kali | bagi | quit (untuk keluar)] : ");
                String operasi = scan.nextLine();

//          Ini bukan code smell. ini factory (if else yang memang harus ada).
            switch(operasi) {
                case "bagi":
                    Pembagian bagi = new Pembagian(a, b);

                    printPilihanOperasi(bagi);
                    bagi.perform();
                    break;
                case "kali":
                    Perkalian kali = new Perkalian(a, b);

                    printPilihanOperasi(kali);
                    kali.perform();
                    break;
                case "tambah":
                    Pertambahan tambah = new Pertambahan(a, b);

                    printPilihanOperasi(tambah);
                    tambah.perform();
                    break;
                case "kurang":
                    Pengurangan kurang = new Pengurangan(a, b);

                    printPilihanOperasi(kurang);
                    kurang.perform();
                    break;
                case "quit":
                    loop = false;
                    break;
            }


            System.out.print("Press enter to continue");
            scan.nextLine();

            System.out.println();
            System.out.println();
        }
     }

//  code smell
    public static void printPilihanOperasi (Operation operasi){
        if(operasi instanceof Pembagian){
            System.out.print("Anda memilih Pembagian dan hasilnya adalah ");
        } else if (operasi instanceof Perkalian) {
            System.out.print("Anda memilih Perkalian dan hasilnya adalah ");
        } else if (operasi instanceof Pertambahan) {
            System.out.print("Anda memilih Pertambahan dan hasilnya adalah ");
        } else if (operasi instanceof Pengurangan) {
            System.out.print("Anda memilih Pengurangan dan hasilnya adalah ");
        }

    }
}
