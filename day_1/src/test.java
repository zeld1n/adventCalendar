import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test {
    public static void main(String[] args) throws IOException {

        String[] words = {
                "1two1nine",
                "eightwothree",
                "abcone2threexyz",
                "xtwone3four",
                "nineeightseven2",
                "zoneight234",
                "7pqrstsixteen",
        };

        String[]numbers = new String[words.length];
        int somma = 0;
        for (int i = 0; i < words.length; i++) {
            Pattern pattern = Pattern.compile("(one|two|three|four|five|six|seven|eight|nine|[1-9])", Pattern.CASE_INSENSITIVE);
            Matcher matcher = pattern.matcher(words[i]);
            while(matcher.find()) {
                if(numbers[i]==null)
                    numbers[i]="";
                switch (matcher.group()){
                    case "one":
                        numbers[i]+=("1");
                        break;
                    case "two":
                        numbers[i]+=("2");
                        break;
                    case "three":
                        numbers[i]+=("3");
                        break;
                    case "four":
                        numbers[i]+=("4");
                        break;
                    case "five":
                        numbers[i]+=("5");
                        break;
                    case "six":
                        numbers[i]+=("6");
                        break;
                    case "seven":
                        numbers[i]+=("7");
                        break;
                    case "eight":
                        numbers[i]+=("8");
                        break;
                    case "nine":
                        numbers[i]+=("9");
                        break;
                    default:
                         numbers[i]+=matcher.group();

                }

            }
            if(numbers[i]==null)
                numbers[i]="";
        }
        int[] numInt = new int[numbers.length];
        int end;
        String first="",last;

        for (int i = 0; i < numInt.length; i++) {
            System.out.println(numbers[i]);
            end=numbers[i].length();
            if(!(numbers[i].isEmpty()))
                if(numbers[i].length()==1)
                    numInt[i]=Integer.parseInt(numbers[i]+numbers[i]);
                else{
                    first= String.valueOf(numbers[i].charAt(0));
                    last=String.valueOf(numbers[i].charAt(end-1));

                    numInt[i]=Integer.parseInt(first+last);}


        }
        for(int num:numInt){
            somma+=num;}

        System.out.println("Somma: "+somma);
    }



}
