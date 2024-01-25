import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static95 {

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "Lclient!dp;")
	public static Class53 aClass53_46;

	@OriginalMember(owner = "client!gb", name = "c", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame2;

	@OriginalMember(owner = "client!gb", name = "s", descriptor = "B")
	public static byte aByte21;

	@OriginalMember(owner = "client!gb", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString63 = "Take";

	@OriginalMember(owner = "client!gb", name = "k", descriptor = "Z")
	public static boolean aBoolean127 = false;

	@OriginalMember(owner = "client!gb", name = "r", descriptor = "[I")
	public static final int[] anIntArray245 = new int[1000];

	@OriginalMember(owner = "client!gb", name = "t", descriptor = "J")
	public static long aLong58 = 0L;

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(BLclient!dp;)V")
	public static void method1716(@OriginalArg(1) Class53 arg0) {
		Static326.aClass53_148 = arg0;
	}

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "(B)V")
	public static void method1718() {
		@Pc(7) Class201 local7 = null;
		try {
			@Pc(18) Class196 local18 = Static308.aClass206_5.method5509();
			while (local18.anInt5851 == 0) {
				Static278.method5283(1L);
			}
			if (local18.anInt5851 == 1) {
				local7 = (Class201) local18.anObject8;
				@Pc(44) Class6_Sub10 local44 = new Class6_Sub10(Static115.anInt2151 * 6 + 3);
				local44.method3968(1);
				local44.method4025(Static115.anInt2151);
				for (@Pc(54) int local54 = 0; local54 < Static295.anIntArray624.length; local54++) {
					if (Static6.aBooleanArray1[local54]) {
						local44.method4025(local54);
						local44.method3976(Static295.anIntArray624[local54]);
					}
				}
				local7.method5364(local44.anInt4188, 0, local44.aByteArray67);
			}
		} catch (@Pc(89) Exception local89) {
		}
		try {
			if (local7 != null) {
				local7.method5359();
			}
		} catch (@Pc(96) Exception local96) {
		}
		Static152.aLong101 = Static245.method4300();
		Static90.aBoolean119 = false;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lclient!ja;Lclient!cj;B)V")
	public static void method1719(@OriginalArg(0) Class81 arg0, @OriginalArg(1) Interface2 arg1) {
		if (Static307.aClass6_Sub2_Sub19_2 == null) {
			return;
		}
		if (Static271.anInt5044 < 10) {
			if (!Static307.aClass53_34.method1007(Static307.aClass6_Sub2_Sub19_2.aString257)) {
				Static271.anInt5044 = Static138.aClass53_114.method1016(Static307.aClass6_Sub2_Sub19_2.aString257) / 10;
				return;
			}
			Static184.method3477();
			Static271.anInt5044 = 10;
		}
		if (Static271.anInt5044 == 10) {
			Static307.anInt1195 = Static307.aClass6_Sub2_Sub19_2.anInt5668 >> 6 << 6;
			Static307.anInt1200 = Static307.aClass6_Sub2_Sub19_2.anInt5677 >> 6 << 6;
			Static307.anInt1198 = (Static307.aClass6_Sub2_Sub19_2.anInt5670 >> 6 << 6) + 64 - Static307.anInt1195;
			Static307.anInt1202 = (Static307.aClass6_Sub2_Sub19_2.anInt5675 >> 6 << 6) + 64 - Static307.anInt1200;
			@Pc(74) int[] local74 = new int[3];
			@Pc(76) int local76 = -1;
			@Pc(78) int local78 = -1;
			if (Static307.aClass6_Sub2_Sub19_2.method5160(Static44.anInt881 + (Static253.aClass44_Sub4_Sub4_Sub1_1.anInt6340 >> 7), Static343.anInt6225, Static300.anInt5672 + (Static253.aClass44_Sub4_Sub4_Sub1_1.anInt6339 >> 7), local74)) {
				local76 = local74[1] - Static307.anInt1200;
				local78 = local74[2] - Static307.anInt1195;
			}
			if (!Static2.aBoolean7 && local76 >= 0 && Static307.anInt1202 > local76 && local78 >= 0 && local78 < Static307.anInt1198) {
				local78 += (int) (Math.random() * 10.0D) - 5;
				local76 += (int) (Math.random() * 10.0D) - 5;
				Static23.anInt371 = local78;
				Static61.anInt1126 = local76;
			} else if (Static114.anInt2141 == -1 || Static125.anInt2331 == -1) {
				Static307.aClass6_Sub2_Sub19_2.method5152(Static307.aClass6_Sub2_Sub19_2.anInt5671 >> 14 & 0x3FFF, Static307.aClass6_Sub2_Sub19_2.anInt5671 & 0x3FFF, local74);
				Static23.anInt371 = local74[2] - Static307.anInt1195;
				Static61.anInt1126 = local74[1] - Static307.anInt1200;
			} else {
				Static307.aClass6_Sub2_Sub19_2.method5152(Static114.anInt2141, Static125.anInt2331, local74);
				Static125.anInt2331 = -1;
				Static114.anInt2141 = -1;
				Static2.aBoolean7 = false;
				if (local74 != null) {
					Static61.anInt1126 = local74[1] - Static307.anInt1200;
					Static23.anInt371 = local74[2] - Static307.anInt1195;
				}
			}
			if (Static307.aClass6_Sub2_Sub19_2.anInt5686 == 37) {
				Static307.aFloat17 = 3.0F;
				Static307.aFloat18 = 3.0F;
			} else if (Static307.aClass6_Sub2_Sub19_2.anInt5686 == 50) {
				Static307.aFloat17 = 4.0F;
				Static307.aFloat18 = 4.0F;
			} else if (Static307.aClass6_Sub2_Sub19_2.anInt5686 == 75) {
				Static307.aFloat17 = 6.0F;
				Static307.aFloat18 = 6.0F;
			} else if (Static307.aClass6_Sub2_Sub19_2.anInt5686 == 100) {
				Static307.aFloat17 = 8.0F;
				Static307.aFloat18 = 8.0F;
			} else if (Static307.aClass6_Sub2_Sub19_2.anInt5686 == 200) {
				Static307.aFloat17 = 16.0F;
				Static307.aFloat18 = 16.0F;
			} else {
				Static307.aFloat17 = 8.0F;
				Static307.aFloat18 = 8.0F;
			}
			Static307.anInt1191 = (int) Static307.aFloat17 >> 1;
			Static307.aByteArrayArrayArray6 = Static212.method3767(Static307.anInt1191);
			Static323.method5376();
			Static307.method1103();
			Static225.aClass211_25 = new Class211();
			Static92.aClass4_1 = new Class4();
			Static307.anInt1192 += (int) (Math.random() * 5.0D) - 2;
			if (Static307.anInt1192 < -8) {
				Static307.anInt1192 = -8;
			}
			Static307.anInt1190 += (int) (Math.random() * 5.0D) - 2;
			if (Static307.anInt1192 > 8) {
				Static307.anInt1192 = 8;
			}
			if (Static307.anInt1190 < -16) {
				Static307.anInt1190 = -16;
			}
			if (Static307.anInt1190 > 16) {
				Static307.anInt1190 = 16;
			}
			Static307.method1110(arg1, Static307.anInt1192 >> 2 << 10, Static307.anInt1190 >> 1);
			Static60.method984(1024, 256);
			Static270.method4579(256, 256);
			Static47.method791(4096);
			Static23.method350(256);
			Static271.anInt5044 = 20;
		} else if (Static271.anInt5044 == 20) {
			Static105.method2133(true);
			Static307.method1091(arg0, Static307.anInt1192, Static307.anInt1190);
			Static271.anInt5044 = 60;
			Static105.method2133(true);
			Static303.method5210();
		} else if (Static271.anInt5044 == 60) {
			if (Static307.aClass53_34.method1034(Static307.aClass6_Sub2_Sub19_2.aString257 + "_staticelements")) {
				if (!Static307.aClass53_34.method1007(Static307.aClass6_Sub2_Sub19_2.aString257 + "_staticelements")) {
					return;
				}
				Static307.aClass41_3 = Static207.method3712(Static177.aBoolean242, Static307.aClass6_Sub2_Sub19_2.aString257 + "_staticelements", Static307.aClass53_34);
			} else {
				Static307.aClass41_3 = new Class41(0);
			}
			Static307.method1107();
			Static271.anInt5044 = 70;
			Static105.method2133(true);
			Static303.method5210();
		} else if (Static271.anInt5044 == 70) {
			Static11.aClass49_1 = new Class49(arg0, 11, true, Static354.aCanvas5);
			Static271.anInt5044 = 73;
			Static105.method2133(true);
			Static303.method5210();
		} else if (Static271.anInt5044 == 73) {
			Static19.aClass49_2 = new Class49(arg0, 12, true, Static354.aCanvas5);
			Static271.anInt5044 = 76;
			Static105.method2133(true);
			Static303.method5210();
		} else if (Static271.anInt5044 == 76) {
			Static151.aClass49_4 = new Class49(arg0, 14, true, Static354.aCanvas5);
			Static271.anInt5044 = 79;
			Static105.method2133(true);
			Static303.method5210();
		} else if (Static271.anInt5044 == 79) {
			Static165.aClass49_8 = new Class49(arg0, 17, true, Static354.aCanvas5);
			Static271.anInt5044 = 82;
			Static105.method2133(true);
			Static303.method5210();
		} else if (Static271.anInt5044 == 82) {
			Static350.aClass49_9 = new Class49(arg0, 19, true, Static354.aCanvas5);
			Static271.anInt5044 = 85;
			Static105.method2133(true);
			Static303.method5210();
		} else if (Static271.anInt5044 == 85) {
			Static98.aClass49_3 = new Class49(arg0, 22, true, Static354.aCanvas5);
			Static271.anInt5044 = 88;
			Static105.method2133(true);
			Static303.method5210();
		} else if (Static271.anInt5044 == 88) {
			Static190.aClass49_6 = new Class49(arg0, 26, true, Static354.aCanvas5);
			Static271.anInt5044 = 91;
			Static105.method2133(true);
			Static303.method5210();
		} else {
			Static200.aClass49_7 = new Class49(arg0, 30, true, Static354.aCanvas5);
			Static271.anInt5044 = 100;
			Static105.method2133(true);
			Static303.method5210();
			System.gc();
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(I)Lclient!ll;")
	public static Class123 method1720() {
		try {
			return (Class123) Class.forName("Class123_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}

	@OriginalMember(owner = "client!gb", name = "c", descriptor = "(B)V")
	public static void method1724() {
		if (Static16.method287() || Static343.anInt6225 == Static77.anInt1421) {
			Static150.method2943(Static289.aClass81_7);
			if (Static343.anInt6225 != Static318.anInt5893) {
				Static273.method5573();
			}
		} else {
			Static292.method4993(Static253.aClass44_Sub4_Sub4_Sub1_1.anIntArray561[0], Static154.anInt2914, Static253.aClass44_Sub4_Sub4_Sub1_1.anIntArray560[0], Static296.anInt5969, Static343.anInt6225, false, false);
		}
	}
}
