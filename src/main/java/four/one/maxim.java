package four.one;

public class maxim {
    public static void main(String[] args) {
        int[] minmax;
        minmax = new int[20];
        int minn = 0;
        int maxx = 0;
        int i;
        int m;
        for (i = 0; i < 20; i++) {
            minmax[i] = ((int) (Math.random() * 20) - 10);
            }
        int min =-11;
        for (i=0;i < 20; i++){
            if (minmax[i] > min & minmax[i] <0) {
                min = minmax [i];
                minn= i;
            }
        }
        ///подсчитали большое отрицательное число
        int max =11;
        for (i=0;i < 20; i++){
            if (minmax[i] < max & minmax[i] >0) {
                max = minmax [i];
                maxx= i;
            }
        }
        //подсчитали маленькое положительное число
        for (i = 0; i < 20; i++) {
            System.out.printf(minmax[i] + " ");
        }
        System.out.println(" ");
        System.out.printf ("Самое  первое  большое ОТРИЦ число в массиве = %d\n", min);
        System.out.printf ("Самое первое маленькое ПОЛОЖ число в массиве =  %d\n", max);
        m = minmax[minn];
        minmax[minn] = minmax[maxx];
        minmax[maxx] = m;
        for (i=0; i < 20; i++) {
            System.out.print(minmax[i] + " ");
        }
    }
}
