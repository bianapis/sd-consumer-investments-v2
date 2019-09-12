package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRConsumerSecuritiesOrderTransactionRetrieveOutputModelConsumerSecuritiesOrderTransactionInstanceReportRecord
 */
public class CRConsumerSecuritiesOrderTransactionRetrieveOutputModelConsumerSecuritiesOrderTransactionInstanceReportRecord   {
  private String consumerSecuritiesOrderTransactionInstanceReportData = null;

  private String consumerSecuritiesOrderTransactionInstanceReportType = null;

  private Object consumerSecuritiesOrderTransactionInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return consumerSecuritiesOrderTransactionInstanceReportData
  **/

  public String getConsumerSecuritiesOrderTransactionInstanceReportData() {
    return consumerSecuritiesOrderTransactionInstanceReportData;
  }

  public void setConsumerSecuritiesOrderTransactionInstanceReportData(String consumerSecuritiesOrderTransactionInstanceReportData) {
    this.consumerSecuritiesOrderTransactionInstanceReportData = consumerSecuritiesOrderTransactionInstanceReportData;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return consumerSecuritiesOrderTransactionInstanceReport
  **/

  public Object getConsumerSecuritiesOrderTransactionInstanceReport() {
    return consumerSecuritiesOrderTransactionInstanceReport;
  }

  public void setConsumerSecuritiesOrderTransactionInstanceReport(Object consumerSecuritiesOrderTransactionInstanceReport) {
    this.consumerSecuritiesOrderTransactionInstanceReport = consumerSecuritiesOrderTransactionInstanceReport;
  }


}

