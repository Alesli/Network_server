package org.itstep.servlets.room;

import org.itstep.model.Room;
import org.itstep.model.User;
import org.itstep.servlets.AbstractServlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/getAllUsersFromRoom")
public class GetAllUsersFromRoom extends AbstractServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

//        http://localhost:9091/getAllUsersFromRoom?roomId=1

        Room room = getRoomService().getRoomFromCaption(getRoomCaptionRequest(req));

        for (User user : getRoomService().getUsersFromRoom(room)) {
            printToScreen(resp,user.toString());
        }


    }
}
