package com.dhanjyothi.dao.impl;

import java.util.ArrayList;
import java.util.List;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.dhanjyothi.dao.AccountDao;
import com.dhanjyothi.model.Account;
import com.dhanjyothi.model.Beneficiaries;
import com.dhanjyothi.model.Transaction;
import com.dhanjyothi.model.User;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;

@Transactional
@Repository
public class AccountDaoImpl implements AccountDao {

	@Autowired
	JdbcTemplate jdbcTemplate;

	public Account getAccountDetails(int userId, String accountType) throws Exception {
		System.out.print("userId====" + userId);
		// for version 1 considering all the account type as savings account.
		String query = "Select * from Account where acct_holder_id =" + userId + " and acct_type ='S'";
		System.out.print("query====" + query);
		List<Account> account = jdbcTemplate.query(query, new BeanPropertyRowMapper<Account>(Account.class));
		if (account.size() == 1) {
			return account.get(0);
		} else {
			return null;
		}
	}

	public void openSavingsAccount(Account account, boolean isSavingsAccountExists) throws Exception {
		String sql = "insert into account (ACCT_HOLDER_ID,ACCT_TYPE,INT_RATE,ACC_BALANCE,DEPOSIT_TENURE,"
				+ "MATURITY_AMT,ACCOUNT_CREATED_DATE,ACCOUNT_UPDATED_DATE,ACC_STATUS) values(?,?,?,?,?,?,SYSDATE(),SYSDATE(),?)";

		jdbcTemplate.update(sql,
				new Object[] { account.getAcct_holder_id(), account.getAcct_type(), account.getInt_rate(),
						account.getAcc_balance(), account.getDeposit_tenure(), account.getMaturity_amt(),
						account.getAcc_status() });
	}

	public void openTermAccount(Account account) throws Exception {

	}

	public List<Account> getTermAccountDetails(int userId, String accountType) throws Exception {

		return null;
	}

	public User getUserDetails(User user) throws Exception {

		String query = "Select * from user where username = ?";
		return (User) jdbcTemplate.queryForObject(query, new Object[] { user.getUserName() },
				new BeanPropertyRowMapper<User>(User.class));
	}

	// assuming by default all the transactions withinthe bank
	public void saveBeneficiaries(Beneficiaries beneficiaries) throws Exception {

		String sql = "insert into beneficiary (OWNER_ID,BEN_NICK_NAME,BEN_NAME,BEN_ACCT_NUM)" + " values (?,?,?,?)";
		jdbcTemplate.update(sql, new Object[] { beneficiaries.getOwnerID(), beneficiaries.getBenNickName(),
				beneficiaries.getBenName(), beneficiaries.getBenAccNumber() });
	}

	public Account checkAccountExists(int accountId) throws Exception {
		String query = "Select * from account where ACCT_ID = ?";
		return (Account) jdbcTemplate.queryForObject(query, new Object[] { accountId },
				new BeanPropertyRowMapper<Account>(Account.class));
	}

	public List<Beneficiaries> getAllBeneficiaries(int accountId) throws Exception {
		String sql = "select distinct be.ben_id, be.owner_id, be.ben_type, be.ben_nick_name, be.ben_name,"
				+ "be.ben_acct_num from beneficiary be left join account ac on be.owner_id = ac.acct_holder_id "
				+ "where be.owner_id ='" + accountId + "' order by be.ben_name";

		System.out.print("getAllBeneficiaries >>>    " + sql);
		List<Beneficiaries> beneficiary = new ArrayList<Beneficiaries>();
		beneficiary = jdbcTemplate.query(sql,
				(result, rowNum) -> new Beneficiaries(result.getInt("BEN_ID"), result.getInt("OWNER_ID"),
						result.getString("BEN_TYPE"), result.getString("BEN_NICK_NAME"), result.getString("BEN_NAME"),
						result.getString("BEN_ACCT_NUM"), "BEN_BANK", "BEN_BANK_IFSC"));
		return beneficiary;
	}

	@Transactional(isolation = Isolation.READ_COMMITTED, propagation = Propagation.REQUIRED, readOnly = false, timeout = 100, rollbackFor = Exception.class)
	public void updateTransactionDetails(Transaction transaction) throws Exception {

		// get transaction users account balance.
		String debitFromAcctAmtSql = "select acc_balance from account where acct_id = ?";
		String CreditToAcctAmtSql = "select acc_balance from account where acct_id = ?";

		String debitFromAcctAmt = (String) jdbcTemplate.queryForObject(debitFromAcctAmtSql,
				new Object[] { transaction.getDebit_acct() }, String.class);

		String CreditToAcctAmt = (String) jdbcTemplate.queryForObject(CreditToAcctAmtSql,
				new Object[] { transaction.getCredit_acct() }, String.class);

		// perform transaction
		double updateDbtAcctAmt = Double.valueOf(debitFromAcctAmt) - transaction.getTrn_amt();
		double updateCrdtAcctAmt = Double.valueOf(CreditToAcctAmt) + transaction.getTrn_amt();

		// update the details to account table

		String dbtSql = "update account set acc_balance = ? where acct_id= ?";
		int dbt = jdbcTemplate.update(dbtSql, updateDbtAcctAmt, transaction.getDebit_acct());

		String crdtSql = "update account set acc_balance = ? where acct_id= ?";
		int cdt = jdbcTemplate.update(crdtSql, updateCrdtAcctAmt, transaction.getCredit_acct());

		if (dbt >= 1 && cdt >= 1) {
			String transSql = "INSERT INTO transaction (DEBIT_ACCT, CREDIT_ACCT,  TRN_DESC, TRN_AMT,TRN_DT_TIME) "
					+ "VALUES(?,?,?,?,SYSDATE())";

			int trans = jdbcTemplate.update(transSql, transaction.getDebit_acct(), transaction.getCredit_acct(),
					transaction.getTrn_desc(), transaction.getTrn_amt());
		}
	}

	public List<Transaction> loadAllTransactions(int accountId) throws Exception {

		return null;
	}

	public User isUserNameExists(String userName) throws Exception {

		return null;
	}

	public User getUserById(int userId) throws Exception {
		String query = "Select * from user where user_id = ?";
		return (User) jdbcTemplate.queryForObject(query, new Object[] { userId },
				new BeanPropertyRowMapper<User>(User.class));
	}

}
