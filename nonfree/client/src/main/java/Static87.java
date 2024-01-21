import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static87 {

	@OriginalMember(owner = "client!oc", name = "b", descriptor = "Lclient!kd;")
	private static Class39 aClass39_1003 = Static108.method1915("To play on this world move to a free area first");

	@OriginalMember(owner = "client!oc", name = "c", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1004 = Static108.method1915("Freunde");

	@OriginalMember(owner = "client!oc", name = "e", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1005 = Static108.method1915("Verbindung abgebrochen)3");

	@OriginalMember(owner = "client!oc", name = "l", descriptor = "Lclient!kd;")
	private static Class39 aClass39_1011 = Static108.method1915("flash3:");

	@OriginalMember(owner = "client!oc", name = "f", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1006 = aClass39_1011;

	@OriginalMember(owner = "client!oc", name = "h", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1007 = aClass39_1003;

	@OriginalMember(owner = "client!oc", name = "i", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1008 = Static108.method1915("Weiter");

	@OriginalMember(owner = "client!oc", name = "j", descriptor = "Lclient!kd;")
	private static Class39 aClass39_1009 = Static108.method1915("Drop");

	@OriginalMember(owner = "client!oc", name = "k", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1010 = Static108.method1915("sl_arrows");

	@OriginalMember(owner = "client!oc", name = "m", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1012 = Static108.method1915("Spieler)3 Bitte w-=hlen Sie eine andere Welt)3");

	@OriginalMember(owner = "client!oc", name = "n", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1013 = aClass39_1009;

	@OriginalMember(owner = "client!oc", name = "p", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1014 = aClass39_1011;

	@OriginalMember(owner = "client!oc", name = "q", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1015 = Static108.method1915("cross");

	@OriginalMember(owner = "client!oc", name = "r", descriptor = "J")
	public static long aLong59 = 0L;

	@OriginalMember(owner = "client!oc", name = "s", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1016 = Static108.method1915("Registrierter Benutzer");

	@OriginalMember(owner = "client!oc", name = "u", descriptor = "I")
	public static int anInt2023 = 78;

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lclient!q;I)V")
	public static void method1425(@OriginalArg(0) Class62 arg0) {
		Static47.aClass62_12 = arg0;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(ILclient!qc;I)Lclient!kd;")
	public static Class39 method1426(@OriginalArg(1) Class1_Sub18 arg0) {
		try {
			@Pc(7) Class39 local7 = new Class39();
			local7.anInt1707 = arg0.method2175();
			if (local7.anInt1707 > 32767) {
				local7.anInt1707 = 32767;
			}
			local7.aByteArray50 = new byte[local7.anInt1707];
			arg0.anInt3078 += Static50.aClass68_1.method1946(arg0.aByteArray96, 0, arg0.anInt3078, local7.aByteArray50, local7.anInt1707);
			return local7;
		} catch (@Pc(48) Exception local48) {
			return Static28.aClass39_1235;
		}
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(B)V")
	public static void method1427() {
		while (true) {
			if (Static79.aClass1_Sub18_Sub1_3.method2191(Static72.anInt1801) >= 27) {
				@Pc(18) int local18 = Static79.aClass1_Sub18_Sub1_3.method2199(15);
				if (local18 != 32767) {
					@Pc(25) boolean local25 = false;
					if (Static114.aClass1_Sub1_Sub2_Sub1_Sub1Array1[local18] == null) {
						Static114.aClass1_Sub1_Sub2_Sub1_Sub1Array1[local18] = new Class1_Sub1_Sub2_Sub1_Sub1();
						local25 = true;
					}
					@Pc(41) Class1_Sub1_Sub2_Sub1_Sub1 local41 = Static114.aClass1_Sub1_Sub2_Sub1_Sub1Array1[local18];
					Static51.anIntArray192[Static20.anInt731++] = local18;
					local41.anInt2514 = Static45.anInt1256;
					@Pc(59) int local59 = Static11.anIntArray89[Static79.aClass1_Sub18_Sub1_3.method2199(3)];
					if (local25) {
						local41.anInt2509 = local59;
					}
					local41.aClass1_Sub1_Sub5_1 = Static120.method2132(Static79.aClass1_Sub18_Sub1_3.method2199(13));
					@Pc(77) int local77 = Static79.aClass1_Sub18_Sub1_3.method2199(1);
					@Pc(82) int local82 = Static79.aClass1_Sub18_Sub1_3.method2199(5);
					@Pc(87) int local87 = Static79.aClass1_Sub18_Sub1_3.method2199(1);
					if (local87 == 1) {
						Static117.anIntArray460[Static94.anInt2224++] = local18;
					}
					@Pc(105) int local105 = Static79.aClass1_Sub18_Sub1_3.method2199(5);
					if (local82 > 15) {
						local82 -= 32;
					}
					local41.anInt2520 = local41.aClass1_Sub1_Sub5_1.anInt905;
					local41.anInt2486 = local41.aClass1_Sub1_Sub5_1.anInt910;
					if (local105 > 15) {
						local105 -= 32;
					}
					local41.anInt2478 = local41.aClass1_Sub1_Sub5_1.anInt912;
					if (local41.anInt2478 == 0) {
						local41.anInt2509 = 0;
					}
					local41.anInt2503 = local41.aClass1_Sub1_Sub5_1.anInt918;
					local41.anInt2504 = local41.aClass1_Sub1_Sub5_1.anInt902;
					local41.anInt2505 = local41.aClass1_Sub1_Sub5_1.anInt899;
					local41.anInt2496 = local41.aClass1_Sub1_Sub5_1.anInt925;
					local41.anInt2491 = local41.aClass1_Sub1_Sub5_1.anInt913;
					local41.anInt2487 = local41.aClass1_Sub1_Sub5_1.anInt911;
					local41.method1803(Static65.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray387[0] + local105, local82 + Static65.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray389[0], local77 == 1);
					continue;
				}
			}
			Static79.aClass1_Sub18_Sub1_3.method2198();
			return;
		}
	}

	@OriginalMember(owner = "client!oc", name = "c", descriptor = "(B)V")
	public static void method1430() {
		aClass39_1013 = null;
		aClass39_1014 = null;
		aClass39_1007 = null;
		aClass39_1010 = null;
		aClass39_1012 = null;
		aClass39_1008 = null;
		aClass39_1003 = null;
		aClass39_1005 = null;
		aClass39_1004 = null;
		aClass39_1015 = null;
		aClass39_1011 = null;
		aClass39_1009 = null;
		aClass39_1006 = null;
		aClass39_1016 = null;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "([BII)I")
	public static int method1431(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		return Static118.method2041(arg1, 0, arg0);
	}
}
