/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class ConsumerInvestmentsApiServiceImpl implements ConsumerInvestmentsApiService {

	public SDConsumerInvestmentsActivateOutputModel activate(SDConsumerInvestmentsActivateInputModel request){
		return JsonReader.read("activate-SDConsumerInvestmentsActivateOutputModel.json",new TypeReference<SDConsumerInvestmentsActivateOutputModel>(){});
	}
	
	public SDConsumerInvestmentsConfigureOutputModel configure(String sdReferenceId, SDConsumerInvestmentsConfigureInputModel request){
		return JsonReader.read("configure-SDConsumerInvestmentsConfigureOutputModel.json",new TypeReference<SDConsumerInvestmentsConfigureOutputModel>(){});
	}
	
	public BQOrderInitiationExchangeOutputModel exchangeOrderinitiation(String sdReferenceId, String crReferenceId, String bqReferenceId, BQOrderInitiationExchangeInputModel request){
		return JsonReader.read("exchange-BQOrderInitiationExchangeOutputModel.json",new TypeReference<BQOrderInitiationExchangeOutputModel>(){});
	}
	
	public SDConsumerInvestmentsFeedbackOutputModel feedback(String sdReferenceId, SDConsumerInvestmentsFeedbackInputModel request){
		return JsonReader.read("feedback-SDConsumerInvestmentsFeedbackOutputModel.json",new TypeReference<SDConsumerInvestmentsFeedbackOutputModel>(){});
	}
	
	public CRConsumerSecuritiesOrderTransactionInitiateOutputModel initiate(String sdReferenceId, CRConsumerSecuritiesOrderTransactionInitiateInputModel request){
		return JsonReader.read("initiate-CRConsumerSecuritiesOrderTransactionInitiateOutputModel.json",new TypeReference<CRConsumerSecuritiesOrderTransactionInitiateOutputModel>(){});
	}
	
	public CRConsumerSecuritiesOrderTransactionRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId){
		return JsonReader.read("retrieve-CRConsumerSecuritiesOrderTransactionRetrieveOutputModel.json",new TypeReference<CRConsumerSecuritiesOrderTransactionRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveRefIds(String sdReferenceId){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public BQComplianceRetrieveOutputModel retrieveCompliance(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQComplianceRetrieveOutputModel.json",new TypeReference<BQComplianceRetrieveOutputModel>(){});
	}
	
	public BQFundingCheckRetrieveOutputModel retrieveFundingcheck(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQFundingCheckRetrieveOutputModel.json",new TypeReference<BQFundingCheckRetrieveOutputModel>(){});
	}
	
	public BQOrderInitiationRetrieveOutputModel retrieveOrderinitiation(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQOrderInitiationRetrieveOutputModel.json",new TypeReference<BQOrderInitiationRetrieveOutputModel>(){});
	}
	
	public BQQuoteRetrieveOutputModel retrieveQuote(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQQuoteRetrieveOutputModel.json",new TypeReference<BQQuoteRetrieveOutputModel>(){});
	}
	
	public SDConsumerInvestmentsRetrieveOutputModel retrieveSD(String sdReferenceId){
		return JsonReader.read("retrieveSD-SDConsumerInvestmentsRetrieveOutputModel.json",new TypeReference<SDConsumerInvestmentsRetrieveOutputModel>(){});
	}
	
	public CRConsumerSecuritiesOrderTransactionUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRConsumerSecuritiesOrderTransactionUpdateInputModel request){
		return JsonReader.read("update-CRConsumerSecuritiesOrderTransactionUpdateOutputModel.json",new TypeReference<CRConsumerSecuritiesOrderTransactionUpdateOutputModel>(){});
	}
	
}
