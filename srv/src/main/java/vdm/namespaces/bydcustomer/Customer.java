/*
 * Copyright (c) 2018 SAP SE or an SAP affiliate company. All rights reserved.
 */

package vdm.namespaces.bydcustomer;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.collect.Maps;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.sap.cloud.sdk.s4hana.connectivity.ErpConfigContext;
import com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataField;
import com.sap.cloud.sdk.s4hana.datamodel.odata.annotation.Key;
import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.VdmEntity;
import com.sap.cloud.sdk.typeconverter.TypeConverter;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import vdm.namespaces.bydcustomer.field.CustomerField;
import vdm.namespaces.bydcustomer.selectable.CustomerSelectable;


/**
 * <p>Original entity name from the Odata EDM: <b>Customer</b></p>
 * 
 */
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(doNotUseGetters = true, callSuper = true)
@EqualsAndHashCode(doNotUseGetters = true, callSuper = true)
@JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataVdmEntityAdapterFactory.class)
public class Customer
    extends VdmEntity<Customer>
{

    /**
     * Selector for all available fields of Customer.
     * 
     */
    public final static CustomerSelectable ALL_FIELDS = new CustomerSelectable() {


        @Nonnull
        @Override
        public String getFieldName() {
            return "*";
        }

        @Nonnull
        @Override
        public List<String> getSelections() {
            return Collections.singletonList("*");
        }

    }
    ;
    /**
     * (Key Field) Constraints: Not nullable, Maximum length: 70 <p>Original property name from the Odata EDM: <b>ObjectID</b></p>
     * 
     * @param objectID
     *     
     */
    @Key
    @SerializedName("ObjectID")
    @JsonProperty("ObjectID")
    @Nullable
    @ODataField(odataName = "ObjectID")
    private String objectID;
    /**
     * Use with available fluent helpers to apply the <b>ObjectID</b> field to query operations.
     * 
     */
    public final static CustomerField<String> OBJECT_ID = new CustomerField<String>("ObjectID");
    /**
     * Constraints: Nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>InternalID</b></p>
     * 
     * @param internalID
     *     
     */
    @SerializedName("InternalID")
    @JsonProperty("InternalID")
    @Nullable
    @ODataField(odataName = "InternalID")
    private String internalID;
    /**
     * Use with available fluent helpers to apply the <b>InternalID</b> field to query operations.
     * 
     */
    public final static CustomerField<String> INTERNAL_ID = new CustomerField<String>("InternalID");
    /**
     * Constraints: Nullable<p>Original property name from the Odata EDM: <b>UUID</b></p>
     * 
     * @param uUID
     *     
     */
    @SerializedName("UUID")
    @JsonProperty("UUID")
    @Nullable
    @ODataField(odataName = "UUID")
    private java.util.UUID uUID;
    /**
     * Use with available fluent helpers to apply the <b>UUID</b> field to query operations.
     * 
     */
    public final static CustomerField<java.util.UUID> UUID = new CustomerField<java.util.UUID>("UUID");
    /**
     * Constraints: Nullable, Maximum length: 40 <p>Original property name from the Odata EDM: <b>BusinessPartnerName</b></p>
     * 
     * @param businessPartnerName
     *     
     */
    @SerializedName("BusinessPartnerName")
    @JsonProperty("BusinessPartnerName")
    @Nullable
    @ODataField(odataName = "BusinessPartnerName")
    private String businessPartnerName;
    /**
     * Use with available fluent helpers to apply the <b>BusinessPartnerName</b> field to query operations.
     * 
     */
    public final static CustomerField<String> BUSINESS_PARTNER_NAME = new CustomerField<String>("BusinessPartnerName");
    /**
     * Convienence field for reusing the same ERP system context with multiple queries (e.g. fetching associated entities).
     * 
     * @param erpConfigContext
     *     
     * @return
     *     The stored ERP system context for executing queries, or null if no such context has been set.
     */
    @JsonIgnore
    @Nullable
    private transient ErpConfigContext erpConfigContext;

    /**
     * {@inheritDoc}
     * 
     */
    @Nonnull
    @Override
    public Class<Customer> getType() {
        return Customer.class;
    }

    /**
     * (Key Field) Constraints: Not nullable, Maximum length: 70 <p>Original property name from the Odata EDM: <b>ObjectID</b></p>
     * 
     * @param objectID
     *     
     */
    public void setObjectID(
        @Nullable
        final String objectID) {
        rememberChangedField("ObjectID", this.objectID);
        this.objectID = objectID;
    }

    /**
     * Constraints: Nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>InternalID</b></p>
     * 
     * @param internalID
     *     
     */
    public void setInternalID(
        @Nullable
        final String internalID) {
        rememberChangedField("InternalID", this.internalID);
        this.internalID = internalID;
    }

    /**
     * Constraints: Nullable<p>Original property name from the Odata EDM: <b>UUID</b></p>
     * 
     * @param uUID
     *     
     */
    public void setUUID(
        @Nullable
        final java.util.UUID uUID) {
        rememberChangedField("UUID", this.uUID);
        this.uUID = uUID;
    }

    /**
     * Constraints: Nullable, Maximum length: 40 <p>Original property name from the Odata EDM: <b>BusinessPartnerName</b></p>
     * 
     * @param businessPartnerName
     *     
     */
    public void setBusinessPartnerName(
        @Nullable
        final String businessPartnerName) {
        rememberChangedField("BusinessPartnerName", this.businessPartnerName);
        this.businessPartnerName = businessPartnerName;
    }

    @Override
    protected String getEntityCollection() {
        return "CustomerCollection";
    }

    @Nonnull
    @Override
    protected Map<String, Object> getKey() {
        final Map<String, Object> result = Maps.newHashMap();
        result.put("ObjectID", getObjectID());
        return result;
    }

    @Nonnull
    @Override
    protected Map<String, Object> toMapOfFields() {
        final Map<String, Object> values = super.toMapOfFields();
        values.put("ObjectID", getObjectID());
        values.put("InternalID", getInternalID());
        values.put("UUID", getUUID());
        values.put("BusinessPartnerName", getBusinessPartnerName());
        return values;
    }

    @Override
    protected void fromMap(final Map<String, Object> inputValues) {
        final Map<String, Object> values = Maps.newHashMap(inputValues);
        // simple properties
        {
            if (values.containsKey("ObjectID")) {
                final Object value = values.remove("ObjectID");
                if ((value == null)||(!value.equals(getObjectID()))) {
                    setObjectID(((String) value));
                }
            }
            if (values.containsKey("InternalID")) {
                final Object value = values.remove("InternalID");
                if ((value == null)||(!value.equals(getInternalID()))) {
                    setInternalID(((String) value));
                }
            }
            if (values.containsKey("UUID")) {
                final Object value = values.remove("UUID");
                if ((value == null)||(!value.equals(getUUID()))) {
                    setUUID(((java.util.UUID) value));
                }
            }
            if (values.containsKey("BusinessPartnerName")) {
                final Object value = values.remove("BusinessPartnerName");
                if ((value == null)||(!value.equals(getBusinessPartnerName()))) {
                    setBusinessPartnerName(((String) value));
                }
            }
        }
        // structured properties
        {
        }
        // navigation properties
        {
        }
        super.fromMap(values);
    }

    /**
     * Use with available fluent helpers to apply an extension field to query operations.
     * 
     * @param fieldName
     *     The name of the extension field as returned by the OData service.
     * @param <T>
     *     The type of the extension field when performing value comparisons.
     * @param fieldType
     *     The Java type to use for the extension field when performing value comparisons.
     * @return
     *     A representation of an extension field from this entity.
     */
    @Nonnull
    public static<T >CustomerField<T> field(
        @Nonnull
        final String fieldName,
        @Nonnull
        final Class<T> fieldType) {
        return new CustomerField<T>(fieldName);
    }

    /**
     * Use with available fluent helpers to apply an extension field to query operations.
     * 
     * @param typeConverter
     *     A TypeConverter<T, DomainT> instance whose first generic type matches the Java type of the field
     * @param fieldName
     *     The name of the extension field as returned by the OData service.
     * @param <T>
     *     The type of the extension field when performing value comparisons.
     * @param <DomainT>
     *     The type of the extension field as returned by the OData service.
     * @return
     *     A representation of an extension field from this entity, holding a reference to the given TypeConverter.
     */
    @Nonnull
    public static<T,DomainT >CustomerField<T> field(
        @Nonnull
        final String fieldName,
        @Nonnull
        final TypeConverter<T, DomainT> typeConverter) {
        return new CustomerField<T>(fieldName, typeConverter);
    }

    @Override
    protected void setServicePathForFetch(
        @Nullable
        final String servicePathForFetch) {
        super.setServicePathForFetch(servicePathForFetch);
    }

}
