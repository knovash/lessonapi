package com.solvd.lessonapi;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.api.annotation.Endpoint;
import com.qaprosoft.carina.core.foundation.api.annotation.RequestTemplatePath;
import com.qaprosoft.carina.core.foundation.api.annotation.ResponseTemplatePath;
import com.qaprosoft.carina.core.foundation.api.http.HttpMethodType;

@Endpoint(url = "${config.env.url}/repos/${owner}/lessonapi/issues/1", methodType = HttpMethodType.PATCH)
@RequestTemplatePath(path = "/api/users/get/rq_patch_issue.json")
@ResponseTemplatePath(path = "/api/users/get/rs_patch_issue.json")
public class PatchIssueMethod extends AbstractApiMethodV2 {
}
