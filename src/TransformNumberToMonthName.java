import java.util.*;
public class TransformNumberToMonthName{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please Enter Month Number: ");
        int monthNum = in.nextInt();
        in.close();
        String monthNames = "January  February March    April    May      June     July     August   SeptemberOctober  November December ";
        int start, end;
        end = 9 * monthNum;
        start = end - 9;
        System.out.println(monthNames.substring(start, end));
    }
}
