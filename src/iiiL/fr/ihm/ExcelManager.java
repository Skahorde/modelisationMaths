package iiiL.fr.ihm;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelManager {
	/** Chemin vers le fichier excel */
	private String excelPath = null;
	/** Feuille excel à traiter */
	private String feuille = null;

	/**
	 * Constructeur
	 * @param excelPath
	 */
	public ExcelManager(String excelPath, String feuille) {
		this.excelPath = excelPath;
		this.feuille = feuille;
	}

	/**
	 * Cette fonction permet d'insérer les valeurs trouvées par la loi de probabilité
	 * Dans le fichier excel
	 * @param data la liste contenant toutes les valeurs
	 */
	public void writeExcelFile(ArrayList<Double> data) {
		FileInputStream in = null;
		XSSFWorkbook wb = null;
		Sheet sheet = null;
		Row row = null;
		Cell cell = null;
		
		try {
			// Flux de données
			in = new FileInputStream(new File(excelPath));
			// Classeur Excel
			wb = new XSSFWorkbook(in);
			// Sélection de la feuille à traiter
			sheet = wb.getSheet(feuille);
			
			System.out.println("Modification du fichier excel...");
			for (int i = 0; i < data.size(); i ++) {
				// Sélection de la ligne excel
				row = sheet.getRow(i+1);
				// Sélection de la cellule excel
				cell = row.getCell(0);
				
				switch (cell.getCellTypeEnum()) {
				case NUMERIC :
					// Ajout de la valeur
					cell.setCellValue(data.get(i));
				default :
					cell.setCellType(CellType.NUMERIC);
					cell.setCellValue(data.get(i));
				}
			}
			
			FileOutputStream out = new FileOutputStream(new File(excelPath));
			wb.write(out);
			out.close();
			System.out.println("Le fichier excel a été modifié avec succès");
		
		} catch (IOException e) {
			e.printStackTrace();
		} catch (NullPointerException e) {
			System.out.println("Pointeur null");
			e.printStackTrace();
		}
	}
}
