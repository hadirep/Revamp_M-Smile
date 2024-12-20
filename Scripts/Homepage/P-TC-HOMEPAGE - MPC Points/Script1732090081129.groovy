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

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-HOMEPAGE - MPC Points\\01.png')

Mobile.tap(findTestObject('Object Repository/Homepage/MPC Points/TextView - MPC Points'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-HOMEPAGE - MPC Points\\02.png')

Mobile.verifyElementText(findTestObject('Homepage/MPC Points/TextView - MPC Points'), 'MPC Points:')

Mobile.verifyElementText(findTestObject('Object Repository/Homepage/MPC Points/TextView - 602000'), '602000')

Mobile.tap(findTestObject('Object Repository/Homepage/MPC Points/TextView - 602000'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-HOMEPAGE - MPC Points\\02.png')

Mobile.getText(findTestObject('Object Repository/Homepage/MPC Points/TextView - 602.000'), 0)

Mobile.tap(findTestObject('Object Repository/Homepage/MPC Points/EditText - Semua Transaksi'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-HOMEPAGE - MPC Points\\03.png')

Mobile.tap(findTestObject('Object Repository/Homepage/MPC Points/TextView - Redeem'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-HOMEPAGE - MPC Points\\04.png')

Mobile.tap(findTestObject('Object Repository/Homepage/MPC Points/EditText - Redeem'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-HOMEPAGE - MPC Points\\05.png')

Mobile.tap(findTestObject('Object Repository/Homepage/MPC Points/TextView - Penarikan Point'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-HOMEPAGE - MPC Points\\06.png')

Mobile.tap(findTestObject('Object Repository/Homepage/MPC Points/EditText - Penarikan Point'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-HOMEPAGE - MPC Points\\07.png')

Mobile.tap(findTestObject('Object Repository/Homepage/MPC Points/TextView - Pengembalian Point'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-HOMEPAGE - MPC Points\\08.png')

Mobile.tap(findTestObject('Object Repository/Homepage/MPC Points/EditText - Pengembalian Point'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-HOMEPAGE - MPC Points\\09.png')

Mobile.tap(findTestObject('Object Repository/Homepage/MPC Points/TextView - Reward'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-HOMEPAGE - MPC Points\\10.png')

Mobile.tap(findTestObject('Object Repository/Homepage/MPC Points/EditText - Reward'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-HOMEPAGE - MPC Points\\11.png')

Mobile.tap(findTestObject('Object Repository/Homepage/MPC Points/TextView - Expire'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-HOMEPAGE - MPC Points\\12.png')

Mobile.tap(findTestObject('Object Repository/Homepage/MPC Points/EditText - Expire'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-HOMEPAGE - MPC Points\\13.png')

Mobile.tap(findTestObject('Object Repository/Homepage/MPC Points/TextView - Semua Transaksi'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-HOMEPAGE - MPC Points\\14.png')

Mobile.tap(findTestObject('Object Repository/Homepage/MPC Points/EditText - Pilih Periode'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-HOMEPAGE - MPC Points\\15.png')

Mobile.tap(findTestObject('Object Repository/Homepage/MPC Points/TextView - 28'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-HOMEPAGE - MPC Points\\16.png')

Mobile.tap(findTestObject('Object Repository/Homepage/MPC Points/TextView - 29'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-HOMEPAGE - MPC Points\\17.png')

Mobile.tap(findTestObject('Object Repository/Homepage/MPC Points/TextView - DONE'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-HOMEPAGE - MPC Points\\18.png')

Mobile.closeApplication()

