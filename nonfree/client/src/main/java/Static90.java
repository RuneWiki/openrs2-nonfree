import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static90 {

	@OriginalMember(owner = "client!fc", name = "H", descriptor = "I")
	public static int anInt1756;

	@OriginalMember(owner = "client!fc", name = "U", descriptor = "Ljava/lang/String;")
	public static String aString19;

	@OriginalMember(owner = "client!fc", name = "V", descriptor = "I")
	public static int anInt1766;

	@OriginalMember(owner = "client!fc", name = "s", descriptor = "Lclient!wl;")
	public static final Class221 aClass221_72 = new Class221(41, 8);

	@OriginalMember(owner = "client!fc", name = "C", descriptor = "F")
	public static float aFloat32 = 0.0F;

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(II)V")
	public static void method1804(@OriginalArg(1) int arg0) {
		@Pc(16) Class2_Sub9_Sub4 local16 = Static98.method1971(11, arg0);
		local16.method1799();
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IB)Lclient!nk;")
	public static Class139 method1809(@OriginalArg(0) int arg0) {
		@Pc(5) Class107 local5 = Static197.aClass107_22;
		@Pc(14) Class139 local14;
		synchronized (Static197.aClass107_22) {
			local14 = (Class139) Static197.aClass107_22.method3021((long) arg0);
		}
		if (local14 != null) {
			return local14;
		}
		@Pc(34) byte[] local34 = Static244.aClass104_134.method2756(Static156.method3221(arg0), Static65.method2533(arg0));
		local14 = new Class139();
		local14.anInt4787 = arg0;
		if (local34 != null) {
			local14.method4114(new Class2_Sub12(local34));
		}
		local14.method4125();
		@Pc(60) Class107 local60 = Static197.aClass107_22;
		synchronized (Static197.aClass107_22) {
			Static197.aClass107_22.method3018((long) arg0, local14);
			return local14;
		}
	}
}
