
package entity.production;

import java.sql.Date;

public class SchedualCampaign {
    private int scID;
    private int planCampnID;
    private Date date;
    private int shift;
    private int quantity;

    public SchedualCampaign() {
    }

    // Constructors, Getters, and Setters
    public SchedualCampaign(int scID, int planCampnID, Date date, int shift, int quantity) {
        this.scID = scID;
        this.planCampnID = planCampnID;
        this.date = date;
        this.shift = shift;
        this.quantity = quantity;
    }

    public int getScID() {
        return scID;
    }

    public void setScID(int scID) {
        this.scID = scID;
    }

    public int getPlanCampnID() {
        return planCampnID;
    }

    public void setPlanCampnID(int planCampnID) {
        this.planCampnID = planCampnID;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getShift() {
        return shift;
    }

    public void setShift(int shift) {
        this.shift = shift;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
