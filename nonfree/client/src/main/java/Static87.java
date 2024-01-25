import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static87 {

	@OriginalMember(owner = "client!dj", name = "x", descriptor = "I")
	public static int anInt5333;

	@OriginalMember(owner = "client!dj", name = "z", descriptor = "Lclient!nea;")
	public static final Class235 aClass235_164 = new Class235(64, 7);

	@OriginalMember(owner = "client!dj", name = "B", descriptor = "I")
	public static int anInt5335 = 0;

	@OriginalMember(owner = "client!dj", name = "C", descriptor = "Lclient!nea;")
	public static final Class235 aClass235_165 = new Class235(45, -1);

	@OriginalMember(owner = "client!dj", name = "D", descriptor = "Lclient!wba;")
	public static final Class353 aClass353_33 = new Class353();

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(IILjava/util/Random;)I")
	public static int method4324(@OriginalArg(1) int arg0, @OriginalArg(2) Random arg1) {
		if (arg0 <= 0) {
			throw new IllegalArgumentException();
		} else if (Static230.method3483(arg0)) {
			return (int) ((long) arg0 * ((long) arg1.nextInt() & 0xFFFFFFFFL) >> 32);
		} else {
			@Pc(41) int local41 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg0);
			@Pc(44) int local44;
			do {
				local44 = arg1.nextInt();
			} while (local44 >= local41);
			return Static437.method6090(local44, arg0);
		}
	}
}
