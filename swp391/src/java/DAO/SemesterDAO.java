/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.Semester;
import Utils.DBUtils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author SE161714 Ha Anh Tu
 */
public class SemesterDAO {

    public static ArrayList<Semester> readAll() {
        Connection cn = null;
        ArrayList<Semester> list = new ArrayList<>();
        try {
            cn = DBUtils.makeConnection();
            if (cn != null) {
                String sql = "select *\n"
                        + "from dbo.Semester\n";
                Statement st = cn.createStatement();
                ResultSet rs = st.executeQuery(sql);
                while (rs.next()) {
                    int semID = rs.getInt("semesterId");
                    String name = rs.getString("name");
                    Date startDate = rs.getDate("startDate");
                    Date endDate = rs.getDate("endDate");
                    int topicId = rs.getInt("topicId");
                    Semester sem = new Semester(semID, name, startDate, endDate, topicId);
                    list.add(sem);
                }
                cn.close();
            }
        } catch (Exception e) {
            e.getStackTrace();
        }
        return list;
    }

    public static Semester read(Object id) {
        Connection cn = null;
        Semester sem = null;
        try {
            cn = DBUtils.makeConnection();
            if (cn != null) {
                String sql = "select * from dbo.Semester where SemesterId=?";
                PreparedStatement stm = cn.prepareStatement(sql);
                stm.setString(1, id.toString());
                ResultSet rs = stm.executeQuery();
                if (rs.next()) {
                    sem = new Semester();
                    sem.setSemesterId(rs.getInt("semesterId"));
                    sem.setName(rs.getString("name"));
                    sem.setStartDate(rs.getDate("startDate"));
                    sem.setEndDate(rs.getDate("endDate"));
                    sem.setTopicId(rs.getInt("topicId"));

                }
                cn.close();
            }
        } catch (Exception e) {
            e.getStackTrace();
        }
        return sem;
    }

    public static void create(Semester sem) {
        Connection cn = null;
        try {
            cn = DBUtils.makeConnection();
            if (cn != null) {
                String sql = "insert into dbo.Semester values(?, ?, ?, ?, ?)";
                PreparedStatement stm = cn.prepareStatement(sql);
                stm.setInt(1, sem.getSemesterId());
                stm.setString(2, sem.getName());
                SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
                stm.setString(3, df.format(sem.getStartDate()));
                stm.setString(4, df.format(sem.getEndDate()));
                stm.setInt(5, sem.getTopicId());
                stm.executeUpdate();
                cn.close();
            }
        } catch (Exception e) {
            e.getStackTrace();
        }
    }

    public static void update(Semester sem) {
        Connection cn = null;
        try {
            cn = DBUtils.makeConnection();
            if (cn != null) {
                String sql = "update dbo.Semester set Name=?,StartDate=?,EndDate=?,TopicId=? where SemesterId=?";
                PreparedStatement stm = cn.prepareStatement(sql);
                stm.setString(1, sem.getName());
                SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
                stm.setString(2, df.format(sem.getStartDate()));
                stm.setString(3, df.format(sem.getEndDate()));
                stm.setInt(4, sem.getTopicId());
                stm.setInt(5, sem.getSemesterId());
                stm.executeUpdate();
                cn.close();
            }
        } catch (Exception e) {
            e.getStackTrace();
        }
    }

    public static void delete(Object id) {
        Connection cn = null;
        try {
            cn = DBUtils.makeConnection();
            if (cn != null) {
                String sql = "delete dbo.Semester where SemesterId=?";
                PreparedStatement stm = cn.prepareStatement(sql);
                stm.setString(1, id.toString());
                stm.executeUpdate();
                cn.close();
            }
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}