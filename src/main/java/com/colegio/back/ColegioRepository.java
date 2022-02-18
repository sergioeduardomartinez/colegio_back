package com.colegio.back;


import com.colegio.dto.Docente;
import com.colegio.dto.Profesor;

import java.util.List;

public interface ColegioRepository {

    List<Profesor> statistics(int profesor);
    List<Docente> docentes();
}
