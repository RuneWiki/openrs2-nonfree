import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static97 {

	@OriginalMember(owner = "client!ek", name = "b", descriptor = "F")
	public static float aFloat17;

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(IIIII)V")
	public static void method1503(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static2.aClass148_Sub1_1.anInt3778 != 0 && arg3 != 0 && Static208.anInt3488 < 50 && arg2 != -1) {
			Static147.aClass64Array1[Static208.anInt3488++] = new Class64((byte) 1, arg2, arg3, arg1, arg0, 0);
		}
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(I)V")
	public static void method1504() {
		if (Static216.anIntArray305 != null) {
			return;
		}
		Static216.anIntArray305 = new int[65536];
		@Pc(25) double local25 = Math.random() * 0.03D + 0.7D - 0.015D;
		@Pc(27) int local27 = 0;
		for (@Pc(29) int local29 = 0; local29 < 512; local29++) {
			@Pc(43) float local43 = ((float) (local29 >> 3) / 64.0F + 0.0078125F) * 360.0F;
			@Pc(52) float local52 = (float) (local29 & 0x7) / 8.0F + 0.0625F;
			for (@Pc(54) int local54 = 0; local54 < 128; local54++) {
				@Pc(61) float local61 = (float) local54 / 128.0F;
				@Pc(63) float local63 = 0.0F;
				@Pc(65) float local65 = 0.0F;
				@Pc(67) float local67 = 0.0F;
				@Pc(71) float local71 = local43 / 60.0F;
				@Pc(74) int local74 = (int) local71;
				@Pc(78) int local78 = local74 % 6;
				@Pc(84) float local84 = (float) -local74 + local71;
				@Pc(91) float local91 = local61 * (1.0F - local52);
				@Pc(100) float local100 = local61 * (1.0F - local52 * local84);
				@Pc(112) float local112 = (1.0F - local52 * (1.0F - local84)) * local61;
				if (local78 == 0) {
					local63 = local61;
					local65 = local112;
					local67 = local91;
				} else if (local78 == 1) {
					local67 = local91;
					local65 = local61;
					local63 = local100;
				} else if (local78 == 2) {
					local67 = local112;
					local63 = local91;
					local65 = local61;
				} else if (local78 == 3) {
					local63 = local91;
					local65 = local100;
					local67 = local61;
				} else if (local78 == 4) {
					local63 = local112;
					local65 = local91;
					local67 = local61;
				} else if (local78 == 5) {
					local63 = local61;
					local65 = local91;
					local67 = local100;
				}
				local63 = (float) Math.pow((double) local63, local25);
				local65 = (float) Math.pow((double) local65, local25);
				local67 = (float) Math.pow((double) local67, local25);
				@Pc(211) int local211 = (int) (local63 * 256.0F);
				@Pc(216) int local216 = (int) (local65 * 256.0F);
				@Pc(221) int local221 = (int) (local67 * 256.0F);
				@Pc(233) int local233 = local221 + (local216 << 8) + (local211 << 16) - 16777216;
				Static216.anIntArray305[local27++] = local233;
			}
		}
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(IIB)V")
	public static void method1505(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) Class2_Sub5_Sub11 local13 = Static316.method4316(15, 0);
		local13.method3098();
		local13.anInt3911 = arg0;
		local13.anInt3916 = arg1;
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "([FII)[F")
	public static float[] method1506(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1) {
		@Pc(11) float[] local11 = new float[arg1];
		Static464.method1966(arg0, 0, local11, 0, arg1);
		return local11;
	}
}
