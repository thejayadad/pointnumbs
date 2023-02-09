import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int num = 0;
        float[] numbs = new float[5];
        Scanner scan = new Scanner(System.in);
        float userNum = (float) 0.0;
        while(num <=4){
            System.out.println("Please enter #" + (num+1));
            userNum = scan.nextFloat();
            numbs[(num)] = userNum;
            num++;
        }
        System.out.println("Total: " + total(numbs));
        System.out.println("Average: " + average(numbs));
        System.out.println("Max: " + max(numbs));
        System.out.println("Minimum: " + minimum(numbs));
        System.out.println("20% Interest: " + interest(numbs));

    }
    //TOTAL
    public static float total(float[] total){
        float numbs = 0;
        for(int i = 0; i < total.length; i++){
            numbs += total[i];
        }
        return numbs;
    }

    //AVERAGE
    public static float average(float[] average){
        float numbs = 0;
        for(int i = 0; i < average.length; i++){
            numbs += average[i];



        }
        return numbs / 5;
    }

    //MAX
    public static float max(float[] max){
        float high = max[0];
        for(int i = 0; i < max.length; i++){
            if(max[i] > high){
                high = max[i];
            }
    }
        return high;

    }

    //MINIMUM
    public static float minimum(float[] minimum){
        float low = minimum[0];
        for(int i = 0; i < minimum.length; i++){
            if( minimum[i] < low){
                low = minimum[i];
            }
        }
        return low;
    }

    //INTEREST
    public static float interest(float[] interest){
        float numbs = 0;
        for(int i = 0; i < interest.length; i++){
            numbs += interest[i];
        }
        return (float) (numbs +(numbs *.20)) ;
    }

}
