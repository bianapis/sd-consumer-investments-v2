package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRConsumerSecuritiesOrderTransactionInitiateOutputModelConsumerSecuritiesOrderTransactionInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRConsumerSecuritiesOrderTransactionInitiateOutputModel
 */
public class CRConsumerSecuritiesOrderTransactionInitiateOutputModel   {
  private String consumerSecuritiesOrderTransactionInstanceReference = null;

  private String consumerSecuritiesOrderTransactionInitiateActionReference = null;

  private Object consumerSecuritiesOrderTransactionInitiateActionRecord = null;

  private String consumerSecuritiesOrderTransactionInstanceStatus = null;

  private CRConsumerSecuritiesOrderTransactionInitiateOutputModelConsumerSecuritiesOrderTransactionInstanceRecord consumerSecuritiesOrderTransactionInstanceRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Consumer Securities Order Transaction instance 
   * @return consumerSecuritiesOrderTransactionInstanceReference
  **/

  public String getConsumerSecuritiesOrderTransactionInstanceReference() {
    return consumerSecuritiesOrderTransactionInstanceReference;
  }

  public void setConsumerSecuritiesOrderTransactionInstanceReference(String consumerSecuritiesOrderTransactionInstanceReference) {
    this.consumerSecuritiesOrderTransactionInstanceReference = consumerSecuritiesOrderTransactionInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return consumerSecuritiesOrderTransactionInitiateActionReference
  **/

  public String getConsumerSecuritiesOrderTransactionInitiateActionReference() {
    return consumerSecuritiesOrderTransactionInitiateActionReference;
  }

  public void setConsumerSecuritiesOrderTransactionInitiateActionReference(String consumerSecuritiesOrderTransactionInitiateActionReference) {
    this.consumerSecuritiesOrderTransactionInitiateActionReference = consumerSecuritiesOrderTransactionInitiateActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return consumerSecuritiesOrderTransactionInitiateActionRecord
  **/

  public Object getConsumerSecuritiesOrderTransactionInitiateActionRecord() {
    return consumerSecuritiesOrderTransactionInitiateActionRecord;
  }

  public void setConsumerSecuritiesOrderTransactionInitiateActionRecord(Object consumerSecuritiesOrderTransactionInitiateActionRecord) {
    this.consumerSecuritiesOrderTransactionInitiateActionRecord = consumerSecuritiesOrderTransactionInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Consumer Securities Order Transaction instance (e.g. initialised, pending, active) 
   * @return consumerSecuritiesOrderTransactionInstanceStatus
  **/

  public String getConsumerSecuritiesOrderTransactionInstanceStatus() {
    return consumerSecuritiesOrderTransactionInstanceStatus;
  }

  public void setConsumerSecuritiesOrderTransactionInstanceStatus(String consumerSecuritiesOrderTransactionInstanceStatus) {
    this.consumerSecuritiesOrderTransactionInstanceStatus = consumerSecuritiesOrderTransactionInstanceStatus;
  }


  /**
   * Get consumerSecuritiesOrderTransactionInstanceRecord
   * @return consumerSecuritiesOrderTransactionInstanceRecord
  **/

  public CRConsumerSecuritiesOrderTransactionInitiateOutputModelConsumerSecuritiesOrderTransactionInstanceRecord getConsumerSecuritiesOrderTransactionInstanceRecord() {
    return consumerSecuritiesOrderTransactionInstanceRecord;
  }

  public void setConsumerSecuritiesOrderTransactionInstanceRecord(CRConsumerSecuritiesOrderTransactionInitiateOutputModelConsumerSecuritiesOrderTransactionInstanceRecord consumerSecuritiesOrderTransactionInstanceRecord) {
    this.consumerSecuritiesOrderTransactionInstanceRecord = consumerSecuritiesOrderTransactionInstanceRecord;
  }


}

