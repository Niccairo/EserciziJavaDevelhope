package com.develhope.ObjectClass;

import java.util.Objects;

public class SmartphonePrice implements Cloneable{
	private String priceType;
	double priceInEuros;
	
	@Override
	public String toString() {
		return "SmartphonePrice [priceType=" + priceType + ", priceInEuros=" + priceInEuros + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(priceInEuros, priceType);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SmartphonePrice other = (SmartphonePrice) obj;
		return Double.doubleToLongBits(priceInEuros) == Double.doubleToLongBits(other.priceInEuros)
				&& Objects.equals(priceType, other.priceType);
	}
	@Override
	public SmartphonePrice clone() throws CloneNotSupportedException {
		SmartphonePrice clonedSmartphonePrice= (SmartphonePrice)super.clone();
		return clonedSmartphonePrice;
	}
}
