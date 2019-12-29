/**
 * 
 */
package com.ui.getservices.service.mapper;

import com.ui.getservices.domain.ServiceInfoUIResponse;
import com.ui.getservices.service.GetServiceInfoResponse;

/**
 * @author PRASADBolla
 *
 */
public class GetServiceInfoUIResponseMapper {
	public static ServiceInfoUIResponse map(
			GetServiceInfoResponse getServiceInfoResponses) {

		ServiceInfoUIResponse serviceInfoUiResponse = new ServiceInfoUIResponse(getServiceInfoResponses.getCategories());
		return serviceInfoUiResponse;
	}
}
