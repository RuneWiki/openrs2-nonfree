import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static98 {

	@OriginalMember(owner = "client!td", name = "m", descriptor = "Lclient!bd;")
	public static Class6_Sub2_Sub2_Sub1 aClass6_Sub2_Sub2_Sub1_23;

	@OriginalMember(owner = "client!td", name = "v", descriptor = "I")
	public static int anInt2838;

	@OriginalMember(owner = "client!td", name = "q", descriptor = "Lclient!rc;")
	private static Class55 aClass55_1205 = Static34.method846("Classic");

	@OriginalMember(owner = "client!td", name = "a", descriptor = "Lclient!rc;")
	public static Class55 aClass55_1196 = aClass55_1205;

	@OriginalMember(owner = "client!td", name = "b", descriptor = "Lclient!rc;")
	public static Class55 aClass55_1197 = Static34.method846("Ung-Ultige Session)2ID)3");

	@OriginalMember(owner = "client!td", name = "c", descriptor = "I")
	public static int anInt2831 = 0;

	@OriginalMember(owner = "client!td", name = "e", descriptor = "Lclient!rc;")
	public static Class55 aClass55_1198 = Static34.method846("Mitteilung");

	@OriginalMember(owner = "client!td", name = "g", descriptor = "Lclient!rc;")
	public static Class55 aClass55_1199 = Static34.method846("::clientdrop");

	@OriginalMember(owner = "client!td", name = "j", descriptor = "Lclient!rc;")
	private static Class55 aClass55_1201 = Static34.method846("Your account is already logged in)3");

	@OriginalMember(owner = "client!td", name = "h", descriptor = "Lclient!rc;")
	public static Class55 aClass55_1200 = aClass55_1201;

	@OriginalMember(owner = "client!td", name = "n", descriptor = "Lclient!rc;")
	private static Class55 aClass55_1204 = Static34.method846(" has logged in)3");

	@OriginalMember(owner = "client!td", name = "k", descriptor = "Lclient!rc;")
	public static Class55 aClass55_1202 = aClass55_1204;

	@OriginalMember(owner = "client!td", name = "l", descriptor = "Lclient!rc;")
	private static Class55 aClass55_1203 = Static34.method846("Unexpected loginserver response)3");

	@OriginalMember(owner = "client!td", name = "o", descriptor = "[I")
	public static int[] anIntArray266 = new int[5];

	@OriginalMember(owner = "client!td", name = "s", descriptor = "Lclient!le;")
	public static Class36 aClass36_34 = new Class36(30);

	@OriginalMember(owner = "client!td", name = "t", descriptor = "Lclient!rc;")
	public static Class55 aClass55_1206 = aClass55_1203;

	@OriginalMember(owner = "client!td", name = "u", descriptor = "I")
	public static int anInt2837 = 500;

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(B)V")
	public static void method1871() {
		aClass55_1204 = null;
		aClass55_1206 = null;
		aClass55_1196 = null;
		aClass55_1198 = null;
		aClass55_1201 = null;
		aClass55_1197 = null;
		aClass55_1202 = null;
		anIntArray266 = null;
		aClass36_34 = null;
		aClass55_1200 = null;
		aClass55_1205 = null;
		aClass55_1203 = null;
		aClass6_Sub2_Sub2_Sub1_23 = null;
		aClass55_1199 = null;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(II)V")
	public static void method1872(@OriginalArg(0) int arg0) {
		Static94.method1798(arg0);
	}

	@OriginalMember(owner = "client!td", name = "b", descriptor = "(II)Lclient!od;")
	public static Class6_Sub2_Sub8 method1873(@OriginalArg(0) int arg0) {
		@Pc(10) Class6_Sub2_Sub8 local10 = (Class6_Sub2_Sub8) Static104.aClass36_36.method1154((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static43.aClass40_23.method1243(arg0, 13);
		local10 = new Class6_Sub2_Sub8();
		local10.anInt2065 = arg0;
		if (local20 != null) {
			local10.method1405(new Class6_Sub1(local20));
		}
		Static104.aClass36_36.method1161((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(IIII)I")
	public static int method1874(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) int local5 = arg0 - 1 & arg1;
		@Pc(14) int local14 = arg1 / arg0;
		@Pc(24) int local24 = arg2 & arg0 - 1;
		@Pc(28) int local28 = arg2 / arg0;
		@Pc(33) int local33 = Static99.method1891(local28, local14);
		@Pc(40) int local40 = Static99.method1891(local28, local14 + 1);
		@Pc(47) int local47 = Static99.method1891(local28 + 1, local14);
		@Pc(56) int local56 = Static99.method1891(local28 + 1, local14 - -1);
		@Pc(63) int local63 = Static33.method828(local5, local40, local33, arg0);
		@Pc(70) int local70 = Static33.method828(local5, local56, local47, arg0);
		return Static33.method828(local24, local70, local63, arg0);
	}
}
