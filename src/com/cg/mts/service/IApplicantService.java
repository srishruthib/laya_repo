package com.cg.mts.service;

import java.util.List;

import com.cg.mts.entities.AdmissionStatus;
import com.cg.mts.entities.Applicant;
import com.cg.mts.exception.ApplicantNotFoundException;


public interface IApplicantService {
	public Applicant addApplicant(Applicant applicant);
	public Applicant updateApplicant(Applicant applicant) throws ApplicantNotFoundException;
	public Applicant deleteApplicant(Applicant applicant) throws ApplicantNotFoundException;
	public Applicant viewApplicant(int applicant) throws ApplicantNotFoundException;
	public List<Applicant> viewAllApplicantsByStatus(AdmissionStatus status);
	
	
}
