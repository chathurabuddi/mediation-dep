package com.wso2telco.dep.mediator.delegator;

import com.wso2telco.dep.mediator.OperatorEndpoint;
import com.wso2telco.dep.mediator.entity.OparatorEndPointSearchDTO;
import com.wso2telco.dep.mediator.mediationrule.OriginatingCountryCalculatorIDD;

/**
 * Copyright (c) 2019, WSO2.Telco Inc. (http://www.wso2telco.com) All Rights Reserved.
 * <p>
 * WSO2.Telco Inc. licences this file to you under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
public class OCCIDelegator {

    private static final OCCIDelegator INSTANCE = new OCCIDelegator();

    private OriginatingCountryCalculatorIDD occi;

    private OCCIDelegator() {
    }

    public static synchronized OCCIDelegator getInstance() {
        return INSTANCE;
    }

    /**
     * This method delegates to {@link OriginatingCountryCalculatorIDD#getOperatorEndpoint(OparatorEndPointSearchDTO)}
     *
     * @param searchDTO
     * @return
     * @throws Exception
     */
    public OperatorEndpoint getOperatorEndpoint(final OparatorEndPointSearchDTO searchDTO) throws Exception {
        return getOcci().getOperatorEndpoint(searchDTO);
    }


    private synchronized OriginatingCountryCalculatorIDD getOcci() {
        if (occi == null) {
            occi = new OriginatingCountryCalculatorIDD();
        }
        return occi;
    }
}
