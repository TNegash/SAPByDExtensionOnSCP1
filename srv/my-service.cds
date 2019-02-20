using my.app from '../db/data-model';
 using cust as cust_API_product from './external/csn/byd_product';
  using cust as cust_API_customer from './external/csn/byd_customer';
service Salesorderhandling {
  
  @insertonly entity Salesorder as projection on app.Salesorder;
  
  @insertonly entity Salesorderitem as projection on app.Salesorderitem{
  	*
  }	  actions {
	  action CheckATP( ) returns String(255);
  };
  
 @cds.persistence.skip
 Entity Products as projection on cust_API_product.Material {
	key ObjectID as ObjectID,
	InternalID as InternalID,
 	Description as Description
 };
  
   @cds.persistence.skip
 Entity Customers as projection on cust_API_customer.Customer {
	key ObjectID as ObjectID,
	InternalID as InternalID,
 	BusinessPartnerName as BusinessPartnerName
 };
  
}