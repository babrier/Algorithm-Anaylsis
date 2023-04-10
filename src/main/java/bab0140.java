import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;
import static java.lang.Math.max;

/**
 * Ben Brierly
 * 11/12/22
 *
 * Program reads a file executes 4 algorithms on it then
 * executes on 19 different sized arrays and measures the
 * time taken to finish on the arrays in nanoseconds and generates
 * a csv 19x8 matrix and writes it to an output file.
 *
 * Ide used was intelli J
 * to compile on intelli J press ctr+f9
 * to run on intelli J press shift f10
 * additionally for it to run a file with the name "phw_input.txt" is
 * needed for the algorithms to output the requested MCS
 */

public class bab0140 {


    //reads a  csvtext file with numbers separated by commas and stores them into an array
    static List<Integer> inputarray = new ArrayList<>();
    public static void main(String[] args) throws FileNotFoundException {

        //the scanner was inspired by a post here
        //https://stackoverflow.com/questions/5343689/java-reading-a-file-into-an-arraylist
        Scanner sc = new Scanner(new File("phw_input.txt"));
        sc.useDelimiter(",");
        while (sc.hasNext()) {
            if (sc.hasNextInt()) {
                inputarray.add(sc.nextInt());
            } else {
                sc.next();
            }
        }
        sc.close();


        //setting the specified algorithm parameter list to the dynamic size arraylist
        int[] X = new int[inputarray.size()];

        for (int i = 0; i < inputarray.size(); i++) {
            X[i] = inputarray.get(i);
        }

        bab0140 phw = new bab0140();

        //execute the algorithms on the inputfile
        System.out.print("Algorithm-1:" + phw.Algorithm1(X));
        System.out.print(" Algorithm-2:" + phw.Algorithm2(X));
        System.out.print(" Algorithm-3:" + phw.Algorithm3(X,X[0],X.length));
        System.out.println(" Algorithm-4:" + phw.Algorithm4(X));


        Random temp = new Random();
        long[][] matrix = new long[19][8];


        //below create 19 arrays of differing sizes
        int[] a1 = new int[10];
        int[] a2 = new int[15];
        int[] a3 = new int[20];
        int[] a4 = new int[25];
        int[] a5 = new int[30];

        int[] a6 = new int[35];
        int[] a7 = new int[40];
        int[] a8 = new int[45];
        int[] a9 = new int[50];
        int[] a10 = new int[55];

        int[] a11 = new int[60];
        int[] a12 = new int[65];
        int[] a13 = new int[70];
        int[] a14 = new int[75];
        int[] a15 = new int[80];

        int[] a16 = new int[85];
        int[] a17 = new int[90];
        int[] a18 = new int[95];
        int[] a19 = new int[100];

        //makes each array generate with random positive and negative intergers in each index
        for(int i = 0;i < a1.length;i++) {
            int randomnum = temp.nextInt(100) - temp.nextInt(100);
            a1[i] = randomnum;
        }
        for(int i = 0;i < a2.length;i++) {
            int randomnum = temp.nextInt(100) - temp.nextInt(100);
            a2[i] = randomnum;
        }
        for(int i = 0;i < a3.length;i++) {
            int randomnum = temp.nextInt(100) - temp.nextInt(100);
            a3[i] = randomnum;
        }
        for(int i = 0;i < a4.length;i++) {
            int randomnum = temp.nextInt(100) - temp.nextInt(100);
            a4[i] = randomnum;
        }
        for(int i = 0;i < a5.length;i++) {
            int randomnum = temp.nextInt(100) - temp.nextInt(100);
            a5[i] = randomnum;
        }
        for(int i = 0;i < a6.length;i++) {
            int randomnum = temp.nextInt(100) - temp.nextInt(100);
            a6[i] = randomnum;
        }
        for(int i = 0;i < a7.length;i++) {
            int randomnum = temp.nextInt(100) - temp.nextInt(100);
            a7[i] = randomnum;
        }
        for(int i = 0;i < a8.length;i++) {
            int randomnum = temp.nextInt(100) - temp.nextInt(100);
            a8[i] = randomnum;
        }
        for(int i = 0;i < a9.length;i++) {
            int randomnum = temp.nextInt(100) - temp.nextInt(100);
            a9[i] = randomnum;
        }
        for(int i = 0;i < a10.length;i++) {
            int randomnum = temp.nextInt(100) - temp.nextInt(100);
            a10[i] = randomnum;
        }
        for(int i = 0;i < a11.length;i++) {
            int randomnum = temp.nextInt(100) - temp.nextInt(100);
            a11[i] = randomnum;
        }
        for(int i = 0;i < a12.length;i++) {
            int randomnum = temp.nextInt(100) - temp.nextInt(100);
            a12[i] = randomnum;
        }
        for(int i = 0;i < a13.length;i++) {
            int randomnum = temp.nextInt(100) - temp.nextInt(100);
            a13[i] = randomnum;
        }
        for(int i = 0;i < a14.length;i++) {
            int randomnum = temp.nextInt(100) - temp.nextInt(100);
            a14[i] = randomnum;
        }
        for(int i = 0;i < a15.length;i++) {
            int randomnum = temp.nextInt(100) - temp.nextInt(100);
            a15[i] = randomnum;
        }
        for(int i = 0;i < a16.length;i++) {
            int randomnum = temp.nextInt(100) - temp.nextInt(100);
            a16[i] = randomnum;
        }
        for(int i = 0;i < a17.length;i++) {
            int randomnum = temp.nextInt(100) - temp.nextInt(100);
            a17[i] = randomnum;
        }
        for(int i = 0;i < a18.length;i++) {
            int randomnum = temp.nextInt(100) - temp.nextInt(100);
            a18[i] = randomnum;
        }
        for(int i = 0;i < a19.length;i++) {
            int randomnum = temp.nextInt(100) - temp.nextInt(100);
            a19[i] = randomnum;
        }


    // measure the time it takes to do each execution
        // fragment can be found bellow
    //https://stackoverflow.com/questions/180158/how-do-i-time-a-methods-execution-in-java
        long startTime = System.nanoTime();

        phw.Algorithm1(a1);
        long endTime1 = System.nanoTime();
        phw.Algorithm1(a2);
        long endTime2 = System.nanoTime();
        phw.Algorithm1(a3);
        long endTime3 = System.nanoTime();
        phw.Algorithm1(a4);
        long endTime4 = System.nanoTime();
        phw.Algorithm1(a5);
        long endTime5 = System.nanoTime();

        phw.Algorithm1(a6);
        long endTime6 = System.nanoTime();
        phw.Algorithm1(a7);
        long endTime7 = System.nanoTime();
        phw.Algorithm1(a8);
        long endTime8 = System.nanoTime();
        phw.Algorithm1(a9);
        long endTime9 = System.nanoTime();
        phw.Algorithm1(a10);
        long endTime10 = System.nanoTime();

        phw.Algorithm1(a11);
        long endTime11 = System.nanoTime();
        phw.Algorithm1(a12);
        long endTime12 = System.nanoTime();
        phw.Algorithm1(a13);
        long endTime13 = System.nanoTime();
        phw.Algorithm1(a14);
        long endTime14 = System.nanoTime();
        phw.Algorithm1(a15);
        long endTime15 = System.nanoTime();

        phw.Algorithm1(a16);
        long endTime16 = System.nanoTime();
        phw.Algorithm1(a17);
        long endTime17 = System.nanoTime();
        phw.Algorithm1(a18);
        long endTime18 = System.nanoTime();
        phw.Algorithm1(a19);
        long endTime19 = System.nanoTime();



        long duration1 = (endTime1 - startTime);
        matrix[0][0] = duration1;
        long duration2 = (endTime2 - startTime);
        matrix[1][0] = duration2;
        long duration3 = (endTime3 - startTime);
        matrix[2][0] = duration3;
        long duration4 = (endTime4 - startTime);
        matrix[3][0] = duration4;
        long duration5 = (endTime5 - startTime);
        matrix[4][0] = duration5;

        long duration6 = (endTime6 - startTime);
        matrix[5][0] = duration6;
        long duration7 = (endTime7 - startTime);
        matrix[6][0] = duration7;
        long duration8 = (endTime8 - startTime);
        matrix[7][0] = duration8;
        long duration9 = (endTime9 - startTime);
        matrix[8][0] = duration9;
        long duration10 = (endTime10 - startTime);
        matrix[9][0] = duration10;

        long duration11 = (endTime11 - startTime);
        matrix[10][0] = duration11;
        long duration12 = (endTime12 - startTime);
        matrix[11][0] = duration12;
        long duration13 = (endTime13 - startTime);
        matrix[12][0] = duration13;
        long duration14 = (endTime14 - startTime);
        matrix[13][0] = duration14;
        long duration15 = (endTime15 - startTime);
        matrix[14][0] = duration15;

        long duration16 = (endTime16 - startTime);
        matrix[15][0] = duration16;
        long duration17 = (endTime17 - startTime);
        matrix[16][0] = duration17;
        long duration18 = (endTime18 - startTime);
        matrix[17][0] = duration18;
        long duration19 = (endTime19 - startTime);
        matrix[18][0] = duration19;


    //calculate t(n) time where n = inputsize
      matrix[0][4] = duration1;
      matrix[1][4] = duration2 - duration1;
      matrix[2][4] = duration3 - duration2;
      matrix[3][4] = duration4 - duration3;
      matrix[4][4] = duration5 - duration4;

      matrix[5][4] = duration6 - duration5;
      matrix[6][4] = duration7 - duration6;
      matrix[7][4] = duration8 - duration7;
      matrix[8][4] = duration9 - duration8;
      matrix[9][4] = duration10 - duration9;

      matrix[10][4] = duration11 - duration10;
      matrix[11][4] = duration12 - duration11;
      matrix[12][4] = duration13 - duration12;
      matrix[13][4] = duration14 - duration13;
      matrix[14][4] = duration15 - duration14;

      matrix[15][4] = duration16 - duration15;
      matrix[16][4] = duration17 - duration16;
      matrix[17][4] = duration18 - duration17;
      matrix[18][4] = duration19 - duration18;


        /////////////////////////////////////////////////////


        //reset start time
        startTime = System.nanoTime();

        // measure the time it takes to do each execution
        phw.Algorithm2(a1);
        long endTime1B = System.nanoTime();
        phw.Algorithm2(a2);
        long endTime2B = System.nanoTime();
        phw.Algorithm2(a3);
        long endTime3B = System.nanoTime();
        phw.Algorithm2(a4);
        long endTime4B = System.nanoTime();
        phw.Algorithm2(a5);
        long endTime5B = System.nanoTime();

        phw.Algorithm2(a6);
        long endTime6B = System.nanoTime();
        phw.Algorithm2(a7);
        long endTime7B = System.nanoTime();
        phw.Algorithm2(a8);
        long endTime8B = System.nanoTime();
        phw.Algorithm2(a9);
        long endTime9B = System.nanoTime();
        phw.Algorithm2(a10);
        long endTime10B = System.nanoTime();

        phw.Algorithm2(a11);
        long endTime11B = System.nanoTime();
        phw.Algorithm2(a12);
        long endTime12B = System.nanoTime();
        phw.Algorithm2(a13);
        long endTime13B = System.nanoTime();
        phw.Algorithm2(a14);
        long endTime14B = System.nanoTime();
        phw.Algorithm2(a15);
        long endTime15B = System.nanoTime();

        phw.Algorithm2(a16);
        long endTime16B = System.nanoTime();
        phw.Algorithm2(a17);
        long endTime17B = System.nanoTime();
        phw.Algorithm2(a18);
        long endTime18B = System.nanoTime();
        phw.Algorithm2(a19);
        long endTime19B = System.nanoTime();


        long duration1B = (endTime1B - startTime);
        matrix[0][1] = duration1B;
        long duration2B = (endTime2B - startTime);
        matrix[1][1] = duration2B;
        long duration3B = (endTime3B - startTime);
        matrix[2][1] = duration3B;
        long duration4B = (endTime4B - startTime);
        matrix[3][1] = duration4B;
        long duration5B = (endTime5B - startTime);
        matrix[4][1] = duration5B;

        long duration6B = (endTime6B - startTime);
        matrix[5][1] = duration6B;
        long duration7B = (endTime7B - startTime);
        matrix[6][1] = duration7B;
        long duration8B = (endTime8B - startTime);
        matrix[7][1] = duration8B;
        long duration9B = (endTime9B - startTime);
        matrix[8][1] = duration9B;
        long duration10B = (endTime10B - startTime);
        matrix[9][1] = duration10B;

        long duration11B = (endTime11B - startTime);
        matrix[10][1] = duration11B;
        long duration12B = (endTime12B - startTime);
        matrix[11][1] = duration12B;
        long duration13B = (endTime13B - startTime);
        matrix[12][1] = duration13B;
        long duration14B = (endTime14B - startTime);
        matrix[13][1] = duration14B;
        long duration15B = (endTime15B - startTime);
        matrix[14][1] = duration15B;

        long duration16B = (endTime16B - startTime);
        matrix[15][1] = duration16B;
        long duration17B = (endTime17B - startTime);
        matrix[16][1] = duration17B;
        long duration18B = (endTime18B - startTime);
        matrix[17][1] = duration18B;
        long duration19B = (endTime19B - startTime);
        matrix[18][1] = duration19B;


        //calculate t(n) time where n = inputsize
        matrix[0][5] = duration1B;
        matrix[1][5] = duration2B - duration1B;
        matrix[2][5] = duration3B - duration2B;
        matrix[3][5] = duration4B - duration3B;
        matrix[4][5] = duration5B - duration4B;

        matrix[5][5] = duration6B - duration5B;
        matrix[6][5] = duration7B - duration6B;
        matrix[7][5] = duration8B - duration7B;
        matrix[8][5] = duration9B - duration8B;
        matrix[9][5] = duration10B - duration9B;

        matrix[10][5] = duration11B - duration10B;
        matrix[11][5] = duration12B - duration11B;
        matrix[12][5] = duration13B - duration12B;
        matrix[13][5] = duration14B - duration13B;
        matrix[14][5] = duration15B - duration14B;

        matrix[15][5] = duration16B - duration15B;
        matrix[16][5] = duration17B - duration16B;
        matrix[17][5] = duration18B - duration17B;
        matrix[18][5] = duration19B - duration18B;



            //////////////////////////////////////////////

        startTime = System.nanoTime();

        // measure the time it takes to do each execution
        phw.Algorithm3(a1, 0 , a1.length);
        long endTime1C = System.nanoTime();
        phw.Algorithm3(a2,0, a2.length);
        long endTime2C = System.nanoTime();
        phw.Algorithm3(a3,0,a3.length);
        long endTime3C = System.nanoTime();
        phw.Algorithm3(a4,0,a4.length);
        long endTime4C = System.nanoTime();
        phw.Algorithm3(a5,0,a5.length);
        long endTime5C = System.nanoTime();

        phw.Algorithm3(a6,0,a6.length);
        long endTime6C = System.nanoTime();
        phw.Algorithm3(a7,0,a7.length);
        long endTime7C = System.nanoTime();
        phw.Algorithm3(a8,0,a8.length);
        long endTime8C = System.nanoTime();
        phw.Algorithm3(a9,0,a9.length);
        long endTime9C = System.nanoTime();
        phw.Algorithm3(a10,0,a10.length);
        long endTime10C = System.nanoTime();

        phw.Algorithm3(a11,0,a11.length);
        long endTime11C = System.nanoTime();
        phw.Algorithm3(a12,0,a12.length);
        long endTime12C = System.nanoTime();
        phw.Algorithm3(a13,0,a13.length);
        long endTime13C = System.nanoTime();
        phw.Algorithm3(a14,0,a14.length);
        long endTime14C = System.nanoTime();
        phw.Algorithm3(a15,0,a15.length);
        long endTime15C = System.nanoTime();

        phw.Algorithm3(a16,0,a16.length);
        long endTime16C = System.nanoTime();
        phw.Algorithm3(a17,0,a17.length);
        long endTime17C = System.nanoTime();
        phw.Algorithm3(a18,0,a18.length);
        long endTime18C = System.nanoTime();
        phw.Algorithm3(a19,0,a19.length);
        long endTime19C = System.nanoTime();


        long duration1C = (endTime1C - startTime);
        matrix[0][2] = duration1C;
        long duration2C = (endTime2C - startTime);
        matrix[1][2] = duration2C;
        long duration3C = (endTime3C - startTime);
        matrix[2][2] = duration3C;
        long duration4C = (endTime4C - startTime);
        matrix[3][2] = duration4C;
        long duration5C = (endTime5C - startTime);
        matrix[4][2] = duration5C;

        long duration6C = (endTime6C - startTime);
        matrix[5][2] = duration6C;
        long duration7C = (endTime7C - startTime);
        matrix[6][2] = duration7C;
        long duration8C = (endTime8C - startTime);
        matrix[7][2] = duration8C;
        long duration9C = (endTime9C - startTime);
        matrix[8][2] = duration9C;
        long duration10C = (endTime10C - startTime);
        matrix[9][2] = duration10C;

        long duration11C = (endTime11C - startTime);
        matrix[10][2] = duration11C;
        long duration12C = (endTime12C - startTime);
        matrix[11][2] = duration12C;
        long duration13C = (endTime13C - startTime);
        matrix[12][2] = duration13C;
        long duration14C = (endTime14C - startTime);
        matrix[13][2] = duration14C;
        long duration15C = (endTime15C - startTime);
        matrix[14][2] = duration15C;

        long duration16C = (endTime16C - startTime);
        matrix[15][2] = duration16C;
        long duration17C = (endTime17C - startTime);
        matrix[16][2] = duration17C;
        long duration18C = (endTime18C - startTime);
        matrix[17][2] = duration18C;
        long duration19C = (endTime19C - startTime);
        matrix[18][2] = duration19C;



        //calculate t(n) time where n = inputsize
        matrix[0][6] = duration1C;
        matrix[1][6] = duration2C - duration1C;
        matrix[2][6] = duration3C - duration2C;
        matrix[3][6] = duration4C - duration3C;
        matrix[4][6] = duration5C - duration4C;

        matrix[5][6] = duration6C - duration5C;
        matrix[6][6] = duration7C - duration6C;
        matrix[7][6] = duration8C - duration7C;
        matrix[8][6] = duration9C - duration8C;
        matrix[9][6] = duration10C - duration9C;

        matrix[10][6] = duration11C - duration10C;
        matrix[11][6] = duration12C - duration11C;
        matrix[12][6] = duration13C - duration12C;
        matrix[13][6] = duration14C - duration13C;
        matrix[14][6] = duration15C - duration14C;

        matrix[15][6] = duration16C - duration15C;
        matrix[16][6] = duration17C - duration16C;
        matrix[17][6] = duration18C - duration17C;
        matrix[18][6] = duration19C - duration18C;




//////////////////////////////////////////



         startTime = System.nanoTime();

        // measure the time it takes to do each execution
        phw.Algorithm4(a1);
        long endTime1D = System.nanoTime();
        phw.Algorithm4(a2);
        long endTime2D = System.nanoTime();
        phw.Algorithm4(a3);
        long endTime3D = System.nanoTime();
        phw.Algorithm4(a4);
        long endTime4D = System.nanoTime();
        phw.Algorithm4(a5);
        long endTime5D = System.nanoTime();

        phw.Algorithm4(a6);
        long endTime6D = System.nanoTime();
        phw.Algorithm4(a7);
        long endTime7D = System.nanoTime();
        phw.Algorithm4(a8);
        long endTime8D = System.nanoTime();
        phw.Algorithm4(a9);
        long endTime9D = System.nanoTime();
        phw.Algorithm4(a10);
        long endTime10D = System.nanoTime();

        phw.Algorithm4(a11);
        long endTime11D = System.nanoTime();
        phw.Algorithm4(a12);
        long endTime12D = System.nanoTime();
        phw.Algorithm4(a13);
        long endTime13D = System.nanoTime();
        phw.Algorithm4(a14);
        long endTime14D = System.nanoTime();
        phw.Algorithm4(a15);
        long endTime15D = System.nanoTime();

        phw.Algorithm4(a16);
        long endTime16D = System.nanoTime();
        phw.Algorithm4(a17);
        long endTime17D = System.nanoTime();
        phw.Algorithm4(a18);
        long endTime18D = System.nanoTime();
        phw.Algorithm4(a19);
        long endTime19D= System.nanoTime();


        long duration1D = (endTime1D - startTime);
        matrix[0][3] = duration1D;
        long duration2D = (endTime2D - startTime);
        matrix[1][3] = duration2D;
        long duration3D = (endTime3D - startTime);
        matrix[2][3] = duration3D;
        long duration4D = (endTime4D - startTime);
        matrix[3][3] = duration4D;
        long duration5D = (endTime5D - startTime);
        matrix[4][3] = duration5D;

        long duration6D = (endTime6D - startTime);
        matrix[5][3] = duration6D;
        long duration7D = (endTime7D - startTime);
        matrix[6][3] = duration7D;
        long duration8D = (endTime8D - startTime);
        matrix[7][3] = duration8D;
        long duration9D = (endTime9D - startTime);
        matrix[8][3] = duration9D;
        long duration10D = (endTime10D - startTime);
        matrix[9][3] = duration10D;

        long duration11D = (endTime11D - startTime);
        matrix[10][3] = duration11D;
        long duration12D = (endTime12D - startTime);
        matrix[11][3] = duration12D;
        long duration13D = (endTime13D - startTime);
        matrix[12][3] = duration13D;
        long duration14D = (endTime14D - startTime);
        matrix[13][3] = duration14D;
        long duration15D = (endTime15D - startTime);
        matrix[14][3] = duration15D;

        long duration16D = (endTime16D - startTime);
        matrix[15][3] = duration16D;
        long duration17D = (endTime17D - startTime);
        matrix[16][3] = duration17D;
        long duration18D = (endTime18D - startTime);
        matrix[17][3] = duration18D;
        long duration19D = (endTime19D - startTime);
        matrix[18][3] = duration19D;



        //calculate t(n) time where n = inputsize
        matrix[0][7] = duration1D;
        matrix[1][7] = duration2D- duration1D;
        matrix[2][7] = duration3D - duration2D;
        matrix[3][7] = duration4D - duration3D;
        matrix[4][7] = duration5D - duration4D;

        matrix[5][7] = duration6D - duration5D;
        matrix[6][7] = duration7D - duration6D;
        matrix[7][7] = duration8D - duration7D;
        matrix[8][7] = duration9D - duration8D;
        matrix[9][7] = duration10D - duration9D;

        matrix[10][7] = duration11D - duration10D;
        matrix[11][7] = duration12D - duration11D;
        matrix[12][7] = duration13D - duration12D;
        matrix[13][7] = duration14D - duration13D;
        matrix[14][7] = duration15D - duration14D;

        matrix[15][7] = duration16D - duration15D;
        matrix[16][7] = duration17D - duration16D;
        matrix[17][7] = duration18D - duration17D;
        matrix[18][7] = duration19D - duration18D;


        //prints the matrix to a the output file
        //writer idea came from below link
        // /https://stackoverflow.com/questions/2885173/how-do-i-create-a-file-and-write-to-it

        try {
            PrintWriter writer = new PrintWriter("benbrierly_phw_output.txt", StandardCharsets.UTF_8);
            writer.println("algorithm-1,algorithm-2,algorithm-3,algorithm-4,T1(n),T2(n),T3(n),T4(n)");
            for (int i = 0; i<19; i++) {
                for (int j = 0; j<8; j++) {
                    writer.print(matrix[i][j]);
                    writer.print(",");

                }
              writer.println();
            }
            writer.close();
        } catch (IOException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
    }
    }

    //below are the implemented algorithms in their respective methods

    public int Algorithm1(int[] X) {
        int maxSoFar = 0;
        int P = 0;
        int Q = X.length;
        int sum;
        for (int L = P; L < Q; L++) {
            for (int U = L; U < Q; U++) {
                sum = 0;
                for (int I = L; I < U; I++) {
                    sum = sum + X[I];
                    /* sum now contains the sum of X[L..U] */

                }
                maxSoFar = max(maxSoFar, sum);
            }

        }
        return maxSoFar;
    }

    public int Algorithm2(int[] X) {
        int maxSoFar = 0;
        int P = 0;
        int Q = X.length;
        int sum;
        for (int L = P; L < Q; L++) {
            sum = 0;
            for (int U = L; U < Q; U++) {
                sum = sum + X[U];
                /* sum now contains the sum of X[L..U] */
                maxSoFar = max(maxSoFar, sum);
            }
        }
        return maxSoFar;
    }

    public int Algorithm3(int[] X, int L, int U) {
        if (L > U) {
            return 0;//empty array
        }
        if (L == U) {
            return max(0, X[0]);//one element vector
        }
        int M = ((L + U) / 2); /* A is X[L..M], B is X[M+1..U] */
        /* Find max crossing to left */
        int sum = 0;
        int maxToLeft = 0;
        for (int I = M; I > U - 1; I--) {
            sum = sum + X[I];
           maxToLeft = max(maxToLeft, sum);
        }
        /* Find max crossing to right */
        sum = 0;
        int maxToRight = 0;
        for (int I = (M + 1); I < U; I++) {
            sum = sum + X[I];
            maxToRight = max(maxToRight, sum);
        }
       int maxCrossing = maxToLeft + maxToRight;

       int maxInA = Algorithm3(X, L, M);
       int maxInB = Algorithm3(X, (M + 1), U);

       int temp = max(maxInA, maxInB);
       temp = max(temp, maxCrossing);

       return temp;
    }

    public int Algorithm4(int[] X) {
        int maxSoFar = 0;
        int maxEndingHere = 0;
        int Q = X.length;
        for (int I = 0; I < Q; I++) {
            maxEndingHere = max(0, maxEndingHere + X[I]);
            maxSoFar = max(maxSoFar, maxEndingHere);
        }
        return maxSoFar;
    }
}







