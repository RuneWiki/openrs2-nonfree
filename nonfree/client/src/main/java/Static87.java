import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static87 {

	@OriginalMember(owner = "client!ne", name = "c", descriptor = "I")
	public static int anInt2184 = 0;

	@OriginalMember(owner = "client!ne", name = "f", descriptor = "I")
	public static int anInt2186 = -1;

	@OriginalMember(owner = "client!ne", name = "o", descriptor = "Lclient!ic;")
	private static Class34 aClass34_1006 = Static56.method816("Checking for updates )2 ");

	@OriginalMember(owner = "client!ne", name = "g", descriptor = "Lclient!ic;")
	public static Class34 aClass34_1004 = aClass34_1006;

	@OriginalMember(owner = "client!ne", name = "h", descriptor = "Lclient!ic;")
	public static Class34 aClass34_1005 = Static56.method816(" )2> <col=00ffff>");

	@OriginalMember(owner = "client!ne", name = "m", descriptor = "[Z")
	public static boolean[] aBooleanArray17 = new boolean[112];

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(III[B)Lclient!ic;")
	public static Class34 method1304(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(14) Class34 local14 = new Class34();
		local14.anInt1418 = 0;
		local14.aByteArray20 = new byte[arg0];
		for (@Pc(23) int local23 = arg1; local23 < arg1 + arg0; local23++) {
			if (arg2[local23] != 0) {
				local14.aByteArray20[local14.anInt1418++] = arg2[local23];
			}
		}
		return local14;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(BI)Lclient!ic;")
	public static Class34 method1305(@OriginalArg(1) int arg0) {
		return Static44.method669(new Class34[] { Static44.method672(arg0 >> 24 & 0xFF), Static112.aClass34_1180, Static44.method672(arg0 >> 16 & 0xFF), Static112.aClass34_1180, Static44.method672(arg0 >> 8 & 0xFF), Static112.aClass34_1180, Static44.method672(arg0 & 0xFF) });
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(ILclient!ic;Lclient!dd;Lclient!ic;)Lclient!ce;")
	public static Class8_Sub1_Sub3_Sub2 method1306(@OriginalArg(1) Class34 arg0, @OriginalArg(2) Class14 arg1, @OriginalArg(3) Class34 arg2) {
		@Pc(15) int local15 = arg1.method1164(arg0);
		@Pc(23) int local23 = arg1.method1159(local15, arg2);
		return Static113.method1619(local15, arg1, local23);
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(ILclient!jf;I)V")
	public static void method1307(@OriginalArg(0) int arg0, @OriginalArg(1) Class8_Sub1_Sub1_Sub4 arg1) {
		Static74.method1092(arg1.anInt2059, arg1.anInt2043, arg0);
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(I)V")
	public static void method1308() {
		aBooleanArray17 = null;
		aClass34_1006 = null;
		aClass34_1005 = null;
		aClass34_1004 = null;
	}
}
