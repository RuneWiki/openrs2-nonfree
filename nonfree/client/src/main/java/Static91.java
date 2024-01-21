import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static91 {

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "J")
	public static long aLong64;

	@OriginalMember(owner = "client!jc", name = "f", descriptor = "Lclient!jj;")
	public static Class53 aClass53_2;

	@OriginalMember(owner = "client!jc", name = "j", descriptor = "Lclient!wc;")
	public static Class1_Sub2_Sub8_Sub5 aClass1_Sub2_Sub8_Sub5_21;

	@OriginalMember(owner = "client!jc", name = "l", descriptor = "I")
	public static int anInt2110;

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "Ljava/util/Random;")
	public static final Random aRandom1 = new Random();

	@OriginalMember(owner = "client!jc", name = "g", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_627 = Static81.method1507(" <col=00ff80>");

	@OriginalMember(owner = "client!jc", name = "i", descriptor = "Lclient!s;")
	public static final Class87 aClass87_15 = new Class87();

	@OriginalMember(owner = "client!jc", name = "k", descriptor = "[[I")
	public static final int[][] anIntArrayArray14 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

	@OriginalMember(owner = "client!jc", name = "m", descriptor = "I")
	public static int anInt2111 = 0;

	@OriginalMember(owner = "client!jc", name = "n", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_628 = Static81.method1507("sl_button");

	@OriginalMember(owner = "client!jc", name = "o", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_629 = Static81.method1507("<col=ff3000>");

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "(I)[Lclient!le;")
	public static Class1_Sub2_Sub8_Sub2[] method1651() {
		@Pc(6) Class1_Sub2_Sub8_Sub2[] local6 = new Class1_Sub2_Sub8_Sub2[Static96.anInt2211];
		for (@Pc(8) int local8 = 0; local8 < Static96.anInt2211; local8++) {
			@Pc(13) Class1_Sub2_Sub8_Sub2 local13 = new Class1_Sub2_Sub8_Sub2();
			local13.anInt2564 = Static83.anInt2001;
			local13.anInt2560 = Static201.anInt4511;
			local13.anInt2561 = Static80.anIntArray164[local8];
			local13.anInt2559 = Static35.anIntArray360[local8];
			local13.anInt2563 = Static85.anIntArray288[local8];
			local13.anInt2562 = Static153.anIntArray291[local8];
			local13.anIntArray202 = Static148.anIntArray279;
			local13.aByteArray24 = Static53.aByteArrayArray5[local8];
			local6[local8] = local13;
		}
		Static110.method1908();
		return local6;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(B[B)V")
	public static void method1652(@OriginalArg(1) byte[] arg0) {
		@Pc(5) int local5 = 0;
		while (true) {
			while (local5 < arg0.length) {
				@Pc(18) int local18 = (arg0[local5++] & 0xFF) * 64 - Static174.anInt3876;
				@Pc(29) int local29 = (arg0[local5++] & 0xFF) * 64 - Static122.anInt2713;
				@Pc(73) byte local73;
				@Pc(53) int local53;
				if (local18 > 0 && local29 > 0 && local18 + 64 < Static146.anInt3124 && local29 + 64 < Static189.anInt4212) {
					local53 = local18 >> 6;
					@Pc(62) int local62 = Static189.anInt4212 - local29 - 1 >> 6;
					for (@Pc(64) int local64 = 0; local64 < 64; local64++) {
						for (@Pc(67) int local67 = -64; local67 < 0; local67++) {
							local73 = arg0[local5++];
							if (local73 != 0) {
								if (Static199.aByteArrayArrayArray6[local53][local62] == null) {
									Static199.aByteArrayArrayArray6[local53][local62] = new byte[4096];
								}
								Static199.aByteArrayArrayArray6[local53][local62][local64 + (-(local67 + 1) << 6)] = local73;
								@Pc(108) byte local108 = arg0[local5++];
								if (Static27.aByteArrayArrayArray2[local53][local62] == null) {
									Static27.aByteArrayArrayArray2[local53][local62] = new byte[4096];
								}
								Static27.aByteArrayArrayArray2[local53][local62][(-(local67 + 1) << 6) + local64] = local108;
							}
						}
					}
				} else {
					for (local53 = -4096; local53 < 0; local53++) {
						local73 = arg0[local5++];
						if (local73 != 0) {
							local5++;
						}
					}
				}
			}
			return;
		}
	}
}
