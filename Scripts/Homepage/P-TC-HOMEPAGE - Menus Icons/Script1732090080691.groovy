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
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-HOMEPAGE - Menus Icons\\01.png')

Mobile.tap(findTestObject('Object Repository/Homepage/Menu - Icons/com.horcrux.svg.SvgView'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-HOMEPAGE - Menus Icons\\02.png')

Mobile.tap(findTestObject('Object Repository/Homepage/Menu - Icons/SvgView - Inbox'), 0)
Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-HOMEPAGE - Menus Icons\\03.png')

Mobile.tap(findTestObject('Object Repository/Homepage/Menu - Icons/ViewGroup - Inbox'), 0)
Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-HOMEPAGE - Menus Icons\\04.png')

Mobile.tap(findTestObject('Object Repository/Homepage/Menu - Icons/ImageView - QRIS'), 0)
Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-HOMEPAGE - Menus Icons\\05.png')

Mobile.tap(findTestObject('Object Repository/Homepage/Menu - Icons/ViewGroup - QRIS'), 0)
Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-HOMEPAGE - Menus Icons\\06.png')

Mobile.tap(findTestObject('Object Repository/Homepage/Menu - Icons/ImageView - Top Up'), 0)
Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-HOMEPAGE - Menus Icons\\07.png')

Mobile.tap(findTestObject('Object Repository/Homepage/Menu - Icons/ViewGroup - Inbox'), 0)
Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-HOMEPAGE - Menus Icons\\08.png')

Mobile.tap(findTestObject('Object Repository/Homepage/Menu - Icons/ImageView - Bayar'), 0)
Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-HOMEPAGE - Menus Icons\\09.png')

Mobile.tap(findTestObject('Object Repository/Homepage/Menu - Icons/ViewGroup - Bayar'), 0)
Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-HOMEPAGE - Menus Icons\\10.png')

Mobile.tap(findTestObject('Object Repository/Homepage/Menu - Icons/ImageView - Transfer'), 0)
Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-HOMEPAGE - Menus Icons\\11.png')

Mobile.tap(findTestObject('Object Repository/Homepage/Menu - Icons/ViewGroup - Transfer'), 0)
Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-HOMEPAGE - Menus Icons\\12.png')

Mobile.tap(findTestObject('Object Repository/Homepage/Menu - Icons/ImageView - Tarik Tunai'), 0)
Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-HOMEPAGE - Menus Icons\\13.png')

Mobile.tap(findTestObject('Object Repository/Homepage/Menu - Icons/ViewGroup - Tarik Tunai'), 0)
Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-HOMEPAGE - Menus Icons\\14.png')

Mobile.tap(findTestObject('Object Repository/Homepage/Menu - Icons/ImageView - Akun Saya'), 0)
Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-HOMEPAGE - Menus Icons\\15.png')

Mobile.tap(findTestObject('Object Repository/Homepage/Menu - Icons/ViewGroup - Akun Saya'), 0)
Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-HOMEPAGE - Menus Icons\\16.png')

Mobile.tap(findTestObject('Object Repository/Homepage/Menu - Icons/ImageView - Layanan'), 0)
Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-HOMEPAGE - Menus Icons\\17.png')

Mobile.tap(findTestObject('Object Repository/Homepage/Menu - Icons/ViewGroup - Layanan'), 0)
Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-HOMEPAGE - Menus Icons\\18.png')

Mobile.tap(findTestObject('Object Repository/Homepage/Menu - Icons/ImageView - Investasi'), 0)
Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-HOMEPAGE - Menus Icons\\19.png')

Mobile.tap(findTestObject('Object Repository/Homepage/Menu - Icons/ViewGroup - Investasi'), 0)
Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-HOMEPAGE - Menus Icons\\20.png')

Mobile.tap(findTestObject('Object Repository/Homepage/Menu - Icons/ImageView - Apply'), 0)
Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-HOMEPAGE - Menus Icons\\21.png')

Mobile.tap(findTestObject('Object Repository/Homepage/Menu - Icons/ViewGroup - Apply'), 0)
Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-HOMEPAGE - Menus Icons\\22.png')

Mobile.tap(findTestObject('Object Repository/Homepage/Menu - Icons/ImageView - Financial Dashboard'), 0)
Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-HOMEPAGE - Menus Icons\\23.png')

Mobile.tap(findTestObject('Object Repository/Homepage/Menu - Icons/Button - OK'), 0)
Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-HOMEPAGE - Menus Icons\\24.png')

Mobile.tap(findTestObject('Object Repository/Homepage/Menu - Icons/ImageView - Tap to Pay'), 0)
Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-HOMEPAGE - Menus Icons\\25.png')

Mobile.tap(findTestObject('Object Repository/Homepage/Menu - Icons/Button - OK'), 0)
Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-HOMEPAGE - Menus Icons\\26.png')

Mobile.tap(findTestObject('Object Repository/Homepage/Menu - Icons/ImageView - Lihat Semua'), 0)
Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-HOMEPAGE - Menus Icons\\27.png')

Mobile.tap(findTestObject('Object Repository/Homepage/Menu - Icons/ViewGroup - Lihat Semua'), 0)
Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-HOMEPAGE - Menus Icons\\28.png')

Mobile.tap(findTestObject('Object Repository/Homepage/Menu - Icons/TextView - Lihat Semua'), 0)
Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-HOMEPAGE - Menus Icons\\29.png')

Mobile.tap(findTestObject('Object Repository/Homepage/Menu - Icons/ViewGroup - Hightlights Lihat Semua'), 0)
Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-HOMEPAGE - Menus Icons\\30.png')

Mobile.scrollToText('Lokasi ATM & Cabang')
Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-HOMEPAGE - Menus Icons\\31.png')

Mobile.tap(findTestObject('Object Repository/Homepage/Menu - Icons/TextView - Lokasi ATM  Cabang'), 0)
Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-HOMEPAGE - Menus Icons\\32.png')

Mobile.tap(findTestObject('Object Repository/Homepage/Menu - Icons/ViewGroup - Lokasi ATM Terdekat'), 0)
Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-HOMEPAGE - Menus Icons\\33.png')

Mobile.tap(findTestObject('Object Repository/Homepage/Menu - Icons/TextView - Kurs Valuta Asing'), 0)
Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-HOMEPAGE - Menus Icons\\34.png')

Mobile.tap(findTestObject('Object Repository/Homepage/Menu - Icons/ViewGroup - Lokasi ATM Terdekat'), 0)
Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-HOMEPAGE - Menus Icons\\35.png')

Mobile.tap(findTestObject('Object Repository/Homepage/Menu - Icons/TextView - Suku Bunga'), 0)
Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-HOMEPAGE - Menus Icons\\36.png')

Mobile.tap(findTestObject('Object Repository/Homepage/Menu - Icons/ViewGroup - Lokasi ATM Terdekat'), 0)
Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-HOMEPAGE - Menus Icons\\37.png')

Mobile.tap(findTestObject('Object Repository/Homepage/Menu - Icons/Button - Promo'), 0)
Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-HOMEPAGE - Menus Icons\\38.png')

Mobile.tap(findTestObject('Object Repository/Homepage/Menu - Icons/Button - Explore'), 0)
Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-HOMEPAGE - Menus Icons\\39.png')

Mobile.tap(findTestObject('Object Repository/Homepage/Menu - Icons/Button - Bantuan'), 0)
Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-HOMEPAGE - Menus Icons\\40.png')

Mobile.tap(findTestObject('Object Repository/Homepage/Menu - Icons/Button - Atur'), 0)
Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-HOMEPAGE - Menus Icons\\41.png')

Mobile.tap(findTestObject('Object Repository/Homepage/Menu - Icons/Button - Home'), 0)
Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-HOMEPAGE - Menus Icons\\42.png')

Mobile.closeApplication()

