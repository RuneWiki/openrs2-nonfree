import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static92 {

	@OriginalMember(owner = "client!j", name = "a", descriptor = "Lclient!ff;")
	public static Class42 aClass42_1;

	@OriginalMember(owner = "client!j", name = "o", descriptor = "I")
	public static int anInt2049;

	@OriginalMember(owner = "client!j", name = "e", descriptor = "I")
	public static int anInt2045 = 4;

	@OriginalMember(owner = "client!j", name = "d", descriptor = "[I")
	public static int[] anIntArray128 = new int[anInt2045];

	@OriginalMember(owner = "client!j", name = "f", descriptor = "[[Lclient!eb;")
	public static Class31[][] aClass31ArrayArray1 = new Class31[anInt2045][500];

	@OriginalMember(owner = "client!j", name = "h", descriptor = "Lclient!ia;")
	public static Class51 aClass51_657 = Static64.method1101("(Y");

	@OriginalMember(owner = "client!j", name = "i", descriptor = "Lclient!ia;")
	public static Class51 aClass51_658 = Static64.method1101("::");

	@OriginalMember(owner = "client!j", name = "k", descriptor = "Lclient!sc;")
	public static Class102 aClass102_11 = new Class102(16);

	@OriginalMember(owner = "client!j", name = "m", descriptor = "Lclient!ia;")
	public static Class51 aClass51_659 = Static64.method1101("<col=ffff00>");

	@OriginalMember(owner = "client!j", name = "n", descriptor = "Lclient!ia;")
	public static Class51 aClass51_660 = Static64.method1101("sch-Utteln:");

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(IIIIIII)V")
	public static void method1530(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static160.anInt3454 <= arg2 && Static149.anInt3252 >= arg0 && Static225.anInt4729 <= arg4 && arg1 <= Static122.anInt2710) {
			if (arg3 == 1) {
				Static37.method654(arg1, arg4, arg2, arg0, arg5);
			} else {
				Static208.method3444(arg2, arg3, arg1, arg5, arg0, arg4);
			}
		} else if (arg3 == 1) {
			Static49.method837(arg1, arg0, arg5, arg4, arg2);
		} else {
			Static36.method636(arg0, arg2, arg5, arg4, arg3, arg1);
		}
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(IIIIIB)V")
	public static void method1531(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		Static82.anInt1852 = arg1;
		Static25.anInt633 = arg4;
		Static194.anInt4192 = arg0;
		Static124.anInt4551 = arg2;
		Static108.anInt2397 = arg3;
		if (Static124.anInt4551 >= 100) {
			@Pc(35) int local35 = Static194.anInt4192 * 128 + 64;
			@Pc(41) int local41 = Static82.anInt1852 * 128 + 64;
			@Pc(50) int local50 = Static26.method2454(Static197.anInt2422, local35, local41) - Static25.anInt633;
			@Pc(55) int local55 = local41 - Static122.anInt2706;
			@Pc(60) int local60 = local35 - Static118.anInt2544;
			@Pc(65) int local65 = local50 - Static191.anInt4119;
			@Pc(77) int local77 = (int) Math.sqrt((double) (local55 * local55 + local60 * local60));
			Static228.anInt4792 = (int) (Math.atan2((double) local65, (double) local77) * 325.949D) & 0x7FF;
			Static207.anInt4426 = (int) (Math.atan2((double) local55, (double) local60) * -325.949D) & 0x7FF;
			if (Static228.anInt4792 < 128) {
				Static228.anInt4792 = 128;
			}
			if (Static228.anInt4792 > 383) {
				Static228.anInt4792 = 383;
			}
		}
		Static70.anInt1624 = 2;
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(ILclient!ia;)V")
	public static void method1532(@OriginalArg(1) Class51 arg0) {
		Static222.aClass51_1586 = arg0;
		Static18.method383();
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(Lclient!me;I)Lclient!me;")
	public static Class71 method1534(@OriginalArg(0) Class71 arg0) {
		if (arg0.anInt2785 != -1) {
			return Static7.method102(arg0.anInt2785);
		}
		@Pc(21) int local21 = arg0.anInt2807 >>> 16;
		for (@Pc(26) Class1_Sub13 local26 = (Class1_Sub13) Static120.aClass102_14.method3086(); local26 != null; local26 = (Class1_Sub13) Static120.aClass102_14.method3087()) {
			if (local21 == local26.anInt1677) {
				return Static7.method102((int) local26.aLong170);
			}
		}
		return null;
	}
}
