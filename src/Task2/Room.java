package Task2;

import java.util.ArrayList;

public class Room {
            private int numberOfDoors;
            private int numberOfLamps;
            private int numberOfWindows;

            public Room(int numberOfDoors, int numberOfWindows, int numberOfLamps){
                this.numberOfDoors = numberOfDoors;
                this.numberOfWindows=numberOfWindows;
                this.numberOfLamps=numberOfLamps;
            }
            //getters
            public int getNumberOfDoors(){
                return numberOfDoors;
            }
            public int getNumberOfWindows(){
                return numberOfWindows;
            }
            public int getNumberOfLamps(){
                return numberOfLamps;
    }


}
