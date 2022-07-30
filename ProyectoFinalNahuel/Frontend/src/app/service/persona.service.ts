import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { persona } from '../model/persona.model';

@Injectable({
  providedIn: 'root'
})

export class PersonaService {
  URL = 'http://localhost:8080/personas';
/* http://localhost:8080 */

  constructor(private httpClient: HttpClient) { }

  public getPersona(): Observable<persona>{
    return this.httpClient.get<persona>(this.URL+ '/traer/perfil');
  }

  public editPersona(perso: persona):Observable<any>{
    return this.httpClient.put<any>(`${this.URL}/edit`, perso);
    // return this.httpClient.put<any>(this.URL+ `edit/${id}`, perso);
  }
}
