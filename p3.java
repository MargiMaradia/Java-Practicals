import java.util.*;
public class p3
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        float distance;
        float hr,min,sec;
        System.out.print(" Enter the distance in meters : ");
        distance = sc.nextFloat();
        System.out.print(" Enter the time in hours: ");
        hr = sc.nextFloat();
        System.out.print(" Enter the time in Minutes: ");
        min = sc.nextFloat();
        System.out.print(" Enter the time in Seconds: ");
        sec = sc.nextFloat();
        float time = (hr*3600f) + (min*60f) + (sec);
        float speed1 = distance/time;
        System.out.println(" speed in meters in per seconds : "+speed1);
        float speed2 = (distance/1000.0f)/(time/3600.0f);
        System.out.println(" speed in kilometers in per hour : "+speed2);
        float speed3 = speed2/1.609f;
        System.out.println(" speed in miles in per hour : "+speed3);


    }
}
