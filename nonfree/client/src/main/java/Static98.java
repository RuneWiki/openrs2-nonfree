import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static98 {

	@OriginalMember(owner = "client!ua", name = "R", descriptor = "[[B")
	public static byte[][] aByteArrayArray9;

	@OriginalMember(owner = "client!ua", name = "T", descriptor = "[I")
	public static int[] anIntArray280;

	@OriginalMember(owner = "client!ua", name = "ab", descriptor = "[I")
	public static int[] anIntArray281;

	@OriginalMember(owner = "client!ua", name = "db", descriptor = "I")
	public static int anInt2587;

	@OriginalMember(owner = "client!ua", name = "gb", descriptor = "[I")
	public static int[] anIntArray282;

	@OriginalMember(owner = "client!ua", name = "S", descriptor = "Lclient!v;")
	private static Class62 aClass62_1187 = Static45.method753("New User");

	@OriginalMember(owner = "client!ua", name = "V", descriptor = "Lclient!v;")
	public static Class62 aClass62_1188 = Static45.method753("Wen m\u001c1chten Sie der Liste hinzuf\u001c1gen?");

	@OriginalMember(owner = "client!ua", name = "W", descriptor = "I")
	public static int anInt2584 = 0;

	@OriginalMember(owner = "client!ua", name = "X", descriptor = "Lclient!v;")
	private static Class62 aClass62_1189 = Static45.method753("Could not complete login)3");

	@OriginalMember(owner = "client!ua", name = "Z", descriptor = "Lclient!v;")
	public static Class62 aClass62_1190 = Static45.method753(":0");

	@OriginalMember(owner = "client!ua", name = "bb", descriptor = "Lclient!fc;")
	public static Class24 aClass24_77 = new Class24();

	@OriginalMember(owner = "client!ua", name = "eb", descriptor = "Lclient!v;")
	public static Class62 aClass62_1191 = aClass62_1187;

	@OriginalMember(owner = "client!ua", name = "fb", descriptor = "I")
	public static int anInt2588 = 2;

	@OriginalMember(owner = "client!ua", name = "hb", descriptor = "Lclient!v;")
	public static Class62 aClass62_1192 = aClass62_1189;

	@OriginalMember(owner = "client!ua", name = "nb", descriptor = "Lclient!v;")
	private static Class62 aClass62_1194 = Static45.method753("Error loading your profile)3");

	@OriginalMember(owner = "client!ua", name = "lb", descriptor = "Lclient!v;")
	public static Class62 aClass62_1193 = aClass62_1194;

	@OriginalMember(owner = "client!ua", name = "mb", descriptor = "[I")
	public static int[] anIntArray283 = new int[2048];

	@OriginalMember(owner = "client!ua", name = "c", descriptor = "(B)V")
	public static void method1651() {
		aClass62_1191 = null;
		aClass24_77 = null;
		anIntArray280 = null;
		aClass62_1189 = null;
		aClass62_1192 = null;
		anIntArray281 = null;
		aClass62_1190 = null;
		anIntArray282 = null;
		aByteArrayArray9 = null;
		anIntArray283 = null;
		aClass62_1194 = null;
		aClass62_1187 = null;
		aClass62_1193 = null;
		aClass62_1188 = null;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lclient!v;Lclient!mb;Lclient!v;B)Lclient!ab;")
	public static Class3_Sub1_Sub1_Sub1 method1652(@OriginalArg(0) Class62 arg0, @OriginalArg(1) Class42 arg1, @OriginalArg(2) Class62 arg2) {
		@Pc(8) int local8 = arg1.method1521(arg0);
		@Pc(23) int local23 = arg1.method1498(arg2, local8);
		return Static5.method166(local23, arg1, local8);
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(ZLclient!mb;ILclient!mb;)V")
	public static void method1653(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class42 arg1, @OriginalArg(3) Class42 arg2) {
		Static64.aClass42_47 = arg2;
		Static46.aClass42_34 = arg1;
		Static69.aBoolean111 = arg0;
		Static62.anInt1720 = Static46.aClass42_34.method1494(10);
	}
}
