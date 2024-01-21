import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static99 {

	@OriginalMember(owner = "client!qd", name = "g", descriptor = "Lclient!kb;")
	public static Class41 aClass41_23;

	@OriginalMember(owner = "client!qd", name = "r", descriptor = "Lclient!kb;")
	public static Class41 aClass41_24;

	@OriginalMember(owner = "client!qd", name = "u", descriptor = "[I")
	public static int[] anIntArray376;

	@OriginalMember(owner = "client!qd", name = "b", descriptor = "[I")
	public static int[] anIntArray375 = new int[500];

	@OriginalMember(owner = "client!qd", name = "d", descriptor = "Lclient!af;")
	public static Class5 aClass5_1168 = Static45.method1937("va");

	@OriginalMember(owner = "client!qd", name = "p", descriptor = "Lclient!af;")
	private static Class5 aClass5_1172 = Static45.method1937("flash2:");

	@OriginalMember(owner = "client!qd", name = "i", descriptor = "Lclient!af;")
	public static Class5 aClass5_1169 = aClass5_1172;

	@OriginalMember(owner = "client!qd", name = "k", descriptor = "Lclient!af;")
	public static Class5 aClass5_1170 = Static45.method1937("bevor Sie den Vorgang wiederholen)3");

	@OriginalMember(owner = "client!qd", name = "n", descriptor = "I")
	public static int anInt2454 = 0;

	@OriginalMember(owner = "client!qd", name = "o", descriptor = "Lclient!af;")
	public static Class5 aClass5_1171 = aClass5_1172;

	@OriginalMember(owner = "client!qd", name = "q", descriptor = "Lclient!af;")
	public static Class5 aClass5_1173 = Static45.method1937("scrollen:");

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(I)V")
	public static void method1688() {
		aClass5_1169 = null;
		aClass5_1173 = null;
		anIntArray376 = null;
		aClass5_1168 = null;
		aClass41_23 = null;
		aClass5_1171 = null;
		aClass5_1172 = null;
		anIntArray375 = null;
		aClass41_24 = null;
		aClass5_1170 = null;
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(ZZI)Lclient!af;")
	public static Class5 method1689(@OriginalArg(2) int arg0) {
		return Static20.method486(arg0, true);
	}

	@OriginalMember(owner = "client!qd", name = "b", descriptor = "(I)V")
	public static void method1690() {
		while (true) {
			if (Static79.aClass1_Sub20_Sub1_2.method2122(Static77.anInt1803) >= 11) {
				@Pc(16) int local16 = Static79.aClass1_Sub20_Sub1_2.method2115(11);
				if (local16 != 2047) {
					@Pc(23) boolean local23 = false;
					if (Static17.aClass1_Sub3_Sub4_Sub2_Sub1Array1[local16] == null) {
						Static17.aClass1_Sub3_Sub4_Sub2_Sub1Array1[local16] = new Class1_Sub3_Sub4_Sub2_Sub1();
						local23 = true;
						if (Static97.aClass1_Sub20Array1[local16] != null) {
							Static17.aClass1_Sub3_Sub4_Sub2_Sub1Array1[local16].method1410(Static97.aClass1_Sub20Array1[local16]);
						}
					}
					Static77.anIntArray299[Static111.anInt2739++] = local16;
					@Pc(59) Class1_Sub3_Sub4_Sub2_Sub1 local59 = Static17.aClass1_Sub3_Sub4_Sub2_Sub1Array1[local16];
					local59.anInt3066 = Static131.anInt3270;
					@Pc(67) int local67 = Static79.aClass1_Sub20_Sub1_2.method2115(5);
					@Pc(74) int local74 = Static5.anIntArray28[Static79.aClass1_Sub20_Sub1_2.method2115(3)];
					if (local67 > 15) {
						local67 -= 32;
					}
					if (local23) {
						local59.anInt3080 = local59.anInt3073 = local74;
					}
					@Pc(91) int local91 = Static79.aClass1_Sub20_Sub1_2.method2115(1);
					@Pc(96) int local96 = Static79.aClass1_Sub20_Sub1_2.method2115(1);
					if (local96 == 1) {
						Static20.anIntArray83[Static86.anInt2184++] = local16;
					}
					@Pc(112) int local112 = Static79.aClass1_Sub20_Sub1_2.method2115(5);
					if (local112 > 15) {
						local112 -= 32;
					}
					local59.method2151(Static20.aClass1_Sub3_Sub4_Sub2_Sub1_1.anIntArray443[0] + local112, local67 + Static20.aClass1_Sub3_Sub4_Sub2_Sub1_1.anIntArray446[0], local91 == 1);
					continue;
				}
			}
			Static79.aClass1_Sub20_Sub1_2.method2111();
			return;
		}
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(IIIZLclient!lf;I)V")
	public static void method1691(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class1_Sub3_Sub10 arg3, @OriginalArg(5) int arg4) {
		@Pc(11) Class1_Sub16 local11 = new Class1_Sub16();
		local11.anInt2137 = arg3.anInt1689;
		local11.anIntArray329 = arg3.anIntArray281;
		local11.anInt2144 = arg4 * 128;
		local11.anInt2147 = arg3.anInt1703 * 128;
		local11.anInt2132 = arg2;
		local11.anInt2140 = arg1 * 128;
		@Pc(41) int local41 = arg3.anInt1693;
		@Pc(44) int local44 = arg3.anInt1696;
		local11.anInt2145 = arg3.anInt1664;
		if (arg0 == 1 || arg0 == 3) {
			local44 = arg3.anInt1693;
			local41 = arg3.anInt1696;
		}
		local11.anInt2135 = (arg4 + local41) * 128;
		local11.anInt2142 = (arg1 + local44) * 128;
		local11.anInt2133 = arg3.anInt1682;
		if (arg3.anIntArray283 != null) {
			local11.aClass1_Sub3_Sub10_1 = arg3;
			local11.method1491();
		}
		Static38.aClass53_7.method1449(local11);
		if (local11.anIntArray329 != null) {
			local11.anInt2146 = (int) (Math.random() * (double) (local11.anInt2145 - local11.anInt2133)) + local11.anInt2133;
		}
	}
}
