import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static97 {

	@OriginalMember(owner = "client!td", name = "a", descriptor = "I")
	public static int anInt2261 = 0;

	@OriginalMember(owner = "client!td", name = "r", descriptor = "Ljava/util/zip/CRC32;")
	public static CRC32 aCRC32_2 = new CRC32();

	@OriginalMember(owner = "client!td", name = "A", descriptor = "Lclient!hb;")
	public static Class27 aClass27_1076 = Static87.method1648("(U5");

	@OriginalMember(owner = "client!td", name = "S", descriptor = "Lclient!hb;")
	public static Class27 aClass27_1077 = Static87.method1648("Zu viele Verbindungen von Ihrer Adresse)3");

	@OriginalMember(owner = "client!td", name = "T", descriptor = "I")
	public static int anInt2290 = 0;

	@OriginalMember(owner = "client!td", name = "V", descriptor = "Lclient!hb;")
	public static Class27 aClass27_1078 = Static87.method1648("@yel@*V");

	@OriginalMember(owner = "client!td", name = "W", descriptor = "Lclient!hb;")
	public static Class27 aClass27_1079 = Static87.method1648("(U(Y");

	@OriginalMember(owner = "client!td", name = "X", descriptor = "Lclient!fc;")
	public static Class21 aClass21_28 = new Class21(100);

	@OriginalMember(owner = "client!td", name = "Y", descriptor = "Z")
	public static boolean aBoolean112 = false;

	@OriginalMember(owner = "client!td", name = "Z", descriptor = "Lclient!hb;")
	public static Class27 aClass27_1080 = Static87.method1648("scrollbar");

	@OriginalMember(owner = "client!td", name = "ab", descriptor = "[Lclient!hd;")
	public static Class3_Sub3_Sub1_Sub4_Sub1[] aClass3_Sub3_Sub1_Sub4_Sub1Array2 = new Class3_Sub3_Sub1_Sub4_Sub1[32768];

	@OriginalMember(owner = "client!td", name = "bb", descriptor = "Lclient!hb;")
	public static Class27 aClass27_1081 = Static87.method1648("Sie befinden sich in einem Mitglieder)2Gebiet(Q");

	@OriginalMember(owner = "client!td", name = "cb", descriptor = "Lclient!hb;")
	public static Class27 aClass27_1082 = Static87.method1648("logo");

	@OriginalMember(owner = "client!td", name = "db", descriptor = "Lclient!hb;")
	public static Class27 aClass27_1083 = Static87.method1648("welle2:");

	@OriginalMember(owner = "client!td", name = "eb", descriptor = "I")
	public static int anInt2292 = 128;

	@OriginalMember(owner = "client!td", name = "b", descriptor = "(II)Lclient!me;")
	public static Class3_Sub3_Sub8 method1604(@OriginalArg(0) int arg0) {
		@Pc(15) Class3_Sub3_Sub8 local15 = (Class3_Sub3_Sub8) Static39.aClass21_16.method658((long) arg0);
		if (local15 != null) {
			return local15;
		}
		@Pc(25) byte[] local25 = Static17.aClass54_9.method1615(1, arg0);
		local15 = new Class3_Sub3_Sub8();
		if (local25 != null) {
			local15.method1222(new Class3_Sub11(local25), arg0);
		}
		local15.method1225();
		Static39.aClass21_16.method660(local15, (long) arg0);
		return local15;
	}

	@OriginalMember(owner = "client!td", name = "b", descriptor = "(I)V")
	public static void method1606() {
		aClass27_1083 = null;
		aClass21_28 = null;
		aClass27_1077 = null;
		aClass27_1081 = null;
		aCRC32_2 = null;
		aClass27_1079 = null;
		aClass27_1082 = null;
		aClass27_1076 = null;
		aClass27_1078 = null;
		aClass27_1080 = null;
		aClass3_Sub3_Sub1_Sub4_Sub1Array2 = null;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(IB)V")
	public static void method1607(@OriginalArg(0) int arg0) {
		Static40.method871(arg0);
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(Z)V")
	public static void method1614() {
		if (Static106.anInt834 != 1) {
			return;
		}
		if (Static50.anInt1341 >= 6 && Static50.anInt1341 <= 106 && Static35.anInt850 >= 467 && Static35.anInt850 <= 499) {
			Static13.aBoolean40 = true;
			Static76.anInt2134 = (Static76.anInt2134 + 1) % 4;
			Static89.aBoolean120 = true;
			Static78.aClass3_Sub11_Sub1_3.method1478(171);
			Static78.aClass3_Sub11_Sub1_3.method1443(Static76.anInt2134);
			Static78.aClass3_Sub11_Sub1_3.method1443(Static34.anInt828);
			Static78.aClass3_Sub11_Sub1_3.method1443(Static61.anInt1554);
		}
		if (Static50.anInt1341 >= 135 && Static50.anInt1341 <= 235 && Static35.anInt850 >= 467 && Static35.anInt850 <= 499) {
			Static89.aBoolean120 = true;
			Static13.aBoolean40 = true;
			Static34.anInt828 = (Static34.anInt828 + 1) % 3;
			Static78.aClass3_Sub11_Sub1_3.method1478(171);
			Static78.aClass3_Sub11_Sub1_3.method1443(Static76.anInt2134);
			Static78.aClass3_Sub11_Sub1_3.method1443(Static34.anInt828);
			Static78.aClass3_Sub11_Sub1_3.method1443(Static61.anInt1554);
		}
		if (Static50.anInt1341 >= 273 && Static50.anInt1341 <= 373 && Static35.anInt850 >= 467 && Static35.anInt850 <= 499) {
			Static61.anInt1554 = (Static61.anInt1554 + 1) % 3;
			Static89.aBoolean120 = true;
			Static13.aBoolean40 = true;
			Static78.aClass3_Sub11_Sub1_3.method1478(171);
			Static78.aClass3_Sub11_Sub1_3.method1443(Static76.anInt2134);
			Static78.aClass3_Sub11_Sub1_3.method1443(Static34.anInt828);
			Static78.aClass3_Sub11_Sub1_3.method1443(Static61.anInt1554);
		}
		if (Static50.anInt1341 < 412 || Static50.anInt1341 > 512 || Static35.anInt850 < 467 || Static35.anInt850 > 499) {
			return;
		}
		if (Static104.anInt2723 != -1) {
			Static43.method901(Static106.aClass27_416, Static45.aClass27_182, 0);
			return;
		}
		Static73.method1340();
		if (Static4.anInt2754 != -1) {
			Static108.anInt2774 = Static104.anInt2723 = Static4.anInt2754;
			Static45.aClass27_178 = Static45.aClass27_182;
			Static13.aBoolean41 = false;
			return;
		}
	}

	@OriginalMember(owner = "client!td", name = "d", descriptor = "(II)Lclient!hb;")
	public static Class27 method1616(@OriginalArg(1) int arg0) {
		return Static67.method1241(arg0);
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(IIIIBIIILclient!m;)V")
	public static void method1622(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class3_Sub3_Sub6 arg7) {
		if (Static45.aBoolean21) {
			Static87.anInt2343 = 32;
		} else {
			Static87.anInt2343 = 0;
		}
		Static45.aBoolean21 = false;
		if (arg0 >= arg2 && arg0 < arg2 + 16 && arg3 <= arg1 && arg3 + 16 > arg1) {
			arg7.anInt1618 -= Static18.anInt424 * 4;
			if (arg5 == 1) {
				Static75.aBoolean101 = true;
			}
			if (arg5 == 2 || arg5 == 3) {
				Static13.aBoolean40 = true;
			}
		} else if (arg0 >= arg2 && arg0 < arg2 + 16 && arg3 + arg4 - 16 <= arg1 && arg1 < arg3 + arg4) {
			if (arg5 == 1) {
				Static75.aBoolean101 = true;
			}
			if (arg5 == 2 || arg5 == 3) {
				Static13.aBoolean40 = true;
			}
			arg7.anInt1618 += Static18.anInt424 * 4;
		} else if (arg2 - Static87.anInt2343 <= arg0 && arg2 + Static87.anInt2343 + 16 > arg0 && arg1 >= arg3 + 16 && arg1 < arg4 + arg3 - 16 && Static18.anInt424 > 0) {
			Static45.aBoolean21 = true;
			@Pc(120) int local120 = arg4 * (arg4 - 32) / arg6;
			if (arg5 == 1) {
				Static75.aBoolean101 = true;
			}
			if (arg5 == 2 || arg5 == 3) {
				Static13.aBoolean40 = true;
			}
			if (local120 < 8) {
				local120 = 8;
			}
			@Pc(149) int local149 = arg4 - local120 - 32;
			@Pc(161) int local161 = arg1 - arg3 - local120 / 2 - 16;
			arg7.anInt1618 = local161 * (arg6 - arg4) / local149;
		}
	}
}
