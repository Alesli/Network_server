package org.itstep.servlets;

import org.itstep.services.AdminService;
import org.itstep.services.UserService;
import org.itstep.services.impl.MessageServiceClassImpl;
import org.itstep.services.impl.RoomServiceClassImpl;
import org.itstep.services.impl.UserServiceClassImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public abstract class AbstractServlet extends HttpServlet{
   private AdminService adminService= UserServiceClassImpl.getInstance();
   private UserService userService= UserServiceClassImpl.getInstance();
   private RoomServiceClassImpl roomService = RoomServiceClassImpl.getInstance();
   private MessageServiceClassImpl messageService = MessageServiceClassImpl.getInstance();


   public RoomServiceClassImpl getRoomService() {
      return roomService;
   }

   public AdminService getAdminService() {
      return adminService;
   }

   public UserService getUserService() {
      return userService;
   }

    public MessageServiceClassImpl getMessageService() {
        return messageService;
    }

    protected Long getUserIdFromRequest(HttpServletRequest httpServletRequest){
        Long result =null;
        String user = httpServletRequest.getParameter("userId");
        if(user != null && !user.isEmpty()){
            result=Long.valueOf(httpServletRequest.getParameter("userId"));
        }
        return  result;
    }

    protected Long getMessageIdFromRequest(HttpServletRequest httpServletRequest){
        Long result =null;
        String user = httpServletRequest.getParameter("messageId");
        if(user != null && !user.isEmpty()){
            result=Long.valueOf(httpServletRequest.getParameter("messageId"));
        }
        return  result;
    }

    protected Long getOwnerIdFromRequest(HttpServletRequest httpServletRequest){
        Long result =null;
        String owner = httpServletRequest.getParameter("ownerId");
        if(owner != null && !owner.isEmpty()){
            result=Long.valueOf(httpServletRequest.getParameter("ownerId"));
        }
        return  result;
    }


    protected String getRoomCaptionRequest(HttpServletRequest httpServletRequest){
        String result =null;
        String caption = httpServletRequest.getParameter("caption");
        if(caption != null && !caption.isEmpty()){
            result=caption;
        }
        return  result;
    }

    protected void goTo(String path, HttpServletRequest req,
                        HttpServletResponse resp) throws IOException, ServletException {
        req.getServletContext().getRequestDispatcher(path).forward(req, resp);
    }

    protected void printToScreen(HttpServletResponse httpServletResponse, String text) throws IOException{
      httpServletResponse.getWriter().println(text);
    }
}
