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
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-LIHAT SEMUA - Bayar - Lainnya\\01.png')

Mobile.tap(findTestObject('Object Repository/Lihat Semua/Bayar/12. Bayar - Lainnya/01. ViewGroup-Lihat Semua'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-LIHAT SEMUA - Bayar - Lainnya\\02.png')

Mobile.scrollToText('Lainnya')

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-LIHAT SEMUA - Bayar - Lainnya\\03.png')

Mobile.tap(findTestObject('Object Repository/Lihat Semua/Bayar/12. Bayar - Lainnya/02. ViewGroup-Lainnya'), 0)

Mobile.tap(findTestObject('Object Repository/Lihat Semua/Bayar/12. Bayar - Lainnya/03. SvgView-Cek Saldo'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-LIHAT SEMUA - Bayar - Lainnya\\04.png')

Mobile.tap(findTestObject('Object Repository/Lihat Semua/Bayar/12. Bayar - Lainnya/04. EditText-Daftar Produk'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Lihat Semua/Bayar/12. Bayar - Lainnya/05. TextView-CT ARSA PEDULI BAKTI SOSIAL'), 
	'CT ARSA PEDULI BAKTI SOSIAL')

Mobile.verifyElementText(findTestObject('Object Repository/Lihat Semua/Bayar/12. Bayar - Lainnya/06. TextView-CT ARSA PEDULI BENCANA'), 
	'CT ARSA PEDULI BENCANA')

Mobile.verifyElementText(findTestObject('Object Repository/Lihat Semua/Bayar/12. Bayar - Lainnya/07. TextView-CT ARSA PEDULI PENDIDIKAN'),
	'CT ARSA PEDULI PENDIDIKAN')

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-LIHAT SEMUA - Bayar - Lainnya\\05.png')

Mobile.pressBack()

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-LIHAT SEMUA - Bayar - Lainnya\\06.png')

Mobile.pressBack()

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-LIHAT SEMUA - Bayar - Lainnya\\07.png')

Mobile.pressBack()

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-LIHAT SEMUA - Bayar - Lainnya\\08.png')

Mobile.closeApplication()