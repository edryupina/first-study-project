package file;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;
import java.io.*;
import java.util.HashMap;
import java.util.*;

public class file {
    public static void main(String args[]){
        String buk="";
        int k=0;
        ArrayList<String> words = new ArrayList();
        //долго пришлось искать нужную кодировку (выходила какая-то бяка):
        try(BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("C:\\Users\\user\\IdeaProjects\\first-study-project\\src\\main\\java\\file\\there.txt"),"cp1251")))
        {
            //сущности отделяем с помощью пробела
            while (k !=-1){
                k = br.read();
                if ((((char) k)!=' '))
                {
                    buk=buk+Character.toString((char)k);
                }
                else{
                    if ((!buk.equals(" "))
                            )
                    {words.add(buk);}
                    buk="";
                }
            }
            Collections.sort(words); //кривая сортировка
            //System.out.print("сортировка кривая \n"+words+"\n");
            Map<String, Integer> statistics = new HashMap<>();
            for (int m=0;m<words.size();m++) {
                Integer count = statistics.get(words.get(m));
                if (count==null){
                    count=0;
                }
                statistics.put(words.get(m),++count);
            }
            System.out.print("сколько раз каждое слово встречается в файле = \n"+statistics+"\n");
            int max=0;
            String maxim="";
            String maxum="";
            int dubl=50;
            for (String key: statistics.keySet()) {
                int kolvo = statistics.get(key);
                if (max<kolvo) {
                    max = kolvo;
                    maxim = key;
                }
            }
         //   for (String key: statistics.keySet()) {
          //      int kolvo = statistics.get(key);
         //       if (dubl==max & dubl>max) {
        //            dubl = kolvo;
         //           maxum = key;
        //        }
          //  }
            System.out.print("слово с максимальным количеством повторений " + maxim + " встречается в файле " + max + " раз(а)\n");
    //        System.out.print("слово с максимальным количеством повторений " + maxum + " встречается в файле " + dubl + " раз(а)\n");
            }
        catch (FileNotFoundException e){System.out.println("Ошибка " + e);}
        catch (UnsupportedEncodingException e){System.out.println("Ошибка " + e);}
        catch (IOException e){System.out.println("Ошибка " + e);}
    }
}
