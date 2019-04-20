package org.itstep.services;

import org.itstep.model.Room;
import org.itstep.model.User;

import java.util.Collection;

public interface RoomService {

    final static Long PRIVATE_ROOM_MAX_USER = 2L;

    Room createRoom(String caption, String password, User owner, Long maxUser);

    Room changeCaption(Room room, String newCaption, User owner);

    Boolean deleteRoom(Room room, User owner);

    Boolean addUserToRoom(Room room, User user, User owner);

    Boolean leaveRoom(Room room, User user, User owner);

    Boolean setMaxUser(Room room, User owner, Long maxUser);

    Collection<Room> getAllPublicRoom();

    Collection<User> getUsersFromRoom(Room room);

    Room getRoomFromCaption(String caption);

    Boolean checkExistUserInToRoom(Room room, User user);

    Collection<Room> getAllRoom();

    Boolean isPublicRoom(Room room);

    String getDefaultRoomCaption();
}
