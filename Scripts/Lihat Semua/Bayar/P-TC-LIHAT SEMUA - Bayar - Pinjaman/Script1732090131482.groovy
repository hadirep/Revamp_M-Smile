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
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-LIHAT SEMUA - Bayar - Pinjaman\\01.png')

Mobile.tap(findTestObject('Object Repository/Lihat Semua/Bayar/05. Bayar - Pinjaman/01. ViewGroup-Lihat Semua'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-LIHAT SEMUA - Bayar - Pinjaman\\02.png')

Mobile.scrollToText('Lainnya')

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-LIHAT SEMUA - Bayar - Pinjaman\\03.png')

Mobile.tap(findTestObject('Object Repository/Lihat Semua/Bayar/05. Bayar - Pinjaman/02. ViewGroup-Pinjaman'), 0)

Mobile.tap(findTestObject('Object Repository/Lihat Semua/Bayar/05. Bayar - Pinjaman/03. SvgView-Cek Saldo'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-LIHAT SEMUA - Bayar - Pinjaman\\04.png')

Mobile.tap(findTestObject('Object Repository/Lihat Semua/Bayar/05. Bayar - Pinjaman/04. EditText-Daftar Produk'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Lihat Semua/Bayar/05. Bayar - Pinjaman/05. TextView-BFI FINANCE'), 
	'BFI FINANCE')

Mobile.verifyElementText(findTestObject('Object Repository/Lihat Semua/Bayar/05. Bayar - Pinjaman/06. TextView-Wahana Ottomitra Multiartha'),
	'Wahana Ottomitra Multiartha')

Mobile.verifyElementText(findTestObject('Object Repository/Lihat Semua/Bayar/05. Bayar - Pinjaman/07. TextView-Mega Auto Finance (MAF)'), 
	'Mega Auto Finance (MAF)')

Mobile.verifyElementText(findTestObject('Object Repository/Lihat Semua/Bayar/05. Bayar - Pinjaman/08. TextView-Mega Central Finance (MCF)'), 
	'Mega Central Finance (MCF)')

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-LIHAT SEMUA - Bayar - Pinjaman\\05.png')

Mobile.pressBack()

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-LIHAT SEMUA - Bayar - Pinjaman\\06.png')

Mobile.pressBack()

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-LIHAT SEMUA - Bayar - Pinjaman\\07.png')

Mobile.pressBack()

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-LIHAT SEMUA - Bayar - Pinjaman\\08.png')


Mobile.closeApplication()