package com.example.sayehwebservices.domain;

import lombok.*;

import javax.persistence.*;
import java.sql.Date;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "TB_TRANSACTIONS")// for other databases' schema must be created SAYEH
public class Transaction {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id; // id for database
    @Basic
    @Column(name = "F01_NCODE")
    private String f01Ncode; // شماره کد ملی یا کد اتباع خارجی
    @Basic
    @Column(name = "F02_PAN")
    private String f02Pan; //  شماره کارت
    @Basic
    @Column(name = "F03_TRACE_NO6")
    private String f03TraceNo; //  شماره پیگیری تراکنش
    @Basic
    @Column(name = "F04_REF_NO12")
    private String f04TraceRefNo12; //  شماره ارجاع تراکنش
    @Basic
    @Column(name = "F05_TX_LOCALDATE_CCyyMMdd")
    private String f05Localdate; // تاریخ محلی تراکنش CCyyMMdd
    @Basic
    @Column(name = "F06_TX_LOCALTIME_HHMMSS")
    private String f06Localtime; //HHmmSS زمان محلی تراکنش
    @Basic
    @Column(name = "F07_SEND_LOCALDATETIME_CCYYMMDD")
    private String f07LocalDateTime; //  تاریخ و زمان ارسال داده ها به سامانه یارانه میلادی
    @Basic
    @Column(name = "F08_TRAN_AMOUNT")
    private Long f08TranAmount; // مبلغ سهم یارانه
    @Basic
    @Column(name = "F09_AMOUNT_FLAG")
    private String f09AmountFlag;// علامت مبلغ
    @Basic
    @Column(name = "F10_full_Tx_amount")
    private String f10FullTxAmount;// میزان کل تراکنش
    @Basic
    @Column(name = "F11_PSP_ID")
    private String f11PspId; //  کد شناسایی موسسه ارائه دهنده خدمات پرداخت
    @Basic
    @Column(name = "F12_TERMINAL_TYPE")
    private String f12TerminalType; // کد نوع پایانه تراکنش
    @Basic
    @Column(name = "F13_TERMINAL_ID")
    private String f13TerminalId; //  شماره شناسایی پایانه
    @Basic
    @Column(name = "F14_MERCHANT_ID")
    private String f14MerchantId; //  شماره شناسایی پذیرنده کارت
    @Basic
    @Column(name = "F15_CATEGORYCODE")
    private String f15CategoryCode; // کد کسب و کار پذیرنده فروشگاهی
    @Basic
    @Column(name = "F16_RECORD_CREATION_DATE")
    private Date f16RecordCreationDate; // زمان ذخیره داده
    @Basic
    @Column(name = "F05_TX_LOCALDAT", nullable = true)
    //  Default >> would be TO_DATE("F05_TX_LOCALDATE_CCYYMMDD"||"F06_TX_LOCALTIME_HHMMSS",'yyyymmddhh24miss')
    private LocalDateTime f05TxLocaldat;



    public Transaction(String f01Ncode,
                       String f02Pan,
                       String f03TraceNo,
                       String f04TraceRefNo12,
                       String f05Localdate,
                       String f06Localtime,
                       String f07LocalDateTime,
                       Long f08TranAmount,
                       String f09AmountFlag,
                       String f10FullTxAmount,
                       String f11PspId,
                       String f12TerminalType,
                       String f13TerminalId,
                       String f14MerchantId,
                       String f15CategoryCode,
                       Date f16RecordCreationDate) {
        this.f01Ncode = f01Ncode;
        this.f02Pan = f02Pan;
        this.f03TraceNo = f03TraceNo;
        this.f04TraceRefNo12 = f04TraceRefNo12;
        this.f05Localdate = f05Localdate;
        this.f06Localtime = f06Localtime;
        this.f07LocalDateTime = f07LocalDateTime;
        this.f08TranAmount = f08TranAmount;
        this.f09AmountFlag = f09AmountFlag;
        this.f10FullTxAmount = f10FullTxAmount;
        this.f11PspId = f11PspId;
        this.f12TerminalType = f12TerminalType;
        this.f13TerminalId = f13TerminalId;
        this.f14MerchantId = f14MerchantId;
        this.f15CategoryCode = f15CategoryCode;
        this.f16RecordCreationDate = f16RecordCreationDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transaction that = (Transaction) o;
        return Objects.equals(id, that.id) ;
    }


    @Override
    public int hashCode() {
        return Objects.hash(id, f01Ncode);
    }
}
