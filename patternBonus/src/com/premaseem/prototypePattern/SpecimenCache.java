package com.premaseem.prototypePattern;

import java.util.EnumMap;
import java.util.Map;

import com.premaseem.prototypePattern.Cell.CellProtoTypes;

public class SpecimenCache {

	static SpecimenCache specimenCache=null;
	private Map<CellProtoTypes,Cell> prototypeSamples = new EnumMap<CellProtoTypes,Cell>(CellProtoTypes.class);
	
	static public SpecimenCache getInstance(){
		if(specimenCache==null){
			specimenCache = new SpecimenCache();
		}
		return specimenCache;
	}
	
	public SpecimenCache(){
		loadSpecimenCache();
	}
	
	void loadSpecimenCache(){
		prototypeSamples.put(CellProtoTypes.SINGLE_CELL_ORG, new SingleCell());
		prototypeSamples.put(CellProtoTypes.BACTERIA, new Bacteria());
		prototypeSamples.put(CellProtoTypes.AMOEBA, new Amoeba());
	}
	
	public Cell getCellProtoType(CellProtoTypes cell){
		return prototypeSamples.get(cell);
	}
	
}
