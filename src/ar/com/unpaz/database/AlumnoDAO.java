package ar.com.unpaz.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

public class AlumnoDAO {

	public LinkedList<Alumno> getQuery() {

		LinkedList<Alumno> miRespuesta = new LinkedList<>();
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {

			con = MiConexion.getConnection();

			ps = con.prepareStatement("select ALUMNO.ID, ALUMNO.APEL_NOMBRE, MATERIA.DESCRIPCION, FINALES.NOTA from"
					+ " FINALES join ALUMNO ON FINALES.ID_ALUMNO = ALUMNO.ID join MATERIA ON FINALES.ID_MATERIA = MATERIA.ID "
					+ "where ALUMNO.APEL_NOMBRE = 'Crivelli, Federio' ");

			rs = ps.executeQuery();

			while (rs.next()) {

				Alumno miAlumno = new Alumno();
				miAlumno.setId(rs.getInt(1));
				miAlumno.setApel_nom(rs.getString(2));
				miAlumno.setDescripcion(rs.getString(3));
				miAlumno.setNota(rs.getDouble(4));
				miRespuesta.add(miAlumno);

			}

			return miRespuesta;

		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		} finally {

			try {
				rs.close();
				ps.close();
				con.close();

			} catch (SQLException e) {

				e.printStackTrace();

			}

		}

	}

}
