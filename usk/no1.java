

public class no1{
    public static void main(String[] args){
    System.out.println("hello usk");

   ;

        String nama = "Fawwaz Syandana Arisukma" ;
        String nim = "19102008";

        String aman = new StringBuilder(nama).reverse().toString();
        // System.out.println("nama kebalik: " + aman);

        // String nama = nama.substring();
        System.out.println("Nama lengkap : " + nama);

        String tengah = nama.substring(7,15);
        System.out.println("Nama Tengah: " + tengah);

        String inisial = nama.substring(0,1);
        // System.out.println("inisial :" + inisial);
        
        String nim2 = nim.substring(nim.length() - 4);
        // System.out.println("4 digit Nim: " + nim2);
    }

    }






 // String[] inisial = nama.split(" ");

        // for (String inisial1 : inisial) {
        //     System.out.println("inisial: " + inisial1.charAt(0));
        // }

