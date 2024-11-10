package org.example.auth.futures.login;

public class LoginProxy {
    private static PhoneNumberPasswordLoginStrategy phoneNumberPasswordLoginStrategy;
    private static UsernamePasswordLoginStrategy usernamePasswordLoginStrategy;

    private LoginProxy() {
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
