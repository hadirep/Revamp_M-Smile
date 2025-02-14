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
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-APPLY NTB - Kartu Kredit\\01.png')

Mobile.tap(findTestObject('Object Repository/Apply NTB/Kartu Kredit/01. TextView-REGISTRASI'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-APPLY NTB - Kartu Kredit\\02.png')

Mobile.tap(findTestObject('Object Repository/Apply NTB/Kartu Kredit/02. ViewGroup-Belum'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-APPLY NTB - Kartu Kredit\\03.png')

Mobile.tap(findTestObject('Object Repository/Apply NTB/Kartu Kredit/03. ViewGroup-Kartu Kredit'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-APPLY NTB - Kartu Kredit\\04.png')

Mobile.tap(findTestObject('Object Repository/Apply NTB/Kartu Kredit/04. ViewGroup-Pilih'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-APPLY NTB - Kartu Kredit\\05.png')

Mobile.tap(findTestObject('Object Repository/Apply NTB/Kartu Kredit/05. TextView-Nomor Handphone'), 0)

Mobile.setText(findTestObject('Object Repository/Apply NTB/Kartu Kredit/06. EditText-Input no HP'), '085770056083', 0)

Mobile.pressBack()

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-APPLY NTB - Kartu Kredit\\06.png')

Mobile.tap(findTestObject('Object Repository/Apply NTB/Kartu Kredit/07. ViewGroup-Ambil Foto'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-APPLY NTB - Kartu Kredit\\07.png')

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-APPLY NTB - Kartu Kredit\\08.png')

Mobile.scrollToText('LANJUT')

Mobile.tap(findTestObject('Object Repository/Apply NTB/Kartu Kredit/08. ImageView-Centang SnK'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-APPLY NTB - Kartu Kredit\\09.png')

Mobile.tap(findTestObject('Object Repository/Apply NTB/Kartu Kredit/09. ViewGroup-Lanjut'), 0)

Mobile.tap(findTestObject('Object Repository/Apply NTB/Kartu Kredit/10. ViewGroup-Tap Ibu Kandung'), 0)

Mobile.setText(findTestObject('Object Repository/Apply NTB/Kartu Kredit/11. EditText-Set Ibu Kandung'), 'Neneng Nurhayati', 0)

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/Apply NTB/Kartu Kredit/12. EditText-Tap Email'), 0)

Mobile.setText(findTestObject('Object Repository/Apply NTB/Kartu Kredit/13. EditText-Set Email'), 'hadiesarahma@gmail.com', 0)

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/Apply NTB/Kartu Kredit/14. EditText-Tap Nama Kontak Darurat'), 0)

Mobile.pressBack()

Mobile.setText(findTestObject('Object Repository/Apply NTB/Kartu Kredit/15. EditText-Set Nama Kontrak Darurat'), 'Eva Nopalia', 0)

Mobile.tap(findTestObject('Object Repository/Apply NTB/Kartu Kredit/16. ViewGroup-Tap No Kontrak Darurat'), 0)

Mobile.setText(findTestObject('Object Repository/Apply NTB/Kartu Kredit/17. EditText-Set No Kontak Darurat'), '081382400627', 0)

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/Apply NTB/Kartu Kredit/18. CheckBox-Centang SnK'), 0)

Mobile.tap(findTestObject('Object Repository/Apply NTB/Kartu Kredit/19. CheckBox-Centang Penawaran'), 0)

Mobile.scrollToText('Nama Lengkap Sesuai KTP')

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-APPLY NTB - Kartu Kredit\\10.png')

Mobile.scrollToText('Lanjut')

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-APPLY NTB - Kartu Kredit\\11.png')

Mobile.tap(findTestObject('Object Repository/Apply NTB/Kartu Kredit/20. ViewGroup-Lanjut'), 0)

Mobile.tap(findTestObject('Object Repository/Apply NTB/Kartu Kredit/21. EditText-Tap Alamat'), 0)

Mobile.setText(findTestObject('Object Repository/Apply NTB/Kartu Kredit/22. EditText-Set Alamat'), 'CIPONDOH MAKMUR MV/18', 0)

Mobile.tap(findTestObject('Object Repository/Apply NTB/Kartu Kredit/23. EditText-Tap Kelurahan'), 0)

Mobile.tap(findTestObject('Object Repository/Apply NTB/Kartu Kredit/24. EditText-Tap Cari Kelurahan'), 0)

Mobile.setText(findTestObject('Object Repository/Apply NTB/Kartu Kredit/25. EditText-Set Cari Kelurahan'), 'Cipondoh Makmur', 0)

Mobile.tap(findTestObject('Object Repository/Apply NTB/Kartu Kredit/26. TextView-Tap Cari'), 0)

Mobile.tap(findTestObject('Object Repository/Apply NTB/Kartu Kredit/27. TextView-Tap Alamat Detail'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-APPLY NTB - Kartu Kredit\\12.png')

Mobile.tap(findTestObject('Object Repository/Apply NTB/Kartu Kredit/28. ViewGroup-Lanjut'), 0)

Mobile.tap(findTestObject('Object Repository/Apply NTB/Kartu Kredit/29. EditText-Pekerjaan'), 0)

Mobile.tap(findTestObject('Object Repository/Apply NTB/Kartu Kredit/30. TextView-KARYAWAN SWASTA'), 0)

Mobile.tap(findTestObject('Object Repository/Apply NTB/Kartu Kredit/31. EditText-Bidang Usaha'), 0)

Mobile.tap(findTestObject('Object Repository/Apply NTB/Kartu Kredit/32. TextView-SEKTOR JASA'), 0)

Mobile.tap(findTestObject('Object Repository/Apply NTB/Kartu Kredit/33. EditText-Jabatan'), 0)

Mobile.tap(findTestObject('Object Repository/Apply NTB/Kartu Kredit/34. EditText-Cari Jabatan'), 0)

Mobile.setText(findTestObject('Object Repository/Apply NTB/Kartu Kredit/35. EditText-Set Staff'), 'Staf', 0)

Mobile.tap(findTestObject('Object Repository/Apply NTB/Kartu Kredit/36. TextView-Tap Staf'), 0)

Mobile.tap(findTestObject('Object Repository/Apply NTB/Kartu Kredit/37. EditText-Tap Nama Perusahaan'), 0)

Mobile.setText(findTestObject('Object Repository/Apply NTB/Kartu Kredit/38. EditText-Set PT 360'), 'PT 360', 0)

Mobile.tap(findTestObject('Object Repository/Apply NTB/Kartu Kredit/39. TextView-Nomor Telepon Perusahaan'), 0)

Mobile.setText(findTestObject('Object Repository/Apply NTB/Kartu Kredit/40. EditText-Set No HP'), '085711357888', 0)

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/Apply NTB/Kartu Kredit/41. TextView-Tap Alamat Perusahaan'), 0)

Mobile.setText(findTestObject('Object Repository/Apply NTB/Kartu Kredit/42. EditText-Set Tendean'), 'Tendean', 0)

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/Apply NTB/Kartu Kredit/43. EditText-Tap RT'), 0)

Mobile.setText(findTestObject('Object Repository/Apply NTB/Kartu Kredit/44. EditText-Set RT'), '02', 0)

Mobile.tap(findTestObject('Object Repository/Apply NTB/Kartu Kredit/45. EditText-Tap RW'), 0)

Mobile.setText(findTestObject('Object Repository/Apply NTB/Kartu Kredit/46. EditText-Set RW'), '01', 0)

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/Apply NTB/Kartu Kredit/47. ViewGroup-Tap Kelurahan'), 0)

Mobile.tap(findTestObject('Object Repository/Apply NTB/Kartu Kredit/48. EditText-Tap Cari Kelurahan'), 0)

Mobile.setText(findTestObject('Object Repository/Apply NTB/Kartu Kredit/49. EditText-Set Mampang'), 'Mampang', 0)

Mobile.tap(findTestObject('Object Repository/Apply NTB/Kartu Kredit/50. TextView-Cari'), 0)

Mobile.tap(findTestObject('Object Repository/Apply NTB/Kartu Kredit/51. TextView-Tap Detail Alamat'), 0)

Mobile.scrollToText('Lanjut')

Mobile.tap(findTestObject('Object Repository/Apply NTB/Kartu Kredit/52. EditText-Tap Penghasilan'), 0)

Mobile.setText(findTestObject('Object Repository/Apply NTB/Kartu Kredit/53. EditText-Set Penghasilan'), '55000726', 0)

Mobile.pressBack()

Mobile.scrollToText('Pekerjaan')

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-APPLY NTB - Kartu Kredit\\14.png')

Mobile.scrollToText('Lanjut')

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-APPLY NTB - Kartu Kredit\\15.png')

Mobile.tap(findTestObject('Object Repository/Apply NTB/Kartu Kredit/54. ViewGroup-Lanjut'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-APPLY NTB - Kartu Kredit\\16.png')

Mobile.scrollToText('50 mega')

Mobile.tap(findTestObject('Object Repository/Apply NTB/Kartu Kredit/55. ViewGroup-Tap Produk'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-APPLY NTB - Kartu Kredit\\17.png')

Mobile.tap(findTestObject('Object Repository/Apply NTB/Kartu Kredit/56. ViewGroup-Pilih Kartu'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-APPLY NTB - Kartu Kredit\\18.png')

Mobile.tap(findTestObject('Object Repository/Apply NTB/Kartu Kredit/57. ViewGroup-Tidak Cetak Kartu'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-APPLY NTB - Kartu Kredit\\18.png')

Mobile.tap(findTestObject('Object Repository/Apply NTB/Kartu Kredit/58. ViewGroup-Lanjut'), 0)

Mobile.closeApplication()
