import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static86 {

	@OriginalMember(owner = "client!g", name = "b", descriptor = "F")
	public static float aFloat50;

	@OriginalMember(owner = "client!g", name = "k", descriptor = "Lclient!cg;")
	public static Class22 aClass22_32;

	@OriginalMember(owner = "client!g", name = "n", descriptor = "Lclient!jc;")
	public static Class4_Sub2_Sub9 aClass4_Sub2_Sub9_3;

	@OriginalMember(owner = "client!g", name = "g", descriptor = "Z")
	public static boolean aBoolean103 = false;

	@OriginalMember(owner = "client!g", name = "h", descriptor = "I")
	public static int anInt1739 = 0;

	@OriginalMember(owner = "client!g", name = "p", descriptor = "I")
	public static int anInt1743 = 0;

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(JB)V")
	public static void method1425(@OriginalArg(0) long arg0) {
		Static175.aClass4_Sub24_Sub1_1.anInt3822 = 0;
		Static175.aClass4_Sub24_Sub1_1.method3116(21);
		Static175.aClass4_Sub24_Sub1_1.method3079(arg0);
		Static238.anInt3859 = 0;
		Static228.anInt4576 = 1;
		Static170.anInt3406 = -3;
		Static195.anInt3936 = 0;
	}

	@OriginalMember(owner = "client!g", name = "b", descriptor = "(I)[Lclient!wb;")
	public static Class4_Sub2_Sub4[] method1428() {
		@Pc(10) Class4_Sub2_Sub4[] local10 = new Class4_Sub2_Sub4[Static150.anInt2948];
		for (@Pc(12) int local12 = 0; local12 < Static150.anInt2948; local12++) {
			@Pc(23) byte[] local23 = Static99.aByteArrayArray8[local12];
			@Pc(31) int local31 = Static246.anIntArray386[local12] * Static107.anIntArray188[local12];
			if (Static248.aBooleanArray33[local12]) {
				@Pc(39) byte[] local39 = Static95.aByteArrayArray7[local12];
				@Pc(42) int[] local42 = new int[local31];
				for (@Pc(44) int local44 = 0; local44 < local31; local44++) {
					local42[local44] = Static138.anIntArray228[local23[local44] & 0xFF] | (local39[local44] & 0xFF) << 24;
				}
				if (Static251.aBoolean330) {
					local10[local12] = new Class4_Sub2_Sub4_Sub1_Sub1(Static31.anInt651, Static161.anInt3300, Static149.anIntArray238[local12], Static278.anIntArray422[local12], Static107.anIntArray188[local12], Static246.anIntArray386[local12], local42);
				} else {
					local10[local12] = new Class4_Sub2_Sub4_Sub2_Sub1(Static31.anInt651, Static161.anInt3300, Static149.anIntArray238[local12], Static278.anIntArray422[local12], Static107.anIntArray188[local12], Static246.anIntArray386[local12], local42);
				}
			} else {
				@Pc(119) int[] local119 = new int[local31];
				for (@Pc(121) int local121 = 0; local121 < local31; local121++) {
					local119[local121] = Static138.anIntArray228[local23[local121] & 0xFF];
				}
				if (Static251.aBoolean330) {
					local10[local12] = new Class4_Sub2_Sub4_Sub1(Static31.anInt651, Static161.anInt3300, Static149.anIntArray238[local12], Static278.anIntArray422[local12], Static107.anIntArray188[local12], Static246.anIntArray386[local12], local119);
				} else {
					local10[local12] = new Class4_Sub2_Sub4_Sub2(Static31.anInt651, Static161.anInt3300, Static149.anIntArray238[local12], Static278.anIntArray422[local12], Static107.anIntArray188[local12], Static246.anIntArray386[local12], local119);
				}
			}
		}
		Static184.method2969();
		return local10;
	}
}
