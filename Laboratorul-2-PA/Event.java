 public class Event {

    private String name;
    private int capacity;
    private int start;
    private int end;
    public Event() { }

    public Event(String name, int capacity, int start, int end) {
        this.name = name;
        this.capacity= capacity;
        this.start = start;
        this.end = end;
    }
//set and get for name,capacity,start , end
    public void setName(String name) {
        this.name = name;
    }
    public void setCapacity( int capacity){
        this.capacity=capacity;
    }
    public int getCapacity(){
        return capacity;
    }
    public void setStartTime(int start){
        this.start=start;
    }
    public int getStartTime(){
    return start;
    }
    public void setEndTime(int end){
    this.end=end;
    }
    public int getEndTime(){
      return end;
    }

    public String getName() {
        return name;
    }
     @Override
     public boolean equals(Object obj) {
         if (obj == null || !(obj instanceof Event)) {
             return false;
         }
         Event other = (Event) obj;
         return name.equals(other.name);
     }
     @Override
     public String toString() {
         return getName()+"( " + "size= " + getCapacity()+","+" start="
                 +getStartTime()+", "+"end=" +getEndTime()+")";
     }



}

