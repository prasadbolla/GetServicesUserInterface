/**
 * 
 */
package com.ui.getservices.service.mapper;

import java.util.List;
import java.util.stream.Collectors;

import com.ui.getservices.domain.ServiceInfoUIResponse;
import com.ui.getservices.service.GetServiceInfoResponse;

/**
 * @author PRASADBolla
 *
 */
public class GetServiceInfoUIResponseMapper {
	public static List<ServiceInfoUIResponse> map(
			List<GetServiceInfoResponse> getServiceInfoResponses) {

		List<ServiceInfoUIResponse> latestNewsList = getServiceInfoResponses
				.stream()
				.map(serviceInfo -> new ServiceInfoUIResponse(serviceInfo
						.getServiceId(), serviceInfo.getServiceName(),
						serviceInfo.getServiceProviderId()))
				.collect(Collectors.toList());
		return latestNewsList;
	}
}
