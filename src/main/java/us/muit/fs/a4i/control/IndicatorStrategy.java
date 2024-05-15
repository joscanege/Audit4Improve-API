package us.muit.fs.a4i.control;

import java.util.List;

import us.muit.fs.a4i.exceptions.NotAvailableMetricException;
import us.muit.fs.a4i.model.entities.ReportItemI;

/**
 * /**
 * <p>
 * Interfaz para calcular indicadores
 * <p>
 * @param <T>
 * @author celllarod
 *
 */
public interface IndicatorStrategy<T> {
	

    /**
     * Calcula un indicador a partir de las m�tricas proporcionadas.
     * @param <T>
     * @param metrics
     * @throws NotAvailableMetricException
     * @return indicador
     */
	public  ReportItemI<T>  calcIndicator(List<ReportItemI<T>> metrics) throws NotAvailableMetricException;
	
	
	/**
	 * Obtiene las m�tricas necesarias
	 * @return listado de m�tricas
	 */
	public List<String> requiredMetrics();
		
}
