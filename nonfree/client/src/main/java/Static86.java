import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static86 {

	@OriginalMember(owner = "client!ge", name = "y", descriptor = "Ljava/lang/String;")
	public static String aString52;

	@OriginalMember(owner = "client!ge", name = "z", descriptor = "I")
	public static int anInt1776;

	@OriginalMember(owner = "client!ge", name = "A", descriptor = "Lclient!oh;")
	public static Class123 aClass123_2;

	@OriginalMember(owner = "client!ge", name = "o", descriptor = "Z")
	public static boolean aBoolean133 = false;

	@OriginalMember(owner = "client!ge", name = "r", descriptor = "I")
	public static int anInt1772 = 0;

	@OriginalMember(owner = "client!ge", name = "s", descriptor = "Ljava/lang/String;")
	public static String aString50 = "Loading - please wait.";

	@OriginalMember(owner = "client!ge", name = "w", descriptor = "Ljava/lang/String;")
	public static String aString51 = "Loaded sprites";

	@OriginalMember(owner = "client!ge", name = "x", descriptor = "Lclient!le;")
	public static Class4_Sub20 aClass4_Sub20_1 = new Class4_Sub20(0, 0);

	@OriginalMember(owner = "client!ge", name = "B", descriptor = "I")
	public static int anInt1777 = 0;

	@OriginalMember(owner = "client!ge", name = "C", descriptor = "F")
	public static float aFloat13 = 0.0F;

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "(IIII)I")
	public static int method1379(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg1 & 0x3;
		if (local7 == 0) {
			return arg2;
		} else if (local7 == 1) {
			return arg0;
		} else if (local7 == 2) {
			return 7 - arg2;
		} else {
			return 7 - arg0;
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(Z)V")
	public static void method1381() {
		aString52 = null;
		aClass123_2 = null;
		aClass4_Sub20_1 = null;
		aString50 = null;
		aString51 = null;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(III)Lclient!m;")
	public static Class104 method1382(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class4_Sub11 local7 = Static127.aClass4_Sub11ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		} else {
			@Pc(14) Class104 local14 = local7.aClass104_1;
			local7.aClass104_1 = null;
			return local14;
		}
	}
}
