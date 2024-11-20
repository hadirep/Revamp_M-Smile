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

Mobile.startExistingApplication('com.bankmega.msmiledev')

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/Lihat Semua/Transfer/Transfer ke Bank Mega/01. ViewGroup - Lihat Semua'), 
    0)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/Lihat Semua/Transfer/Transfer ke Bank Mega/02. ImageView - Transfer ke Bank Mega'), 
    0)

Mobile.verifyElementText(findTestObject('Object Repository/Lihat Semua/Transfer/Transfer ke Bank Mega/03. TextView - verif Transfer Bank Mega'), 
    'Transfer Bank Mega')

Mobile.tap(findTestObject('Object Repository/Lihat Semua/Transfer/Transfer ke Bank Mega/04. SvgView - Cek Saldo'), 
    0)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/Lihat Semua/Transfer/Transfer ke Bank Mega/05. TextView - Rekening Tujuan'), 
    0)

Mobile.tap(findTestObject('Object Repository/Lihat Semua/Transfer/Transfer ke Bank Mega/06. EditText - Tap Nopel'), 
    0)

Mobile.setText(findTestObject('Object Repository/Lihat Semua/Transfer/Transfer ke Bank Mega/07. EditText - Set Nopel'), 
    '010740020456886', 0)

Mobile.hideKeyboard()

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/Lihat Semua/Transfer/Transfer ke Bank Mega/08. ViewGroup - OK'), 0)

Mobile.tap(findTestObject('Object Repository/Lihat Semua/Transfer/Transfer ke Bank Mega/09. GroupView - Cek Saldo'), 
    0)

Mobile.verifyElementText(findTestObject('Object Repository/Lihat Semua/Transfer/Transfer ke Bank Mega/10. TextView - verif 010740020456886'), '010740020456886')

Mobile.tap(findTestObject('Object Repository/Lihat Semua/Transfer/Transfer ke Bank Mega/11. ViewGroup - Back Btn (Transfer)'), 
    0)

Mobile.tap(findTestObject('Object Repository/Lihat Semua/Transfer/Transfer ke Bank Mega/12. ViewGroup - Back Btn (Lihat Semua)'), 0)

Mobile.closeApplication()

