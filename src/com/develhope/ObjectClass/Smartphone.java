package com.develhope.ObjectClass;

import java.util.Objects;

public class Smartphone implements Cloneable{
	
	private String brandName;
	private String modelName;
	private int batterymAh;
	private SmartphonePrice producerPrice ;
	private SmartphonePrice retailPrice;
	
	public Smartphone(String brandName, String modelName, int batterymAh, SmartphonePrice producerPrice,
			SmartphonePrice retailPrice) {
		super();
		this.brandName = brandName;
		this.modelName = modelName;
		this.batterymAh = batterymAh;
		this.producerPrice = producerPrice;
		this.retailPrice = retailPrice;
	}

	@Override
	public String toString() {
		return "Smartphone [brandName=" + brandName + ", modelName=" + modelName + ", batterymAh=" + batterymAh
				+ ", producerPrice=" + producerPrice + ", retailPrice=" + retailPrice + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(batterymAh, brandName, modelName, producerPrice, retailPrice);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Smartphone other = (Smartphone) obj;
		return batterymAh == other.batterymAh && Objects.equals(brandName, other.brandName)
				&& Objects.equals(modelName, other.modelName) && Objects.equals(producerPrice, other.producerPrice)
				&& Objects.equals(retailPrice, other.retailPrice);
	}

	@Override
	public Smartphone clone() throws CloneNotSupportedException {
	 Smartphone clonedSmartphone = (Smartphone)super.clone();
	 clonedSmartphone.producerPrice = (SmartphonePrice)producerPrice.clone();
	 clonedSmartphone.retailPrice = (SmartphonePrice)producerPrice.clone();
	 return clonedSmartphone;
	}
}
