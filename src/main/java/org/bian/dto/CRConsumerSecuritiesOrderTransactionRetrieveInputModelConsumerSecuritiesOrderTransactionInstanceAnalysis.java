package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRConsumerSecuritiesOrderTransactionRetrieveInputModelConsumerSecuritiesOrderTransactionInstanceAnalysis
 */
public class CRConsumerSecuritiesOrderTransactionRetrieveInputModelConsumerSecuritiesOrderTransactionInstanceAnalysis   {
  private String consumerSecuritiesOrderTransactionInstanceAnalysisReference = null;

  private String consumerSecuritiesOrderTransactionInstanceAnalysisReportType = null;

  private String consumerSecuritiesOrderTransactionInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return consumerSecuritiesOrderTransactionInstanceAnalysisReference
  **/

  public String getConsumerSecuritiesOrderTransactionInstanceAnalysisReference() {
    return consumerSecuritiesOrderTransactionInstanceAnalysisReference;
  }

  public void setConsumerSecuritiesOrderTransactionInstanceAnalysisReference(String consumerSecuritiesOrderTransactionInstanceAnalysisReference) {
    this.consumerSecuritiesOrderTransactionInstanceAnalysisReference = consumerSecuritiesOrderTransactionInstanceAnalysisReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return consumerSecuritiesOrderTransactionInstanceAnalysisReportType
  **/

  public String getConsumerSecuritiesOrderTransactionInstanceAnalysisReportType() {
    return consumerSecuritiesOrderTransactionInstanceAnalysisReportType;
  }

  public void setConsumerSecuritiesOrderTransactionInstanceAnalysisReportType(String consumerSecuritiesOrderTransactionInstanceAnalysisReportType) {
    this.consumerSecuritiesOrderTransactionInstanceAnalysisReportType = consumerSecuritiesOrderTransactionInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return consumerSecuritiesOrderTransactionInstanceAnalysisParameters
  **/

  public String getConsumerSecuritiesOrderTransactionInstanceAnalysisParameters() {
    return consumerSecuritiesOrderTransactionInstanceAnalysisParameters;
  }

  public void setConsumerSecuritiesOrderTransactionInstanceAnalysisParameters(String consumerSecuritiesOrderTransactionInstanceAnalysisParameters) {
    this.consumerSecuritiesOrderTransactionInstanceAnalysisParameters = consumerSecuritiesOrderTransactionInstanceAnalysisParameters;
  }


}

