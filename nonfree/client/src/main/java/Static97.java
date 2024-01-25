import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static97 {

	@OriginalMember(owner = "client!fj", name = "e", descriptor = "Z")
	public static boolean aBoolean179 = false;

	@OriginalMember(owner = "client!fj", name = "f", descriptor = "I")
	public static int anInt1940 = 0;

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(Z)V")
	public static void method1893() {
		@Pc(1) Class107 local1 = Static258.aClass107_36;
		synchronized (Static258.aClass107_36) {
			Static258.aClass107_36.method3012();
		}
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(ZJ)Ljava/lang/String;")
	public static String method1894(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(29) int local29 = 0;
			@Pc(31) long local31 = arg0;
			while (local31 != 0L) {
				local31 /= 37L;
				local29++;
			}
			@Pc(56) StringBuffer local56 = new StringBuffer(local29);
			while (arg0 != 0L) {
				@Pc(60) long local60 = arg0;
				arg0 /= 37L;
				local56.append(Static228.aCharArray5[(int) (local60 - arg0 * 37L)]);
			}
			return local56.reverse().toString();
		}
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(Lclient!fh;I)V")
	public static void method1895(@OriginalArg(0) Class68 arg0) {
		if (arg0.anInt1871 == 5 && arg0.anInt1890 != -1) {
			Static336.method5479(arg0, Static51.aClass37_1);
		}
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(IB)V")
	public static void method1896(@OriginalArg(0) int arg0) {
		Static176.anInt3970 = arg0;
		@Pc(7) Class107 local7 = Static98.aClass107_11;
		synchronized (Static98.aClass107_11) {
			Static98.aClass107_11.method3015();
		}
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(B)V")
	public static void method1897() {
		Static41.aClass107_41.method3015();
		Static84.aClass107_9.method3015();
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(II)V")
	public static void method1898(@OriginalArg(1) int arg0) {
		Static160.anInt3750 = -1;
		Static105.anInt2196 = arg0;
		Static160.anInt3750 = -1;
		Static220.method4160();
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(IIII)I")
	public static int method1899(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static9.aClass105Array1 == null) {
			return 0;
		}
		@Pc(11) int local11 = arg2 >> 7;
		@Pc(15) int local15 = arg1 >> 7;
		if (local11 < 0 || local15 < 0 || local11 > Static66.anInt1177 - 1 || local15 > Static12.anInt213 - 1) {
			return 0;
		}
		@Pc(44) int local44 = arg0;
		if (arg0 < 3 && (Static243.aByteArrayArrayArray10[1][local11][local15] & 0x2) != 0) {
			local44 = arg0 + 1;
		}
		return Static9.aClass105Array1[local44].method4452(arg2, arg1);
	}
}
