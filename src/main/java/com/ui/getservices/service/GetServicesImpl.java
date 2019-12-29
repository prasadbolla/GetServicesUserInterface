/**
 * 
 */
package com.ui.getservices.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ui.getservices.adapter.GetServiceAPIProxy;
import com.ui.getservices.domain.ServiceInfoUIResponse;
import com.ui.getservices.service.mapper.GetServiceInfoUIResponseMapper;

/**
 * @author PRASADBolla
 *
 */
@Component
public class GetServicesImpl {
	@Autowired
	private GetServiceAPIProxy servicesAPIProxy;

	/**
	 * @param tenentId
	 * @param serviceType
	 * @return
	 */
	public ServiceInfoUIResponse getServiceInfo(String tenentId) {
		GetServiceInfoResponse getServiceInfoResponses = servicesAPIProxy
				.getServiceInfo(tenentId);

		return GetServiceInfoUIResponseMapper.map(getServiceInfoResponses);
	}
}
