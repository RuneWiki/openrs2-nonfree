import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static92 {

	@OriginalMember(owner = "client!em", name = "o", descriptor = "I")
	public static int anInt2058;

	@OriginalMember(owner = "client!em", name = "g", descriptor = "Lclient!gw;")
	public static final Class91 aClass91_12 = new Class91();

	@OriginalMember(owner = "client!em", name = "n", descriptor = "Lclient!tf;")
	public static Class240 aClass240_8 = null;

	@OriginalMember(owner = "client!em", name = "s", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray2 = new boolean[][] { new boolean[4], new boolean[4], { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, new boolean[4], new boolean[4], new boolean[4], new boolean[4] };

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(IIIII)V")
	public static void method1817(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(7) int local7 = 0; local7 < Static171.anInt3372; local7++) {
			@Pc(18) Rectangle local18 = Class267.aRectangleArray2[local7];
			if (arg2 < local18.x + local18.width && local18.x < arg1 + arg2 && local18.y + local18.height > arg3 && arg0 + arg3 > local18.y) {
				Static237.aBooleanArray88[local7] = true;
			}
		}
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(II)Lclient!tf;")
	public static Class240 method1820(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = arg0 >> 16;
		@Pc(11) int local11 = arg0 & 0xFFFF;
		if (Static122.aClass240ArrayArray2[local7] == null || Static122.aClass240ArrayArray2[local7][local11] == null) {
			@Pc(30) boolean local30 = Static104.method1974(local7);
			if (!local30) {
				return null;
			}
		}
		return Static122.aClass240ArrayArray2[local7][local11];
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(IIZIIII)V")
	public static void method1821(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		for (@Pc(13) Class71_Sub2 local13 = (Class71_Sub2) Static412.aClass273_5.method6246(); local13 != null; local13 = (Class71_Sub2) Static412.aClass273_5.method6249()) {
			if (local13.anInt2583 <= Static277.anInt2834) {
				local13.method6187();
			} else {
				Static4.method55(arg0 >> 1, local13.anInt2573 * 2, arg2 >> 1, local13.anInt2574, (local13.anInt2571 << 7) + 64, (local13.anInt2579 << 7) + 64);
				Static247.aClass18_2.method5772(local13.anInt2582 | 0xFF000000, arg3 + Static402.anIntArray573[0], arg1 + Static402.anIntArray573[1], local13.aString18, 0);
			}
		}
	}
}
