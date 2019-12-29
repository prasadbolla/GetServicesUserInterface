package com.ui.getservices.adapter;	
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.ui.getservices.service.GetServiceInfoResponse;


/**
 * @author PRASADBolla
 *
 */

//@FeignClient(name="ExtGetServiceInfoAPI")
//@FeignClient(name="netflix-zuul-api-gateway-server")
//@RibbonClient(name="getServiceInfo")
@FeignClient(name="ExtGetServiceInfoAPI", url="http://localhost:8080")
@Component
public interface GetServiceAPIProxy {
	@GetMapping("/ext-getServiceInfo/services/{tenentId}")
	public GetServiceInfoResponse getServiceInfo(@PathVariable("tenentId") String tenentId);

}