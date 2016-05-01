/**
 * Created by Malcolm on 4/10/2016.
 */

public class ClassObj {

    protected FileManager fm;
    protected String name, instructor, building;
    protected int time, credits, room;

    public ClassObj(String name, String instructor, int time, int credits, String building, int room) {
        this.name = name;
        this.instructor = instructor;
        this.time = time;
        this.credits = credits;
        this.building = building;
        this.room = room;

        this.fm = new FileManager();
    }


    public String getName() {
        return this.name;
    }

    public String getInstructor(){
        return this.instructor;
    }

    public int getTime(){
        return this.time;
    }

    public int getCredits() {
        return credits;
    }

    public String getBuilding() {
        return building;
    }

    public int getRoom() {
        return room;
    }

    public void setName(String name) {this.name = name;}
    public void setInstructor(String instructor){this.instructor = instructor;}
    public void setTime(int time) {this.time = time;}
    public void setCredits(int credits) {this.credits = credits;}
    public void setBuilding(String building){this.building = building;}
    public void setRoom(int room){this.room = room;}

    public void send_db_string(){
        fm.write_string("this.name" + "," + this.instructor + "," + this.time + "," + this.credits + "," + this.building + "," + this.room);
    }

    public String toString(){
        return "this.name" + "|" + this.instructor + "|" + this.time + "|" + this.credits + "|" + this.building + "|" + this.room;
    }

}
