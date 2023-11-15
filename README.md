![sns](https://github.com/wanted-quantum-jump/FeedMoa/assets/46921979/5cb6e1f9-5708-423d-afde-78e11eb4243f)

# FeedMoa - 소셜 미디어 통합 Feed 서비스
<br>

<div align="center">
<img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white"/>
<img src="https://img.shields.io/badge/Spring-6DB33F?style=for-the-badge&logo=spring&logoColor=white"/>
<img src="https://img.shields.io/badge/Spring_Security-6DB33F?style=for-the-badge&logo=Spring-Security&logoColor=white"/>
<img src="https://img.shields.io/badge/github-181717?style=for-the-badge&logo=github&logoColor=white">
<img src="https://img.shields.io/badge/PostMan-FF6C37?style=for-the-badge&logo=postman&logoColor=white">
</div>

<br>

FeedMoa는 유저 계정의 해시태그(`#dani`)를 기반으로 인스타그램, 스레드, 페이스북, 트위터 등 복수의 SNS에 게시된 게시물 중 유저의 해시태그가 포함된 게시물들을 하나의 서비스에서 확인할 수 있는 통합 Feed 어플리케이션입니다. 이를 통해 본 서비스의 고객은 하나의 채널로 유저(`#dani`), 또는 브랜드(`#danishop`) 의 SNS 노출 게시물 및 통계를 확인할 수 있습니다.
<br>
<br>
<div align="center">

## ☄️ Team Q members

<table>
    <tr>
        <th>김서윤</th>
        <th>김은비</th>
        <th>방성원</th>
        <th>장혜리</th>
        <th>정지원</th>
    </tr>
    <tr>
        <td><a href="https://github.com/seoyoon047">@seoyoon047</a></td>
        <td><a href="https://github.com/eunb1">@eunb1</a></td>
        <td><a href="https://github.com/O0oO0Oo">@O0oO0Oo</a></td>
        <td><a href="https://github.com/hyerijang">@hyerijang</a></td>
        <td><a href="https://github.com/cjw9506">@cjw9506</a></td>
    </tr>
</table>
</div>

---
## 0. 목차
- [1.개발 기간](#1-개발-기간)
- [2.프로젝트 요구사항](#2-프로젝트-요구사항)
    - [A. 사용자](#a-사용자)
    - [B. 게시물](#b-게시물)
    - [C. 통계](#c-통계)
- [3.담당 역할](#3-담당-역할)
- [4.프로젝트 스케줄링](#4-프로젝트-스케줄링)
- [5.협업 규칙](#5-협업-규칙)
- [6.API Document](#6-api-document)
---

## 1. 개발 기간

`2023.10.25` ~ `2023.10.30` - `#5_days`

## 2. 프로젝트 요구사항

[📑소셜 미디어 통합 Feed 서비스 요구사항](https://hyerijang.notion.site/Feed-39175ced7b474263bcadac83807e7a99?pvs=4)

### A. 사용자

- 사용자 회원가입(API)
- 사용자 가입승인(API)
- 사용자 로그인(API)

### B. 게시물

- 게시물 목록(API)
- 게시물 상세(API)
- 게시물 좋아요(API)
- 게시물 공유(API)

### C. 통계
- 통계(API)

## 3. 담당 역할

<table>
    <tr>
        <td>김서윤</td>
        <td>게시글 상세 API, 통계 API 구현</td>
    </tr>
    <tr>
        <td>김은비</td>
        <td>게시글 엔티티, 전역 예외, 게시글 목록 API 구현</td>
    </tr>
    <tr>
        <td>방성원</td>
        <td>사용자 로그인 API, JWT 인증 및 인가 구현 </td>
    </tr>
    <tr>
        <td>장혜리</td>
        <td>게시글 좋아요 API, 게시글 공유 API 구현, 문서 작성</td>
    </tr>
    <tr>
        <td>정지원</td>
        <td>사용자 회원가입 API, 사용자 가입승인 API 구현 </td>
    </tr>
</table>

## 4. 프로젝트 스케줄링

[Github Project](https://github.com/orgs/wanted-quantum-jump/projects/2)에 기능별 [issue](https://github.com/wanted-quantum-jump/FeedMoa/issues)를 등록하여 프로젝트 개발 일정을 관리하였습니다.

## 5. 협업 규칙

[Team Q Notion - 팀 규칙 및 컨벤션](https://www.notion.so/f22c8da6c7e4430a90dffc34b7b7d80c)을 참조해 주세요.

## 6. API Document
최신 문서는 [FeedMoa API Document](https://documenter.getpostman.com/view/15143510/2s9YRGy9Cg)를 참조해 주세요.


![사용자 회원 가입](https://github.com/wanted-quantum-jump/FeedMoa/assets/46921979/cef6ddf6-3879-4bab-900f-75a1adfb0291)

![사용자 가입 승인](https://github.com/wanted-quantum-jump/FeedMoa/assets/46921979/8f05a0cc-0564-4084-8939-4822baa9709d)

![사용자 로그인 - Refresh Token 요청](https://github.com/wanted-quantum-jump/FeedMoa/assets/46921979/a0c11f98-3ab4-4cad-af7e-45e578f1b2a3)

![사용자 Access Token 요청](https://github.com/wanted-quantum-jump/FeedMoa/assets/46921979/defb2fba-f95f-44a2-92a7-b1c023e1cfda)

![게시글 목록](https://github.com/wanted-quantum-jump/FeedMoa/assets/46921979/436b767f-1fe3-4154-9d4d-d5ef46c10616)

![게시글 좋아요](https://github.com/wanted-quantum-jump/FeedMoa/assets/46921979/c55eb35d-6e8b-498a-86ec-91c49184214c)

![게시글 공유](https://github.com/wanted-quantum-jump/FeedMoa/assets/46921979/78f86c5e-d351-48e2-a878-598e53bdddd1)

![게시글 상세](https://github.com/wanted-quantum-jump/FeedMoa/assets/46921979/f3fa2b21-c867-4509-a519-a2c3d246daea)
