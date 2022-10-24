package com.solvd.lessonapi;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.utils.Configuration;

public class PostUserMethod extends AbstractApiMethodV2 {

    public PostUserMethod() {
        super("/api/users/get/rq.json", "/api/users/get/rs.json");
        replaceUrlPlaceholder("base_url", Configuration.getEnvArg("url"));
    }
}
