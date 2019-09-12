package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRConsumerSecuritiesOrderTransactionUpdateInputModelConsumerSecuritiesOrderTransactionInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRConsumerSecuritiesOrderTransactionUpdateInputModel
 */
public class CRConsumerSecuritiesOrderTransactionUpdateInputModel   {
  private String consumerInvestmentsServicingSessionReference = null;

  private String consumerSecuritiesOrderTransactionInstanceReference = null;

  private CRConsumerSecuritiesOrderTransactionUpdateInputModelConsumerSecuritiesOrderTransactionInstanceRecord consumerSecuritiesOrderTransactionInstanceRecord = null;

  private Object consumerSecuritiesOrderTransactionUpdateActionTaskRecord = null;

  private String updateActionRequest = null;


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
   * Get consumerSecuritiesOrderTransactionInstanceRecord
   * @return consumerSecuritiesOrderTransactionInstanceRecord
  **/

  public CRConsumerSecuritiesOrderTransactionUpdateInputModelConsumerSecuritiesOrderTransactionInstanceRecord getConsumerSecuritiesOrderTransactionInstanceRecord() {
    return consumerSecuritiesOrderTransactionInstanceRecord;
  }

  public void setConsumerSecuritiesOrderTransactionInstanceRecord(CRConsumerSecuritiesOrderTransactionUpdateInputModelConsumerSecuritiesOrderTransactionInstanceRecord consumerSecuritiesOrderTransactionInstanceRecord) {
    this.consumerSecuritiesOrderTransactionInstanceRecord = consumerSecuritiesOrderTransactionInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return consumerSecuritiesOrderTransactionUpdateActionTaskRecord
  **/

  public Object getConsumerSecuritiesOrderTransactionUpdateActionTaskRecord() {
    return consumerSecuritiesOrderTransactionUpdateActionTaskRecord;
  }

  public void setConsumerSecuritiesOrderTransactionUpdateActionTaskRecord(Object consumerSecuritiesOrderTransactionUpdateActionTaskRecord) {
    this.consumerSecuritiesOrderTransactionUpdateActionTaskRecord = consumerSecuritiesOrderTransactionUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return updateActionRequest
  **/

  public String getUpdateActionRequest() {
    return updateActionRequest;
  }

  public void setUpdateActionRequest(String updateActionRequest) {
    this.updateActionRequest = updateActionRequest;
  }


}

