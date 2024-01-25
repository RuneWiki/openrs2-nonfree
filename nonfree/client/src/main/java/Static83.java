import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static83 {

	@OriginalMember(owner = "client!cm", name = "e", descriptor = "I")
	public static int anInt1901;

	@OriginalMember(owner = "client!cm", name = "f", descriptor = "Z")
	public static boolean aBoolean177 = true;

	@OriginalMember(owner = "client!cm", name = "l", descriptor = "[[I")
	public static final int[][] anIntArrayArray27 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 3, 5, 3 }, { 6, 0, 2, 4 }, { 2, 5, 6, 1 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 7, 1, 2, 4, 6 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 1, 1, 3, 3 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 3, 7, 0, 4, 3 }, { 0, 2, 4, 6 } };

	@OriginalMember(owner = "client!cm", name = "s", descriptor = "I")
	public static int anInt1911 = 0;

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(JILclient!ha;)V")
	public static void method1771(@OriginalArg(0) long arg0, @OriginalArg(2) Class16 arg1) {
		Static250.anInt4672 = 0;
		Static407.anInt6947 = Static442.anInt7680;
		Static106.anInt2229 = 0;
		Static442.anInt7680 = 0;
		@Pc(24) long local24 = Static131.method2268();
		for (@Pc(29) Class23_Sub5 local29 = (Class23_Sub5) Static663.aClass105_12.method2444(); local29 != null; local29 = (Class23_Sub5) Static663.aClass105_12.method2448()) {
			if (local29.method2586(arg1, arg0)) {
				Static250.anInt4672++;
			}
		}
		if (Static239.aBoolean356 && arg0 % 100L == 0L) {
			System.out.println("Particle system count: " + Static663.aClass105_12.method2443() + ", running: " + Static250.anInt4672);
			System.out.println("Emitters: " + Static106.anInt2229 + " Particles: " + Static442.anInt7680 + ". Time taken: " + (Static131.method2268() - local24) + "ms");
		}
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(Z)Z")
	public static boolean method1776() {
		@Pc(13) boolean local13 = true;
		if (Static68.aClass150_1 == null) {
			if (Static235.aClass143_57.method3130(Static296.anInt8193)) {
				Static68.aClass150_1 = Static683.method3279(Static235.aClass143_57, Static296.anInt8193);
			} else {
				local13 = false;
			}
		}
		if (Static494.aClass150_2 == null) {
			if (Static235.aClass143_57.method3130(Static295.anInt5406)) {
				Static494.aClass150_2 = Static683.method3279(Static235.aClass143_57, Static295.anInt5406);
			} else {
				local13 = false;
			}
		}
		if (Static521.aClass150_3 == null) {
			if (Static235.aClass143_57.method3130(Static374.anInt6625)) {
				Static521.aClass150_3 = Static683.method3279(Static235.aClass143_57, Static374.anInt6625);
			} else {
				local13 = false;
			}
		}
		if (Static571.aClass202_12 == null) {
			if (Static41.aClass143_11.method3130(Static194.anInt6122)) {
				Static571.aClass202_12 = Static199.method8735(Static194.anInt6122, Static41.aClass143_11);
			} else {
				local13 = false;
			}
		}
		if (Static403.aClass150Array1 == null) {
			if (Static235.aClass143_57.method3130(Static194.anInt6122)) {
				Static403.aClass150Array1 = Static683.method3281(Static235.aClass143_57, Static194.anInt6122);
			} else {
				local13 = false;
			}
		}
		return local13;
	}
}
