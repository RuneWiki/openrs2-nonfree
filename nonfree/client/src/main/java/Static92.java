import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static92 {

	@OriginalMember(owner = "client!dj", name = "t", descriptor = "[J")
	public static final long[] aLongArray1 = new long[32];

	@OriginalMember(owner = "client!dj", name = "v", descriptor = "Lclient!oea;")
	public static final Class245 aClass245_1 = new Class245(16);

	@OriginalMember(owner = "client!dj", name = "x", descriptor = "[[I")
	public static final int[][] anIntArrayArray13 = new int[][] { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 }, { -1, 0, -1, 2 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 3, 4, -1 }, { -1, 0, 2, -1 }, { -1, -1, 2, 0 }, { 0, 2, 5, 3 }, { 0, -1, 6, -1 }, { 0, 1, 2, 3 } };

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(Lclient!n;Z)V")
	public static void method2100(@OriginalArg(0) Class225 arg0) {
		if (arg0.anInt6496 == Static47.anInt643) {
			Static261.aBooleanArray18[arg0.anInt6524] = true;
		}
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(ZII)Z")
	public static boolean method2101(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x10) != 0;
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(Lclient!n;I)V")
	public static void method2104(@OriginalArg(0) Class225 arg0) {
		@Pc(12) Class225 local12 = Static541.method7832(arg0);
		@Pc(18) int local18;
		@Pc(16) int local16;
		if (local12 == null) {
			local16 = Static375.anInt7256;
			local18 = Static554.anInt9828;
		} else {
			local16 = local12.anInt6521;
			local18 = local12.anInt6529;
		}
		Static310.method5264(local16, local18, false, arg0);
		Static116.method2477(local18, local16, arg0);
	}
}
