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

WebUI.setText(findTestObject('Imza/Page_Ultia/input_zin Tr_AbsenceTypeValue'), 'Yıllık İzin')

WebUI.click(findTestObject('Imza/Page_Ultia/div_Yllk zin'))

WebUI.setText(findTestObject('Imza/Page_Ultia/textarea_Aklama_Description'), 'test123')

WebUI.click(findTestObject('Imza/Page_Ultia/input_Balang Tarihi_BeginDate'))

WebUI.setText(findTestObject('Imza/Page_Ultia/input_Balang Tarihi_BeginDate'), '25.06.2023 08:00:00')

WebUI.click(findTestObject('Imza/Page_Ultia/button_Tamam_basla'))

WebUI.click(findTestObject('Imza/Page_Ultia/input_Biti Tarihi_EndDate'))

WebUI.setText(findTestObject('Imza/Page_Ultia/input_Biti Tarihi_EndDate'), '26.06.2023 09:00:00')

WebUI.click(findTestObject('Imza/Page_Ultia/button_Tamam_bitis'))

WebUI.delay(10)

value = WebUI.getAttribute(findTestObject('Imza/Page_Ultia/input_Hesaplanan zin_UsedtoAmount'), 'value')

if (value == '') {
    throw new Exception('Hesaplanan İzin alanı boş')
}

WebUI.click(findTestObject('Imza/Page_Ultia/button_Kaydet'))

