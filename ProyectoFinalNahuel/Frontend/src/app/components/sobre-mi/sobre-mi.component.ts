import { HttpErrorResponse } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Route, Router } from '@angular/router';
import { persona } from 'src/app/model/persona.model';
import { PersonaService } from 'src/app/service/persona.service';
import { TokenService } from 'src/app/service/token.service';

@Component({
  selector: 'app-sobre-mi',
  templateUrl: './sobre-mi.component.html',
  styleUrls: ['./sobre-mi.component.css']
})
export class SobreMiComponent implements OnInit {
  persona: persona = new persona("", "", "", "", "", "");
  editPersona: persona = null;
  

  constructor(public personaService: PersonaService, private tokenService: TokenService, private activatedRoute: ActivatedRoute, private router: Router) { }

  isLogged = false;

  ngOnInit(): void {
    this.personaService.getPersona().subscribe(data => {this.persona = data})
    if(this.tokenService.getToken()){
      this.isLogged = true;
    }else {
      this.isLogged = false;
    }
  }

  public getPersona(): void {
    this.personaService.getPersona().subscribe({
      next: (Response: persona) => {
        this.persona=Response;
      },
      error: (error: HttpErrorResponse) => {
        alert(error.message);
      }
    })
  }


  public onEditPersona(perso: persona): void {
    this.personaService.editPersona(perso).subscribe({
      next: (Response: persona) => {
        console.log(Response);
        this.getPersona();
      },
      error: (error: HttpErrorResponse) =>{
        alert(error.message);
      }
    })
  }

  public onOpenModal(mode: string, persona?: persona): void {
    const container = document.getElementById('usermodal');
    const button = document.createElement('button');
    button.type = 'button';
    button.style.display = 'none';
    button.setAttribute('data-toggle', 'modal');    
    if (mode === 'edit') {
      this.editPersona = persona;
      button.setAttribute('data-target', '#editUserModal');
    }    
    container?.appendChild(button);
    button.click();
  }

}
