package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRConsumerSecuritiesOrderTransactionUpdateInputModelConsumerSecuritiesOrderTransactionInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRConsumerSecuritiesOrderTransactionUpdateOutputModel
 */
public class CRConsumerSecuritiesOrderTransactionUpdateOutputModel   {
  private CRConsumerSecuritiesOrderTransactionUpdateInputModelConsumerSecuritiesOrderTransactionInstanceRecord consumerSecuritiesOrderTransactionInstanceRecord = null;

  private String consumerSecuritiesOrderTransactionUpdateActionTaskReference = null;

  private Object consumerSecuritiesOrderTransactionUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


  /**
   * Get consumerSecuritiesOrderTransactionInstanceRecord
   * @return consumerSecuritiesOrderTransactionInstanceRecord
  **/

  public CRConsumerSecuritiesOrderTransactionUpdateInputModelConsumerSecuritiesOrderTransactionInstanceRecord getConsumerSecuritiesOrderTransactionInstanceRecord() {
    return consumerSecuritiesOrderTransactionInstanceRecord;
  }

  public void setConsumerSecuritiesOrderTransactionInstanceRecord(CRConsumerSecuritiesOrderTransactionUpdateInputModelConsumerSecuritiesOrderTransactionInstanceRecord consumerSecuritiesOrderTransactionInstanceRecord) {
    this.consumerSecuritiesOrderTransactionInstanceRecord = consumerSecuritiesOrderTransactionInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return consumerSecuritiesOrderTransactionUpdateActionTaskReference
  **/

  public String getConsumerSecuritiesOrderTransactionUpdateActionTaskReference() {
    return consumerSecuritiesOrderTransactionUpdateActionTaskReference;
  }

  public void setConsumerSecuritiesOrderTransactionUpdateActionTaskReference(String consumerSecuritiesOrderTransactionUpdateActionTaskReference) {
    this.consumerSecuritiesOrderTransactionUpdateActionTaskReference = consumerSecuritiesOrderTransactionUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return consumerSecuritiesOrderTransactionUpdateActionTaskRecord
  **/

  public Object getConsumerSecuritiesOrderTransactionUpdateActionTaskRecord() {
    return consumerSecuritiesOrderTransactionUpdateActionTaskRecord;
  }

  public void setConsumerSecuritiesOrderTransactionUpdateActionTaskRecord(Object consumerSecuritiesOrderTransactionUpdateActionTaskRecord) {
    this.consumerSecuritiesOrderTransactionUpdateActionTaskRecord = consumerSecuritiesOrderTransactionUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

