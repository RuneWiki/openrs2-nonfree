import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static94 {

	@OriginalMember(owner = "client!se", name = "bb", descriptor = "[I")
	public static int[] anIntArray248;

	@OriginalMember(owner = "client!se", name = "db", descriptor = "I")
	public static int anInt2642;

	@OriginalMember(owner = "client!se", name = "nb", descriptor = "I")
	public static int anInt2650;

	@OriginalMember(owner = "client!se", name = "ab", descriptor = "I")
	public static volatile int anInt2641 = 0;

	@OriginalMember(owner = "client!se", name = "cb", descriptor = "Lclient!rc;")
	public static Class55 aClass55_1130 = Static34.method846("Ihr Spielkonto wird bereits benutzt)3");

	@OriginalMember(owner = "client!se", name = "fb", descriptor = "Lclient!rc;")
	private static Class55 aClass55_1131 = Static34.method846("Public chat");

	@OriginalMember(owner = "client!se", name = "gb", descriptor = "I")
	public static int anInt2644 = 0;

	@OriginalMember(owner = "client!se", name = "hb", descriptor = "I")
	public static int anInt2645 = 0;

	@OriginalMember(owner = "client!se", name = "ib", descriptor = "[I")
	public static int[] anIntArray249 = new int[5];

	@OriginalMember(owner = "client!se", name = "lb", descriptor = "I")
	public static int anInt2648 = 0;

	@OriginalMember(owner = "client!se", name = "ob", descriptor = "Lclient!rc;")
	public static Class55 aClass55_1132 = Static34.method846("Benutzername: ");

	@OriginalMember(owner = "client!se", name = "tb", descriptor = "Lclient!rc;")
	public static Class55 aClass55_1133 = aClass55_1131;

	@OriginalMember(owner = "client!se", name = "vb", descriptor = "Lclient!rc;")
	public static Class55 aClass55_1134 = Static34.method846("und Ihr Passwort ein)3");

	@OriginalMember(owner = "client!se", name = "b", descriptor = "(Z)V")
	public static void method1792() {
		if (Static57.aClass5_1 == null) {
			return;
		}
		if (Static49.anInt1569 >= 0) {
			if (Static52.anInt1647 > 0) {
				Static104.anInt3067 += Static85.anInt2394;
				Static57.aClass5_1.method1604(Static49.anInt1569, Static104.anInt3067);
				Static52.anInt1647--;
				if (Static52.anInt1647 == 0) {
					Static57.aClass5_1.method1606();
					Static52.anInt1647 = 20;
					Static49.anInt1569 = -1;
				}
			}
		} else if (Static52.anInt1647 > 0) {
			Static52.anInt1647--;
			if (Static52.anInt1647 == 0) {
				if (Static93.aByteArray13 == null) {
					Static57.aClass5_1.method1602(256);
				} else {
					Static57.aClass5_1.method1602(Static13.anInt799);
					Static49.anInt1569 = Static13.anInt799;
					Static57.aClass5_1.method1600(Static93.aByteArray13, Static58.aBoolean79, Static13.anInt799);
					Static93.aByteArray13 = null;
				}
				Static104.anInt3067 = 0;
			}
		}
		Static57.aClass5_1.method1598();
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(Lclient!jc;IILclient!md;)V")
	public static void method1793(@OriginalArg(0) Class32 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class40_Sub1 arg2) {
		@Pc(7) Class6_Sub8 local7 = new Class6_Sub8();
		local7.aLong114 = arg1;
		local7.aClass32_2 = arg0;
		local7.aClass40_Sub1_21 = arg2;
		local7.anInt1568 = 1;
		@Pc(26) Class3 local26 = Static90.aClass3_6;
		synchronized (Static90.aClass3_6) {
			Static90.aClass3_6.method23(local7);
		}
		Static10.method445();
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(ILclient!pb;)V")
	public static void method1795(@OriginalArg(1) Class40 arg0) {
		Static92.aClass40_32 = arg0;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(BI)I")
	public static int method1797(@OriginalArg(1) int arg0) {
		return (int) (Math.log((double) arg0 * 0.00390625D) * 868.5889638065036D + 0.5D);
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(IB)V")
	public static void method1798(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !Static56.aBooleanArray6[arg0]) {
			return;
		}
		Static77.aClass40_27.method1247(arg0);
		if (Static9.aClass6_Sub2_Sub14ArrayArray1[arg0] == null) {
			return;
		}
		@Pc(26) boolean local26 = true;
		for (@Pc(33) int local33 = 0; local33 < Static9.aClass6_Sub2_Sub14ArrayArray1[arg0].length; local33++) {
			if (Static9.aClass6_Sub2_Sub14ArrayArray1[arg0][local33] != null) {
				if (Static9.aClass6_Sub2_Sub14ArrayArray1[arg0][local33].anInt2890 == 2) {
					local26 = false;
				} else {
					Static9.aClass6_Sub2_Sub14ArrayArray1[arg0][local33] = null;
				}
			}
		}
		if (local26) {
			Static9.aClass6_Sub2_Sub14ArrayArray1[arg0] = null;
		}
		Static56.aBooleanArray6[arg0] = false;
	}

	@OriginalMember(owner = "client!se", name = "f", descriptor = "(I)V")
	public static void method1799() {
		aClass55_1133 = null;
		anIntArray248 = null;
		aClass55_1132 = null;
		aClass55_1134 = null;
		aClass55_1130 = null;
		aClass55_1131 = null;
		anIntArray249 = null;
	}
}
