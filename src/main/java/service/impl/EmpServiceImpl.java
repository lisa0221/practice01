package service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import annotation.Annotation.ModifyEmpData;
import dao.EmpDAO;
import model.EmpDO;
import service.EmpService;

@Service
public class EmpServiceImpl implements EmpService {

    private EmpDAO dao;

    @Autowired
    public void setEmpDAO(EmpDAO dao) {
        this.dao = dao;
    }

    @Override
    @ModifyEmpData
    public EmpDO addEmp(EmpDO empDO) {
        dao.insert(empDO);

        return empDO;
    }

    @Override
    @ModifyEmpData
    public EmpDO updateEmp(EmpDO empDO) {
//
//        EmpDO empDO = new EmpDO();
//
//        empDO.setEmpno(empno);
//        empDO.setEname(ename);
//        empDO.setJob(job);
//        empDO.setHiredate(hiredate);
//        empDO.setSal(sal);
//        empDO.setComm(comm);
//        empDO.setDeptno(deptno);
        dao.update(empDO);

        return dao.findByPrimaryKey(empDO.getEmpno());
    }

    @Override
    @ModifyEmpData
    public void deleteEmp(Integer empno) {
        dao.delete(empno);
    }

    @Override
    public EmpDO getOneEmp(Integer empno) {
        return dao.findByPrimaryKey(empno);
    }

    @Override
    public List<EmpDO> getAll() {
        return dao.getAll();
    }

}
