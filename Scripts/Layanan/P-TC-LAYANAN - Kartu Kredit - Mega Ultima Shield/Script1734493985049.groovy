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
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-LAYANAN - Kartu Kredit - Mega Ultima Shield\\01.png')

Mobile.tap(findTestObject('Object Repository/Layanan/Kartu Kredit/Mega Ultima Shield/01. ViewGroup-Layanan'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-LAYANAN - Kartu Kredit - Mega Ultima Shield\\02.png')

Mobile.tap(findTestObject('Object Repository/Layanan/Kartu Kredit/Mega Ultima Shield/02. RectView-Mega Ultima Shield'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-LAYANAN - Kartu Kredit - Mega Ultima Shield\\03.png')

Mobile.tap(findTestObject('Object Repository/Layanan/Kartu Kredit/Mega Ultima Shield/03. ViewGroup-Tentang Perusahaan Asuransi'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-LAYANAN - Kartu Kredit - Mega Ultima Shield\\04.png')

Mobile.tap(findTestObject('Object Repository/Layanan/Kartu Kredit/Mega Ultima Shield/03. ViewGroup-Tentang Perusahaan Asuransi'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-LAYANAN - Kartu Kredit - Mega Ultima Shield\\05.png')

Mobile.tap(findTestObject('Object Repository/Layanan/Kartu Kredit/Mega Ultima Shield/04. ViewGroup-Manfaat Produk, Uang Pertanggungan dan Premi'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-LAYANAN - Kartu Kredit - Mega Ultima Shield\\06.png')

Mobile.scrollToText('Major Organ Failure')

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-LAYANAN - Kartu Kredit - Mega Ultima Shield\\07.png')

Mobile.scrollToText('Manfaat Produk, Uang Pertanggungan & Premi')

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-LAYANAN - Kartu Kredit - Mega Ultima Shield\\08.png')

Mobile.tap(findTestObject('Object Repository/Layanan/Kartu Kredit/Mega Ultima Shield/04. ViewGroup-Manfaat Produk, Uang Pertanggungan dan Premi'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-LAYANAN - Kartu Kredit - Mega Ultima Shield\\09png')

Mobile.tap(findTestObject('Object Repository/Layanan/Kartu Kredit/Mega Ultima Shield/05. ViewGroup-Rincian Produk'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-LAYANAN - Kartu Kredit - Mega Ultima Shield\\10.png')

Mobile.scrollToText('Cara Pembayaran Premi')

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-LAYANAN - Kartu Kredit - Mega Ultima Shield\\11.png')

Mobile.tap(findTestObject('Object Repository/Layanan/Kartu Kredit/Mega Ultima Shield/05. ViewGroup-Rincian Produk'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-LAYANAN - Kartu Kredit - Mega Ultima Shield\\12.png')

Mobile.tap(findTestObject('Object Repository/Layanan/Kartu Kredit/Mega Ultima Shield/06. ViewGroup-Untuk Diperhatikan'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-LAYANAN - Kartu Kredit - Mega Ultima Shield\\13.png')

Mobile.scrollToText('Otoritas Jasa Keuangan')

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-LAYANAN - Kartu Kredit - Mega Ultima Shield\\14.png')

Mobile.scrollToText('Untuk Diperhatikan')

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-LAYANAN - Kartu Kredit - Mega Ultima Shield\\15.png')

Mobile.tap(findTestObject('Object Repository/Layanan/Kartu Kredit/Mega Ultima Shield/06. ViewGroup-Untuk Diperhatikan'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-LAYANAN - Kartu Kredit - Mega Ultima Shield\\16.png')

Mobile.tap(findTestObject('Object Repository/Layanan/Kartu Kredit/Mega Ultima Shield/07. ViewGroup-Lanjut'), 0)

Mobile.tap(findTestObject('Object Repository/Layanan/Kartu Kredit/Mega Ultima Shield/08. ImageView-Centang Usia'), 0)

Mobile.tap(findTestObject('Object Repository/Layanan/Kartu Kredit/Mega Ultima Shield/09. ImageView-Centang No Kartu'), 0)

Mobile.tap(findTestObject('Object Repository/Layanan/Kartu Kredit/Mega Ultima Shield/10. ImageView-Centang SnK'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-LAYANAN - Kartu Kredit - Mega Ultima Shield\\17.png')

Mobile.tap(findTestObject('Object Repository/Layanan/Kartu Kredit/Mega Ultima Shield/11. ViewGroup-Pilih Produk'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-LAYANAN - Kartu Kredit - Mega Ultima Shield\\18.png')

Mobile.closeApplication()

