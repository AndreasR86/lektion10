import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class collectionspt2 {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        for (int i = 0; i < 50; i++){
            Random random = new Random();
            arrayList.add(random.nextInt(3) );

        }
System.out.println(arrayList);

        int frekvensAv0 = Collections.frequency(arrayList, 0);
        int frekvensAv1 = Collections.frequency(arrayList, 1);
        int frekvensAv2 = Collections.frequency(arrayList, 2);

        System.out.println("Frekvens för 0 " + frekvensAv0 + "\nFrekvens av 1 " + frekvensAv1 +
                "\nFrekvens av 2 " + frekvensAv2);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Välj nummer mellan 0-2");
        int chosenNumber = scanner.nextInt();

        switch (chosenNumber){
            case 0:
            if (frekvensAv0 > frekvensAv2 && frekvensAv0 > frekvensAv1){
                System.out.println("Användaren vinner ");

            }else {
                System.out.println("Användaren vinner inte ");
            }
            break;
            case 1:
                if (frekvensAv1 > frekvensAv2 && frekvensAv1 > frekvensAv0){
                    System.out.println("Användaren vinner ");

                }else {
                    System.out.println("Användaren vinner ej ");

                }
                break;
            case 2:
                if (frekvensAv2 > frekvensAv0 && frekvensAv2 > frekvensAv1){
                    System.out.println("användren vinner ");

                }else {
                    System.out.println("användaren vinner ej");

                }
                break;
            default:
                System.out.println("Endast 0-2 ");
        }
    }
}
