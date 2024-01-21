import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static98 {

	@OriginalMember(owner = "client!mb", name = "U", descriptor = "[I")
	public static int[] anIntArray224;

	@OriginalMember(owner = "client!mb", name = "Z", descriptor = "I")
	public static int anInt2187;

	@OriginalMember(owner = "client!mb", name = "ib", descriptor = "Lclient!v;")
	public static Class80 aClass80_3;

	@OriginalMember(owner = "client!mb", name = "X", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1255 = Static122.method531("Ung-Ultige Verbindung mit einem Anmelde)2Server)3");

	@OriginalMember(owner = "client!mb", name = "ab", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1256 = Static122.method531("Wordpack geladen)3");

	@OriginalMember(owner = "client!mb", name = "bb", descriptor = "J")
	public static volatile long aLong102 = 0L;

	@OriginalMember(owner = "client!mb", name = "gb", descriptor = "Lclient!b;")
	public static Class7 aClass7_14 = new Class7(64);

	@OriginalMember(owner = "client!mb", name = "jb", descriptor = "I")
	public static final int anInt2193 = 0;

	@OriginalMember(owner = "client!mb", name = "f", descriptor = "(I)V")
	public static void method1696() {
		anIntArray224 = null;
		aClass73_1256 = null;
		aClass73_1255 = null;
		aClass7_14 = null;
		aClass80_3 = null;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(II)Lclient!gg;")
	public static Class3_Sub1_Sub8 method1697(@OriginalArg(0) int arg0) {
		@Pc(6) Class3_Sub1_Sub8 local6 = (Class3_Sub1_Sub8) Static104.aClass7_17.method183((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(20) byte[] local20 = Static158.aClass13_29.method348(12, arg0);
		local6 = new Class3_Sub1_Sub8();
		if (local20 != null) {
			local6.method990(new Class3_Sub12(local20));
		}
		local6.method991();
		Static104.aClass7_17.method186(local6, (long) arg0);
		return local6;
	}
}
