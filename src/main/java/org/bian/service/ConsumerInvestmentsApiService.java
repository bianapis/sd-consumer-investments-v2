/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface ConsumerInvestmentsApiService {

	SDConsumerInvestmentsActivateOutputModel activate(SDConsumerInvestmentsActivateInputModel request);
	
	SDConsumerInvestmentsConfigureOutputModel configure(String sdReferenceId, SDConsumerInvestmentsConfigureInputModel request);
	
	BQOrderInitiationExchangeOutputModel exchangeOrderinitiation(String sdReferenceId, String crReferenceId, String bqReferenceId, BQOrderInitiationExchangeInputModel request);
	
	SDConsumerInvestmentsFeedbackOutputModel feedback(String sdReferenceId, SDConsumerInvestmentsFeedbackInputModel request);
	
	CRConsumerSecuritiesOrderTransactionInitiateOutputModel initiate(String sdReferenceId, CRConsumerSecuritiesOrderTransactionInitiateInputModel request);
	
	CRConsumerSecuritiesOrderTransactionRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId);
	
	List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	List<String> retrieveRefIds(String sdReferenceId);
	
	BQComplianceRetrieveOutputModel retrieveCompliance(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQFundingCheckRetrieveOutputModel retrieveFundingcheck(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQOrderInitiationRetrieveOutputModel retrieveOrderinitiation(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQQuoteRetrieveOutputModel retrieveQuote(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	SDConsumerInvestmentsRetrieveOutputModel retrieveSD(String sdReferenceId);
	
	CRConsumerSecuritiesOrderTransactionUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRConsumerSecuritiesOrderTransactionUpdateInputModel request);
	
}
