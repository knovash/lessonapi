package com.solvd.lessonapi;

import com.qaprosoft.carina.core.foundation.api.http.HttpResponseStatusType;
import com.qaprosoft.carina.core.foundation.utils.Configuration;
import org.testng.annotations.Test;

public class PatchIssueTest {

    @Test(testName = "Verifies issue updated")
    public void PatchIssueTest(){
        PatchIssueMethod patchIssueMethod = new PatchIssueMethod();
        patchIssueMethod.addProperty("title", "Issue title Upd");
        patchIssueMethod.addProperty("body", "Issue body text Upd");
        patchIssueMethod.addProperty("labels", "Issue label Upd");
        patchIssueMethod.addProperty("owner", "knovash");
        patchIssueMethod.setHeaders("Authorization=Bearer " + Configuration.getEnvArg("token"));
        patchIssueMethod.expectResponseStatus(HttpResponseStatusType.OK_200);
        patchIssueMethod.callAPI();
        patchIssueMethod.validateResponse();
    }
}
