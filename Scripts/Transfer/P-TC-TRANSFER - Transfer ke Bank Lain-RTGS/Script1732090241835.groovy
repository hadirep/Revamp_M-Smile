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
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-TRANSFER - Transfer Ke Bank Lain-RTGS\\01.png')

Mobile.tap(findTestObject('Object Repository/Transfer/Transfer - RTGS/01. ViewGroup-Transfer'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-TRANSFER - Transfer Ke Bank Lain-RTGS\\02.png')

Mobile.tap(findTestObject('Object Repository/Transfer/Transfer - RTGS/02. ViewGroup-Transfer ke Bank Lain-RTGS'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-TRANSFER - Transfer Ke Bank Lain-RTGS\\03.png')

Mobile.tap(findTestObject('Object Repository/Transfer/Transfer - RTGS/03. EditText-Tap Norek'), 0)

Mobile.setText(findTestObject('Object Repository/Transfer/Transfer - RTGS/04. EditText-Set Norek'), '81801060326530', 0)

Mobile.hideKeyboard()

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-TRANSFER - Transfer Ke Bank Lain-RTGS\\04.png')

Mobile.tap(findTestObject('Object Repository/Transfer/Transfer - RTGS/05. ViewGroup-OK'), 0)

Mobile.tap(findTestObject('Object Repository/Transfer/Transfer - RTGS/06. SvgView-Cek Saldo'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-TRANSFER - Transfer Ke Bank Lain-RTGS\\05.png')

Mobile.tap(findTestObject('Object Repository/Transfer/Transfer - RTGS/07. ViewGroup-Tap Bank Tujuan'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-TRANSFER - Transfer Ke Bank Lain-RTGS\\06.png')

Mobile.tap(findTestObject('Object Repository/Transfer/Transfer - RTGS/08. EditText-Tap Cari Bank'), 0)

Mobile.setText(findTestObject('Object Repository/Transfer/Transfer - RTGS/09. EditText-Set Cari Bank'), 'BRI', 0)

Mobile.hideKeyboard()

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-TRANSFER - Transfer Ke Bank Lain-RTGS\\07.png')

Mobile.tap(findTestObject('Object Repository/Transfer/Transfer - RTGS/10. ViewGroup-BRI'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-TRANSFER - Transfer Ke Bank Lain-RTGS\\08.png')

Mobile.tap(findTestObject('Object Repository/Transfer/Transfer - RTGS/11. ViewGroup-Kota Bank Tujuan'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-TRANSFER - Transfer Ke Bank Lain-RTGS\\09.png')

Mobile.tap(findTestObject('Object Repository/Transfer/Transfer - RTGS/12. EditText-Tap Cari Kota'), 0)

Mobile.setText(findTestObject('Object Repository/Transfer/Transfer - RTGS/13. EditText-Set Cari Kota'), 'Jakarta', 0)

Mobile.hideKeyboard()

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-TRANSFER - Transfer Ke Bank Lain-RTGS\\10.png')

Mobile.tap(findTestObject('Object Repository/Transfer/Transfer - RTGS/14. TextView-JAKARTA'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-TRANSFER - Transfer Ke Bank Lain-RTGS\\11.png')

Mobile.tap(findTestObject('Object Repository/Transfer/Transfer - RTGS/15. EditText-Tap Nominal'), 0)

Mobile.setText(findTestObject('Object Repository/Transfer/Transfer - RTGS/16. EditText-Set Nominal'), '100000', 0)

Mobile.hideKeyboard()

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-TRANSFER - Transfer Ke Bank Lain-RTGS\\12.png')

Mobile.tap(findTestObject('Object Repository/Transfer/Transfer - RTGS/17. TextView-Tap Pesan'), 0)

Mobile.setText(findTestObject('Object Repository/Transfer/Transfer - RTGS/18. EditText-Set Pesan'), 'Test', 0)

Mobile.hideKeyboard()

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-TRANSFER - Transfer Ke Bank Lain-RTGS\\13.png')

Mobile.tap(findTestObject('Object Repository/Transfer/Transfer - RTGS/19. TextView-Tap Jenis Nasabah Penerima'), 
    0)

Mobile.tap(findTestObject('Object Repository/Transfer/Transfer - RTGS/20. TextView-Perorangan'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-TRANSFER - Transfer Ke Bank Lain-RTGS\\14.png')

Mobile.tap(findTestObject('Object Repository/Transfer/Transfer - RTGS/21. TextView-Status Nasabah Penerima'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-TRANSFER - Transfer Ke Bank Lain-RTGS\\15.png')

Mobile.tap(findTestObject('Object Repository/Transfer/Transfer - RTGS/22. ViewGroup-Penduduk'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-TRANSFER - Transfer Ke Bank Lain-RTGS\\16.png')

Mobile.tap(findTestObject('Object Repository/Transfer/Transfer - RTGS/23. ViewGroup-Kota Penerima'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-TRANSFER - Transfer Ke Bank Lain-RTGS\\17.png')

Mobile.tap(findTestObject('Object Repository/Transfer/Transfer - RTGS/24. EditText-Tap Cari Kota'), 0)

Mobile.setText(findTestObject('Object Repository/Transfer/Transfer - RTGS/25. EditText-Set Cari Kota'), 'Jakarta', 
    0)

Mobile.hideKeyboard()

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-TRANSFER - Transfer Ke Bank Lain-RTGS\\18.png')

Mobile.tap(findTestObject('Object Repository/Transfer/Transfer - RTGS/26. TextView-JAKARTA'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-TRANSFER - Transfer Ke Bank Lain-RTGS\\19.png')

Mobile.tap(findTestObject('Object Repository/Transfer/Transfer - RTGS/27. EditText-Alamat Penerima'), 0)

Mobile.setText(findTestObject('Object Repository/Transfer/Transfer - RTGS/28. EditText-Set Alamat'), 'Jakarta', 0)

Mobile.hideKeyboard()

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-TRANSFER - Transfer Ke Bank Lain-RTGS\\20.png')

Mobile.tap(findTestObject('Object Repository/Transfer/Transfer - RTGS/29. ViewGroup-Lanjut'), 0)

Mobile.tap(findTestObject('Object Repository/Transfer/Transfer - RTGS/30. TextView-Tap M-PIN'), 0)

Mobile.setText(findTestObject('Object Repository/Transfer/Transfer - RTGS/31. EditText-Set M-PIN'), '111111', 0)

Mobile.hideKeyboard()

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-TRANSFER - Transfer Ke Bank Lain-RTGS\\21.png')

Mobile.tap(findTestObject('Object Repository/Transfer/Transfer - RTGS/32. ViewGroup-Lanjut'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Transfer/Transfer - RTGS/33. TextView-verif Transaksi Dalam Proses'), 
    'Transaksi Dalam Proses')

Mobile.verifyElementText(findTestObject('Object Repository/Transfer/Transfer - RTGS/34. TextView-verif Rp. 125.000'), 
	'Rp. 125.000')

Mobile.verifyElementText(findTestObject('Object Repository/Transfer/Transfer - RTGS/35. TextView-verif YOPI TRIYANA'), 
	'YOPI TRIYANA')

Mobile.verifyElementText(findTestObject('Object Repository/Transfer/Transfer - RTGS/36. TextView-verif Jakarta'), 
	'Jakarta')

Mobile.verifyElementText(findTestObject('Object Repository/Transfer/Transfer - RTGS/37. TextView-verif Perorangan'), 
	'Perorangan')

Mobile.verifyElementText(findTestObject('Object Repository/Transfer/Transfer - RTGS/38. TextView-verif Penduduk'), 
	'Penduduk')

Mobile.verifyElementText(findTestObject('Object Repository/Transfer/Transfer - RTGS/39. TextView-verif Test'), 
	'Test')

Mobile.verifyElementText(findTestObject('Object Repository/Transfer/Transfer - RTGS/40. TextView-verif Rp. 100.000'), 
	'Rp. 100.000')

Mobile.verifyElementText(findTestObject('Object Repository/Transfer/Transfer - RTGS/41. TextView-verif Rp. 25.000'), 
	'Rp. 25.000')

Mobile.verifyElementText(findTestObject('Object Repository/Transfer/Transfer - RTGS/42. TextView-verif Rp. 125.000'), 
	'Rp. 125.000')

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-TRANSFER - Transfer Ke Bank Lain-RTGS\\22.png')

Mobile.tap(findTestObject('Object Repository/Transfer/Transfer - RTGS/43. ViewGroup-Bagikan'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-TRANSFER - Transfer Ke Bank Lain-RTGS\\23.png')

Mobile.pressBack()

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-TRANSFER - Transfer Ke Bank Lain-RTGS\\24.png')

Mobile.tap(findTestObject('Object Repository/Transfer/Transfer - RTGS/50. GroupView-Close Button'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-TRANSFER - Transfer Ke Bank Lain-RTGS\\25.png')

Mobile.pressBack()

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-TRANSFER - Transfer Ke Bank Lain-RTGS\\26.png')

Mobile.closeApplication()