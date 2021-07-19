package com.hrm.service;

import com.hrm.pojo.TransactionHistory;
import com.hrm.pojo.ExperienceHistory;
import com.hrm.pojo.Page;

import java.util.ArrayList;


public interface TransactionHistoryService {

    //在交易表中查找流水信息
    ArrayList<TransactionHistory> findTransactionHistory(Page page_num);

    ArrayList<ExperienceHistory> findExperienceHistory(Page page_num);
}
