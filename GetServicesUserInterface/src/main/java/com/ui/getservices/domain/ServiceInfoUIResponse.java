/**
 * 
 */
package com.ui.getservices.domain;

/**
 * @author PRASADBolla
 *
 */
public class ServiceInfoUIResponse {
public String serviceId;
public String serviceName;
/**
 * @return the serviceId
 */
public String getServiceId() {
	return serviceId;
}
/**
 * 
 */
public ServiceInfoUIResponse() {
	super();
}
/**
 * @param serviceId
 * @param serviceName
 * @param active
 * @param serviceProviderId
 */
public ServiceInfoUIResponse(String serviceId, String serviceName, String serviceProviderId) {
	super();
	this.serviceId = serviceId;
	this.serviceName = serviceName;
	this.serviceProviderId = serviceProviderId;
}
/**
 * @param serviceId the serviceId to set
 */
public void setServiceId(String serviceId) {
	this.serviceId = serviceId;
}
/**
 * @return the serviceName
 */
public String getServiceName() {
	return serviceName;
}
/**
 * @param serviceName the serviceName to set
 */
public void setServiceName(String serviceName) {
	this.serviceName = serviceName;
}
/**
 * @return the serviceProviderId
 */
public String getServiceProviderId() {
	return serviceProviderId;
}
/**
 * @param serviceProviderId the serviceProviderId to set
 */
public void setServiceProviderId(String serviceProviderId) {
	this.serviceProviderId = serviceProviderId;
}
public String serviceProviderId;

}
