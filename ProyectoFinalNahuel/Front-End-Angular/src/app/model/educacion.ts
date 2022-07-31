export class Educacion {
    id? : number;
    nombreInsti : string;
    nombreCarrera : string;
    anoInicio: string;
    anoFin: string;

    constructor(nombreInsti : string, nombreCarrera : string, anoInicio : string, anoFin : string){
        this.nombreInsti = nombreInsti;
        this.nombreCarrera = nombreCarrera;
        this.anoInicio = anoInicio;
        this.anoFin = anoFin;
    }
}
