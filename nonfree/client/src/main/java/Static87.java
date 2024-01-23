import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static87 {

	@OriginalMember(owner = "client!ii", name = "fb", descriptor = "[Z")
	public static boolean[] aBooleanArray13;

	@OriginalMember(owner = "client!ii", name = "W", descriptor = "J")
	public static long aLong61 = 0L;

	@OriginalMember(owner = "client!ii", name = "bb", descriptor = "I")
	public static int anInt2031 = -1;

	@OriginalMember(owner = "client!ii", name = "lb", descriptor = "[I")
	public static int[] anIntArray238 = new int[100];

	@OriginalMember(owner = "client!ii", name = "g", descriptor = "(I)V")
	public static void method1512() {
		Static16.aClass1_Sub9_Sub1_1.method948();
		@Pc(11) int local11 = Static16.aClass1_Sub9_Sub1_1.method949(1);
		if (local11 == 0) {
			return;
		}
		@Pc(22) int local22 = Static16.aClass1_Sub9_Sub1_1.method949(2);
		if (local22 == 0) {
			Static180.anIntArray502[Static192.anInt4121++] = 2047;
			return;
		}
		@Pc(43) int local43;
		@Pc(53) int local53;
		if (local22 == 1) {
			local43 = Static16.aClass1_Sub9_Sub1_1.method949(3);
			Static84.aClass9_Sub4_Sub1_2.method2904(false, local43);
			local53 = Static16.aClass1_Sub9_Sub1_1.method949(1);
			if (local53 == 1) {
				Static180.anIntArray502[Static192.anInt4121++] = 2047;
			}
			return;
		}
		@Pc(93) int local93;
		if (local22 == 2) {
			local43 = Static16.aClass1_Sub9_Sub1_1.method949(3);
			Static84.aClass9_Sub4_Sub1_2.method2904(true, local43);
			local53 = Static16.aClass1_Sub9_Sub1_1.method949(3);
			Static84.aClass9_Sub4_Sub1_2.method2904(true, local53);
			local93 = Static16.aClass1_Sub9_Sub1_1.method949(1);
			if (local93 == 1) {
				Static180.anIntArray502[Static192.anInt4121++] = 2047;
			}
		} else if (local22 == 3) {
			local43 = Static16.aClass1_Sub9_Sub1_1.method949(1);
			Static180.anInt3841 = Static16.aClass1_Sub9_Sub1_1.method949(2);
			local53 = Static16.aClass1_Sub9_Sub1_1.method949(1);
			if (local53 == 1) {
				Static180.anIntArray502[Static192.anInt4121++] = 2047;
			}
			local93 = Static16.aClass1_Sub9_Sub1_1.method949(7);
			@Pc(148) int local148 = Static16.aClass1_Sub9_Sub1_1.method949(7);
			Static84.aClass9_Sub4_Sub1_2.method2909(local148, local93, local43 == 1);
		}
	}

	@OriginalMember(owner = "client!ii", name = "h", descriptor = "(I)V")
	public static void method1513() {
		if (Static82.aDouble2 < Static8.aDouble1) {
			Static82.aDouble2 += Static82.aDouble2 / 30.0D;
			if (Static8.aDouble1 < Static82.aDouble2) {
				Static82.aDouble2 = Static8.aDouble1;
			}
			Static129.method898();
		} else if (Static8.aDouble1 < Static82.aDouble2) {
			Static82.aDouble2 -= Static82.aDouble2 / 30.0D;
			if (Static82.aDouble2 < Static8.aDouble1) {
				Static82.aDouble2 = Static8.aDouble1;
			}
			Static129.method898();
		}
		if (Static32.anInt816 == -1 || Static188.anInt4036 == -1) {
			return;
		}
		@Pc(53) int local53 = Static32.anInt816 - Static138.anInt3087;
		if (local53 < 2 || local53 > 2) {
			local53 >>= 0x4;
		}
		Static138.anInt3087 += local53;
		@Pc(76) int local76 = Static188.anInt4036 - Static1.anInt42;
		if (local76 < 2 || local76 > 2) {
			local76 >>= 0x4;
		}
		if (local53 == 0 && local76 == 0) {
			Static32.anInt816 = -1;
			Static188.anInt4036 = -1;
		}
		Static1.anInt42 += local76;
		Static129.method898();
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIILclient!ai;)Z")
	public static boolean method1515(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class7 arg2) {
		@Pc(9) byte[] local9 = arg2.method3242(arg1, arg0);
		if (local9 == null) {
			return false;
		} else {
			Static177.method2835(local9);
			return true;
		}
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lclient!ai;I)V")
	public static void method1516(@OriginalArg(0) Class7 arg0) {
		Static31.aClass7_9 = arg0;
	}
}
