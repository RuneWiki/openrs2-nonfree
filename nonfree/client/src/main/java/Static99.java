import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static99 {

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "Ljava/lang/String;")
	public static String aString6;

	@OriginalMember(owner = "client!lg", name = "d", descriptor = "Lclient!tg;")
	public static Class81 aClass81_1264 = Static120.method2057("welle2:");

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(B)V")
	public static void method2679() {
		aClass81_1264 = null;
		aString6 = null;
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(IB)I")
	public static int method2680(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = arg0 - 1;
		@Pc(15) int local15 = local5 | local5 >>> 1;
		@Pc(21) int local21 = local15 | local15 >>> 2;
		@Pc(27) int local27 = local21 | local21 >>> 4;
		@Pc(33) int local33 = local27 | local27 >>> 8;
		@Pc(39) int local39 = local33 | local33 >>> 16;
		return local39 + 1;
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(ZII)I")
	public static int method2682(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(45) int local45 = Static36.method741(arg0 - 1, arg1 + -1) + Static36.method741(arg0 + 1, arg1 + -1) + Static36.method741(arg0 + -1, arg1 + 1) + Static36.method741(arg0 + 1, arg1 + 1);
		@Pc(75) int local75 = Static36.method741(arg0 - 1, arg1) + Static36.method741(arg0 + 1, arg1) + Static36.method741(arg0, arg1 - 1) + Static36.method741(arg0, arg1 - -1);
		@Pc(80) int local80 = Static36.method741(arg0, arg1);
		return local75 / 8 + local45 / 16 + local80 / 4;
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(Lclient!tg;I)Z")
	public static boolean method2683(@OriginalArg(0) Class81 arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(11) int local11 = 0; local11 < Static58.anInt1378; local11++) {
			if (arg0.method2811(Static178.aClass81Array22[local11])) {
				return true;
			}
		}
		return arg0.method2811(Static43.aClass1_Sub2_Sub1_Sub3_Sub1_1.aClass81_518);
	}
}
