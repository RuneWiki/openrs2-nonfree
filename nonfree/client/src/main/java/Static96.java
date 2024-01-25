import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static96 {

	@OriginalMember(owner = "client!ep", name = "E", descriptor = "Lclient!la;")
	public static final Class136 aClass136_48 = new Class136(102, 4);

	@OriginalMember(owner = "client!ep", name = "I", descriptor = "Lclient!lp;")
	public static final Class140 aClass140_16 = new Class140(32);

	@OriginalMember(owner = "client!ep", name = "J", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray3 = new boolean[][] { new boolean[4], { false, true, true, false }, { true, false, true, false }, { true, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { true, true, false, false }, new boolean[4], { false, true, false, true }, new boolean[4] };

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(ILclient!wj;IILclient!wj;IIIII)V")
	public static void method1663(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub2_Sub6 arg1, @OriginalArg(4) Class1_Sub2_Sub6 arg2, @OriginalArg(5) int arg3, @OriginalArg(7) int arg4, @OriginalArg(8) int arg5, @OriginalArg(9) int arg6) {
		@Pc(7) int local7 = arg1.method6206();
		if (local7 == -1) {
			return;
		}
		@Pc(21) Class2 local21 = (Class2) Static334.aClass268_46.method6166((long) local7);
		if (local21 == null) {
			@Pc(28) Class154[] local28 = Static467.method3627(Static8.aClass250_2, local7);
			if (local28 == null) {
				return;
			}
			local21 = Static413.aClass167_11.method5993(local28[0]);
			Static334.aClass268_46.method6164(local21, (long) local7);
		}
		Static56.method1100(arg2.method6204() * 64, 0, arg3 >> 1, arg2.anInt7560, arg4 >> 1, arg2.anInt7557, arg2.aByte101);
		@Pc(75) int local75 = arg0 + Static90.anIntArray75[0] - 18;
		@Pc(84) int local84 = arg6 + Static90.anIntArray75[1] - 70;
		@Pc(92) int local92 = local75 + arg5 / 4 * 18;
		@Pc(100) int local100 = local84 + arg5 % 4 * 18;
		local21.method5829(local92, local100);
		if (arg2 == arg1) {
			Static413.aClass167_11.method6016(local92 - 1, 18, -256, 18, local100 - 1);
		}
		@Pc(122) Class23_Sub2 local122 = Static171.method2615();
		local122.anInt893 = local100;
		local122.aClass1_Sub2_Sub6_1 = arg1;
		local122.anInt889 = local100 + 16;
		local122.anInt892 = local92;
		local122.anInt890 = local92 + 16;
		Static185.aClass194_4.method4582(local122);
	}

	@OriginalMember(owner = "client!ep", name = "h", descriptor = "(I)I")
	public static int method1664() {
		return Static243.anInt7147;
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(II)I")
	public static int method1665(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(IIIII)V")
	public static void method1666(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static57.anInt1113 = arg3;
		Static113.anInt6159 = arg2;
		Static312.anInt5314 = arg0;
		Static176.anInt3298 = arg1;
	}
}
