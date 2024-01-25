import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static90 {

	@OriginalMember(owner = "client!ed", name = "k", descriptor = "Lclient!ob;")
	public static final Class179 aClass179_19 = new Class179(56, 2);

	@OriginalMember(owner = "client!ed", name = "l", descriptor = "[[I")
	public static final int[][] anIntArrayArray24 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } };

	@OriginalMember(owner = "client!ed", name = "o", descriptor = "Z")
	public static volatile boolean aBoolean117 = true;

	@OriginalMember(owner = "client!ed", name = "t", descriptor = "[[B")
	public static final byte[][] aByteArrayArray4 = new byte[250][];

	@OriginalMember(owner = "client!ed", name = "v", descriptor = "I")
	public static int anInt1905 = 0;

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(II)I")
	public static int method1647(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static34.aShortArrayArray1 == null ? 0 : Static34.aShortArrayArray1[arg0][arg1] & 0xFFFF;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "([BI)Lclient!rg;")
	public static Class1_Sub2_Sub15 method1652(@OriginalArg(0) byte[] arg0) {
		@Pc(7) Class1_Sub2_Sub15 local7 = new Class1_Sub2_Sub15();
		@Pc(17) Class1_Sub5 local17 = new Class1_Sub5(arg0);
		local17.anInt6475 = local17.aByteArray89.length - 2;
		@Pc(28) int local28 = local17.method5362();
		@Pc(39) int local39 = local17.aByteArray89.length - local28 - 12 - 2;
		local17.anInt6475 = local39;
		@Pc(46) int local46 = local17.method5407();
		local7.anInt5785 = local17.method5362();
		local7.anInt5784 = local17.method5362();
		local7.anInt5788 = local17.method5362();
		local7.anInt5787 = local17.method5362();
		@Pc(72) int local72 = local17.method5366();
		@Pc(83) int local83;
		@Pc(88) int local88;
		if (local72 > 0) {
			local7.aClass96Array1 = new Class96[local72];
			for (local83 = 0; local83 < local72; local83++) {
				local88 = local17.method5362();
				@Pc(95) Class96 local95 = new Class96(Static406.method5434(local88));
				local7.aClass96Array1[local83] = local95;
				while (local88-- > 0) {
					@Pc(107) int local107 = local17.method5407();
					@Pc(111) int local111 = local17.method5407();
					local95.method2341((long) local107, new Class1_Sub43(local111));
				}
			}
		}
		local17.anInt6475 = 0;
		local7.aString59 = local17.method5356();
		local7.anIntArray534 = new int[local46];
		local7.anIntArray533 = new int[local46];
		local7.aStringArray36 = new String[local46];
		local83 = 0;
		while (local17.anInt6475 < local39) {
			local88 = local17.method5362();
			if (local88 == 3) {
				local7.aStringArray36[local83] = local17.method5401().intern();
			} else if (local88 >= 100 || local88 == 21 || local88 == 38 || local88 == 39) {
				local7.anIntArray533[local83] = local17.method5366();
			} else {
				local7.anIntArray533[local83] = local17.method5407();
			}
			local7.anIntArray534[local83++] = local88;
		}
		return local7;
	}
}
