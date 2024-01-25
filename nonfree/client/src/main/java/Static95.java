import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static95 {

	@OriginalMember(owner = "client!eq", name = "E", descriptor = "Lclient!sk;")
	public static final Class231 aClass231_29 = new Class231("M", "M", "M", "M");

	@OriginalMember(owner = "client!eq", name = "I", descriptor = "I")
	public static int anInt1776 = 0;

	@OriginalMember(owner = "client!eq", name = "N", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray12 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(ZII)I")
	public static int method1645(@OriginalArg(2) int arg0) {
		@Pc(14) Class6_Sub17 local14 = Static85.method1523(arg0, false);
		if (local14 == null) {
			return Static172.aClass16_1.method279(arg0).anInt6943;
		}
		@Pc(24) int local24 = 0;
		for (@Pc(33) int local33 = 0; local33 < local14.anIntArray289.length; local33++) {
			if (local14.anIntArray289[local33] == -1) {
				local24++;
			}
		}
		return local24 + Static172.aClass16_1.method279(arg0).anInt6943 - local14.anIntArray289.length;
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(BLclient!tf;)Z")
	public static boolean method1646(@OriginalArg(1) Interface10 arg0) {
		@Pc(15) Class118 local15 = Static113.aClass127_2.method2820(arg0.method5812());
		if (local15.anInt2988 == -1) {
			return true;
		} else {
			@Pc(27) Class110 local27 = Static405.aClass190_4.method4316(local15.anInt2988);
			return local27.anInt2706 == -1 ? true : local27.method2481();
		}
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(III)Z")
	public static boolean method1647(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x20) != 0;
	}

	@OriginalMember(owner = "client!eq", name = "d", descriptor = "(I)V")
	public static void method1651() {
		Static228.anInt3878 = 0;
		Static307.aClass88_23.method1887();
		Static307.aClass88_23.method1878(Static213.aClass6_Sub33_2);
		Static228.anInt3878++;
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method1652(@OriginalArg(1) String arg0) {
		if (!Static274.aBoolean336) {
			return;
		}
		@Pc(15) boolean local15 = false;
		@Pc(17) int local17 = Static416.anInt4773;
		@Pc(19) int[] local19 = Static5.anIntArray3;
		for (@Pc(21) int local21 = 0; local21 < local17; local21++) {
			@Pc(29) Class3_Sub3_Sub6_Sub1 local29 = Static355.aClass3_Sub3_Sub6_Sub1Array1[local19[local21]];
			if (local29 != null && Static134.aClass3_Sub3_Sub6_Sub1_1 != local29 && local29.aString48 != null && local29.aString48.equalsIgnoreCase(arg0)) {
				Static298.method4373(Static73.aClass25_19);
				Static449.aClass6_Sub15_Sub1_2.method3106(Static365.anInt3369);
				Static449.aClass6_Sub15_Sub1_2.method3122(0);
				Static449.aClass6_Sub15_Sub1_2.method3113(Static391.anInt2016);
				Static449.aClass6_Sub15_Sub1_2.method3117(local19[local21]);
				Static449.aClass6_Sub15_Sub1_2.method3106(Static321.anInt5236);
				Static367.method5800(local29.method5512(), true, local29.method5512(), -2, local29.anIntArray582[0], local29.anIntArray583[0], 0, 0);
				local15 = true;
				break;
			}
		}
		if (!local15) {
			Static109.method1805(Static205.aClass231_22.method5138(Static382.anInt6289) + arg0);
		}
		if (Static274.aBoolean336) {
			Static12.method160();
		}
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(IB)V")
	public static void method1653() {
		@Pc(9) Class220 local9 = Static135.aClass220_16;
		synchronized (Static135.aClass220_16) {
			Static135.aClass220_16.method4998(5);
		}
		local9 = Static61.aClass220_4;
		synchronized (Static61.aClass220_4) {
			Static61.aClass220_4.method4998(5);
		}
	}
}
