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
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-LIHAT SEMUA - Transfer - ke Bank Lain - SKN\\01.png')

Mobile.tap(findTestObject('Object Repository/Lihat Semua/Transfer/Transfer ke Bank Lain-SKN/01. ViewGroup-Lihat Semua'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-LIHAT SEMUA - Transfer - ke Bank Lain - SKN\\02.png')

Mobile.tap(findTestObject('Object Repository/Lihat Semua/Transfer/Transfer ke Bank Lain-SKN/02. ImageView-Transfer ke Bank Lain-SKN'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-LIHAT SEMUA - Transfer - ke Bank Lain - SKN\\03.png')

Mobile.tap(findTestObject('Object Repository/Lihat Semua/Transfer/Transfer ke Bank Lain-SKN/03. EditText-Tap Norek'), 0)

Mobile.setText(findTestObject('Object Repository/Lihat Semua/Transfer/Transfer ke Bank Lain-SKN/04. EditText-Input Norek'), 
    '081801060326530', 0)

Mobile.hideKeyboard()

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-LIHAT SEMUA - Transfer - ke Bank Lain - SKN\\04.png')

Mobile.tap(findTestObject('Object Repository/Lihat Semua/Transfer/Transfer ke Bank Lain-SKN/05. ViewGroup-OK'), 0)

Mobile.tap(findTestObject('Object Repository/Lihat Semua/Transfer/Transfer ke Bank Lain-SKN/06. GroupView-Cek Saldo'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-LIHAT SEMUA - Transfer - ke Bank Lain - SKN\\05.png')

Mobile.tap(findTestObject('Object Repository/Lihat Semua/Transfer/Transfer ke Bank Lain-SKN/07. TextView-Bank Tujuan'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-LIHAT SEMUA - Transfer - ke Bank Lain - SKN\\06.png')

Mobile.tap(findTestObject('Object Repository/Lihat Semua/Transfer/Transfer ke Bank Lain-SKN/08. EditText-Tap Field Cari Nama Bank'), 0)

Mobile.setText(findTestObject('Object Repository/Lihat Semua/Transfer/Transfer ke Bank Lain-SKN/09. EditText-Set BRI'), 
    'BRI', 0)

Mobile.hideKeyboard()

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-LIHAT SEMUA - Transfer - ke Bank Lain - SKN\\07.png')

Mobile.tap(findTestObject('Object Repository/Lihat Semua/Transfer/Transfer ke Bank Lain-SKN/10. ViewGroup-Tap BRI'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-LIHAT SEMUA - Transfer - ke Bank Lain - SKN\\08.png')

Mobile.tap(findTestObject('Object Repository/Lihat Semua/Transfer/Transfer ke Bank Lain-SKN/11. EditText-Tap Nominal'), 0)

Mobile.setText(findTestObject('Object Repository/Lihat Semua/Transfer/Transfer ke Bank Lain-SKN/12. EditText-Set Nominal'), 
    '100000', 0)

Mobile.hideKeyboard()

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-LIHAT SEMUA - Transfer - ke Bank Lain - SKN\\09.png')

Mobile.tap(findTestObject('Object Repository/Lihat Semua/Transfer/Transfer ke Bank Lain-SKN/13. TextView-Tap Pesan'), 0)

Mobile.setText(findTestObject('Object Repository/Lihat Semua/Transfer/Transfer ke Bank Lain-SKN/14. EditText-Set Pesan'), 
    'Test', 0)

Mobile.hideKeyboard()

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-LIHAT SEMUA - Transfer - ke Bank Lain - SKN\\10.png')

Mobile.tap(findTestObject('Object Repository/Lihat Semua/Transfer/Transfer ke Bank Lain-SKN/15. TextView-Pilih Jenis'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-LIHAT SEMUA - Transfer - ke Bank Lain - SKN\\11.png')

Mobile.tap(findTestObject('Object Repository/Lihat Semua/Transfer/Transfer ke Bank Lain-SKN/16. ViewGroup-Perorangan'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-LIHAT SEMUA - Transfer - ke Bank Lain - SKN\\12.png')


Mobile.tap(findTestObject('Object Repository/Lihat Semua/Transfer/Transfer ke Bank Lain-SKN/17. TextView-OK'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-LIHAT SEMUA - Transfer - ke Bank Lain - SKN\\13.png')

Mobile.tap(findTestObject('Object Repository/Lihat Semua/Transfer/Transfer ke Bank Lain-SKN/18. ViewGroup-Tujuan Transaksi'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-LIHAT SEMUA - Transfer - ke Bank Lain - SKN\\14.png')

Mobile.tap(findTestObject('Object Repository/Lihat Semua/Transfer/Transfer ke Bank Lain-SKN/19. ViewGroup-Penduduk'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-LIHAT SEMUA - Transfer - ke Bank Lain - SKN\\15.png')

Mobile.tap(findTestObject('Object Repository/Lihat Semua/Transfer/Transfer ke Bank Lain-SKN/20. TextView-OK'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-LIHAT SEMUA - Transfer - ke Bank Lain - SKN\\16.png')

Mobile.tap(findTestObject('Object Repository/Lihat Semua/Transfer/Transfer ke Bank Lain-SKN/21. EditText-Tap Alamat'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-LIHAT SEMUA - Transfer - ke Bank Lain - SKN\\17.png')

Mobile.setText(findTestObject('Object Repository/Lihat Semua/Transfer/Transfer ke Bank Lain-SKN/22. EditText-Set Alamat'), 
    'Tangerang', 0)

Mobile.hideKeyboard()

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-LIHAT SEMUA - Transfer - ke Bank Lain - SKN\\18.png')

Mobile.verifyElementText(findTestObject('Object Repository/Lihat Semua/Transfer/Transfer ke Bank Lain-SKN/23. TextView-verif 081801060326530'), 
    '081801060326530')

Mobile.verifyElementText(findTestObject('Object Repository/Lihat Semua/Transfer/Transfer ke Bank Lain-SKN/24. TextView-verif BRI'), 
    'BRI')

Mobile.verifyElementText(findTestObject('Object Repository/Lihat Semua/Transfer/Transfer ke Bank Lain-SKN/25. EditText-verif 100.000'), 
    '100.000')

Mobile.verifyElementText(findTestObject('Object Repository/Lihat Semua/Transfer/Transfer ke Bank Lain-SKN/26. EditText-verif Test'), 
    'Test')

Mobile.verifyElementText(findTestObject('Object Repository/Lihat Semua/Transfer/Transfer ke Bank Lain-SKN/27. TextView-verif Perorangan'), 
    'Perorangan')

Mobile.verifyElementText(findTestObject('Object Repository/Lihat Semua/Transfer/Transfer ke Bank Lain-SKN/28. TextView-verif Penduduk'), 
    'Penduduk')

Mobile.verifyElementText(findTestObject('Object Repository/Lihat Semua/Transfer/Transfer ke Bank Lain-SKN/29. EditText-verif Tangerang'), 
    'Tangerang')

Mobile.pressBack()

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-LIHAT SEMUA - Transfer - ke Bank Lain - SKN\\19.png')

Mobile.pressBack()

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-LIHAT SEMUA - Transfer - ke Bank Lain - SKN\\20.png')

Mobile.pressBack()

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-LIHAT SEMUA - Transfer - ke Bank Lain - SKN\\21.png')

Mobile.closeApplication()

