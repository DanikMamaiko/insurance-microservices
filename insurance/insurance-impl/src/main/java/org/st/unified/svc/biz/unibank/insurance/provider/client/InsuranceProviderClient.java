package org.st.unified.svc.biz.unibank.insurance.provider.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.st.unified.svc.biz.unibank.insurance.InsuranceProviderApi;



@FeignClient(
        name = "insurance-provider-client",
        url = "${insurance.provider.url}"
)
public interface InsuranceProviderClient extends InsuranceProviderApi {
}