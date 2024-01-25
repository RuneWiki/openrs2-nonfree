import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static95 {

	@OriginalMember(owner = "client!ep", name = "l", descriptor = "[Lclient!sv;")
	public static Class11_Sub5[] aClass11_Sub5Array1;

	@OriginalMember(owner = "client!ep", name = "j", descriptor = "Z")
	public static boolean aBoolean148 = false;

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(IZ)I")
	public static int method1836(@OriginalArg(0) int arg0) {
		@Pc(13) int local13 = arg0 * (arg0 * arg0 >> 12) >> 12;
		@Pc(19) int local19 = arg0 * 6 - 61440;
		@Pc(32) int local32 = (local19 * arg0 >> 12) + 40960;
		return local13 * local32 >> 12;
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "([BZII)Ljava/lang/String;")
	public static String method1837(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) char[] local8 = new char[arg2];
		@Pc(10) int local10 = 0;
		@Pc(14) int local14 = arg1 + arg2;
		for (@Pc(16) int local16 = arg1; local16 < local14; local16++) {
			@Pc(29) int local29 = arg0[local16] & 0xFF;
			if (local29 >= 128) {
				if (local29 < 194) {
					throw new IllegalArgumentException("Overlong encoding in UTF-8 encoding " + local29);
				}
				@Pc(96) int local96;
				if (local29 >= 224) {
					if (local29 >= 240) {
						if (local29 >= 244) {
							throw new IllegalArgumentException("Illegal first sequence byte in UTF-8 encoding " + local29);
						}
						throw new IllegalArgumentException("Unsupported four-byte sequence in UTF-8 encoding");
					}
					if (local16 + 2 >= local14) {
						throw new IllegalArgumentException("Incomplete three-byte sequence at end of UTF-8 encoding");
					}
					local16++;
					local96 = arg0[local16] & 0xFF;
					if (local96 < 128 || local96 > 191) {
						throw new IllegalArgumentException("Illegal second byte in three-byte sequence in UTF-8 encoding");
					}
					local16++;
					@Pc(114) int local114 = arg0[local16] & 0xFF;
					if (local114 < 128 || local114 > 191) {
						throw new IllegalArgumentException("Illegal third byte in three-byte sequence in UTF-8 encoding");
					}
					local8[local10++] = (char) (local114 & 0xFFFFFF7F | (local29 & 0xFFFFFF1F) << 12 | (local96 & 0xFFFFFF7F) << 6);
				} else if (local14 > local16 + 1) {
					local16++;
					local96 = arg0[local16] & 0xFF;
					if (local96 < 128 || local96 > 191) {
						throw new IllegalArgumentException("Illegal second byte in two-byte sequence in UTF-8 encoding");
					}
					local8[local10++] = (char) (local96 & 0xFFFFFF7F | (local29 & 0x3FFFF3F) << 6);
				} else {
					throw new IllegalArgumentException("Incomplete two-byte sequence at end of UTF-8 encoding");
				}
			} else {
				local8[local10++] = (char) local29;
			}
		}
		return new String(local8, 0, local10);
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(Z)V")
	public static void method1839() {
		Static35.method519(false);
		if (Static254.anInt4915 >= 0 && Static254.anInt4915 != 0) {
			Static391.method5496(Static254.anInt4915);
			Static254.anInt4915 = -1;
		}
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(I)V")
	public static void method1840() {
		Static304.anInt5641 = 0;
		@Pc(12) int local12 = (Static52.aClass11_Sub5_Sub2_Sub1_2.anInt7514 >> 7) + Static426.anInt7325;
		@Pc(20) int local20 = (Static52.aClass11_Sub5_Sub2_Sub1_2.anInt7515 >> 7) + Static72.anInt1776;
		if (local12 >= 3053 && local12 <= 3156 && local20 >= 3056 && local20 <= 3136) {
			Static304.anInt5641 = 1;
		}
		if (local12 >= 3072 && local12 <= 3118 && local20 >= 9492 && local20 <= 9535) {
			Static304.anInt5641 = 1;
		}
		if (Static304.anInt5641 == 1 && local12 >= 3139 && local12 <= 3199 && local20 >= 3008 && local20 <= 3062) {
			Static304.anInt5641 = 0;
		}
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(BI)I")
	public static int method1841(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(BII[Ljava/lang/Object;[J)V")
	public static void method1842(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Object[] arg2, @OriginalArg(4) long[] arg3) {
		if (arg1 <= arg0) {
			return;
		}
		@Pc(14) int local14 = (arg1 + arg0) / 2;
		@Pc(16) int local16 = arg0;
		@Pc(20) long local20 = arg3[local14];
		arg3[local14] = arg3[arg1];
		arg3[arg1] = local20;
		@Pc(34) Object local34 = arg2[local14];
		arg2[local14] = arg2[arg1];
		arg2[arg1] = local34;
		@Pc(52) int local52 = local20 == Long.MAX_VALUE ? 0 : 1;
		for (@Pc(54) int local54 = arg0; local54 < arg1; local54++) {
			if (arg3[local54] < (long) (local54 & local52) + local20) {
				@Pc(75) long local75 = arg3[local54];
				arg3[local54] = arg3[local16];
				arg3[local16] = local75;
				@Pc(89) Object local89 = arg2[local54];
				arg2[local54] = arg2[local16];
				arg2[local16++] = local89;
			}
		}
		arg3[arg1] = arg3[local16];
		arg3[local16] = local20;
		arg2[arg1] = arg2[local16];
		arg2[local16] = local34;
		method1842(arg0, local16 - 1, arg2, arg3);
		method1842(local16 + 1, arg1, arg2, arg3);
	}
}
