import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static83 {

	@OriginalMember(owner = "client!db", name = "c", descriptor = "[Lclient!ko;")
	public static Class12_Sub1_Sub1_Sub1[] aClass12_Sub1_Sub1_Sub1Array1;

	@OriginalMember(owner = "client!db", name = "i", descriptor = "I")
	public static int anInt1434;

	@OriginalMember(owner = "client!db", name = "m", descriptor = "Ljava/lang/Object;")
	public static Object anObject4;

	@OriginalMember(owner = "client!db", name = "n", descriptor = "I")
	public static int anInt1438 = 0;

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(I)Lclient!kp;")
	public static Class197 method1254() {
		return Static28.method375();
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(BC)B")
	public static byte method1256(@OriginalArg(1) char arg0) {
		@Pc(28) byte local28;
		if (arg0 > '\u0000' && arg0 < '\u0080' || !(arg0 < ' ' || arg0 > 'ÿ')) {
			local28 = (byte) arg0;
		} else if (arg0 == '€') {
			local28 = -128;
		} else if (arg0 == '‚') {
			local28 = -126;
		} else if (arg0 == 'ƒ') {
			local28 = -125;
		} else if (arg0 == '„') {
			local28 = -124;
		} else if (arg0 == '…') {
			local28 = -123;
		} else if (arg0 == '†') {
			local28 = -122;
		} else if (arg0 == '‡') {
			local28 = -121;
		} else if (arg0 == 'ˆ') {
			local28 = -120;
		} else if (arg0 == '‰') {
			local28 = -119;
		} else if (arg0 == 'Š') {
			local28 = -118;
		} else if (arg0 == '‹') {
			local28 = -117;
		} else if (arg0 == 'Œ') {
			local28 = -116;
		} else if (arg0 == 'Ž') {
			local28 = -114;
		} else if (arg0 == '‘') {
			local28 = -111;
		} else if (arg0 == '’') {
			local28 = -110;
		} else if (arg0 == '“') {
			local28 = -109;
		} else if (arg0 == '”') {
			local28 = -108;
		} else if (arg0 == '•') {
			local28 = -107;
		} else if (arg0 == '–') {
			local28 = -106;
		} else if (arg0 == '—') {
			local28 = -105;
		} else if (arg0 == '˜') {
			local28 = -104;
		} else if (arg0 == '™') {
			local28 = -103;
		} else if (arg0 == 'š') {
			local28 = -102;
		} else if (arg0 == '›') {
			local28 = -101;
		} else if (arg0 == 'œ') {
			local28 = -100;
		} else if (arg0 == 'ž') {
			local28 = -98;
		} else if (arg0 == 'Ÿ') {
			local28 = -97;
		} else {
			local28 = 63;
		}
		return local28;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(Lclient!ha;III[Z)V")
	public static void method1257(@OriginalArg(0) Class2_Sub2_Sub8 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		if (Static114.aClass151Array1 == Static320.aClass151Array3) {
			return;
		}
		@Pc(10) int local10 = Static261.aClass151Array2[arg1].method7680(arg2, arg3);
		for (@Pc(12) int local12 = 0; local12 <= arg1; local12++) {
			if (arg4 == null || arg4[local12]) {
				@Pc(23) Class151 local23 = Static261.aClass151Array2[local12];
				if (local23 != null) {
					local23.DA(arg0, arg2, local10 - local23.method7680(arg2, arg3), arg3, 0, false);
				}
			}
		}
	}
}
