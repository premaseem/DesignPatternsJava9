package com.premaseem.prototypePattern;

public abstract class Cell implements Cloneable {

	public Cell(){
		System.out.println("Constructor of Cell is called ... ");
	}
	
	String cellType;
	public enum CellProtoTypes{
		AMOEBA,BACTERIA,SINGLE_CELL_ORG
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return cellType + "with id " + hashCode();
	}

	public Object split() {
		Object cloneCell = null;
		try {
			cloneCell = this.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return cloneCell;

	}
}

 class Amoeba extends Cell{
	 public Amoeba(){
		 cellType=" Amoeba ";
		 System.out.println("Constructor of Amoeba is called ... ");
	 }
 }

 class Bacteria extends Cell{
	 public Bacteria(){
		 cellType=" Bacteria ";
		 System.out.println("Constructor of Bacteria is called ... ");
	 }
 }
 
 class SingleCell extends Cell{
	 public SingleCell(){
		 cellType=" SingleCell ";
		 System.out.println("Constructor of SingleCell is called ... ");
	 }
 }
