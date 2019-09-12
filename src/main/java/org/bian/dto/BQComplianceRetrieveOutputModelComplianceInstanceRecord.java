package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQComplianceRetrieveOutputModelComplianceInstanceRecord
 */
public class BQComplianceRetrieveOutputModelComplianceInstanceRecord   {
  private String consumerSecuritiesOrderTransactionComplianceCheckType = null;

  private String consumerSecuritiesOrderTransactionComplianceCheckResult = null;

  private String consumerSecuritiesOrderTransactionComplianceTaskResult = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of compliance check performed (e.g. AML, Watch lists) 
   * @return consumerSecuritiesOrderTransactionComplianceCheckType
  **/

  public String getConsumerSecuritiesOrderTransactionComplianceCheckType() {
    return consumerSecuritiesOrderTransactionComplianceCheckType;
  }

  public void setConsumerSecuritiesOrderTransactionComplianceCheckType(String consumerSecuritiesOrderTransactionComplianceCheckType) {
    this.consumerSecuritiesOrderTransactionComplianceCheckType = consumerSecuritiesOrderTransactionComplianceCheckType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The outcome of the compliance check 
   * @return consumerSecuritiesOrderTransactionComplianceCheckResult
  **/

  public String getConsumerSecuritiesOrderTransactionComplianceCheckResult() {
    return consumerSecuritiesOrderTransactionComplianceCheckResult;
  }

  public void setConsumerSecuritiesOrderTransactionComplianceCheckResult(String consumerSecuritiesOrderTransactionComplianceCheckResult) {
    this.consumerSecuritiesOrderTransactionComplianceCheckResult = consumerSecuritiesOrderTransactionComplianceCheckResult;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the overall compliance checking process 
   * @return consumerSecuritiesOrderTransactionComplianceTaskResult
  **/

  public String getConsumerSecuritiesOrderTransactionComplianceTaskResult() {
    return consumerSecuritiesOrderTransactionComplianceTaskResult;
  }

  public void setConsumerSecuritiesOrderTransactionComplianceTaskResult(String consumerSecuritiesOrderTransactionComplianceTaskResult) {
    this.consumerSecuritiesOrderTransactionComplianceTaskResult = consumerSecuritiesOrderTransactionComplianceTaskResult;
  }


}

