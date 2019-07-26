package org.wso2.carbon.identity.rest.api.user.fido2.v1.factories;

import org.wso2.carbon.identity.rest.api.user.fido2.v1.MeApiService;
import org.wso2.carbon.identity.rest.api.user.fido2.v1.impl.MeApiServiceImpl;

public class MeApiServiceFactory {

   private final static MeApiService service = new MeApiServiceImpl();

   public static MeApiService getMeApi()
   {
      return service;
   }
}
