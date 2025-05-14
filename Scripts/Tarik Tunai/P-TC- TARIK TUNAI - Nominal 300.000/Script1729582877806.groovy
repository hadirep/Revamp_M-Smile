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

Mobile.tap(findTestObject('01.New Update Script Repo/Tarik Tunai/01. Tarik Tunai'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC- Tarik Tunai - Rp. 300.000\\01.png')

Mobile.tap(findTestObject('Tarik Tunai/02.TextView - Rp. 300.000'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC- Tarik Tunai - Rp. 300.000\\02.png')

Mobile.tap(findTestObject('Object Repository/Tarik Tunai/03.EditText - M-PIN'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC- Tarik Tunai - Rp. 300.000\\03.png')

Mobile.setText(findTestObject('Object Repository/Tarik Tunai/04.EditText - Set M-PIN'), '111111', 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC- Tarik Tunai - Rp. 300.000\\04.png')

Mobile.tap(findTestObject('Object Repository/Tarik Tunai/05.ScrollView - Close Keyboard'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC- Tarik Tunai - Rp. 300.000\\05.png')

Mobile.tap(findTestObject('Object Repository/Tarik Tunai/06.ViewGroup - Lanjut'), 0)

Mobile.tap(findTestObject('Object Repository/Tarik Tunai/07.ViewGroup - Notice Success'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC- Tarik Tunai - Rp. 300.000\\06.png')

Mobile.tap(findTestObject('Object Repository/Tarik Tunai/08.TextView - OK'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC- Tarik Tunai - Rp. 300.000\\07.png')

Mobile.closeApplication()

