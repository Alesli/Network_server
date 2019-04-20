package org.itstep.servlets.user;

import org.itstep.servlets.AbstractServlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/addAdmin")
public class AddAdmin extends AbstractServlet {

    // http://localhost:9091/addAdmin?userId=2&admin=true
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String user = req.getParameter("userId");
        String isAdmin = req.getParameter("admin");

        if (isAdmin != null && user != null && !user.isEmpty()) {
            Long res = Long.valueOf(user);
            Boolean admin = Boolean.valueOf(isAdmin);
            getAdminService().setAdmin(res, admin);
        }
        goTo("/showAll", req, resp);
    }
}
