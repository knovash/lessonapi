package com.solvd.lessonapi;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.api.annotation.Endpoint;
import com.qaprosoft.carina.core.foundation.api.annotation.RequestTemplatePath;
import com.qaprosoft.carina.core.foundation.api.http.HttpMethodType;

@Endpoint(url = "${config.env.url}/repos/${config.env.owner}/${config.env.repo}/issues", methodType = HttpMethodType.POST)
@RequestTemplatePath(path = "/api/users/get/rq_post_issue.json")
public class PostIssueMethod extends AbstractApiMethodV2 {
}
