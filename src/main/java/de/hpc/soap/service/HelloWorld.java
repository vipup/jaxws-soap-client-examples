
package de.hpc.soap.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10
 * Generated source version: 2.2
 * 
 */
@WebService(name = "HelloWorld", targetNamespace = "http://jaxws.howtodoinjava.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface HelloWorld {


    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns de.hpc.soap.service.Employee
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "updateEmployeeById", targetNamespace = "http://jaxws.howtodoinjava.com/", className = "de.hpc.soap.service.UpdateEmployeeById")
    @ResponseWrapper(localName = "updateEmployeeByIdResponse", targetNamespace = "http://jaxws.howtodoinjava.com/", className = "de.hpc.soap.service.UpdateEmployeeByIdResponse")
    public Employee updateEmployeeById(
        @WebParam(name = "arg0", targetNamespace = "")
        Integer arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        Employee arg1);

    /**
     * 
     * @param arg0
     * @return
     *     returns de.hpc.soap.service.Employee
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "deleteEmployeeById", targetNamespace = "http://jaxws.howtodoinjava.com/", className = "de.hpc.soap.service.DeleteEmployeeById")
    @ResponseWrapper(localName = "deleteEmployeeByIdResponse", targetNamespace = "http://jaxws.howtodoinjava.com/", className = "de.hpc.soap.service.DeleteEmployeeByIdResponse")
    public Employee deleteEmployeeById(
        @WebParam(name = "arg0", targetNamespace = "")
        Integer arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns de.hpc.soap.service.Employee
     * @throws URISyntaxException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "addEmployee", targetNamespace = "http://jaxws.howtodoinjava.com/", className = "de.hpc.soap.service.AddEmployee")
    @ResponseWrapper(localName = "addEmployeeResponse", targetNamespace = "http://jaxws.howtodoinjava.com/", className = "de.hpc.soap.service.AddEmployeeResponse")
    public Employee addEmployee(
        @WebParam(name = "arg0", targetNamespace = "")
        Employee arg0)
        throws URISyntaxException_Exception
    ;

    /**
     * 
     * @return
     *     returns de.hpc.soap.service.Employees
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAllEmployees", targetNamespace = "http://jaxws.howtodoinjava.com/", className = "de.hpc.soap.service.GetAllEmployees")
    @ResponseWrapper(localName = "getAllEmployeesResponse", targetNamespace = "http://jaxws.howtodoinjava.com/", className = "de.hpc.soap.service.GetAllEmployeesResponse")
    public Employees getAllEmployees();

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getMsg", targetNamespace = "http://jaxws.howtodoinjava.com/", className = "de.hpc.soap.service.GetMsg")
    @ResponseWrapper(localName = "getMsgResponse", targetNamespace = "http://jaxws.howtodoinjava.com/", className = "de.hpc.soap.service.GetMsgResponse")
    public String getMsg(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

}