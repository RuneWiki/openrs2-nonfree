import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static89 {

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "Lclient!vd;")
	public static Class5_Sub2_Sub1_Sub4 aClass5_Sub2_Sub1_Sub4_5;

	@OriginalMember(owner = "client!oc", name = "e", descriptor = "Lclient!r;")
	public static Class61 aClass61_691 = Static129.method2060("Der Anmelde)2Server ist offline)3");

	@OriginalMember(owner = "client!oc", name = "f", descriptor = "I")
	public static int anInt2361 = 0;

	@OriginalMember(owner = "client!oc", name = "m", descriptor = "Lclient!r;")
	private static Class61 aClass61_694 = Static129.method2060("yellow:");

	@OriginalMember(owner = "client!oc", name = "g", descriptor = "Lclient!r;")
	public static Class61 aClass61_692 = aClass61_694;

	@OriginalMember(owner = "client!oc", name = "k", descriptor = "I")
	public static int anInt2365 = 0;

	@OriginalMember(owner = "client!oc", name = "l", descriptor = "Lclient!r;")
	public static Class61 aClass61_693 = aClass61_694;

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(I)V")
	public static void method1570() {
		@Pc(7) int local7 = Static117.anInt3014;
		@Pc(9) int local9 = Static81.anInt3355;
		@Pc(13) int local13 = Static127.anInt3201;
		@Pc(15) int local15 = Static64.anInt2727;
		Static46.method2001(local7, local9, local13, local15, 6116423);
		Static46.method2001(local7 + 1, local9 + 1, local13 - 2, 16, 0);
		Static46.method2006(local7 + 1, local9 + 18, local13 - 2, local15 + -19, 0);
		Static100.aClass5_Sub2_Sub1_Sub1_Sub1_4.method558(Static47.aClass61_371, local7 + 3, local9 + 14, 6116423, -1);
		@Pc(60) int local60 = Static30.anInt917;
		@Pc(62) int local62 = Static40.anInt1073;
		for (@Pc(64) int local64 = 0; local64 < Static36.anInt1015; local64++) {
			@Pc(78) int local78 = (Static36.anInt1015 - local64 - 1) * 15 + local9 + 31;
			@Pc(80) int local80 = 16777215;
			if (local60 > local7 && local13 + local7 > local60 && local78 - 13 < local62 && local78 + 3 > local62) {
				local80 = 16776960;
			}
			Static100.aClass5_Sub2_Sub1_Sub1_Sub1_4.method558(Static86.method1532(local64), local7 + 3, local78, local80, 0);
		}
		Static53.method979(Static81.anInt3355, Static64.anInt2727, Static117.anInt3014, Static127.anInt3201);
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(IILclient!ff;IZI)V")
	public static void method1571(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class26 arg2, @OriginalArg(5) int arg3) {
		Static79.anInt2014 = arg3;
		Static58.anInt1425 = 1;
		Static101.anInt2694 = 10000;
		Static93.aBoolean85 = false;
		Static62.anInt1526 = arg1;
		Static119.anInt3027 = arg0;
		Static97.aClass26_21 = arg2;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(B)V")
	public static void method1572() {
		aClass5_Sub2_Sub1_Sub4_5 = null;
		aClass61_691 = null;
		aClass61_694 = null;
		aClass61_693 = null;
		aClass61_692 = null;
	}
}
