/**
 * 
 */
package com.ui.getservices.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ui.getservices.domain.ServiceInfoUIResponse;
import com.ui.getservices.service.GetServicesImpl;

/**
 * @author PRASADBolla
 *
 */
@RestController
public class ServiceInfoUserInterfaceController {
	@Autowired
	private GetServicesImpl getServicesImpl;

	@GetMapping(value = "/services/{tenentId}/{serviceType}")
	public ResponseEntity<List<ServiceInfoUIResponse>> getServiceInfo(
			@PathVariable String tenentId, @PathVariable String serviceType) {
		List<ServiceInfoUIResponse> infoUIResponse = getServicesImpl
				.getServiceInfo(tenentId, serviceType);
		return ResponseEntity.ok(infoUIResponse);
	}
}
