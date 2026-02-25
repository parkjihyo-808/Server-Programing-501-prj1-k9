package com.busanit501.jsp_server_project1.springex_new_0219_keep.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Positive;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PageRequestDTO {
    // 준비물
    // 1)페이지 번호 ,
    @Builder.Default // 만약, page 를 지정하지 않으면, 기본값으로 1로 설정
    @Min(value = 1) // 최솟값 1로 고정, 만약, -10 안됨
    @Positive // 양수만 됨.
    private int page = 1;

    // 2) 페이지 당 보여줄 갯수 ,
    @Builder.Default // 만약, size 를 지정하지 않으면, 기본값으로 10로 설정
    @Min(value = 10) // 최솟값 10로 고정, 만약, -10 안됨
    @Max(value = 100) // 최댓값 100로 고정, 장난 치고 싶어요? 어떻게, 100000 개 하면 출력 해줄까? 궁금하네, 미안, 안됨. 100개 최대야.
    @Positive
    private int size = 10;

    // 보고 있는 페이지의 정보를, URL 주소 뒤에 , ?page=3&size=10, 내용을 첨부하고 싶다.
    private String link;

    public String getLink() {
        if(link == null) {
            StringBuilder builder = new StringBuilder();
            builder.append("page=" + this.page);
            builder.append("&size=" + this.size);
            link = builder.toString();
        }
        return link;
    }

    // 3) 몇개를 건너띄기 할건지.
    public int getSkip() {
        return (page -1) * 10;
    }
}
