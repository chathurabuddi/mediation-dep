/*
 *
 *  Copyright (c) 2014, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 * /
 */
package com.wso2telco.dep.mediator.entity.smsmessaging;

// TODO: Auto-generated Javadoc
/**
 * The Class DeliveryReceiptSubscription.
 */
public class DeliveryReceiptSubscription {

    /** The callback reference. */
    private CallbackReference callbackReference;
    
    /** The filter criteria. */
    private String filterCriteria;
    
    /** The resource url. */
    private String resourceURL;
    
    /** The client correlator. */
    private String clientCorrelator;

    /**
     * Gets the filter criteria.
     *
     * @return the filter criteria
     */
    public String getFilterCriteria() {
        return filterCriteria;
    }

    /**
     * Sets the filter criteria.
     *
     * @param filterCriteria the new filter criteria
     */
    public void setFilterCriteria(String filterCriteria) {
        this.filterCriteria = filterCriteria;
    }

    /**
     * Gets the callback reference.
     *
     * @return the callback reference
     */
    public CallbackReference getCallbackReference() {
        return callbackReference;
    }

    /**
     * Sets the callback reference.
     *
     * @param callbackReference the new callback reference
     */
    public void setCallbackReference(CallbackReference callbackReference) {
        this.callbackReference = callbackReference;
    }

    /**
     * Gets the resource url.
     *
     * @return the resource url
     */
    public String getResourceURL() {
        return resourceURL;
    }

    /**
     * Sets the resource url.
     *
     * @param resourceURL the new resource url
     */
    public void setResourceURL(String resourceURL) {
        this.resourceURL = resourceURL;
    }

     
    /**
     * Gets the client correlator.
     *
     * @return the client correlator
     */
    public String getClientCorrelator() {
        return clientCorrelator;
    }

     
    /**
     * Sets the client correlator.
     *
     * @param clientCorrelator the new client correlator
     */
    public void setClientCorrelator(String clientCorrelator) {
        this.clientCorrelator = clientCorrelator;
    }
}
