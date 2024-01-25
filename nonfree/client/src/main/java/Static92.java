import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static92 {

	@OriginalMember(owner = "client!eo", name = "c", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray18;

	@OriginalMember(owner = "client!eo", name = "i", descriptor = "Lclient!si;")
	public static Class2_Sub23 aClass2_Sub23_5 = new Class2_Sub23(1);

	@OriginalMember(owner = "client!eo", name = "j", descriptor = "Z")
	public static boolean aBoolean239 = false;

	@OriginalMember(owner = "client!eo", name = "n", descriptor = "Ljava/lang/String;")
	public static String aString37 = null;

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(I)V")
	public static void method2436() {
		for (@Pc(13) Class2_Sub11 local13 = (Class2_Sub11) Static362.aClass14_42.method309(); local13 != null; local13 = (Class2_Sub11) Static362.aClass14_42.method311()) {
			if (local13.anInt1612 == -1) {
				local13.anInt1609 = 0;
				if (local13.anInt1614 >= 0 && local13.anInt1615 >= 0 && Static229.anInt4427 > local13.anInt1614 && local13.anInt1615 < Static379.anInt6422) {
					Static173.method2819(local13);
				}
			} else {
				local13.method5866();
			}
		}
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(B)Ljava/lang/String;")
	public static String method2438() {
		@Pc(7) String local7 = "www";
		if (Static89.aClass56_3 == Static53.aClass56_2) {
			local7 = "www-wtrc";
		} else if (Static53.aClass56_2 == Static202.aClass56_6) {
			local7 = "www-wtqa";
		} else if (Static184.aClass56_5 == Static53.aClass56_2) {
			local7 = "www-wtwip";
		}
		@Pc(36) String local36 = "";
		if (aString37 != null) {
			local36 = "/p=" + aString37;
		}
		return "http://" + local7 + "." + Static320.aClass10_28.aString1 + ".com/l=" + Static388.anInt6533 + "/a=" + Static352.anInt5971 + local36 + "/";
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(Lclient!em;I)Lclient!em;")
	public static Class68 method2439(@OriginalArg(0) Class68 arg0) {
		@Pc(12) Class68 local12 = Static47.method791(arg0);
		if (local12 == null) {
			local12 = arg0.aClass68_3;
		}
		return local12;
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(IIIBI)V")
	public static void method2440(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg3;
		@Pc(12) int local12 = -arg3;
		Static64.method1247(arg1 - arg3, Static280.anIntArrayArray51[arg2], arg3 + arg1, arg0);
		@Pc(27) int local27 = -1;
		while (local9 > local7) {
			local27 += 2;
			local7++;
			local12 += local27;
			if (local12 >= 0) {
				local9--;
				local12 -= local9 << 1;
				@Pc(55) int[] local55 = Static280.anIntArrayArray51[local9 + arg2];
				@Pc(62) int[] local62 = Static280.anIntArrayArray51[arg2 - local9];
				@Pc(66) int local66 = local7 + arg1;
				@Pc(71) int local71 = arg1 - local7;
				Static64.method1247(local71, local55, local66, arg0);
				Static64.method1247(local71, local62, local66, arg0);
			}
			@Pc(87) int local87 = local9 + arg1;
			@Pc(92) int local92 = arg1 - local9;
			@Pc(98) int[] local98 = Static280.anIntArrayArray51[local7 + arg2];
			@Pc(105) int[] local105 = Static280.anIntArrayArray51[arg2 - local7];
			Static64.method1247(local92, local98, local87, arg0);
			Static64.method1247(local92, local105, local87, arg0);
		}
	}
}
