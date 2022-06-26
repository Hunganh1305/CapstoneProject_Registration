/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author HLong
 */
public class StudentGroup {
    private int id;
    private int studentId;
    private int groupId;
    private int leaderStatus;    
    private Users user;
    private Department department;
    private Project project;
    private Groups group;
    

    public StudentGroup() {
    }

    public StudentGroup(int id, int studentId, int groupId, int leaderStatus, Users user, Department department, Project project, Groups group) {
        this.id = id;
        this.studentId = studentId;
        this.groupId = groupId;
        this.leaderStatus = leaderStatus;
        this.user = user;
        this.department = department;
        this.project = project;
        this.group = group;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public int getLeaderStatus() {
        return leaderStatus;
    }

    public void setLeaderStatus(int leaderStatus) {
        this.leaderStatus = leaderStatus;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public Groups getGroup() {
        return group;
    }

    public void setGroup(Groups group) {
        this.group = group;
    }

    

    

    

   

    
    
}

   