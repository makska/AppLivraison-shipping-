import { Injectable } from '@angular/core';
import { HttpClient, HttpRequest, HttpEvent } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class DepotService {
  private baseUrl = 'http://localhost:8080/api/depots';
  host: string = 'http://localhost:8080';

  list= [];
  
  constructor(private http: HttpClient) { }
  getData(id: number): Observable<Object> {
    return this.http.get(`${this.baseUrl}/${id}`);
  }

  
  getAll(): Observable<any> {
  
    return this.http.get(`${this.baseUrl}`);
  }
  getlistDepot(numero : number): Observable<any> {
  
    return this.http.get(`${this.baseUrl}/3/${numero}`);
  }
}
