import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { persona } from '../model/persona.model';

@Injectable({
  providedIn: 'root'
})

export class PersonaService {
  URL = 'https://deployargprog-nahuel.herokuapp.com/personas/';

  constructor(private httpClient: HttpClient) { }

  public getPersona(): Observable<persona>{
    return this.httpClient.get<persona>(this.URL+ 'traer/perfil');
  }


}
