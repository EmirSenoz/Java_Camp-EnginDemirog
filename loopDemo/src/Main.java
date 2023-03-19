public class Main
{
    public static void main(String[] args)
    {
        //For
        for (int i=1;i<=10;i+=2)
        {
            System.out.println(i);
        }
        System.out.println("For Döngüsü Tamamlandı");

        //While
        int i = 1;
        while (i <10)
        {
            System.out.println(i);
            i++;
        }
        System.out.println("While Döngüsü Tamamlandı");

        //do While
        int k=100;
        do {
            System.out.println(k);
            k++;
        }
        while (k<10);
        System.out.println("Do-While Döngüsü Tamamlandı");

    }
}