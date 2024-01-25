import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static87 {

	@OriginalMember(owner = "client!dd", name = "c", descriptor = "I")
	public static int anInt2262 = 64;

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(IZB)Ljava/lang/String;")
	public static String method2046(@OriginalArg(0) int arg0) {
		return arg0 < 0 ? Integer.toString(arg0) : Static164.method3182(arg0);
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(IILjava/util/Random;)I")
	public static int method2047(@OriginalArg(1) int arg0, @OriginalArg(2) Random arg1) {
		if (arg0 <= 0) {
			throw new IllegalArgumentException();
		} else if (Static422.method6062(arg0)) {
			return (int) ((long) arg0 * ((long) arg1.nextInt() & 0xFFFFFFFFL) >> 32);
		} else {
			@Pc(35) int local35 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg0);
			@Pc(38) int local38;
			do {
				local38 = arg1.nextInt();
			} while (local35 <= local38);
			return Static2.method47(local38, arg0);
		}
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(B)V")
	public static void method2050() {
		Static406.anInt7043 = 0;
		Static479.aClass22Array1 = new Class22[50];
	}
}
