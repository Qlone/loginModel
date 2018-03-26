package com.qlone.login.dubbo.util;

import com.qlone.api.login.service.UserModelService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.UUID;

public class TokenUtil {
    private static final  Logger logger = LoggerFactory.getLogger(TokenUtil.class);
    private final static String privateKey = "heweinan";

    public static String getToken(String value){
        String UUid = UUID.randomUUID().toString().replace("-","");
        String res = value+"-"+UUid;
        try {
            String token = MD5.encrypt(res.substring(0,32),privateKey);
            return token;
        } catch (Exception e) {
            logger.info("token加密失败",e);
            return null;
        }
    }

    public static String getValue(String token){
        try {
            String res = MD5.decrypt(token,privateKey);
            logger.info("tokenRes:"+res);
            String[] value = res.split("-");
            return value.length>1 ? value[0] : null;
        } catch (Exception e) {
            logger.error("getValue",e);
            return null;
        }
    }
}
