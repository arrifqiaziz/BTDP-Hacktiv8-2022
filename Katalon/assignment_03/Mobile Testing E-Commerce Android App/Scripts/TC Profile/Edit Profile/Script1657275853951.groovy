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

Mobile.tap(findTestObject('Menu Bar/MenuBar_Profile'), 0)

Mobile.tap(findTestObject('Menu_Profile_Page/Profile_Detail Profile Edit'), 0)

Mobile.tap(findTestObject('Profile Detail/Edit Profile_Action/Edit_Name'), 0)

Mobile.setText(findTestObject('Profile Detail/Edit Profile_Action/Edit Profile_Name'), 'Arrifqi Aziz Ardhiansyah', 0)

Mobile.tap(findTestObject('Profile Detail/Edit Profile_Action/Edit Profile_ActionOK'), 0)

Mobile.tap(findTestObject('Profile Detail/Edit Profile_Action/Edit_Email'), 0)

Mobile.setText(findTestObject('Profile Detail/Edit Profile_Action/Edit Profile_Email'), 'arrfqiaziz@gmail.com', 0)

Mobile.tap(findTestObject('Profile Detail/Edit Profile_Action/Edit Profile_ActionOK'), 0)

Mobile.tap(findTestObject('Profile Detail/Edit Profile_Action/Edit_Phone Number'), 0)

Mobile.setText(findTestObject('Profile Detail/Edit Profile_Action/Edit Profile_Phone Number'), '082111178380', 0)

Mobile.tap(findTestObject('Profile Detail/Edit Profile_Action/Edit Profile_ActionOK'), 0)

Mobile.tap(findTestObject('Profile Detail/Edit Profile_Action/Edit_Address'), 0)

Mobile.setText(findTestObject('Profile Detail/Edit Profile_Action/Edit Profile_Address'), 'Bogor', 0)

Mobile.tap(findTestObject('Profile Detail/Edit Profile_Action/Edit Profile_ActionOK'), 0)

Mobile.tap(findTestObject('Profile Detail/Edit Profile_Action/btn_Back'), 0)

Mobile.verifyElementText(findTestObject('Profile Detail/Profile_User/Profile_Name'), 'Arrifqi Aziz Ardhiansyah')

Mobile.closeApplication()

