import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static96 {

	@OriginalMember(owner = "client!kh", name = "lb", descriptor = "[I")
	public static int[] anIntArray259;

	@OriginalMember(owner = "client!kh", name = "T", descriptor = "Lclient!rf;")
	public static Class70 aClass70_910 = Static49.method1293("Versteckt");

	@OriginalMember(owner = "client!kh", name = "W", descriptor = "I")
	public static int anInt2795 = 0;

	@OriginalMember(owner = "client!kh", name = "ab", descriptor = "Lclient!rf;")
	private static Class70 aClass70_912 = Static49.method1293("glow1:");

	@OriginalMember(owner = "client!kh", name = "Y", descriptor = "Lclient!rf;")
	public static Class70 aClass70_911 = aClass70_912;

	@OriginalMember(owner = "client!kh", name = "bb", descriptor = "I")
	public static int anInt2798 = -1;

	@OriginalMember(owner = "client!kh", name = "eb", descriptor = "[Lclient!rf;")
	public static Class70[] aClass70Array14 = new Class70[1000];

	@OriginalMember(owner = "client!kh", name = "fb", descriptor = "Lclient!rf;")
	public static Class70 aClass70_913 = Static49.method1293(":clanreq:");

	@OriginalMember(owner = "client!kh", name = "gb", descriptor = "[Lclient!oa;")
	public static Class59[] aClass59Array1 = new Class59[4];

	@OriginalMember(owner = "client!kh", name = "hb", descriptor = "Lclient!rf;")
	public static Class70 aClass70_914 = Static49.method1293(": ");

	@OriginalMember(owner = "client!kh", name = "ib", descriptor = "I")
	public static int anInt2801 = -1;

	@OriginalMember(owner = "client!kh", name = "kb", descriptor = "Lclient!rf;")
	public static Class70 aClass70_915 = aClass70_912;

	@OriginalMember(owner = "client!kh", name = "mb", descriptor = "[J")
	public static long[] aLongArray6 = new long[32];

	@OriginalMember(owner = "client!kh", name = "f", descriptor = "(I)V")
	public static void method2074() {
		aClass70_910 = null;
		aClass70_911 = null;
		aClass70_915 = null;
		aClass70_914 = null;
		aClass59Array1 = null;
		aClass70_913 = null;
		aClass70Array14 = null;
		aClass70_912 = null;
		aLongArray6 = null;
		anIntArray259 = null;
	}

	@OriginalMember(owner = "client!kh", name = "g", descriptor = "(I)V")
	public static void method2075() {
		if (Static62.aString2.toLowerCase().indexOf("microsoft") != -1) {
			Static148.anIntArray371[189] = 26;
			Static148.anIntArray371[192] = 58;
			Static148.anIntArray371[220] = 74;
			Static148.anIntArray371[188] = 71;
			Static148.anIntArray371[221] = 43;
			Static148.anIntArray371[219] = 42;
			Static148.anIntArray371[222] = 59;
			Static148.anIntArray371[191] = 73;
			Static148.anIntArray371[187] = 27;
			Static148.anIntArray371[190] = 72;
			Static148.anIntArray371[223] = 28;
			Static148.anIntArray371[186] = 57;
			return;
		}
		if (Static62.aMethod1 == null) {
			Static148.anIntArray371[192] = 58;
			Static148.anIntArray371[222] = 59;
		} else {
			Static148.anIntArray371[222] = 58;
			Static148.anIntArray371[192] = 28;
			Static148.anIntArray371[520] = 59;
		}
		Static148.anIntArray371[47] = 73;
		Static148.anIntArray371[61] = 27;
		Static148.anIntArray371[93] = 43;
		Static148.anIntArray371[46] = 72;
		Static148.anIntArray371[45] = 26;
		Static148.anIntArray371[59] = 57;
		Static148.anIntArray371[92] = 74;
		Static148.anIntArray371[44] = 71;
		Static148.anIntArray371[91] = 42;
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(BI)Z")
	public static boolean method2076(@OriginalArg(1) int arg0) {
		return (arg0 >> 21 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(BZII)Lclient!rf;")
	public static Class70 method2077(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1) {
		@Pc(29) int local29 = 1;
		@Pc(33) int local33 = arg1 / 10;
		while (local33 != 0) {
			local33 /= 10;
			local29++;
		}
		@Pc(44) int local44 = local29;
		if (arg1 < 0 || arg0) {
			local44 = local29 + 1;
		}
		@Pc(55) byte[] local55 = new byte[local44];
		if (arg1 < 0) {
			local55[0] = 45;
		} else if (arg0) {
			local55[0] = 43;
		}
		for (@Pc(74) int local74 = 0; local74 < local29; local74++) {
			@Pc(80) int local80 = arg1 % 10;
			if (local80 < 0) {
				local80 = -local80;
			}
			if (local80 > 9) {
				local80 += 39;
			}
			local55[local44 - local74 - 1] = (byte) (local80 + 48);
			arg1 /= 10;
		}
		@Pc(119) Class70 local119 = new Class70();
		local119.anInt3915 = local44;
		local119.aByteArray46 = local55;
		return local119;
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(IIIII)V")
	public static void method2078(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(17) Class1_Sub16 local17 = (Class1_Sub16) Static61.aClass30_8.method1467((long) arg0);
		if (local17 == null) {
			local17 = new Class1_Sub16();
			Static61.aClass30_8.method1464(local17, (long) arg0);
		}
		if (local17.anIntArray250.length <= arg1) {
			@Pc(39) int[] local39 = new int[arg1 + 1];
			@Pc(44) int[] local44 = new int[arg1 + 1];
			for (@Pc(46) int local46 = 0; local46 < local17.anIntArray250.length; local46++) {
				local39[local46] = local17.anIntArray250[local46];
				local44[local46] = local17.anIntArray251[local46];
			}
			for (@Pc(72) int local72 = local17.anIntArray250.length; local72 < arg1; local72++) {
				local39[local72] = -1;
				local44[local72] = 0;
			}
			local17.anIntArray251 = local44;
			local17.anIntArray250 = local39;
		}
		local17.anIntArray250[arg1] = arg2;
		local17.anIntArray251[arg1] = arg3;
	}

	@OriginalMember(owner = "client!kh", name = "h", descriptor = "(I)Lclient!sd;")
	public static Class36 method2079() {
		try {
			return (Class36) Class.forName("Class36_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}
}
