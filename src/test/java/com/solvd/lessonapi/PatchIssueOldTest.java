package com.solvd.lessonapi;

import com.qaprosoft.carina.core.foundation.api.http.HttpResponseStatusType;
import com.qaprosoft.carina.core.foundation.utils.Configuration;
import org.testng.annotations.Test;

public class PatchIssueOldTest {

    @Test(testName = "Verifies issue updated")
    public void PatchIssueTest(){
        PatchIssueOldMethod patchIssueOldMethod = new PatchIssueOldMethod();
        patchIssueOldMethod.addProperty("title", "Issue title Upd Old");
        patchIssueOldMethod.addProperty("body", "Issue body text Upd Old");
        patchIssueOldMethod.addProperty("labels", "Issue label Upd Old");
        patchIssueOldMethod.addProperty("owner", "knovash");
        patchIssueOldMethod.setHeaders("Authorization=Bearer " + Configuration.getEnvArg("token"));
        patchIssueOldMethod.expectResponseStatus(HttpResponseStatusType.OK_200);
        patchIssueOldMethod.callAPI();
        patchIssueOldMethod.validateResponse();
    }
}
