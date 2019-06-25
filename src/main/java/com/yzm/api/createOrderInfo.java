package com.yzm.api;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.utils.Configuration;

import java.util.Properties;

public class createOrderInfo extends AbstractApiMethodV2 {
    public createOrderInfo(){
        super("api/shipper/post/createOrderInfo_rq.json", null, new Properties());
        replaceUrlPlaceholder("base_url", Configuration.getEnvArg("base"));
    }
}
