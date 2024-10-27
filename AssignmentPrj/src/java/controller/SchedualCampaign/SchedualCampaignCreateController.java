package controller.SchedualCampaign;

import entity.production.SchedualCampaign;
import dal.SchedualCampaignDBContext;
import controller.accesscontrol.BaseRBACController;
import dal.PlanCampaignDBContext;
import entity.accesscontrol.User;
import java.io.IOException;
import java.sql.Date;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.List;

public class SchedualCampaignCreateController extends BaseRBACController {

    @Override
    protected void doAuthorizedGet(HttpServletRequest req, HttpServletResponse resp, User account) throws ServletException, IOException {
        int planCampnID = Integer.parseInt(req.getParameter("planCampnID"));
        PlanCampaignDBContext planCampaignDB = new PlanCampaignDBContext();
        List<Date> dates = planCampaignDB.getDateByplanCampnID(planCampnID);
        req.setAttribute("dates", dates);
        req.getRequestDispatcher("../view/schedualcampaign/create.jsp").forward(req, resp);
    }

    @Override
    protected void doAuthorizedPost(HttpServletRequest req, HttpServletResponse resp, User account) throws ServletException, IOException {
        int planCampnID = Integer.parseInt(req.getParameter("planCampnID"));
        String[] dates = req.getParameterValues("date");
        String[] shifts = req.getParameterValues("shift");
        String[] quantities = req.getParameterValues("quantity");

        if (dates != null && dates.length > 0 && shifts != null && shifts.length > 0 && quantities != null && quantities.length > 0) {
            SchedualCampaignDBContext schedualCampaignDB = new SchedualCampaignDBContext();
            for (int i = 0; i < dates.length; i++) {
                SchedualCampaign schedualCampaign = new SchedualCampaign();
                schedualCampaign.setPlanCampnID(planCampnID);
                schedualCampaign.setDate(Date.valueOf(dates[i]));
                schedualCampaign.setShift(Integer.parseInt(shifts[i]));
                schedualCampaign.setQuantity(Integer.parseInt(quantities[i]));
                schedualCampaignDB.insert(schedualCampaign);
            }
            resp.getWriter().println("Your plan campaign has been created successfully!");
        } else {
            resp.getWriter().println("Your plan campaign does not have any dates, shifts, or quantities specified.");
        }
    }

}
