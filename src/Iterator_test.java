
import java.util.*;

public class Iterator_test {
    public static void main(String[] args) {
        /**
         * Iterator : objek yang bisa dipake buat loop sama kayak Arraylist dan hashset dia disebut iterator karena nama teknik dari loop
         */
        ArrayList<String> Nama_siswa = new  ArrayList<String>();
            Nama_siswa.add("Nabila");
            Nama_siswa.add("Amel");
            Nama_siswa.add("Syafiya");
            Nama_siswa.add("Laras");
            Nama_siswa.add("Bagus");
            Nama_siswa.add("Rakha");
            Nama_siswa.add("Dimas");


            // Ini Iterator
            Iterator<String> Loop_nama = Nama_siswa.iterator();
            // Ini akan mengeluarkan item pertama (Nabila)
            System.out.println(Loop_nama.next());


            // kita coba loop
            // dia akan mengeluarkan item yang ada di arraylist, menariknya jika terdapat item doble dia akan mengeluarkan hanya 1 kali (Tidak double)
            while(Loop_nama.hasNext()){
                System.out.println(Loop_nama.next());
            }

            // kita bisa remove item dari daftarnya koleksinya dengan mengunakan method remove(), method bisa dipake dari koleksi yanga ada while loopnya

            ArrayList<Integer> Angka = new ArrayList<>();
             Angka.add(13);
             Angka.add(8);
             Angka.add(9);
             Angka.add(17);

             Iterator<Integer> it = Angka.iterator();
             while(it.hasNext()){
                 Integer i = it.next();
                 if(i < 10){
                     it.remove();
                 }
             }
             System.out.println(Angka);
    }
}
