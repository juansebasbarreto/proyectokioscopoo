package control;

import entity.Descuento;
import entity.EBookImage;
import entity.EBookVideo;
import entity.Libro;
import entity.PaperBook;
import entity.PorEBook;
import entity.PorSaga;
import java.util.HashMap;

/**
 *
 * @author Juan Sebastian Barreto Jimenez Juan Camilo Devia Bastos Nicolas
 * Javier Ramirez Beltran Valentina López Suárez Mayo 04 2020
 */
// Punto 1
public class GestionLibro {

    public GestionLibro() {
    }

    //punto 1 a I
    public HashMap<String, Libro> crearColeccionLibro() {
        HashMap<String, Libro> librosDispo = new HashMap<>();
        HashMap<Integer, Libro> saga = new HashMap<>();
        HashMap<Integer, Descuento> descuento = new HashMap<>();

        PaperBook pb7 = new PaperBook("100", 20000, "H7", 10, 25000, "Harry Potter y las Reliquias de la Muerte", 0, 0);
        PaperBook pb6 = new PaperBook("101", 20000, "H6", 5, 30000, "Harry Potter y el Principe Mestizo", 0, 0);
        PaperBook pb1 = new PaperBook("104", 20000, "H1", 1, 20000, "Harry Potter y la Piedra filosofal", 0, 0);
        PaperBook pb5 = new PaperBook("102", 20000, "H5", 8, 35000, "Harry Potter y la Orden del Fenix", 0, 0);
        PaperBook pb2 = new PaperBook("103", 20000, "H2", 10, 15000, "Harry Potter y la camara Secreta", 0, 0);

        saga.put(2, pb2);
        saga.put(5, pb5);
        saga.put(6, pb6);
        saga.put(7, pb7);

        pb1.setSaga(saga);
        saga = new HashMap<>();

        saga.put(1, pb1);
        saga.put(5, pb5);
        saga.put(6, pb6);
        saga.put(7, pb7);

        pb2.setSaga(saga);
        saga = new HashMap<>();

        saga.put(1, pb1);
        saga.put(2, pb2);
        saga.put(6, pb6);
        saga.put(7, pb7);
        pb5.setSaga(saga);
        saga = new HashMap<>();

        saga.put(1, pb1);
        saga.put(2, pb2);
        saga.put(5, pb5);
        saga.put(7, pb7);
        pb6.setSaga(saga);
        saga = new HashMap<>();

        saga.put(1, pb1);
        saga.put(2, pb2);
        saga.put(5, pb5);
        saga.put(6, pb6);
        pb7.setSaga(saga);

        PorSaga ps1 = new PorSaga(1, 0.10);
        PorSaga ps2 = new PorSaga(2, 0.05);
        PorSaga ps3 = new PorSaga(5, 0.14);
        PorSaga ps4 = new PorSaga(6, 0.16);
        PorSaga ps5 = new PorSaga(7, 0.19);

        descuento.put(0, ps1);
        descuento.put(1, ps2);

        pb5.setDescuentos(descuento);
        pb6.setDescuentos(descuento);

        descuento = new HashMap<>();

        descuento.put(0, ps3);
        descuento.put(1, ps4);

        pb1.setDescuentos(descuento);
        pb7.setDescuentos(descuento);

        descuento = new HashMap<>();

        descuento.put(0, ps5);

        pb2.setDescuentos(descuento);

        librosDispo.put(pb1.getIsbn(), pb1);
        librosDispo.put(pb2.getIsbn(), pb2);
        librosDispo.put(pb5.getIsbn(), pb5);
        librosDispo.put(pb6.getIsbn(), pb6);
        librosDispo.put(pb7.getIsbn(), pb7);

        saga = new HashMap<>();
        descuento = new HashMap<>();

        // Solo un libro 
        PaperBook pb8 = new PaperBook("110", 30000, "L0", 6, 40000, "Los Miserables", 0, 0);
        PaperBook pb9 = new PaperBook("120", 40000, "O0", 10, 30000, "Orgullo y Prejuicio", 0, 0);
        PaperBook pb10 = new PaperBook("130", 10000, "LM", 10, 50000, "La isla bajo el mar", 0, 0);

        librosDispo.put(pb8.getIsbn(), pb8);
        librosDispo.put(pb9.getIsbn(), pb9);
        librosDispo.put(pb10.getIsbn(), pb10);

        // EbookImage 
        EBookImage eb1 = new EBookImage(500, "www.sagadiver.com/Divergente", "D1", 10, 30000, "Divergente", 15, 0);
        EBookImage eb2 = new EBookImage(500, "www.sagadiver.com/Insurgente", "D2", 6, 25000, "Insurgente", 20, 0);
        EBookImage eb3 = new EBookImage(500, "www.sagadiver.com/Allegiant", "D3", 9, 50000, "Allegiant", 25, 0);
        EBookImage eb4 = new EBookImage(500, "www.sagadiver.com/Cuatro", "D4", 3, 30000, "Cuatro", 18, 0);

        saga.put(2, eb2);
        saga.put(3, eb3);
        saga.put(4, eb4);

        eb1.setSaga(saga);
        saga = new HashMap<>();

        saga.put(1, eb1);
        saga.put(3, eb3);
        saga.put(4, eb4);

        eb2.setSaga(saga);
        saga = new HashMap<>();

        saga.put(1, eb1);
        saga.put(2, eb2);
        saga.put(4, eb4);
        eb3.setSaga(saga);
        saga = new HashMap<>();

        saga.put(1, eb1);
        saga.put(2, eb2);
        saga.put(3, eb3);
        eb4.setSaga(saga);

        PorSaga es1 = new PorSaga(1, 0.20);
        PorSaga es2 = new PorSaga(2, 0.25);
        PorSaga es3 = new PorSaga(3, 0.05);
        PorSaga es4 = new PorSaga(4, 0.10);

        PorEBook pe1 = new PorEBook(0.10);
        PorEBook pe2 = new PorEBook(0.15);
        PorEBook pe3 = new PorEBook(0.08);
        PorEBook pe4 = new PorEBook(0.20);

        descuento.put(0, es2);
        descuento.put(1, pe1);

        eb1.setDescuentos(descuento);
        descuento = new HashMap<>();

        descuento.put(0, es1);
        descuento.put(1, es4);
        descuento.put(2, pe2);

        eb2.setDescuentos(descuento);
        descuento = new HashMap<>();

        descuento.put(0, pe3);
        descuento.put(1, es4);

        eb3.setDescuentos(descuento);
        descuento = new HashMap<>();

        descuento.put(0, pe4);
        eb4.setDescuentos(descuento);

        librosDispo.put(eb1.getIsbn(), eb1);
        librosDispo.put(eb2.getIsbn(), eb2);
        librosDispo.put(eb3.getIsbn(), eb3);
        librosDispo.put(eb4.getIsbn(), eb4);

        descuento = new HashMap<>();
        saga = new HashMap<>();

        // por EBookIamge
        EBookImage eb5 = new EBookImage(2000, "www.lagrimas.com/El_último_adios", "EA", 10, 10000, "El último adios", 11, 0);
        EBookImage eb6 = new EBookImage(500, "www.diver.com/La_chica_del_tren", "CT", 12, 20000, "La chica del tren ", 15, 0);
        EBookImage eb7 = new EBookImage(1500, "www.cursis.com/Bajo_la_misma_estrella", "ME", 4, 30000, "Bajo la misma estrella", 8, 0);

        PorEBook ebi5 = new PorEBook(0.20);
        PorEBook ebi6 = new PorEBook(0.25);
        PorEBook ebi7 = new PorEBook(0.30);

        descuento.put(0, ebi5);
        librosDispo.put(eb5.getIsbn(), eb5);
        descuento = new HashMap<>();

        descuento.put(0, ebi6);
        librosDispo.put(eb6.getIsbn(), eb6);
        descuento = new HashMap<>();

        descuento.put(0, ebi7);
        librosDispo.put(eb7.getIsbn(), eb7);
        descuento = new HashMap<>();

        //Por EBookVideo   
        EBookVideo ev1 = new EBookVideo(5000, "www.tusvideos.com/El_codigo_Da_Vinci", "DA", 15, 20000, "El codigo Da Vinci", 0, 12);
        EBookVideo ev2 = new EBookVideo(2000, "www.tusvideos.com/Angeles_y_demonios", "AD", 15, 25000, "Angeles y demonios ", 0, 4);
        EBookVideo ev3 = new EBookVideo(1500, "www.tusvideos.com/Inferno", "IN", 10, 60000, "Inferno ", 0, 8);

        saga.put(2, ev2);
        saga.put(3, ev3);
        ev1.setSaga(saga);
        saga = new HashMap<>();

        saga.put(1, ev1);
        saga.put(3, ev3);
        ev2.setSaga(saga);
        saga = new HashMap<>();

        saga.put(1, ev1);
        saga.put(2, ev2);
        ev3.setSaga(saga);

        PorSaga esv1 = new PorSaga(1, 0.30);
        PorSaga esv2 = new PorSaga(2, 0.15);
        PorSaga esv3 = new PorSaga(3, 0.09);

        PorEBook pev1 = new PorEBook(0.30);
        PorEBook pev2 = new PorEBook(0.15);
        PorEBook pev3 = new PorEBook(0.35);

        descuento.put(0, esv2);
        descuento.put(1, esv3);
        descuento.put(2, pev1);

        ev1.setDescuentos(descuento);
        descuento = new HashMap<>();

        descuento.put(0, esv1);
        descuento.put(1, esv3);
        descuento.put(2, pev2);

        ev2.setDescuentos(descuento);
        descuento = new HashMap<>();

        descuento.put(0, esv1);
        descuento.put(1, esv2);
        descuento.put(2, pev3);
        ev3.setDescuentos(descuento);

        librosDispo.put(ev1.getIsbn(), ev1);
        librosDispo.put(ev2.getIsbn(), ev2);
        librosDispo.put(ev3.getIsbn(), ev3);

        descuento = new HashMap<>();

        //Por EBookVideo 
        EBookVideo ev4 = new EBookVideo(3000, "www.ninos.com/El_principito", "PR", 5, 10000, "El principito", 0, 20);
        EBookVideo ev5 = new EBookVideo(2500, "www.codigofacil.com/Muy_facil", "MF", 10, 3000, "Muy facil ", 0, 15);

        PorEBook ebv4 = new PorEBook(0.40);
        PorEBook ebv5 = new PorEBook(0.05);

        descuento.put(0, ebv4);
        librosDispo.put(ev4.getIsbn(), ev4);
        descuento = new HashMap<>();

        descuento.put(0, ebv5);
        librosDispo.put(ev5.getIsbn(), ev5);
        return librosDispo;
    }
}
