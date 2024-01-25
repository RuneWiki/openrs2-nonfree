import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static88 {

	@OriginalMember(owner = "client!dk", name = "x", descriptor = "Lclient!db;")
	public static final Class57 aClass57_1 = new Class57(4, 1, 1, 1);

	@OriginalMember(owner = "client!dk", name = "z", descriptor = "Ljava/lang/String;")
	public static String aString19 = null;

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(I)[Lclient!cc;")
	public static Class42[] method1783() {
		return new Class42[] { Static538.aClass42_1, Static538.aClass42_2, Static538.aClass42_3, Static538.aClass42_4, Static538.aClass42_5, Static538.aClass42_6, Static538.aClass42_7, Static538.aClass42_8, Static538.aClass42_9, Static538.aClass42_10, Static538.aClass42_11, Static538.aClass42_12, Static538.aClass42_13, Static538.aClass42_14 };
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(B)I")
	public static int method1786() {
		return Static16.anInt654++;
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(I[FIIIIFIIIFFI)V")
	public static void method1791(@OriginalArg(0) int arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) float arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) float arg9, @OriginalArg(11) float arg10, @OriginalArg(12) int arg11) {
		@Pc(9) int local9 = arg7 - arg6;
		@Pc(13) int local13 = arg4 - arg8;
		@Pc(17) int local17 = arg11 - arg3;
		@Pc(38) float local38 = (float) local17 * arg1[2] + arg1[1] * (float) local9 + arg1[0] * (float) local13;
		@Pc(59) float local59 = arg1[5] * (float) local17 + arg1[3] * (float) local13 + (float) local9 * arg1[4];
		@Pc(80) float local80 = arg1[8] * (float) local17 + (float) local13 * arg1[6] + arg1[7] * (float) local9;
		@Pc(98) float local98;
		@Pc(92) float local92;
		if (arg0 == 0) {
			local92 = arg5 + 0.5F - local80;
			local98 = local38 + arg10 + 0.5F;
		} else if (arg0 == 1) {
			local92 = arg5 + local80 + 0.5F;
			local98 = arg10 + local38 + 0.5F;
		} else if (arg0 == 2) {
			local98 = arg10 + 0.5F - local38;
			local92 = arg9 + 0.5F - local59;
		} else if (arg0 == 3) {
			local92 = arg9 + 0.5F - local59;
			local98 = local38 + arg10 + 0.5F;
		} else if (arg0 == 4) {
			local98 = local80 + arg5 + 0.5F;
			local92 = arg9 + 0.5F - local59;
		} else {
			local92 = arg9 + 0.5F - local59;
			local98 = arg5 + 0.5F - local80;
		}
		@Pc(215) float local215;
		if (arg2 == 1) {
			local215 = local98;
			local98 = -local92;
			local92 = local215;
		} else if (arg2 == 2) {
			local98 = -local98;
			local92 = -local92;
		} else if (arg2 == 3) {
			local215 = local98;
			local98 = local92;
			local92 = -local215;
		}
		Static22.aFloat240 = local92;
		Static75.aFloat256 = local98;
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(Lclient!kp;I)I")
	public static int method1793(@OriginalArg(0) Class167 arg0) {
		if (Static178.aClass167_6 == arg0) {
			return 6407;
		} else if (arg0 == Static468.aClass167_14) {
			return 6408;
		} else if (Static212.aClass167_7 == arg0) {
			return 6406;
		} else if (Static217.aClass167_8 == arg0) {
			return 6409;
		} else if (arg0 == Static521.aClass167_15) {
			return 6410;
		} else if (arg0 == Static447.aClass167_13) {
			return 6145;
		} else {
			throw new IllegalStateException();
		}
	}
}
