package app;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sun.security.pkcs.PKCS7;
import sun.security.pkcs.SignerInfo;

@OriginalClass("jagexappletviewer!app/k")
final class Class12 {

	@OriginalMember(owner = "jagexappletviewer!app/k", name = "a", descriptor = "Ljava/util/Hashtable;")
	private Hashtable aHashtable5 = new Hashtable();

	@OriginalMember(owner = "jagexappletviewer!app/k", name = "b", descriptor = "Ljava/util/Hashtable;")
	private Hashtable aHashtable6 = new Hashtable();

	@OriginalMember(owner = "jagexappletviewer!app/k", name = "c", descriptor = "Ljava/util/Hashtable;")
	private Hashtable aHashtable7 = new Hashtable();

	@OriginalMember(owner = "jagexappletviewer!app/k", name = "d", descriptor = "[B")
	private byte[] aByteArray1;

	@OriginalMember(owner = "jagexappletviewer!app/k", name = "e", descriptor = "Lsun/security/pkcs/PKCS7;")
	private PKCS7 aPKCS7_1;

	@OriginalMember(owner = "jagexappletviewer!app/k", name = "a", descriptor = "(ILjava/lang/String;)[B")
	final byte[] method31(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		try {
			@Pc(8) byte[] local8 = (byte[]) this.aHashtable5.remove(arg1);
			if (local8 == null) {
				return null;
			}
			@Pc(21) Class19 local21 = (Class19) this.aHashtable6.get(arg1);
			if (local21 == null) {
				return null;
			}
			@Pc(32) Class19 local32 = (Class19) this.aHashtable7.get(arg1);
			if (local32 == null) {
				return null;
			}
			@Pc(43) MessageDigest local43;
			@Pc(51) byte[] local51;
			@Pc(55) String local55;
			if (local21.aString11 != null) {
				local43 = MessageDigest.getInstance("MD5");
				local43.reset();
				local43.update(local8);
				local51 = local43.digest();
				local55 = Class9.method28(local51, (byte) 50);
				if (!local55.equals(local21.aString11)) {
					return null;
				}
				local43.reset();
				local43.update(local21.aByteArray3);
				local51 = local43.digest();
				local55 = Class9.method28(local51, (byte) 86);
				if (!local55.equals(local32.aString11)) {
					return null;
				}
			}
			if (local21.aString10 == null && local21.aString12 == null) {
				return null;
			}
			if (local21.aString12 == null) {
				local43 = MessageDigest.getInstance("SHA1");
				local43.reset();
				local43.update(local8);
				local51 = local43.digest();
				local55 = Class9.method28(local51, (byte) 65);
				if (!local55.equals(local21.aString10)) {
					return null;
				}
				local43.reset();
				local43.update(local21.aByteArray3);
				local51 = local43.digest();
				local55 = Class9.method28(local51, (byte) 46);
				if (!local55.equals(local32.aString10)) {
					return null;
				}
			} else {
				local43 = MessageDigest.getInstance("SHA-256");
				local43.reset();
				local43.update(local8);
				local51 = local43.digest();
				local55 = Class9.method28(local51, (byte) 77);
				if (!local55.equals(local21.aString12)) {
					return null;
				}
				local43.reset();
				local43.update(local21.aByteArray3);
				local51 = local43.digest();
				local55 = Class9.method28(local51, (byte) 33);
				if (!local55.equals(local32.aString12)) {
					return null;
				}
			}
			@Pc(196) SignerInfo[] local196 = this.aPKCS7_1.verify(this.aByteArray1);
			if (local196 == null || local196.length == 0) {
				return null;
			}
			@Pc(213) ArrayList local213 = local196[0].getCertificateChain(this.aPKCS7_1);
			@Pc(216) int local216 = local213.size();
			if (local216 < 2) {
				return null;
			}
			if (arg0 >= -94) {
				this.aPKCS7_1 = null;
			}
			for (@Pc(232) int local232 = 0; local232 < local216; local232++) {
				@Pc(244) X509Certificate local244 = (X509Certificate) local213.get(local232);
				@Pc(248) String local248 = local244.getSubjectX500Principal().getName();
				@Pc(252) String local252 = local244.getSerialNumber().toString();
				@Pc(256) byte[] local256 = local244.getPublicKey().getEncoded();
				@Pc(260) String local260 = Class9.method28(local256, (byte) 101);
				if (local232 == 0) {
					@Pc(269) int local269 = local248.indexOf("CN=");
					if (local269 < 0) {
						return null;
					}
					@Pc(279) int local279 = local248.indexOf(",", local269);
					if (local279 < 0) {
						local279 = local248.length();
					}
					if (!local248.substring(local269 + 3, local279).equals("Jagex Ltd")) {
						return null;
					}
					@Pc(306) int local306 = local248.indexOf("O=");
					if (local306 < 0) {
						return null;
					}
					@Pc(320) int local320 = local248.indexOf(",", local306);
					if (local320 < 0) {
						local320 = local248.length();
					}
					if (!local248.substring(local306 + 2, local320).equals("Jagex Ltd")) {
						return null;
					}
				}
				if (local232 != local216 - 1) {
					@Pc(350) X509Certificate local350 = (X509Certificate) local213.get(local232 + 1);
					try {
						local244.verify(local350.getPublicKey());
					} catch (@Pc(356) Exception local356) {
						return null;
					}
				} else if ((!local252.equals("10") || !local260.equals("MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDGuLknYK8L45FpZdt+je2R5qrxvtXt/m3ULH/RcHf7JplXtN0/MLjcIepojYGS/C5LkTWEIPLaSrq0/ObaiPIgxSGSCUeVoAkcpnm+sUwd/PGKblTSaaHxTJM6Qf591GR7Y0X3YGAdMR2k6dMPi/tuJiSzqP/l5ZDUtMLcUGCuWQIDAQAB")) && (!local252.equals("1") || !local260.equals("MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDSNjZqi9fCW57agUFijzjuSQRV1tDvHBuVFkfvGEg1OlL0K2oGjzsv6lbjr4aNnhf3nrRldQJN78sJoiFR2JvQZ9C6DZIGFHPUk8uXKgCcXE4MvPoVUvzyRG7aEUpuCJ8vLeP5qjqGc7ZGU1jIiQW9gxG4cz+qB430Qk3nQJ0cNwIDAQAB")) && (!local252.equals("69529181992039203566298953787712940909") && !local252.equals("68316673031993696956121215362381360273") || !local260.equals("MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEArKDw+4BZ1JzHpM+doVlzCRBFDA0sbmjxbFtIaElZN/wLMxnCd3/MEC2VNBzm600JpxzSuMmXNgK3idQkXwbAzESUlI0CYm/rWt0RjSiaXISQEHoNvXRmL2o4oOLVVETrHQefB7pv7un9Tgsp9T6EoAHxnKv4HH6JpOih2HFlDaNRe+680iJgDblbnd+6/FFbC6+Ysuku6QToYofeK8jXTsFMZB7dz4dYukpPymgHHRydSsbVL5HMfHFyHMXAZ+sy/cmSXJTahcCbv1N9Kwn0jJ2RH5dqUsveCTakd9h7h1BE1T5uKWn7OUkmHgmlgHtALevoJ4XJ/mH9fuZ8lx3VnQIDAQAB"))) {
					return null;
				}
			}
			return local8;
		} catch (@Pc(412) Exception local412) {
			local412.printStackTrace();
			Class16.method41(appletviewer.method11(113, "err_get_file") + ":" + arg1 + " [" + local412.toString() + "]", (byte) -55);
			return null;
		}
	}

	@OriginalMember(owner = "jagexappletviewer!app/k", name = "<init>", descriptor = "([B)V")
	Class12(@OriginalArg(0) byte[] arg0) throws IOException {
		@Pc(26) ZipInputStream local26 = new ZipInputStream(new ByteArrayInputStream(arg0));
		@Pc(29) byte[] local29 = new byte[1000];
		while (true) {
			while (true) {
				while (true) {
					@Pc(32) ZipEntry local32 = local26.getNextEntry();
					if (local32 == null) {
						return;
					}
					@Pc(37) String local37 = local32.getName();
					@Pc(41) ByteArrayOutputStream local41 = new ByteArrayOutputStream();
					while (true) {
						@Pc(47) int local47 = local26.read(local29, 0, 1000);
						if (local47 == -1) {
							@Pc(65) byte[] local65 = local41.toByteArray();
							if (!local37.equalsIgnoreCase("META-INF/manifest.mf") && (!local37.startsWith("META-INF/") || !local37.endsWith(".sf") && !local37.endsWith(".SF"))) {
								if (local37.startsWith("META-INF/") && (local37.endsWith(".rsa") || local37.endsWith(".RSA"))) {
									this.aPKCS7_1 = new PKCS7(local65);
									break;
								}
								this.aHashtable5.put(local37.replace('/', '.'), local65);
								break;
							}
							@Pc(89) int local89 = 0;
							@Pc(92) int[] local92 = new int[10000];
							@Pc(94) int local94;
							for (local94 = 0; local94 < local65.length - 5; local94++) {
								if (local65[local94] == 78 && local65[local94 + 1] == 97 && local65[local94 + 2] == 109 && local65[local94 + 3] == 101 && local65[local94 + 4] == 58) {
									local92[local89++] = local94;
								}
							}
							for (local94 = 0; local94 < local89; local94++) {
								@Pc(172) Class19 local172 = new Class19();
								@Pc(176) int local176 = local92[local94];
								@Pc(215) int local215;
								if (local94 + 1 >= local89) {
									local215 = local65.length;
								} else if (local65[local92[local94 + 1] - 1] == 10 && local65[local92[local94 + 1] - 2] == 13) {
									local215 = local92[local94 + 1];
								} else {
									local215 = local92[local94 + 1] - 1;
								}
								local172.aByteArray3 = new byte[local215 - local176];
								System.arraycopy(local65, local176, local172.aByteArray3, 0, local215 - local176);
								@Pc(249) int local249 = 0;
								for (@Pc(251) int local251 = 0; local251 < local172.aByteArray3.length; local251++) {
									if (local172.aByteArray3[local251] == 10 || local172.aByteArray3[local251] == 13) {
										@Pc(290) String local290 = (new String(local172.aByteArray3, local249, local251 - local249)).trim();
										if (local290.startsWith("Name: ")) {
											local172.aString13 = local290.substring(6).replace('/', '.');
										}
										if (local290.startsWith("MD5-Digest: ")) {
											local172.aString11 = local290.substring(12);
										}
										if (local290.startsWith("SHA1-Digest: ")) {
											local172.aString10 = local290.substring(13);
										}
										if (local290.startsWith("SHA-256-Digest: ")) {
											local172.aString12 = local290.substring(16);
										}
										local249 = local251 + 1;
									}
								}
								if (local37.equalsIgnoreCase("META-INF/manifest.mf")) {
									this.aHashtable6.put(local172.aString13, local172);
								}
								if (local37.endsWith(".sf") || local37.endsWith(".SF")) {
									this.aHashtable7.put(local172.aString13, local172);
								}
							}
							if (local37.endsWith(".sf") || local37.endsWith(".SF")) {
								this.aByteArray1 = local65;
							}
							break;
						}
						local41.write(local29, 0, local47);
					}
				}
			}
		}
	}
}
