package problema3;

/**
 * Created by Feliu on 23/09/2015.
 */
public class AppIoText {
    public static void main(String[] args) {

String linia= "C:\\Users\\Feliu\\IdeaProjects\\Problema2\\numeros.txt";
        try {
            double average = AverageFileCalculator.average(linia);
            System.out.println("Average = " + average);
        } catch (FileParsingException e) {
            e.printStackTrace();
        } catch (BigNumberException e) {
            e.printStackTrace();
        }
    }
}