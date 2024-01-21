import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static96 {

	@OriginalMember(owner = "client!me", name = "bb", descriptor = "Lclient!rc;")
	public static Class66 aClass66_10 = new Class66(64);

	@OriginalMember(owner = "client!me", name = "cb", descriptor = "Lclient!ea;")
	public static Class18 aClass18_755 = Static8.method128("Cabbage");

	@OriginalMember(owner = "client!me", name = "eb", descriptor = "Lclient!ea;")
	public static Class18 aClass18_756 = Static8.method128("null");

	@OriginalMember(owner = "client!me", name = "gb", descriptor = "Lclient!ea;")
	public static Class18 aClass18_757 = Static8.method128("b12_full");

	@OriginalMember(owner = "client!me", name = "jb", descriptor = "Lclient!ea;")
	public static Class18 aClass18_758 = Static8.method128("Die Verbindung konnte");

	@OriginalMember(owner = "client!me", name = "kb", descriptor = "Lclient!ea;")
	private static Class18 aClass18_759 = Static8.method128("Loaded update list");

	@OriginalMember(owner = "client!me", name = "rb", descriptor = "Lclient!ea;")
	public static Class18 aClass18_760 = aClass18_759;

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(ZZIBZ)Lclient!ob;")
	public static Class16_Sub1 method2113(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3) {
		@Pc(5) Class69 local5 = null;
		if (Static123.aClass44_1 != null) {
			local5 = new Class69(arg2, Static123.aClass44_1, Static17.aClass44Array3[arg2], 1000000);
		}
		return new Class16_Sub1(local5, Static22.aClass69_1, arg2, arg3, arg0, arg1);
	}

	@OriginalMember(owner = "client!me", name = "i", descriptor = "(I)V")
	public static void method2114() {
		aClass18_760 = null;
		aClass18_758 = null;
		aClass18_759 = null;
		aClass18_756 = null;
		aClass66_10 = null;
		aClass18_755 = null;
		aClass18_757 = null;
	}
}
