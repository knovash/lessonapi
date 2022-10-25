package com.solvd.lessonapi;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.utils.Configuration;

public class PostUserMethod extends AbstractApiMethodV2 {

    public PostUserMethod() {
        super("/api/users/get/rq_user_test.json", "/api/users/get/rs_user_test.json");
        replaceUrlPlaceholder("base_url", "https://jsonplaceholder.typicode.com");
    }
}
