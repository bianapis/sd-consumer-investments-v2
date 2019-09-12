package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRConsumerSecuritiesOrderTransactionRetrieveInputModelConsumerSecuritiesOrderTransactionInstanceReportRecord
 */
public class CRConsumerSecuritiesOrderTransactionRetrieveInputModelConsumerSecuritiesOrderTransactionInstanceReportRecord   {
  private String consumerSecuritiesOrderTransactionInstanceReportReference = null;

  private String consumerSecuritiesOrderTransactionInstanceReportType = null;

  private String consumerSecuritiesOrderTransactionInstanceReportParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return consumerSecuritiesOrderTransactionInstanceReportReference
  **/

  public String getConsumerSecuritiesOrderTransactionInstanceReportReference() {
    return consumerSecuritiesOrderTransactionInstanceReportReference;
  }

  public void setConsumerSecuritiesOrderTransactionInstanceReportReference(String consumerSecuritiesOrderTransactionInstanceReportReference) {
    this.consumerSecuritiesOrderTransactionInstanceReportReference = consumerSecuritiesOrderTransactionInstanceReportReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return consumerSecuritiesOrderTransactionInstanceReportType
  **/

  public String getConsumerSecuritiesOrderTransactionInstanceReportType() {
    return consumerSecuritiesOrderTransactionInstanceReportType;
  }

  public void setConsumerSecuritiesOrderTransactionInstanceReportType(String consumerSecuritiesOrderTransactionInstanceReportType) {
    this.consumerSecuritiesOrderTransactionInstanceReportType = consumerSecuritiesOrderTransactionInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return consumerSecuritiesOrderTransactionInstanceReportParameters
  **/

  public String getConsumerSecuritiesOrderTransactionInstanceReportParameters() {
    return consumerSecuritiesOrderTransactionInstanceReportParameters;
  }

  public void setConsumerSecuritiesOrderTransactionInstanceReportParameters(String consumerSecuritiesOrderTransactionInstanceReportParameters) {
    this.consumerSecuritiesOrderTransactionInstanceReportParameters = consumerSecuritiesOrderTransactionInstanceReportParameters;
  }


}

