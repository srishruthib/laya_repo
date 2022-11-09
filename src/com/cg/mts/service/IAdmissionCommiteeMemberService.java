package com.cg.mts.service;

import java.util.List;

import com.cg.mts.entities.Admission;
import com.cg.mts.entities.AdmissionCommiteeMember;
import com.cg.mts.entities.Applicant;


public interface IAdmissionCommiteeMemberService {
public  AdmissionCommiteeMember addCommiteeMember(AdmissionCommiteeMember member);
public AdmissionCommiteeMember updateCommiteeMember(AdmissionCommiteeMember member);
public AdmissionCommiteeMember viewCommiteeMember(int adminId);
public void removeCommiteeMember(int adminId);
public List<AdmissionCommiteeMember> viewAllCommiteeMembers();
public void provideAdmissionResult(Applicant applicant, Admission admission);
}
