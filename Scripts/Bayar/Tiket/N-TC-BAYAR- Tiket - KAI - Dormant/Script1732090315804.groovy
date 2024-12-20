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

Mobile.tap(findTestObject('Object Repository/Bayar/Tiket/KAI Dormant Insuficient/01.ViewGroup - Bayar'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\N-TC-BAYAR- Tiket - KAI - Dormant\\01.png')

Mobile.tap(findTestObject('Object Repository/Bayar/Tiket/KAI Dormant Insuficient/02.RectView - Tiket'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\N-TC-BAYAR- Tiket - KAI - Dormant\\02.png')

Mobile.tap(findTestObject('Object Repository/Bayar/Tiket/KAI Dormant Insuficient/03.EditText - Daftar Produk'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Bayar/Tiket/KAI Dormant Insuficient/04.TextView - KAI'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\N-TC-BAYAR- Tiket - KAI - Dormant\\03.png')

Mobile.tap(findTestObject('Object Repository/Bayar/Tiket/KAI Dormant Insuficient/05.EditText - Input Nomor'), 0)

Mobile.tap(findTestObject('Object Repository/Bayar/Tiket/KAI Dormant Insuficient/06.EditText - Input Baru'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\N-TC-BAYAR- Tiket - KAI - Dormant\\04.png')

Mobile.setText(findTestObject('Object Repository/Bayar/Tiket/KAI Dormant Insuficient/07.EditText - Input Baru Nopel'), '1999123459001', 
    0)

Mobile.tap(findTestObject('Object Repository/Bayar/Tiket/KAI Dormant Insuficient/08.ScrollView - Close Keyboard'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\N-TC-BAYAR- Tiket - KAI - Dormant\\05.png')

Mobile.tap(findTestObject('Object Repository/Bayar/Tiket/KAI Dormant Insuficient/09.ViewGroup - Ok'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\N-TC-BAYAR- Tiket - KAI - Dormant\\06.png')
Mobile.tap(findTestObject('Object Repository/Bayar/Tiket/KAI Dormant Insuficient/10.ViewGroup - Lanjut'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\N-TC-BAYAR- Tiket - KAI - Dormant\\07.png')

Mobile.tap(findTestObject('Object Repository/Bayar/Tiket/KAI Dormant Insuficient/11.TextView - Konfirmasi Pembayaran'), 0)

Mobile.tap(findTestObject('Object Repository/Bayar/Tiket/KAI Dormant Insuficient/12.EditText - Input PIN'), 0)

Mobile.setText(findTestObject('Object Repository/Bayar/Tiket/KAI Dormant Insuficient/13.EditText - PIN'), '111111', 0)

Mobile.tap(findTestObject('Object Repository/Bayar/Tiket/KAI Dormant Insuficient/14.ScrollView - Close Keyboard'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\N-TC-BAYAR- Tiket - KAI - Dormant\\08.png')

Mobile.tap(findTestObject('Object Repository/Bayar/Tiket/KAI Dormant Insuficient/15.ViewGroup - Bayar'), 0)

Mobile.tap(findTestObject('Object Repository/Bayar/Tiket/KAI Dormant Insuficient/16.ViewGroup - Notif Error Dormant'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\N-TC-BAYAR- Tiket - KAI - Dormant\\09.png')

Mobile.tap(findTestObject('Object Repository/Bayar/Tiket/KAI Dormant Insuficient/17.TextView - OK'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\N-TC-BAYAR- Tiket - KAI - Dormant\\11.png')

Mobile.pressBack()

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\N-TC-BAYAR- Tiket - KAI - Dormant\\12.png')

Mobile.pressBack()

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\N-TC-BAYAR- Tiket - KAI - Dormant\\13.png')

Mobile.pressBack()

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\N-TC-BAYAR- Tiket - KAI - Dormant\\14.png')

Mobile.closeApplication()

