import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static87 {

	@OriginalMember(owner = "client!da", name = "d", descriptor = "I")
	public static int anInt9501;

	@OriginalMember(owner = "client!da", name = "w", descriptor = "I")
	public static final int anInt9495 = 52;

	@OriginalMember(owner = "client!da", name = "v", descriptor = "Ljava/lang/String;")
	public static String aString114 = "";

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(I[I[Ljava/lang/Object;)V")
	public static void method8282(@OriginalArg(1) int[] arg0, @OriginalArg(2) Object[] arg1) {
		Static338.method5212(arg0.length - 1, arg0, arg1, 0);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "([BIBI)Ljava/lang/String;")
	public static String method8292(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) char[] local8 = new char[arg1];
		@Pc(10) int local10 = 0;
		@Pc(12) int local12 = arg2;
		@Pc(16) int local16 = arg1 + arg2;
		while (local12 < local16) {
			@Pc(29) int local29 = arg0[local12++] & 0xFF;
			@Pc(41) int local41;
			if (local29 < 128) {
				if (local29 == 0) {
					local41 = 65533;
				} else {
					local41 = local29;
				}
			} else if (local29 < 192) {
				local41 = 65533;
			} else if (local29 < 224) {
				if (local12 < local16 && (arg0[local12] & 0xC0) == 128) {
					local41 = (local29 & 0x1F) << 6 | arg0[local12++] & 0x3F;
					if (local41 < 128) {
						local41 = 65533;
					}
				} else {
					local41 = 65533;
				}
			} else if (local29 < 240) {
				if (local16 > local12 + 1 && (arg0[local12] & 0xC0) == 128 && (arg0[local12 + 1] & 0xC0) == 128) {
					local41 = (arg0[local12++] & 0x3F) << 6 | (local29 & 0xF) << 12 | arg0[local12++] & 0x3F;
					if (local41 < 2048) {
						local41 = 65533;
					}
				} else {
					local41 = 65533;
				}
			} else if (local29 >= 248) {
				local41 = 65533;
			} else if (local12 + 2 < local16 && (arg0[local12] & 0xC0) == 128 && (arg0[local12 + 1] & 0xC0) == 128 && (arg0[local12 + 2] & 0xC0) == 128) {
				local41 = (local29 & 0x7) << 18 | (arg0[local12++] & 0x3F) << 12 | (arg0[local12++] & 0x3F) << 6 | arg0[local12++] & 0x3F;
				if (local41 >= 65536 && local41 <= 1114111) {
					local41 = 65533;
				} else {
					local41 = 65533;
				}
			} else {
				local41 = 65533;
			}
			local8[local10++] = (char) local41;
		}
		return new String(local8, 0, local10);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IZ)Z")
	public static boolean method8298(@OriginalArg(0) int arg0) {
		return arg0 >= 4 && arg0 <= 8;
	}
}
