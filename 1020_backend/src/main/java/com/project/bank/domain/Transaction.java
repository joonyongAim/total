package com.project.bank.domain;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.CreationTimestamp;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Transaction {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer id;

	@JsonBackReference
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "accountId")
	private Account account;
	
	@Column(nullable = false, length = 20)
	private int money;
	
	@CreationTimestamp
	private Timestamp time;
	
//	@Enumerated(EnumType.STRING)
//	private TransferType type; // DEPOSIT, WITHDRAW, money 음/양으로 할 수는 있어서...
	
	@Column(length = 20)
	private String subject; // 거래 대상의 이름 fname

	@Column(length = 100)
	private String memo;

	public Transaction(Account account, int money, String subject, String memo) {
		super();
		this.account = account;
		this.money = money;
		this.subject = subject;
		this.memo = memo;
	}
	
	
}