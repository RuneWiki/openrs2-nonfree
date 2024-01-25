import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static9 {

	@OriginalMember(owner = "client!aj", name = "G", descriptor = "I")
	public static int anInt150;

	@OriginalMember(owner = "client!aj", name = "z", descriptor = "[I")
	public static final int[] anIntArray8 = new int[200];

	@OriginalMember(owner = "client!aj", name = "D", descriptor = "Z")
	public static boolean aBoolean8 = false;

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(Ljava/lang/String;Z)V")
	public static void method112(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (arg0.startsWith("*")) {
			arg0 = arg0.substring(1);
		}
		@Pc(20) String local20 = Static179.method2957(arg0);
		if (local20 == null) {
			return;
		}
		for (@Pc(25) int local25 = 0; local25 < Static107.anInt2161; local25++) {
			@Pc(31) String local31 = Static369.aStringArray44[local25];
			if (local31.startsWith("*")) {
				local31 = local31.substring(1);
			}
			local31 = Static179.method2957(local31);
			if (local31 != null && local31.equals(local20)) {
				Static107.anInt2161--;
				for (@Pc(55) int local55 = local25; local55 < Static107.anInt2161; local55++) {
					Static369.aStringArray44[local55] = Static369.aStringArray44[local55 + 1];
					Static321.aStringArray35[local55] = Static321.aStringArray35[local55 + 1];
					Static99.aStringArray17[local55] = Static99.aStringArray17[local55 + 1];
					Static225.aStringArray57[local55] = Static225.aStringArray57[local55 + 1];
					Static414.aBooleanArray21[local55] = Static414.aBooleanArray21[local55 + 1];
				}
				Static320.anInt5509 = Static193.anInt3856;
				Static310.method4308(Static108.aClass27_43);
				Static337.aClass10_Sub8_Sub2_2.method2458(Static119.method2056(arg0));
				Static337.aClass10_Sub8_Sub2_2.method2465(arg0);
				break;
			}
		}
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "([BIII)Ljava/lang/String;")
	public static String method114(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) char[] local8 = new char[arg1];
		@Pc(10) int local10 = 0;
		@Pc(14) int local14 = arg1 + arg2;
		for (@Pc(21) int local21 = arg2; local21 < local14; local21++) {
			@Pc(29) int local29 = arg0[local21] & 0xFF;
			if (local29 >= 128) {
				if (local29 < 194) {
					throw new IllegalArgumentException("Overlong encoding in UTF-8 encoding " + local29);
				}
				@Pc(66) int local66;
				if (local29 < 224) {
					if (local21 + 1 >= local14) {
						throw new IllegalArgumentException("Incomplete two-byte sequence at end of UTF-8 encoding");
					}
					local21++;
					local66 = arg0[local21] & 0xFF;
					if (local66 < 128 || local66 > 191) {
						throw new IllegalArgumentException("Illegal second byte in two-byte sequence in UTF-8 encoding");
					}
					local8[local10++] = (char) (local66 & 0xFFFFFF7F | (local29 & 0x3FFFF3F) << 6);
				} else if (local29 < 240) {
					if (local21 + 2 >= local14) {
						throw new IllegalArgumentException("Incomplete three-byte sequence at end of UTF-8 encoding");
					}
					local21++;
					local66 = arg0[local21] & 0xFF;
					if (local66 < 128 || local66 > 191) {
						throw new IllegalArgumentException("Illegal second byte in three-byte sequence in UTF-8 encoding");
					}
					local21++;
					@Pc(154) int local154 = arg0[local21] & 0xFF;
					if (local154 < 128 || local154 > 191) {
						throw new IllegalArgumentException("Illegal third byte in three-byte sequence in UTF-8 encoding");
					}
					local8[local10++] = (char) (local154 & 0xFFFFFF7F | (local29 & 0xFFF1F) << 12 | (local66 & 0x3FFFF7F) << 6);
				} else if (local29 < 244) {
					throw new IllegalArgumentException("Unsupported four-byte sequence in UTF-8 encoding");
				} else {
					throw new IllegalArgumentException("Illegal first sequence byte in UTF-8 encoding " + local29);
				}
			} else {
				local8[local10++] = (char) local29;
			}
		}
		return new String(local8, 0, local10);
	}
}
