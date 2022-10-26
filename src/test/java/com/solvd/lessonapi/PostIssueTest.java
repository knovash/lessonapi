package com.solvd.lessonapi;

import com.qaprosoft.carina.core.foundation.api.http.HttpResponseStatusType;
import com.qaprosoft.carina.core.foundation.utils.Configuration;
import org.testng.annotations.Test;

public class PostIssueTest {

    @Test(testName = "Verifies issue created 201")
    public void PostIssueTest(){
        PostIssueMethod postIssueMethod = new PostIssueMethod();
        postIssueMethod.addProperty("title", "Issue title");
        postIssueMethod.addProperty("body", "Issue body text");
        postIssueMethod.addProperty("labels", "Issue label");
        postIssueMethod.addProperty("owner", "knovash");
        postIssueMethod.setHeaders("Authorization=Bearer " + Configuration.getEnvArg("token"));
        postIssueMethod.expectResponseStatus(HttpResponseStatusType.CREATED_201);
        postIssueMethod.callAPI();
    }
}
