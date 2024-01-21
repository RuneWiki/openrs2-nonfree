import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static9 {

	@OriginalMember(owner = "client!bb", name = "f", descriptor = "Lclient!rd;")
	public static Class64 aClass64_11;

	@OriginalMember(owner = "client!bb", name = "g", descriptor = "I")
	public static int anInt313;

	@OriginalMember(owner = "client!bb", name = "h", descriptor = "Ljava/awt/Canvas;")
	public static Canvas aCanvas1;

	@OriginalMember(owner = "client!bb", name = "k", descriptor = "I")
	public static int anInt314;

	@OriginalMember(owner = "client!bb", name = "m", descriptor = "I")
	public static int anInt315;

	@OriginalMember(owner = "client!bb", name = "w", descriptor = "J")
	public static long aLong10;

	@OriginalMember(owner = "client!bb", name = "b", descriptor = "I")
	public static int anInt310 = 0;

	@OriginalMember(owner = "client!bb", name = "d", descriptor = "Lclient!ad;")
	private static Class4 aClass4_158 = Static75.method1216("Invalid username or password)3");

	@OriginalMember(owner = "client!bb", name = "j", descriptor = "Lclient!ad;")
	private static Class4 aClass4_159 = Static75.method1216("Connecting to server)3)3)3");

	@OriginalMember(owner = "client!bb", name = "r", descriptor = "Lclient!ad;")
	private static Class4 aClass4_162 = Static75.method1216("Choose Option");

	@OriginalMember(owner = "client!bb", name = "l", descriptor = "Lclient!ad;")
	public static Class4 aClass4_160 = aClass4_162;

	@OriginalMember(owner = "client!bb", name = "n", descriptor = "[Lclient!ad;")
	public static Class4[] aClass4Array1 = new Class4[100];

	@OriginalMember(owner = "client!bb", name = "o", descriptor = "Lclient!ad;")
	private static Class4 aClass4_161 = Static75.method1216("Use");

	@OriginalMember(owner = "client!bb", name = "q", descriptor = "I")
	public static int anInt317 = 0;

	@OriginalMember(owner = "client!bb", name = "u", descriptor = "Lclient!ad;")
	public static Class4 aClass4_163 = aClass4_161;

	@OriginalMember(owner = "client!bb", name = "A", descriptor = "Lclient!ad;")
	public static Class4 aClass4_164 = aClass4_159;

	@OriginalMember(owner = "client!bb", name = "B", descriptor = "Lclient!ad;")
	public static Class4 aClass4_165 = aClass4_158;

	@OriginalMember(owner = "client!bb", name = "C", descriptor = "Lclient!ad;")
	public static Class4 aClass4_166 = Static75.method1216("Ihr Charakter)2Profil wird in:");

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(IIII[Lclient!jd;Lclient!qa;IIII[B)V")
	public static void method194(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class40[] arg4, @OriginalArg(5) Class61 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(10) byte[] arg9) {
		@Pc(18) Class3_Sub4 local18 = new Class3_Sub4(arg9);
		@Pc(20) int local20 = -1;
		while (true) {
			@Pc(24) int local24 = local18.method444();
			if (local24 == 0) {
				return;
			}
			@Pc(28) int local28 = 0;
			local20 += local24;
			while (true) {
				@Pc(36) int local36 = local18.method444();
				if (local36 == 0) {
					break;
				}
				local28 += local36 - 1;
				@Pc(51) int local51 = local28 & 0x3F;
				@Pc(57) int local57 = local28 >> 6 & 0x3F;
				@Pc(61) int local61 = local28 >> 12;
				@Pc(65) int local65 = local18.method446();
				@Pc(69) int local69 = local65 >> 2;
				@Pc(73) int local73 = local65 & 0x3;
				if (arg3 == local61 && arg6 <= local57 && local57 < arg6 + 8 && arg2 <= local51 && arg2 + 8 > local51) {
					@Pc(100) Class3_Sub1_Sub5 local100 = Static38.method1911(local20);
					@Pc(117) int local117 = Static64.method1089(local100.anInt1543, local57 & 0x7, local51 & 0x7, local100.anInt1548, local73, arg1) + arg0;
					@Pc(134) int local134 = Static103.method1693(arg1, local100.anInt1548, local73, local51 & 0x7, local57 & 0x7, local100.anInt1543) + arg8;
					if (local117 > 0 && local134 > 0 && local117 < 103 && local134 < 103) {
						@Pc(156) int local156 = arg7;
						if ((Static11.aByteArrayArrayArray55[1][local117][local134] & 0x2) == 2) {
							local156 = arg7 - 1;
						}
						@Pc(172) Class40 local172 = null;
						if (local156 >= 0) {
							local172 = arg4[local156];
						}
						Static89.method1398(local20, local117, arg5, arg7, local172, arg1 + local73 & 0x3, local69, local134);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(I)V")
	public static void method196() {
		aClass4_160 = null;
		aClass4_159 = null;
		aCanvas1 = null;
		aClass4_166 = null;
		aClass4_163 = null;
		aClass4Array1 = null;
		aClass4_158 = null;
		aClass4_161 = null;
		aClass4_164 = null;
		aClass64_11 = null;
		aClass4_162 = null;
		aClass4_165 = null;
	}

	@OriginalMember(owner = "client!bb", name = "b", descriptor = "(I)V")
	public static void method200() {
		Static25.method494(false, null, 0);
	}
}
