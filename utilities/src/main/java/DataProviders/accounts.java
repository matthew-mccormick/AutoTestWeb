package DataProviders;

import org.testng.annotations.DataProvider;

public class accounts {
    @DataProvider(name = "Existing Users")
    public static Object[][] existingUsers()
    {
        return new Object[][]{{"Testing123@testmail.com", "s3cur3P4ssw0rd"},{"Testing321@testmail.com","v3rys3cur3P4ssw0rd@"}};
    }
}
