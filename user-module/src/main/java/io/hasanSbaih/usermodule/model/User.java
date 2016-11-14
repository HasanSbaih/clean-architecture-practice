package io.hasanSbaih.usermodule.model;

/**
 * Created by u562 on 11/12/2016.
 */
public class User {

    public Long userID;
    public String userName;
    public String password;


    public static class Builder {
        private Long userID;
        private String password;
        private String userName;

        public Builder setUserID(Long userID) {
            this.userID = userID;
            return this;
        }

        public Builder setPassword(String password) {
            this.password = password;
            return this;
        }

        public Builder setUserName(String userName) {
            this.userName = userName;
            return this;
        }

        public User build() {
            User user = new User();
            user.userName = this.userName;
            user.password = this.password;
            user.userID = this.userID;
            return user;
        }
    }
}
