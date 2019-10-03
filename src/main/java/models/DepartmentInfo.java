package models;

public class DepartmentInfo {

    private String departmentname;
    private String description;
    private int nbrEmployees;
    private int id;

    public DepartmentInfo(String departmentname, String description, int nbrEmployees){
        this.departmentname = departmentname;
        this.description = description;
        this.nbrEmployees = nbrEmployees;
    }




    public String getDepartmentname() { return departmentname; }

    public void setDepartmentname(String departmentname) {
        this.departmentname = departmentname;
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
