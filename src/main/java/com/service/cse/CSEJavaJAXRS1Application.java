package com.service.cse;

import org.apache.servicecomb.foundation.common.utils.BeanUtils;
import org.apache.servicecomb.foundation.common.utils.Log4jUtils;

public class CSEJavaJAXRS1Application {
    public static void main(String[] args) throws Exception {
        Log4jUtils.init();
        BeanUtils.init(BeanUtils.DEFAULT_BEAN_RESOURCE, "classpath*:META-INF/spring/*.server.xml");
    }
}
