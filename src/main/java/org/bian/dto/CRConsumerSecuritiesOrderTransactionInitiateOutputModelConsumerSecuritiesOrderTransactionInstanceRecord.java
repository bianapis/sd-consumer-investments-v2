package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRConsumerSecuritiesOrderTransactionInitiateInputModelConsumerSecuritiesOrderTransactionInstanceRecordConsumerSecuritiesOrderTransaction;

import javax.validation.Valid;
  
/**
 * CRConsumerSecuritiesOrderTransactionInitiateOutputModelConsumerSecuritiesOrderTransactionInstanceRecord
 */
public class CRConsumerSecuritiesOrderTransactionInitiateOutputModelConsumerSecuritiesOrderTransactionInstanceRecord   {
  private String consumerSecuritiesOrderInstructionType = null;

  private String consumerSecuritiesOrderProcessingInstruction = null;

  private String documentDirectoryEntryInstanceReference = null;

  private String correspondenceInstanceReference = null;

  private CRConsumerSecuritiesOrderTransactionInitiateInputModelConsumerSecuritiesOrderTransactionInstanceRecordConsumerSecuritiesOrderTransaction consumerSecuritiesOrderTransaction = null;


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

  public CRConsumerSecuritiesOrderTransactionInitiateInputModelConsumerSecuritiesOrderTransactionInstanceRecordConsumerSecuritiesOrderTransaction getConsumerSecuritiesOrderTransaction() {
    return consumerSecuritiesOrderTransaction;
  }

  public void setConsumerSecuritiesOrderTransaction(CRConsumerSecuritiesOrderTransactionInitiateInputModelConsumerSecuritiesOrderTransactionInstanceRecordConsumerSecuritiesOrderTransaction consumerSecuritiesOrderTransaction) {
    this.consumerSecuritiesOrderTransaction = consumerSecuritiesOrderTransaction;
  }


}

