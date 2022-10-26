package com.solvd.lessonapi;

import com.qaprosoft.carina.core.foundation.api.http.HttpResponseStatusType;
import org.testng.annotations.Test;

public class PostIssueTest {

    @Test(testName = "Verifies issue created 201")
    public void PostIssueTest(){
        PostIssueMethod postIssueMethod = new PostIssueMethod();
        postIssueMethod.addProperty("title", "Issue title");
        postIssueMethod.addProperty("body", "Issue body text");
        postIssueMethod.addProperty("labels", "Issue label");
        postIssueMethod.setHeaders("Authorization=Bearer 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");
        postIssueMethod.expectResponseStatus(HttpResponseStatusType.CREATED_201);
        postIssueMethod.callAPI();
    }
}
