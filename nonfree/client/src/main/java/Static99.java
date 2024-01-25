import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static99 {

	@OriginalMember(owner = "client!dq", name = "r", descriptor = "[Lclient!xa;")
	public static Class66[] aClass66Array2;

	@OriginalMember(owner = "client!dq", name = "e", descriptor = "I")
	public static int anInt2351 = 0;

	@OriginalMember(owner = "client!dq", name = "i", descriptor = "[[I")
	public static final int[][] anIntArrayArray14 = new int[][] { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 1, 3, -1 }, { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 }, { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(IIIIB)V")
	public static void method2129(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg0;
		@Pc(12) int local12 = -arg0;
		@Pc(14) int local14 = -1;
		@Pc(22) int local22 = Static501.method4264(arg0 + arg3, Class179_Sub2.lb, Static376.anInt7071);
		@Pc(35) int local35 = Static501.method4264(arg3 - arg0, Class179_Sub2.lb, Static376.anInt7071);
		Static115.method2332(local35, local22, arg1, Static183.anIntArrayArray26[arg2]);
		while (local9 > local7) {
			local14 += 2;
			local12 += local14;
			@Pc(64) int local64;
			@Pc(68) int local68;
			@Pc(82) int local82;
			@Pc(91) int local91;
			if (local12 > 0) {
				local9--;
				local12 -= local9 << 1;
				local64 = arg2 - local9;
				local68 = local9 + arg2;
				if (Static96.anInt2302 <= local68 && local64 <= Static289.anInt5545) {
					local82 = Static501.method4264(local7 + arg3, Class179_Sub2.lb, Static376.anInt7071);
					local91 = Static501.method4264(arg3 - local7, Class179_Sub2.lb, Static376.anInt7071);
					if (local68 <= Static289.anInt5545) {
						Static115.method2332(local91, local82, arg1, Static183.anIntArrayArray26[local68]);
					}
					if (Static96.anInt2302 <= local64) {
						Static115.method2332(local91, local82, arg1, Static183.anIntArrayArray26[local64]);
					}
				}
			}
			local7++;
			local64 = arg2 - local7;
			local68 = arg2 + local7;
			if (local68 >= Static96.anInt2302 && Static289.anInt5545 >= local64) {
				local82 = Static501.method4264(arg3 + local9, Class179_Sub2.lb, Static376.anInt7071);
				local91 = Static501.method4264(arg3 - local9, Class179_Sub2.lb, Static376.anInt7071);
				if (local68 <= Static289.anInt5545) {
					Static115.method2332(local91, local82, arg1, Static183.anIntArrayArray26[local68]);
				}
				if (local64 >= Static96.anInt2302) {
					Static115.method2332(local91, local82, arg1, Static183.anIntArrayArray26[local64]);
				}
			}
		}
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(ZILjava/lang/String;)V")
	public static void method2135(@OriginalArg(2) String arg0) {
		Static277.method4595("", 4, "", "", 0, arg0);
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(ILjava/lang/String;I[B)I")
	public static int method2140(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(13) int local13 = arg1.length();
		@Pc(15) int local15 = arg0;
		for (@Pc(17) int local17 = 0; local17 < local13; local17++) {
			@Pc(23) char local23 = arg1.charAt(local17);
			if (local23 <= '\u007f') {
				arg2[local15++] = (byte) local23;
			} else if (local23 > '\u07ff') {
				arg2[local15++] = (byte) (local23 >> 12 | 0xE0);
				arg2[local15++] = (byte) (local23 >> 6 & 0x3F | 0x80);
				arg2[local15++] = (byte) (local23 & 0x3F | 0x80);
			} else {
				arg2[local15++] = (byte) (local23 >> 6 | 0xC0);
				arg2[local15++] = (byte) (local23 & 0x3F | 0x80);
			}
		}
		return local15 - arg0;
	}
}
