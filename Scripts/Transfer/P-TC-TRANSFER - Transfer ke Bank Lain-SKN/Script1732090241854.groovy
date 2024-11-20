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
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-TRANSFER - Transfer Ke Bank Lain-SKN\\01.png')

Mobile.tap(findTestObject('Object Repository/Transfer/Transfer - SKN/01. ViewGroup-Transfer'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-TRANSFER - Transfer Ke Bank Lain-SKN\\02.png')

Mobile.tap(findTestObject('Object Repository/Transfer/Transfer - SKN/02. ViewGroup-Transfer ke Bank Lain-SKN'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-TRANSFER - Transfer Ke Bank Lain-SKN\\03.png')

Mobile.tap(findTestObject('Object Repository/Transfer/Transfer - SKN/03. EditText-Tap Norek'), 0)

Mobile.setText(findTestObject('Object Repository/Transfer/Transfer - SKN/04. EditText-Set Norek'), '81801060326530', 0)

Mobile.hideKeyboard()

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-TRANSFER - Transfer Ke Bank Lain-SKN\\04.png')

Mobile.tap(findTestObject('Object Repository/Transfer/Transfer - SKN/05. ViewGroup-OK'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-TRANSFER - Transfer Ke Bank Lain-SKN\\05.png')

Mobile.tap(findTestObject('Object Repository/Transfer/Transfer - SKN/06. SvgView-Cek Saldo'), 0)

Mobile.tap(findTestObject('Object Repository/Transfer/Transfer - SKN/07. ViewGroup-Bank Tujuan'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-TRANSFER - Transfer Ke Bank Lain-SKN\\06.png')

Mobile.tap(findTestObject('Object Repository/Transfer/Transfer - SKN/08. EditText-Tap Field Cari Nama Bank'), 0)

Mobile.setText(findTestObject('Object Repository/Transfer/Transfer - SKN/09. EditText-Set Cari Nama Bank'), 'BRI', 0)

Mobile.hideKeyboard()

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-TRANSFER - Transfer Ke Bank Lain-SKN\\07.png')

Mobile.tap(findTestObject('Object Repository/Transfer/Transfer - SKN/10. RadioButton-BRI'), 0)

Mobile.tap(findTestObject('Object Repository/Transfer/Transfer - SKN/11. EditText-Tap Nominal'), 0)

Mobile.setText(findTestObject('Object Repository/Transfer/Transfer - SKN/12. EditText-Set Nominal'), '100.000', 0)

Mobile.hideKeyboard()

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-TRANSFER - Transfer Ke Bank Lain-SKN\\08.png')

Mobile.tap(findTestObject('Object Repository/Transfer/Transfer - SKN/13. EditText-Tap Pesan'), 0)

Mobile.setText(findTestObject('Object Repository/Transfer/Transfer - SKN/14. EditText-Set Pesan'), 'Test', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/Transfer/Transfer - SKN/15. ViewGroup-Jenis Nasabah Penerima'), 0)

Mobile.tap(findTestObject('Object Repository/Transfer/Transfer - SKN/16. RadioButton-Perorangan'), 0)

Mobile.tap(findTestObject('Object Repository/Transfer/Transfer - SKN/17. ViewGroup-OK'), 0)

Mobile.tap(findTestObject('Object Repository/Transfer/Transfer - SKN/18. ViewGroup-Pilih Status'), 0)

Mobile.tap(findTestObject('Object Repository/Transfer/Transfer - SKN/19. RadioButton-Penduduk'), 0)

Mobile.tap(findTestObject('Object Repository/Transfer/Transfer - SKN/20. TextView - OK'), 0)

Mobile.tap(findTestObject('Object Repository/Transfer/Transfer - SKN/21. TextView - Alamat Penerima'), 0)

Mobile.setText(findTestObject('Object Repository/Transfer/Transfer - SKN/22. EditText-Tangerang'), 'Tangerang', 0)

Mobile.hideKeyboard()

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-TRANSFER - Transfer Ke Bank Lain-SKN\\09.png')

Mobile.tap(findTestObject('Object Repository/Transfer/Transfer - SKN/23. ViewGroup-Lanjut'), 0)

Mobile.tap(findTestObject('Object Repository/Transfer/Transfer - SKN/24. TextView-Tap Masukan M-PIN Anda'), 0)

Mobile.setText(findTestObject('Object Repository/Transfer/Transfer - SKN/25. EditText-Set M-PIN'), '111111', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/Transfer/Transfer - SKN/26. SvgView-Cek M-PIN'), 0)

Mobile.tap(findTestObject('Object Repository/Transfer/Transfer - SKN/27. ViewGroup-Lanjut'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Transfer/Transfer - SKN/28. TextView-verif YOPI TRIYANA'), 'YOPI TRIYANA')

Mobile.verifyElementText(findTestObject('Object Repository/Transfer/Transfer - SKN/29. TextView-verif Tangerang'), 'Tangerang')

Mobile.verifyElementText(findTestObject('Object Repository/Transfer/Transfer - SKN/30. TextView-verif Perorangan'), 'Perorangan')

Mobile.verifyElementText(findTestObject('Object Repository/Transfer/Transfer - SKN/31. TextView-verif Penduduk'), 'Penduduk')

Mobile.verifyElementText(findTestObject('Object Repository/Transfer/Transfer - SKN/32. TextView-verif Test'), 'Test')

Mobile.verifyElementText(findTestObject('Object Repository/Transfer/Transfer - SKN/33. TextView-verif nominal Rp. 100.000'), 
    'Rp. 100.000')

Mobile.verifyElementText(findTestObject('Object Repository/Transfer/Transfer - SKN/34. TextView-verif adm Rp. 2.900'), 
	'Rp. 2.900')

Mobile.verifyElementText(findTestObject('Object Repository/Transfer/Transfer - SKN/35. TextView-verif total Rp. 102.900'), 
    'Rp. 102.900')

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-TRANSFER - Transfer Ke Bank Lain-SKN\\10.png')

Mobile.tap(findTestObject('Object Repository/Transfer/Transfer - SKN/36. ViewGroup-Bagikan'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-TRANSFER - Transfer Ke Bank Lain-SKN\\11.png')

Mobile.pressBack()

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-TRANSFER - Transfer Ke Bank Lain-SKN\\12.png')

Mobile.tap(findTestObject('Object Repository/Transfer/Transfer - SKN/43. GroupView-Close Button'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-TRANSFER - Transfer Ke Bank Lain-SKN\\13.png')

Mobile.closeApplication()

