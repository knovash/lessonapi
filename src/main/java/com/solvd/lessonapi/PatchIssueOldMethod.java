package com.solvd.lessonapi;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.api.annotation.Endpoint;
import com.qaprosoft.carina.core.foundation.api.annotation.RequestTemplatePath;
import com.qaprosoft.carina.core.foundation.api.annotation.ResponseTemplatePath;
import com.qaprosoft.carina.core.foundation.api.http.HttpMethodType;
import com.qaprosoft.carina.core.foundation.utils.Configuration;
@Endpoint(url = "${config.env.url}/repos/${config.env.owner}/${config.env.repo}/issues/1", methodType = HttpMethodType.PATCH)
@RequestTemplatePath(path = "/api/users/get/rq_patch_issue.json")
@ResponseTemplatePath(path = "/api/users/get/rs_patch_issue.json")
public class PatchIssueOldMethod extends AbstractApiMethodV2 {

    public PatchIssueOldMethod() {
        super("/api/users/get/rq_patch_issue.json", "/api/users/get/rs_patch_issue.json");
        replaceUrlPlaceholder("base_url", Configuration.getEnvArg("url"));
    }
}
