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

Mobile.tap(findTestObject('Menu_Category/Category Page/Category_Baby Gear'), 0)

Mobile.tap(findTestObject('Menu_Category/Baby Gear/Animal Jumpsuit For Newborn Baby'), 0)

Mobile.tap(findTestObject('btn_Action/btn_Add to Cart'), 0)

Mobile.setText(findTestObject('btn_Action/Set Quantity'), '3', 0)

Mobile.tap(findTestObject('btn_Action/btn_Add'), 0)

Mobile.tap(findTestObject('btn_Action/btn_Back'), 0)

Mobile.tap(findTestObject('Menu_Category/Baby Gear/Bib Slabber Waterproof'), 0)

Mobile.tap(findTestObject('btn_Action/btn_Add to Cart'), 0)

Mobile.setText(findTestObject('btn_Action/Set Quantity'), '4', 0)

Mobile.tap(findTestObject('btn_Action/btn_Add'), 0)

Mobile.tap(findTestObject('btn_Action/btn_Cart'), 0)

Mobile.verifyElementText(findTestObject('Menu_Category/Baby Gear/Cart_Baby Gear/Cart_Animal Jumpsuit for Newborn Baby'), 
    'Animal Jumpsuit for Newborn Baby')

Mobile.verifyElementText(findTestObject('Menu_Category/Baby Gear/Cart_Baby Gear/Cart_Bib Slabber Waterproof'), 'Bib Slabber Waterproof')

Mobile.verifyElementExist(findTestObject('Checkout Page/Cart_Total'), 0)

Mobile.tap(findTestObject('Checkout Page/Empty Cart'), 0)

Mobile.tap(findTestObject('Checkout Page/Confirm_YES'), 0)

Mobile.verifyElementExist(findTestObject('Checkout Page/Cart Empty'), 2)

Mobile.closeApplication()

