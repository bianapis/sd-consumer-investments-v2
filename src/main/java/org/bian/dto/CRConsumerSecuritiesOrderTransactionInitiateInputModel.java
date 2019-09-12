package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRConsumerSecuritiesOrderTransactionInitiateInputModelConsumerSecuritiesOrderTransactionInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRConsumerSecuritiesOrderTransactionInitiateInputModel
 */
public class CRConsumerSecuritiesOrderTransactionInitiateInputModel   {
  private String consumerInvestmentsServicingSessionReference = null;

  private Object consumerSecuritiesOrderTransactionInitiateActionRecord = null;

  private String consumerSecuritiesOrderTransactionInstanceStatus = null;

  private CRConsumerSecuritiesOrderTransactionInitiateInputModelConsumerSecuritiesOrderTransactionInstanceRecord consumerSecuritiesOrderTransactionInstanceRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return consumerInvestmentsServicingSessionReference
  **/

  public String getConsumerInvestmentsServicingSessionReference() {
    return consumerInvestmentsServicingSessionReference;
  }

  public void setConsumerInvestmentsServicingSessionReference(String consumerInvestmentsServicingSessionReference) {
    this.consumerInvestmentsServicingSessionReference = consumerInvestmentsServicingSessionReference;
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

  public CRConsumerSecuritiesOrderTransactionInitiateInputModelConsumerSecuritiesOrderTransactionInstanceRecord getConsumerSecuritiesOrderTransactionInstanceRecord() {
    return consumerSecuritiesOrderTransactionInstanceRecord;
  }

  public void setConsumerSecuritiesOrderTransactionInstanceRecord(CRConsumerSecuritiesOrderTransactionInitiateInputModelConsumerSecuritiesOrderTransactionInstanceRecord consumerSecuritiesOrderTransactionInstanceRecord) {
    this.consumerSecuritiesOrderTransactionInstanceRecord = consumerSecuritiesOrderTransactionInstanceRecord;
  }


}

