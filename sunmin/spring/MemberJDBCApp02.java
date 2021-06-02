package sunmin.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import sunmin.spring.service.MemberService;

public class MemberJDBCApp02 {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("springjdbc02.xml");
		MemberService mbsrv = (MemberService) ctx.getBean("mbsrv02");
		
		// 회원등록 - 아이디, 비번, 이름, 이메일 입력
		// mbsrv.newMember();
		
		// 회원전체조회 - 번호, 아이디, 이름, 가입일
		// mbsrv.readAllMember();
		
		// 회원상세조회 - 번호를 기준으로 특정회원 상세조회
		// mbsrv.readOneMember(6);
		
		// 회원수정 - 번호를 기준으로 비번, 이름, 이메일 수정
		// mbsrv.modifyMember();
		
		// 회원삭제 - 번호를 기준으로 회원정보 삭제
		mbsrv.removeMember();
	}
}
