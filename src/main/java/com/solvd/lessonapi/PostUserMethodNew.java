package com.solvd.lessonapi;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.api.annotation.Endpoint;
import com.qaprosoft.carina.core.foundation.api.http.HttpMethodType;
import com.qaprosoft.carina.core.foundation.utils.Configuration;

@Endpoint(url = "${base_url}/users", methodType = HttpMethodType.POST)
public class PostUserMethodNew extends AbstractApiMethodV2 {

    public PostUserMethodNew() {
        super("/api/users/get/rq.json", "/api/users/get/rs.json");
        replaceUrlPlaceholder("base_url", Configuration.getEnvArg("url"));
    }
}
