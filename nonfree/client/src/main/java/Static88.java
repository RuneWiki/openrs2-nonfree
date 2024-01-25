import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static88 {

	@OriginalMember(owner = "client!fg", name = "L", descriptor = "I")
	public static int anInt1900;

	@OriginalMember(owner = "client!fg", name = "O", descriptor = "Lclient!nc;")
	public static Class133 aClass133_4;

	@OriginalMember(owner = "client!fg", name = "Q", descriptor = "I")
	public static int anInt1903;

	@OriginalMember(owner = "client!fg", name = "T", descriptor = "[Lclient!an;")
	public static Class11[] aClass11Array1;

	@OriginalMember(owner = "client!fg", name = "V", descriptor = "I")
	public static int anInt1906;

	@OriginalMember(owner = "client!fg", name = "N", descriptor = "Lclient!iq;")
	public static final Class93 aClass93_32 = new Class93("slide:", "gleiten:", "glissement:", "deslizamento:");

	@OriginalMember(owner = "client!fg", name = "U", descriptor = "[I")
	public static final int[] anIntArray197 = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 85, 80, 84, 0, 91, 0, 0, 0, 81, 82, 86, 0, 0, 0, 0, 0, 0, 0, 0, 13, 0, 0, 0, 0, 83, 104, 105, 103, 102, 96, 98, 97, 99, 0, 0, 0, 0, 0, 0, 0, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, 0, 0, 0, 0, 0, 0, 0, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, 0, 0, 0, 0, 0, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, 0, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 0, 0, 0, 101, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

	@OriginalMember(owner = "client!fg", name = "b", descriptor = "(III)I")
	public static int method1956(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = arg0 >>> 24;
		@Pc(17) int local17 = 255 - local12;
		@Pc(35) int local35 = (local12 * (arg0 & 0xFF00) & 0xFF0000 | local12 * (arg0 & 0xFF00FF) & 0xFF00FF00) >>> 8;
		return local35 + (((arg1 & 0xFF00) * local17 & 0xFF0000 | local17 * (arg1 & 0xFF00FF) & 0xFF00FF00) >>> 8);
	}

	@OriginalMember(owner = "client!fg", name = "f", descriptor = "(I)V")
	public static void method1958() {
		@Pc(5) Class119 local5 = Static32.aClass119_18;
		synchronized (Static32.aClass119_18) {
			Static32.aClass119_18.method3304();
		}
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(IIIIIB)V")
	public static void method1959(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg3 > Static307.anInt6214 || arg0 < Static228.anInt920) {
			return;
		}
		@Pc(34) boolean local34;
		if (Static124.anInt4221 > arg1) {
			local34 = false;
			arg1 = Static124.anInt4221;
		} else if (Static96.anInt2180 < arg1) {
			arg1 = Static96.anInt2180;
			local34 = false;
		} else {
			local34 = true;
		}
		@Pc(56) boolean local56;
		if (Static124.anInt4221 > arg2) {
			local56 = false;
			arg2 = Static124.anInt4221;
		} else if (Static96.anInt2180 >= arg2) {
			local56 = true;
		} else {
			local56 = false;
			arg2 = Static96.anInt2180;
		}
		if (Static228.anInt920 > arg3) {
			arg3 = Static228.anInt920;
		} else {
			Static205.method3670(arg4, arg2, Static146.anIntArrayArray91[arg3++], arg1);
		}
		if (arg0 <= Static307.anInt6214) {
			Static205.method3670(arg4, arg2, Static146.anIntArrayArray91[arg0--], arg1);
		} else {
			arg0 = Static307.anInt6214;
		}
		@Pc(106) int local106;
		if (local34 && local56) {
			for (local106 = arg3; local106 <= arg0; local106++) {
				@Pc(112) int[] local112 = Static146.anIntArrayArray91[local106];
				local112[arg1] = local112[arg2] = arg4;
			}
		} else if (local34) {
			for (local106 = arg3; local106 <= arg0; local106++) {
				Static146.anIntArrayArray91[local106][arg1] = arg4;
			}
		} else if (local56) {
			for (local106 = arg3; local106 <= arg0; local106++) {
				Static146.anIntArrayArray91[local106][arg2] = arg4;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(IBLclient!qr;I)V")
	public static void method1960(@OriginalArg(0) int arg0, @OriginalArg(2) Class62_Sub1_Sub2_Sub2 arg1, @OriginalArg(3) int arg2) {
		if (arg1.anInt5322 == arg2 && arg2 != -1) {
			@Pc(14) Class107 local14 = Static212.method3773(arg2);
			@Pc(17) int local17 = local14.anInt3273;
			if (local17 == 1) {
				arg1.anInt5349 = 0;
				arg1.anInt5341 = 0;
				arg1.anInt5337 = 1;
				arg1.anInt5305 = 0;
				arg1.anInt5345 = arg0;
				Static343.method5928(Static41.aClass62_Sub1_Sub2_Sub2_2 == arg1, local14, arg1.anInt5289, arg1.anInt5305, arg1.anInt5280);
			}
			if (local17 == 2) {
				arg1.anInt5349 = 0;
			}
		} else if (arg2 == -1 || arg1.anInt5322 == -1 || Static212.method3773(arg2).anInt3287 >= Static212.method3773(arg1.anInt5322).anInt3287) {
			arg1.anInt5367 = arg1.anInt5372;
			arg1.anInt5349 = 0;
			arg1.anInt5305 = 0;
			arg1.anInt5345 = arg0;
			arg1.anInt5322 = arg2;
			arg1.anInt5341 = 0;
			arg1.anInt5337 = 1;
			if (arg1.anInt5322 != -1) {
				Static343.method5928(Static41.aClass62_Sub1_Sub2_Sub2_2 == arg1, Static212.method3773(arg1.anInt5322), arg1.anInt5289, arg1.anInt5305, arg1.anInt5280);
			}
		}
	}
}
