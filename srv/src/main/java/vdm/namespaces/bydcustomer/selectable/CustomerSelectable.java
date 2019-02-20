/*
 * Copyright (c) 2018 SAP SE or an SAP affiliate company. All rights reserved.
 */

package vdm.namespaces.bydcustomer.selectable;

import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.EntitySelectable;
import vdm.namespaces.bydcustomer.Customer;


/**
 * Interface to enable OData entity selectors for {@link vdm.namespaces.bydcustomer.Customer Customer}. This interface is used by {@link vdm.namespaces.bydcustomer.field.CustomerField CustomerField} and {@link vdm.namespaces.bydcustomer.link.CustomerLink CustomerLink}.
 * 
 * <p>Available instances:
 * <ul>
 * <li>{@link vdm.namespaces.bydcustomer.Customer#OBJECT_ID OBJECT_ID}</li>
 * <li>{@link vdm.namespaces.bydcustomer.Customer#INTERNAL_ID INTERNAL_ID}</li>
 * <li>{@link vdm.namespaces.bydcustomer.Customer#UUID UUID}</li>
 * <li>{@link vdm.namespaces.bydcustomer.Customer#BUSINESS_PARTNER_NAME BUSINESS_PARTNER_NAME}</li>
 * </ul>
 * 
 */
public interface CustomerSelectable
    extends EntitySelectable<Customer>
{


}
