public class Main {
    public static void main(String[] args) {



        Event c1 = new Event();
        //
        c1.setName("C1");
        c1.setCapacity(100);
        c1.setStartTime(8);
        c1.setEndTime(10);

        Event c2 = new Event("C2", 100, 8, 10);
        Event l1 = new Event("L1", 30, 8, 10);
        Event l2 = new Event("L2", 30, 8, 10);
        Event l3 = new Event("L3", 30, 10, 12);


        System.out.println("Events:"+c1+","+c2+","+l1+","+l2+","+l3);

        Room[] room = new Room[2];
        room[0]= new LectureHall();
        room[1]= new ComputerLab();

        System.out.println();

    }
}