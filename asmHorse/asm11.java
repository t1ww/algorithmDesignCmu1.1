package asmHorse;

import java.util.Collections;
import java.util.Vector;

public class asm11 {
    public static void main(String[] args) {
        // creating 25 horses with rank in order
        Vector<horse> horseList = new Vector<horse>();
        for (int i = 0; i < 25; i++) {
            horseList.add(new horse(i+1)); // set rank
        }
        Collections.shuffle(horseList);
        for (int i = 0; i < 25; i++) {
            horseList.get(i).setNumber(i);;
        }
        Collections.shuffle(horseList);
        //// we pick 5 random to race (compare rank)
        int raceCount = 0;
        /// first race
        Vector<horse> racingHorses = new Vector<horse>();
        raceCount++;
        for(int i = 0 ; i<5; i++){
            racingHorses.add(horseList.get(i));
            //remove the horse from list;
            horseList.remove(i);
        }
        /// now we have racing horse we get the top by sorting
        Collections.sort(racingHorses);
        /// and then we do the loop
        while(!horseList.isEmpty()){ // while more horse in list
            /// replace bot 2 ( array index 3,4 )
            racingHorses.set(3, horseList.get(0));
            horseList.remove(0);
            if(!horseList.isEmpty()){
                racingHorses.set(4, horseList.get(0));
                horseList.remove(0);
            }
            /// race
            raceCount++;
            Collections.sort(racingHorses);
        }
        /// after this loop we'll have true top3 in the list of 
        System.out.println("top1 : " + racingHorses.get(0));
        System.out.println("top2 : " + racingHorses.get(1));
        System.out.println("top3 : " + racingHorses.get(2));
        System.out.println("total races is : " + raceCount);
    }
}
