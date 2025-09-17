import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import java.util.Random

String Option_Facility = "Tokyo CURA Healthcare Center,Hongkong CURA Healthcare Center,Seoul CURA Healthcare Center"

List<String> facilities = (Option_Facility.split(',') as List)

String randomFacility = facilities[new Random().nextInt(facilities.size())]

WebUI.selectOptionByValue(findTestObject('Appointment-Object/dropdown Facility'), randomFacility, false)
