package member;

import java.util.Scanner;

import member.model.Member;

public class Member_Ex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean run = true;
		
		System.out.print("입력받을 회원수를 입력하세요 > ");
		int count = sc.nextInt();
		
		Member[] person = new Member[count];
		
		while(run) {
		System.out.println("======= 메뉴를 입력하세요 =======");
		System.out.println("1. 회원가입   2. 회원목록   3. 종료");
		
		System.out.print("원하는 메뉴 번호를 입력해주세요 >>> ");
		
		int choice = sc.nextInt();
		
		switch(choice) {
		case 1:
			System.out.println("회원가입을 진행합니다.");
			for(int i = 0; i < person.length; i++) {
				person[i] = new Member(); //0번째 객체 생성
				
				System.out.print("아이디 입력 : ");
				String uid = sc.next();
				person[i].setUserid(uid);
				
				System.out.print("비밀번호 입력 : ");
				String pwd = sc.next();
				person[i].setPasswd(pwd);
				
				System.out.print("이름 입력 : ");
				String user = sc.next();
				person[i].setUsername(user);
				
				System.out.print("나이 입력 : ");
				int a = sc.nextInt();
				person[i].setAge(a);
				
				System.out.print("급여 입력 : ");
				String sal = sc.next();
				person[i].setSalary(sal);
			}
			break;
		
		case 2:
			System.out.println("회원 목록을 확인합니다.");
			for(Member m : person) {
				System.out.println(m.disp());
			}

			break;
			
			default:
				System.out.println("메뉴 선택을 종료합니다.");
				System.exit(0);
		}
		
	}
		
	}
}
