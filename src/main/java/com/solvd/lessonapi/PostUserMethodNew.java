package com.solvd.lessonapi;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.api.annotation.Endpoint;
import com.qaprosoft.carina.core.foundation.api.annotation.RequestTemplatePath;
import com.qaprosoft.carina.core.foundation.api.annotation.ResponseTemplatePath;
import com.qaprosoft.carina.core.foundation.api.http.HttpMethodType;
import com.qaprosoft.carina.core.foundation.utils.Configuration;

@Endpoint(url = "${config.env.url}/users", methodType = HttpMethodType.POST)
@RequestTemplatePath(path = "/api/users/get/rq.json")
@ResponseTemplatePath(path = "/api/users/get/rs.json")
public class PostUserMethodNew extends AbstractApiMethodV2 {
}
