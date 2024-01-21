import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static97 {

	@OriginalMember(owner = "client!qd", name = "td", descriptor = "I")
	public static int anInt2431;

	@OriginalMember(owner = "client!qd", name = "Ed", descriptor = "[I")
	public static int[] anIntArray276;

	@OriginalMember(owner = "client!qd", name = "Id", descriptor = "[Lclient!ic;")
	public static Class4_Sub2_Sub3_Sub1[] aClass4_Sub2_Sub3_Sub1Array9;

	@OriginalMember(owner = "client!qd", name = "Nd", descriptor = "I")
	public static int anInt2445;

	@OriginalMember(owner = "client!qd", name = "sd", descriptor = "Lclient!ja;")
	public static Class39 aClass39_1273 = Static28.method504("scrollbar");

	@OriginalMember(owner = "client!qd", name = "wd", descriptor = "Lclient!ja;")
	public static Class39 aClass39_1274 = Static28.method504("Benutzen Sie die (WPasswort -=ndern(W Option");

	@OriginalMember(owner = "client!qd", name = "xd", descriptor = "Lclient!ja;")
	public static Class39 aClass39_1275 = Static28.method504("Bitte warten Sie)3)3)3");

	@OriginalMember(owner = "client!qd", name = "Dd", descriptor = "Lclient!ja;")
	public static Class39 aClass39_1276 = Static28.method504(")1j");

	@OriginalMember(owner = "client!qd", name = "Md", descriptor = "Lclient!ja;")
	public static Class39 aClass39_1277 = Static28.method504(" steht bereits auf Ihrer Freunde)2Liste(Q");

	@OriginalMember(owner = "client!qd", name = "Od", descriptor = "Lclient!ja;")
	private static Class39 aClass39_1278 = Static28.method504("Unexpected loginserver response)3");

	@OriginalMember(owner = "client!qd", name = "Pd", descriptor = "I")
	public static int anInt2446 = 0;

	@OriginalMember(owner = "client!qd", name = "Ud", descriptor = "Lclient!ja;")
	public static Class39 aClass39_1280 = aClass39_1278;

	@OriginalMember(owner = "client!qd", name = "de", descriptor = "Lclient!ja;")
	public static Class39 aClass39_1281 = Static28.method504("jolt");

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(IIIIIIIIIB)V")
	public static void method1791(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(12) Class4_Sub19 local12 = null;
		for (@Pc(17) Class4_Sub19 local17 = (Class4_Sub19) Static117.aClass61_15.method1628(); local17 != null; local17 = (Class4_Sub19) Static117.aClass61_15.method1629()) {
			if (local17.anInt2728 == arg8 && arg0 == local17.anInt2719 && arg2 == local17.anInt2727 && arg6 == local17.anInt2726) {
				local12 = local17;
				break;
			}
		}
		if (local12 == null) {
			local12 = new Class4_Sub19();
			local12.anInt2726 = arg6;
			local12.anInt2727 = arg2;
			local12.anInt2728 = arg8;
			local12.anInt2719 = arg0;
			Static5.method1914(local12);
			Static117.aClass61_15.method1635(local12);
		}
		local12.anInt2717 = arg1;
		local12.anInt2721 = arg5;
		local12.anInt2718 = arg7;
		local12.anInt2725 = arg3;
		local12.anInt2723 = arg4;
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(IIBI)I")
	public static int method1792(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 > 179) {
			arg0 /= 2;
		}
		if (arg1 > 192) {
			arg0 /= 2;
		}
		if (arg1 > 217) {
			arg0 /= 2;
		}
		if (arg1 > 243) {
			arg0 /= 2;
		}
		return (arg0 / 32 << 7) + (arg2 / 4 << 10) + arg1 / 2;
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(Z)V")
	public static void method1793() {
		aClass39_1278 = null;
		aClass39_1274 = null;
		aClass39_1273 = null;
		aClass39_1275 = null;
		aClass39_1276 = null;
		aClass4_Sub2_Sub3_Sub1Array9 = null;
		anIntArray276 = null;
		aClass39_1280 = null;
		aClass39_1281 = null;
		aClass39_1277 = null;
	}
}
