package com.example.btl_mobile.model.service;

import java.util.List;

import com.example.btl_mobile.model.entity.FamilyTree;

public interface FamilyTreeService {
	FamilyTree createFamilyTree(FamilyTree familyTree);
	FamilyTree updateFamilyTree(int id, FamilyTree familyTree);
	FamilyTree getFamilyTreeById(int id);
	boolean deleteFamilyTree(int id);
	List<FamilyTree> getAllFamilyTree();
}
