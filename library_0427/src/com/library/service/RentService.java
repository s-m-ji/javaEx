package com.library.service;

import com.library.dao.RentDao;

public class RentService {
	RentDao rDao = new RentDao();
	
	public String getRentYN(int no) {
		String rentYN = rDao.getRentYN(no);
		return rentYN;
	}
	
	/**
	 * 도서 대여
	 * 대여 테이블에 데이터를 입력한다.
	 * @param no : 도서번호
	 * @param id : 아이디
	 */
	public void rentB(int no, String id) {
		// 대여 가능 여부 체크
		String rentYN = rDao.getRentYN(no);
		if("Y".equals(rentYN)) {
			System.out.println("이미 대여중인 도서인걸?");
			return;
		}
		int res = rDao.insert(id, no);
		if(res>0) {
			System.out.println(res+"건 대여되었습니다.");
		} else {
			System.out.println("도서 대여 실패");
		}
	}
	
	/**
	 * 도서 반납
	 * 반납일과 대여 여부를 업데이트한다.
	 * @param no : 도서 번호
	 * 
	 */
	public void returnB(int no) {
		// 반납 가능 여부 체크
		String rentYN = rDao.getRentYN(no);
		if("N".equals(rentYN)) {
			System.out.println("이미 반납된 도서인걸?");
			return;
		}
		int res = rDao.update(no);
		if(res>0) {
			System.out.println(res+"건 반납되었습니다.");
		} else {
			System.out.println("도서 반납 실패");
		}
	}




}
