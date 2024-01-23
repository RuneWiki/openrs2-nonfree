import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static9 {

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "I")
	public static int anInt85 = -1;

	@OriginalMember(owner = "client!ah", name = "f", descriptor = "J")
	public static volatile long aLong4 = 0L;

	@OriginalMember(owner = "client!ah", name = "g", descriptor = "Ljava/lang/String;")
	public static String aString8 = "flash1:";

	@OriginalMember(owner = "client!ah", name = "h", descriptor = "Ljava/lang/String;")
	public static String aString9 = "Connected to update server";

	@OriginalMember(owner = "client!ah", name = "i", descriptor = "Ljava/lang/String;")
	public static String aString10 = "Hidden";

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(Lclient!tk;IBIZ)V")
	public static void method77(@OriginalArg(0) Class159 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		@Pc(4) int local4 = arg0.anInt5121;
		@Pc(7) int local7 = arg0.anInt5123;
		if (arg0.aByte18 == 0) {
			arg0.anInt5123 = arg0.anInt5145;
		} else if (arg0.aByte18 == 1) {
			arg0.anInt5123 = arg2 - arg0.anInt5145;
		} else if (arg0.aByte18 == 2) {
			arg0.anInt5123 = arg0.anInt5145 * arg2 >> 14;
		} else if (arg0.aByte18 == 3) {
			if (arg0.anInt5197 == 2) {
				arg0.anInt5123 = arg0.anInt5149 * (arg0.anInt5145 - 1) + arg0.anInt5145 * 32;
			} else if (arg0.anInt5197 == 7) {
				arg0.anInt5123 = arg0.anInt5145 * 115 + (arg0.anInt5145 - 1) * arg0.anInt5149;
			}
		}
		if (arg0.aByte16 == 0) {
			arg0.anInt5121 = arg0.anInt5156;
		} else if (arg0.aByte16 == 1) {
			arg0.anInt5121 = arg1 - arg0.anInt5156;
		} else if (arg0.aByte16 == 2) {
			arg0.anInt5121 = arg0.anInt5156 * arg1 >> 14;
		} else if (arg0.aByte16 == 3) {
			if (arg0.anInt5197 == 2) {
				arg0.anInt5121 = arg0.anInt5156 * 32 + arg0.anInt5179 * (arg0.anInt5156 - 1);
			} else if (arg0.anInt5197 == 7) {
				arg0.anInt5121 = arg0.anInt5156 * 12 + arg0.anInt5179 * (arg0.anInt5156 - 1);
			}
		}
		if (arg0.aByte18 == 4) {
			arg0.anInt5123 = arg0.anInt5174 * arg0.anInt5121 / arg0.anInt5161;
		}
		if (arg0.aByte16 == 4) {
			arg0.anInt5121 = arg0.anInt5123 * arg0.anInt5161 / arg0.anInt5174;
		}
		if (Static104.aBoolean169 && (Static42.method668(arg0).anInt4411 != 0 || arg0.anInt5197 == 0)) {
			if (arg0.anInt5121 < 5 && arg0.anInt5123 < 5) {
				arg0.anInt5123 = 5;
				arg0.anInt5121 = 5;
			} else {
				if (arg0.anInt5123 <= 0) {
					arg0.anInt5123 = 5;
				}
				if (arg0.anInt5121 <= 0) {
					arg0.anInt5121 = 5;
				}
			}
		}
		if (arg0.anInt5188 == 1337) {
			Static224.aClass159_16 = arg0;
		}
		if (arg3 && arg0.anObjectArray21 != null && (arg0.anInt5123 != local7 || local4 != arg0.anInt5121)) {
			@Pc(303) Class8_Sub14 local303 = new Class8_Sub14();
			local303.aClass159_10 = arg0;
			local303.anObjectArray1 = arg0.anObjectArray21;
			Static180.aClass182_22.method4328(local303);
		}
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(I)Ljava/lang/String;")
	public static String method78() {
		@Pc(5) String local5 = "www";
		if (Static147.anInt2995 != 0) {
			local5 = "www-wtqa";
		}
		@Pc(14) String local14 = "";
		if (Static73.aString61 != null) {
			local14 = "/p=" + Static73.aString61;
		}
		return "http://" + local5 + ".runescape.com/l=" + Static184.anInt3648 + "/a=" + Static270.anInt5329 + local14 + "/";
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(B[B)Lclient!cm;")
	public static Class8_Sub1_Sub5 method79(@OriginalArg(1) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		@Pc(25) Class8_Sub1_Sub5 local25;
		if (Static116.aBoolean188) {
			local25 = new Class8_Sub1_Sub5_Sub1(arg0, Static25.anIntArray45, Static225.anIntArray345, Static92.anIntArray130, Static135.anIntArray225, Static232.aByteArrayArray15);
		} else {
			local25 = new Class8_Sub1_Sub5_Sub2(arg0, Static25.anIntArray45, Static225.anIntArray345, Static92.anIntArray130, Static135.anIntArray225, Static232.aByteArrayArray15);
		}
		Static147.method2386();
		return local25;
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;")
	public static String method80(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		@Pc(8) int local8 = arg2.length();
		@Pc(11) int local11 = arg1.length();
		@Pc(14) int local14 = arg0.length();
		if (local11 == 0) {
			throw new IllegalArgumentException("Key cannot have zero length");
		}
		@Pc(35) int local35 = local8;
		@Pc(39) int local39 = local14 - local11;
		if (local39 != 0) {
			@Pc(46) int local46 = 0;
			while (true) {
				local46 = arg2.indexOf(arg1, local46);
				if (local46 < 0) {
					break;
				}
				local46 += local11;
				local35 += local39;
			}
		}
		@Pc(70) int local70 = 0;
		@Pc(75) StringBuffer local75 = new StringBuffer(local35);
		while (true) {
			@Pc(80) int local80 = arg2.indexOf(arg1, local70);
			if (local80 < 0) {
				local75.append(arg2.substring(local70));
				return local75.toString();
			}
			local75.append(arg2.substring(local70, local80));
			local75.append(arg0);
			local70 = local80 + local11;
		}
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(IB)V")
	public static void method81(@OriginalArg(0) int arg0) {
		Static144.anIntArray233 = new int[arg0];
		Static255.anIntArray391 = new int[arg0];
		Static172.anIntArray260 = new int[arg0];
		Static41.anIntArray62 = new int[arg0];
		Static119.anIntArray194 = new int[arg0];
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(III[[III)I")
	public static int method82(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[][] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(31) int local31 = (128 - arg1) * arg2[arg0][arg4] + arg1 * arg2[arg0 + 1][arg4] >> 7;
		@Pc(58) int local58 = arg1 * arg2[arg0 + 1][arg4 + 1] + (128 - arg1) * arg2[arg0][arg4 + 1] >> 7;
		return arg3 * local58 + local31 * (128 - arg3) >> 7;
	}
}
