package models;

public class DepartmentInfo {

    private String departmentName;
    private String description;
    private int numberOfEmployees;
    private int id;

    public DepartmentInfo(String departmentName, String description, int numberOfEmployees, int id){
        this.departmentName = departmentName;
        this.description = description;
        this.numberOfEmployees = numberOfEmployees;
        this.id = id;
    }

    public String getDepartmentName() { return departmentName; }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDescription() { return description; }

    public void setDescription(String description) { this.description = description; }

    public int getNumberOfEmployees() { return numberOfEmployees; }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    public int getId() { return id; }

    public void setId(int id) { this.id = id; }
}
