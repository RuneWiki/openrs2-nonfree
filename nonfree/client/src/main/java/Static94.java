import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static94 {

	@OriginalMember(owner = "client!ka", name = "d", descriptor = "I")
	public static int anInt1983;

	@OriginalMember(owner = "client!ka", name = "i", descriptor = "Lclient!o;")
	public static Class67 aClass67_5;

	@OriginalMember(owner = "client!ka", name = "u", descriptor = "I")
	public static int anInt1997;

	@OriginalMember(owner = "client!ka", name = "x", descriptor = "Lclient!qi;")
	public static Class85 aClass85_1;

	@OriginalMember(owner = "client!ka", name = "D", descriptor = "I")
	public static int anInt2004;

	@OriginalMember(owner = "client!ka", name = "j", descriptor = "I")
	public static int anInt1988 = 0;

	@OriginalMember(owner = "client!ka", name = "q", descriptor = "[I")
	public static final int[] anIntArray201 = new int[500];

	@OriginalMember(owner = "client!ka", name = "r", descriptor = "[I")
	public static final int[] anIntArray202 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIIIII)V")
	public static void method1608(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg1 > Static61.anInt1501 || arg4 < Static147.anInt4074) {
			return;
		}
		@Pc(25) boolean local25;
		if (Static209.anInt4155 > arg2) {
			local25 = false;
			arg2 = Static209.anInt4155;
		} else if (arg2 <= Static36.anInt940) {
			local25 = true;
		} else {
			local25 = false;
			arg2 = Static36.anInt940;
		}
		@Pc(56) boolean local56;
		if (Static209.anInt4155 > arg3) {
			arg3 = Static209.anInt4155;
			local56 = false;
		} else if (Static36.anInt940 >= arg3) {
			local56 = true;
		} else {
			local56 = false;
			arg3 = Static36.anInt940;
		}
		if (arg1 < Static147.anInt4074) {
			arg1 = Static147.anInt4074;
		} else {
			Static22.method438(arg3, arg0, arg2, Static14.anIntArrayArray18[arg1++]);
		}
		if (arg4 <= Static61.anInt1501) {
			Static22.method438(arg3, arg0, arg2, Static14.anIntArrayArray18[arg4--]);
		} else {
			arg4 = Static61.anInt1501;
		}
		@Pc(108) int local108;
		if (local25 && local56) {
			for (local108 = arg1; local108 <= arg4; local108++) {
				@Pc(150) int[] local150 = Static14.anIntArrayArray18[local108];
				local150[arg2] = local150[arg3] = arg0;
			}
			return;
		}
		if (local25) {
			for (local108 = arg1; local108 <= arg4; local108++) {
				Static14.anIntArrayArray18[local108][arg2] = arg0;
			}
			return;
		}
		if (local56) {
			for (local108 = arg1; local108 <= arg4; local108++) {
				Static14.anIntArrayArray18[local108][arg3] = arg0;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Z)V")
	public static void method1609() {
		@Pc(1) Class100 local1 = Static206.aClass100_1;
		synchronized (Static206.aClass100_1) {
			Static36.anInt939 = Static6.anInt107;
			Static172.anInt3534++;
			Static4.anInt95 = Static166.anInt3424;
			Static121.anInt2740 = Static46.anInt1117;
			Static61.anInt1502 = Static176.anInt3605;
			Static59.anInt1446 = Static196.anInt3888;
			Static153.anInt3298 = Static146.anInt3030;
			Static50.aLong40 = Static175.aLong123;
			Static176.anInt3605 = 0;
		}
	}

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "(I)V")
	public static void method1611() {
		try {
			if (Static92.anInt1969 == 1) {
				@Pc(15) int local15 = Static211.aClass2_Sub9_Sub3_2.method1555();
				if (local15 > 0 && Static211.aClass2_Sub9_Sub3_2.method1536()) {
					local15 -= Static137.anInt2903;
					if (local15 < 0) {
						local15 = 0;
					}
					Static211.aClass2_Sub9_Sub3_2.method1560(local15);
				} else {
					Static211.aClass2_Sub9_Sub3_2.method1544();
					Static211.aClass2_Sub9_Sub3_2.method1542();
					Static13.aClass2_Sub14_1 = null;
					Static9.aClass82_1 = null;
					if (Static138.aClass28_139 == null) {
						Static92.anInt1969 = 0;
					} else {
						Static92.anInt1969 = 2;
					}
				}
			}
		} catch (@Pc(59) Exception local59) {
			local59.printStackTrace();
			Static211.aClass2_Sub9_Sub3_2.method1544();
			Static13.aClass2_Sub14_1 = null;
			Static9.aClass82_1 = null;
			Static138.aClass28_139 = null;
			Static92.anInt1969 = 0;
		}
	}
}
