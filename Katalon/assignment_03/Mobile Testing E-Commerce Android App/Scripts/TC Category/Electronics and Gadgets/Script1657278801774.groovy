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

Mobile.startExistingApplication('com.solodroid.solomerce', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Menu Bar/MenuBar_Category'), 0)

Mobile.tap(findTestObject('Menu_Category/Category Page/Category_Electronics and Gadgets'), 0)

Mobile.tap(findTestObject('Menu_Category/Electronics and Gadgets/Samsung Galaxy S10'), 0)

Mobile.tap(findTestObject('btn_Action/btn_Add to Cart'), 0)

Mobile.setText(findTestObject('btn_Action/Set Quantity'), '1', 0)

Mobile.tap(findTestObject('btn_Action/btn_Add'), 0)

Mobile.tap(findTestObject('btn_Action/btn_Back'), 0)

Mobile.tap(findTestObject('Menu_Category/Electronics and Gadgets/U17 USB Portale Humidifier'), 0)

Mobile.tap(findTestObject('btn_Action/btn_Add to Cart'), 0)

Mobile.setText(findTestObject('btn_Action/Set Quantity'), '1', 0)

Mobile.tap(findTestObject('btn_Action/btn_Add'), 0)

Mobile.tap(findTestObject('btn_Action/btn_Back'), 0)

Mobile.tap(findTestObject('Menu_Category/Electronics and Gadgets/Apple Watch'), 0)

Mobile.tap(findTestObject('btn_Action/btn_Add to Cart'), 0)

Mobile.setText(findTestObject('btn_Action/Set Quantity'), '1', 0)

Mobile.tap(findTestObject('btn_Action/btn_Add'), 0)

Mobile.tap(findTestObject('btn_Action/btn_Back'), 0)

Mobile.tap(findTestObject('Menu_Category/Electronics and Gadgets/Mini Digital Speaker'), 0)

Mobile.tap(findTestObject('btn_Action/btn_Add to Cart'), 0)

Mobile.setText(findTestObject('btn_Action/Set Quantity'), '1', 0)

Mobile.tap(findTestObject('btn_Action/btn_Add'), 0)

Mobile.tap(findTestObject('btn_Action/btn_Back'), 0)

Mobile.tap(findTestObject('Menu_Category/Electronics and Gadgets/LED TV'), 0)

Mobile.tap(findTestObject('btn_Action/btn_Add to Cart'), 0)

Mobile.setText(findTestObject('btn_Action/Set Quantity'), '1', 0)

Mobile.tap(findTestObject('btn_Action/btn_Add'), 0)

Mobile.tap(findTestObject('btn_Action/btn_Cart'), 0)

Mobile.verifyElementText(findTestObject('Menu_Category/Electronics and Gadgets/Cart_Electonics and Gadgets/Cart_Samsung Galaxy S10 - Black'), 
    'Samsung Galaxy S10 - Black')

Mobile.verifyElementText(findTestObject('Menu_Category/Electronics and Gadgets/Cart_Electonics and Gadgets/Cart_U17 USB Portable M3'), 
    'U17 USB Portable M3 HUmidifier Air Purifier LED Night Light 200ML')

Mobile.verifyElementText(findTestObject('Menu_Category/Electronics and Gadgets/Cart_Electonics and Gadgets/Cart_Apple watch series 3 GPS 42mm Black'), 
    'Apple watch series 3 GPS 42mm Black')

Mobile.verifyElementText(findTestObject('Menu_Category/Electronics and Gadgets/Cart_Electonics and Gadgets/Cart_Mini Digital Speaker'), 
    'Mini Digital Speaker TD-V26 USB FM Radio SD TF Card MP3 - Red')

Mobile.verifyElementText(findTestObject('Menu_Category/Electronics and Gadgets/Cart_Electonics and Gadgets/Cart_LED TV 43 Inch Smart TV'), 
    'LED TV 43 Inch Smart TV TCL 43E3 UHD 4K Dolby Sound')

Mobile.verifyElementExist(findTestObject('Checkout Page/Cart_Total'), 0)

Mobile.tap(findTestObject('Checkout Page/btn_Checkout'), 0)

Mobile.tap(findTestObject('Checkout Page/Select Shipping'), 0)

Mobile.tap(findTestObject('Checkout Page/Shipping_TNT Express'), 0)

Mobile.tap(findTestObject('Checkout Page/btn_Process Checkout'), 0)

Mobile.tap(findTestObject('Checkout Page/Confirm_YES'), 0)

Mobile.verifyElementExist(findTestObject('Checkout Page/Confirmation'), 1)

Mobile.closeApplication()

