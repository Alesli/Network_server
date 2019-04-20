package org.itstep.servlets.user;

import org.itstep.servlets.AbstractServlet;
import org.itstep.thymeleaf.TemplateEngineUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/addUser")
public class AddUser extends AbstractServlet {

   // http://localhost:9091/addUser?login=Vita&password=961&name=Vita&lastName=Ivanova
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        String login = req.getParameter("login");
        String password = req.getParameter("password");
        String name = req.getParameter("name");
        String lastName = req.getParameter("lastName");
        if (getAdminService().createUser(login, password, name, lastName) == null) {
            resp.getWriter().println("User wasn't create");
        } else {
            goTo("/adminPage", req, resp);
        }

//        req.getRequestDispatcher("/showAll").forward(req, resp);

//        resp.getWriter().println(user.toString());
    }
}
