import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        double armut;
        double elma;
        double domates;
        double muz ;
        double patlican;
        double toplamTutar;
        double tutarA, tutarE, tutarD, tutarM, tutarP;
        System.out.print("Kaç kilogram armut aldın:");
        armut = input.nextDouble();
        tutarA = armut * 2.14;
        System.out.print("Kaç kilogram elma aldın:");
        elma = input.nextDouble();
        tutarE = elma * 3.67;
        System.out.print("Kaç kilogram domates aldın:");
        domates = input.nextDouble();
        tutarD = domates * 1.11;
        System.out.print("Kaç kilogram muz aldın:");
        muz = input.nextDouble();
        tutarM = muz * 0.95;
        System.out.print("Kaç kilogram patlıcan aldın:");
        patlican = input.nextDouble();
        tutarP = patlican * 5.0;
        toplamTutar = tutarA + tutarD+ tutarE+ tutarM + tutarP;
        System.out.println("Toplam Tutar: " + toplamTutar);


    }
}
