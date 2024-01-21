import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static92 {

	@OriginalMember(owner = "client!sa", name = "b", descriptor = "Lclient!oc;")
	public static Class34 aClass34_84;

	@OriginalMember(owner = "client!sa", name = "p", descriptor = "I")
	public static int anInt2919;

	@OriginalMember(owner = "client!sa", name = "x", descriptor = "Lclient!u;")
	public static Class62 aClass62_55;

	@OriginalMember(owner = "client!sa", name = "y", descriptor = "I")
	public static int anInt2923;

	@OriginalMember(owner = "client!sa", name = "c", descriptor = "Lclient!gd;")
	private static Class23 aClass23_1707 = Static15.method178("Login limit exceeded)3");

	@OriginalMember(owner = "client!sa", name = "d", descriptor = "I")
	public static int anInt2913 = -1;

	@OriginalMember(owner = "client!sa", name = "v", descriptor = "Lclient!gd;")
	private static Class23 aClass23_1714 = Static15.method178("To");

	@OriginalMember(owner = "client!sa", name = "e", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1708 = aClass23_1714;

	@OriginalMember(owner = "client!sa", name = "f", descriptor = "I")
	public static int anInt2914 = 1;

	@OriginalMember(owner = "client!sa", name = "g", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1709 = Static15.method178("Verbindung abgebrochen)3");

	@OriginalMember(owner = "client!sa", name = "h", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1710 = aClass23_1707;

	@OriginalMember(owner = "client!sa", name = "k", descriptor = "Lclient!gd;")
	private static Class23 aClass23_1712 = Static15.method178("Enter name:");

	@OriginalMember(owner = "client!sa", name = "j", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1711 = aClass23_1712;

	@OriginalMember(owner = "client!sa", name = "m", descriptor = "[[I")
	public static int[][] anIntArrayArray74 = new int[104][104];

	@OriginalMember(owner = "client!sa", name = "n", descriptor = "I")
	public static int anInt2917 = 0;

	@OriginalMember(owner = "client!sa", name = "r", descriptor = "[I")
	public static int[] anIntArray406 = new int[128];

	@OriginalMember(owner = "client!sa", name = "u", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1713 = Static15.method178("(Udns");

	@OriginalMember(owner = "client!sa", name = "w", descriptor = "I")
	public static int anInt2922 = 0;

	@OriginalMember(owner = "client!sa", name = "z", descriptor = "Lclient!gd;")
	private static Class23 aClass23_1715 = Static15.method178("Loaded wordpack");

	@OriginalMember(owner = "client!sa", name = "B", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1716 = aClass23_1715;

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(BLclient!gd;Lclient!rb;Lclient!gd;)Lclient!he;")
	public static Class1_Sub1_Sub6_Sub2 method1909(@OriginalArg(1) Class23 arg0, @OriginalArg(2) Class55 arg1, @OriginalArg(3) Class23 arg2) {
		@Pc(13) int local13 = arg1.method1885(arg2);
		@Pc(19) int local19 = arg1.method1876(local13, arg0);
		return Static109.method1858(arg1, local13, local19);
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIILclient!qa;)V")
	public static void method1911(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class1_Sub1_Sub2_Sub1_Sub2 arg2) {
		@Pc(15) int local15;
		if ((arg1 & 0x100) != 0) {
			arg2.anInt2222 = Static83.aClass1_Sub5_Sub1_3.method678();
			local15 = Static83.aClass1_Sub5_Sub1_3.method692();
			arg2.anInt2198 = local15 >> 16;
			if (arg2.anInt2222 == 65535) {
				arg2.anInt2222 = -1;
			}
			arg2.anInt2226 = 0;
			arg2.anInt2183 = (local15 & 0xFFFF) + Static7.anInt176;
			arg2.anInt2206 = 0;
			if (arg2.anInt2183 > Static7.anInt176) {
				arg2.anInt2206 = -1;
			}
		}
		@Pc(62) int local62;
		if ((arg1 & 0x1) != 0) {
			local15 = Static83.aClass1_Sub5_Sub1_3.method715();
			local62 = Static83.aClass1_Sub5_Sub1_3.method676();
			@Pc(66) int local66 = Static83.aClass1_Sub5_Sub1_3.method676();
			@Pc(69) int local69 = Static83.aClass1_Sub5_Sub1_3.anInt1266;
			if (arg2.aClass23_1260 != null && arg2.aClass58_2 != null) {
				@Pc(80) long local80 = arg2.aClass23_1260.method516();
				@Pc(82) boolean local82 = false;
				if (local62 <= 1) {
					for (@Pc(89) int local89 = 0; local89 < Static35.anInt1118; local89++) {
						if (local80 == Static58.aLongArray37[local89]) {
							local82 = true;
							break;
						}
					}
				}
				if (!local82 && Static46.anInt1571 == 0) {
					Static70.aClass1_Sub5_10.anInt1266 = 0;
					Static83.aClass1_Sub5_Sub1_3.method671(local66, Static70.aClass1_Sub5_10.aByteArray6);
					Static70.aClass1_Sub5_10.anInt1266 = 0;
					@Pc(133) Class23 local133 = Static10.method108(Static70.aClass1_Sub5_10).method527();
					arg2.aClass23_1257 = local133.method529();
					arg2.anInt2230 = local15 >> 8;
					arg2.anInt2210 = local15 & 0xFF;
					arg2.anInt2216 = 150;
					if (local62 == 2 || local62 == 3) {
						Static63.method1229(Static17.method233(new Class23[] { Static46.aClass23_850, arg2.aClass23_1260 }), local133, 1);
					} else if (local62 == 1) {
						Static63.method1229(Static17.method233(new Class23[] { Static8.aClass23_159, arg2.aClass23_1260 }), local133, 1);
					} else {
						Static63.method1229(arg2.aClass23_1260, local133, 2);
					}
				}
			}
			Static83.aClass1_Sub5_Sub1_3.anInt1266 = local66 + local69;
		}
		if ((arg1 & 0x40) != 0) {
			arg2.anInt2174 = Static83.aClass1_Sub5_Sub1_3.method675();
			if (arg2.anInt2174 == 65535) {
				arg2.anInt2174 = -1;
			}
		}
		if ((arg1 & 0x80) != 0) {
			arg2.aClass23_1257 = Static83.aClass1_Sub5_Sub1_3.method683();
			if (arg2.aClass23_1257.method519(0) == 126) {
				arg2.aClass23_1257 = arg2.aClass23_1257.method510(1);
				Static63.method1229(arg2.aClass23_1260, arg2.aClass23_1257, 2);
			} else if (Static14.aClass1_Sub1_Sub2_Sub1_Sub2_1 == arg2) {
				Static63.method1229(arg2.aClass23_1260, arg2.aClass23_1257, 2);
			}
			arg2.anInt2210 = 0;
			arg2.anInt2216 = 150;
			arg2.anInt2230 = 0;
		}
		if ((arg1 & 0x400) != 0) {
			local15 = Static83.aClass1_Sub5_Sub1_3.method713();
			local62 = Static83.aClass1_Sub5_Sub1_3.method676();
			arg2.method1386(Static7.anInt176, local15, local62);
			arg2.anInt2172 = Static7.anInt176 + 300;
			arg2.anInt2228 = Static83.aClass1_Sub5_Sub1_3.method718();
			arg2.anInt2173 = Static83.aClass1_Sub5_Sub1_3.method713();
		}
		if ((arg1 & 0x200) != 0) {
			arg2.anInt2191 = Static83.aClass1_Sub5_Sub1_3.method676();
			arg2.anInt2182 = Static83.aClass1_Sub5_Sub1_3.method713();
			arg2.anInt2209 = Static83.aClass1_Sub5_Sub1_3.method718();
			arg2.anInt2229 = Static83.aClass1_Sub5_Sub1_3.method718();
			arg2.anInt2221 = Static83.aClass1_Sub5_Sub1_3.method715() + Static7.anInt176;
			arg2.anInt2218 = Static83.aClass1_Sub5_Sub1_3.method728() + Static7.anInt176;
			arg2.anInt2202 = Static83.aClass1_Sub5_Sub1_3.method676();
			arg2.method1390();
		}
		if ((arg1 & 0x10) != 0) {
			local15 = Static83.aClass1_Sub5_Sub1_3.method716();
			local62 = Static83.aClass1_Sub5_Sub1_3.method676();
			arg2.method1386(Static7.anInt176, local15, local62);
			arg2.anInt2172 = Static7.anInt176 + 300;
			arg2.anInt2228 = Static83.aClass1_Sub5_Sub1_3.method713();
			arg2.anInt2173 = Static83.aClass1_Sub5_Sub1_3.method718();
		}
		if ((arg1 & 0x20) != 0) {
			local15 = Static83.aClass1_Sub5_Sub1_3.method676();
			@Pc(416) byte[] local416 = new byte[local15];
			@Pc(421) Class1_Sub5 local421 = new Class1_Sub5(local416);
			Static83.aClass1_Sub5_Sub1_3.method701(local15, local416);
			Static29.aClass1_Sub5Array1[arg0] = local421;
			arg2.method1402(local421);
		}
		if ((arg1 & 0x4) != 0) {
			local15 = Static83.aClass1_Sub5_Sub1_3.method675();
			if (local15 == 65535) {
				local15 = -1;
			}
			local62 = Static83.aClass1_Sub5_Sub1_3.method713();
			Static52.method995(local62, arg2, local15);
		}
		if ((arg1 & 0x8) != 0) {
			arg2.anInt2189 = Static83.aClass1_Sub5_Sub1_3.method728();
			arg2.anInt2181 = Static83.aClass1_Sub5_Sub1_3.method728();
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(Z)V")
	public static void method1912() {
		anIntArray406 = null;
		aClass23_1710 = null;
		aClass34_84 = null;
		aClass23_1716 = null;
		aClass62_55 = null;
		aClass23_1713 = null;
		aClass23_1707 = null;
		aClass23_1714 = null;
		aClass23_1708 = null;
		aClass23_1712 = null;
		aClass23_1709 = null;
		aClass23_1711 = null;
		aClass23_1715 = null;
		anIntArrayArray74 = null;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(ZI)Lclient!ue;")
	public static Class1_Sub1_Sub15 method1914(@OriginalArg(1) int arg0) {
		@Pc(6) Class1_Sub1_Sub15 local6 = (Class1_Sub1_Sub15) Static84.aClass5_50.method98((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(20) byte[] local20 = Static2.aClass55_36.method1867(arg0, 14);
		local6 = new Class1_Sub1_Sub15();
		if (local20 != null) {
			local6.method1779(new Class1_Sub5(local20));
		}
		Static84.aClass5_50.method97(local6, (long) arg0);
		return local6;
	}
}
