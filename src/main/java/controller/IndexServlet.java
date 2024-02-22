package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.DeptDO;
import model.EmpDO;
import service.DeptService;
import service.EmpService;
import service.impl.DeptServiceImpl;
import service.impl.EmpServiceImpl;

@WebServlet("")
public class IndexServlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        DeptService deptService = new DeptServiceImpl();
        List<DeptDO> deptDOs = deptService.getAll();
        req.setAttribute("deptDOs", deptDOs);

        EmpService empService = new EmpServiceImpl();
        List<EmpDO> empDOs = empService.getAll();
        req.setAttribute("empDOs", empDOs);

        RequestDispatcher successView = req.getRequestDispatcher("index.jsp");
        successView.forward(req, res);
    }

}
