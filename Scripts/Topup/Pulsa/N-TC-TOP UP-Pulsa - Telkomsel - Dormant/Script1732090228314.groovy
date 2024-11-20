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

Mobile.tap(findTestObject('Object Repository/Topup/Pulsa/Telkomsel-Insuficcient Balance/001.ViewGroup - Top Up'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\H24090018\\Katalon Studio\\Revamp M-Smile - TRFP\\N-TC-TOP UP-Pulsa - Telkomsel - Dormant\\01.png')

Mobile.tap(findTestObject('Object Repository/Topup/Pulsa/Telkomsel-Insuficcient Balance/002.ViewGroup - Pulsa'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\H24090018\\Katalon Studio\\Revamp M-Smile - TRFP\\N-TC-TOP UP-Pulsa - Telkomsel - Dormant\\02.png')

Mobile.tap(findTestObject('Object Repository/Topup/Pulsa/Telkomsel-Insuficcient Balance/003.TextView - Pulsa'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\H24090018\\Katalon Studio\\Revamp M-Smile - TRFP\\N-TC-TOP UP-Pulsa - Telkomsel - Dormant\\03.png')

Mobile.tap(findTestObject('Topup/Pulsa/XL-Dormant/003.EditText -Input Number'), 0)

Mobile.setText(findTestObject('Topup/Pulsa/XL-Dormant/003.EditText -Input Number'), '082113611992', 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\H24090018\\Katalon Studio\\Revamp M-Smile - TRFP\\N-TC-TOP UP-Pulsa - Telkomsel - Dormant\\04.png')

Mobile.tap(findTestObject('Topup/Pulsa/Telkomsel-Insuficcient Balance/005.ViewGroup - Lanjut'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.swipe(900, 500, 100, 500)

Mobile.tap(findTestObject('Object Repository/Topup/Pulsa/Telkomsel-Insuficcient Balance/005.PathView - Pilih Nominal'), 0)

Mobile.tap(findTestObject('Topup/Pulsa/Telkomsel-Insuficcient Balance/06.TextView - 40000'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\H24090018\\Katalon Studio\\Revamp M-Smile - TRFP\\N-TC-TOP UP-Pulsa - Telkomsel - Dormant\\05.png')

Mobile.tap(findTestObject('Topup/Paket Data/TRI-Dormant/06.ViewGroup - Lanjut ke sumber dana'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\H24090018\\Katalon Studio\\Revamp M-Smile - TRFP\\N-TC-TOP UP-Pulsa - Telkomsel - Dormant\\06.png')

Mobile.tap(findTestObject('Topup/Pulsa/Telkomsel-Insuficcient Balance/014.EditText - Input PIN Dor'), 0)

Mobile.setText(findTestObject('Topup/Pulsa/Telkomsel-Insuficcient Balance/014.EditText - Input PIN Dor'), '111111', 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\H24090018\\Katalon Studio\\Revamp M-Smile - TRFP\\N-TC-TOP UP-Pulsa - Telkomsel - Dormant\\07.png')

Mobile.pressBack()

Mobile.tap(findTestObject('Topup/Pulsa/Telkomsel-Insuficcient Balance/16.ViewGroup - Lanjut'), 0)

Mobile.tap(findTestObject('Topup/Paket Data/TRI-Dormant/17.ViewGroup - Notice Dormant'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\H24090018\\Katalon Studio\\Revamp M-Smile - TRFP\\N-TC-TOP UP-Pulsa - Telkomsel - Dormant\\08.png')

Mobile.tap(findTestObject('Object Repository/Topup/Pulsa/Telkomsel-Insuficcient Balance/018.TextView - OK'), 0)

Mobile.pressBack()

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\H24090018\\Katalon Studio\\Revamp M-Smile - TRFP\\N-TC-TOP UP-Pulsa - Telkomsel - Dormant\\09.png')

Mobile.pressBack()

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\H24090018\\Katalon Studio\\Revamp M-Smile - TRFP\\N-TC-TOP UP-Pulsa - Telkomsel - Dormant\\10.png')

Mobile.pressBack()

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\H24090018\\Katalon Studio\\Revamp M-Smile - TRFP\\N-TC-TOP UP-Pulsa - Telkomsel - Dormant\\11.png')

Mobile.pressBack()

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\H24090018\\Katalon Studio\\Revamp M-Smile - TRFP\\N-TC-TOP UP-Pulsa - Telkomsel - Dormant\\12.png')

Mobile.closeApplication()

