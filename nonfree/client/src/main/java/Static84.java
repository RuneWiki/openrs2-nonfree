import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static84 {

	@OriginalMember(owner = "client!ec", name = "K", descriptor = "[Lclient!rn;")
	public static Class219[] aClass219Array2;

	@OriginalMember(owner = "client!ec", name = "J", descriptor = "[I")
	public static final int[] anIntArray167 = new int[] { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99 };

	@OriginalMember(owner = "client!ec", name = "M", descriptor = "[Lclient!mj;")
	public static final Class168[] aClass168Array1 = new Class168[16];

	@OriginalMember(owner = "client!ec", name = "N", descriptor = "I")
	public static int anInt1632 = 104;

	@OriginalMember(owner = "client!ec", name = "P", descriptor = "Z")
	public static boolean aBoolean137 = false;

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(ZLclient!km;)V")
	public static void method1519(@OriginalArg(1) Class48_Sub6 arg0) {
		arg0.aClass3_1 = null;
		@Pc(22) int local22 = arg0.aClass48_Sub7Array1.length;
		for (@Pc(24) int local24 = 0; local24 < local22; local24++) {
			arg0.aClass48_Sub7Array1[local24].aBoolean329 = false;
		}
		@Pc(38) Class128[] local38 = Class3_Sub2_Sub1.aClass128Array1;
		synchronized (Class3_Sub2_Sub1.aClass128Array1) {
			if (local22 < Class3_Sub2_Sub1.aClass128Array1.length && Static384.anIntArray555[local22] < 200) {
				Class3_Sub2_Sub1.aClass128Array1[local22].method2833(arg0);
				@Pc(59) int local59 = Static384.anIntArray555[local22]++;
			}
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lclient!vl;Lclient!qq;I)V")
	public static void method1520(@OriginalArg(0) Interface11 arg0, @OriginalArg(1) Class28 arg1) {
		if (Static36.aClass6_Sub1_Sub4_2 == null) {
			return;
		}
		if (Static126.anInt4528 < 10) {
			if (!Static36.aClass158_28.method3667(Static36.aClass6_Sub1_Sub4_2.aString11)) {
				Static126.anInt4528 = Static422.aClass158_88.method3666(Static36.aClass6_Sub1_Sub4_2.aString11) / 10;
				return;
			}
			Static92.method1590();
			Static126.anInt4528 = 10;
		}
		if (Static126.anInt4528 == 10) {
			Static36.anInt2243 = Static36.aClass6_Sub1_Sub4_2.anInt1199 >> 6 << 6;
			Static36.anInt2246 = Static36.aClass6_Sub1_Sub4_2.anInt1192 >> 6 << 6;
			Static36.anInt2248 = (Static36.aClass6_Sub1_Sub4_2.anInt1198 >> 6 << 6) + 64 - Static36.anInt2246;
			Static36.anInt2241 = (Static36.aClass6_Sub1_Sub4_2.anInt1187 >> 6 << 6) + (64 - Static36.anInt2243);
			@Pc(81) int[] local81 = new int[3];
			@Pc(83) int local83 = -1;
			@Pc(85) int local85 = -1;
			if (Static36.aClass6_Sub1_Sub4_2.method1066(Static206.anInt3592 + (Static134.aClass3_Sub3_Sub6_Sub1_1.anInt6675 >> 7), (Static134.aClass3_Sub3_Sub6_Sub1_1.anInt6677 >> 7) + Static99.anInt1814, local81, Static134.aClass3_Sub3_Sub6_Sub1_1.aByte93)) {
				local85 = local81[2] - Static36.anInt2243;
				local83 = local81[1] - Static36.anInt2246;
			}
			if (!Static289.aBoolean346 && local83 >= 0 && Static36.anInt2248 > local83 && local85 >= 0 && local85 < Static36.anInt2241) {
				local85 += (int) (Math.random() * 10.0D) - 5;
				local83 += (int) (Math.random() * 10.0D) - 5;
				Static70.anInt1464 = local85;
				Static187.anInt3261 = local83;
			} else if (Static397.anInt6565 == -1 || Static238.anInt4073 == -1) {
				Static36.aClass6_Sub1_Sub4_2.method1067(local81, Static36.aClass6_Sub1_Sub4_2.anInt1200 >> 14 & 0x3FFF, Static36.aClass6_Sub1_Sub4_2.anInt1200 & 0x3FFF);
				Static70.anInt1464 = local81[2] - Static36.anInt2243;
				Static187.anInt3261 = local81[1] - Static36.anInt2246;
			} else {
				Static36.aClass6_Sub1_Sub4_2.method1067(local81, Static397.anInt6565, Static238.anInt4073);
				Static289.aBoolean346 = false;
				if (local81 != null) {
					Static70.anInt1464 = local81[2] - Static36.anInt2243;
					Static187.anInt3261 = local81[1] - Static36.anInt2246;
				}
				Static238.anInt4073 = -1;
				Static397.anInt6565 = -1;
			}
			if (Static36.aClass6_Sub1_Sub4_2.anInt1202 == 37) {
				Static36.aFloat47 = 3.0F;
				Static36.aFloat46 = 3.0F;
			} else if (Static36.aClass6_Sub1_Sub4_2.anInt1202 == 50) {
				Static36.aFloat47 = 4.0F;
				Static36.aFloat46 = 4.0F;
			} else if (Static36.aClass6_Sub1_Sub4_2.anInt1202 == 75) {
				Static36.aFloat47 = 6.0F;
				Static36.aFloat46 = 6.0F;
			} else if (Static36.aClass6_Sub1_Sub4_2.anInt1202 == 100) {
				Static36.aFloat47 = 8.0F;
				Static36.aFloat46 = 8.0F;
			} else if (Static36.aClass6_Sub1_Sub4_2.anInt1202 == 200) {
				Static36.aFloat47 = 16.0F;
				Static36.aFloat46 = 16.0F;
			} else {
				Static36.aFloat47 = 8.0F;
				Static36.aFloat46 = 8.0F;
			}
			Static36.anInt2237 = (int) Static36.aFloat47 >> 1;
			Static36.aByteArrayArrayArray2 = Static338.method4783(Static36.anInt2237);
			Static380.method5244();
			Static36.method2059();
			Static200.aClass88_31 = new Class88();
			Static36.anInt2238 += (int) (Math.random() * 5.0D) - 2;
			if (Static36.anInt2238 < -8) {
				Static36.anInt2238 = -8;
			}
			if (Static36.anInt2238 > 8) {
				Static36.anInt2238 = 8;
			}
			Static36.anInt2236 += (int) (Math.random() * 5.0D) - 2;
			if (Static36.anInt2236 < -16) {
				Static36.anInt2236 = -16;
			}
			if (Static36.anInt2236 > 16) {
				Static36.anInt2236 = 16;
			}
			Static36.method2064(arg0, Static36.anInt2238 >> 2 << 10, Static36.anInt2236 >> 1);
			Static36.aClass254_5.method5842(256, 1024);
			Static36.aClass190_2.method4322(256, 256);
			Static36.aClass127_3.method2826(4096);
			Static427.aClass58_1.method1466(256);
			Static126.anInt4528 = 20;
		} else if (Static126.anInt4528 == 20) {
			Static401.method5464(true);
			Static36.method2050(arg1, Static36.anInt2238, Static36.anInt2236);
			Static126.anInt4528 = 60;
			Static401.method5464(true);
			Static100.method402();
		} else if (Static126.anInt4528 == 60) {
			if (Static36.aClass158_28.method3682(Static36.aClass6_Sub1_Sub4_2.aString11 + "_staticelements")) {
				if (!Static36.aClass158_28.method3667(Static36.aClass6_Sub1_Sub4_2.aString11 + "_staticelements")) {
					return;
				}
				Static36.aClass267_3 = Static126.method4052(Static118.aBoolean158, Static36.aClass6_Sub1_Sub4_2.aString11 + "_staticelements", Static36.aClass158_28);
			} else {
				Static36.aClass267_3 = new Class267(0);
			}
			Static36.method2067();
			Static126.anInt4528 = 70;
			Static401.method5464(true);
			Static100.method402();
		} else if (Static126.anInt4528 == 70) {
			Static125.aClass152_5 = new Class152(arg1, 11, true, Static314.aCanvas8);
			Static126.anInt4528 = 73;
			Static401.method5464(true);
			Static100.method402();
		} else if (Static126.anInt4528 == 73) {
			Static393.aClass152_9 = new Class152(arg1, 12, true, Static314.aCanvas8);
			Static126.anInt4528 = 76;
			Static401.method5464(true);
			Static100.method402();
		} else if (Static126.anInt4528 == 76) {
			Static165.aClass152_6 = new Class152(arg1, 14, true, Static314.aCanvas8);
			Static126.anInt4528 = 79;
			Static401.method5464(true);
			Static100.method402();
		} else if (Static126.anInt4528 == 79) {
			Static343.aClass152_11 = new Class152(arg1, 17, true, Static314.aCanvas8);
			Static126.anInt4528 = 82;
			Static401.method5464(true);
			Static100.method402();
		} else if (Static126.anInt4528 == 82) {
			Static336.aClass152_10 = new Class152(arg1, 19, true, Static314.aCanvas8);
			Static126.anInt4528 = 85;
			Static401.method5464(true);
			Static100.method402();
		} else if (Static126.anInt4528 == 85) {
			Static178.aClass152_2 = new Class152(arg1, 22, true, Static314.aCanvas8);
			Static126.anInt4528 = 88;
			Static401.method5464(true);
			Static100.method402();
		} else if (Static126.anInt4528 == 88) {
			Static321.aClass152_8 = new Class152(arg1, 26, true, Static314.aCanvas8);
			Static126.anInt4528 = 91;
			Static401.method5464(true);
			Static100.method402();
		} else {
			Static207.aClass152_7 = new Class152(arg1, 30, true, Static314.aCanvas8);
			Static126.anInt4528 = 100;
			Static401.method5464(true);
			Static100.method402();
			System.gc();
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;B)V")
	public static void method1521(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) String arg4) {
		Static243.method3768(arg0, -1, null, arg2, arg3, arg1, arg4);
	}
}
