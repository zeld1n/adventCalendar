import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class day_1_part2 {
    public static void main(String[] args) throws IOException {
        String fileName = "C:\\Users\\kiril\\OneDrive\\Рабочий стол\\javaAOC\\adventCalendar\\day_1\\src\\textpart2.txt";
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        ArrayList<String> list = new ArrayList<String>();

        try {
            String line;
            while ((line = br.readLine()) != null) {
                list.add(line);
            }
        } finally {
            br.close();
        }
        String[] words = list.toArray(new String[0]);
        String[]numbers = new String[words.length];

        String l;
        int somma = 0;
        StringBuilder newWords = new StringBuilder();
        for (String w:words) {
            newWords.append(w+"\n");
        }
        newWords.delete(newWords.length()-1,newWords.length());
        for (int i = 0; i < words.length; i++) {
            for(int j = 0;j<words[i].length();j++){

                Pattern pattern = Pattern.compile("(one|two|three|four|five|six|seven|eight|nine|[1-9]|\n)", Pattern.CASE_INSENSITIVE);
                Matcher matcher = pattern.matcher(newWords);
                while(matcher.find()) {
                    matcher = pattern.matcher(newWords);
                    if(matcher.find()) {
                        //  System.out.println(l);
                        if (numbers[i] == null || numbers[i].equals("null\n")) {
                            numbers[i] = "";
                        }
                        switch (matcher.group()) {
                            case "one":
                                numbers[i] += ("1");
                                break;
                            case "two":
                                numbers[i] += ("2");
                                break;
                            case "three":
                                numbers[i] += ("3");
                                break;
                            case "four":
                                numbers[i] += ("4");
                                break;
                            case "five":
                                numbers[i] += ("5");
                                break;
                            case "six":
                                numbers[i] += ("6");
                                break;
                            case "seven":
                                numbers[i] += ("7");
                                break;
                            case "eight":
                                numbers[i] += ("8");
                                break;
                            case "nine":
                                numbers[i] += ("9");
                                break;
                            case "\n":
                                i++;
                            default:
                                numbers[i] += matcher.group();

                        }
                        newWords.setCharAt(matcher.start(), ' ');

                    }
                }
            }}

        int[] numInt = new int[numbers.length];
        int end;
        String first="",last;
        for (int i = 0; i < numInt.length; i++) {
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
            System.out.println(num);
            somma+=num;}
        System.out.println("spazio");
        System.out.println("Somma: "+somma);


    }


}