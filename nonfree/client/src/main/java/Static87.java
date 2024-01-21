import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static87 {

	@OriginalMember(owner = "client!rb", name = "ab", descriptor = "Lclient!w;")
	public static Class55_Sub1 aClass55_Sub1_18;

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1687 = Static15.method178("Bitte warten Sie)3)3)3");

	@OriginalMember(owner = "client!rb", name = "f", descriptor = "Lclient!gd;")
	private static Class23 aClass23_1688 = Static15.method178("Bad session id)3");

	@OriginalMember(owner = "client!rb", name = "m", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1689 = Static15.method178(" steht bereits auf Ihrer Ignorieren)2Liste(Q");

	@OriginalMember(owner = "client!rb", name = "s", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1690 = null;

	@OriginalMember(owner = "client!rb", name = "F", descriptor = "I")
	public static int anInt2853 = 0;

	@OriginalMember(owner = "client!rb", name = "G", descriptor = "I")
	public static int anInt2854 = 0;

	@OriginalMember(owner = "client!rb", name = "I", descriptor = "Lclient!ba;")
	public static Class5 aClass5_63 = new Class5(260);

	@OriginalMember(owner = "client!rb", name = "N", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1691 = aClass23_1688;

	@OriginalMember(owner = "client!rb", name = "bb", descriptor = "Lclient!gd;")
	private static Class23 aClass23_1693 = Static15.method178("Press (Wrecover a locked account(W on front page)3");

	@OriginalMember(owner = "client!rb", name = "Y", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1692 = aClass23_1693;

	@OriginalMember(owner = "client!rb", name = "Z", descriptor = "I")
	public static int anInt2866 = -1;

	@OriginalMember(owner = "client!rb", name = "cb", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1694 = Static15.method178("Side panel redrawn");

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(B)V")
	public static void method1866() {
		aClass23_1689 = null;
		aClass23_1692 = null;
		aClass23_1688 = null;
		aClass23_1690 = null;
		aClass55_Sub1_18 = null;
		aClass23_1694 = null;
		aClass23_1687 = null;
		aClass23_1693 = null;
		aClass5_63 = null;
		aClass23_1691 = null;
	}

	@OriginalMember(owner = "client!rb", name = "b", descriptor = "(I)V")
	public static void method1870() {
		@Pc(3) Class29 local3 = Static113.aClass29_1;
		synchronized (Static113.aClass29_1) {
			Static57.anInt1780 = Static83.anInt2321;
			@Pc(14) int local14;
			if (Static47.anInt1598 < 0) {
				for (local14 = 0; local14 < 112; local14++) {
					Static90.aBooleanArray10[local14] = false;
				}
				Static47.anInt1598 = Static55.anInt1716;
			} else {
				while (Static47.anInt1598 != Static55.anInt1716) {
					local14 = Static60.anIntArray208[Static55.anInt1716];
					Static55.anInt1716 = Static55.anInt1716 + 1 & 0x7F;
					if (local14 < 0) {
						Static90.aBooleanArray10[~local14] = false;
					} else {
						Static90.aBooleanArray10[local14] = true;
					}
				}
			}
			Static83.anInt2321 = Static114.anInt2952;
		}
	}

	@OriginalMember(owner = "client!rb", name = "c", descriptor = "(IB)Z")
	public static boolean method1873(@OriginalArg(0) int arg0) {
		return arg0 >= 48 && arg0 <= 57;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(BIIIIIIIII)V")
	public static void method1880(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(13) Class1_Sub11 local13 = null;
		for (@Pc(18) Class1_Sub11 local18 = (Class1_Sub11) Static109.aClass45_9.method1299(); local18 != null; local18 = (Class1_Sub11) Static109.aClass45_9.method1288()) {
			if (local18.anInt2037 == arg2 && local18.anInt2039 == arg6 && arg7 == local18.anInt2041 && local18.anInt2046 == arg4) {
				local13 = local18;
				break;
			}
		}
		if (local13 == null) {
			local13 = new Class1_Sub11();
			local13.anInt2037 = arg2;
			local13.anInt2046 = arg4;
			local13.anInt2041 = arg7;
			local13.anInt2039 = arg6;
			Static52.method997(local13);
			Static109.aClass45_9.method1295(local13);
		}
		local13.anInt2043 = arg0;
		local13.anInt2049 = arg3;
		local13.anInt2038 = arg8;
		local13.anInt2035 = arg1;
		local13.anInt2048 = arg5;
	}

	@OriginalMember(owner = "client!rb", name = "d", descriptor = "(II)Lclient!ta;")
	public static Class1_Sub1_Sub13 method1882(@OriginalArg(1) int arg0) {
		@Pc(6) Class1_Sub1_Sub13 local6 = (Class1_Sub1_Sub13) Static100.aClass5_56.method98((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(20) byte[] local20 = Static113.aClass55_41.method1867(arg0, 16);
		local6 = new Class1_Sub1_Sub13();
		if (local20 != null) {
			local6.method1644(new Class1_Sub5(local20));
		}
		Static100.aClass5_56.method97(local6, (long) arg0);
		return local6;
	}
}
