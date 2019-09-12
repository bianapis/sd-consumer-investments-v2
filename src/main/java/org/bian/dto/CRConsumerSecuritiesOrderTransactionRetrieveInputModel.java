package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRConsumerSecuritiesOrderTransactionRetrieveInputModelConsumerSecuritiesOrderTransactionInstanceAnalysis;
import org.bian.dto.CRConsumerSecuritiesOrderTransactionRetrieveInputModelConsumerSecuritiesOrderTransactionInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRConsumerSecuritiesOrderTransactionRetrieveInputModel
 */
public class CRConsumerSecuritiesOrderTransactionRetrieveInputModel   {
  private Object consumerSecuritiesOrderTransactionRetrieveActionTaskRecord = null;

  private String consumerSecuritiesOrderTransactionRetrieveActionRequest = null;

  private CRConsumerSecuritiesOrderTransactionRetrieveInputModelConsumerSecuritiesOrderTransactionInstanceReportRecord consumerSecuritiesOrderTransactionInstanceReportRecord = null;

  private CRConsumerSecuritiesOrderTransactionRetrieveInputModelConsumerSecuritiesOrderTransactionInstanceAnalysis consumerSecuritiesOrderTransactionInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return consumerSecuritiesOrderTransactionRetrieveActionTaskRecord
  **/

  public Object getConsumerSecuritiesOrderTransactionRetrieveActionTaskRecord() {
    return consumerSecuritiesOrderTransactionRetrieveActionTaskRecord;
  }

  public void setConsumerSecuritiesOrderTransactionRetrieveActionTaskRecord(Object consumerSecuritiesOrderTransactionRetrieveActionTaskRecord) {
    this.consumerSecuritiesOrderTransactionRetrieveActionTaskRecord = consumerSecuritiesOrderTransactionRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return consumerSecuritiesOrderTransactionRetrieveActionRequest
  **/

  public String getConsumerSecuritiesOrderTransactionRetrieveActionRequest() {
    return consumerSecuritiesOrderTransactionRetrieveActionRequest;
  }

  public void setConsumerSecuritiesOrderTransactionRetrieveActionRequest(String consumerSecuritiesOrderTransactionRetrieveActionRequest) {
    this.consumerSecuritiesOrderTransactionRetrieveActionRequest = consumerSecuritiesOrderTransactionRetrieveActionRequest;
  }


  /**
   * Get consumerSecuritiesOrderTransactionInstanceReportRecord
   * @return consumerSecuritiesOrderTransactionInstanceReportRecord
  **/

  public CRConsumerSecuritiesOrderTransactionRetrieveInputModelConsumerSecuritiesOrderTransactionInstanceReportRecord getConsumerSecuritiesOrderTransactionInstanceReportRecord() {
    return consumerSecuritiesOrderTransactionInstanceReportRecord;
  }

  public void setConsumerSecuritiesOrderTransactionInstanceReportRecord(CRConsumerSecuritiesOrderTransactionRetrieveInputModelConsumerSecuritiesOrderTransactionInstanceReportRecord consumerSecuritiesOrderTransactionInstanceReportRecord) {
    this.consumerSecuritiesOrderTransactionInstanceReportRecord = consumerSecuritiesOrderTransactionInstanceReportRecord;
  }


  /**
   * Get consumerSecuritiesOrderTransactionInstanceAnalysis
   * @return consumerSecuritiesOrderTransactionInstanceAnalysis
  **/

  public CRConsumerSecuritiesOrderTransactionRetrieveInputModelConsumerSecuritiesOrderTransactionInstanceAnalysis getConsumerSecuritiesOrderTransactionInstanceAnalysis() {
    return consumerSecuritiesOrderTransactionInstanceAnalysis;
  }

  public void setConsumerSecuritiesOrderTransactionInstanceAnalysis(CRConsumerSecuritiesOrderTransactionRetrieveInputModelConsumerSecuritiesOrderTransactionInstanceAnalysis consumerSecuritiesOrderTransactionInstanceAnalysis) {
    this.consumerSecuritiesOrderTransactionInstanceAnalysis = consumerSecuritiesOrderTransactionInstanceAnalysis;
  }


}

