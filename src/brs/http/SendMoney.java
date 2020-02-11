package brs.http;

import brs.Account;
import brs.BurstException;
import brs.GeneratorImpl;
import brs.services.ParameterService;
import com.google.gson.JsonElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;

import static brs.http.common.Parameters.AMOUNT_NQT_PARAMETER;
import static brs.http.common.Parameters.RECIPIENT_PARAMETER;

final class SendMoney extends CreateTransaction {

  private final ParameterService parameterService;
  private static final Logger logger = LoggerFactory.getLogger(SendMoney.class);

  SendMoney(ParameterService parameterService, APITransactionManager apiTransactionManager) {
    super(new APITag[]{APITag.ACCOUNTS, APITag.CREATE_TRANSACTION}, apiTransactionManager, RECIPIENT_PARAMETER, AMOUNT_NQT_PARAMETER);
    this.parameterService = parameterService;
  }

  @Override
  JsonElement processRequest(HttpServletRequest req) throws BurstException {
    long recipient = ParameterParser.getRecipientId(req);
    long amountNQT = ParameterParser.getAmountNQT(req);
    Account account = parameterService.getSenderAccount(req);
    return createTransaction(req, account, recipient, amountNQT);
  }

}
