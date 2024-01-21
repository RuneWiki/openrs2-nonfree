import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static83 {

	@OriginalMember(owner = "client!qd", name = "e", descriptor = "Lclient!ab;")
	public static Class3_Sub1_Sub1_Sub1 aClass3_Sub1_Sub1_Sub1_8;

	@OriginalMember(owner = "client!qd", name = "w", descriptor = "[I")
	public static int[] anIntArray45;

	@OriginalMember(owner = "client!qd", name = "db", descriptor = "Z")
	private static boolean aBoolean23;

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "Lclient!v;")
	private static Class62 aClass62_197 = Static45.method753("Private chat");

	@OriginalMember(owner = "client!qd", name = "o", descriptor = "Lclient!v;")
	private static Class62 aClass62_201 = Static45.method753("Loaded fonts");

	@OriginalMember(owner = "client!qd", name = "b", descriptor = "Lclient!v;")
	public static Class62 aClass62_198 = aClass62_201;

	@OriginalMember(owner = "client!qd", name = "c", descriptor = "Lclient!v;")
	public static Class62 aClass62_199 = Static45.method753("scrollbar");

	@OriginalMember(owner = "client!qd", name = "h", descriptor = "Lclient!jb;")
	public static Class34 aClass34_7 = new Class34(64);

	@OriginalMember(owner = "client!qd", name = "n", descriptor = "Lclient!v;")
	public static Class62 aClass62_200 = Static45.method753("sch\u001c1tteln:");

	@OriginalMember(owner = "client!qd", name = "r", descriptor = "Lclient!v;")
	public static Class62 aClass62_202 = Static45.method753("(U(Y");

	@OriginalMember(owner = "client!qd", name = "u", descriptor = "Lclient!v;")
	public static Class62 aClass62_203 = Static45.method753("::fpsoff");

	@OriginalMember(owner = "client!qd", name = "D", descriptor = "Lclient!v;")
	public static Class62 aClass62_204 = aClass62_197;

	@OriginalMember(owner = "client!qd", name = "G", descriptor = "Lclient!v;")
	private static Class62 aClass62_205 = Static45.method753("Use");

	@OriginalMember(owner = "client!qd", name = "H", descriptor = "Lclient!v;")
	public static Class62 aClass62_206 = Static45.method753("lila:");

	@OriginalMember(owner = "client!qd", name = "O", descriptor = "Lclient!v;")
	public static Class62 aClass62_207 = Static45.method753(" steht bereits auf Ihrer Ignorieren)2Liste(Q");

	@OriginalMember(owner = "client!qd", name = "P", descriptor = "Lclient!v;")
	public static Class62 aClass62_208 = Static45.method753("Name des Gegenstands eingeben:");

	@OriginalMember(owner = "client!qd", name = "S", descriptor = "Lclient!v;")
	public static Class62 aClass62_209 = aClass62_205;

	@OriginalMember(owner = "client!qd", name = "V", descriptor = "Lclient!v;")
	public static Class62 aClass62_210 = Static45.method753("auf der Hautpseite)3");

	@OriginalMember(owner = "client!qd", name = "Z", descriptor = "I")
	public static int anInt539 = 0;

	@OriginalMember(owner = "client!qd", name = "ab", descriptor = "Lclient!v;")
	public static Class62 aClass62_211 = Static45.method753("backtop1");

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(ILclient!mb;IBI)[B")
	public static byte[] method349(@OriginalArg(0) int arg0, @OriginalArg(1) Class42 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(23) long local23 = (long) (arg0 * 37 + arg2 & 0xFFFF) + ((long) arg3 << 32) + (long) (arg0 << 16);
		if (Static94.aClass34_31 != null) {
			@Pc(31) Class3_Sub1_Sub7 local31 = (Class3_Sub1_Sub7) Static94.aClass34_31.method764(local23);
			if (local31 != null) {
				return local31.aByteArray8;
			}
		}
		@Pc(47) byte[] local47 = arg1.method1504(arg0, arg2);
		if (local47 == null) {
			return null;
		} else {
			if (Static94.aClass34_31 != null) {
				Static94.aClass34_31.method765(local23, new Class3_Sub1_Sub7(local47));
			}
			return local47;
		}
	}

	@OriginalMember(owner = "client!qd", name = "b", descriptor = "(B)V")
	public static void method352() {
		Static68.anInt1897 = 0;
		Static90.anInt2427 = 0;
		Static86.method1418();
		Static23.method500();
		Static51.method1435();
		@Pc(23) int local23;
		for (@Pc(17) int local17 = 0; local17 < Static68.anInt1897; local17++) {
			local23 = Static105.anIntArray309[local17];
			if (Static80.aClass3_Sub1_Sub3_Sub1_Sub2Array1[local23].anInt1875 != Static12.anInt451) {
				Static80.aClass3_Sub1_Sub3_Sub1_Sub2Array1[local23].aClass3_Sub1_Sub4_1 = null;
				Static80.aClass3_Sub1_Sub3_Sub1_Sub2Array1[local23] = null;
			}
		}
		if (Static63.anInt2386 != Static10.aClass3_Sub8_Sub1_5.anInt2704) {
			throw new RuntimeException("gnp1 pos:" + Static10.aClass3_Sub8_Sub1_5.anInt2704 + " psize:" + Static63.anInt2386);
		}
		for (local23 = 0; local23 < Static39.anInt1159; local23++) {
			if (Static80.aClass3_Sub1_Sub3_Sub1_Sub2Array1[Static16.anIntArray52[local23]] == null) {
				throw new RuntimeException("gnp2 pos:" + local23 + " size:" + Static39.anInt1159);
			}
		}
	}

	@OriginalMember(owner = "client!qd", name = "f", descriptor = "(I)V")
	public static void method359() {
		aClass62_198 = null;
		aClass3_Sub1_Sub1_Sub1_8 = null;
		aClass62_197 = null;
		aClass62_204 = null;
		aClass62_211 = null;
		aClass62_206 = null;
		aClass62_201 = null;
		aClass62_202 = null;
		aClass34_7 = null;
		aClass62_205 = null;
		aClass62_209 = null;
		aClass62_200 = null;
		aClass62_210 = null;
		aClass62_203 = null;
		aClass62_208 = null;
		aClass62_199 = null;
		anIntArray45 = null;
		aClass62_207 = null;
	}

	@OriginalMember(owner = "client!qd", name = "d", descriptor = "(B)V")
	public static void method362() {
		Static6.aClass34_1.method762();
		Static102.aClass34_32.method762();
	}
}
