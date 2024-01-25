import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static89 {

	@OriginalMember(owner = "client!cka", name = "B", descriptor = "Lclient!oha;")
	public static Class274 aClass274_1;

	@OriginalMember(owner = "client!cka", name = "A", descriptor = "I")
	public static int anInt1518;

	@OriginalMember(owner = "client!cka", name = "C", descriptor = "Lclient!lk;")
	public static final Class225 aClass225_31 = new Class225(78, 6);

	@OriginalMember(owner = "client!cka", name = "E", descriptor = "[I")
	public static final int[] anIntArray119 = new int[64];

	@OriginalMember(owner = "client!cka", name = "a", descriptor = "(Lclient!d;BLclient!ha;)V")
	public static void method1325(@OriginalArg(0) Interface3 arg0, @OriginalArg(2) Class145 arg1) {
		if (Static90.aClass2_Sub6_Sub21_2 == null) {
			return;
		}
		if (Static424.anInt6882 < 10) {
			if (!Static90.aClass254_75.method6069(Static90.aClass2_Sub6_Sub21_2.aString110)) {
				Static424.anInt6882 = Static394.aClass254_113.method6092(Static90.aClass2_Sub6_Sub21_2.aString110) / 10;
				return;
			}
			Static470.method6737();
			Static424.anInt6882 = 10;
		}
		if (Static424.anInt6882 == 10) {
			Static90.anInt3348 = Static90.aClass2_Sub6_Sub21_2.anInt9647 >> 6 << 6;
			Static90.anInt3353 = Static90.aClass2_Sub6_Sub21_2.anInt9640 >> 6 << 6;
			Static90.anInt3350 = (Static90.aClass2_Sub6_Sub21_2.anInt9643 >> 6 << 6) + 64 - Static90.anInt3353;
			Static90.anInt3349 = (Static90.aClass2_Sub6_Sub21_2.anInt9653 >> 6 << 6) + 64 - Static90.anInt3348;
			@Pc(80) int[] local80 = new int[3];
			@Pc(82) int local82 = -1;
			@Pc(84) int local84 = -1;
			if (Static90.aClass2_Sub6_Sub21_2.method8515(Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2.aByte133, (Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2.anInt10229 >> 9) + Static243.anInt3820, local80, Static224.anInt11062 + (Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2.anInt10228 >> 9))) {
				local82 = local80[1] - Static90.anInt3353;
				local84 = local80[2] - Static90.anInt3348;
			}
			if (!Static598.aBoolean798 && local82 >= 0 && Static90.anInt3350 > local82 && local84 >= 0 && local84 < Static90.anInt3349) {
				local84 += (int) (Math.random() * 10.0D) - 5;
				local82 += (int) (Math.random() * 10.0D) - 5;
				Static704.anInt10775 = local84;
				Static681.anInt10509 = local82;
			} else if (Static294.anInt6060 == -1 || Static697.anInt10714 == -1) {
				Static90.aClass2_Sub6_Sub21_2.method8516(101, Static90.aClass2_Sub6_Sub21_2.anInt9639 >> 14 & 0x3FFF, Static90.aClass2_Sub6_Sub21_2.anInt9639 & 0x3FFF, local80);
				Static704.anInt10775 = local80[2] - Static90.anInt3348;
				Static681.anInt10509 = local80[1] - Static90.anInt3353;
			} else {
				Static90.aClass2_Sub6_Sub21_2.method8516(68, Static294.anInt6060, Static697.anInt10714, local80);
				Static598.aBoolean798 = false;
				if (local80 != null) {
					Static681.anInt10509 = local80[1] - Static90.anInt3353;
					Static704.anInt10775 = local80[2] - Static90.anInt3348;
				}
				Static697.anInt10714 = -1;
				Static294.anInt6060 = -1;
			}
			if (Static90.aClass2_Sub6_Sub21_2.anInt9646 == 37) {
				Static90.aFloat43 = 3.0F;
				Static90.aFloat42 = 3.0F;
			} else if (Static90.aClass2_Sub6_Sub21_2.anInt9646 == 50) {
				Static90.aFloat43 = 4.0F;
				Static90.aFloat42 = 4.0F;
			} else if (Static90.aClass2_Sub6_Sub21_2.anInt9646 == 75) {
				Static90.aFloat43 = 6.0F;
				Static90.aFloat42 = 6.0F;
			} else if (Static90.aClass2_Sub6_Sub21_2.anInt9646 == 100) {
				Static90.aFloat43 = 8.0F;
				Static90.aFloat42 = 8.0F;
			} else if (Static90.aClass2_Sub6_Sub21_2.anInt9646 == 200) {
				Static90.aFloat43 = 16.0F;
				Static90.aFloat42 = 16.0F;
			} else {
				Static90.aFloat43 = 8.0F;
				Static90.aFloat42 = 8.0F;
			}
			Static90.anInt3344 = (int) Static90.aFloat43 >> 1;
			Static90.aByteArrayArrayArray3 = Static496.method7087(Static90.anInt3344);
			Static360.method5164();
			Static90.method2928();
			Static127.aClass60_40 = new Class60();
			Static90.anInt3343 += (int) (Math.random() * 5.0D) - 2;
			if (Static90.anInt3343 < -8) {
				Static90.anInt3343 = -8;
			}
			Static90.anInt3345 += (int) (Math.random() * 5.0D) - 2;
			if (Static90.anInt3343 > 8) {
				Static90.anInt3343 = 8;
			}
			if (Static90.anInt3345 < -16) {
				Static90.anInt3345 = -16;
			}
			if (Static90.anInt3345 > 16) {
				Static90.anInt3345 = 16;
			}
			Static90.method2919(arg0, Static90.anInt3343 >> 2 << 10, Static90.anInt3345 >> 1);
			Static90.aClass196_3.method4191(1024, 256);
			Static90.aClass351_3.method8330(256, 256);
			Static90.aClass153_4.method3345(4096);
			Static153.aClass79_3.method1607(256);
			Static424.anInt6882 = 20;
		} else if (Static424.anInt6882 == 20) {
			Static713.method9477(true);
			Static90.method2915(arg1, Static90.anInt3343, Static90.anInt3345);
			Static424.anInt6882 = 60;
			Static713.method9477(true);
			Static534.method7497();
		} else if (Static424.anInt6882 == 60) {
			if (Static90.aClass254_75.method6070(Static90.aClass2_Sub6_Sub21_2.aString110 + "_staticelements")) {
				if (!Static90.aClass254_75.method6069(Static90.aClass2_Sub6_Sub21_2.aString110 + "_staticelements")) {
					return;
				}
				Static90.aClass372_3 = Static30.method434(Static102.aBoolean202, Static90.aClass2_Sub6_Sub21_2.aString110 + "_staticelements", Static90.aClass254_75);
			} else {
				Static90.aClass372_3 = new Class372(0);
			}
			Static90.method2914();
			Static424.anInt6882 = 70;
			Static713.method9477(true);
			Static534.method7497();
		} else if (Static424.anInt6882 == 70) {
			Static204.aClass76_4 = new Class76(arg1, 11, true, Static316.aCanvas1);
			Static424.anInt6882 = 73;
			Static713.method9477(true);
			Static534.method7497();
		} else if (Static424.anInt6882 == 73) {
			Static58.aClass76_1 = new Class76(arg1, 12, true, Static316.aCanvas1);
			Static424.anInt6882 = 76;
			Static713.method9477(true);
			Static534.method7497();
		} else if (Static424.anInt6882 == 76) {
			Static173.aClass76_3 = new Class76(arg1, 14, true, Static316.aCanvas1);
			Static424.anInt6882 = 79;
			Static713.method9477(true);
			Static534.method7497();
		} else if (Static424.anInt6882 == 79) {
			Static586.aClass76_8 = new Class76(arg1, 17, true, Static316.aCanvas1);
			Static424.anInt6882 = 82;
			Static713.method9477(true);
			Static534.method7497();
		} else if (Static424.anInt6882 == 82) {
			Static321.aClass76_6 = new Class76(arg1, 19, true, Static316.aCanvas1);
			Static424.anInt6882 = 85;
			Static713.method9477(true);
			Static534.method7497();
		} else if (Static424.anInt6882 == 85) {
			Static134.aClass76_2 = new Class76(arg1, 22, true, Static316.aCanvas1);
			Static424.anInt6882 = 88;
			Static713.method9477(true);
			Static534.method7497();
		} else if (Static424.anInt6882 == 88) {
			Static424.aClass76_7 = new Class76(arg1, 26, true, Static316.aCanvas1);
			Static424.anInt6882 = 91;
			Static713.method9477(true);
			Static534.method7497();
		} else {
			Static281.aClass76_5 = new Class76(arg1, 30, true, Static316.aCanvas1);
			Static424.anInt6882 = 100;
			Static713.method9477(true);
			Static534.method7497();
			System.gc();
		}
	}

	@OriginalMember(owner = "client!cka", name = "e", descriptor = "(I)V")
	public static void method1327() {
		@Pc(7) short local7 = 1024;
		@Pc(9) short local9 = 3072;
		if (Static591.aBoolean812) {
			local9 = 4096;
			if (Static232.aBoolean330) {
				local7 = 2048;
			}
		}
		if ((float) local7 > Static356.aFloat90) {
			Static356.aFloat90 = (float) local7;
		}
		if (Static356.aFloat90 > (float) local9) {
			Static356.aFloat90 = (float) local9;
		}
		while (Static213.aFloat46 >= 16384.0F) {
			Static213.aFloat46 -= 16384.0F;
		}
		while (Static213.aFloat46 < 0.0F) {
			Static213.aFloat46 += 16384.0F;
		}
		@Pc(75) int local75 = Static682.anInt11014 >> 9;
		@Pc(79) int local79 = Static506.anInt8028 >> 9;
		@Pc(85) int local85 = Static324.method4554(Static684.anInt10516, Static682.anInt11014, Static506.anInt8028);
		@Pc(87) int local87 = 0;
		@Pc(115) int local115;
		if (local75 > 3 && local79 > 3 && Static426.anInt6942 - 4 > local75 && local79 < Static280.anInt6752 - 4) {
			for (local115 = local75 - 4; local115 <= local75 + 4; local115++) {
				for (@Pc(123) int local123 = local79 - 4; local123 <= local79 + 4; local123++) {
					@Pc(127) int local127 = Static684.anInt10516;
					if (local127 < 3 && Static83.method1237(local115, local123)) {
						local127++;
					}
					@Pc(142) int local142 = 0;
					if (Static717.aClass199_Sub1_2.aByteArrayArrayArray15 != null && Static717.aClass199_Sub1_2.aByteArrayArrayArray15[local127] != null) {
						local142 = (Static717.aClass199_Sub1_2.aByteArrayArrayArray15[local127][local115][local123] & 0xFF) * 8 << 2;
					}
					if (Static158.aClass133Array4 != null && Static158.aClass133Array4[local127] != null) {
						@Pc(188) int local188 = local85 + local142 - Static158.aClass133Array4[local127].method8217(local115, local123);
						if (local188 > local87) {
							local87 = local188;
						}
					}
				}
			}
		}
		local115 = (local87 >> 2) * 1536;
		if (local115 > 786432) {
			local115 = 786432;
		}
		if (local115 < 262144) {
			local115 = 262144;
		}
		if (Static303.anInt4644 < local115) {
			Static303.anInt4644 += (local115 - Static303.anInt4644) / 24;
		} else if (local115 < Static303.anInt4644) {
			Static303.anInt4644 += (local115 - Static303.anInt4644) / 80;
			return;
		}
	}
}
