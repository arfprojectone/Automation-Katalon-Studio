import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import java.text.SimpleDateFormat as SimpleDateFormat

// Comment
String dateNow = new SimpleDateFormat('ddMMyyyy_HHmmss').format(new Date())

String commentText = 'Automation Testing ' + dateNow

WebUI.setText(findTestObject('Appointment-Object/field Comment'), commentText)