package controller;

import javax.servlet.http.HttpServlet;
import java.text.SimpleDateFormat;
import java.util.*;
import java.io.*;
import javax.servlet.*;
import  javax.servlet.http.*;


/**
 * @author xiaogaoqing
 * @ClassName PayWaterController
 * @Description 类描述
 * @date 2018/1/31
 */
public class PayWaterController extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       this.doPost(request,response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("UTF-8");
        PrintWriter out=response.getWriter();
        String  id=request.getParameter("id");
        String  payWaterNumber=request.getParameter("payWaterNumber");
        String  userAccountName=request.getParameter("userAccountName");
        String  transactionTime=request.getParameter("transactionTime");
//        Date   transactionTime1=new SimpleDateFormat("transactionTime");
//         String  transactionAmount=request.getParameter("transactionAmount");
//        PayWaterService   payWaterService=new PayWaterServiceImpl;
//        PayWater payWater=payWaterService.findPayWaterById(request.getParameter("id"));
        request.setAttribute("id",id);

    }
}