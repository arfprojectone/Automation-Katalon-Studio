import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import java.text.SimpleDateFormat as SimpleDateFormat

// Set Visite Date
String setVisitDate = new SimpleDateFormat('dd/MM/yyyy').format(new Date())

WebUI.setText(findTestObject('Appointment-Object/field Visit Date'), setVisitDate)