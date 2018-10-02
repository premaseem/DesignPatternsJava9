package com.premaseem.prototypePattern;

import java.util.Scanner;

import com.premaseem.prototypePattern.Cell.CellProtoTypes;

public class ClientFile {

	public static void main(String[] args) {

		System.out.println("Welcome to Prototype design patters Lab ");
		Scanner scan = new Scanner(System.in);
		SpecimenCache specimenLab = SpecimenCache.getInstance();
		Cell subjectCell = null;

		int repeatRunFlag = 1;
		while (repeatRunFlag == 1) {
			// TVInterface tv;
			System.out.println("Which organizm you would like to culture / grow / multiply ? ");
			System.out.println("press 1 for Single Cell Org");
			System.out.println("press 2 for Amoeba ");
			System.out.println("press 3 for Bacteria ");
			int type = scan.nextInt();
			if (type == 1) {
				subjectCell = specimenLab.getCellProtoType(CellProtoTypes.SINGLE_CELL_ORG);
			} else if (type == 2) {
				subjectCell = specimenLab.getCellProtoType(CellProtoTypes.AMOEBA);
			} else {
				subjectCell = specimenLab.getCellProtoType(CellProtoTypes.BACTERIA);
			}

			System.out.println("Culture process has started  ");
			System.out.println(" Cells are spliting/cloning and growing  ");

			for (int i = 0; i < 10; i++) {
				System.out.println(subjectCell.split());
				System.out.println(" ...........  ........  >>>> .... ");
			}
			System.out.println("=============================");

			System.out.println("Press 1 to Repeat .... ");
			repeatRunFlag = scan.nextInt();

		}

		System.out.println("\n $$$$$$$$$$$$$$$$$$$$  Thanks by Prem Aseem $$$$$$$$$$$$$$$$$$$$$$ \n ");
		System.out.println("\n $$$$$$$$$$$$$$$$$$$$$  www.premaseem.com  $$$$$$$$$$$$$$$$$$$$$$ \n ");

	}
}
