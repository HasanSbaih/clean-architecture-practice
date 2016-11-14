package io.hasanSbaih.usermodule.usecase.user.registration;

import io.hasanSbaih.usecase.CommandUseCase;
import io.hasanSbaih.usermodule.gateway.UserGateway;
import io.hasanSbaih.usermodule.model.User;

/**
 * Created by u562 on 11/12/2016.
 */
public class UserRegistrationUseCase implements CommandUseCase<UserRegistrationRequest> {

    private UserGateway userGateway;

    public UserRegistrationUseCase(UserGateway userGateway) {
        this.userGateway = userGateway;
    }

    public void execute(UserRegistrationRequest request) {
        registerNewUserToTheUsersStore(request);
    }

    private void registerNewUserToTheUsersStore(UserRegistrationRequest request) {
        userGateway.addUser(new User.Builder().setUserName(request.userName).setPassword(request.password).build());
    }
}
