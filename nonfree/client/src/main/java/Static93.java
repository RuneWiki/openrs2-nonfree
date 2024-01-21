import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static93 {

	@OriginalMember(owner = "client!qa", name = "gb", descriptor = "[I")
	public static int[] anIntArray277;

	@OriginalMember(owner = "client!qa", name = "M", descriptor = "Lclient!pe;")
	private static Class65 aClass65_869 = Static119.method1462("Take");

	@OriginalMember(owner = "client!qa", name = "P", descriptor = "Lclient!pe;")
	private static Class65 aClass65_871 = Static119.method1462("Loading title screen )2 ");

	@OriginalMember(owner = "client!qa", name = "S", descriptor = "Lclient!pe;")
	public static Class65 aClass65_872 = Static119.method1462("(U");

	@OriginalMember(owner = "client!qa", name = "V", descriptor = "Lclient!pe;")
	public static Class65 aClass65_873 = Static119.method1462("Ung-Ultiger Benutzername");

	@OriginalMember(owner = "client!qa", name = "W", descriptor = "Lclient!pe;")
	public static Class65 aClass65_874 = Static119.method1462("(U1");

	@OriginalMember(owner = "client!qa", name = "X", descriptor = "Lclient!pe;")
	public static Class65 aClass65_875 = aClass65_869;

	@OriginalMember(owner = "client!qa", name = "db", descriptor = "Lclient!pe;")
	public static Class65 aClass65_876 = Static119.method1462("Clientscript error )2 check log for details");

	@OriginalMember(owner = "client!qa", name = "nb", descriptor = "I")
	public static int anInt2077 = 0;

	@OriginalMember(owner = "client!qa", name = "vb", descriptor = "[J")
	public static long[] aLongArray5 = new long[200];

	@OriginalMember(owner = "client!qa", name = "xb", descriptor = "Lclient!bc;")
	public static Class8 aClass8_44 = new Class8(500);

	@OriginalMember(owner = "client!qa", name = "Kb", descriptor = "Lclient!pe;")
	public static Class65 aClass65_877 = Static119.method1462("runes");

	@OriginalMember(owner = "client!qa", name = "Qb", descriptor = "I")
	public static int anInt2098 = -1;

	@OriginalMember(owner = "client!qa", name = "Ub", descriptor = "Lclient!pe;")
	public static Class65 aClass65_878 = aClass65_871;

	@OriginalMember(owner = "client!qa", name = "Xb", descriptor = "Lclient!pe;")
	public static Class65 aClass65_879 = Static119.method1462(":clan:");

	@OriginalMember(owner = "client!qa", name = "ac", descriptor = "Lclient!pe;")
	public static Class65 aClass65_880 = Static119.method1462("<col=ffff00>");

	@OriginalMember(owner = "client!qa", name = "bc", descriptor = "Lclient!pe;")
	public static Class65 aClass65_881 = Static119.method1462("<col=80ff00>");

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Ljava/lang/String;ZLjava/lang/Throwable;)V")
	public static void method1535(@OriginalArg(0) String arg0, @OriginalArg(2) Throwable arg1) {
		try {
			@Pc(7) String local7 = "";
			if (arg1 != null) {
				local7 = Static35.method641(arg1);
			}
			if (arg0 != null) {
				if (arg1 != null) {
					local7 = local7 + " | ";
				}
				local7 = local7 + arg0;
			}
			System.out.println("Error: " + local7);
			local7 = local7.replace(':', '.');
			local7 = local7.replace('@', '_');
			local7 = local7.replace('&', '_');
			local7 = local7.replace('#', '_');
			if (Static46.aClass20_4.anApplet1 != null) {
				@Pc(105) Class15 local105 = Static46.aClass20_4.method370(new URL(Static46.aClass20_4.anApplet1.getCodeBase(), "clienterror.ws?c=" + Static95.anInt2161 + "&u=" + Static110.aLong82 + "&v1=" + Static24.aString1 + "&v2=" + Static24.aString2 + "&e=" + local7));
				while (local105.anInt404 == 0) {
					Static81.method1325(1L);
				}
				if (local105.anInt404 == 1) {
					@Pc(123) DataInputStream local123 = (DataInputStream) local105.anObject9;
					local123.read();
					local123.close();
				}
			}
		} catch (@Pc(130) Exception local130) {
		}
	}

	@OriginalMember(owner = "client!qa", name = "d", descriptor = "(B)V")
	public static void method1539() {
		Static19.anIntArray40 = new int[151];
		Static44.anIntArray123 = new int[33];
		Static69.anIntArray195 = new int[151];
		Static2.anIntArray8 = new int[33];
		@Pc(27) int local27;
		@Pc(29) int local29;
		@Pc(31) int local31;
		for (@Pc(23) int local23 = 0; local23 < 33; local23++) {
			local27 = 999;
			local29 = 0;
			for (local31 = 0; local31 < 34; local31++) {
				if (Static68.aClass2_Sub1_Sub4_Sub2_43.aByteArray21[Static68.aClass2_Sub1_Sub4_Sub2_43.anInt1370 * local23 + local31] == 0) {
					if (local27 == 999) {
						local27 = local31;
					}
				} else if (local27 != 999) {
					local29 = local31;
					break;
				}
			}
			Static44.anIntArray123[local23] = local27;
			Static2.anIntArray8[local23] = local29 - local27;
		}
		for (local27 = 5; local27 < 156; local27++) {
			local31 = 0;
			local29 = 999;
			for (@Pc(92) int local92 = 25; local92 < 172; local92++) {
				if (Static68.aClass2_Sub1_Sub4_Sub2_43.aByteArray21[local92 + local27 * Static68.aClass2_Sub1_Sub4_Sub2_43.anInt1370] == 0 && (local92 > 34 || local27 > 34)) {
					if (local29 == 999) {
						local29 = local92;
					}
				} else if (local29 != 999) {
					local31 = local92;
					break;
				}
			}
			Static19.anIntArray40[local27 - 5] = local29 - 25;
			Static69.anIntArray195[local27 - 5] = local31 - local29;
		}
	}

	@OriginalMember(owner = "client!qa", name = "c", descriptor = "(I)V")
	public static void method1542() {
		aClass8_44 = null;
		aClass65_873 = null;
		aClass65_869 = null;
		aClass65_871 = null;
		aClass65_872 = null;
		aClass65_881 = null;
		aClass65_878 = null;
		aClass65_880 = null;
		aClass65_877 = null;
		aLongArray5 = null;
		aClass65_874 = null;
		anIntArray277 = null;
		aClass65_879 = null;
		aClass65_875 = null;
		aClass65_876 = null;
	}
}
