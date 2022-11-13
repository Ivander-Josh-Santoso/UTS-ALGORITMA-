import java.util.Scanner;

public class Bilanganprima {
    private static void Cetaknama(){
        Scanner input= new Scanner(System.in);
        String NIM;
        String NAMA;
        String KELAS;
        String TUGAS;

        System.out.println("Masukan NIM =" );
        NIM = input.nextLine();
        System.out.println("Masukan NAMA=" );
        NAMA = input.nextLine();
        System.out.println("Masukan KELAS=");
        KELAS = input.nextLine();
        System.out.println("Masukan TUGAS=" );
        TUGAS = input.nextLine();

        System.out.println("NIM= "+NIM);
        System.out.println("NAMA= "+NAMA);
        System.out.println("KELAS= "+KELAS);
        System.out.println("TUGAS= "+TUGAS);
        System.out.println("===================================");


    }


    private static void Bilanganprima1(){
        Scanner inputBilangan = new Scanner(System.in);
        int bilangan;
        int cek;

        cek =0;
        System.out.println("Masukan Angka=");
        bilangan=inputBilangan.nextInt();

        for(int i=2; i<=bilangan;i++){
            if(bilangan%i==0){
                cek++;
            }
        }
        if(cek==1){
            System.out.println(bilangan  + " Bilangan Prima");
        }else{
            System.out.println(bilangan  + " Bukan Bilangan Prima");
        }
    }

    public static void main(String[] args) {
        Cetaknama();
        Bilanganprima1();
    }
}
