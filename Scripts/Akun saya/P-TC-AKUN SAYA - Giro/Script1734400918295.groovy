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

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-AKUN SAYA - Giro\\01.png')

Mobile.tap(findTestObject('Object Repository/Akun saya/Giro/01. ViewGroup-Akun Saya'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-AKUN SAYA - Giro\\02.png')

Mobile.verifyElementText(findTestObject('Object Repository/Akun saya/Giro/02. TextView-verif 010740010557458'), '010740010557458')

Mobile.verifyElementText(findTestObject('Object Repository/Akun saya/Giro/03. TextView-verif HADI RAHMAH ESA PUTRA'), 'HADI RAHMAH ESA PUTRA')

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-AKUN SAYA - Giro\\03.png')

Mobile.tap(findTestObject('Object Repository/Akun saya/Giro/04. ImageView-Klik Detail'), 0)

Mobile.delay(4)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-AKUN SAYA - Giro\\04.png')

Mobile.tap(findTestObject('Object Repository/Akun saya/Giro/05. ViewGroup-Mutasi Giro'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-AKUN SAYA - Giro\\05.png')

Mobile.pressBack()

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-AKUN SAYA - Giro\\06.png')

Mobile.tap(findTestObject('Object Repository/Akun saya/Giro/06. ViewGroup-E-Statement'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-AKUN SAYA - Giro\\07.png')

Mobile.pressBack()

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-AKUN SAYA - Giro\\08.png')

Mobile.tap(findTestObject('Object Repository/Akun saya/Giro/07. ImageView-Transfer'), 0)

Mobile.delay(4)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-AKUN SAYA - Giro\\09.png')

Mobile.pressBack()

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-AKUN SAYA - Giro\\10.png')

Mobile.tap(findTestObject('Object Repository/Akun saya/Giro/08. ImageView-Bayar'), 0)

Mobile.delay(4)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-AKUN SAYA - Giro\\11.png')

Mobile.pressBack()

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-AKUN SAYA - Giro\\12.png')

Mobile.tap(findTestObject('Object Repository/Akun saya/Giro/09. ImageView-Top Up'), 0)

Mobile.delay(4)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-AKUN SAYA - Giro\\13.png')

Mobile.pressBack()

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-AKUN SAYA - Giro\\14.png')

Mobile.tap(findTestObject('Object Repository/Akun saya/Giro/10. ViewGroup-Tarik Tunai'), 0)

Mobile.delay(4)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-AKUN SAYA - Giro\\15.png')

Mobile.pressBack()

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-AKUN SAYA - Giro\\16.png')

Mobile.pressBack()

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-AKUN SAYA - Giro\\17.png')

Mobile.pressBack()

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-AKUN SAYA - Giro\\18.png')

Mobile.closeApplication()

