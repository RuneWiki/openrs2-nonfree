import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static89 {

	@OriginalMember(owner = "client!eo", name = "s", descriptor = "Lclient!kj;")
	public static Class133 aClass133_9;

	@OriginalMember(owner = "client!eo", name = "v", descriptor = "[Lclient!pl;")
	public static Class7[] aClass7Array4;

	@OriginalMember(owner = "client!eo", name = "p", descriptor = "Lclient!dk;")
	public static final Class57 aClass57_93 = new Class57("Allocated memory", "Zugewiesener Speicher.", "Mémoire attribuée", "Memória alocada");

	@OriginalMember(owner = "client!eo", name = "t", descriptor = "I")
	public static int anInt6128 = 0;

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(BI)V")
	public static void method5436(@OriginalArg(1) int arg0) {
		for (@Pc(11) Class3 local11 = Static230.aClass44_25.method950(); local11 != null; local11 = Static230.aClass44_25.method949()) {
			if ((local11.aLong240 >> 48 & 0xFFFFL) == (long) arg0) {
				local11.method5700();
			}
		}
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(IIB)V")
	public static void method5438(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static125.anInt2380 = arg1 - Static42.anInt542;
		Static253.anInt4565 = arg0 - Static42.anInt534;
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(ZI)V")
	public static void method5439(@OriginalArg(1) int arg0) {
		Static253.anInt4565 = -1;
		Static257.anInt4618 = arg0;
		Static253.anInt4565 = -1;
		Static43.method691();
	}
}
