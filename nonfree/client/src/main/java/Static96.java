import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static96 {

	@OriginalMember(owner = "client!qe", name = "L", descriptor = "Lclient!je;")
	public static Class4_Sub4_Sub3_Sub1_Sub2 aClass4_Sub4_Sub3_Sub1_Sub2_1;

	@OriginalMember(owner = "client!qe", name = "N", descriptor = "I")
	public static int anInt2222;

	@OriginalMember(owner = "client!qe", name = "fb", descriptor = "[I")
	public static int[] anIntArray314;

	@OriginalMember(owner = "client!qe", name = "B", descriptor = "Lclient!v;")
	public static Class76 aClass76_1007 = Static134.method2017("huffman");

	@OriginalMember(owner = "client!qe", name = "H", descriptor = "Lclient!v;")
	public static Class76 aClass76_1008 = Static134.method2017("Hier wechseln");

	@OriginalMember(owner = "client!qe", name = "J", descriptor = "Lclient!v;")
	private static Class76 aClass76_1009 = Static134.method2017("Members object");

	@OriginalMember(owner = "client!qe", name = "S", descriptor = "Lclient!v;")
	public static Class76 aClass76_1010 = Static134.method2017("mapmarker");

	@OriginalMember(owner = "client!qe", name = "Y", descriptor = "Lclient!v;")
	public static Class76 aClass76_1011 = Static134.method2017("Benutzen Sie die (WPasswort -=ndern(W Option");

	@OriginalMember(owner = "client!qe", name = "ab", descriptor = "Lclient!v;")
	public static Class76 aClass76_1012 = Static134.method2017("Ein kostenloses Spielkonto erstellen)3");

	@OriginalMember(owner = "client!qe", name = "jb", descriptor = "Lclient!v;")
	private static Class76 aClass76_1016 = Static134.method2017("The server is being updated)3");

	@OriginalMember(owner = "client!qe", name = "bb", descriptor = "Lclient!v;")
	public static Class76 aClass76_1013 = aClass76_1016;

	@OriginalMember(owner = "client!qe", name = "eb", descriptor = "Lclient!v;")
	public static Class76 aClass76_1014 = aClass76_1009;

	@OriginalMember(owner = "client!qe", name = "hb", descriptor = "Lclient!v;")
	public static Class76 aClass76_1015 = Static134.method2017("(Y");

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(BI)V")
	public static void method1543(@OriginalArg(1) int arg0) {
		if (arg0 == -1 || !Static45.method816(arg0)) {
			return;
		}
		@Pc(24) Class4_Sub8[] local24 = Static29.aClass4_Sub8ArrayArray1[arg0];
		for (@Pc(26) int local26 = 0; local26 < local24.length; local26++) {
			@Pc(32) Class4_Sub8 local32 = local24[local26];
			if (local32.anObjectArray11 != null) {
				@Pc(39) Class4_Sub20 local39 = new Class4_Sub20();
				local39.aClass4_Sub8_14 = local32;
				local39.anObjectArray28 = local32.anObjectArray11;
				Static20.method307(local39);
			}
		}
	}

	@OriginalMember(owner = "client!qe", name = "e", descriptor = "(I)V")
	public static void method1546() {
		aClass76_1008 = null;
		aClass76_1014 = null;
		aClass76_1011 = null;
		aClass4_Sub4_Sub3_Sub1_Sub2_1 = null;
		aClass76_1016 = null;
		aClass76_1009 = null;
		aClass76_1007 = null;
		anIntArray314 = null;
		aClass76_1012 = null;
		aClass76_1010 = null;
		aClass76_1013 = null;
		aClass76_1015 = null;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(BII)I")
	public static int method1547(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == -2) {
			return 12345678;
		} else if (arg0 == -1) {
			if (arg1 < 2) {
				arg1 = 2;
			} else if (arg1 > 126) {
				arg1 = 126;
			}
			return arg1;
		} else {
			arg1 = arg1 * (arg0 & 0x7F) / 128;
			if (arg1 < 2) {
				arg1 = 2;
			} else if (arg1 > 126) {
				arg1 = 126;
			}
			return (arg0 & 0xFF80) + arg1;
		}
	}
}
