import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static97 {

	@OriginalMember(owner = "client!cs", name = "q", descriptor = "Lclient!rp;")
	public static Class328 aClass328_2;

	@OriginalMember(owner = "client!cs", name = "x", descriptor = "I")
	public static int anInt1761;

	@OriginalMember(owner = "client!cs", name = "s", descriptor = "[I")
	public static final int[] anIntArray129 = new int[4096];

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(IJ)V")
	public static void method1514(@OriginalArg(1) long arg0) {
		Static246.aCalendar3.setTime(new Date(arg0));
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(IIIIILclient!uja;)Lclient!ke;")
	public static Class64_Sub4_Sub1 method1515(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class145_Sub3 arg4) {
		if (arg4.aBoolean858 || Static457.method6641(arg1) && Static457.method6641(arg2)) {
			return new Class64_Sub4_Sub1(arg4, 3553, arg0, arg3, arg1, arg2, true);
		} else if (arg4.aBoolean860) {
			return new Class64_Sub4_Sub1(arg4, 34037, arg0, arg3, arg1, arg2, true);
		} else {
			return new Class64_Sub4_Sub1(arg4, arg0, arg3, arg1, arg2, Static330.method4577(arg1), Static330.method4577(arg2), true);
		}
	}
}
