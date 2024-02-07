import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.click(findTestObject('Object Repository/Cura_Pages/CuraPage_Login_OR/Page_CURA Healthcare Service/button_Login'))

WebUI.openBrowser('')

WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Cura_Pages/CuraPage_MakeAppointmentValidation_Tokyo/a_Make Appointment'))

WebUI.setText(findTestObject('Object Repository/Cura_Pages/CuraPage_MakeAppointmentValidation_Tokyo/input_Username_username'), 
    'John Doe')

WebUI.setEncryptedText(findTestObject('Object Repository/Cura_Pages/CuraPage_MakeAppointmentValidation_Tokyo/input_Password_password'), 
    'g3/DOGG74jC3Flrr3yH+3D/yKbOqqUNM')

WebUI.click(findTestObject('Object Repository/Cura_Pages/CuraPage_MakeAppointmentValidation_Tokyo/button_Login'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Cura_Pages/CuraPage_MakeAppointmentValidation_Tokyo/select_Tokyo CURA Healthcare Center        _5b4107'), 
    'Tokyo CURA Healthcare Center', true)

WebUI.acceptAlert()

WebUI.click(findTestObject('Object Repository/Cura_Pages/CuraPage_MakeAppointmentValidation_Tokyo/label_Medicare'))

WebUI.click(findTestObject('Object Repository/Cura_Pages/CuraPage_MakeAppointmentValidation_Tokyo/input_Visit Date (Required)_visit_date'))

WebUI.click(findTestObject('Object Repository/Cura_Pages/CuraPage_MakeAppointmentValidation_Tokyo/td_16'))

WebUI.click(findTestObject('Object Repository/Cura_Pages/CuraPage_MakeAppointmentValidation_Tokyo/button_Book Appointment'))

WebUI.closeBrowser()

