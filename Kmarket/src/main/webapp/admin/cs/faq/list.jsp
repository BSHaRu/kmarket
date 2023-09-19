<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../../inc/header.jsp" %>
<main>
<%@ include file="../../inc/aside.jsp" %>
<section id="admin-cs-faq-list">
    <nav>
        <h3>자주묻는질문 목록</h3>
        <p>
            HOME > 고객센터 > <strong>자주묻는질문</strong>
        </p>
    </nav>
    <section>
            <div>
                <select name="cate">
				    <option value="" selected disabled>1차 선택</option>
				    <option value="">전체</option>
				    <option value="">회원</option>
				    <option value="">쿠폰/이벤트</option>
				    <option value="">주문/결제</option>
				    <option value="">배송</option>
				    <option value="">취소/반품/교환</option>
				    <option value="">여행/숙박/항공</option>
				</select>
                <select name="type">
				    <option value="" selected disabled>2차 선택</option>
				    <option value="">가입</option>
				    <option value="">회원정보</option>
				    <option value="">로그인</option>
				    <option value="">탈퇴</option>
				</select>
            </div>
            <table>
                <tr>
                    <th><input type="checkbox" name="all"/></th>
				    <th>번호</th>
				    <th>1차유형</th>
				    <th>2차유형</th>
				    <th>제목</th>
				    <th>조회</th>
				    <th>날짜</th>
				    <th>관리</th>
                </tr>
                <tr>
                	<td><input type="checkbox" name=""/></td>
					<td>32</td>
					<td>회원</td>
					<td>가입</td>
					<td><a href="${path}/admin/cs/faq/view.do">아이디를 여러개 사용할 수 있나요?</a></td>
					<td>159</td>
					<td>23.09.18</td>
					<td>
						<a href="#">[삭제]</a>
						<br>
						<a href="#">[수정]</a>
					</td>
                </tr>
            </table>
            
            <input type="button" value="선택삭제" />
                                  
			<div class="paging">
				<span class="prev"><a href="#" class="prev">이전</a></span>
				<span class="num"><a href="#"class="on">1</a></span>
				<span class="next"><a href="#" class="next">다음</a></span>
			</div>
			
			<input type="button" value="작성하기" />

        </section>     
</section>
</main>
<%@ include file="../../inc/footer.jsp" %>