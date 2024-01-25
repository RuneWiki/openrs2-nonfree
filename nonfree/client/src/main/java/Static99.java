import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static99 {

	@OriginalMember(owner = "client!ep", name = "y", descriptor = "[S")
	public static short[] aShortArray74;

	@OriginalMember(owner = "client!ep", name = "m", descriptor = "Lclient!cm;")
	public static final Class36 aClass36_105 = new Class36(73, -1);

	@OriginalMember(owner = "client!ep", name = "L", descriptor = "[[[I")
	public static final int[][][] anIntArrayArrayArray12 = new int[2][][];

	@OriginalMember(owner = "client!ep", name = "O", descriptor = "I")
	public static int anInt5862 = -2;

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(BLjava/lang/String;)V")
	public static void method4517(@OriginalArg(1) String arg0) {
		Static156.aString26 = arg0;
		if (Static89.aClass114_3.anApplet1 == null) {
			return;
		}
		try {
			@Pc(19) String local19 = Static89.aClass114_3.anApplet1.getParameter("cookieprefix");
			@Pc(24) String local24 = Static89.aClass114_3.anApplet1.getParameter("cookiehost");
			@Pc(39) String local39 = local19 + "settings=" + arg0 + "; version=1; path=/; domain=" + local24;
			if (arg0.length() == 0) {
				local39 = local39 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				local39 = local39 + "; Expires=" + Static37.method668(Static199.method2845() + 94608000000L) + "; Max-Age=" + 94608000L;
			}
			Static459.method3566("document.cookie=\"" + local39 + "\"", Static89.aClass114_3.anApplet1);
		} catch (@Pc(91) Throwable local91) {
		}
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(BLclient!ns;)I")
	public static int method4518(@OriginalArg(1) Class166 arg0) {
		@Pc(5) int local5 = 0;
		if (arg0.method3670(Static162.anInt6352)) {
			local5++;
		}
		if (arg0.method3670(Static38.anInt985)) {
			local5++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(I)V")
	public static void method4521() {
		@Pc(8) Class4_Sub10 local8 = (Class4_Sub10) Static157.aClass258_24.method5538();
		@Pc(16) boolean local16 = Static15.aClass126_1 != null || Static200.anInt3846 > 0;
		if (local16) {
			Static97.anInt2093 = 1;
		}
		if (Static416.aBoolean477 && Static23.aClass14_1.method1510(81) && Static83.anInt1893 > 2) {
			if (local16) {
				Static84.aClass4_Sub21_1 = (Class4_Sub21) Static126.aClass258_19.aClass4_240.aClass4_262.aClass4_262;
			} else {
				Static200.method2883(local8.method1648(), (Class4_Sub21) Static126.aClass258_19.aClass4_240.aClass4_262.aClass4_262, local8.method1652());
			}
		} else if (local16) {
			Static84.aClass4_Sub21_1 = (Class4_Sub21) Static126.aClass258_19.aClass4_240.aClass4_262;
		} else {
			Static200.method2883(local8.method1648(), (Class4_Sub21) Static126.aClass258_19.aClass4_240.aClass4_262, local8.method1652());
		}
	}

	@OriginalMember(owner = "client!ep", name = "b", descriptor = "(III)V")
	public static void method4522(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static413.method5427(arg0)) {
			Static435.method5597(arg1, Static320.aClass126ArrayArray2[arg0]);
		}
	}
}
