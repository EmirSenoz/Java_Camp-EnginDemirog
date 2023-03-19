public class Main {
    public static void main(String[] args) {
        String [][] sehirler = new String[2][3];

        sehirler[0][0] = "İstanbul";
        sehirler[0][1] = "Kocaeli";
        sehirler[0][2] = "Bursa";
        sehirler[1][0] = "Trabzon";
        sehirler[1][1] = "Rize";
        sehirler[1][2] = "Artvin";

        for (int i = 0; i <= 2; i++) {
            if (i==0) {
                System.out.println("Marmara Bölgesi");
            } else if (i==0) {
                System.out.println("Karadeniz Bölgesi");
            }
            for (int j = 0; j <= 2; j++) {
                System.out.println(sehirler[i][j]);

            }
        }

    }
}