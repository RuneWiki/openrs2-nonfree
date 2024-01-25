import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static93 {

	@OriginalMember(owner = "client!cv", name = "G", descriptor = "I")
	public static int anInt1931;

	@OriginalMember(owner = "client!cv", name = "b", descriptor = "(IIB)Z")
	public static boolean method1602(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x180) != 0;
	}

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(IZLjava/util/Random;)I")
	public static int method1603(@OriginalArg(0) int arg0, @OriginalArg(2) Random arg1) {
		if (arg0 <= 0) {
			throw new IllegalArgumentException();
		} else if (Static365.method5254(arg0)) {
			return (int) ((long) arg0 * ((long) arg1.nextInt() & 0xFFFFFFFFL) >> 32);
		} else {
			@Pc(42) int local42 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg0);
			@Pc(45) int local45;
			do {
				local45 = arg1.nextInt();
			} while (local42 <= local45);
			return Static13.method352(local45, arg0);
		}
	}

	@OriginalMember(owner = "client!cv", name = "g", descriptor = "(I)I")
	public static int method1604() {
		return 16;
	}
}
