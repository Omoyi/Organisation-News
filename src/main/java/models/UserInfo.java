package models;

public class UserInfo {
    private String name;
    private String post;
    private String department;
    private String role;
    private int deptInfId;
    private int id;

    public UserInfo(String post, String role, String name, String department, int departId){
        this.role = role;
        this.post = post;
        this.name = name;
        this.department = department;
        this.deptInfId = deptInfId;
    }

    public String getName() { return name; }
    public String getDepartment() { return department; }
    public String getRole(){ return role; }
    public void setPost(String post) { this.post = post; }
    public String getPost(){ return post; }
    public int getDepartId() { return deptInfId; }
    public void setDepartId(int departId) { this.deptInfId = departId; }
    public int getId() { return id; }

    public void setName(String name) { this.name = name; }

    public void setRole(String role) {
        this.role = role;
    }

    public void setContent(String content) {
        this.post = post;
    }

    public void setDepartment(String department) { this.department = department; }

    public void setId(int id) {
        this.id = id;
    }

}

