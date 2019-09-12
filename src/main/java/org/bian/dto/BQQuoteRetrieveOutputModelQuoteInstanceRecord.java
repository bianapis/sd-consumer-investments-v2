package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQQuoteRetrieveOutputModelQuoteInstanceRecord
 */
public class BQQuoteRetrieveOutputModelQuoteInstanceRecord   {
  private String securitiesPrice = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The prevailing bank buy/sell quote for the security 
   * @return securitiesPrice
  **/

  public String getSecuritiesPrice() {
    return securitiesPrice;
  }

  public void setSecuritiesPrice(String securitiesPrice) {
    this.securitiesPrice = securitiesPrice;
  }


}

