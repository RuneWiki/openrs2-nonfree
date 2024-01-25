import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static98 {

	@OriginalMember(owner = "client!ea", name = "c", descriptor = "(IIII)V")
	public static void method6251(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(10) int local10 = arg0 * Static89.aClass1_Sub28_Sub1_1.anInt4899 >> 8;
		if (local10 != 0 && arg1 != -1) {
			Static81.method2027(arg1, local10, Static386.aClass160_79);
			Static289.aBoolean391 = true;
		}
	}

	@OriginalMember(owner = "client!ea", name = "e", descriptor = "(I)V")
	public static void method6252() {
		Static222.anInt4501 = 0;
		Static99.anInt2448 = -1;
		Static417.anInt6093 = -1;
		Static540.anInt9357 = -1;
	}
}
