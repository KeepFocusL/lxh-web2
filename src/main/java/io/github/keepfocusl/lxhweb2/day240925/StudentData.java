package io.github.keepfocusl.lxhweb2.day240925;

public class StudentData {
    String name;
    String sex;

    public StudentData(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
