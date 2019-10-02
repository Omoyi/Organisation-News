package models;

import java.text.SimpleDateFormat;
import java.util.Date;

public class NewsInfo {

    private String header;
    private String content;
    private int deptInfId;
    private String author;
    private int id;
    private long createdAt;
    private String formatCreatedAt;


    public NewsInfo(String header, String content, String author, long createdAt, String formatCreatedAt){
        this.content = content;
        this.header = header;
        this.author = author;
        this.createdAt = System.currentTimeMillis();;
        setFormatCreatedAt();
        this.deptInfId = deptInfId;
    }

    public String getHeader(){ return header; }
    public String getContent(){ return content; }
    public int getId() { return id; }
    public void setHeader(String header) { this.header = header; }
    public void setContent(String content) {  this.content = content; }
    public void setId(int id) { this.id = id; }
    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }
    public int getDeptInfId() { return deptInfId; }
    public void setDeptInfId(int deptInfId) { this.deptInfId = deptInfId; }
    public long getCreatedAt() { return createdAt; }

    public String getFormatCreatedAt(){
        Date dates = new Date(createdAt);
        String PatternToUse = "MM/dd/yyyy @ K:mm a";
        SimpleDateFormat sdf = new SimpleDateFormat(PatternToUse);
        return sdf.format(dates);
    }

    public void setFormatCreatedAt(){
        Date dates = new Date(this.createdAt);
        String PatternToUse = "MM/dd/yyyy @ K:mm a";
        SimpleDateFormat sdf = new SimpleDateFormat(PatternToUse);
        this.formatCreatedAt = sdf.format(dates);
    }
}
