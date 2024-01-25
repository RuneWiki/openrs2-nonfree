import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static98 {

	@OriginalMember(owner = "client!g", name = "f", descriptor = "I")
	public static int anInt2538;

	@OriginalMember(owner = "client!g", name = "i", descriptor = "[[I")
	public static final int[][] anIntArrayArray66 = new int[128][128];

	@OriginalMember(owner = "client!g", name = "k", descriptor = "[I")
	public static final int[] anIntArray224 = new int[] { 0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4 };

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(II[BI)I")
	public static int method2232(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int local12 = -1;
		for (@Pc(14) int local14 = arg0; local14 < arg2; local14++) {
			local12 = local12 >>> 8 ^ Class33.anIntArray53[(local12 ^ arg1[local14]) & 0xFF];
		}
		return ~local12;
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(I)V")
	public static void method2235() {
		@Pc(8) int local8 = Static174.method3345();
		if (local8 == 0) {
			Static63.aByteArrayArrayArray3 = null;
			Static73.method1860(0);
		} else if (local8 == 1) {
			Static355.method5664((byte) 0);
			Static73.method1860(512);
			if (Static2.aByteArrayArrayArray1 != null) {
				Static20.method334();
			}
		} else {
			Static355.method5664((byte) (Static357.anInt6820 - 4 & 0xFF));
			Static73.method1860(2);
		}
		Static354.anInt6742 = Static12.anInt267;
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(II)V")
	public static void method2236(@OriginalArg(1) int arg0) {
		@Pc(8) Class4_Sub4_Sub18 local8 = Static302.method4961(arg0, 7);
		local8.method4902();
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(BLclient!hl;)V")
	public static void method2237(@OriginalArg(1) Class8_Sub1_Sub2 arg0) {
		@Pc(5) boolean local5 = false;
		if (Static199.anInt4137 == arg0.anInt4922 || arg0.anInt4954 == -1 || arg0.anInt4935 != 0) {
			local5 = true;
		} else {
			@Pc(28) Class14 local28 = Static225.method4042(arg0.anInt4954);
			if (local28.aBoolean30 || local28.anIntArray11[arg0.anInt4961] < arg0.anInt4945 + 1) {
				local5 = true;
			}
		}
		if (local5) {
			@Pc(60) int local60 = arg0.anInt4922 - arg0.anInt4958;
			@Pc(66) int local66 = Static199.anInt4137 - arg0.anInt4958;
			@Pc(77) int local77 = arg0.anInt4912 * 128 + arg0.method4349() * 64;
			@Pc(88) int local88 = arg0.anInt4974 * 128 + arg0.method4349() * 64;
			@Pc(99) int local99 = arg0.anInt4938 * 128 + arg0.method4349() * 64;
			@Pc(111) int local111 = arg0.anInt4925 * 128 + arg0.method4349() * 64;
			arg0.anInt6701 = (local99 * local66 + local77 * (local60 - local66)) / local60;
			arg0.anInt6702 = (local111 * local66 + (local60 - local66) * local88) / local60;
		}
		arg0.anInt4990 = 0;
		if (arg0.anInt4962 == 0) {
			arg0.method4346(8192);
		}
		if (arg0.anInt4962 == 1) {
			arg0.method4346(12288);
		}
		if (arg0.anInt4962 == 2) {
			arg0.method4346(0);
		}
		if (arg0.anInt4962 == 3) {
			arg0.method4346(4096);
		}
	}
}
