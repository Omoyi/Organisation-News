package models;

public class DepartmentInfo {

    private String departmentName;
    private String description;
    private int nbrEmployees;
    private int id;

    public DepartmentInfo(String departmentName, String description, int nbrEmployees){
        this.departmentName = departmentName;
        this.description = description;
        this.nbrEmployees = nbrEmployees;
    }




    public String getDepartmentName() { return departmentName; }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDescription() { return description; }

    public void setDescription(String description) { this.description = description; }

    public int getNbrEmployees() { return nbrEmployees; }

    public void setNbrEmployees(int nbrEmployees) {
        this.nbrEmployees = nbrEmployees;
    }

    public int getId() { return id; }

    public void setId(int id) { this.id = id; }


}
