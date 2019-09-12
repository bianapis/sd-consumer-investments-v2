package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQOrderInitiationRetrieveOutputModelConsumerSecuritiesOrderTransactionInstanceRecordConsumerSecuritiesOrderTransaction;

import javax.validation.Valid;
  
/**
 * BQOrderInitiationRetrieveOutputModelConsumerSecuritiesOrderTransactionInstanceRecord
 */
public class BQOrderInitiationRetrieveOutputModelConsumerSecuritiesOrderTransactionInstanceRecord   {
  private String consumerSecuritiesOrderInstructionType = null;

  private String customerReference = null;

  private String employeeBusinessUnitReference = null;

  private String investmentPortfolioInstanceReference = null;

  private String consumerSecuritiesOrderProcessingInstruction = null;

  private String documentDirectoryEntryInstanceReference = null;

  private String correspondenceInstanceReference = null;

  private BQOrderInitiationRetrieveOutputModelConsumerSecuritiesOrderTransactionInstanceRecordConsumerSecuritiesOrderTransaction consumerSecuritiesOrderTransaction = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of market order request (e.g. Customer discretion) 
   * @return consumerSecuritiesOrderInstructionType
  **/

  public String getConsumerSecuritiesOrderInstructionType() {
    return consumerSecuritiesOrderInstructionType;
  }

  public void setConsumerSecuritiesOrderInstructionType(String consumerSecuritiesOrderInstructionType) {
    this.consumerSecuritiesOrderInstructionType = consumerSecuritiesOrderInstructionType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the account primary party/owner for the market order 
   * @return customerReference
  **/

  public String getCustomerReference() {
    return customerReference;
  }

  public void setCustomerReference(String customerReference) {
    this.customerReference = customerReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: The employee/business unit placing the market order 
   * @return employeeBusinessUnitReference
  **/

  public String getEmployeeBusinessUnitReference() {
    return employeeBusinessUnitReference;
  }

  public void setEmployeeBusinessUnitReference(String employeeBusinessUnitReference) {
    this.employeeBusinessUnitReference = employeeBusinessUnitReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the associated customer investment portfolio record of all holdings (referenced to check securities availability if necessary) 
   * @return investmentPortfolioInstanceReference
  **/

  public String getInvestmentPortfolioInstanceReference() {
    return investmentPortfolioInstanceReference;
  }

  public void setInvestmentPortfolioInstanceReference(String investmentPortfolioInstanceReference) {
    this.investmentPortfolioInstanceReference = investmentPortfolioInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Any customer specific processing preferences or requirements 
   * @return consumerSecuritiesOrderProcessingInstruction
  **/

  public String getConsumerSecuritiesOrderProcessingInstruction() {
    return consumerSecuritiesOrderProcessingInstruction;
  }

  public void setConsumerSecuritiesOrderProcessingInstruction(String consumerSecuritiesOrderProcessingInstruction) {
    this.consumerSecuritiesOrderProcessingInstruction = consumerSecuritiesOrderProcessingInstruction;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: The document reference for the order confirmation notice 
   * @return documentDirectoryEntryInstanceReference
  **/

  public String getDocumentDirectoryEntryInstanceReference() {
    return documentDirectoryEntryInstanceReference;
  }

  public void setDocumentDirectoryEntryInstanceReference(String documentDirectoryEntryInstanceReference) {
    this.documentDirectoryEntryInstanceReference = documentDirectoryEntryInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the correspondence generated for the order confirmation 
   * @return correspondenceInstanceReference
  **/

  public String getCorrespondenceInstanceReference() {
    return correspondenceInstanceReference;
  }

  public void setCorrespondenceInstanceReference(String correspondenceInstanceReference) {
    this.correspondenceInstanceReference = correspondenceInstanceReference;
  }


  /**
   * Get consumerSecuritiesOrderTransaction
   * @return consumerSecuritiesOrderTransaction
  **/

  public BQOrderInitiationRetrieveOutputModelConsumerSecuritiesOrderTransactionInstanceRecordConsumerSecuritiesOrderTransaction getConsumerSecuritiesOrderTransaction() {
    return consumerSecuritiesOrderTransaction;
  }

  public void setConsumerSecuritiesOrderTransaction(BQOrderInitiationRetrieveOutputModelConsumerSecuritiesOrderTransactionInstanceRecordConsumerSecuritiesOrderTransaction consumerSecuritiesOrderTransaction) {
    this.consumerSecuritiesOrderTransaction = consumerSecuritiesOrderTransaction;
  }


}

