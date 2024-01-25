import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static94 {

	@OriginalMember(owner = "client!dba", name = "e", descriptor = "J")
	public static long aLong59;

	@OriginalMember(owner = "client!dba", name = "g", descriptor = "Ljava/lang/String;")
	public static String aString21;

	@OriginalMember(owner = "client!dba", name = "h", descriptor = "[Lclient!lha;")
	public static Class224[] aClass224Array1;

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "Lclient!fja;")
	public static final Class126 aClass126_32 = new Class126(39, -2);

	@OriginalMember(owner = "client!dba", name = "c", descriptor = "[[I")
	public static final int[][] anIntArrayArray29 = new int[][] { { 2, 4 }, { 2, 4 }, { 5, 2, 4 }, { 4, 5, 2 }, { 2, 4, 5 }, { 5, 2, 4 }, { 1, 6, 2, 5 }, { 1, 6, 7, 1 }, { 6, 7, 1, 1 }, { 0, 8, 9, 8, 9, 4 }, { 8, 9, 4, 0, 8, 9 }, { 2, 10, 0, 10, 11, 11 }, { 2, 4 }, { 1, 6, 7, 1 }, { 1, 6, 7, 1 } };

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "(ZII)Z")
	public static boolean method1881(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x10) != 0;
	}

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "(IJ)V")
	public static void method1883(@OriginalArg(1) long arg0) {
		@Pc(18) int local18 = Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2.anInt10108 + Static422.anInt7131;
		@Pc(23) int local23 = Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2.anInt10109 + Static282.anInt5266;
		if (Static429.anInt7552 - local18 < -2000 || Static429.anInt7552 - local18 > 2000 || Static647.anInt9959 - local23 < -2000 || Static647.anInt9959 - local23 > 2000) {
			Static429.anInt7552 = local18;
			Static647.anInt9959 = local23;
		}
		@Pc(63) int local63;
		@Pc(71) int local71;
		if (local18 != Static429.anInt7552) {
			local63 = local18 - Static429.anInt7552;
			local71 = (int) (arg0 * (long) local63 / 320L);
			if (local63 > 0) {
				if (local71 == 0) {
					local71 = 1;
				} else if (local71 > local63) {
					local71 = local63;
				}
			} else if (local71 == 0) {
				local71 = -1;
			} else if (local71 < local63) {
				local71 = local63;
			}
			Static429.anInt7552 += local71;
		}
		Static204.aFloat82 += Static112.aFloat74 * (float) arg0 / 6.0F;
		Static461.aFloat178 += Static554.aFloat185 * (float) arg0 / 6.0F;
		if (local23 != Static647.anInt9959) {
			local63 = local23 - Static647.anInt9959;
			local71 = (int) ((long) local63 * arg0 / 320L);
			if (local63 <= 0) {
				if (local71 == 0) {
					local71 = -1;
				} else if (local63 > local71) {
					local71 = local63;
				}
			} else if (local71 == 0) {
				local71 = 1;
			} else if (local63 < local71) {
				local71 = local63;
			}
			Static647.anInt9959 += local71;
		}
		Static99.method1965();
	}

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "(IIJ)Ljava/lang/String;")
	public static String method1884(@OriginalArg(1) int arg0, @OriginalArg(2) long arg1) {
		Static478.method6828(arg1);
		@Pc(10) int local10 = Static635.aCalendar2.get(5);
		@Pc(16) int local16 = Static635.aCalendar2.get(2) + 1;
		@Pc(20) int local20 = Static635.aCalendar2.get(1);
		return Integer.toString(local10 / 10) + local10 % 10 + "/" + local16 / 10 + local16 % 10 + "/" + local20 % 100 / 10 + local20 % 10;
	}
}
