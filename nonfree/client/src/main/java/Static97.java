import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static97 {

	@OriginalMember(owner = "client!fe", name = "db", descriptor = "Lclient!g;")
	public static Class83 aClass83_46;

	@OriginalMember(owner = "client!fe", name = "hb", descriptor = "[Z")
	public static boolean[] aBooleanArray11;

	@OriginalMember(owner = "client!fe", name = "Z", descriptor = "Lclient!sd;")
	public static final Class208 aClass208_53 = new Class208(91, 6);

	@OriginalMember(owner = "client!fe", name = "fb", descriptor = "S")
	public static short aShort32 = 1;

	@OriginalMember(owner = "client!fe", name = "gb", descriptor = "I")
	public static int anInt2139 = 0;

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(Z[J[Ljava/lang/Object;)V")
	public static void method1696(@OriginalArg(1) long[] arg0, @OriginalArg(2) Object[] arg1) {
		Static203.method3471(arg1, arg0.length - 1, 0, arg0);
	}

	@OriginalMember(owner = "client!fe", name = "e", descriptor = "(I)Lclient!pi;")
	public static Class35_Sub1 method1697() {
		return Static340.anInt6285 < Static222.aClass35_Sub1Array1.length ? Static222.aClass35_Sub1Array1[Static340.anInt6285++] : null;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(Lclient!vt;B)Lclient!fs;")
	public static Class43_Sub3 method1699(@OriginalArg(0) Class2_Sub24 arg0) {
		return new Class43_Sub3(arg0.method5743(), arg0.method5743(), arg0.method5743(), arg0.method5743(), arg0.method5736(), arg0.method5736(), arg0.method5732());
	}
}
