import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static98 {

	@OriginalMember(owner = "client!mb", name = "Q", descriptor = "Lclient!he;")
	public static Class34 aClass34_5;

	@OriginalMember(owner = "client!mb", name = "R", descriptor = "[I")
	public static int[] anIntArray240;

	@OriginalMember(owner = "client!mb", name = "U", descriptor = "Lclient!cd;")
	private static Class10 aClass10_982 = Static51.method932(" more options");

	@OriginalMember(owner = "client!mb", name = "W", descriptor = "Lclient!cd;")
	public static Class10 aClass10_983 = Static51.method932("Sie k-Onnen sich selbst nicht auf Ihre Freunde)2Liste setzen(Q");

	@OriginalMember(owner = "client!mb", name = "Y", descriptor = "Lclient!cd;")
	public static Class10 aClass10_984 = Static51.method932(" )2>");

	@OriginalMember(owner = "client!mb", name = "ab", descriptor = "[Lclient!cd;")
	public static Class10[] aClass10Array17 = new Class10[8];

	@OriginalMember(owner = "client!mb", name = "cb", descriptor = "Lclient!cd;")
	public static Class10 aClass10_985 = Static51.method932("huffman");

	@OriginalMember(owner = "client!mb", name = "db", descriptor = "Lclient!cd;")
	public static Class10 aClass10_986 = aClass10_982;

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lclient!kh;BIILclient!kh;)Lclient!cg;")
	public static Class2_Sub1_Sub4_Sub1_Sub1 method1625(@OriginalArg(0) Class29 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class29 arg3) {
		return Static111.method1762(arg2, arg1, arg0) ? Static73.method1240(arg3.method1030(arg1, arg2)) : null;
	}

	@OriginalMember(owner = "client!mb", name = "f", descriptor = "(I)V")
	public static void method1626() {
		anIntArray240 = null;
		aClass10_983 = null;
		aClass10_985 = null;
		aClass10Array17 = null;
		aClass34_5 = null;
		aClass10_982 = null;
		aClass10_986 = null;
		aClass10_984 = null;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(BIIII)V")
	public static void method1627(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(7) int local7 = 0; local7 < Static5.anInt119; local7++) {
			if (Static101.anIntArray244[local7] + Static72.anIntArray187[local7] > arg0 && Static72.anIntArray187[local7] < arg0 + arg2 && Static159.anIntArray360[local7] + Static109.anIntArray255[local7] > arg1 && arg3 + arg1 > Static109.anIntArray255[local7]) {
				Static152.aBooleanArray14[local7] = true;
			}
		}
	}
}
