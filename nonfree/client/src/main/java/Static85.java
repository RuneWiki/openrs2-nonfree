import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static85 {

	@OriginalMember(owner = "client!f", name = "x", descriptor = "Lclient!vj;")
	public static Class2_Sub2_Sub17 aClass2_Sub2_Sub17_1;

	@OriginalMember(owner = "client!f", name = "F", descriptor = "Lclient!od;")
	public static Class2_Sub12_Sub3 aClass2_Sub12_Sub3_1;

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(Lclient!mc;I)V", line = 24)
	public static void method1962(@OriginalArg(0) Class145 arg0) {
		Class14.aClass2_Sub4_Sub2_4.method4868(arg0.method3703());
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(B)V", line = 41)
	public static void method1963() {
		if (Class2_Sub3_Sub35.anInt6429 == 0 || Class2_Sub3_Sub35.anInt6429 == 5) {
			return;
		}
		try {
			if (++Class127.anInt3416 > 2000) {
				if (Static312.aClass111_4 != null) {
					Static312.aClass111_4.method2801();
					Static312.aClass111_4 = null;
				}
				if (Class153.anInt3796 >= 1) {
					Class2_Sub3_Sub6.anInt1045 = -5;
					Class2_Sub3_Sub35.anInt6429 = 0;
					return;
				}
				Class127.anInt3416 = 0;
				Class153.anInt3796++;
				Class2_Sub3_Sub35.anInt6429 = 1;
				if (Static16.anInt4748 == Static81.anInt1841) {
					Static81.anInt1841 = Static307.anInt6181;
				} else {
					Static81.anInt1841 = Static16.anInt4748;
				}
			}
			if (Class2_Sub3_Sub35.anInt6429 == 1) {
				Static5.aClass32_1 = Static305.aClass152_5.method3752(Static201.aString36, Static81.anInt1841);
				Class2_Sub3_Sub35.anInt6429 = 2;
			}
			@Pc(112) int local112;
			if (Class2_Sub3_Sub35.anInt6429 == 2) {
				if (Static5.aClass32_1.anInt992 == 2) {
					throw new IOException();
				}
				if (Static5.aClass32_1.anInt992 != 1) {
					return;
				}
				Static312.aClass111_4 = new Class111((Socket) Static5.aClass32_1.anObject2, Static305.aClass152_5);
				Static5.aClass32_1 = null;
				@Pc(105) long local105 = Static224.aLong130 = Static76.method5986(Class242.aString70);
				local112 = (int) (local105 >> 16 & 0x1FL);
				Class14.aClass2_Sub4_Sub2_4.anInt5289 = 0;
				Class14.aClass2_Sub4_Sub2_4.method4843(Class2_Sub2_Sub3.aClass242_1.anInt7025);
				Class14.aClass2_Sub4_Sub2_4.method4843(local112);
				Static312.aClass111_4.method2799(2, Class14.aClass2_Sub4_Sub2_4.aByteArray73);
				if (Static280.aClass221_2 != null) {
					Static280.aClass221_2.method6326();
				}
				if (Static177.aClass221_1 != null) {
					Static177.aClass221_1.method6326();
				}
				@Pc(145) int local145 = Static312.aClass111_4.method2802();
				if (Static280.aClass221_2 != null) {
					Static280.aClass221_2.method6326();
				}
				if (Static177.aClass221_1 != null) {
					Static177.aClass221_1.method6326();
				}
				if (local145 != 0) {
					Class2_Sub3_Sub35.anInt6429 = 0;
					Class2_Sub3_Sub6.anInt1045 = local145;
					Static312.aClass111_4.method2801();
					Static312.aClass111_4 = null;
					return;
				}
				Class2_Sub3_Sub35.anInt6429 = 3;
			}
			if (Class2_Sub3_Sub35.anInt6429 == 3) {
				if (Static312.aClass111_4.method2797() < 8) {
					return;
				}
				Static312.aClass111_4.method2795(Class150.aClass2_Sub4_Sub2_3.aByteArray73, 8, 0);
				Class150.aClass2_Sub4_Sub2_3.anInt5289 = 0;
				Class141.aLong119 = Class150.aClass2_Sub4_Sub2_3.method4799();
				@Pc(208) Class2_Sub4 local208 = new Class2_Sub4(70);
				@Pc(211) int[] local211 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Class141.aLong119 >> 32), (int) Class141.aLong119 };
				local208.method4843(10);
				local208.method4814(local211[0]);
				local208.method4814(local211[1]);
				local208.method4814(local211[2]);
				local208.method4814(local211[3]);
				local208.method4833(Static76.method5986(Class242.aString70));
				local208.method4823(Class5.aString51);
				local208.method4835(Class2_Sub35.aBigInteger2, Class135.aBigInteger1);
				Class14.aClass2_Sub4_Sub2_4.anInt5289 = 0;
				if (Class2_Sub3_Sub35.anInt6430 == 40) {
					Class14.aClass2_Sub4_Sub2_4.method4843(Class2_Sub2_Sub3.aClass242_5.anInt7025);
				} else {
					Class14.aClass2_Sub4_Sub2_4.method4843(Class2_Sub2_Sub3.aClass242_3.anInt7025);
				}
				Class14.aClass2_Sub4_Sub2_4.method4844(0);
				local112 = Class14.aClass2_Sub4_Sub2_4.anInt5289;
				Class14.aClass2_Sub4_Sub2_4.method4814(578);
				Class14.aClass2_Sub4_Sub2_4.method4843(Class11_Sub2_Sub3.anInt3710);
				Class14.aClass2_Sub4_Sub2_4.method4843(Static135.method2694());
				Class14.aClass2_Sub4_Sub2_4.method4844(Static231.anInt4656);
				Class14.aClass2_Sub4_Sub2_4.method4844(Static161.anInt3295);
				Class14.aClass2_Sub4_Sub2_4.method4843(Static203.aClass177_Sub1_2.anInt4875);
				Static26.method875(Class14.aClass2_Sub4_Sub2_4);
				Class14.aClass2_Sub4_Sub2_4.method4823(Class59.aString17);
				Class14.aClass2_Sub4_Sub2_4.method4814(Class116.anInt3145);
				@Pc(354) Class2_Sub4 local354 = Static203.aClass177_Sub1_2.method4495();
				Class14.aClass2_Sub4_Sub2_4.method4843(local354.anInt5289);
				Class14.aClass2_Sub4_Sub2_4.method4858(local354.aByteArray73, local354.anInt5289);
				Class161.aBoolean288 = true;
				Class14.aClass2_Sub4_Sub2_4.method4844(Class49_Sub3.anInt5498);
				Class14.aClass2_Sub4_Sub2_4.method4814(Static319.aClass197_77.method5079());
				Class14.aClass2_Sub4_Sub2_4.method4814(Static33.aClass197_67.method5079());
				Class14.aClass2_Sub4_Sub2_4.method4814(Static266.aClass197_71.method5079());
				Class14.aClass2_Sub4_Sub2_4.method4814(Static329.aClass197_9.method5079());
				Class14.aClass2_Sub4_Sub2_4.method4814(Static81.aClass197_21.method5079());
				Class14.aClass2_Sub4_Sub2_4.method4814(Static265.aClass197_70.method5079());
				Class14.aClass2_Sub4_Sub2_4.method4814(Static94.aClass197_23.method5079());
				Class14.aClass2_Sub4_Sub2_4.method4814(Static220.aClass197_63.method5079());
				Class14.aClass2_Sub4_Sub2_4.method4814(Static29.aClass197_5.method5079());
				Class14.aClass2_Sub4_Sub2_4.method4814(Static301.aClass197_86.method5079());
				Class14.aClass2_Sub4_Sub2_4.method4814(Static71.aClass197_18.method5079());
				Class14.aClass2_Sub4_Sub2_4.method4814(Static201.aClass197_58.method5079());
				Class14.aClass2_Sub4_Sub2_4.method4814(Static182.aClass197_54.method5079());
				Class14.aClass2_Sub4_Sub2_4.method4814(Static235.aClass197_64.method5079());
				Class14.aClass2_Sub4_Sub2_4.method4814(Static124.aClass197_32.method5079());
				Class14.aClass2_Sub4_Sub2_4.method4814(Static113.aClass197_28.method5079());
				Class14.aClass2_Sub4_Sub2_4.method4814(Static365.aClass197_96.method5079());
				Class14.aClass2_Sub4_Sub2_4.method4814(Static210.aClass197_61.method5079());
				Class14.aClass2_Sub4_Sub2_4.method4814(Static201.aClass197_57.method5079());
				Class14.aClass2_Sub4_Sub2_4.method4814(Static57.aClass197_12.method5079());
				Class14.aClass2_Sub4_Sub2_4.method4814(Static130.aClass197_35.method5079());
				Class14.aClass2_Sub4_Sub2_4.method4814(Static162.aClass197_45.method5079());
				Class14.aClass2_Sub4_Sub2_4.method4814(Static271.aClass197_75.method5079());
				Class14.aClass2_Sub4_Sub2_4.method4814(Static363.aClass197_66.method5079());
				Class14.aClass2_Sub4_Sub2_4.method4814(Static359.aClass197_94.method5079());
				Class14.aClass2_Sub4_Sub2_4.method4814(Static130.aClass197_34.method5079());
				Class14.aClass2_Sub4_Sub2_4.method4814(Static218.aClass197_47.method5079());
				Class14.aClass2_Sub4_Sub2_4.method4814(Static57.aClass197_11.method5079());
				Class14.aClass2_Sub4_Sub2_4.method4814(Static81.aClass197_20.method5079());
				Class14.aClass2_Sub4_Sub2_4.method4858(local208.aByteArray73, local208.anInt5289);
				Class14.aClass2_Sub4_Sub2_4.method4852(Class14.aClass2_Sub4_Sub2_4.anInt5289 - local112);
				Static312.aClass111_4.method2799(Class14.aClass2_Sub4_Sub2_4.anInt5289, Class14.aClass2_Sub4_Sub2_4.aByteArray73);
				Class14.aClass2_Sub4_Sub2_4.method4872(local211);
				for (@Pc(579) int local579 = 0; local579 < 4; local579++) {
					local211[local579] += 50;
				}
				Class150.aClass2_Sub4_Sub2_3.method4872(local211);
				Class2_Sub3_Sub35.anInt6429 = 4;
			}
			@Pc(619) int local619;
			if (Class2_Sub3_Sub35.anInt6429 == 4) {
				if (Static312.aClass111_4.method2797() < 1) {
					return;
				}
				local619 = Static312.aClass111_4.method2802();
				if (local619 == 21) {
					Class2_Sub3_Sub35.anInt6429 = 7;
				} else if (local619 == 29) {
					Class2_Sub3_Sub35.anInt6429 = 11;
				} else if (local619 == 1) {
					Class2_Sub3_Sub35.anInt6429 = 5;
					Class2_Sub3_Sub6.anInt1045 = local619;
					return;
				} else if (local619 == 2) {
					Class2_Sub3_Sub35.anInt6429 = 8;
				} else if (local619 == 15) {
					Class2_Sub3_Sub35.anInt6429 = 12;
					Class61.anInt1834 = -2;
				} else if (local619 == 23 && Class153.anInt3796 < 1) {
					Class127.anInt3416 = 0;
					Class153.anInt3796++;
					Class2_Sub3_Sub35.anInt6429 = 1;
					Static312.aClass111_4.method2801();
					Static312.aClass111_4 = null;
					return;
				} else {
					Class2_Sub3_Sub6.anInt1045 = local619;
					Class2_Sub3_Sub35.anInt6429 = 0;
					Static312.aClass111_4.method2801();
					Static312.aClass111_4 = null;
					return;
				}
			}
			if (Class2_Sub3_Sub35.anInt6429 == 6) {
				Class14.aClass2_Sub4_Sub2_4.anInt5289 = 0;
				Class14.aClass2_Sub4_Sub2_4.method4868(Class2_Sub2_Sub3.aClass242_4.anInt7025);
				Static312.aClass111_4.method2799(Class14.aClass2_Sub4_Sub2_4.anInt5289, Class14.aClass2_Sub4_Sub2_4.aByteArray73);
				Class2_Sub3_Sub35.anInt6429 = 4;
			} else if (Class2_Sub3_Sub35.anInt6429 == 7) {
				if (Static312.aClass111_4.method2797() >= 1) {
					Class37_Sub1.anInt1247 = Static312.aClass111_4.method2802() * 60 + 180;
					Class2_Sub3_Sub6.anInt1045 = 21;
					Class2_Sub3_Sub35.anInt6429 = 0;
					Static312.aClass111_4.method2801();
					Static312.aClass111_4 = null;
				}
			} else if (Class2_Sub3_Sub35.anInt6429 != 11) {
				if (Class2_Sub3_Sub35.anInt6429 == 8) {
					if (Static312.aClass111_4.method2797() < 13) {
						return;
					}
					Static312.aClass111_4.method2795(Class150.aClass2_Sub4_Sub2_3.aByteArray73, 13, 0);
					Class150.aClass2_Sub4_Sub2_3.anInt5289 = 0;
					Class3_Sub1.anInt90 = Class150.aClass2_Sub4_Sub2_3.method4816();
					Class148.anInt3770 = Class150.aClass2_Sub4_Sub2_3.method4816();
					Class43.aBoolean123 = Class150.aClass2_Sub4_Sub2_3.method4816() == 1;
					Class73.aBoolean159 = Class150.aClass2_Sub4_Sub2_3.method4816() == 1;
					Class2_Sub3_Sub35.aBoolean434 = Class150.aClass2_Sub4_Sub2_3.method4816() == 1;
					Class78_Sub1.aBoolean166 = Class150.aClass2_Sub4_Sub2_3.method4816() == 1;
					Class11_Sub3_Sub2.anInt4220 = Class150.aClass2_Sub4_Sub2_3.method4830();
					Class90_Sub1.aBoolean482 = Class150.aClass2_Sub4_Sub2_3.method4816() == 1;
					Class144.aBoolean241 = Class150.aClass2_Sub4_Sub2_3.method4816() == 1;
					Static334.aClass202_4.method5158(Class144.aBoolean241);
					Static290.aClass107_2.method2764(Class144.aBoolean241);
					Static6.aClass219_1.method5574(Class144.aBoolean241);
					if (Class43.aBoolean123 && !Class2_Sub3_Sub35.aBoolean434 || Class90_Sub1.aBoolean482) {
						try {
							Static391.method4629(Static305.aClass152_5.anApplet1, "zap");
						} catch (@Pc(896) Throwable local896) {
							if (RuntimeException_Sub1.aBoolean180) {
								try {
									Static305.aClass152_5.anApplet1.getAppletContext().showDocument(new URL(Static305.aClass152_5.anApplet1.getCodeBase(), "blank.ws"), "tbi");
								} catch (@Pc(912) Exception local912) {
								}
							}
						}
					} else {
						try {
							Static391.method4629(Static305.aClass152_5.anApplet1, "unzap");
						} catch (@Pc(922) Throwable local922) {
						}
					}
					if (Class132.aClass127_6 == Static114.aClass127_4) {
						try {
							Static391.method4629(Static305.aClass152_5.anApplet1, "loggedin");
						} catch (@Pc(934) Throwable local934) {
						}
					}
					Class2_Sub3_Sub35.anInt6429 = 10;
				}
				if (Class2_Sub3_Sub35.anInt6429 == 10) {
					if (Class150.aClass2_Sub4_Sub2_3.method4871()) {
						if (Static312.aClass111_4.method2797() < 1) {
							return;
						}
						Static312.aClass111_4.method2795(Class150.aClass2_Sub4_Sub2_3.aByteArray73, 1, Class150.aClass2_Sub4_Sub2_3.anInt5289 + 2);
					}
					Class12_Sub4.aClass89_164 = Static156.method3189()[Class150.aClass2_Sub4_Sub2_3.method4865()];
					Class61.anInt1834 = Class150.aClass2_Sub4_Sub2_3.method4830();
					Class2_Sub3_Sub35.anInt6429 = 9;
				}
				if (Class2_Sub3_Sub35.anInt6429 == 9) {
					if (Static312.aClass111_4.method2797() >= Class61.anInt1834) {
						Static312.aClass111_4.method2795(Class150.aClass2_Sub4_Sub2_3.aByteArray73, Class61.anInt1834, 0);
						Class150.aClass2_Sub4_Sub2_3.anInt5289 = 0;
						Class2_Sub3_Sub6.anInt1045 = 2;
						local619 = Class61.anInt1834;
						Class2_Sub3_Sub35.anInt6429 = 0;
						Static364.method6450();
						Static341.method6121(Class150.aClass2_Sub4_Sub2_3);
						Static98.anInt2184 = -1;
						Static169.method3376(false);
						if (local619 != Class150.aClass2_Sub4_Sub2_3.anInt5289) {
							throw new RuntimeException("lswp pos:" + Class150.aClass2_Sub4_Sub2_3.anInt5289 + " psize:" + local619);
						}
						Class12_Sub4.aClass89_164 = null;
					}
				} else if (Class2_Sub3_Sub35.anInt6429 == 12) {
					if (Class61.anInt1834 == -2) {
						if (Static312.aClass111_4.method2797() < 2) {
							return;
						}
						Static312.aClass111_4.method2795(Class150.aClass2_Sub4_Sub2_3.aByteArray73, 2, 0);
						Class150.aClass2_Sub4_Sub2_3.anInt5289 = 0;
						Class61.anInt1834 = Class150.aClass2_Sub4_Sub2_3.method4830();
					}
					if (Static312.aClass111_4.method2797() >= Class61.anInt1834) {
						Static312.aClass111_4.method2795(Class150.aClass2_Sub4_Sub2_3.aByteArray73, Class61.anInt1834, 0);
						Class150.aClass2_Sub4_Sub2_3.anInt5289 = 0;
						Class2_Sub3_Sub6.anInt1045 = 15;
						Class2_Sub3_Sub35.anInt6429 = 0;
						local619 = Class61.anInt1834;
						Static170.method3389();
						Static341.method6121(Class150.aClass2_Sub4_Sub2_3);
						if (Class150.aClass2_Sub4_Sub2_3.anInt5289 != local619) {
							throw new RuntimeException("lswpr pos:" + Class150.aClass2_Sub4_Sub2_3.anInt5289 + " psize:" + local619);
						}
						Class12_Sub4.aClass89_164 = null;
					}
				}
			} else if (Static312.aClass111_4.method2797() >= 1) {
				Class2_Sub2_Sub10.anInt6174 = Static312.aClass111_4.method2802();
				Class2_Sub3_Sub35.anInt6429 = 0;
				Class2_Sub3_Sub6.anInt1045 = 29;
				Static312.aClass111_4.method2801();
				Static312.aClass111_4 = null;
			}
		} catch (@Pc(1122) IOException local1122) {
			if (Static312.aClass111_4 != null) {
				Static312.aClass111_4.method2801();
				Static312.aClass111_4 = null;
			}
			if (Class153.anInt3796 < 1) {
				Class127.anInt3416 = 0;
				Class153.anInt3796++;
				Class2_Sub3_Sub35.anInt6429 = 1;
				if (Static16.anInt4748 == Static81.anInt1841) {
					Static81.anInt1841 = Static307.anInt6181;
				} else {
					Static81.anInt1841 = Static16.anInt4748;
				}
			} else {
				Class2_Sub3_Sub6.anInt1045 = -4;
				Class2_Sub3_Sub35.anInt6429 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(I)V", line = 493)
	public static void method1964() {
		Class222.aClass98_57.method2616();
		Class11_Sub5.aClass98_63.method2616();
		Class221.aClass98_65.method2616();
		Class199.aClass98_44.method2616();
		Class2_Sub2_Sub14.aClass98_42.method2616();
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(IZ)V", line = 514)
	public static void method1965(@OriginalArg(0) int arg0) {
		Static300.anInt6050 = arg0;
		Class11_Sub5.aClass98_63.method2616();
	}
}
