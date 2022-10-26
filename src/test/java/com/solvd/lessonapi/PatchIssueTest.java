package com.solvd.lessonapi;

import com.qaprosoft.carina.core.foundation.api.http.HttpResponseStatusType;
import org.testng.annotations.Test;

public class PatchIssueTest {

    @Test(testName = "Verifies issue updated")
    public void PatchIssueTest(){
        PatchIssueMethod patchIssueMethod = new PatchIssueMethod();
        patchIssueMethod.addProperty("title", "Issue title Upd");
        patchIssueMethod.addProperty("body", "Issue body text Upd");
        patchIssueMethod.addProperty("labels", "Issue label Upd");
        patchIssueMethod.setHeaders("Authorization=Bearer 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");
        patchIssueMethod.expectResponseStatus(HttpResponseStatusType.OK_200);
        patchIssueMethod.callAPI();
        patchIssueMethod.validateResponse();
    }
}
