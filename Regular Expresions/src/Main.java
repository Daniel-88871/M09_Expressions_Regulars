import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        int numPN = 0;
        int numR = 0;
        int numF = 0;

        File santako = new File("Regular Expresions/santako.txt");
        Scanner scanner = new Scanner(santako);
        Pattern parenoel = Pattern.compile("\\*<]:-DOo");
        Pattern ren = Pattern.compile(">:o\\)");
        Pattern follet = Pattern.compile("[^\\*]<]:-D");

        while(scanner.hasNextLine()){
            numF = 0;
            numPN = 0;
            numR = 0;
            String casa = scanner.nextLine();
            Matcher mPare_Noel = parenoel.matcher(casa);
            Matcher mRen = ren.matcher(casa);
            Matcher mFollet = follet.matcher(casa);

            while(mPare_Noel.find()){
                numPN++;
            }
            while(mRen.find()){
                numR++;
            }
            while(mFollet.find()){
                numF++;
            }

            if(numPN > 0){
            System.out.print("Pare Noel(" + numPN + ")");
            }
            if(numR > 0){
                System.out.print("Ren(" + numR + ")");
            }
            if(numF > 0){
                System.out.println("Follet(" + numF + ")");
            }
            System.out.println(" ");
            if(numF == 0 && numPN == 0 && numR == 0){
            }
        }
    }
}