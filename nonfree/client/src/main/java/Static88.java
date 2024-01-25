import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static88 {

	@OriginalMember(owner = "client!di", name = "l", descriptor = "Lclient!pq;")
	public static Class251 aClass251_27;

	@OriginalMember(owner = "client!di", name = "o", descriptor = "[[I")
	public static final int[][] anIntArrayArray26 = new int[128][128];

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(JI)Ljava/lang/String;")
	public static String method1427(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(32) int local32 = 0;
			@Pc(34) long local34 = arg0;
			while (local34 != 0L) {
				local34 /= 37L;
				local32++;
			}
			@Pc(52) StringBuffer local52 = new StringBuffer(local32);
			while (arg0 != 0L) {
				@Pc(56) long local56 = arg0;
				arg0 /= 37L;
				local52.append(Static505.aCharArray10[(int) (local56 - arg0 * 37L)]);
			}
			return local52.reverse().toString();
		}
	}

	@OriginalMember(owner = "client!di", name = "b", descriptor = "(I)V")
	public static void method1428() {
		for (@Pc(3) int local3 = 0; local3 < Static303.aByteArrayArrayArray13.length; local3++) {
			for (@Pc(7) int local7 = 0; local7 < Static303.aByteArrayArrayArray13[0].length; local7++) {
				for (@Pc(11) int local11 = 0; local11 < Static303.aByteArrayArrayArray13[0][0].length; local11++) {
					Static303.aByteArrayArrayArray13[local3][local7][local11] = 0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!di", name = "c", descriptor = "(I)V")
	public static void method1429() {
		Static16.anInt311 = -1;
		Static334.anInt5975 = -1;
		Static573.anInt9601 = 0;
	}
}
