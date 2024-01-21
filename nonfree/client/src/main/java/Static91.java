import java.awt.Component;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static91 {

	@OriginalMember(owner = "client!ra", name = "t", descriptor = "I")
	public static int anInt2351;

	@OriginalMember(owner = "client!ra", name = "x", descriptor = "[I")
	public static int[] anIntArray267;

	@OriginalMember(owner = "client!ra", name = "y", descriptor = "[I")
	public static int[] anIntArray268;

	@OriginalMember(owner = "client!ra", name = "l", descriptor = "Lclient!ae;")
	private static Class5 aClass5_1069 = Static56.method972(" ");

	@OriginalMember(owner = "client!ra", name = "h", descriptor = "Lclient!ae;")
	public static Class5 aClass5_1066 = aClass5_1069;

	@OriginalMember(owner = "client!ra", name = "i", descriptor = "Lclient!ae;")
	private static Class5 aClass5_1067 = Static56.method972("wave:");

	@OriginalMember(owner = "client!ra", name = "j", descriptor = "Lclient!bd;")
	public static Class9 aClass9_22 = new Class9(64);

	@OriginalMember(owner = "client!ra", name = "k", descriptor = "Lclient!ae;")
	public static Class5 aClass5_1068 = Static56.method972("Sie befinden sich in einem Mitglieder)2Gebiet(Q");

	@OriginalMember(owner = "client!ra", name = "m", descriptor = "Lclient!ae;")
	public static Class5 aClass5_1070 = aClass5_1067;

	@OriginalMember(owner = "client!ra", name = "n", descriptor = "Lclient!ae;")
	public static Class5 aClass5_1071 = Static56.method972("@cr2@");

	@OriginalMember(owner = "client!ra", name = "o", descriptor = "Lclient!ae;")
	private static Class5 aClass5_1072 = Static56.method972("Your profile will be transferred in:");

	@OriginalMember(owner = "client!ra", name = "p", descriptor = "Lclient!ae;")
	public static Class5 aClass5_1073 = Static56.method972("Das ist eine Mitglieder)2Welt(Q");

	@OriginalMember(owner = "client!ra", name = "q", descriptor = "I")
	public static int anInt2350 = -1;

	@OriginalMember(owner = "client!ra", name = "r", descriptor = "Lclient!ae;")
	public static Class5 aClass5_1074 = Static56.method972("Classic");

	@OriginalMember(owner = "client!ra", name = "s", descriptor = "[I")
	public static int[] anIntArray266 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!ra", name = "u", descriptor = "Lclient!ae;")
	public static Class5 aClass5_1075 = Static56.method972("m-Ochte sich mit Ihnen duellieren)3");

	@OriginalMember(owner = "client!ra", name = "v", descriptor = "Lclient!ae;")
	public static Class5 aClass5_1076 = aClass5_1072;

	@OriginalMember(owner = "client!ra", name = "w", descriptor = "I")
	public static int anInt2352 = 0;

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(ILjava/awt/Component;)V")
	public static void method1532(@OriginalArg(1) Component arg0) {
		arg0.removeMouseListener(Static114.aClass45_1);
		arg0.removeMouseMotionListener(Static114.aClass45_1);
		arg0.removeFocusListener(Static114.aClass45_1);
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(B)V")
	public static void method1533() {
		aClass5_1070 = null;
		aClass5_1074 = null;
		anIntArray267 = null;
		aClass5_1066 = null;
		aClass9_22 = null;
		aClass5_1075 = null;
		anIntArray266 = null;
		Class55.anIntArray265 = null;
		aClass5_1073 = null;
		aClass5_1072 = null;
		anIntArray268 = null;
		aClass5_1076 = null;
		aClass5_1071 = null;
		aClass5_1067 = null;
		aClass5_1068 = null;
		aClass5_1069 = null;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(I)V")
	public static void method1534() {
		Static75.aClass3_Sub6_Sub1_2.method1639();
		@Pc(21) int local21 = Static75.aClass3_Sub6_Sub1_2.method1646(8);
		@Pc(26) int local26;
		if (local21 < Static115.anInt2977) {
			for (local26 = local21; local26 < Static115.anInt2977; local26++) {
				Static37.anIntArray123[Static61.anInt1651++] = Static36.anIntArray320[local26];
			}
		}
		if (Static115.anInt2977 < local21) {
			throw new RuntimeException("gnpov1");
		}
		Static115.anInt2977 = 0;
		for (local26 = 0; local26 < local21; local26++) {
			@Pc(64) int local64 = Static36.anIntArray320[local26];
			@Pc(68) Class3_Sub1_Sub1_Sub1_Sub1 local68 = Static42.aClass3_Sub1_Sub1_Sub1_Sub1Array1[local64];
			@Pc(73) int local73 = Static75.aClass3_Sub6_Sub1_2.method1646(1);
			if (local73 == 0) {
				Static36.anIntArray320[Static115.anInt2977++] = local64;
				local68.anInt1556 = Static3.anInt289;
			} else {
				@Pc(93) int local93 = Static75.aClass3_Sub6_Sub1_2.method1646(2);
				if (local93 == 0) {
					Static36.anIntArray320[Static115.anInt2977++] = local64;
					local68.anInt1556 = Static3.anInt289;
					Static78.anIntArray224[Static83.anInt2051++] = local64;
				} else {
					@Pc(138) int local138;
					@Pc(148) int local148;
					if (local93 == 1) {
						Static36.anIntArray320[Static115.anInt2977++] = local64;
						local68.anInt1556 = Static3.anInt289;
						local138 = Static75.aClass3_Sub6_Sub1_2.method1646(3);
						local68.method1001(local138, false);
						local148 = Static75.aClass3_Sub6_Sub1_2.method1646(1);
						if (local148 == 1) {
							Static78.anIntArray224[Static83.anInt2051++] = local64;
						}
					} else if (local93 == 2) {
						Static36.anIntArray320[Static115.anInt2977++] = local64;
						local68.anInt1556 = Static3.anInt289;
						local138 = Static75.aClass3_Sub6_Sub1_2.method1646(3);
						local68.method1001(local138, true);
						local148 = Static75.aClass3_Sub6_Sub1_2.method1646(3);
						local68.method1001(local148, true);
						@Pc(202) int local202 = Static75.aClass3_Sub6_Sub1_2.method1646(1);
						if (local202 == 1) {
							Static78.anIntArray224[Static83.anInt2051++] = local64;
						}
					} else if (local93 == 3) {
						Static37.anIntArray123[Static61.anInt1651++] = local64;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(ZZ)V")
	public static void method1535(@OriginalArg(0) boolean arg0) {
		Static62.anInt1677++;
		if (Static62.anInt1677 < 50 && !arg0) {
			return;
		}
		Static62.anInt1677 = 0;
		if (Static102.aBoolean139 || Static58.aClass18_1 == null) {
			return;
		}
		Static95.aClass3_Sub6_Sub1_3.method1645(86);
		try {
			Static58.aClass18_1.method409(Static95.aClass3_Sub6_Sub1_3.aByteArray17, Static95.aClass3_Sub6_Sub1_3.anInt2416);
			Static95.aClass3_Sub6_Sub1_3.anInt2416 = 0;
		} catch (@Pc(50) IOException local50) {
			Static102.aBoolean139 = true;
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(III)Z")
	public static boolean method1536(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0 && Static44.anInt1247 == arg0) {
			return true;
		} else if (arg1 == 1 && Static85.anInt2114 == arg0) {
			return true;
		} else {
			return (arg1 == 2 || arg1 == 3) && arg0 == Static101.anInt2550;
		}
	}
}
