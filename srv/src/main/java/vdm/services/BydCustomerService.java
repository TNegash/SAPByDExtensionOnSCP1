/*
 * Copyright (c) 2018 SAP SE or an SAP affiliate company. All rights reserved.
 */

package vdm.services;

import javax.annotation.Nonnull;
import vdm.namespaces.bydcustomer.Customer;
import vdm.namespaces.bydcustomer.CustomerByKeyFluentHelper;
import vdm.namespaces.bydcustomer.CustomerCreateFluentHelper;
import vdm.namespaces.bydcustomer.CustomerDeleteFluentHelper;
import vdm.namespaces.bydcustomer.CustomerFluentHelper;
import vdm.namespaces.bydcustomer.CustomerUpdateFluentHelper;


/**
 * <h3>Details:</h3><table summary='Details'><tr><td align='right'>OData Service:</td><td>byd_customer</td></tr></table>
 * 
 */
public interface BydCustomerService {

    /**
     * If no other path was provided via the {@link #withServicePath(String)} method, this is the default service path used to access the endpoint.
     * 
     */
    String DEFAULT_SERVICE_PATH = "/ByDSyS1/sap/byd/odata/cust/v1/byd_customer";

    /**
     * Overrides the default service path and returns a new service instance with the specified service path. Also adjusts the respective entity URLs.
     * 
     * @param servicePath
     *     Service path that will override the default.
     * @return
     *     A new service instance with the specified service path.
     */
    @Nonnull
    BydCustomerService withServicePath(
        @Nonnull
        final String servicePath);

    /**
     * Fetch multiple {@link vdm.namespaces.bydcustomer.Customer Customer} entities.
     * 
     * @return
     *     A fluent helper to fetch multiple {@link vdm.namespaces.bydcustomer.Customer Customer} entities. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. To perform execution, call the {@link vdm.namespaces.bydcustomer.CustomerFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    CustomerFluentHelper getAllCustomer();

    /**
     * Fetch a single {@link vdm.namespaces.bydcustomer.Customer Customer} entity using key fields.
     * 
     * @param objectID
     *     
     * @return
     *     A fluent helper to fetch a single {@link vdm.namespaces.bydcustomer.Customer Customer} entity using key fields. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. To perform execution, call the {@link vdm.namespaces.bydcustomer.CustomerByKeyFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    CustomerByKeyFluentHelper getCustomerByKey(final String objectID);

    /**
     * Create a new {@link vdm.namespaces.bydcustomer.Customer Customer} entity and save it to the S/4HANA system.
     * 
     * @param customer
     *     {@link vdm.namespaces.bydcustomer.Customer Customer} entity object that will be created in the S/4HANA system.
     * @return
     *     A fluent helper to create a new {@link vdm.namespaces.bydcustomer.Customer Customer} entity. To perform execution, call the {@link vdm.namespaces.bydcustomer.CustomerCreateFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    CustomerCreateFluentHelper createCustomer(
        @Nonnull
        final Customer customer);

    /**
     * Update an existing {@link vdm.namespaces.bydcustomer.Customer Customer} entity and save it to the S/4HANA system.
     * 
     * @param customer
     *     {@link vdm.namespaces.bydcustomer.Customer Customer} entity object that will be updated in the S/4HANA system.
     * @return
     *     A fluent helper to update an existing {@link vdm.namespaces.bydcustomer.Customer Customer} entity. To perform execution, call the {@link vdm.namespaces.bydcustomer.CustomerUpdateFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    CustomerUpdateFluentHelper updateCustomer(
        @Nonnull
        final Customer customer);

    /**
     * Deletes an existing {@link vdm.namespaces.bydcustomer.Customer Customer} entity in the S/4HANA system.
     * 
     * @param customer
     *     {@link vdm.namespaces.bydcustomer.Customer Customer} entity object that will be deleted in the S/4HANA system.
     * @return
     *     A fluent helper to delete an existing {@link vdm.namespaces.bydcustomer.Customer Customer} entity. To perform execution, call the {@link vdm.namespaces.bydcustomer.CustomerDeleteFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    CustomerDeleteFluentHelper deleteCustomer(
        @Nonnull
        final Customer customer);

}
