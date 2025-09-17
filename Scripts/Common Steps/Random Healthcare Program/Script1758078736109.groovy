import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import java.util.Random
import com.kms.katalon.core.testobject.TestObject as TestObject

String Option_HealthcareProgram = "radio_program_medicare,radio_program_medicaid,radio_program_none"

List<String> healthcarePrograms = (Option_HealthcareProgram.split(',') as List)

String randomHealthcareProgram = healthcarePrograms[new Random().nextInt(healthcarePrograms.size())]

TestObject healthcareProgramOption = findTestObject('Appointment-Object/option Healthcare Program',[('Option_Healthcare_Program') : randomHealthcareProgram])

WebUI.click(healthcareProgramOption)