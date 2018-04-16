package com.chc.SpringBootMybatis.entity;

import java.io.Serializable;

import java.math.BigInteger;

import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
@Entity
@Table(name = "T_TXNLOG")
public class TTxnLog implements Serializable {
	private static final long serialVersionUID = -9078301631966945751L;
	@Id
	//@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="I_FEELSNSequence")
	//@SequenceGenerator(name = "I_FEELSNSequence", sequenceName = "SEQ_I_FEELSN", allocationSize=1)
	private Integer I_FEELSN; // 流水号
	private String C_DATE; // 日期
	private String C_TIME; // 时间
	private String C_TERMCODE; // 终端编号
	private String C_TRACENO; // 系统跟踪号
	private String C_TRANSDATETIME; // 交易日期
	private String C_TRANSDATE; // 交易日期
	private String C_TRANSTIME; // 交易时间
	private String C_MSGTYPE; // 消息类型
	private String C_PROCCODE; // 处理码
	private BigInteger I_TXNID; // 交易ID
	private Double I_TXNAMOUNT; // 交易金额(RMB以元为单位)
	private String C_PAN; // 主账号
	private String C_ISSUERCODE; // 受理机构码
	private String C_SETTDATE; // 清算日期
	private String C_FUNDTYPE; // 货币代码
	private String C_ORGTRACENO; //
	private String C_RESPCODE; // 响应码
	private String C_TFRINACC; // 转入账户
	private String C_TFROUTACC; // 转出账户
	private String C_RETRIVEREFNO; // 检索参考号
	private String C_AUTHORCODE; // 授权码
	private Double I_TRANSFEE; // 交易费用
	private String C_SERVICECODE; // 服务接入点
	private Integer I_SETTFLAG; // 清算标识(0表示不参与结，1表示未结算（需要结算），2表示已结算，8表示交易被撤销，9表示交易被冲正)
	private String C_TXNSTATE; // 交易状态(0正常交易,1PAYMENT, 8VOID,9REVERSAL)
	private String C_BATCHNUM; // 交易批次号(在POS交易应用中记录交易批次号)
	private String C_RECONSWITCH; //
	private String C_RECONSERVICE; //
	private Integer I_CHECKATM; //
	private Integer I_STATISFLAG; //
	private String C_ACQUIRCODE; //
	private String C_EXPIREDATE; // 卡有效期
	private String C_MERCTYPE; // 商户类型
	private String C_ACQCRYCODE; // 国家代码
	private String C_SRVPOINTCODE; //
	private String C_NETID; //
	private String C_SRVENVCODE; //
	private String C_MERCID; // 商户ID
	private String C_MERCNAME; // 商户名称
	private String C_LOCAID; //
	private String C_MIDTYPE; //
	private String C_TRACK2; // 2磁道
	private String C_CARDTYPE; // 卡类型
	private Integer I_CARDDENOM; //
	private String C_CARDLISTID; //
	private String C_USERDATA; //
	private Integer I_SOURCHANNEL; //
	private Integer I_DESTCHANNEL; //
	private String C_RESERVAL0; // 自定义数据
	private String C_RESERVAL1; //
	private String C_RESERVAL2; //
	private String C_RESERVAL3; //
	private String C_RESERVAL4; //

	public Integer getI_FEELSN() {
		return I_FEELSN;
	}

	public void setI_FEELSN(Integer i_FEELSN) {
		I_FEELSN = i_FEELSN;
	}

	public String getC_DATE() {
		return C_DATE;
	}

	public void setC_DATE(String c_DATE) {
		C_DATE = c_DATE;
	}

	public String getC_TIME() {
		return C_TIME;
	}

	public void setC_TIME(String c_TIME) {
		C_TIME = c_TIME;
	}

	
	public String getC_TERMCODE() {
		return C_TERMCODE;
	}

	public void setC_TERMCODE(String c_TERMCODE) {
		C_TERMCODE = c_TERMCODE;
	}

	
	public String getC_TRACENO() {
		return C_TRACENO;
	}

	public void setC_TRACENO(String c_TRACENO) {
		C_TRACENO = c_TRACENO;
	}

	
	public String getC_TRANSDATETIME() {
		return C_TRANSDATETIME;
	}

	public void setC_TRANSDATETIME(String c_TRANSDATETIME) {
		C_TRANSDATETIME = c_TRANSDATETIME;
	}

	public String getC_TRANSDATE() {
		return C_TRANSDATE;
	}

	public void setC_TRANSDATE(String c_TRANSDATE) {
		C_TRANSDATE = c_TRANSDATE;
	}

	public String getC_TRANSTIME() {
		return C_TRANSTIME;
	}

	public void setC_TRANSTIME(String c_TRANSTIME) {
		C_TRANSTIME = c_TRANSTIME;
	}

	public String getC_MSGTYPE() {
		return C_MSGTYPE;
	}

	public void setC_MSGTYPE(String c_MSGTYPE) {
		C_MSGTYPE = c_MSGTYPE;
	}

	public String getC_PROCCODE() {
		return C_PROCCODE;
	}

	public void setC_PROCCODE(String c_PROCCODE) {
		C_PROCCODE = c_PROCCODE;
	}

	public BigInteger getI_TXNID() {
		return I_TXNID;
	}

	public void setI_TXNID(BigInteger i_TXNID) {
		I_TXNID = i_TXNID;
	}

	public Double getI_TXNAMOUNT() {
		return I_TXNAMOUNT;
	}

	public void setI_TXNAMOUNT(Double i_TXNAMOUNT) {
		I_TXNAMOUNT = i_TXNAMOUNT;
	}

	public String getC_PAN() {
		return C_PAN;
	}

	public void setC_PAN(String c_PAN) {
		C_PAN = c_PAN;
	}

	public String getC_ISSUERCODE() {
		return C_ISSUERCODE;
	}

	public void setC_ISSUERCODE(String c_ISSUERCODE) {
		C_ISSUERCODE = c_ISSUERCODE;
	}

	public String getC_SETTDATE() {
		return C_SETTDATE;
	}

	public void setC_SETTDATE(String c_SETTDATE) {
		C_SETTDATE = c_SETTDATE;
	}

	public String getC_FUNDTYPE() {
		return C_FUNDTYPE;
	}

	public void setC_FUNDTYPE(String c_FUNDTYPE) {
		C_FUNDTYPE = c_FUNDTYPE;
	}

	public String getC_ORGTRACENO() {
		return C_ORGTRACENO;
	}

	public void setC_ORGTRACENO(String c_ORGTRACENO) {
		C_ORGTRACENO = c_ORGTRACENO;
	}

	public String getC_RESPCODE() {
		return C_RESPCODE;
	}

	public void setC_RESPCODE(String c_RESPCODE) {
		C_RESPCODE = c_RESPCODE;
	}

	public String getC_TFRINACC() {
		return C_TFRINACC;
	}

	public void setC_TFRINACC(String c_TFRINACC) {
		C_TFRINACC = c_TFRINACC;
	}

	public String getC_TFROUTACC() {
		return C_TFROUTACC;
	}

	public void setC_TFROUTACC(String c_TFROUTACC) {
		C_TFROUTACC = c_TFROUTACC;
	}

	public String getC_RETRIVEREFNO() {
		return C_RETRIVEREFNO;
	}

	public void setC_RETRIVEREFNO(String c_RETRIVEREFNO) {
		C_RETRIVEREFNO = c_RETRIVEREFNO;
	}

	public String getC_AUTHORCODE() {
		return C_AUTHORCODE;
	}

	public void setC_AUTHORCODE(String c_AUTHORCODE) {
		C_AUTHORCODE = c_AUTHORCODE;
	}

	public Double getI_TRANSFEE() {
		return I_TRANSFEE;
	}

	public void setI_TRANSFEE(Double i_TRANSFEE) {
		I_TRANSFEE = i_TRANSFEE;
	}

	public String getC_SERVICECODE() {
		return C_SERVICECODE;
	}

	public void setC_SERVICECODE(String c_SERVICECODE) {
		C_SERVICECODE = c_SERVICECODE;
	}

	public Integer getI_SETTFLAG() {
		return I_SETTFLAG;
	}

	public void setI_SETTFLAG(Integer i_SETTFLAG) {
		I_SETTFLAG = i_SETTFLAG;
	}

	public String getC_TXNSTATE() {
		return C_TXNSTATE;
	}

	public void setC_TXNSTATE(String c_TXNSTATE) {
		C_TXNSTATE = c_TXNSTATE;
	}

	public String getC_BATCHNUM() {
		return C_BATCHNUM;
	}

	public void setC_BATCHNUM(String c_BATCHNUM) {
		C_BATCHNUM = c_BATCHNUM;
	}

	public String getC_RECONSWITCH() {
		return C_RECONSWITCH;
	}

	public void setC_RECONSWITCH(String c_RECONSWITCH) {
		C_RECONSWITCH = c_RECONSWITCH;
	}

	public String getC_RECONSERVICE() {
		return C_RECONSERVICE;
	}

	public void setC_RECONSERVICE(String c_RECONSERVICE) {
		C_RECONSERVICE = c_RECONSERVICE;
	}

	public Integer getI_CHECKATM() {
		return I_CHECKATM;
	}

	public void setI_CHECKATM(Integer i_CHECKATM) {
		I_CHECKATM = i_CHECKATM;
	}

	public Integer getI_STATISFLAG() {
		return I_STATISFLAG;
	}

	public void setI_STATISFLAG(Integer i_STATISFLAG) {
		I_STATISFLAG = i_STATISFLAG;
	}

	public String getC_ACQUIRCODE() {
		return C_ACQUIRCODE;
	}

	public void setC_ACQUIRCODE(String c_ACQUIRCODE) {
		C_ACQUIRCODE = c_ACQUIRCODE;
	}

	public String getC_EXPIREDATE() {
		return C_EXPIREDATE;
	}

	public void setC_EXPIREDATE(String c_EXPIREDATE) {
		C_EXPIREDATE = c_EXPIREDATE;
	}

	public String getC_MERCTYPE() {
		return C_MERCTYPE;
	}

	public void setC_MERCTYPE(String c_MERCTYPE) {
		C_MERCTYPE = c_MERCTYPE;
	}

	public String getC_ACQCRYCODE() {
		return C_ACQCRYCODE;
	}

	public void setC_ACQCRYCODE(String c_ACQCRYCODE) {
		C_ACQCRYCODE = c_ACQCRYCODE;
	}

	public String getC_SRVPOINTCODE() {
		return C_SRVPOINTCODE;
	}

	public void setC_SRVPOINTCODE(String c_SRVPOINTCODE) {
		C_SRVPOINTCODE = c_SRVPOINTCODE;
	}

	public String getC_NETID() {
		return C_NETID;
	}

	public void setC_NETID(String c_NETID) {
		C_NETID = c_NETID;
	}

	public String getC_SRVENVCODE() {
		return C_SRVENVCODE;
	}

	public void setC_SRVENVCODE(String c_SRVENVCODE) {
		C_SRVENVCODE = c_SRVENVCODE;
	}

	public String getC_MERCID() {
		return C_MERCID;
	}

	public void setC_MERCID(String c_MERCID) {
		C_MERCID = c_MERCID;
	}

	public String getC_MERCNAME() {
		return C_MERCNAME;
	}

	public void setC_MERCNAME(String c_MERCNAME) {
		C_MERCNAME = c_MERCNAME;
	}

	public String getC_LOCAID() {
		return C_LOCAID;
	}

	public void setC_LOCAID(String c_LOCAID) {
		C_LOCAID = c_LOCAID;
	}

	public String getC_MIDTYPE() {
		return C_MIDTYPE;
	}

	public void setC_MIDTYPE(String c_MIDTYPE) {
		C_MIDTYPE = c_MIDTYPE;
	}

	public String getC_TRACK2() {
		return C_TRACK2;
	}

	public void setC_TRACK2(String c_TRACK2) {
		C_TRACK2 = c_TRACK2;
	}

	public String getC_CARDTYPE() {
		return C_CARDTYPE;
	}

	public void setC_CARDTYPE(String c_CARDTYPE) {
		C_CARDTYPE = c_CARDTYPE;
	}

	public Integer getI_CARDDENOM() {
		return I_CARDDENOM;
	}

	public void setI_CARDDENOM(Integer i_CARDDENOM) {
		I_CARDDENOM = i_CARDDENOM;
	}

	public String getC_CARDLISTID() {
		return C_CARDLISTID;
	}

	public void setC_CARDLISTID(String c_CARDLISTID) {
		C_CARDLISTID = c_CARDLISTID;
	}

	public String getC_USERDATA() {
		return C_USERDATA;
	}

	public void setC_USERDATA(String c_USERDATA) {
		C_USERDATA = c_USERDATA;
	}

	public Integer getI_SOURCHANNEL() {
		return I_SOURCHANNEL;
	}

	public void setI_SOURCHANNEL(Integer i_SOURCHANNEL) {
		I_SOURCHANNEL = i_SOURCHANNEL;
	}

	public Integer getI_DESTCHANNEL() {
		return I_DESTCHANNEL;
	}

	public void setI_DESTCHANNEL(Integer i_DESTCHANNEL) {
		I_DESTCHANNEL = i_DESTCHANNEL;
	}

	public String getC_RESERVAL0() {
		return C_RESERVAL0;
	}

	public void setC_RESERVAL0(String c_RESERVAL0) {
		C_RESERVAL0 = c_RESERVAL0;
	}

	public String getC_RESERVAL1() {
		return C_RESERVAL1;
	}

	public void setC_RESERVAL1(String c_RESERVAL1) {
		C_RESERVAL1 = c_RESERVAL1;
	}

	public String getC_RESERVAL2() {
		return C_RESERVAL2;
	}

	public void setC_RESERVAL2(String c_RESERVAL2) {
		C_RESERVAL2 = c_RESERVAL2;
	}

	public String getC_RESERVAL3() {
		return C_RESERVAL3;
	}

	public void setC_RESERVAL3(String c_RESERVAL3) {
		C_RESERVAL3 = c_RESERVAL3;
	}

	public String getC_RESERVAL4() {
		return C_RESERVAL4;
	}

	public void setC_RESERVAL4(String c_RESERVAL4) {
		C_RESERVAL4 = c_RESERVAL4;
	}

	@Override
	public String toString() {
		return "TTxnLog [I_FEELSN=" + I_FEELSN + ", C_DATE=" + C_DATE + ", C_TIME=" + C_TIME + ", C_TERMCODE="
				+ C_TERMCODE + ", C_TRACENO=" + C_TRACENO + ", C_TRANSDATETIME=" + C_TRANSDATETIME + ", C_TRANSDATE="
				+ C_TRANSDATE + ", C_TRANSTIME=" + C_TRANSTIME + ", C_MSGTYPE=" + C_MSGTYPE + ", C_PROCCODE="
				+ C_PROCCODE + ", I_TXNID=" + I_TXNID + ", I_TXNAMOUNT=" + I_TXNAMOUNT + ", C_PAN=" + C_PAN
				+ ", C_ISSUERCODE=" + C_ISSUERCODE + ", C_SETTDATE=" + C_SETTDATE + ", C_FUNDTYPE=" + C_FUNDTYPE
				+ ", C_ORGTRACENO=" + C_ORGTRACENO + ", C_RESPCODE=" + C_RESPCODE + ", C_TFRINACC=" + C_TFRINACC
				+ ", C_TFROUTACC=" + C_TFROUTACC + ", C_RETRIVEREFNO=" + C_RETRIVEREFNO + ", C_AUTHORCODE="
				+ C_AUTHORCODE + ", I_TRANSFEE=" + I_TRANSFEE + ", C_SERVICECODE=" + C_SERVICECODE + ", I_SETTFLAG="
				+ I_SETTFLAG + ", C_TXNSTATE=" + C_TXNSTATE + ", C_BATCHNUM=" + C_BATCHNUM + ", C_RECONSWITCH="
				+ C_RECONSWITCH + ", C_RECONSERVICE=" + C_RECONSERVICE + ", I_CHECKATM=" + I_CHECKATM
				+ ", I_STATISFLAG=" + I_STATISFLAG + ", C_ACQUIRCODE=" + C_ACQUIRCODE + ", C_EXPIREDATE=" + C_EXPIREDATE
				+ ", C_MERCTYPE=" + C_MERCTYPE + ", C_ACQCRYCODE=" + C_ACQCRYCODE + ", C_SRVPOINTCODE=" + C_SRVPOINTCODE
				+ ", C_NETID=" + C_NETID + ", C_SRVENVCODE=" + C_SRVENVCODE + ", C_MERCID=" + C_MERCID + ", C_MERCNAME="
				+ C_MERCNAME + ", C_LOCAID=" + C_LOCAID + ", C_MIDTYPE=" + C_MIDTYPE + ", C_TRACK2=" + C_TRACK2
				+ ", C_CARDTYPE=" + C_CARDTYPE + ", I_CARDDENOM=" + I_CARDDENOM + ", C_CARDLISTID=" + C_CARDLISTID
				+ ", C_USERDATA=" + C_USERDATA + ", I_SOURCHANNEL=" + I_SOURCHANNEL + ", I_DESTCHANNEL=" + I_DESTCHANNEL
				+ ", C_RESERVAL0=" + C_RESERVAL0 + ", C_RESERVAL1=" + C_RESERVAL1 + ", C_RESERVAL2=" + C_RESERVAL2
				+ ", C_RESERVAL3=" + C_RESERVAL3 + ", C_RESERVAL4=" + C_RESERVAL4 + "]";
	}


}
