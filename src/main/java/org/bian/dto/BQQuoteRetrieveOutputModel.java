package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQQuoteRetrieveOutputModelConsumerSecuritiesOrderTransactionInstanceRecord;
import org.bian.dto.BQQuoteRetrieveOutputModelQuoteInstanceAnalysis;
import org.bian.dto.BQQuoteRetrieveOutputModelQuoteInstanceRecord;
import org.bian.dto.BQQuoteRetrieveOutputModelQuoteInstanceReport;

import javax.validation.Valid;
  
/**
 * BQQuoteRetrieveOutputModel
 */
public class BQQuoteRetrieveOutputModel   {
  private BQQuoteRetrieveOutputModelConsumerSecuritiesOrderTransactionInstanceRecord consumerSecuritiesOrderTransactionInstanceRecord = null;

  private BQQuoteRetrieveOutputModelQuoteInstanceRecord quoteInstanceRecord = null;

  private String quoteRetrieveActionTaskReference = null;

  private Object quoteRetrieveActionTaskRecord = null;

  private String quoteRetrieveActionResponse = null;

  private BQQuoteRetrieveOutputModelQuoteInstanceReport quoteInstanceReport = null;

  private BQQuoteRetrieveOutputModelQuoteInstanceAnalysis quoteInstanceAnalysis = null;


  /**
   * Get consumerSecuritiesOrderTransactionInstanceRecord
   * @return consumerSecuritiesOrderTransactionInstanceRecord
  **/

  public BQQuoteRetrieveOutputModelConsumerSecuritiesOrderTransactionInstanceRecord getConsumerSecuritiesOrderTransactionInstanceRecord() {
    return consumerSecuritiesOrderTransactionInstanceRecord;
  }

  public void setConsumerSecuritiesOrderTransactionInstanceRecord(BQQuoteRetrieveOutputModelConsumerSecuritiesOrderTransactionInstanceRecord consumerSecuritiesOrderTransactionInstanceRecord) {
    this.consumerSecuritiesOrderTransactionInstanceRecord = consumerSecuritiesOrderTransactionInstanceRecord;
  }


  /**
   * Get quoteInstanceRecord
   * @return quoteInstanceRecord
  **/

  public BQQuoteRetrieveOutputModelQuoteInstanceRecord getQuoteInstanceRecord() {
    return quoteInstanceRecord;
  }

  public void setQuoteInstanceRecord(BQQuoteRetrieveOutputModelQuoteInstanceRecord quoteInstanceRecord) {
    this.quoteInstanceRecord = quoteInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Quote instance retrieve service call 
   * @return quoteRetrieveActionTaskReference
  **/

  public String getQuoteRetrieveActionTaskReference() {
    return quoteRetrieveActionTaskReference;
  }

  public void setQuoteRetrieveActionTaskReference(String quoteRetrieveActionTaskReference) {
    this.quoteRetrieveActionTaskReference = quoteRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return quoteRetrieveActionTaskRecord
  **/

  public Object getQuoteRetrieveActionTaskRecord() {
    return quoteRetrieveActionTaskRecord;
  }

  public void setQuoteRetrieveActionTaskRecord(Object quoteRetrieveActionTaskRecord) {
    this.quoteRetrieveActionTaskRecord = quoteRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return quoteRetrieveActionResponse
  **/

  public String getQuoteRetrieveActionResponse() {
    return quoteRetrieveActionResponse;
  }

  public void setQuoteRetrieveActionResponse(String quoteRetrieveActionResponse) {
    this.quoteRetrieveActionResponse = quoteRetrieveActionResponse;
  }


  /**
   * Get quoteInstanceReport
   * @return quoteInstanceReport
  **/

  public BQQuoteRetrieveOutputModelQuoteInstanceReport getQuoteInstanceReport() {
    return quoteInstanceReport;
  }

  public void setQuoteInstanceReport(BQQuoteRetrieveOutputModelQuoteInstanceReport quoteInstanceReport) {
    this.quoteInstanceReport = quoteInstanceReport;
  }


  /**
   * Get quoteInstanceAnalysis
   * @return quoteInstanceAnalysis
  **/

  public BQQuoteRetrieveOutputModelQuoteInstanceAnalysis getQuoteInstanceAnalysis() {
    return quoteInstanceAnalysis;
  }

  public void setQuoteInstanceAnalysis(BQQuoteRetrieveOutputModelQuoteInstanceAnalysis quoteInstanceAnalysis) {
    this.quoteInstanceAnalysis = quoteInstanceAnalysis;
  }


}

