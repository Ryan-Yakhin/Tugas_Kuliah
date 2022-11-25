import java.util.Scanner;
import java.util.Arrays;

public class hotel {
    public static void main(String[] args) {

        //biaya permalam kamar biasa 100k
        //biaya permalam kamar vip 200k

        Scanner input = new Scanner(System.in);

        System.out.print("Jumlah kamar : ");
        int jum = input.nextInt();

        input.nextLine();

        System.out.println("======================================================================");

        String[] penghuni = new String[jum];
        String[] jenis = new String[jum];
        int[] time = new int[jum];
        int[] temp = nomorkamar(jum);
        int total = 0;


        for(int i=0; i<jum; i++){
            System.out.print("Nama         : "); String nama = input.nextLine();nama = panjanginNama(nama);penghuni[i] = nama.toUpperCase();
            System.out.print("Jenis Kamar  : "); String kamar = input.nextLine();kamar = panjanginJenis(kamar); jenis[i] = kamar.toUpperCase();
            System.out.print("Berapa Hari  : "); String waktu = input.nextLine(); time[i] += Integer.parseInt(waktu);
            System.out.println();
        }

//        System.out.println(Arrays.toString(time));

        for(int i=0; i<jum; i++){
            if(jenis[i].equals("VIP  ")){
                time[i] *= 200000;
            }else if(jenis[i].equals("BIASA")){
                time[i] *= 100000;
            }
            total += time[i];
        }

//        System.out.println(Arrays.toString(penghuni));
//        System.out.println(Arrays.toString(jenis));
//        System.out.println(Arrays.toString(time));
//        System.out.println(total);

        System.out.println("===========================~NOTA_PEMBAYARAN~===========================");
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("No Nama\t\t\t\t\t\t\tJenis_Kamar\t\tNomor_Kamar\t\tHarga");
        System.out.println("-----------------------------------------------------------------------");

        for(int i=0; i<jum; i++){
            System.out.print((i+1) + ". " + penghuni[i] + "\t" + jenis[i] + "\t\t\t" + temp[i] + "\t\t\t\t" + time[i]);
            System.out.println();
        }

        System.out.println("-----------------------------------------------------------------------");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\tTotal : " + total);
        System.out.println("=======================================================================");

        //System.out.println(Arrays.toString(nomorkamar(jum)));
    }

    public static int[] nomorkamar(int jumlahkamar){
        int[] temp = new int[jumlahkamar];
        // define the range
        int max = 5;
        int min = 1;
        int range = max - min + 1;

        int max1 = 20;
        int min1 = 1;
        int range1 = max1 - min1 + 1;

        // generate random numbers within 1 to 10
        for (int i = 0; i < jumlahkamar; i++) {

            int rand = (int)(Math.random() * range) + min;
            int rand1 = (int)(Math.random() * range1) + min1;
            // Output is different everytime this code is executed
            //System.out.println(rand*100 + rand1);
            temp[i] += rand*100 + rand1;
        }
        return temp;
    }

    public static String panjanginNama(String nama){
        for(int i=nama.length(); i<25; i++){
            nama += " ";
        }return nama;
    }

    public static String panjanginJenis(String nama){
        for(int i=nama.length(); i<5; i++){
            nama += " ";
        }return nama;
    }
}

