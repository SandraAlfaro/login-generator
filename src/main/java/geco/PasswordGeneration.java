package geco;

import org.apache.commons.lang3.RandomStringUtils;

public class PasswordGeneration {

    public String getRandomPassword() {
         return RandomStringUtils.randomAlphanumeric(8);
    }

}
