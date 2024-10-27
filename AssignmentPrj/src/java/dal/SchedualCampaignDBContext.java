/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package dal;

import entity.production.SchedualCampaign;
import java.util.ArrayList;

import entity.production.SchedualCampaign;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Admin
 */
public class SchedualCampaignDBContext extends DBContext<SchedualCampaign>{

     @Override
    public void insert(SchedualCampaign entity) {
        try {
            String sql = "INSERT INTO [SchedualCampaign] ([PlanCampnID], [Date], [Shift], [Quantity]) VALUES (?, ?, ?, ?)";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, entity.getPlanCampnID());
            stm.setDate(2, entity.getDate());
            stm.setInt(3, entity.getShift());
            stm.setInt(4, entity.getQuantity());
            stm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(SchedualCampaignDBContext.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                connection.close();
            } catch (SQLException ex) {
                Logger.getLogger(SchedualCampaignDBContext.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }


    @Override
    public void update(SchedualCampaign entity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(SchedualCampaign entity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<SchedualCampaign> list() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public SchedualCampaign get(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    

}
