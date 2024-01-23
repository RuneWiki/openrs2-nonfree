import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static90 {

	@OriginalMember(owner = "client!gk", name = "f", descriptor = "I")
	public static int anInt2091;

	@OriginalMember(owner = "client!gk", name = "h", descriptor = "Lclient!th;")
	public static Class168 aClass168_71;

	@OriginalMember(owner = "client!gk", name = "b", descriptor = "I")
	public static int anInt2088 = 100;

	@OriginalMember(owner = "client!gk", name = "d", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray1 = new boolean[][] { { true, true, true }, { false, false }, { false, true }, { true, false }, { false, true, true }, { true, false, true }, { false, true, false }, { true, false, false } };

	@OriginalMember(owner = "client!gk", name = "g", descriptor = "[I")
	public static int[] anIntArray207 = new int[2500];

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(III)Z")
	public static boolean method1546(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = Static241.anIntArrayArrayArray13[arg0][arg1][arg2];
		if (local7 == -Static108.anInt2392) {
			return false;
		} else if (local7 == Static108.anInt2392) {
			return true;
		} else {
			@Pc(22) int local22 = arg1 << 7;
			@Pc(26) int local26 = arg2 << 7;
			if (Static240.method3778(local22 + 1, Static46.anIntArrayArrayArray1[arg0][arg1][arg2], local26 + 1) && Static240.method3778(local22 + 128 - 1, Static46.anIntArrayArrayArray1[arg0][arg1 + 1][arg2], local26 + 1) && Static240.method3778(local22 + 128 - 1, Static46.anIntArrayArrayArray1[arg0][arg1 + 1][arg2 + 1], local26 + 128 - 1) && Static240.method3778(local22 + 1, Static46.anIntArrayArrayArray1[arg0][arg1][arg2 + 1], local26 + 128 - 1)) {
				Static241.anIntArrayArrayArray13[arg0][arg1][arg2] = Static108.anInt2392;
				return true;
			} else {
				Static241.anIntArrayArrayArray13[arg0][arg1][arg2] = -Static108.anInt2392;
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(II)Lclient!cn;")
	public static Class30 method1547(@OriginalArg(1) int arg0) {
		@Pc(6) Class30 local6 = (Class30) Static166.aClass89_23.method2268((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(22) byte[] local22 = Static111.aClass168_83.method4058(arg0, 1);
		local6 = new Class30();
		if (local22 != null) {
			local6.method772(arg0, new Class1_Sub14(local22));
		}
		Static166.aClass89_23.method2272((long) arg0, local6);
		return local6;
	}
}
