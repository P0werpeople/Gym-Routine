import java.lang.Math;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class GymRoutine {
    public static final void main(String[] args){
        //Creates the sets to choose from
        //set of leg workouts
            ArrayList<String> legs = new ArrayList<String>();
            legs.add("Squat");
            legs.add("Leg Press");
            legs.add("Leg Extensions");
            legs.add("Leg Curls");
            legs.add("Single Leg dumbell squats");
            legs.add("One legged step ups");
        //set for otherlegs
            ArrayList<String> otherLegs = new ArrayList<String>();
            otherLegs.add("cafe raise");
            otherLegs.add("Lunges");
            otherLegs.add("Glute Bridge/Hip thrusts");
            otherLegs.add("Deadlifts");
            otherLegs.add("Single Leg RDL");
            otherLegs.add("BoxJumps");
        //set for Biceps
            ArrayList<String> biceps = new ArrayList<String>();
            biceps.add("Preacher curls");
            biceps.add("Barbell/Ez bar curls");
            biceps.add("Single arm Dumbell curls");
            biceps.add("Incline Dumbell Curls");
            biceps.add("Cable Curls");
            biceps.add("reverse grip bicep curls");
        //set for Chest
            ArrayList<String> chest = new ArrayList<String>();
            chest.add("bench press-either bb or db");
            chest.add("incline bench press-either bb or db");
            chest.add("Pec Dec");
            chest.add("Standing Cable Fly");
            chest.add("Decline Bench press-either bb or db");
            chest.add("Cable iron cross");
        //set for Triceps
            ArrayList<String> triceps = new ArrayList<String>();
            triceps.add("Cable Tricep Extension");
            triceps.add("DB Tricep Extension");
            triceps.add("Skull crushers");
            triceps.add("Military Press");
            triceps.add("Two arm standing db extension");
            triceps.add("Seated French Press");
        //set for back
            ArrayList<String> back = new ArrayList<String>();
            back.add("Lat pulldown");
            back.add("Bent-over one arm rows");
            back.add("Lever seated reverse fly");
            back.add("Seated cable row");
            back.add("Yates row/bent over rows");
            back.add("Pull-ups");
        //input to ask what might be the routine
        Scanner reader = new
        Scanner(System.in);
        System.out.print("Chose what you want to hit, 1-legs 2-chest 3-back: ");
        int choosingHit = reader.nextInt();
        while (choosingHit>3 || choosingHit<0) {
            System.out.print("Not a valid number. Please try again: ");
            choosingHit = reader.nextInt();
        }
        //The random choosing for the legs
        if (choosingHit == 1) {
            for(int i = 0; i < 3; i++) {
            int j = 4;
            Random rand = new Random();
            int fChoose = rand.nextInt(j);
            System.out.println(legs.get(fChoose));
            legs.remove(fChoose);
            j = j - 1;
            int b = 4;
            int sChoose = rand.nextInt(b);
            System.out.println(otherLegs.get(sChoose));
            otherLegs.remove(sChoose);
            b =  b - 1;
            }
        }
        //biceps random choosing
        if (choosingHit == 2) {
            for(int i = 0; i < 3; i++) {
            int j = 4;
            Random rand = new Random();
            int fChoose = rand.nextInt(j);
            System.out.println(chest.get(fChoose));
            chest.remove(fChoose);
            j = j - 1;
            int b = 4;
            int sChoose = rand.nextInt(b);
            System.out.println(biceps.get(sChoose));
            biceps.remove(sChoose);
            b =  b - 1;
            }
        }
        //random choosing for back set
        if (choosingHit == 3) {
            for(int i = 0; i < 3; i++) {
            int j = 4;
            Random rand = new Random();
            int fChoose = rand.nextInt(j);
            System.out.println(back.get(fChoose));
            back.remove(fChoose);
            j = j - 1;
            int b = 4;
            int sChoose = rand.nextInt(b);
            System.out.println(triceps.get(sChoose));
            triceps.remove(sChoose);
            b =  b - 1;
            }
        }
        reader.close();
        System.out.print("Those are the areas to hit today!");
    }
}