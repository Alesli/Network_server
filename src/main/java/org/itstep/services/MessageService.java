package org.itstep.services;

import org.itstep.model.Message;
import org.itstep.model.Room;
import org.itstep.model.User;

import java.util.Collection;

public interface MessageService {

    Boolean sendTextMessage(Room room, User user, String message);
    Boolean sendPicture(Room room, User user, byte[] picture);
    Boolean changeMessage(Long messageId, User owner, String newMessage);
    Boolean deleteMessage(Long messageId, User owner);
    Collection<Message> getMessagesFromRoom(Room room , Integer lastCount);


}
