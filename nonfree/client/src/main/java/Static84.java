import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static84 {

	@OriginalMember(owner = "client!nf", name = "N", descriptor = "J")
	public static long aLong65;

	@OriginalMember(owner = "client!nf", name = "U", descriptor = "J")
	public static long aLong66;

	@OriginalMember(owner = "client!nf", name = "V", descriptor = "I")
	public static int anInt2143;

	@OriginalMember(owner = "client!nf", name = "B", descriptor = "Z")
	public static boolean aBoolean75 = false;

	@OriginalMember(owner = "client!nf", name = "G", descriptor = "Lclient!af;")
	public static Class5 aClass5_1044 = Static45.method1937("logo");

	@OriginalMember(owner = "client!nf", name = "L", descriptor = "Lclient!af;")
	public static Class5 aClass5_1045 = Static45.method1937(":duelreq:");

	@OriginalMember(owner = "client!nf", name = "M", descriptor = "I")
	public static int anInt2138 = 0;

	@OriginalMember(owner = "client!nf", name = "P", descriptor = "Lclient!af;")
	public static Class5 aClass5_1046 = Static45.method1937("Abbrechen");

	@OriginalMember(owner = "client!nf", name = "R", descriptor = "[J")
	public static long[] aLongArray2 = new long[32];

	@OriginalMember(owner = "client!nf", name = "Z", descriptor = "Lclient!af;")
	public static Class5 aClass5_1047 = Static45.method1937("au");

	@OriginalMember(owner = "client!nf", name = "ab", descriptor = "[I")
	public static int[] anIntArray330 = new int[100];

	@OriginalMember(owner = "client!nf", name = "db", descriptor = "I")
	public static int anInt2148 = 0;

	@OriginalMember(owner = "client!nf", name = "eb", descriptor = "I")
	public static int anInt2149 = -1;

	@OriginalMember(owner = "client!nf", name = "fb", descriptor = "Lclient!af;")
	public static Class5 aClass5_1048 = Static45.method1937("Sie k-Onnen sich selbst nicht auf Ihre Freunde)2Liste setzen(Q");

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(ILclient!of;)Z")
	public static boolean method1490(@OriginalArg(1) Class1_Sub17 arg0) {
		if (arg0.anIntArray342 == null) {
			return false;
		}
		for (@Pc(12) int local12 = 0; local12 < arg0.anIntArray342.length; local12++) {
			@Pc(19) int local19 = Static96.method1622(arg0, local12);
			@Pc(24) int local24 = arg0.anIntArray344[local12];
			if (arg0.anIntArray342[local12] == 2) {
				if (local24 <= local19) {
					return false;
				}
			} else if (arg0.anIntArray342[local12] == 3) {
				if (local24 >= local19) {
					return false;
				}
			} else if (arg0.anIntArray342[local12] == 4) {
				if (local24 == local19) {
					return false;
				}
			} else if (local19 != local24) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(Z[BZ)Ljava/lang/Object;")
	public static Object method1493(@OriginalArg(1) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		if (arg0.length > 136 && !Static6.aBoolean4) {
			try {
				@Pc(18) Class30 local18 = (Class30) Class.forName("Class30_Sub1").getDeclaredConstructor().newInstance();
				local18.method1935(arg0);
				return local18;
			} catch (@Pc(25) Throwable local25) {
				Static6.aBoolean4 = true;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!nf", name = "c", descriptor = "(I)V")
	public static void method1494() {
		aClass5_1047 = null;
		aClass5_1045 = null;
		aClass5_1046 = null;
		aLongArray2 = null;
		aClass5_1048 = null;
		anIntArray330 = null;
		aClass5_1044 = null;
	}
}
