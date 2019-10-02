package models;

public class UserInfo {
    private String name;
    private String post;
    private String department;
    private String role;
    private int id;

    public UserInfo(String post, String role, String name, String department){
        this.role = role;
        this.post = post;
        this.name = name;
        this.department = department;
    }

    public String getName() { return name; }

    public String getDepartment() { return department; }

    public String getPost(){
        return post;
    }

    public String getRole(){
        return role;
    }

    public int getId() {
        return id;
    }

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

