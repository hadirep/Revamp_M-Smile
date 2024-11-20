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
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-BAYAR - Kartu Kredit Bank Mega\\01.png')

Mobile.tap(findTestObject('Object Repository/Bayar/Kartu Kredit/Kartu Kredit Bank Mega/01. ViewGroup - Bayar'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-BAYAR - Kartu Kredit Bank Mega\\02.png')

Mobile.tap(findTestObject('Object Repository/Bayar/Kartu Kredit/Kartu Kredit Bank Mega/02. ViewGroup - Kartu Kredit'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-BAYAR - Kartu Kredit Bank Mega\\03.png')

Mobile.tap(findTestObject('Object Repository/Bayar/Kartu Kredit/Kartu Kredit Bank Mega/03. SvgView - Cek Saldo'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-BAYAR - Kartu Kredit Bank Mega\\04.png')

Mobile.tap(findTestObject('Object Repository/Bayar/Kartu Kredit/Kartu Kredit Bank Mega/04. EditText - Daftar Produk'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-BAYAR - Kartu Kredit Bank Mega\\05.png')

Mobile.tap(findTestObject('Object Repository/Bayar/Kartu Kredit/Kartu Kredit Bank Mega/05. TextView - CREDIT CARD MEGA'), 
    0)

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-BAYAR - Kartu Kredit Bank Mega\\06.png')

Mobile.tap(findTestObject('Object Repository/Bayar/Kartu Kredit/Kartu Kredit Bank Mega/06. EditText - Nomor Pelanggan'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-BAYAR - Kartu Kredit Bank Mega\\07.png')

Mobile.tap(findTestObject('Object Repository/Bayar/Kartu Kredit/Kartu Kredit Bank Mega/07. EditText - Input Baru'), 
    0)

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-BAYAR - Kartu Kredit Bank Mega\\08.png')

Mobile.setText(findTestObject('Object Repository/Bayar/Kartu Kredit/Kartu Kredit Bank Mega/07. EditText - Input Baru'), GlobalVariable.ccmega , 0)

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-BAYAR - Kartu Kredit Bank Mega\\08.png')

Mobile.tap(findTestObject('Object Repository/Bayar/Kartu Kredit/Kartu Kredit Bank Mega/08. ScrollView - Tap Body'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-BAYAR - Kartu Kredit Bank Mega\\09.png')

Mobile.tap(findTestObject('Object Repository/Transfer/Bayar/Kartu Kredit Bank Mega/09. ViewGroup - OK'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-BAYAR - Kartu Kredit Bank Mega\\10.png')

Mobile.tap(findTestObject('Object Repository/Bayar/Kartu Kredit/Kartu Kredit Bank Mega/10. ViewGroup - Lanjut'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-BAYAR - Kartu Kredit Bank Mega\\11.png')

Mobile.verifyElementText(findTestObject('Object Repository/Bayar/Kartu Kredit/Kartu Kredit Bank Mega/11. TextView - ANITA CHANDRA'), 'ANITA CHANDRA')

Mobile.verifyElementText(findTestObject('Object Repository/Bayar/Kartu Kredit/Kartu Kredit Bank Mega/12. TextView - 4201940050189378'), GlobalVariable.ccmega)

Mobile.tap(findTestObject('Object Repository/Bayar/Kartu Kredit/Kartu Kredit Bank Mega/13. EditText - Amount'), 0)

Mobile.delay(1)

Mobile.setText(findTestObject('Object Repository/Bayar/Kartu Kredit/Kartu Kredit Bank Mega/13. EditText - Amount'), '1000.000', 0)

Mobile.verifyElementText(findTestObject('Object Repository/Bayar/Kartu Kredit/Kartu Kredit Bank Mega/14. EditText - Amount 1.000.000'), '1.000.000')

Mobile.tap(findTestObject('Object Repository/Bayar/Kartu Kredit/Kartu Kredit Bank Mega/15. ScrollView - Tap Body Amount'), 0)

Mobile.delay(1)

Mobile.tap(findTestObject('Object Repository/Bayar/Kartu Kredit/Kartu Kredit Bank Mega/16. EditText - M-PIN'), 0)

Mobile.delay(1)

Mobile.setText(findTestObject('Object Repository/Bayar/Kartu Kredit/Kartu Kredit Bank Mega/16. EditText - M-PIN'), GlobalVariable.mpin, 0)

Mobile.tap(findTestObject('Object Repository/Bayar/Kartu Kredit/Kartu Kredit Bank Mega/17. ScrollView - Tap Body M-PIN'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-BAYAR - Kartu Kredit Bank Mega\\12.png')

Mobile.tap(findTestObject('Object Repository/Bayar/Kartu Kredit/Kartu Kredit Bank Mega/18. ViewGroup - Bayar'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Bayar/Kartu Kredit/Kartu Kredit Bank Mega/19. TextView - Pembayaran Berhasil'), 'Pembayaran Berhasil!')

Mobile.verifyElementText(findTestObject('Object Repository/Bayar/Kartu Kredit/Kartu Kredit Bank Mega/20. TextView - Pembayaran Berhasil Rp. 1.000.000'), 'Rp. 1.000.000')

Mobile.verifyElementText(findTestObject('Object Repository/Bayar/Kartu Kredit/Kartu Kredit Bank Mega/21. TextView - ANITA CHANDRA'), 'ANITA CHANDRA')

Mobile.verifyElementText(findTestObject('Object Repository/Bayar/Kartu Kredit/Kartu Kredit Bank Mega/22. TextView - Nominal Rp. 1.000.000'), 'Rp. 1.000.000')

Mobile.verifyElementText(findTestObject('Object Repository/Bayar/Kartu Kredit/Kartu Kredit Bank Mega/23. TextView - Biaya Admin Rp. 0'), 'Rp. 0')

Mobile.verifyElementText(findTestObject('Object Repository/Bayar/Kartu Kredit/Kartu Kredit Bank Mega/24. TextView - Total Transfer Rp. 1.000.000'), 'Rp. 1.000.000')

Mobile.tap(findTestObject('Object Repository/Bayar/Kartu Kredit/Kartu Kredit Bank Mega/26. ViewGroup - Bagikan'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-BAYAR - Kartu Kredit Bank Mega\\13.png')

Mobile.pressBack()

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-BAYAR - Kartu Kredit Bank Mega\\14.png')

Mobile.tapAtPosition(1140, 430)

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-BAYAR - Kartu Kredit Bank Mega\\15.png')

Mobile.closeApplication()

