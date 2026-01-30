package com.busanit501.jsp_server_project1._0130_1_calc;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

// 컨트롤러 역할로, 클씨가, 찾아요 뭐를? /calc/input,
// 그러면, 서씨가, 준비를 해요, 여기로 가시죠~~, -> InputController 이클래스로 안내를 함.
@WebServlet(name="inputController", urlPatterns = "/calc/input")
public class InputController extends HttpServlet {
    // 안내를 받아서, 무엇을 제공해주냐? 화면을 제공해줍니다.
    // 왜? 클씨가 화면을 요구해서, get으로 요청.
    @Override // doGet, 화면을 제공함.
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        // 순서1, 요청이 잘 왔는지 확인.
        System.out.println("InputController의 doGet  메서드, 요청이 잘 도착했습니다. ");
        // 순서2, 실제로, 어느 화면으로 갈지를 정해주는 기능.
        RequestDispatcher dispatcher =
                req.getRequestDispatcher("/WEB-INF/_0130_1_calc/input.jsp");
        // 순서3, dispatcher(비유, 공항의 관제탑, 비행기 착륙시 어디 활주로로 갈까요?
        // 네, 8번 활주로 오세요 응답)
        // dispatcher -> 여기 화면으로 이동하세요.
        dispatcher.forward(req,resp);

        // 확인.
        // 웹브라우저에서,
//        http://localhost:8080/calc/input
        // 서버, 자바 코드 작업 후, 반드시 모두 배포 해주세요.,
        // 나중에, 자동 리로드가 됩니다. 일단, 지금은 수동으로.,

    }

}
