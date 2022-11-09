package com.cg.mts.repository;

import java.util.List;

import com.cg.mts.entities.AdmissionCommiteeMember;


public interface IAdmissionCommiteeMemberRepository {
public  AdmissionCommiteeMember addCommiteeMember(AdmissionCommiteeMember member);
public AdmissionCommiteeMember updateCommiteeMember(AdmissionCommiteeMember member);
public AdmissionCommiteeMember viewCommiteeMember(int adminId);
public void removeCommiteeMember(int adminId);
public List<AdmissionCommiteeMember> viewAllCommiteeMembers();
}
