import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static86 {

	@OriginalMember(owner = "client!cw", name = "h", descriptor = "B")
	public static byte aByte29;

	@OriginalMember(owner = "client!cw", name = "i", descriptor = "I")
	public static int anInt2582;

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(Lclient!ha;B)V")
	public static void method2435(@OriginalArg(0) Class20 arg0) {
		if (Static298.anInt6262 < 2 && !Static475.aBoolean695 || Static612.aClass24_17 != null) {
			return;
		}
		@Pc(42) String local42;
		if (Static475.aBoolean695 && Static298.anInt6262 < 2) {
			local42 = Static225.aString48 + Static588.aClass351_34.method8691(Static476.anInt8915) + Static225.aString47 + " ->";
		} else if (Static362.aBoolean525 && Static449.aClass90_1.method8781(81) && Static298.anInt6262 > 2) {
			local42 = Static74.method2135(Static74.aClass2_Sub6_Sub3_1);
		} else {
			@Pc(56) Class2_Sub6_Sub3 local56 = Static74.aClass2_Sub6_Sub3_1;
			if (local56 == null) {
				return;
			}
			local42 = Static74.method2135(local56);
			@Pc(65) int[] local65 = null;
			if (Static396.method6492(local56.anInt2631)) {
				local65 = Static635.aClass336_2.method8424((int) local56.aLong61).anIntArray602;
			} else if (local56.anInt2626 != -1) {
				local65 = Static635.aClass336_2.method8424(local56.anInt2626).anIntArray602;
			} else if (Static299.method5338(local56.anInt2631)) {
				@Pc(96) Class2_Sub33 local96 = (Class2_Sub33) Static600.aClass99_79.method3056((long) local56.aLong61);
				if (local96 != null) {
					@Pc(101) Class3_Sub1_Sub3_Sub3_Sub1 local101 = local96.aClass3_Sub1_Sub3_Sub3_Sub1_2;
					@Pc(104) Class27 local104 = local101.aClass27_1;
					if (local104.anIntArray43 != null) {
						local104 = local104.method727(Static286.aClass263_3);
					}
					if (local104 != null) {
						local65 = local104.anIntArray42;
					}
				}
			} else if (Static613.method8966(local56.anInt2631)) {
				@Pc(140) Class161 local140;
				if (local56.anInt2631 == 1001) {
					local140 = Static27.aClass342_3.method8534((int) local56.aLong61);
				} else {
					local140 = Static27.aClass342_3.method8534((int) (local56.aLong61 >>> 32 & 0x7FFFFFFFL));
				}
				if (local140.anIntArray288 != null) {
					local140 = local140.method4606(Static286.aClass263_3);
				}
				if (local140 != null) {
					local65 = local140.anIntArray286;
				}
			}
			if (local65 != null) {
				local42 = local42 + Static421.method6792(local65);
			}
		}
		if (Static298.anInt6262 > 2) {
			local42 = local42 + "<col=ffffff> / " + (Static298.anInt6262 - 2) + Static588.aClass351_27.method8691(Static476.anInt8915);
		}
		if (Static491.aClass24_16 != null) {
			@Pc(217) Class68 local217 = Static491.aClass24_16.method612(arg0);
			if (local217 == null) {
				local217 = Static571.aClass68_12;
			}
			local217.method8116(Static437.anIntArray536, Static491.aClass24_16.anInt441, Static117.aClass46Array5, Static491.aClass24_16.anInt436, Static491.aClass24_16.anInt464, Static491.aClass24_16.anInt488, Static491.aClass24_16.anInt500, Static507.aRandom1, Static491.aClass24_16.anInt473, Static230.anInt5090, Static134.anInt3332, Static103.anInt2856, local42, Static471.anIntArray562);
			Static18.method369(Static471.anIntArray562[0], Static471.anIntArray562[2], Static471.anIntArray562[1], Static471.anIntArray562[3]);
		} else if (Static214.aClass24_9 != null && Static423.aClass316_4 == Static195.aClass316_2) {
			@Pc(282) int local282 = Static571.aClass68_12.method8102(Static134.anInt3332, Static437.anIntArray536, local42, Static117.aClass46Array5, Static178.anInt4288 + 16, Static368.anInt7333 + 4, Static507.aRandom1);
			Static18.method369(Static368.anInt7333 + 4, Static161.aClass239_14.method6482(local42) + local282, Static178.anInt4288, 16);
		}
	}
}
