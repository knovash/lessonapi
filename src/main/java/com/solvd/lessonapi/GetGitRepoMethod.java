package com.solvd.lessonapi;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.api.annotation.Endpoint;
import com.qaprosoft.carina.core.foundation.api.annotation.ResponseTemplatePath;
import com.qaprosoft.carina.core.foundation.api.http.HttpMethodType;

@Endpoint(url = "${config.env.url}/repos/knovash/lessonapi", methodType = HttpMethodType.GET)
//@Endpoint(url = "https://api.github.com/repos/knovash/lessonapi", methodType = HttpMethodType.GET)
//@RequestTemplatePath(path = "/api/users/get/rq_repo.json")
@ResponseTemplatePath(path = "/api/users/get/rs_repo.json")
public class GetGitRepoMethod extends AbstractApiMethodV2 {
}
