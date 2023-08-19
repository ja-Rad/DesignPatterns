package patterns.structural.composite.challenge;

import java.util.ArrayList;
import java.util.List;

public class Supervisor implements Faculty {

    private String name;
    private String departmentName;
    private List<Faculty> facultyMembers;

    public Supervisor(String name, String departmentName) {
        this.name = name;
        this.departmentName = departmentName;
        this.facultyMembers = new ArrayList<>();
    }

    public void addMember(Faculty faculty) {
        facultyMembers.add(faculty);
    }

    public void removeMember(Faculty faculty) {
        facultyMembers.remove(faculty);
    }

    public List<Faculty> getFacultyMembers() {
        return facultyMembers;
    }

    @Override
    public String getDetails() {
        return this.name + " is the " + this.departmentName;
    }
}
