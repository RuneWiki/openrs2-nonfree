import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static91 {

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "I")
	public static int anInt2128 = 1;

	@OriginalMember(owner = "client!qa", name = "d", descriptor = "Lclient!od;")
	public static Class60 aClass60_878 = Static41.method597("bevor Sie den Vorgang wiederholen)3");

	@OriginalMember(owner = "client!qa", name = "e", descriptor = "I")
	public static int anInt2130 = 0;

	@OriginalMember(owner = "client!qa", name = "j", descriptor = "I")
	public static int anInt2135 = 0;

	@OriginalMember(owner = "client!qa", name = "k", descriptor = "Lclient!cb;")
	public static Class12 aClass12_19 = new Class12(50);

	@OriginalMember(owner = "client!qa", name = "u", descriptor = "Lclient!od;")
	private static Class60 aClass60_882 = Static41.method597("K");

	@OriginalMember(owner = "client!qa", name = "l", descriptor = "Lclient!od;")
	public static Class60 aClass60_879 = aClass60_882;

	@OriginalMember(owner = "client!qa", name = "z", descriptor = "Lclient!od;")
	private static Class60 aClass60_883 = Static41.method597("Attack");

	@OriginalMember(owner = "client!qa", name = "m", descriptor = "Lclient!od;")
	public static Class60 aClass60_880 = aClass60_883;

	@OriginalMember(owner = "client!qa", name = "o", descriptor = "Lclient!od;")
	public static Class60 aClass60_881 = aClass60_882;

	@OriginalMember(owner = "client!qa", name = "r", descriptor = "I")
	public static int anInt2139 = 0;

	@OriginalMember(owner = "client!qa", name = "A", descriptor = "I")
	public static int anInt2145 = 0;

	@OriginalMember(owner = "client!qa", name = "B", descriptor = "Lclient!od;")
	public static Class60 aClass60_884 = Static41.method597(" steht bereits auf Ihrer Freunde)2Liste(Q");

	@OriginalMember(owner = "client!qa", name = "D", descriptor = "Lclient!cb;")
	public static Class12 aClass12_20 = new Class12(64);

	@OriginalMember(owner = "client!qa", name = "F", descriptor = "I")
	public static int anInt2146 = 0;

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(I)V")
	public static void method1473() {
		aClass12_20 = null;
		aClass60_879 = null;
		aClass60_883 = null;
		aClass60_880 = null;
		aClass12_19 = null;
		aClass60_884 = null;
		aClass60_882 = null;
		aClass60_878 = null;
		aClass60_881 = null;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(III)I")
	public static int method1474(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = 0;
		while (arg0 > 0) {
			arg0--;
			local7 = arg1 & 0x1 | local7 << 1;
			arg1 >>>= 0x1;
		}
		return local7;
	}
}
