package io.hasanSbaih.usecase

import UserRegistrationUseCase
import io.hasanSbaih.UseCase
import io.hasanSbaih.usermodule.gateway.UserGateway
import io.hasanSbaih.usermodule.model.User
import io.hasanSbaih.usermodule.usecase.user.registration.UserRegistrationRequest
import io.hasanSbaih.usermodule.usecase.user.registration.UserRegistrationUseCase
import spock.lang.Specification

/**
 * Created by u562 on 11/12/2016.
 */
class UserRegistrationUseCaseSpec extends Specification {

    def "execute User Registration Use Case"() {
        expect:
        UseCase userRegistrationUseCase = new UserRegistrationUseCase(new UserGateway() {
            @Override
            void addUser(User user) {

            }

            @Override
            void retriveUserByUserID(long userID) {

            }
        });
        userRegistrationUseCase.execute(new UserRegistrationRequest());
    }

}
