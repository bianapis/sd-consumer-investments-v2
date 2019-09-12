package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQFundingCheckRetrieveOutputModelFundingCheckInstanceRecord
 */
public class BQFundingCheckRetrieveOutputModelFundingCheckInstanceRecord   {
  private String consumerSecuritiesOrderTransactionFundingCheckResult = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The outcome of the funds available check 
   * @return consumerSecuritiesOrderTransactionFundingCheckResult
  **/

  public String getConsumerSecuritiesOrderTransactionFundingCheckResult() {
    return consumerSecuritiesOrderTransactionFundingCheckResult;
  }

  public void setConsumerSecuritiesOrderTransactionFundingCheckResult(String consumerSecuritiesOrderTransactionFundingCheckResult) {
    this.consumerSecuritiesOrderTransactionFundingCheckResult = consumerSecuritiesOrderTransactionFundingCheckResult;
  }


}

