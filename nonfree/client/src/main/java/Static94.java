import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static94 {

	@OriginalMember(owner = "client!fe", name = "d", descriptor = "Lclient!a;")
	public static Class1 aClass1_7;

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(I)V")
	public static void method4860() {
		if (Static344.anInt6327 == 10 || Static344.anInt6327 == 28) {
			Static289.method4414(Static22.anInt547 >> 10, Static160.anInt2915 >> 10);
		} else if (Static267.aClass12_Sub1_Sub2_Sub2_1.anInt6328 >= 0 && Static392.anInt6751 * 128 > Static267.aClass12_Sub1_Sub2_Sub2_1.anInt6328 && Static267.aClass12_Sub1_Sub2_Sub2_1.anInt6317 >= 0 && Static307.anInt5484 * 128 > Static267.aClass12_Sub1_Sub2_Sub2_1.anInt6317) {
			Static289.method4414(Static267.aClass12_Sub1_Sub2_Sub2_1.anIntArray658[0] >> 3, Static267.aClass12_Sub1_Sub2_Sub2_1.anIntArray659[0] >> 3);
		} else {
			Static289.method4414(Static307.anInt5484 >> 4, Static392.anInt6751 >> 4);
		}
		Static121.method2205();
		Static63.method1165();
		Static214.method3616();
		Static359.method5433();
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(BLclient!km;Lclient!bc;)V")
	public static void method4863(@OriginalArg(1) Class82 arg0, @OriginalArg(2) Interface1 arg1) {
		if (Static302.aClass2_Sub1_Sub17_2 == null) {
			return;
		}
		if (Static74.anInt4012 < 10) {
			if (!Static302.aClass71_5.method1578(Static302.aClass2_Sub1_Sub17_2.aString65)) {
				Static74.anInt4012 = Static71.aClass71_18.method1575(Static302.aClass2_Sub1_Sub17_2.aString65) / 10;
				return;
			}
			Static221.method3734();
			Static74.anInt4012 = 10;
		}
		if (Static74.anInt4012 == 10) {
			Static302.anInt396 = Static302.aClass2_Sub1_Sub17_2.anInt6741 >> 6 << 6;
			Static302.anInt387 = Static302.aClass2_Sub1_Sub17_2.anInt6737 >> 6 << 6;
			Static302.anInt393 = (Static302.aClass2_Sub1_Sub17_2.anInt6738 >> 6 << 6) + 64 - Static302.anInt396;
			Static302.anInt389 = (Static302.aClass2_Sub1_Sub17_2.anInt6744 >> 6 << 6) + 64 - Static302.anInt387;
			@Pc(78) int[] local78 = new int[3];
			@Pc(80) int local80 = -1;
			@Pc(82) int local82 = -1;
			if (Static302.aClass2_Sub1_Sub17_2.method5756(Static133.anInt2474 + (Static267.aClass12_Sub1_Sub2_Sub2_1.anInt6317 >> 7), local78, Static267.aClass12_Sub1_Sub2_Sub2_1.aByte74, (Static267.aClass12_Sub1_Sub2_Sub2_1.anInt6328 >> 7) + Static376.anInt6607)) {
				local82 = local78[2] - Static302.anInt387;
				local80 = local78[1] - Static302.anInt396;
			}
			if (!Static119.aBoolean182 && local80 >= 0 && local80 < Static302.anInt393 && local82 >= 0 && local82 < Static302.anInt389) {
				local82 += (int) (Math.random() * 10.0D) - 5;
				local80 += (int) (Math.random() * 10.0D) - 5;
				Static284.anInt5040 = local80;
				Static318.anInt4656 = local82;
			} else if (Static66.anInt5488 == -1 || Static262.anInt2982 == -1) {
				Static302.aClass2_Sub1_Sub17_2.method5758(Static302.aClass2_Sub1_Sub17_2.anInt6736 >> 14 & 0x3FFF, Static302.aClass2_Sub1_Sub17_2.anInt6736 & 0x3FFF, local78);
				Static318.anInt4656 = local78[2] - Static302.anInt387;
				Static284.anInt5040 = local78[1] - Static302.anInt396;
			} else {
				Static302.aClass2_Sub1_Sub17_2.method5758(Static66.anInt5488, Static262.anInt2982, local78);
				Static262.anInt2982 = -1;
				Static66.anInt5488 = -1;
				if (local78 != null) {
					Static318.anInt4656 = local78[2] - Static302.anInt387;
					Static284.anInt5040 = local78[1] - Static302.anInt396;
				}
				Static119.aBoolean182 = false;
			}
			if (Static302.aClass2_Sub1_Sub17_2.anInt6746 == 37) {
				Static302.aFloat7 = 3.0F;
				Static302.aFloat6 = 3.0F;
			} else if (Static302.aClass2_Sub1_Sub17_2.anInt6746 == 50) {
				Static302.aFloat7 = 4.0F;
				Static302.aFloat6 = 4.0F;
			} else if (Static302.aClass2_Sub1_Sub17_2.anInt6746 == 75) {
				Static302.aFloat7 = 6.0F;
				Static302.aFloat6 = 6.0F;
			} else if (Static302.aClass2_Sub1_Sub17_2.anInt6746 == 100) {
				Static302.aFloat7 = 8.0F;
				Static302.aFloat6 = 8.0F;
			} else if (Static302.aClass2_Sub1_Sub17_2.anInt6746 == 200) {
				Static302.aFloat7 = 16.0F;
				Static302.aFloat6 = 16.0F;
			} else {
				Static302.aFloat7 = 8.0F;
				Static302.aFloat6 = 8.0F;
			}
			Static302.anInt385 = (int) Static302.aFloat7 >> 1;
			Static302.aByteArrayArrayArray2 = Static342.method5240(Static302.anInt385);
			Static149.method2528();
			Static302.method480();
			Static100.aClass210_16 = new Class210();
			Static302.anInt383 += (int) (Math.random() * 5.0D) - 2;
			if (Static302.anInt383 < -8) {
				Static302.anInt383 = -8;
			}
			Static302.anInt384 += (int) (Math.random() * 5.0D) - 2;
			if (Static302.anInt383 > 8) {
				Static302.anInt383 = 8;
			}
			if (Static302.anInt384 < -16) {
				Static302.anInt384 = -16;
			}
			if (Static302.anInt384 > 16) {
				Static302.anInt384 = 16;
			}
			Static302.method473(arg1, Static302.anInt383 >> 2 << 10, Static302.anInt384 >> 1);
			Static302.aClass211_2.method5054(1024, 256);
			Static302.aClass181_2.method4321(256, 256);
			Static302.aClass123_3.method2704(4096);
			Static130.aClass162_1.method3879(256);
			Static74.anInt4012 = 20;
		} else if (Static74.anInt4012 == 20) {
			Static370.method5570(true);
			Static302.method483(arg0, Static302.anInt383, Static302.anInt384);
			Static74.anInt4012 = 60;
			Static370.method5570(true);
			Static384.method5704();
		} else if (Static74.anInt4012 == 60) {
			if (Static302.aClass71_5.method1582(Static302.aClass2_Sub1_Sub17_2.aString65 + "_staticelements")) {
				if (!Static302.aClass71_5.method1578(Static302.aClass2_Sub1_Sub17_2.aString65 + "_staticelements")) {
					return;
				}
				Static302.aClass159_2 = Static272.method4277(Static302.aClass71_5, Static6.aBoolean4, Static302.aClass2_Sub1_Sub17_2.aString65 + "_staticelements");
			} else {
				Static302.aClass159_2 = new Class159(0);
			}
			Static302.method476();
			Static74.anInt4012 = 70;
			Static370.method5570(true);
			Static384.method5704();
		} else if (Static74.anInt4012 == 70) {
			Static155.aClass176_6 = new Class176(arg0, 11, true, Static170.aCanvas4);
			Static74.anInt4012 = 73;
			Static370.method5570(true);
			Static384.method5704();
		} else if (Static74.anInt4012 == 73) {
			Static170.aClass176_7 = new Class176(arg0, 12, true, Static170.aCanvas4);
			Static74.anInt4012 = 76;
			Static370.method5570(true);
			Static384.method5704();
		} else if (Static74.anInt4012 == 76) {
			Static172.aClass176_8 = new Class176(arg0, 14, true, Static170.aCanvas4);
			Static74.anInt4012 = 79;
			Static370.method5570(true);
			Static384.method5704();
		} else if (Static74.anInt4012 == 79) {
			Static13.aClass176_1 = new Class176(arg0, 17, true, Static170.aCanvas4);
			Static74.anInt4012 = 82;
			Static370.method5570(true);
			Static384.method5704();
		} else if (Static74.anInt4012 == 82) {
			Static386.aClass176_3 = new Class176(arg0, 19, true, Static170.aCanvas4);
			Static74.anInt4012 = 85;
			Static370.method5570(true);
			Static384.method5704();
		} else if (Static74.anInt4012 == 85) {
			Static135.aClass176_5 = new Class176(arg0, 22, true, Static170.aCanvas4);
			Static74.anInt4012 = 88;
			Static370.method5570(true);
			Static384.method5704();
		} else if (Static74.anInt4012 == 88) {
			Static118.aClass176_4 = new Class176(arg0, 26, true, Static170.aCanvas4);
			Static74.anInt4012 = 91;
			Static370.method5570(true);
			Static384.method5704();
		} else {
			Static369.aClass176_9 = new Class176(arg0, 30, true, Static170.aCanvas4);
			Static74.anInt4012 = 100;
			Static370.method5570(true);
			Static384.method5704();
			System.gc();
		}
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(Lclient!pf;BI)V")
	public static void method4864(@OriginalArg(0) Class2_Sub13_Sub2 arg0, @OriginalArg(2) int arg1) {
		Static145.aBoolean201 = false;
		Static254.anInt4548 = 0;
		Static237.method3864(arg0);
		Static377.method5661(arg0);
		if (Static145.aBoolean201) {
			System.out.println("---endgpp---");
		}
		if (arg1 != arg0.anInt4788) {
			throw new RuntimeException("gpi1 pos:" + arg0.anInt4788 + " psize:" + arg1);
		}
	}
}
