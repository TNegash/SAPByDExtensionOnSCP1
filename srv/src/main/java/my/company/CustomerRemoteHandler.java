package my.company;


import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sap.cloud.sdk.odatav2.connectivity.ODataException;
import com.sap.cloud.sdk.s4hana.connectivity.ErpConfigContext;
import com.sap.cloud.sdk.service.prov.api.operations.Query;
import com.sap.cloud.sdk.service.prov.api.request.QueryRequest;
import com.sap.cloud.sdk.service.prov.api.response.QueryResponse;
import com.sap.cloud.sdk.service.prov.api.response.ErrorResponse;

import vdm.services.DefaultBydCustomerService;
import vdm.namespaces.bydcustomer.Customer;

public class CustomerRemoteHandler {
	private static final Logger logger = LoggerFactory.getLogger(CustomerRemoteHandler.class);
	private static final String DESTINATION_NAME = "bydsystem";

	@Query(serviceName = "Salesorderhandling", entity = "Customers")
	public QueryResponse queryProducts(QueryRequest qryRequest) {

		try {
			// Remote service call
			List<Customer> customers = new DefaultBydCustomerService()
					.withServicePath("/sap/byd/odata/cust/v1/byd_customer").getAllCustomer()
					.select(Customer.OBJECT_ID, Customer.INTERNAL_ID, Customer.BUSINESS_PARTNER_NAME)
					.execute(new ErpConfigContext(DESTINATION_NAME));

			QueryResponse queryResponse = QueryResponse.setSuccess().setData(customers).response();
			return queryResponse;

		} catch (final ODataException e) {
			logger.error("==> Exception calling backend OData V2 service for Query of Products: " + e.getMessage(), e);
			logger.error("==> Exception calling backend additional data: " + e.getLocalizedMessage());
			ErrorResponse errorResponse = ErrorResponse.getBuilder()
					.setMessage("There is an error.  Check the logs for the details.").setStatusCode(500).setCause(e)
					.response();
			QueryResponse queryResponse = QueryResponse.setError(errorResponse);
			return queryResponse;
		}

	}

}
