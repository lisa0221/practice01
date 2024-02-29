package service.impl;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import model.DeptDO;
import service.DeptService;

@RunWith(SpringRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class DeptServiceImplTest {

    // Field Injection
    @Autowired
    private DeptService service;

    @Test
    public void getAll() {
        List<DeptDO> list = service.getAll();
        for (DeptDO deptDO : list) {
            System.out.print(deptDO.getDeptno() + ",");
            System.out.print(deptDO.getDname() + ",");
            System.out.print(deptDO.getLoc());
            System.out.println();
        }
    }

//    @Test
//    public void getOneDept() {
//        DeptDO deptDO = service.getOneDept(20);
//        assertEquals(Integer.valueOf(20), deptDO.getDeptno());
//        assertEquals("研發部", deptDO.getDname());
//        assertEquals("臺灣新竹", deptDO.getLoc());
//    }
//
//    @Test
//    public void update() {
//        DeptDO deptDO = new DeptDO();
//        deptDO.setDeptno(10);
//        deptDO.setDname("財務部2");
//        deptDO.setLoc("臺灣台北2");
//        service.update(deptDO);
//        assertTrue(true);
//    }
//
//    @Test
//    public void getEmpsByDeptno() {
//        List<EmpDO> list = service.getEmpsByDeptno(10);
//        for (EmpDO empDO : list) {
//            System.out.print(empDO.getEmpno() + ",");
//            System.out.print(empDO.getEname() + ",");
//            System.out.print(empDO.getJob() + ",");
//            System.out.print(empDO.getHiredate() + ",");
//            System.out.print(empDO.getSal() + ",");
//            System.out.print(empDO.getComm() + ",");
//            System.out.print(empDO.getDeptno());
//            System.out.println();
//        }
//    }
//
//    @Test
//    public void deleteDept() {
//        service.deleteDept(30);
//        assertTrue(true);
//    }
}