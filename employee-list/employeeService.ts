import {Injectable} from '@angular/core';
import {Http, Response, Headers, RequestOptions, RequestMethod} from '@angular/http';
//import {Observable} from 'rxjs/Observable';
import {Employee, Address} from './Employee'
import 'rxjs/Rx'
import { Observable } from 'rxjs';

@Injectable()
export class EmployeeService{
  //include appropriate API url
//public employeeListUrl = 'http://localhost:52467/Employee/EmployeeList';
  private _employeeListUrl = 'app/EmployeeList/Employee.json';
  public get employeeListUrl() {
    return this._employeeListUrl;
  }
  public set employeeListUrl(value) {
    this._employeeListUrl = value;
  }
//public employeeDetailsUrl = 'http://localhost:52467/Employee/EmployeeDetails';
  private _employeeDetailsUrl = 'app/EmployeeList/address.json';
  public get employeeDetailsUrl() {
    return this._employeeDetailsUrl;
  }
  public set employeeDetailsUrl(value) {
    this._employeeDetailsUrl = value;
  }
public employeeAddUrl = 'http://localhost:52467/Employee/EmployeeAdd'
constructor(public _http: Http){

}

getEmployees():Observable<Employee[]>{
return this._http.get(this.employeeListUrl)
.map((response:Response) => <Employee[]> response.json());
}

findAddressById(id: any):Observable<Address>{
//return this._http.get(this.employeeDetailsUrl + '/'+ id)
//.map((response:Response) => <Address> response.json());
return this._http.get(this.employeeDetailsUrl)
.map((response:Response) => <Address> response.json());

}

AddEmployee(employee: Employee){
	let headers = new Headers({ 'Content-Type': 'application/json' });
    let options = new RequestOptions({
	 method: RequestMethod.Post,
	 headers: headers });
    let body = employee;
    return this._http.post(this.employeeAddUrl, body, headers).map((res: Response) => res.json());
}

DeleteEmployee(id: string){
 return this._http.delete('http://localhost:52467/Employee/Delete/' + id);
}

ShowEmployee(id: string):Observable<Employee>{
return this._http.get('http://localhost:52467/Employee/GetEmployee/'+ id)
.map((response:Response) => <Employee> response.json());
}

SaveEmployee(employee: any){
	let headers = new Headers({ 'Content-Type': 'application/json' });
    let options = new RequestOptions({
	 method: RequestMethod.Post,
	 headers: headers });
    let body = employee;
    return this._http.post('http://localhost:52467/Employee/Edit', body, headers).map((res: Response) => res.json());
}

}