/*
 * Copyright (c) 2018 SAP SE or an SAP affiliate company. All rights reserved.
 */

package vdm.namespaces.bydcustomer;

import javax.annotation.Nonnull;
import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.FluentHelperRead;
import vdm.namespaces.bydcustomer.selectable.CustomerSelectable;


/**
 * Fluent helper to fetch multiple {@link vdm.namespaces.bydcustomer.Customer Customer} entities. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. 
 * 
 */
public class CustomerFluentHelper
    extends FluentHelperRead<CustomerFluentHelper, Customer, CustomerSelectable>
{


    /**
     * Creates a fluent helper using the specified service path to send the read requests.
     * 
     * @param servicePath
     *     The service path to direct the read requests to.
     */
    public CustomerFluentHelper(
        @Nonnull
        final String servicePath) {
        super(servicePath);
    }

    @Override
    @Nonnull
    protected Class<Customer> getEntityClass() {
        return Customer.class;
    }

}
