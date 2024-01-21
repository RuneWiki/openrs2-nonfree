import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static99 {

	@OriginalMember(owner = "client!lb", name = "B", descriptor = "Lclient!ig;")
	public static Class39 aClass39_47;

	@OriginalMember(owner = "client!lb", name = "y", descriptor = "I")
	public static int anInt4546 = 2;

	@OriginalMember(owner = "client!lb", name = "z", descriptor = "Lclient!rf;")
	public static Class70 aClass70_1591 = Static49.method1293("-5berpr-Ufen Sie Ihr Mitteilungsfach)3");

	@OriginalMember(owner = "client!lb", name = "C", descriptor = "I")
	public static int anInt4548 = 0;

	@OriginalMember(owner = "client!lb", name = "D", descriptor = "[I")
	public static int[] anIntArray437 = new int[100];

	@OriginalMember(owner = "client!lb", name = "d", descriptor = "(I)V")
	public static void method3501() {
		Static67.aClass25_11.method1300();
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIIZ)V")
	public static void method3502(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 < 128 || arg0 < 128 || arg2 > 13056 || arg0 > 13056) {
			Static57.anInt1834 = -1;
			Static151.anInt4006 = -1;
			return;
		}
		@Pc(35) int local35 = Static156.method3142(arg2, Static56.anInt1784, arg0) - arg1;
		@Pc(39) int local39 = local35 - Static33.anInt1073;
		@Pc(43) int local43 = arg2 - Static79.anInt2448;
		@Pc(47) int local47 = Class1_Sub1_Sub1_Sub1.anIntArray8[Static42.anInt1424];
		@Pc(51) int local51 = Class1_Sub1_Sub1_Sub1.anIntArray11[Static42.anInt1424];
		@Pc(55) int local55 = arg0 - Static83.anInt4536;
		@Pc(59) int local59 = Class1_Sub1_Sub1_Sub1.anIntArray11[Static60.anInt1934];
		@Pc(63) int local63 = Class1_Sub1_Sub1_Sub1.anIntArray8[Static60.anInt1934];
		@Pc(73) int local73 = local43 * local63 + local55 * local59 >> 16;
		@Pc(83) int local83 = local63 * local55 - local59 * local43 >> 16;
		@Pc(85) int local85 = local73;
		@Pc(95) int local95 = local47 * local39 - local83 * local51 >> 16;
		@Pc(110) int local110 = local47 * local83 + local51 * local39 >> 16;
		if (local110 >= 50) {
			Static57.anInt1834 = (local95 << 9) / local110 + 167;
			Static151.anInt4006 = (local85 << 9) / local110 + 256;
		} else {
			Static57.anInt1834 = -1;
			Static151.anInt4006 = -1;
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIII)V")
	public static void method3504(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) Class1_Sub17 local7 = Static90.aClass1_Sub17ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 != null) {
			Static90.aClass1_Sub17ArrayArrayArray1[arg0][arg1][arg2].anInt2951 = arg3;
		}
	}

	@OriginalMember(owner = "client!lb", name = "e", descriptor = "(I)V")
	public static void method3505() {
		aClass39_47 = null;
		anIntArray437 = null;
		aClass70_1591 = null;
	}
}
