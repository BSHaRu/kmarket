package kr.co.kmarket.dto;

import java.util.HashMap;
import java.util.Map;

public class ProductOrderDTO {
	private int ordNo;
	private String ordUid;
	private int ordCount;
	private int ordPrice;
	private int ordDiscount;
	private int ordDelivery;
	private int savePoint;
	private int usedPoint;
	private int ordTotPrice;
	private String recipName;
	private String recipHp;
	private String recipZip;
	private String recipAddr1;
	private String recipAddr2;
	private int ordPayment;
	private int ordComplete;
	private String ordDate;
	private String ordUser;

	@Override
	public String toString() {
		return "Km_product_order [ordNo=" + ordNo + ", ordUid=" + ordUid + ", ordCount=" + ordCount + ", ordPrice="
				+ ordPrice + ", ordDiscount=" + ordDiscount + ", ordDelivery=" + ordDelivery + ", savePoint="
				+ savePoint + ", usedPoint=" + usedPoint + ", ordTotPrice=" + ordTotPrice + ", recipName=" + recipName
				+ ", recipHp=" + recipHp + ", recipZip=" + recipZip + ", recipAddr1=" + recipAddr1 + ", recipAddr2="
				+ recipAddr2 + ", ordPayment=" + ordPayment + ", ordComplete=" + ordComplete + ", ordDate=" + ordDate
				+ "]";
	}

	public int getOrdNo() {
		return ordNo;
	}

	public void setOrdNo(int ordNo) {
		this.ordNo = ordNo;
	}

	public String getOrdUid() {
		return ordUid;
	}

	public void setOrdUid(String ordUid) {
		this.ordUid = ordUid;
	}

	public int getOrdCount() {
		return ordCount;
	}

	public void setOrdCount(int ordCount) {
		this.ordCount = ordCount;
	}

	public void setOrdCount(String ordCount) {
		this.ordCount = Integer.parseInt(ordCount);
	}

	public int getOrdPrice() {
		return ordPrice;
	}

	public void setOrdPrice(int ordPrice) {
		this.ordPrice = ordPrice;
	}

	public void setOrdPrice(String ordPrice) {
		this.ordPrice = Integer.parseInt(ordPrice);
	}

	public int getOrdDiscount() {
		return ordDiscount;
	}

	public void setOrdDiscount(int ordDiscount) {
		this.ordDiscount = ordDiscount;
	}

	public void setOrdDiscount(String ordDiscount) {
		this.ordDiscount = Integer.parseInt(ordDiscount);
	}

	public int getOrdDelivery() {
		return ordDelivery;
	}

	public void setOrdDelivery(int ordDelivery) {
		this.ordDelivery = ordDelivery;
	}

	public void setOrdDelivery(String ordDelivery) {
		this.ordDelivery = Integer.parseInt(ordDelivery);
	}

	public int getSavePoint() {
		return savePoint;
	}

	public void setSavePoint(int savePoint) {
		this.savePoint = savePoint;
	}

	public void setSavePoint(String savePoint) {
		this.savePoint = Integer.parseInt(savePoint);
	}

	public int getUsedPoint() {
		return usedPoint;
	}

	public void setUsedPoint(int usedPoint) {
		this.usedPoint = usedPoint;
	}

	public void setUsedPoint(String usedPoint) {
		this.usedPoint = Integer.parseInt(usedPoint);
	}

	public int getOrdTotPrice() {
		return ordTotPrice;
	}

	public void setOrdTotPrice(int ordTotPrice) {
		this.ordTotPrice = ordTotPrice;
	}

	public void setOrdTotPrice(String ordTotPrice) {
		this.ordTotPrice = Integer.parseInt(ordTotPrice);
	}

	public String getRecipName() {
		return recipName;
	}

	public void setRecipName(String recipName) {
		this.recipName = recipName;
	}

	public String getRecipHp() {
		return recipHp;
	}

	public void setRecipHp(String recipHp) {
		this.recipHp = recipHp;
	}

	public String getRecipZip() {
		return recipZip;
	}

	public void setRecipZip(String recipZip) {
		this.recipZip = recipZip;
	}

	public String getRecipAddr1() {
		return recipAddr1;
	}

	public void setRecipAddr1(String recipAddr1) {
		this.recipAddr1 = recipAddr1;
	}

	public String getRecipAddr2() {
		return recipAddr2;
	}

	public void setRecipAddr2(String recipAddr2) {
		this.recipAddr2 = recipAddr2;
	}

	public int getOrdPayment() {
		return ordPayment;
	}

	public String getOrdPaymentName() {
		Map<Integer, String> payment = new HashMap<Integer, String>() {
			{
				put(1, "신용카드");
				put(2, "체크카드");
				put(3, "실시간 계좌이체");
				put(4, "무통장입금");
				put(5, "휴대폰결제");
				put(6, "카카오페이");
			}
		};
		return payment.get(ordPayment);
	}

	public void setOrdPayment(int ordPayment) {
		this.ordPayment = ordPayment;
	}

	public void setOrdPayment(String ordPayment) {
		this.ordPayment = Integer.parseInt(ordPayment);
	}

	public int getOrdComplete() {
		return ordComplete;
	}

	public void setOrdComplete(int ordComplete) {
		this.ordComplete = ordComplete;
	}

	public String getOrdDate() {
		return ordDate;
	}

	public void setOrdDate(String ordDate) {
		this.ordDate = ordDate;
	}

	public String getOrdUser() {
		return ordUser;
	}

	public void setOrdUser(String ordUser) {
		this.ordUser = ordUser;
	}
}