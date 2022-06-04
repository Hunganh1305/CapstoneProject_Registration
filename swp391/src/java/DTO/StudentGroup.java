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

    public StudentGroup() {
    }

    public StudentGroup(int id, int studentId, int groupId, int leaderStatus) {
        this.id = id;
        this.studentId = studentId;
        this.groupId = groupId;
        this.leaderStatus = leaderStatus;
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
    
}