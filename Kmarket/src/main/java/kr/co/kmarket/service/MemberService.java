package kr.co.kmarket.service;

import java.util.List;

import kr.co.kmarket.dao.MemberDAO;
import kr.co.kmarket.dto.MemberDTO;

public enum MemberService {
	INSTANCE;

	private MemberDAO dao = MemberDAO.getInstance();

	public void insertMember(MemberDTO dto) {
		dao.insertMember(dto);
	}

	public MemberDTO selectMember(String uid) {
		return dao.selectMember(uid);
	}

	public List<MemberDTO> selectMembers() {
		return dao.selectMembers();
	}

	public void updateMember(MemberDTO dto) {
		dao.updateMember(dto);
	}

	public void deleteMember(String uid) {
		dao.deleteMember(uid);
	}
}