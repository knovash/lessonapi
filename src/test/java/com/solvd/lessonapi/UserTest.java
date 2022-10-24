package com.solvd.lessonapi;

import org.testng.annotations.Test;

public class UserTest {

    @Test
    public void createUserTest(){
        PostUserMethod postUserMethod = new PostUserMethod();
        postUserMethod.callAPI();
        postUserMethod.validateResponse();
    }
}
