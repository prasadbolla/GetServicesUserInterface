/**
 * 
 */
package com.ui.getservices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
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
@CrossOrigin
public class ServiceInfoUserInterfaceController {
	@Autowired
	private GetServicesImpl getServicesImpl;

	@GetMapping(value = "/services/{tenentId}")
	public ResponseEntity<ServiceInfoUIResponse> getServiceInfo(
			@PathVariable String tenentId) {
		ServiceInfoUIResponse infoUIResponse = getServicesImpl
				.getServiceInfo(tenentId);
		return ResponseEntity.ok(infoUIResponse);
	}
}
