package com.example.bootstrap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
// jpa에 검사를 황성화
@EnableJpaAuditing
public class BootstrapApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootstrapApplication.class, args);
    }

}
// 이름지정방법
// 스네이크법 : 첫글자를 대문자로, 일반적으로 클래스명 지정시
//            sum{}
// 소문자 작성 : 함수명()과 변수명
// 카멜법 : 두 단어를 사용할 때 두번째 단어의 첫글자를 대문자로(함수와 변수)
//          kokSum()
// 더블카멜 : 세단어를 사용할 때 두번째, 세번째 단어의 첫글자를 대문자로(함수와 변수)
//            summerKorSum()
// 헝가리식 : 단어와 단어사이에 _ 연결, 모든 단어 소문자
//            kok_sum ==> c언어

// 이름은 동사는 사용자제, 가능하면 명사 사용

// 남의 클래스 사용시 : [패키지명].클래스명.함수()
//                   [패키지명].클래스명.변수
// 자바는 변수명 한글 사용이 가능

// 1. Config : 스프링부트의 환경설정 프로그램
//              보안, 로그인, 권한부여, MVC모델 설정, Application 설정, 파일업로드
// 2. Controller : 맵핑작업
//              브라우저와 Service에서 요청 및 응답에 대한 이동
// 3. Service : 작업처리
//              삽입, 수정, 삭제, 조회별 처리
// 4. Repository : 데이터베이스 처리
//              JPA(SQL)를 통해서 데이터베이스에 데이터를 저장, 수정, 삭제, 조회
// 5. Entity : 테이블의 필드 정보와 JPA에 전달할 값을 관리
//             테이블당 1개의 Entity 존재
// 6. DTO : HTML과 Service간에 데이터를 전달
//          테이블당 여러개의 DTO로 구성(작업별)
// 7. Util : 스프링부트외 기능(날짜, 페이지처리, 웹하드, 파일업로드, AI연동)
//                          Entity -------
// 데이터베이스 <-> Repository <-> Service
//                                      <->Controller
//                                 HTML

// @ : 어노테이션
// 사용자가 작성할 프로그램을 간소화(자동작성)