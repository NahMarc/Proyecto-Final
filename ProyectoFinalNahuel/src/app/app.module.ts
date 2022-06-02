import { NgModule } from '@angular/core';
import { HardsoftComponent } from './components/hardsoft/hardsoft.component';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './components/header/header.component';
import { LogoArgProgComponent } from './components/logo-arg-prog/logo-arg-prog.component';
import { RedesSocComponent } from './components/redes-soc/redes-soc.component';
import { BannerComponent } from './components/banner/banner.component';
import { SobreMiComponent } from './components/sobre-mi/sobre-mi.component';
import { ExperienciaComponent } from './components/experiencia/experiencia.component';
import { EducacionComponent } from './components/educacion/educacion.component';
import { NgCircleProgressModule } from 'ng-circle-progress';
import { ProyectosComponent } from './components/proyectos/proyectos.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    LogoArgProgComponent,
    RedesSocComponent,
    BannerComponent,
    SobreMiComponent,
    ExperienciaComponent,
    EducacionComponent,
    HardsoftComponent,
    ProyectosComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    NgCircleProgressModule.forRoot({}),
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

