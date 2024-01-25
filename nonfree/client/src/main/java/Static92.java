import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static92 {

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "Ljava/lang/String;")
	public static String aString62 = "Please wait...";

	@OriginalMember(owner = "client!fi", name = "c", descriptor = "[I")
	public static final int[] anIntArray104 = new int[32];

	@OriginalMember(owner = "client!fi", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString63 = "scroll:";

	@OriginalMember(owner = "client!fi", name = "f", descriptor = "I")
	public static int anInt1817 = -2;

	@OriginalMember(owner = "client!fi", name = "g", descriptor = "I")
	public static int anInt1818 = 0;

	@OriginalMember(owner = "client!fi", name = "i", descriptor = "Ljava/lang/String;")
	public static String aString64 = null;

	@OriginalMember(owner = "client!fi", name = "c", descriptor = "(I)V")
	public static void method1459() {
		@Pc(1) Class198 local1 = Static62.aClass198_17;
		synchronized (Static62.aClass198_17) {
			Static62.aClass198_17.method5230();
		}
		@Pc(26) Class198 local26 = Static190.aClass198_34;
		synchronized (Static190.aClass198_34) {
			Static190.aClass198_34.method5230();
		}
		@Pc(39) Class214 local39 = Static196.aClass214_1;
		synchronized (Static196.aClass214_1) {
			Static196.aClass214_1.method5661();
		}
	}

	@OriginalMember(owner = "client!fi", name = "d", descriptor = "(I)Lclient!jr;")
	public static Class3_Sub7_Sub11 method1463() {
		@Pc(14) Class3_Sub7_Sub11 local14 = (Class3_Sub7_Sub11) Static143.aClass195_11.method5216();
		if (local14 != null) {
			local14.method5717();
			local14.method5385();
			return local14;
		}
		do {
			local14 = (Class3_Sub7_Sub11) Static90.aClass195_1.method5216();
			if (local14 == null) {
				return null;
			}
			if (local14.method2507() > Static53.method898()) {
				return null;
			}
			local14.method5717();
			local14.method5385();
		} while ((Long.MIN_VALUE & local14.aLong198) == 0L);
		return local14;
	}
}
