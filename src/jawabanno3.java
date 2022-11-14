import java.util.Scanner;
public class jawabanno3 {
    public class tess{
        static  int kudus = 0;
        static int jakarta = 0;
        static int jogja = 0;
        static int karawang = 0;
        static int solo = 0;

        static  boolean success = false;

        public static void main(String[] args) {
            for (int i = 0;1<8;i++){
                plat();
            }

        }
        public static void  PlatNomor(String nomorPlat){
            if (nomorPlat.contains("K")){
                success = true;
                kudus++;
            } else if (nomorPlat.contains("B")) {
                success = true;
                jakarta++;
            } else if (nomorPlat.contains("AB")) {
                success = true;
                jogja++;
            } else if (nomorPlat.contains("T")) {
                success = true;
                karawang++;
            } else if (nomorPlat.contains("AD")) {
                success = true;
                solo++;
            } else {
                success = false;
                System.out.println("kode tidak valid");
            }
        }
        static  void  plat(){
            Scanner inputData = new Scanner(System.in);
            System.out.println("Plat Nomor Terdaftar \n Kudus : K \n Jakarta : B\n Jogja : AB \n Karawang : T \n Solo : AD");
            System.out.println("Masukan Plat nomor");
            String plat = inputData.nextLine();
            if (plat.length() % 2 == 0) {
                System.out.println("Plat Nomor Ganjil");


            }else if (plat.length() % 2== 1){
                System.out.println("Bilangan Genap");}


            PlatNomor(plat);

            if (success){
                printPlat();
            }
        }
        public static void printPlat() {
            System.out.println("Total Plat kudus : " + kudus+ " | Total Plat Jakarta: " + jakarta + " | Total Plat Jogja "+ jogja + " |Total Plat Karawang " +
                    karawang+ " | Total Plat Solo " + solo);
        }
    }

    public static void main(String[] args) {
        while (true){
            tess.plat();
        }
    }
}
