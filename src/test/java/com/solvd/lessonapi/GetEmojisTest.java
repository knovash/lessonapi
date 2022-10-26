package com.solvd.lessonapi;

import org.testng.annotations.Test;
public class GetEmojisTest {

    @Test(testName = "Verifies emojis json response")
    public void GetEmojisTest(){
        GetEmojisMethod getEmojisMethod = new GetEmojisMethod();
        getEmojisMethod.callAPI();
        getEmojisMethod.validateResponse();
    }
}
