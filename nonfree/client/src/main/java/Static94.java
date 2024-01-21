import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static94 {

	@OriginalMember(owner = "client!mb", name = "eb", descriptor = "I")
	public static volatile int anInt2915 = -1;

	@OriginalMember(owner = "client!mb", name = "hb", descriptor = "I")
	public static int anInt2918 = -1;

	@OriginalMember(owner = "client!mb", name = "ib", descriptor = "I")
	public static int anInt2919 = 0;

	@OriginalMember(owner = "client!mb", name = "mb", descriptor = "I")
	public static int anInt2923 = 255;

	@OriginalMember(owner = "client!mb", name = "nb", descriptor = "Lclient!hc;")
	public static Class1_Sub6 aClass1_Sub6_3 = new Class1_Sub6(8);

	@OriginalMember(owner = "client!mb", name = "ob", descriptor = "I")
	public static int anInt2924 = 0;

	@OriginalMember(owner = "client!mb", name = "pb", descriptor = "Lclient!ea;")
	public static Class18 aClass18_737 = Static8.method128("null");

	@OriginalMember(owner = "client!mb", name = "qb", descriptor = "Lclient!ea;")
	public static Class18 aClass18_738 = Static8.method128("<col=00ff80>");

	@OriginalMember(owner = "client!mb", name = "i", descriptor = "(I)V")
	public static void method2060() {
		aClass18_737 = null;
		aClass18_738 = null;
		aClass1_Sub6_3 = null;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lclient!ef;Z)Lclient!ef;")
	public static Class20 method2061(@OriginalArg(0) Class20 arg0) {
		@Pc(11) int local11 = Static95.method2085(Static36.method758(arg0));
		if (local11 == 0) {
			return null;
		}
		for (@Pc(20) int local20 = 0; local20 < local11; local20++) {
			arg0 = Static84.method1826(arg0.anInt1233);
			if (arg0 == null) {
				return null;
			}
		}
		return arg0;
	}
}
