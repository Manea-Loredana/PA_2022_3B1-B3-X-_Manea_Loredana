public class Main {
    public static void main(String[] args) {

        //test setter from Event
        Event c1 = new Event();
        c1.setName("C1");
        c1.setCapacity(100);
        c1.setStartTime(8);
        c1.setEndTime(10);

        Event c2 = new Event("C2", 100, 8, 10);
        Event l1 = new Event("L1", 30, 8, 10);
        Event l2 = new Event("L2", 30, 8, 10);
        Event l3 = new Event("L3", 30, 10, 12);

        //test setter from Room
         Room r1=new Room();
         r1.setName("401");
         r1.setType(RoomType.COMPUTER_LAB);
         r1.setCap(30);

        Room r2 = new Room("403",RoomType.COMPUTER_LAB,30);
        Room r3 = new Room("405",RoomType.COMPUTER_LAB,30);
        Room r4 = new Room("309",RoomType.LECTURE_HALL,100);
       //print nice exactly like the example form lab
        System.out.println("Events:"+c1+","+c2+","+l1+","+l2+","+l3);

        System.out.println("Rooms:"+r1+","+r2+","+r3+","+r4);


    }
}