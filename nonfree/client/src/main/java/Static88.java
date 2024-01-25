import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static88 {

	@OriginalMember(owner = "client!dea", name = "v", descriptor = "I")
	public static final int anInt2180 = 50;

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "[I")
	public static final int[] anIntArray154 = new int[anInt2180];

	@OriginalMember(owner = "client!dea", name = "d", descriptor = "[I")
	public static final int[] anIntArray156 = new int[anInt2180];

	@OriginalMember(owner = "client!dea", name = "f", descriptor = "[I")
	public static final int[] anIntArray157 = new int[anInt2180];

	@OriginalMember(owner = "client!dea", name = "j", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray10 = new String[anInt2180];

	@OriginalMember(owner = "client!dea", name = "k", descriptor = "Lclient!gs;")
	public static final Class123 aClass123_2 = new Class123("WTQA", 2);

	@OriginalMember(owner = "client!dea", name = "o", descriptor = "[I")
	public static final int[] anIntArray159 = new int[4096];

	@OriginalMember(owner = "client!dea", name = "w", descriptor = "[I")
	public static final int[] anIntArray160 = new int[anInt2180];

	@OriginalMember(owner = "client!dea", name = "y", descriptor = "[I")
	public static final int[] anIntArray161 = new int[anInt2180];

	@OriginalMember(owner = "client!dea", name = "C", descriptor = "[I")
	public static final int[] anIntArray162 = new int[anInt2180];

	@OriginalMember(owner = "client!dea", name = "D", descriptor = "Lclient!fv;")
	public static final Class112 aClass112_5 = new Class112(8, 0, 4, 1);

	@OriginalMember(owner = "client!dea", name = "E", descriptor = "Lclient!dj;")
	public static final Class71 aClass71_1 = new Class71();

	@OriginalMember(owner = "client!dea", name = "F", descriptor = "Lclient!kfa;")
	public static final Class181 aClass181_22 = new Class181(25, -1);

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "(III)I")
	public static int method1970(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(42) int local42 = Static142.method2656(4, arg1 + 45365, arg0 + 91923) + (Static142.method2656(2, arg1 + 10294, arg0 + 37821) - 128 >> 1) + (Static142.method2656(1, arg1, arg0) - 128 >> 2) - 128;
		local42 = (int) ((double) local42 * 0.3D) + 35;
		if (local42 < 10) {
			local42 = 10;
		} else if (local42 > 60) {
			local42 = 60;
		}
		return local42;
	}

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "(IIILclient!wm;)V")
	public static void method1971(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class348 arg2) {
		Static192.aClass348ArrayArray1[arg1][arg0] = arg2;
	}

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "(Lclient!fu;Z)Z")
	public static boolean method1973(@OriginalArg(0) Class11_Sub1 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(6) boolean local6 = Static47.aClass62Array1 == Static369.aClass62Array3;
		@Pc(8) int local8 = 0;
		@Pc(10) short local10 = 0;
		@Pc(12) byte local12 = 0;
		arg0.method6201();
		if (arg0.aShort78 < 0 || arg0.aShort80 < 0 || arg0.aShort79 >= Static396.anInt7505 || arg0.aShort77 >= Static54.anInt1441) {
			return false;
		}
		@Pc(33) short local33 = 0;
		@Pc(40) int local40;
		for (@Pc(36) int local36 = arg0.aShort78; local36 <= arg0.aShort79; local36++) {
			for (local40 = arg0.aShort80; local40 <= arg0.aShort77; local40++) {
				@Pc(47) Class224 local47 = Static178.method3530(arg0.aByte77, local36, local40);
				if (local47 != null) {
					@Pc(51) int local51 = 0;
					if (local36 > arg0.aShort78) {
						local51++;
					}
					if (local36 < arg0.aShort79) {
						local51 += 4;
					}
					if (local40 > arg0.aShort80) {
						local51 += 8;
					}
					if (local40 < arg0.aShort77) {
						local51 += 2;
					}
					@Pc(76) Class270 local76 = Static48.method6733(arg0, local51);
					@Pc(79) Class270 local79 = local47.aClass270_1;
					if (local79 == null) {
						local47.aClass270_1 = local76;
					} else {
						while (local79.aClass270_2 != null) {
							local79 = local79.aClass270_2;
						}
						local79.aClass270_2 = local76;
					}
					local47.aByte66 = (byte) (local47.aByte66 | local51);
					if (local6 && (Static448.anIntArrayArray53[local36][local40] & 0xFF000000) != 0) {
						local8 = Static448.anIntArrayArray53[local36][local40];
						local10 = Static571.aShortArrayArray11[local36][local40];
						local12 = Static270.aByteArrayArray18[local36][local40];
					}
					if (local47.aClass11_Sub5_2 != null && local47.aClass11_Sub5_2.aShort126 > local33) {
						local33 = local47.aClass11_Sub5_2.aShort126;
					}
				}
			}
		}
		if (local6 && (local8 & 0xFF000000) != 0) {
			for (local40 = arg0.aShort78; local40 <= arg0.aShort79; local40++) {
				for (@Pc(164) int local164 = arg0.aShort80; local164 <= arg0.aShort77; local164++) {
					if ((Static448.anIntArrayArray53[local40][local164] & 0xFF000000) == 0) {
						Static448.anIntArrayArray53[local40][local164] = local8;
						Static571.aShortArrayArray11[local40][local164] = local10;
						Static270.aByteArrayArray18[local40][local164] = local12;
					}
				}
			}
		}
		if (arg1) {
			Static374.aClass11_Sub1Array1[Static209.anInt4411++] = arg0;
		}
		if (arg1) {
			arg0.anInt7350 -= local33;
		}
		return true;
	}

	@OriginalMember(owner = "client!dea", name = "c", descriptor = "(B)V")
	public static void method1976() {
		if (Static414.aClass246_5.aBoolean534 && Static552.aClass275_4.anInt7968 != -1) {
			Static87.method1963(Static552.aClass275_4.aString100, Static552.aClass275_4.anInt7968);
		}
	}
}
