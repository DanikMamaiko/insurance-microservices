//package org.st.unified.svc.biz.unibank.insurance.provider.locator;
//
//import feign.Feign;
//import feign.jackson.JacksonDecoder;
//import feign.jackson.JacksonEncoder;
//import org.springframework.stereotype.Component;
//import org.st.unified.svc.biz.unibank.insurance.provider.client.InsuranceProviderClient;
//
//@Component
//public class InsuranceProviderLocator {
//    public InsuranceProviderClient getClient(String baseUrl) {
//        return Feign.builder()
//                .encoder(new JacksonEncoder())
//                .decoder(new JacksonDecoder())
//                .target(InsuranceProviderClient.class, baseUrl);
//    }
//}