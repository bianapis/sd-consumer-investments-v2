package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRConsumerSecuritiesOrderTransactionRetrieveOutputModelConsumerSecuritiesOrderTransactionInstanceAnalysis
 */
public class CRConsumerSecuritiesOrderTransactionRetrieveOutputModelConsumerSecuritiesOrderTransactionInstanceAnalysis   {
  private String consumerSecuritiesOrderTransactionInstanceAnalysisData = null;

  private String consumerSecuritiesOrderTransactionInstanceAnalysisReportType = null;

  private Object consumerSecuritiesOrderTransactionInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return consumerSecuritiesOrderTransactionInstanceAnalysisData
  **/

  public String getConsumerSecuritiesOrderTransactionInstanceAnalysisData() {
    return consumerSecuritiesOrderTransactionInstanceAnalysisData;
  }

  public void setConsumerSecuritiesOrderTransactionInstanceAnalysisData(String consumerSecuritiesOrderTransactionInstanceAnalysisData) {
    this.consumerSecuritiesOrderTransactionInstanceAnalysisData = consumerSecuritiesOrderTransactionInstanceAnalysisData;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return consumerSecuritiesOrderTransactionInstanceAnalysisReport
  **/

  public Object getConsumerSecuritiesOrderTransactionInstanceAnalysisReport() {
    return consumerSecuritiesOrderTransactionInstanceAnalysisReport;
  }

  public void setConsumerSecuritiesOrderTransactionInstanceAnalysisReport(Object consumerSecuritiesOrderTransactionInstanceAnalysisReport) {
    this.consumerSecuritiesOrderTransactionInstanceAnalysisReport = consumerSecuritiesOrderTransactionInstanceAnalysisReport;
  }


}

