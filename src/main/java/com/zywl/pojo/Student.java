package com.zywl.pojo;

public class Student {
    private String stuno;

    private Long id;

    private String pwd;

    private String stuname;

    private String phone;

    private String colleage;

    private String classname;

    public String getStuno() {
        return stuno;
    }

    public void setStuno(String stuno) {
        this.stuno = stuno == null ? null : stuno.trim();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd == null ? null : pwd.trim();
    }

    public String getStuname() {
        return stuname;
    }

    public void setStuname(String stuname) {
        this.stuname = stuname == null ? null : stuname.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getColleage() {
        return colleage;
    }

    public void setColleage(String colleage) {
        this.colleage = colleage == null ? null : colleage.trim();
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {

        this.classname = classname == null ? null : classname.trim();
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuno='" + stuno + '\'' +
                ", id=" + id +
                ", pwd='" + pwd + '\'' +
                ", stuname='" + stuname + '\'' +
                ", phone='" + phone + '\'' +
                ", colleage='" + colleage + '\'' +
                ", classname='" + classname + '\'' +
                '}';
    }
}