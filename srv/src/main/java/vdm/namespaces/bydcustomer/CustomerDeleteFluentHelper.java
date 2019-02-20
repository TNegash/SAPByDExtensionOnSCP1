/*
 * Copyright (c) 2018 SAP SE or an SAP affiliate company. All rights reserved.
 */

package vdm.namespaces.bydcustomer;

import javax.annotation.Nonnull;
import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.FluentHelperDelete;


/**
 * Fluent helper to delete an existing {@link vdm.namespaces.bydcustomer.Customer Customer} entity in the S/4HANA system.<p>
 * To perform execution, call the {@link #execute execute} method on the fluent helper object.
 * 
 */
public class CustomerDeleteFluentHelper
    extends FluentHelperDelete<CustomerDeleteFluentHelper, Customer>
{

    /**
     * {@link vdm.namespaces.bydcustomer.Customer Customer} entity object that will be deleted in the S/4HANA system.
     * 
     */
    private final Customer entity;

    /**
     * Creates a fluent helper object that will delete a {@link vdm.namespaces.bydcustomer.Customer Customer} entity on the OData endpoint. To perform execution, call the {@link #execute execute} method on the fluent helper object.
     * 
     * @param servicePath
     *     The service path to direct the update requests to.
     * @param entity
     *     The Customer to delete from the endpoint.
     */
    public CustomerDeleteFluentHelper(
        @Nonnull
        final String servicePath,
        @Nonnull
        final Customer entity) {
        super(servicePath);
        this.entity = entity;
    }

    @Override
    @Nonnull
    protected Customer getEntity() {
        return entity;
    }

}
