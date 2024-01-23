import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static99 {

	@OriginalMember(owner = "client!hg", name = "N", descriptor = "I")
	public static int anInt2104;

	@OriginalMember(owner = "client!hg", name = "Q", descriptor = "Lclient!od;")
	public static Class4_Sub2_Sub15 aClass4_Sub2_Sub15_2;

	@OriginalMember(owner = "client!hg", name = "H", descriptor = "[Lclient!qd;")
	public static Class137[] aClass137Array1 = new Class137[29];

	@OriginalMember(owner = "client!hg", name = "O", descriptor = "Lclient!dh;")
	public static Class33 aClass33_15 = new Class33(4);

	@OriginalMember(owner = "client!hg", name = "h", descriptor = "(I)V")
	public static void method1609() {
		aClass4_Sub2_Sub15_2 = null;
		aClass33_15 = null;
		aClass137Array1 = null;
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(IJ)V")
	public static void method1610(@OriginalArg(1) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		for (@Pc(19) int local19 = 0; local19 < Static297.anInt5497; local19++) {
			if (Static126.aLongArray6[local19] == arg0) {
				Static297.anInt5497--;
				for (@Pc(43) int local43 = local19; local43 < Static297.anInt5497; local43++) {
					Static126.aLongArray6[local43] = Static126.aLongArray6[local43 + 1];
					Static112.aStringArray18[local43] = Static112.aStringArray18[local43 + 1];
					Static272.aBooleanArray25[local43] = Static272.aBooleanArray25[local43 + 1];
				}
				Static233.anInt4542 = Static177.anInt3485;
				Static142.aClass4_Sub17_Sub1_3.method1905(247);
				Static142.aClass4_Sub17_Sub1_3.method1891(arg0);
				break;
			}
		}
	}

	@OriginalMember(owner = "client!hg", name = "i", descriptor = "(I)V")
	public static void method1611() {
		Static247.aClass33_35.method843();
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(IIII)I")
	public static int method1612(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if ((Static46.aByteArrayArrayArray2[arg1][arg0][arg2] & 0x8) == 0) {
			return arg1 <= 0 || (Static46.aByteArrayArrayArray2[1][arg0][arg2] & 0x2) == 0 ? arg1 : arg1 - 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!hg", name = "b", descriptor = "(B)V")
	public static void method1613() {
		if (Static277.anInt5177 == 5) {
			Static277.anInt5177 = 6;
		}
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(IIILclient!lc;)[Lclient!bi;")
	public static Class4_Sub2_Sub1[] method1614(@OriginalArg(0) int arg0, @OriginalArg(3) Class98 arg1) {
		return Static292.method4344(arg0, 0, arg1) ? Static289.method4305() : null;
	}
}
