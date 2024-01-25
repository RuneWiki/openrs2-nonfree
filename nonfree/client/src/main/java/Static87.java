import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static87 {

	@OriginalMember(owner = "client!fp", name = "Q", descriptor = "I")
	public static int anInt2179;

	@OriginalMember(owner = "client!fp", name = "I", descriptor = "Z")
	public static boolean aBoolean205 = false;

	@OriginalMember(owner = "client!fp", name = "J", descriptor = "[I")
	public static final int[] anIntArray210 = new int[1000];

	@OriginalMember(owner = "client!fp", name = "R", descriptor = "Z")
	public static boolean aBoolean206 = false;

	@OriginalMember(owner = "client!fp", name = "T", descriptor = "I")
	public static int anInt2181 = 0;

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(JI)Ljava/lang/String;")
	public static String method1890(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(32) int local32 = 0;
			for (@Pc(34) long local34 = arg0; local34 != 0L; local34 /= 37L) {
				local32++;
			}
			@Pc(50) StringBuffer local50 = new StringBuffer(local32);
			while (arg0 != 0L) {
				@Pc(54) long local54 = arg0;
				arg0 /= 37L;
				local50.append(Static85.aCharArray6[(int) (local54 - arg0 * 37L)]);
			}
			return local50.reverse().toString();
		}
	}

	@OriginalMember(owner = "client!fp", name = "i", descriptor = "(I)V")
	public static void method1891() {
		if (Static342.aClass32_8 != null) {
			Static342.aClass32_8.method2197();
			Static338.aClass9_4 = null;
			Static342.aClass32_8 = null;
		}
	}
}
