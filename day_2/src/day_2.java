package day_2.src;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
class day_2 {
    public static void main(String[] args) throws IOException {
        String fileName = "C:\\Users\\kiril\\OneDrive\\Рабочий стол\\adventPy\\day_2\\src\\text.txt";
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
        char let,let2;
        String[] games = list.toArray(new String[0]);
        for(int i=0;i<games.length;i++)
            for(int j=0;j<games[i].length();j++) {
                let=games[i].charAt(j);
                if(let>=48 && let<=57) {

                    String letTransf = String.valueOf(let);
                    if (games[i].contains(letTransf))
                        System.out.println("Ciao");
                }

            }
    }

}