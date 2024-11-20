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
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-BANTUAN - Topik Populer\\01.png')

Mobile.tap(findTestObject('Object Repository/Bantuan/Topik Populer/01. SvgView - Tap Bantuan'), 0)\

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-BANTUAN - Topik Populer\\02.png')

Mobile.swipe(500, 1000, 500, 500)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-BANTUAN - Topik Populer\\03.png')

Mobile.verifyElementText(findTestObject('Object Repository/Bantuan/Topik Populer/02. TextView - verif TOPIK POPULER'), 
	'TOPIK POPULER')

Mobile.verifyElementText(findTestObject('Object Repository/Bantuan/Topik Populer/03. TextView - verif topik 1'),
	'Apakah akan muncul gais ? kita lihat saja ya gais')

Mobile.tap(findTestObject('Object Repository/Bantuan/Topik Populer/04. TextView - Tap topik 1'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Bantuan/Topik Populer/TextView - verif Topik Populer'), 
	'Topik Populer')

Mobile.verifyElementText(findTestObject('Object Repository/Bantuan/Topik Populer/05. TextView - verif topik 1, judul 1'), 
	'Apakah akan muncul gais ? kita lihat saja ya gais')

Mobile.verifyElementText(findTestObject('Object Repository/Bantuan/Topik Populer/06. TextView - verif topik 1, body 1'), 
	'Coba ajalah ya gaisku')

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-BANTUAN - Topik Populer\\04.png')

Mobile.tap(findTestObject('Object Repository/Bantuan/Topik Populer/ViewGroup - Back Button Topik Populer'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-BANTUAN - Topik Populer\\05.png')

Mobile.verifyElementText(findTestObject('Object Repository/Bantuan/Topik Populer/07. TextView - topik 2'),
	'Contoh aja nih gais')

Mobile.tap(findTestObject('Object Repository/Bantuan/Topik Populer/07. TextView - topik 2'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Bantuan/Topik Populer/TextView - verif Topik Populer'),
	'Topik Populer')

Mobile.verifyElementText(findTestObject('Object Repository/Bantuan/Topik Populer/08. TextView - verif topik 2, judul 1'),
	'Contoh aja nih gais')

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-BANTUAN - Topik Populer\\06.png')

Mobile.tap(findTestObject('Object Repository/Bantuan/Topik Populer/ViewGroup - Back Button Topik Populer'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-BANTUAN - Topik Populer\\07.png')

Mobile.verifyElementText(findTestObject('Object Repository/Bantuan/Topik Populer/09. TextView - topik 3'),
	'Apa saja syaratnya memiliki atau menggunakan aplikasi M-Smile?')

Mobile.tap(findTestObject('Object Repository/Bantuan/Topik Populer/09. TextView - topik 3'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Bantuan/Topik Populer/TextView - verif Topik Populer'),
	'Topik Populer')

Mobile.verifyElementText(findTestObject('Object Repository/Bantuan/Topik Populer/10. TextView - verif topik 3, judul 1'),
	'Apa saja syaratnya memiliki atau menggunakan aplikasi M-Smile?')

Mobile.verifyElementText(findTestObject('Object Repository/Bantuan/Topik Populer/11. TextView - verif topik 3, body 1'),
	'Nasabah perorangan.')

Mobile.verifyElementText(findTestObject('Object Repository/Bantuan/Topik Populer/12. TextView - verif topik 3, body 2'),
	'Memiliki Rekening tabungan dan/atau giro dalam mata uang Rupiah yang aktif, kartu kredit/kartu debit (yang terhubung dengan nomor rekening yang didaftarkan) yang aktif atau rekening gabungan primary joint OR atau QQ.')

Mobile.verifyElementText(findTestObject('Object Repository/Bantuan/Topik Populer/13. TextView - verif topik 3, body 3'),
	'Memiliki SIM Card/Kartu SIM dengan operator yang terdaftar di Indonesia.')

Mobile.verifyElementText(findTestObject('Object Repository/Bantuan/Topik Populer/14. TextView - verif topik 3, body 4'),
	'Nomor ponsel yang digunakan M-Smile harus sudah terdaftar di sistem Bank.')

Mobile.verifyElementText(findTestObject('Object Repository/Bantuan/Topik Populer/15. TextView - verif topik 3, body 5'),
	'Khusus Nasabah Pengguna M-Money, cukup memiiliki SIM Card dan Smartphone untuk mengaktifkan layanan M-Smile.')

Mobile.verifyElementText(findTestObject('Object Repository/Bantuan/Topik Populer/16. TextView - verif topik 3, body 6'),
	'1 CIF hanya dapat didaftarkan dan diakses dengan 1 nomor Ponsel yang terdaftar di CIF Nasabah.')

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-BANTUAN - Topik Populer\\01.png')

Mobile.tap(findTestObject('Object Repository/Bantuan/Topik Populer/ViewGroup - Back Button Topik Populer'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-BANTUAN - Topik Populer\\01.png')

Mobile.verifyElementText(findTestObject('Object Repository/Bantuan/Topik Populer/17. TextView - topik 4'),
	'Bagaimana jika Saya ingin buka rekening tabungan kedua di aplikasi M-Smile, jika sudah atau pernah memiliki tabungan atau produk lain dari Bank Mega sebelumnya?')

Mobile.tap(findTestObject('Object Repository/Bantuan/Topik Populer/17. TextView - topik 4'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Bantuan/Topik Populer/TextView - verif Topik Populer'),
	'Topik Populer')

Mobile.verifyElementText(findTestObject('Object Repository/Bantuan/Topik Populer/18. TextView - verif topik 4, judul 1'),
	'Bagaimana jika Saya ingin buka rekening tabungan kedua di aplikasi M-Smile, jika sudah atau pernah memiliki tabungan atau produk lain dari Bank Mega sebelumnya?')

Mobile.verifyElementText(findTestObject('Object Repository/Bantuan/Topik Populer/19. TextView - verif topik 4, body 1'),
	'Klik Apply.')

Mobile.verifyElementText(findTestObject('Object Repository/Bantuan/Topik Populer/20. TextView - verif topik 4, body 2'),
	'Klik Tabungan.')

Mobile.verifyElementText(findTestObject('Object Repository/Bantuan/Topik Populer/21. TextView - verif topik 4, body 3'),
	'Pilih produk tabungan Anda inginkan.')

Mobile.verifyElementText(findTestObject('Object Repository/Bantuan/Topik Populer/22. TextView - verif topik 4, body 4'),
	'Masukkan nominal setoran.')

Mobile.verifyElementText(findTestObject('Object Repository/Bantuan/Topik Populer/23. TextView - verif topik 4, body 5'),
	'Centang Syarat & Ketentuan.')

Mobile.verifyElementText(findTestObject('Object Repository/Bantuan/Topik Populer/24. TextView - verif topik 4, body 6'),
	'Masukkan M-PIN.')

Mobile.verifyElementText(findTestObject('Object Repository/Bantuan/Topik Populer/25. TextView - verif topik 4, body 7'),
	'Pembukaan rekening tabungan berhasil!')

Mobile.verifyElementText(findTestObject('Object Repository/Bantuan/Topik Populer/26. TextView - verif topik 4, body 8'),
	'Tabungan yang sudah Anda buat dapat dilihat di menu Akun Saya.')

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-BANTUAN - Topik Populer\\08.png')

Mobile.tap(findTestObject('Object Repository/Bantuan/Topik Populer/ViewGroup - Back Button Topik Populer'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-BANTUAN - Topik Populer\\09.png')

Mobile.verifyElementText(findTestObject('Object Repository/Bantuan/Topik Populer/27. TextView - topik 5'),
	'Apa itu fitur investasi di aplikasi M-Smile?')

Mobile.tap(findTestObject('Object Repository/Bantuan/Topik Populer/27. TextView - topik 5'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Bantuan/Topik Populer/TextView - verif Topik Populer'),
	'Topik Populer')

Mobile.verifyElementText(findTestObject('Object Repository/Bantuan/Topik Populer/28. TextView - verif topik 5, judul 1'),
	'Apa itu fitur investasi di aplikasi M-Smile?')

Mobile.verifyElementText(findTestObject('Object Repository/Bantuan/Topik Populer/29. TextView - verif topik 5, body 1'),
	'Investasi adalah fitur untuk melakukan investasi berupa reksa dana dan obligasi pemerintah (pasar perdana & pasar sekunder) dengan mudah di aplikasi M-Smile. Anda dapat membuat SID online, transaksi subscribe, switching hingga redeem Reksa Dana. Anda juga dapat melakukan pemesanan obligasi pasar perdana dan pembelian hingga penjualan obligasi pemerintah di pasar sekunder.')

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-BANTUAN - Topik Populer\\10.png')

Mobile.tap(findTestObject('Object Repository/Bantuan/Topik Populer/ViewGroup - Back Button Topik Populer'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-BANTUAN - Topik Populer\\11.png')

Mobile.verifyElementText(findTestObject('Object Repository/Bantuan/Topik Populer/30. TextView - topik 6'),
	'Apa itu M-Money?')

Mobile.tap(findTestObject('Object Repository/Bantuan/Topik Populer/30. TextView - topik 6'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Bantuan/Topik Populer/TextView - verif Topik Populer'),
	'Topik Populer')

Mobile.verifyElementText(findTestObject('Object Repository/Bantuan/Topik Populer/31. TextView - verif topik 6, judul 1'),
	'Apa itu M-Money?')

Mobile.verifyElementText(findTestObject('Object Repository/Bantuan/Topik Populer/32. TextView - verif topik 6, body 1'),
	'M-Money adalah uang elektronik yang dapat digunakan sebagai alat pembayaran barang atau jasa di merchant. Pengguna dapat melakukan pembukaan M-Money dengan mengunduh aplikasi M-Smile di Play Store untuk pengguna Android dan App store untuk pengguna iPhone.')

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-BANTUAN - Topik Populer\\12.png')

Mobile.tap(findTestObject('Object Repository/Bantuan/Topik Populer/ViewGroup - Back Button Topik Populer'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-BANTUAN - Topik Populer\\13.png')

Mobile.verifyElementText(findTestObject('Object Repository/Bantuan/Topik Populer/33. TextView - topik 7'),
	'Apa itu fitur deposito di aplikasi M-Smile?')

Mobile.tap(findTestObject('Object Repository/Bantuan/Topik Populer/33. TextView - topik 7'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Bantuan/Topik Populer/TextView - verif Topik Populer'),
	'Topik Populer')

Mobile.verifyElementText(findTestObject('Object Repository/Bantuan/Topik Populer/34. TextView - verif topik 7, judul 1'),
	'Apa itu fitur deposito di aplikasi M-Smile?')

Mobile.verifyElementText(findTestObject('Object Repository/Bantuan/Topik Populer/35. TextView - verif topik 7, body 1'),
	'Deposito adalah fitur untuk membuka rekening deposito dengan jangka waktu dan tenor yang dapat Anda pilih sesuai kebutuhan, untuk memaksimalkan tingkat pengembalian dana.')

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-BANTUAN - Topik Populer\\14.png')

Mobile.tap(findTestObject('Object Repository/Bantuan/Topik Populer/ViewGroup - Back Button Topik Populer'), 0)

Mobile.closeApplication()

