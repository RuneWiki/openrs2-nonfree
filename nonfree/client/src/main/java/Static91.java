import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static91 {

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "[I")
	public static final int[] anIntArray793 = new int[16];

	@OriginalMember(owner = "client!dr", name = "b", descriptor = "Lclient!jr;")
	public static final Class155 aClass155_25 = new Class155("", 11);

	@OriginalMember(owner = "client!dr", name = "e", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray11 = new boolean[][] { new boolean[4], { false, true, true, false }, { true, false, true, false }, { true, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { true, true, false, false }, new boolean[4], { false, true, false, true }, new boolean[4] };

	@OriginalMember(owner = "client!dr", name = "g", descriptor = "I")
	public static int anInt9225 = -1;

	@OriginalMember(owner = "client!dr", name = "h", descriptor = "Lclient!jr;")
	public static final Class155 aClass155_26 = new Class155("", 15);

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(IIII)V")
	public static void method7967(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) int local6 = Static286.aClass1_Sub15_Sub1_1.anInt7042 * arg2 >> 8;
		if (local6 != 0 && arg1 != -1) {
			Static127.method2441(local6, arg1, Static98.aClass69_25);
			Static410.aBoolean568 = true;
		}
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(II)Z")
	public static boolean method7968(@OriginalArg(1) int arg0) {
		return arg0 == 1 || arg0 == 3 || arg0 == 5;
	}

	@OriginalMember(owner = "client!dr", name = "b", descriptor = "(I)Lclient!ib;")
	public static Class13 method7969() {
		try {
			return (Class13) Class.forName("Class13_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(16) Throwable local16) {
			return null;
		}
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(BII)V")
	public static void method7970(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) Class126 local9 = Static169.aClass126ArrayArray1[arg1][arg0];
		if (local9 != null) {
			Static265.anInt3379 = local9.anInt3474;
			Static169.anInt3412 = local9.anInt3478;
			Static204.anInt4065 = local9.anInt3473;
		}
		Static19.method549();
	}
}
