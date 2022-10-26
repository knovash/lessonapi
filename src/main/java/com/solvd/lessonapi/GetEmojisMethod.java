package com.solvd.lessonapi;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.api.annotation.Endpoint;
import com.qaprosoft.carina.core.foundation.api.annotation.ResponseTemplatePath;
import com.qaprosoft.carina.core.foundation.api.http.HttpMethodType;

@Endpoint(url = "${config.env.url}/emojis", methodType = HttpMethodType.GET)
@ResponseTemplatePath(path = "api/users/get/rs_get_emojis.json")
public class GetEmojisMethod extends AbstractApiMethodV2 {
}
