package Task2;

import java.util.ArrayList;

public class Main{


public static void main(String[]args) {

    Room room1 = new Room(1, 2, 3);
    Room room2 = new Room(4, 5, 6);
    Room room3 = new Room(7, 8, 9);
    ArrayList<Room> rooms = new ArrayList<>();

    rooms.add(room1);
    rooms.add(room2);
    rooms.add(room3);

    Building building1 = new Building(rooms,2,3,true);

    System.out.println(countLampsInBuilding(building1));
    System.out.println(isNormal(building1));

}
    private static int countLampsInBuilding(Building building) {
        int numOfLamps = 0;
        for (int i = 0; i < building.getRooms().size(); i++) {
            numOfLamps += building.getRooms().get(i).getNumberOfLamps();
        }
        return numOfLamps;
    }
    private static boolean isNormal(Building building){
    if(building.getNumberOfFloors()>building.getRooms().size()){
        System.out.println("true");
        return true;
    }

    else
        System.out.println("this is an odd buildling");
        return false;
    }



}
