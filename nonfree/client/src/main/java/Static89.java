import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static89 {

	@OriginalMember(owner = "client!ct", name = "K", descriptor = "[Z")
	public static boolean[] aBooleanArray8;

	@OriginalMember(owner = "client!ct", name = "T", descriptor = "I")
	public static int anInt1983;

	@OriginalMember(owner = "client!ct", name = "J", descriptor = "Lclient!fja;")
	public static final Class126 aClass126_30 = new Class126(67, 28);

	@OriginalMember(owner = "client!ct", name = "L", descriptor = "J")
	public static volatile long aLong57 = 0L;

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(BLclient!gj;)V")
	public static void method1829(@OriginalArg(1) Class143 arg0) {
		Static634.anInt9786 = 0;
		Static185.anInt3412 = 0;
		Static663.aClass105_12 = new Class105();
		Static184.aClass23_Sub1_Sub2_Sub1Array2 = new Class23_Sub1_Sub2_Sub1[1024];
		Static124.aClass23_Sub5Array1 = new Class23_Sub5[Static241.anIntArray294[Static200.anInt3634] + 1];
		Static247.anInt4594 = 0;
		Static673.anInt7817 = 0;
		Static253.method4013(arg0);
		Static500.method7123(arg0);
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(IZ)I")
	public static int method1832(@OriginalArg(0) int arg0) {
		@Pc(18) int local18 = (arg0 * arg0 >> 12) * arg0 >> 12;
		@Pc(24) int local24 = arg0 * 6 - 61440;
		@Pc(32) int local32 = (local24 * arg0 >> 12) + 40960;
		return local32 * local18 >> 12;
	}
}
