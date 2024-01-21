import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static94 {

	@OriginalMember(owner = "client!qb", name = "M", descriptor = "I")
	public static int anInt2121;

	@OriginalMember(owner = "client!qb", name = "db", descriptor = "I")
	public static int anInt2129;

	@OriginalMember(owner = "client!qb", name = "ub", descriptor = "I")
	public static int anInt2138;

	@OriginalMember(owner = "client!qb", name = "O", descriptor = "Lclient!pe;")
	private static Class65 aClass65_891 = Static119.method1462(" from your ignore list first");

	@OriginalMember(owner = "client!qb", name = "P", descriptor = "Lclient!pe;")
	public static Class65 aClass65_892 = Static119.method1462("Verbindung abgebrochen)3");

	@OriginalMember(owner = "client!qb", name = "T", descriptor = "I")
	public static int anInt2124 = 0;

	@OriginalMember(owner = "client!qb", name = "U", descriptor = "Lclient!pe;")
	public static Class65 aClass65_893 = Static119.method1462("und Ihr Passwort ein)3");

	@OriginalMember(owner = "client!qb", name = "ab", descriptor = "Lclient!pe;")
	private static Class65 aClass65_895 = Static119.method1462("cyan:");

	@OriginalMember(owner = "client!qb", name = "eb", descriptor = "Lclient!pe;")
	public static Class65 aClass65_896 = aClass65_891;

	@OriginalMember(owner = "client!qb", name = "jb", descriptor = "Lclient!pe;")
	public static Class65 aClass65_897 = aClass65_895;

	@OriginalMember(owner = "client!qb", name = "nb", descriptor = "Lclient!pe;")
	public static Class65 aClass65_898 = aClass65_895;

	@OriginalMember(owner = "client!qb", name = "sb", descriptor = "Z")
	public static boolean aBoolean85 = false;

	@OriginalMember(owner = "client!qb", name = "zb", descriptor = "Lclient!pe;")
	public static Class65 aClass65_899 = Static119.method1462("::clientdrop");

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(BII)V")
	public static void method1559(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static39.anInt840 != 0 && arg0 != -1) {
			Static107.method1736(0, arg0, Static83.aClass56_Sub1_17, Static39.anInt840);
			Static100.aBoolean92 = true;
		}
	}

	@OriginalMember(owner = "client!qb", name = "e", descriptor = "(B)V")
	public static void method1565() {
		aClass65_891 = null;
		aClass65_895 = null;
		aClass65_899 = null;
		aClass65_893 = null;
		aClass65_892 = null;
		aClass65_896 = null;
		aClass65_898 = null;
		aClass65_897 = null;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(IB)Z")
	public static boolean method1566(@OriginalArg(0) int arg0) {
		if (Static38.aBooleanArray7[arg0]) {
			return true;
		} else if (Static89.aClass56_29.method1665(arg0)) {
			@Pc(30) int local30 = Static89.aClass56_29.method1678(arg0);
			if (local30 == 0) {
				Static38.aBooleanArray7[arg0] = true;
				return true;
			}
			if (Static95.aClass2_Sub22ArrayArray1[arg0] == null) {
				Static95.aClass2_Sub22ArrayArray1[arg0] = new Class2_Sub22[local30];
			}
			for (@Pc(52) int local52 = 0; local52 < local30; local52++) {
				if (Static95.aClass2_Sub22ArrayArray1[arg0][local52] == null) {
					@Pc(66) byte[] local66 = Static89.aClass56_29.method1666(local52, arg0);
					if (local66 != null) {
						Static95.aClass2_Sub22ArrayArray1[arg0][local52] = new Class2_Sub22();
						Static95.aClass2_Sub22ArrayArray1[arg0][local52].anInt2835 = (arg0 << 16) + local52;
						if (local66[0] == -1) {
							Static95.aClass2_Sub22ArrayArray1[arg0][local52].method1980(new Class2_Sub4(local66));
						} else {
							Static95.aClass2_Sub22ArrayArray1[arg0][local52].method1974(new Class2_Sub4(local66));
						}
					}
				}
			}
			Static38.aBooleanArray7[arg0] = true;
			return true;
		} else {
			return false;
		}
	}
}
