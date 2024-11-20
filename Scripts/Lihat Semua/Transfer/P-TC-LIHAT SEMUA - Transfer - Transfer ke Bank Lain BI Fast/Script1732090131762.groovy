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

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/Lihat Semua/Transfer/Transfer ke Bank Lain - BI Fast/01. ViewGroup - Lihat Semua'), 
    0)

Mobile.tap(findTestObject('Object Repository/Lihat Semua/Transfer/Transfer ke Bank Lain - BI Fast/02. ImageView - Transfer ke Bank Lain BI Fast'), 
    0)

Mobile.verifyElementText(findTestObject('Object Repository/Lihat Semua/Transfer/Transfer ke Bank Lain - BI Fast/03. TextView - verif Transfer BI Fast'), 
    'Transfer BI Fast')

Mobile.tap(findTestObject('Object Repository/Lihat Semua/Transfer/Transfer ke Bank Lain - BI Fast/04. SvgView - Cek Saldo'), 
    0)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/Lihat Semua/Transfer/Transfer ke Bank Lain - BI Fast/05. ViewGroup - Jenis Tujuan'), 
    0)

Mobile.verifyElementText(findTestObject('Object Repository/Lihat Semua/Transfer/Transfer ke Bank Lain - BI Fast/06. TextView - verif No Rekening'), 
    'No Rekening')

Mobile.verifyElementText(findTestObject('Object Repository/Lihat Semua/Transfer/Transfer ke Bank Lain - BI Fast/07. TextView - verif No Handphone'), 
    'No Handphone')

Mobile.verifyElementText(findTestObject('Object Repository/Lihat Semua/Transfer/Transfer ke Bank Lain - BI Fast/08. TextView - verif Email'), 
    'Email')

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/Lihat Semua/Transfer/Transfer ke Bank Lain - BI Fast/09. ViewGroup - Tap No Rekening'), 
    0)

Mobile.tap(findTestObject('Object Repository/Lihat Semua/Transfer/Transfer ke Bank Lain - BI Fast/10. TextView - Tap OK'), 
    0)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/Lihat Semua/Transfer/Transfer ke Bank Lain - BI Fast/11. TextView - No Rekening Tujuan'), 
    0)

Mobile.tap(findTestObject('Object Repository/Lihat Semua/Transfer/Transfer ke Bank Lain - BI Fast/12. EditText - Tap No Rek'), 
    0)

Mobile.setText(findTestObject('Object Repository/Lihat Semua/Transfer/Transfer ke Bank Lain - BI Fast/13. EditText - Set No Rek'), 
    '081801060326530', 0)

Mobile.hideKeyboard()

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/Lihat Semua/Transfer/Transfer ke Bank Lain - BI Fast/14. ViewGroup - Tap OK'), 
    0)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/Lihat Semua/Transfer/Transfer ke Bank Lain - BI Fast/15. TextView - Tap Bank Tujuan'), 
    0)

Mobile.tap(findTestObject('Object Repository/Lihat Semua/Transfer/Transfer ke Bank Lain - BI Fast/16. EditText - Tap Cari Nama Bank'), 
    0)

Mobile.takeScreenshot()

Mobile.setText(findTestObject('Object Repository/Lihat Semua/Transfer/Transfer ke Bank Lain - BI Fast/17. EditText - Set BRI'), 
    'BRI', 0)

Mobile.hideKeyboard()

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/Lihat Semua/Transfer/Transfer ke Bank Lain - BI Fast/18. TextView - BRI'), 
    0)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/Lihat Semua/Transfer/Transfer ke Bank Lain - BI Fast/19. EditText - Tap Nominal'), 
    0)

Mobile.takeScreenshot()

Mobile.setText(findTestObject('Object Repository/Lihat Semua/Transfer/Transfer ke Bank Lain - BI Fast/20. EditText - Set Nominal'), 
    '10000', 0)

Mobile.hideKeyboard()

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/Lihat Semua/Transfer/Transfer ke Bank Lain - BI Fast/21. TextView - Tap Pesan'), 
    0)

Mobile.takeScreenshot()

Mobile.setText(findTestObject('Object Repository/Lihat Semua/Transfer/Transfer ke Bank Lain - BI Fast/22. EditText - Set Pesan'), 
    'Test', 0)

Mobile.hideKeyboard()

Mobile.takeScreenshot()

Mobile.verifyElementText(findTestObject('Object Repository/Lihat Semua/Transfer/Transfer ke Bank Lain - BI Fast/23. TextView - verif No Rekening'), 
    'No Rekening')

Mobile.verifyElementText(findTestObject('Object Repository/Lihat Semua/Transfer/Transfer ke Bank Lain - BI Fast/24. TextView - verif 081801060326530'), 
    '081801060326530')

Mobile.verifyElementText(findTestObject('Object Repository/Lihat Semua/Transfer/Transfer ke Bank Lain - BI Fast/25. TextView - BRI'), 
    'BRI')

Mobile.verifyElementText(findTestObject('Object Repository/Lihat Semua/Transfer/Transfer ke Bank Lain - BI Fast/26. EditText - verif 10.000'), 
    '10.000')

Mobile.verifyElementText(findTestObject('Object Repository/Lihat Semua/Transfer/Transfer ke Bank Lain - BI Fast/27. TextView - Lainnya'), 
    'Lainnya')

Mobile.verifyElementText(findTestObject('Object Repository/Lihat Semua/Transfer/Transfer ke Bank Lain - BI Fast/28. EditText - verif Test'), 
    'Test')

Mobile.verifyElementText(findTestObject('Object Repository/Lihat Semua/Transfer/Transfer ke Bank Lain - BI Fast/29. TextView - Sekarang'), 
    'Sekarang')

Mobile.tap(findTestObject('Object Repository/Lihat Semua/Transfer/Transfer ke Bank Lain - BI Fast/30. ViewGroup - Tap Back Btn (Transfer BI Fast)'), 
    0)

Mobile.tap(findTestObject('Object Repository/Lihat Semua/Transfer/Transfer ke Bank Lain - BI Fast/31. ViewGroup - Tap Back Button (Lainnya)'), 
    0)

Mobile.closeApplication()

