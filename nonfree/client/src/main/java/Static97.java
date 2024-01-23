import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static97 {

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "I")
	public static int anInt3555;

	@OriginalMember(owner = "client!ia", name = "b", descriptor = "Lclient!hc;")
	public static Class51 aClass51_49;

	@OriginalMember(owner = "client!ia", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString231 = "glow3:";

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(B)V")
	public static void method2668() {
		Static157.aClass79_20.method2489();
		Static96.aClass79_14.method2489();
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(Lclient!ol;B)V")
	public static void method2671(@OriginalArg(0) Class1_Sub21 arg0) {
		@Pc(5) int local5 = -1;
		@Pc(7) long local7 = 0L;
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		if (arg0.anInt4025 == 0) {
			local7 = Static11.method222(arg0.anInt4024, arg0.anInt4014, arg0.anInt4015);
		}
		if (arg0.anInt4025 == 1) {
			local7 = Static101.method2105(arg0.anInt4024, arg0.anInt4014, arg0.anInt4015);
		}
		if (arg0.anInt4025 == 2) {
			local7 = Static60.method1145(arg0.anInt4024, arg0.anInt4014, arg0.anInt4015);
		}
		if (arg0.anInt4025 == 3) {
			local7 = Static201.method3337(arg0.anInt4024, arg0.anInt4014, arg0.anInt4015);
		}
		if (local7 != 0L) {
			local11 = (int) local7 >> 20 & 0x3;
			local9 = (int) local7 >> 14 & 0x1F;
			local5 = Integer.MAX_VALUE & (int) (local7 >>> 32);
		}
		arg0.anInt4017 = local5;
		arg0.anInt4023 = local11;
		arg0.anInt4020 = local9;
	}

	@OriginalMember(owner = "client!ia", name = "b", descriptor = "(I)V")
	public static void method2672() {
		Static186.anInt4188 = 0;
		Static253.anInt3818 = 0;
		Static121.method2366();
		Static233.method3884();
		Static56.method1073();
		Static113.method4192();
		@Pc(25) int local25;
		for (@Pc(19) int local19 = 0; local19 < Static186.anInt4188; local19++) {
			local25 = Static223.anIntArray429[local19];
			if (Static156.anInt3722 != Static147.aClass9_Sub1_Sub1Array1[local25].anInt484) {
				if (Static147.aClass9_Sub1_Sub1Array1[local25].anInt367 > 0) {
					Static93.method2003(Static147.aClass9_Sub1_Sub1Array1[local25]);
				}
				Static147.aClass9_Sub1_Sub1Array1[local25] = null;
			}
		}
		if (Static149.anInt3579 != Static58.aClass1_Sub13_Sub1_1.anInt2395) {
			throw new RuntimeException("gpp1 pos:" + Static58.aClass1_Sub13_Sub1_1.anInt2395 + " psize:" + Static149.anInt3579);
		}
		for (local25 = 0; local25 < Static238.anInt5146; local25++) {
			if (Static147.aClass9_Sub1_Sub1Array1[Static237.anIntArray447[local25]] == null) {
				throw new RuntimeException("gpp2 pos:" + local25 + " size:" + Static238.anInt5146);
			}
		}
	}
}
