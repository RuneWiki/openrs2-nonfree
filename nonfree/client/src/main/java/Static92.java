import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static92 {

	@OriginalMember(owner = "client!lf", name = "X", descriptor = "Lclient!dd;")
	public static Class3_Sub2_Sub1_Sub1_Sub1 aClass3_Sub2_Sub1_Sub1_Sub1_1;

	@OriginalMember(owner = "client!lf", name = "N", descriptor = "Lclient!kb;")
	private static Class46 aClass46_762 = Static65.method1172("You are standing in a members)2only area)3");

	@OriginalMember(owner = "client!lf", name = "Q", descriptor = "I")
	public static int anInt2257 = 0;

	@OriginalMember(owner = "client!lf", name = "R", descriptor = "Lclient!kb;")
	public static Class46 aClass46_763 = Static65.method1172("<col=ffffff>");

	@OriginalMember(owner = "client!lf", name = "U", descriptor = "Lclient!rd;")
	public static Class3_Sub4 aClass3_Sub4_4 = new Class3_Sub4(8);

	@OriginalMember(owner = "client!lf", name = "W", descriptor = "Lclient!kb;")
	public static Class46 aClass46_764 = aClass46_762;

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lclient!mc;I)V")
	public static void method1533(@OriginalArg(0) Class3_Sub2_Sub1_Sub1 arg0) {
		arg0.anInt1709 = 0;
		if (arg0.anInt1725 == 0) {
			arg0.anInt1732 = 1024;
		}
		if (arg0.anInt1725 == 1) {
			arg0.anInt1732 = 1536;
		}
		if (arg0.anInt1725 == 2) {
			arg0.anInt1732 = 0;
		}
		if (arg0.anInt1725 == 3) {
			arg0.anInt1732 = 512;
		}
		@Pc(49) int local49 = arg0.anInt1720 - Static20.anInt512;
		@Pc(59) int local59 = arg0.anInt1703 * 128 + arg0.anInt1712 * 64;
		@Pc(69) int local69 = arg0.anInt1695 * 128 + arg0.anInt1712 * 64;
		arg0.anInt1711 += (local59 - arg0.anInt1711) / local49;
		arg0.anInt1700 += (local69 - arg0.anInt1700) / local49;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIIIIIB)I")
	public static int method1534(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(8) int local8 = arg5 & 0x3;
		if ((arg1 & 0x1) == 1) {
			@Pc(17) int local17 = arg4;
			arg4 = arg0;
			arg0 = local17;
		}
		if (local8 == 0) {
			return arg3;
		} else if (local8 == 1) {
			return 1 + 7 - arg4 - arg2;
		} else if (local8 == 2) {
			return 1 + 7 - arg0 - arg3;
		} else {
			return arg2;
		}
	}

	@OriginalMember(owner = "client!lf", name = "d", descriptor = "(B)V")
	public static void method1535() {
		aClass3_Sub2_Sub1_Sub1_Sub1_1 = null;
		aClass46_764 = null;
		aClass46_763 = null;
		aClass46_762 = null;
		aClass3_Sub4_4 = null;
	}

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "(IBI)V")
	public static void method1536(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(6) int[] local6 = new int[4];
		@Pc(9) int[] local9 = new int[4];
		local6[0] = arg0;
		local9[0] = arg1;
		@Pc(19) int local19 = 1;
		for (@Pc(21) int local21 = 0; local21 < 4; local21++) {
			if (Static83.anIntArray212[local21] != arg0) {
				local6[local19] = Static83.anIntArray212[local21];
				local9[local19] = Static134.anIntArray351[local21];
				local19++;
			}
		}
		Static83.anIntArray212 = local6;
		Static134.anIntArray351 = local9;
		Static96.method1597(Static162.aClass38Array1, Static134.anIntArray351, Static162.aClass38Array1.length - 1, Static83.anIntArray212, 0);
	}

	@OriginalMember(owner = "client!lf", name = "c", descriptor = "(IBI)V")
	public static void method1537(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static34.anInt955 == 2) {
			Static12.method2889((Static35.anInt987 - Static58.anInt1578 << 7) + Static58.anInt1583, Static37.anInt1034 * 2, (Static18.anInt432 - Static42.anInt1173 << 7) + Static154.anInt3470);
			if (Static24.anInt561 > -1 && Static20.anInt512 % 20 < 10) {
				Static101.aClass3_Sub2_Sub3_Sub3Array9[0].method1880(Static24.anInt561 + arg0 - 12, Static33.anInt920 + arg1 - 28);
			}
		}
	}
}
