import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static89 {

	@OriginalMember(owner = "client!rc", name = "A", descriptor = "I")
	public static int anInt2357;

	@OriginalMember(owner = "client!rc", name = "C", descriptor = "Lclient!pa;")
	public static Class51 aClass51_47;

	@OriginalMember(owner = "client!rc", name = "D", descriptor = "[Z")
	public static boolean[] aBooleanArray12;

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "Lclient!ie;")
	public static Class34 aClass34_44 = new Class34();

	@OriginalMember(owner = "client!rc", name = "w", descriptor = "Lclient!ke;")
	private static Class39 aClass39_1075 = Static2.method66("Loaded gamescreen");

	@OriginalMember(owner = "client!rc", name = "c", descriptor = "Lclient!ke;")
	public static Class39 aClass39_1070 = aClass39_1075;

	@OriginalMember(owner = "client!rc", name = "d", descriptor = "Lclient!ke;")
	public static Class39 aClass39_1071 = Static2.method66("sideicons");

	@OriginalMember(owner = "client!rc", name = "f", descriptor = "Lclient!ke;")
	public static Class39 aClass39_1072 = Static2.method66("Bitte warten Sie eine Minute");

	@OriginalMember(owner = "client!rc", name = "n", descriptor = "Lclient!ke;")
	public static Class39 aClass39_1073 = Static2.method66("Hierhin gehen");

	@OriginalMember(owner = "client!rc", name = "o", descriptor = "I")
	public static int anInt2352 = 0;

	@OriginalMember(owner = "client!rc", name = "q", descriptor = "Lclient!ke;")
	public static Class39 aClass39_1074 = Static2.method66("Cabbage");

	@OriginalMember(owner = "client!rc", name = "x", descriptor = "Lclient!ke;")
	public static Class39 aClass39_1076 = Static2.method66("Ung-Ultige Verbindung mit einem Anmelde)2Server)3");

	@OriginalMember(owner = "client!rc", name = "y", descriptor = "Lclient!ke;")
	private static Class39 aClass39_1077 = Static2.method66("Please check your message)2centre for details)3");

	@OriginalMember(owner = "client!rc", name = "z", descriptor = "[I")
	public static int[] anIntArray302 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!rc", name = "B", descriptor = "Lclient!ke;")
	public static Class39 aClass39_1078 = Static2.method66("RuneScape wird geladen )2 bitte warten)3)3)3");

	@OriginalMember(owner = "client!rc", name = "F", descriptor = "Lclient!ke;")
	public static Class39 aClass39_1079 = aClass39_1077;

	@OriginalMember(owner = "client!rc", name = "G", descriptor = "Lclient!ke;")
	public static Class39 aClass39_1080 = Static2.method66("Maximale Anmelde)2Versuche -Uberschritten)3");

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(ILclient!ke;Lclient!g;)I")
	public static int method1670(@OriginalArg(1) Class39 arg0, @OriginalArg(2) Class2_Sub5 arg1) {
		@Pc(6) int local6 = arg1.anInt1772;
		arg1.method1262(arg0.anInt1601);
		arg1.anInt1772 += Static19.aClass30_1.method830(arg1.aByteArray16, arg1.anInt1772, arg0.anInt1601, arg0.aByteArray13, 0);
		return arg1.anInt1772 - local6;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(I)V")
	public static void method1672() {
		anIntArray302 = null;
		aClass39_1071 = null;
		aClass39_1080 = null;
		aClass39_1070 = null;
		aClass39_1077 = null;
		aClass51_47 = null;
		aBooleanArray12 = null;
		aClass39_1078 = null;
		aClass39_1074 = null;
		aClass39_1076 = null;
		aClass39_1072 = null;
		aClass39_1075 = null;
		aClass39_1073 = null;
		aClass34_44 = null;
		aClass39_1079 = null;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lclient!ec;Lclient!ke;I)Lclient!ke;")
	public static Class39 method1675(@OriginalArg(0) Class2_Sub1_Sub6 arg0, @OriginalArg(1) Class39 arg1) {
		if (arg1.method1100(Static108.aClass39_1318) == -1) {
			return arg1;
		}
		while (true) {
			@Pc(20) int local20 = arg1.method1100(Static67.aClass39_872);
			if (local20 == -1) {
				while (true) {
					local20 = arg1.method1100(Static67.aClass39_866);
					if (local20 == -1) {
						while (true) {
							local20 = arg1.method1100(Static64.aClass39_835);
							if (local20 == -1) {
								while (true) {
									local20 = arg1.method1100(Static90.aClass39_1095);
									if (local20 == -1) {
										while (true) {
											local20 = arg1.method1100(Static2.aClass39_36);
											if (local20 == -1) {
												while (true) {
													local20 = arg1.method1100(Static102.aClass39_1266);
													if (local20 == -1) {
														return arg1;
													}
													@Pc(226) Class39 local226 = Static86.aClass39_1048;
													if (Static85.aClass19_7 != null) {
														local226 = Static41.method828(Static85.aClass19_7.anInt800);
														try {
															if (Static85.aClass19_7.anObject3 != null) {
																@Pc(242) byte[] local242 = ((String) Static85.aClass19_7.anObject3).getBytes("ISO-8859-1");
																local226 = Static100.method1952(0, local242.length, local242);
															}
														} catch (@Pc(251) UnsupportedEncodingException local251) {
														}
													}
													arg1 = Static20.method431(new Class39[] { arg1.method1115(0, local20), local226, arg1.method1099(local20 + 4) });
												}
											}
											arg1 = Static20.method431(new Class39[] { arg1.method1115(0, local20), Static82.method1582(Static66.method1377(arg0, 4)), arg1.method1099(local20 + 2) });
										}
									}
									arg1 = Static20.method431(new Class39[] { arg1.method1115(0, local20), Static82.method1582(Static66.method1377(arg0, 3)), arg1.method1099(local20 + 2) });
								}
							}
							arg1 = Static20.method431(new Class39[] { arg1.method1115(0, local20), Static82.method1582(Static66.method1377(arg0, 2)), arg1.method1099(local20 + 2) });
						}
					}
					arg1 = Static20.method431(new Class39[] { arg1.method1115(0, local20), Static82.method1582(Static66.method1377(arg0, 1)), arg1.method1099(local20 + 2) });
				}
			}
			arg1 = Static20.method431(new Class39[] { arg1.method1115(0, local20), Static82.method1582(Static66.method1377(arg0, 0)), arg1.method1099(local20 + 2) });
		}
	}

	@OriginalMember(owner = "client!rc", name = "b", descriptor = "(Z)V")
	public static void method1677() {
		Static51.aByteArrayArray10 = null;
		Static95.anIntArray314 = null;
		Static46.anIntArray179 = null;
		Static10.anIntArray34 = null;
		Static30.anIntArray94 = null;
		Static83.anIntArray297 = null;
	}
}
