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
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-LIHAT SEMUA - Transfer - ke Bank Lain - BI Fast\\01.png')

Mobile.tap(findTestObject('Object Repository/Lihat Semua/Transfer/Transfer ke Bank Lain - BI Fast/01. ViewGroup-Lihat Semua'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-LIHAT SEMUA - Transfer - ke Bank Lain - BI Fast\\02.png')

Mobile.tap(findTestObject('Object Repository/Lihat Semua/Transfer/Transfer ke Bank Lain - BI Fast/02. ImageView-Transfer ke Bank Lain BI Fast'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-LIHAT SEMUA - Transfer - ke Bank Lain - BI Fast\\03.png')

Mobile.tap(findTestObject('Object Repository/Lihat Semua/Transfer/Transfer ke Bank Lain - BI Fast/03. EditText-Tap No Rek'), 0)

Mobile.setText(findTestObject('Object Repository/Lihat Semua/Transfer/Transfer ke Bank Lain - BI Fast/04. EditText-Set No Rek'), 
    '081801060326530', 0)

Mobile.hideKeyboard()

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-LIHAT SEMUA - Transfer - ke Bank Lain - BI Fast\\04.png')

Mobile.tap(findTestObject('Object Repository/Lihat Semua/Transfer/Transfer ke Bank Lain - BI Fast/05. ViewGroup-Tap OK'),0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-LIHAT SEMUA - Transfer - ke Bank Lain - BI Fast\\05.png')

Mobile.tap(findTestObject('Object Repository/Lihat Semua/Transfer/Transfer ke Bank Lain - BI Fast/06. TextView-Tap Bank Tujuan'), 0)

Mobile.tap(findTestObject('Object Repository/Lihat Semua/Transfer/Transfer ke Bank Lain - BI Fast/07. EditText-Tap Cari Nama Bank'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-LIHAT SEMUA - Transfer - ke Bank Lain - BI Fast\\06.png')

Mobile.setText(findTestObject('Object Repository/Lihat Semua/Transfer/Transfer ke Bank Lain - BI Fast/08. EditText-Set BRI'), 
    'BRI', 0)

Mobile.hideKeyboard()

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-LIHAT SEMUA - Transfer - ke Bank Lain - BI Fast\\07.png')

Mobile.tap(findTestObject('Object Repository/Lihat Semua/Transfer/Transfer ke Bank Lain - BI Fast/09. TextView-BRI'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-LIHAT SEMUA - Transfer - ke Bank Lain - BI Fast\\08.png')

Mobile.tap(findTestObject('Object Repository/Lihat Semua/Transfer/Transfer ke Bank Lain - BI Fast/10. EditText-Tap Nominal'), 0)

Mobile.setText(findTestObject('Object Repository/Lihat Semua/Transfer/Transfer ke Bank Lain - BI Fast/11. EditText-Set Nominal'), 
    '10000', 0)

Mobile.hideKeyboard()

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-LIHAT SEMUA - Transfer - ke Bank Lain - BI Fast\\09.png')

Mobile.tap(findTestObject('Object Repository/Lihat Semua/Transfer/Transfer ke Bank Lain - BI Fast/12. TextView-Tap Pesan'), 0)

Mobile.setText(findTestObject('Object Repository/Lihat Semua/Transfer/Transfer ke Bank Lain - BI Fast/13. EditText-Set Pesan'), 
    'Test', 0)

Mobile.hideKeyboard()

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-LIHAT SEMUA - Transfer - ke Bank Lain - BI Fast\\10.png')

Mobile.verifyElementText(findTestObject('Object Repository/Lihat Semua/Transfer/Transfer ke Bank Lain - BI Fast/14. TextView-verif No Rekening'), 
    'No Rekening')

Mobile.verifyElementText(findTestObject('Object Repository/Lihat Semua/Transfer/Transfer ke Bank Lain - BI Fast/15. TextView-verif 081801060326530'), 
    '081801060326530')

Mobile.verifyElementText(findTestObject('Object Repository/Lihat Semua/Transfer/Transfer ke Bank Lain - BI Fast/16. TextView-verif BRI'), 
    'BRI')

Mobile.verifyElementText(findTestObject('Object Repository/Lihat Semua/Transfer/Transfer ke Bank Lain - BI Fast/17. EditText-verif 10.000'), 
    '10.000')

Mobile.verifyElementText(findTestObject('Object Repository/Lihat Semua/Transfer/Transfer ke Bank Lain - BI Fast/18. TextView-Lainnya'), 
    'Lainnya')

Mobile.verifyElementText(findTestObject('Object Repository/Lihat Semua/Transfer/Transfer ke Bank Lain - BI Fast/19. EditText-verif Test'), 
    'Test')

Mobile.verifyElementText(findTestObject('Object Repository/Lihat Semua/Transfer/Transfer ke Bank Lain - BI Fast/20. TextView-Sekarang'), 
    'Sekarang')

Mobile.pressBack()

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-LIHAT SEMUA - Transfer - ke Bank Lain - BI Fast\\11.png')

Mobile.pressBack()

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-LIHAT SEMUA - Transfer - ke Bank Lain - BI Fast\\12.png')

Mobile.pressBack()

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-LIHAT SEMUA - Transfer - ke Bank Lain - BI Fast\\13.png')

Mobile.closeApplication()

