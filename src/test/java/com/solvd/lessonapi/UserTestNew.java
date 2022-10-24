package com.solvd.lessonapi;

import org.testng.annotations.Test;

public class UserTestNew {

    @Test
    public void createUserTest(){
        PostUserMethodNew postUserMethodNew = new PostUserMethodNew();
        postUserMethodNew.callAPI();
        postUserMethodNew.validateResponse();
    }
}
