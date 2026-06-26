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

WebUI.openBrowser('https://www.saucedemo.com/')

WebUI.setText(findTestObject('Sort filter/Sort harga tinggi ke rendah/input_Swag Labs_user-name'), 'standard_user')

WebUI.setText(findTestObject('Sort filter/Sort harga tinggi ke rendah/input_Swag Labs_password'), 'secret_sauce')

WebUI.click(findTestObject('Sort filter/Sort harga tinggi ke rendah/input_Swag Labs_login-button'))

WebUI.delay(5)

WebUI.click(findTestObject('Sort filter/Sort harga tinggi ke rendah/span_Name (A to Z)Name (A to Z)Name (Z to A_3f2346'))

WebUI.click(findTestObject('Sort filter/Sort harga tinggi ke rendah/span_Price (high to low)Name (A to Z)Name (_9953a8'))

WebUI.verifyElementPresent(findTestObject('Sort filter/Sort harga tinggi ke rendah/div_Sauce Labs Fleece JacketIts not every d_52b3dc'), 
    5)

WebUI.takeScreenshot()

WebUI.closeBrowser()

