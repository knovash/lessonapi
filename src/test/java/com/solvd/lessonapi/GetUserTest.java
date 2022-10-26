package com.solvd.lessonapi;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.solvd.lessonapi.domain.User;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class GetUserTest {

    private static final Logger LOGGER = LogManager.getLogger(GetUserTest.class);

    @DataProvider(name = "UserLogins")
    public Object[][] userLogins() {
        return new Object[][]{
                {"knovash"},
                {"knovash1"},
                {"knovash2"},
        };
    }

    @Test(testName = "Verifies user login and name", dataProvider = "UserLogins", enabled = true)
    public void GetUserTest(String login) throws JsonProcessingException {
        GetUserMethod getUserMethod = new GetUserMethod();
        getUserMethod.callAPI();
        String rs = getUserMethod.callAPI().asString();
        ObjectMapper om = new ObjectMapper();
        User user = om.readValue(rs, User.class);
        LOGGER.info("Login: " + user.getLogin());
        LOGGER.info("Name: " + user.getName());
        SoftAssert sa = new SoftAssert();
        sa.assertEquals(user.getLogin(), login, "User login is not knovash");
        sa.assertEquals(user.getName(), "Konstantin ", "User name is not Konstantin");
        sa.assertAll();
    }
}
