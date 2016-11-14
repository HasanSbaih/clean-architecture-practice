package io.hasanSbaih.usermodule.gateway;

import io.hasanSbaih.usermodule.model.User;

/**
 * Created by u562 on 11/13/2016.
 */
public interface UserGateway {

    void addUser(User user);

    void retriveUserByUserID(long userID);

}
