package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRConsumerSecuritiesOrderTransactionRetrieveOutputModelConsumerSecuritiesOrderTransactionInstanceAnalysis;
import org.bian.dto.CRConsumerSecuritiesOrderTransactionRetrieveOutputModelConsumerSecuritiesOrderTransactionInstanceRecord;
import org.bian.dto.CRConsumerSecuritiesOrderTransactionRetrieveOutputModelConsumerSecuritiesOrderTransactionInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRConsumerSecuritiesOrderTransactionRetrieveOutputModel
 */
public class CRConsumerSecuritiesOrderTransactionRetrieveOutputModel   {
  private CRConsumerSecuritiesOrderTransactionRetrieveOutputModelConsumerSecuritiesOrderTransactionInstanceRecord consumerSecuritiesOrderTransactionInstanceRecord = null;

  private String consumerSecuritiesOrderTransactionRetrieveActionTaskReference = null;

  private Object consumerSecuritiesOrderTransactionRetrieveActionTaskRecord = null;

  private String consumerSecuritiesOrderTransactionRetrieveActionResponse = null;

  private CRConsumerSecuritiesOrderTransactionRetrieveOutputModelConsumerSecuritiesOrderTransactionInstanceReportRecord consumerSecuritiesOrderTransactionInstanceReportRecord = null;

  private CRConsumerSecuritiesOrderTransactionRetrieveOutputModelConsumerSecuritiesOrderTransactionInstanceAnalysis consumerSecuritiesOrderTransactionInstanceAnalysis = null;


  /**
   * Get consumerSecuritiesOrderTransactionInstanceRecord
   * @return consumerSecuritiesOrderTransactionInstanceRecord
  **/

  public CRConsumerSecuritiesOrderTransactionRetrieveOutputModelConsumerSecuritiesOrderTransactionInstanceRecord getConsumerSecuritiesOrderTransactionInstanceRecord() {
    return consumerSecuritiesOrderTransactionInstanceRecord;
  }

  public void setConsumerSecuritiesOrderTransactionInstanceRecord(CRConsumerSecuritiesOrderTransactionRetrieveOutputModelConsumerSecuritiesOrderTransactionInstanceRecord consumerSecuritiesOrderTransactionInstanceRecord) {
    this.consumerSecuritiesOrderTransactionInstanceRecord = consumerSecuritiesOrderTransactionInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Consumer Securities Order Transaction instance retrieve service call 
   * @return consumerSecuritiesOrderTransactionRetrieveActionTaskReference
  **/

  public String getConsumerSecuritiesOrderTransactionRetrieveActionTaskReference() {
    return consumerSecuritiesOrderTransactionRetrieveActionTaskReference;
  }

  public void setConsumerSecuritiesOrderTransactionRetrieveActionTaskReference(String consumerSecuritiesOrderTransactionRetrieveActionTaskReference) {
    this.consumerSecuritiesOrderTransactionRetrieveActionTaskReference = consumerSecuritiesOrderTransactionRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return consumerSecuritiesOrderTransactionRetrieveActionResponse
  **/

  public String getConsumerSecuritiesOrderTransactionRetrieveActionResponse() {
    return consumerSecuritiesOrderTransactionRetrieveActionResponse;
  }

  public void setConsumerSecuritiesOrderTransactionRetrieveActionResponse(String consumerSecuritiesOrderTransactionRetrieveActionResponse) {
    this.consumerSecuritiesOrderTransactionRetrieveActionResponse = consumerSecuritiesOrderTransactionRetrieveActionResponse;
  }


  /**
   * Get consumerSecuritiesOrderTransactionInstanceReportRecord
   * @return consumerSecuritiesOrderTransactionInstanceReportRecord
  **/

  public CRConsumerSecuritiesOrderTransactionRetrieveOutputModelConsumerSecuritiesOrderTransactionInstanceReportRecord getConsumerSecuritiesOrderTransactionInstanceReportRecord() {
    return consumerSecuritiesOrderTransactionInstanceReportRecord;
  }

  public void setConsumerSecuritiesOrderTransactionInstanceReportRecord(CRConsumerSecuritiesOrderTransactionRetrieveOutputModelConsumerSecuritiesOrderTransactionInstanceReportRecord consumerSecuritiesOrderTransactionInstanceReportRecord) {
    this.consumerSecuritiesOrderTransactionInstanceReportRecord = consumerSecuritiesOrderTransactionInstanceReportRecord;
  }


  /**
   * Get consumerSecuritiesOrderTransactionInstanceAnalysis
   * @return consumerSecuritiesOrderTransactionInstanceAnalysis
  **/

  public CRConsumerSecuritiesOrderTransactionRetrieveOutputModelConsumerSecuritiesOrderTransactionInstanceAnalysis getConsumerSecuritiesOrderTransactionInstanceAnalysis() {
    return consumerSecuritiesOrderTransactionInstanceAnalysis;
  }

  public void setConsumerSecuritiesOrderTransactionInstanceAnalysis(CRConsumerSecuritiesOrderTransactionRetrieveOutputModelConsumerSecuritiesOrderTransactionInstanceAnalysis consumerSecuritiesOrderTransactionInstanceAnalysis) {
    this.consumerSecuritiesOrderTransactionInstanceAnalysis = consumerSecuritiesOrderTransactionInstanceAnalysis;
  }


}

