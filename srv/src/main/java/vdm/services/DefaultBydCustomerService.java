/*
 * Copyright (c) 2018 SAP SE or an SAP affiliate company. All rights reserved.
 */

package vdm.services;

import javax.annotation.Nonnull;
import javax.inject.Named;
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
@Named("vdm.services.DefaultBydCustomerService")
public class DefaultBydCustomerService
    implements BydCustomerService
{

    @Nonnull
    private final String servicePath;

    /**
     * Creates a service using {@link BydCustomerService#DEFAULT_SERVICE_PATH} to send the requests.
     * 
     */
    public DefaultBydCustomerService() {
        servicePath = BydCustomerService.DEFAULT_SERVICE_PATH;
    }

    /**
     * Creates a service using the provided service path to send the requests.
     * <p>
     * Used by the fluent {@link #withServicePath(String)} method.
     * 
     */
    private DefaultBydCustomerService(
        @Nonnull
        final String servicePath) {
        this.servicePath = servicePath;
    }

    @Override
    @Nonnull
    public DefaultBydCustomerService withServicePath(
        @Nonnull
        final String servicePath) {
        return new DefaultBydCustomerService(servicePath);
    }

    @Override
    @Nonnull
    public CustomerFluentHelper getAllCustomer() {
        return new CustomerFluentHelper(servicePath);
    }

    @Override
    @Nonnull
    public CustomerByKeyFluentHelper getCustomerByKey(final String objectID) {
        return new CustomerByKeyFluentHelper(servicePath, objectID);
    }

    @Override
    @Nonnull
    public CustomerCreateFluentHelper createCustomer(
        @Nonnull
        final Customer customer) {
        return new CustomerCreateFluentHelper(servicePath, customer);
    }

    @Override
    @Nonnull
    public CustomerUpdateFluentHelper updateCustomer(
        @Nonnull
        final Customer customer) {
        return new CustomerUpdateFluentHelper(servicePath, customer);
    }

    @Override
    @Nonnull
    public CustomerDeleteFluentHelper deleteCustomer(
        @Nonnull
        final Customer customer) {
        return new CustomerDeleteFluentHelper(servicePath, customer);
    }

}
