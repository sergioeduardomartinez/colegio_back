package com.colegio.back;


import com.colegio.dto.Docente;
import com.colegio.dto.Profesor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.List;

@Repository
public class ColegioRepositoryImpl implements ColegioRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public List<Profesor> statistics(int profesro) {

        String sql ="SELECT B.NOMBRE AS Docente, A.NOMBRE AS Materia,C.NOMBRE AS Estudiante ,D.GRADO , E.SALON \n" +
                "FROM COLEGIO.ASIGNATURA A\n" +
                "INNER JOIN COLEGIO.PROFESOR B ON A.IDPROFESOR = B.IDPROFESOR\n" +
                "INNER JOIN COLEGIO.ESTUDIANTE C ON C.IDESTUDIANTE = A.IDESTUDIANTE\n" +
                "INNER JOIN COLEGIO.GRADO D ON D.IDGRADO = A.IDGRADO\n" +
                "INNER JOIN COLEGIO.CURSO E ON A.IDCURSO = E.IDCURSO \n" +
                "WHERE A.IDPROFESOR = ?";
        try {
            return jdbcTemplate.query(
                    sql,
                    new Object[] { profesro },
                    (rs, rowNum) ->
                            new Profesor(
                                    rs.getString("Docente"),
                                    rs.getString("Materia"),
                                    rs.getString("Estudiante"),
                                    rs.getString("Grado"),
                                    rs.getString("Salon")
                            )
            );
        } catch (EmptyResultDataAccessException e) {
            return null;
        }
    }

    public List<Docente> docentes() {

        String sql ="SELECT IDPROFESOR , NOMBRE FROM COLEGIO.PROFESOR";

        try {
            return jdbcTemplate.query(
                    sql,
                    (rs, rowNum) ->
                            new Docente(
                                    rs.getInt("IdProfesor"),
                                    rs.getString("Nombre")
                            )
            );
        } catch (EmptyResultDataAccessException e) {
            return null;
        }

    }


}
