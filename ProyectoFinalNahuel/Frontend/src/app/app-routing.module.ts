import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './components/home/home.component';
import { LoginComponent } from './components/login/login.component';
import { NewExperienciaComponent } from './components/experiencia/new-experiencia.component';
import { EditExpComponent } from './components/experiencia/edit-exp.component';
import { NewEducacionComponent } from './components/educacion/new-educacion.component';
import { EditEducacionComponent } from './components/educacion/edit-educacion.component';
import { NewProyectosComponent } from './components/proyectos/new-proyectos.component';
import { EditProyectosComponent } from './components/proyectos/edit-proyectos.component';

const routes: Routes = [
  {path:'', component: HomeComponent},
  {path:'login', component: LoginComponent},
  {path:'nuevaexp', component: NewExperienciaComponent},
  {path: 'editexp/:id', component: EditExpComponent},
  {path: 'nuevaeduc', component: NewEducacionComponent},
  {path: 'editeduc/:id', component: EditEducacionComponent},
  {path: 'nuevoproy', component: NewProyectosComponent},
  {path: 'editproy/:id', component: EditProyectosComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
