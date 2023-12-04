
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
class Main {
    public static void main(String[] args)  throws IOException{
        String fileName = "C:\\Users\\amministratore1\\Documents\\4CI_2023_2024\\adventoofcode\\day_1\\src\\text.txt";
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        ArrayList<String> list= new ArrayList<String>();

        try {
            String line;
            while ((line = br.readLine()) != null) {
                list.add(line);
            }
        } finally {
            br.close();
        }
        String[] words = list.toArray(new String[0]);
        String[] numsLast= new String[words.length];
        String[] numsFirst= new String[words.length];
        int[] numbers = new int[words.length];
        int somma = 0;
        char let;
        for(int i=0;i<words.length;i++){
            for(int j=0;j<words[i].length();j++){
                let=words[i].charAt(j);
                if(let>=48 && let<=57){
                    numsLast[i]="";
                    numsLast[i]+=let;
                    if(numsFirst[i]==null){
                        numsFirst[i]="";
                        numsFirst[i]+=let;
                    }
                }
            }
        }



        for(int i=0;i<numbers.length;i++)
            numbers[i] = Integer.parseInt(numsFirst[i] + numsLast[i]);

        for (int num:numbers) {
             somma+=num;
        }
        System.out.println("Somma: "+somma);




    }
}