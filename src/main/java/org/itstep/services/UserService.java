package org.itstep.services;

import org.itstep.model.User;

public interface UserService {

    User addPicture(Long userId, byte[] picture);
    User deletePicture(Long userId);
    User setNickname(Long userId, String nickname);

}
