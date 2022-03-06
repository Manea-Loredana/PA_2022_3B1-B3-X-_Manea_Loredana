public class Main {
    public static void main(String[] args) {

        Event[] event = new Event[5];
        event[0] = new Event("C1", 100, 8, 10);
        event[1] = new Event("C2", 100, 10, 12);
        event[2] = new Event("L1", 30, 8, 10);
        event[3] = new Event("L2", 30, 8, 10);
        event[4] = new Event("L3", 30, 10, 12);

        Room[] room = new Room[4];
        room[0] = new LectureHall("309", 100, true);
        room[1] = new ComputerLab("404", 30, "Linux");
        room[2] = new ComputerLab("403", 30, "Windows");
        room[3] = new ComputerLab("405", 30, "Windows");

        Problem pb = new Problem(event, room);
        System.out.println(pb);
        Solution solve = new Solution();
        solve.computeUsedRooms(pb);
        System.out.println(solve);

    }
}