import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static86 {

	@OriginalMember(owner = "client!hk", name = "hb", descriptor = "I")
	public static int anInt1909;

	@OriginalMember(owner = "client!hk", name = "kb", descriptor = "Lclient!dg;")
	public static Class28_Sub1 aClass28_Sub1_51;

	@OriginalMember(owner = "client!hk", name = "Y", descriptor = "I")
	public static int anInt1901 = 0;

	@OriginalMember(owner = "client!hk", name = "cb", descriptor = "Lclient!vb;")
	public static Class120 aClass120_10 = new Class120();

	@OriginalMember(owner = "client!hk", name = "gb", descriptor = "I")
	public static int anInt1908 = 0;

	@OriginalMember(owner = "client!hk", name = "ib", descriptor = "Lclient!sc;")
	public static Class107 aClass107_545 = Static231.method3737("mem=");

	@OriginalMember(owner = "client!hk", name = "jb", descriptor = "[I")
	public static int[] anIntArray197 = new int[5];

	@OriginalMember(owner = "client!hk", name = "d", descriptor = "(III)Lclient!fj;")
	public static Class40 method1491(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub9 local7 = Static174.aClass1_Sub9ArrayArrayArray2[arg0][arg1][arg2];
		return local7 == null || local7.aClass40_1 == null ? null : local7.aClass40_1;
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIIII)V")
	public static void method1492(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static194.anInt4290 = -1;
		Static199.anInt4323 = -1;
		Static10.anInt284 = Static170.anInt3706 * arg1 / arg0;
		Static114.anInt2509 = arg3 * Static152.anInt3375 / arg2;
		Static25.method458();
	}

	@OriginalMember(owner = "client!hk", name = "c", descriptor = "(II)V")
	public static void method1493() {
		Static165.aClass61_42.method1695(5);
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(ZI)V")
	public static void method1494(@OriginalArg(1) int arg0) {
		Static199.anInt4323 = -1;
		Static194.anInt4290 = -1;
		Static10.anInt284 = arg0;
		Static25.method458();
	}

	@OriginalMember(owner = "client!hk", name = "d", descriptor = "(B)V")
	public static void method1496() {
		if (Static71.aClass65_1 == null) {
			return;
		}
		try {
			@Pc(16) byte[] local16 = Static71.aClass65_1.method1952();
			if (local16 != null) {
				@Pc(23) Class1_Sub26 local23 = new Class1_Sub26(local16);
				Static179.anInt3927 = local23.method2964();
				Static8.aClass54Array1 = new Class54[Static179.anInt3927];
				for (@Pc(32) int local32 = 0; local32 < Static179.anInt3927; local32++) {
					@Pc(42) Class54 local42 = Static8.aClass54Array1[local32] = new Class54();
					@Pc(46) int local46 = local23.method2964();
					local42.anInt1917 = local46 & 0x7FFF;
					local42.aBoolean173 = (local46 & 0x8000) != 0;
					local42.aClass107_547 = local23.method2978();
					local42.anInt1911 = local23.method2944();
					local42.anInt1916 = local32;
					@Pc(80) int local80 = local23.method2964();
					local42.anInt1912 = Static1.method55(local80);
				}
				Static201.method3224(Static8.aClass54Array1, Static8.aClass54Array1.length - 1, 0);
				Static71.aClass65_1 = null;
			}
		} catch (@Pc(101) Exception local101) {
			local101.printStackTrace();
			Static71.aClass65_1 = null;
		}
	}
}
