import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static83 {

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "[B")
	public static byte[] aByteArray21;

	@OriginalMember(owner = "client!qc", name = "o", descriptor = "Lclient!oa;")
	public static Class9 aClass9_24;

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "Lclient!lc;")
	public static Class31 aClass31_803 = Static56.method1206("Connection timed out");

	@OriginalMember(owner = "client!qc", name = "f", descriptor = "Lclient!lc;")
	public static Class31 aClass31_804 = Static56.method1206("Please contact customer support)3");

	@OriginalMember(owner = "client!qc", name = "g", descriptor = "Lclient!lc;")
	public static Class31 aClass31_805 = Static56.method1206(":0");

	@OriginalMember(owner = "client!qc", name = "j", descriptor = "Lclient!lc;")
	public static Class31 aClass31_806 = Static56.method1206(")3");

	@OriginalMember(owner = "client!qc", name = "n", descriptor = "Lclient!lc;")
	public static Class31 aClass31_807 = Static56.method1206("runes");

	@OriginalMember(owner = "client!qc", name = "q", descriptor = "Lclient!lc;")
	public static Class31 aClass31_808 = Static56.method1206("@gre@");

	@OriginalMember(owner = "client!qc", name = "r", descriptor = "I")
	public static int anInt2318 = -1;

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(I)V")
	public static void method1456() {
		aClass31_804 = null;
		aClass31_806 = null;
		aByteArray21 = null;
		aClass31_807 = null;
		aClass31_805 = null;
		aClass9_24 = null;
		aClass31_803 = null;
		aClass31_808 = null;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(BLclient!kc;Lclient!lc;Lclient!lc;)Lclient!hc;")
	public static Class2_Sub1_Sub3_Sub3 method1459(@OriginalArg(1) Class11 arg0, @OriginalArg(2) Class31 arg1, @OriginalArg(3) Class31 arg2) {
		@Pc(13) int local13 = arg0.method345(arg2);
		@Pc(19) int local19 = arg0.method334(local13, arg1);
		return Static64.method412(local13, arg0, local19);
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(IILclient!kc;I)[Lclient!da;")
	public static Class2_Sub1_Sub3_Sub2[] method1462(@OriginalArg(1) int arg0, @OriginalArg(2) Class11 arg1, @OriginalArg(3) int arg2) {
		return Static85.method1563(arg0, arg1, arg2) ? Static62.method1318() : null;
	}
}
