package utils;

import org.apache.commons.lang3.RandomStringUtils;

public class DataUtils {
    public String generateRandomString() {
        return new RandomStringUtils().nextAlphabetic(10);
    }
}
