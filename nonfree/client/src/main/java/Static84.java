import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static84 {

	@OriginalMember(owner = "client!ke", name = "t", descriptor = "[Lclient!kb;")
	public static Class46[] aClass46Array12;

	@OriginalMember(owner = "client!ke", name = "w", descriptor = "Lclient!kb;")
	private static Class46 aClass46_708 = Static65.method1172("Loaded input handler");

	@OriginalMember(owner = "client!ke", name = "m", descriptor = "Lclient!kb;")
	public static Class46 aClass46_702 = aClass46_708;

	@OriginalMember(owner = "client!ke", name = "n", descriptor = "Lclient!kb;")
	private static Class46 aClass46_703 = Static65.method1172("Prepared visibility map");

	@OriginalMember(owner = "client!ke", name = "o", descriptor = "I")
	public static int anInt2082 = 0;

	@OriginalMember(owner = "client!ke", name = "p", descriptor = "Lclient!kb;")
	private static Class46 aClass46_704 = Static65.method1172(" is already on your friend list)3");

	@OriginalMember(owner = "client!ke", name = "q", descriptor = "Lclient!kb;")
	public static Class46 aClass46_705 = Static65.method1172("Begeben Sie sich in ein freies Gebiet)1 um");

	@OriginalMember(owner = "client!ke", name = "r", descriptor = "Lclient!kb;")
	public static Class46 aClass46_706 = aClass46_704;

	@OriginalMember(owner = "client!ke", name = "s", descriptor = "Lclient!kb;")
	public static Class46 aClass46_707 = aClass46_703;

	@OriginalMember(owner = "client!ke", name = "x", descriptor = "Z")
	public static boolean aBoolean88 = false;

	@OriginalMember(owner = "client!ke", name = "A", descriptor = "Lclient!kb;")
	public static Class46 aClass46_709 = Static65.method1172("oder ung-Ultiges Passwort)3");

	@OriginalMember(owner = "client!ke", name = "B", descriptor = "Lclient!kb;")
	public static Class46 aClass46_710 = Static65.method1172(" )2> <col=ff9040>");

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(ZLclient!jg;Lclient!kb;Lclient!kb;Lclient!jg;)Lclient!ef;")
	public static Class3_Sub2_Sub3_Sub1_Sub1 method1408(@OriginalArg(1) Class44 arg0, @OriginalArg(2) Class46 arg1, @OriginalArg(3) Class46 arg2, @OriginalArg(4) Class44 arg3) {
		@Pc(4) int local4 = arg0.method1617(arg1);
		@Pc(10) int local10 = arg0.method1631(arg2, local4);
		return Static101.method1653(local10, arg0, local4, arg3);
	}

	@OriginalMember(owner = "client!ke", name = "b", descriptor = "(B)V")
	public static void method1409() {
		aClass46_707 = null;
		aClass46_706 = null;
		aClass46_708 = null;
		aClass46_709 = null;
		aClass46_710 = null;
		aClass46_705 = null;
		aClass46_704 = null;
		aClass46Array12 = null;
		aClass46_703 = null;
		aClass46_702 = null;
	}
}
