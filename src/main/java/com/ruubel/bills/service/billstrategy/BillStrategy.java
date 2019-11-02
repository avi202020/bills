package com.ruubel.bills.service.billstrategy;

import com.google.api.services.gmail.Gmail;
import com.google.api.services.gmail.model.Message;
import com.ruubel.bills.model.Bill;

public interface BillStrategy {

    String SENDER_EMAIL = "sender-email";

    Double getToPay(Bill bill, Message message, Gmail gmail) throws Exception;
}
