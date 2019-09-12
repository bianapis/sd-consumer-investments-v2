package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQOrderInitiationRetrieveOutputModelOrderInitiationInstanceRecord
 */
public class BQOrderInitiationRetrieveOutputModelOrderInitiationInstanceRecord   {
  private String consumerSecuritiesOrderTransactionInstanceReference = null;

  private String consumerSecuritiesOrderTransactionInstanceStatus = null;

  private String consumerSecuritiesOrderInitiationTaskResult = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: The reference to the market order. Note this can be the internal bank 'order' made against the bank's managed position and may not result in a matched trade in the wholesale markets 
   * @return consumerSecuritiesOrderTransactionInstanceReference
  **/

  public String getConsumerSecuritiesOrderTransactionInstanceReference() {
    return consumerSecuritiesOrderTransactionInstanceReference;
  }

  public void setConsumerSecuritiesOrderTransactionInstanceReference(String consumerSecuritiesOrderTransactionInstanceReference) {
    this.consumerSecuritiesOrderTransactionInstanceReference = consumerSecuritiesOrderTransactionInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The returned status of the customer securities order 
   * @return consumerSecuritiesOrderTransactionInstanceStatus
  **/

  public String getConsumerSecuritiesOrderTransactionInstanceStatus() {
    return consumerSecuritiesOrderTransactionInstanceStatus;
  }

  public void setConsumerSecuritiesOrderTransactionInstanceStatus(String consumerSecuritiesOrderTransactionInstanceStatus) {
    this.consumerSecuritiesOrderTransactionInstanceStatus = consumerSecuritiesOrderTransactionInstanceStatus;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the market order initiation task 
   * @return consumerSecuritiesOrderInitiationTaskResult
  **/

  public String getConsumerSecuritiesOrderInitiationTaskResult() {
    return consumerSecuritiesOrderInitiationTaskResult;
  }

  public void setConsumerSecuritiesOrderInitiationTaskResult(String consumerSecuritiesOrderInitiationTaskResult) {
    this.consumerSecuritiesOrderInitiationTaskResult = consumerSecuritiesOrderInitiationTaskResult;
  }


}

