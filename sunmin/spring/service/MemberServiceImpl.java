package sunmin.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sunmin.spring.dao.MemberDAO;
import sunmin.spring.vo.Member;

@Service("mbsrv")
public class MemberServiceImpl implements MemberService {
	
	@Autowired
	private MemberDAO mbdao;

	@Override
	public void newMember() {
		Member mb = new Member("abcdef", "123xyz", "유진", "eg@eg.com");
		mbdao.insertMember(mb);
		System.out.println("회원 가입 완료!");		
	}

	@Override
	public void readAllMember() {
		StringBuffer sb = new StringBuffer();
		List<Member> mbs = mbdao.selectAllMember();
		
		for (Member mb : mbs) sb.append(mb);
		System.out.println(sb);
	}

	@Override
	public void readOneMember(int mno) {
		Member mb = mbdao.selectOneMember(mno);
		System.out.println(mb);
		
	}

	@Override
	public void modifyMember() {
		Member mb = new Member("9", null, "987123", "수지", "sj@sj.com", null);
		// mb.setMno("9");
		
		mbdao.updateMember(mb);		
		
	}

	@Override
	public void removeMember() {
		mbdao.deleteMember(10);
		
	}
	
}
