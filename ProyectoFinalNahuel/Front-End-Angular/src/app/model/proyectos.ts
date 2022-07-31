export class Proyectos {
    id? : number;
    nombreProy: string;
    descriProy: string;
    imgProy: string;
    linkProy: string;

    constructor(nombreProy: string, descriProy: string, imgProy: string, linkProy: string){
        this.nombreProy = nombreProy;
        this.descriProy = descriProy;
        this.imgProy = imgProy;
        this.linkProy = linkProy;

    }

}
