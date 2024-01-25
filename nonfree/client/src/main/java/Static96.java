import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static96 {

	@OriginalMember(owner = "client!dfa", name = "w", descriptor = "[B")
	public static final byte[] aByteArray33 = new byte[] { 31, -117, 8, 0, 0, 0, 0, 0, 0, 0, -5, 127, -29, -1, 109, 6, 103, 6, 14, 54, 54, 118, 54, 86, 14, 118, 118, 118, 78, 78, 14, 46, 30, 17, 94, 30, 110, 110, 30, 73, 33, 97, 126, 17, 89, 41, 121, 57, 89, 41, 25, 25, 5, 21, 61, 117, 5, 37, 29, 101, 25, 25, 13, 115, 77, 29, 3, 67, 19, 19, 19, 121, 117, 75, 91, 11, 35, 27, 61, 99, 19, 35, -112, 33, -116, -100, -100, -100, 60, -36, 60, 18, -68, -68, 18, 70, -118, 50, -118, 70, 36, -125, -1, 7, 24, 68, 56, 24, 24, 25, 24, 89, 24, -107, 24, -104, 4, 25, -103, 5, 25, 89, -108, 24, -2, 31, 97, -112, 103, 96, 96, 100, 101, 4, 3, 6, 40, 96, 100, 98, 102, 97, 101, 99, -25, -32, -28, -30, 6, 42, -40, 42, -64, -64, -60, -56, -52, -52, -60, -62, -52, -54, -54, -62, 2, -108, -83, 5, -54, 51, -80, 8, -78, 10, 41, 26, 58, -78, 9, 7, 38, -78, 43, 21, -118, 24, 53, 78, 92, -56, -95, -20, -76, -15, -96, 104, -48, -59, 15, 42, -58, 73, 69, 77, -100, 92, 98, -30, 18, -110, 82, -86, 106, -22, 26, -102, 90, 38, -90, 102, -26, 22, -106, 86, -50, 46, -82, 110, -18, 30, -98, 94, -63, 33, -95, 97, -31, 17, -111, 81, -55, 41, -87, 105, -23, 25, -103, 89, -59, 37, -91, 101, -27, 21, -107, 85, -51, 45, -83, 109, -19, 29, -99, 93, -109, 38, 79, -103, 58, 109, -6, -116, -103, -77, 22, 45, 94, -78, 116, -39, -14, 21, 43, 87, 109, -38, -68, 101, -21, -74, -19, 59, 118, -18, 58, 116, -8, -56, -47, 99, -57, 79, -100, 60, 117, -23, -14, -107, -85, -41, -82, -33, -72, 121, -21, -31, -93, -57, 79, -98, 62, 123, -2, -30, -27, -85, -113, -97, 62, 127, -7, -6, -19, -5, -113, -97, -65, 64, -2, 98, 100, 96, 102, -124, 1, -84, -2, 18, 4, -6, -117, -119, -123, -123, -103, -123, 29, -28, 47, 70, -90, 114, -112, 2, 65, 22, 86, 69, 67, 54, 33, -57, 64, -10, -60, 66, 97, 37, -93, 70, 14, 17, -89, -119, 11, 55, 30, -28, 84, 54, 14, -6, 32, -102, 84, 116, -111, 75, 76, -59, -28, -95, -22, 71, -112, -41, -64, 62, 35, -50, 99, 77, 100, -7, 12, -18, 49, -124, -65, 110, 49, -16, -79, 48, 2, -29, 15, -24, 78, 6, 6, 123, -122, -97, -1, -70, 52, 22, -16, -49, 127, -79, -88, -21, -1, 77, 0, 38, 27, -28, 10, 110, 2, 0, 0 };

	@OriginalMember(owner = "client!dfa", name = "A", descriptor = "[I")
	public static final int[] anIntArray133 = new int[50];

	@OriginalMember(owner = "client!dfa", name = "R", descriptor = "Lclient!tca;")
	public static final Class325 aClass325_2 = new Class325();

	@OriginalMember(owner = "client!dfa", name = "U", descriptor = "I")
	public static int anInt2724 = 1;

	@OriginalMember(owner = "client!dfa", name = "a", descriptor = "(IBLclient!ha;)V")
	public static void method2561(@OriginalArg(0) int arg0, @OriginalArg(2) Class20 arg1) {
		if (!Static62.aBoolean167 || !Static219.aBoolean366) {
			Static534.anInt9664 = 0;
			return;
		}
		if (Static567.aBoolean697) {
			Static497.aLong227 = Static386.aClass158_1.method6230();
		}
		Static241.anInt5214 = 0;
		Static361.anInt7190 = 0;
		Static216.anInt4874 = 0;
		@Pc(27) int[] local27 = arg1.Y();
		Static360.anInt7140 = (int) ((float) local27[3] / 3.0F);
		Static390.anInt7498 = (int) ((float) local27[2] / 3.0F);
		arg1.method7235(Static68.anIntArray99);
		if (Static640.anInt11044 != (int) ((float) Static68.anIntArray99[0] / 3.0F) || (int) ((float) Static68.anIntArray99[1] / 3.0F) != Static319.anInt6494) {
			Static319.anInt6494 = (int) ((float) Static68.anIntArray99[1] / 3.0F);
			Static640.anInt11044 = (int) ((float) Static68.anIntArray99[0] / 3.0F);
			Static559.anInt10083 = Static319.anInt6494 >> 1;
			Static204.anIntArray648 = new int[Static319.anInt6494 * Static640.anInt11044];
			Static288.anInt6151 = Static640.anInt11044 >> 1;
		}
		Static216.aClass30_7 = arg1.method7243();
		Static534.anInt9664 = 0;
		for (@Pc(104) int local104 = 0; local104 < Static145.anInt3525; local104++) {
			Static608.method8916(Static395.aClass82Array3[local104], arg1, arg0);
		}
		for (@Pc(130) int local130 = 0; local130 < Static288.anInt6150; local130++) {
			Static608.method8916(Static320.aClass82Array2[local130], arg1, arg0);
		}
		for (@Pc(149) int local149 = 0; local149 < Static617.anInt10803; local149++) {
			Static608.method8916(Static618.aClass82Array4[local149], arg1, arg0);
		}
		Static513.anInt9411 = 0;
		if (Static534.anInt9664 > 0) {
			@Pc(169) int local169 = Static204.anIntArray648.length;
			@Pc(176) int local176 = local169 - local169 & 0x7;
			@Pc(178) int local178 = 0;
			while (local176 > local178) {
				Static204.anIntArray648[local178++] = Integer.MAX_VALUE;
				Static204.anIntArray648[local178++] = Integer.MAX_VALUE;
				Static204.anIntArray648[local178++] = Integer.MAX_VALUE;
				Static204.anIntArray648[local178++] = Integer.MAX_VALUE;
				Static204.anIntArray648[local178++] = Integer.MAX_VALUE;
				Static204.anIntArray648[local178++] = Integer.MAX_VALUE;
				Static204.anIntArray648[local178++] = Integer.MAX_VALUE;
				Static204.anIntArray648[local178++] = Integer.MAX_VALUE;
			}
			while (local178 < local169) {
				Static204.anIntArray648[local178++] = Integer.MAX_VALUE;
			}
			Static126.anInt3222 = 1;
			for (@Pc(245) int local245 = 0; local245 < Static534.anInt9664; local245++) {
				@Pc(251) Class82 local251 = Static266.aClass82Array1[local245];
				Static597.method8779(local251.aShortArray33[3], local251.aShortArray31[0], local251.aShortArray33[1], local251.aShortArray32[3], local251.aShortArray32[1], local251.aShortArray31[1], local251.aShortArray32[0], local251.aShortArray33[0], local251.aShortArray31[3]);
				Static597.method8779(local251.aShortArray33[3], local251.aShortArray31[1], local251.aShortArray33[2], local251.aShortArray32[3], local251.aShortArray32[2], local251.aShortArray31[2], local251.aShortArray32[1], local251.aShortArray33[1], local251.aShortArray31[3]);
			}
			Static126.anInt3222 = 2;
		}
		if (Static567.aBoolean697) {
			Static544.aLong244 = Static386.aClass158_1.method6230() - Static497.aLong227;
		}
	}

	@OriginalMember(owner = "client!dfa", name = "a", descriptor = "(ILclient!wm;)V")
	public static void method2563(@OriginalArg(1) Class2_Sub52 arg0) {
		Static399.aClass341_45.method8528(arg0);
		arg0.anInt11005 = arg0.aClass2_Sub11_Sub2_7.anInt10066;
		arg0.aClass2_Sub11_Sub2_7.anInt10066 = 0;
		Static36.anInt788 += arg0.anInt11005;
	}

	@OriginalMember(owner = "client!dfa", name = "b", descriptor = "(III)V")
	public static void method2564(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static143.method7504(arg1, arg0);
	}
}
