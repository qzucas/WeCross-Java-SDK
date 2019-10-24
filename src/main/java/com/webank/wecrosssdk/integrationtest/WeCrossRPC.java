package com.webank.wecrosssdk.integrationtest;

import com.webank.wecrosssdk.integrationtest.methods.ResourcesResponse;
import com.webank.wecrosssdk.integrationtest.methods.Response;
import com.webank.wecrosssdk.integrationtest.methods.TransactionResponse;

public interface WeCrossRPC {

    static WeCrossRPC init(WeCrossService weCrossService) {
        return new WeCrossRPCRest(weCrossService);
    }

    RemoteCall<Response> exists(String path);

    RemoteCall<ResourcesResponse> list(Boolean ignoreRemote);

    RemoteCall<TransactionResponse> call(String path, String method, Object... args);

    RemoteCall<TransactionResponse> sendTransaction(String path, String method, Object... args);
}
