package org.example.auth.futures.login;

public class LoginFactory {
    private static PhoneNumberPasswordLoginStrategy phoneNumberPasswordLoginStrategy;
    private static UsernamePasswordLoginStrategy usernamePasswordLoginStrategy;

    private LoginFactory() {
    }

    public static ILogin get(LoginType loginType) {
        if (loginType == LoginType.USERNAME) {
            if (usernamePasswordLoginStrategy == null) {
                usernamePasswordLoginStrategy = new UsernamePasswordLoginStrategy();
            }
            return usernamePasswordLoginStrategy;
        } else if (loginType == LoginType.PHONE_NUMBER) {
            if (phoneNumberPasswordLoginStrategy == null) {
                phoneNumberPasswordLoginStrategy = new PhoneNumberPasswordLoginStrategy();
            }
            return phoneNumberPasswordLoginStrategy;
        }
        throw new NullPointerException("loginType incorrect");
    }
}
