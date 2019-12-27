/**
 * 
 */
package com.ui.getservices.domain;

/**
 * @author PRASADBolla
 *
 */
public class ServiceInfoUIResponse {
//public String serviceId;
public String serviceName;
/**
 * @param serviceName
 * @param status
 */
public ServiceInfoUIResponse(String serviceName, String status) {
	super();
	this.serviceName = serviceName;
	this.status = status;
}
public String status; 
/**
 * @return the status
 */
public String getStatus() {
	return status;
}
/**
 * @param status the status to set
 */
public void setStatus(String status) {
	this.status = status;
}
/**
 * @return the serviceId
 */
/*public String getServiceId() {
	return serviceId;
}*/
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
/**
 * @param serviceId the serviceId to set
 */
/*public void setServiceId(String serviceId) {
	this.serviceId = serviceId;
}*/
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
 *//*
public String getServiceProviderId() {
	return serviceProviderId;
}
*//**
 * @param serviceProviderId the serviceProviderId to set
 *//*
public void setServiceProviderId(String serviceProviderId) {
	this.serviceProviderId = serviceProviderId;
}
public String serviceProviderId;*/

}
