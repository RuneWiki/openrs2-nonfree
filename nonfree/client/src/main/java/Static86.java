import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static86 {

	@OriginalMember(owner = "client!ei", name = "j", descriptor = "[I")
	public static int[] anIntArray372;

	@OriginalMember(owner = "client!ei", name = "m", descriptor = "Lclient!dq;")
	public static Class58 aClass58_10;

	@OriginalMember(owner = "client!ei", name = "n", descriptor = "I")
	public static int anInt4394;

	@OriginalMember(owner = "client!ei", name = "o", descriptor = "F")
	public static float aFloat66;

	@OriginalMember(owner = "client!ei", name = "d", descriptor = "[Lclient!rs;")
	public static final Class220[] aClass220Array4 = new Class220[30];

	@OriginalMember(owner = "client!ei", name = "g", descriptor = "I")
	public static final int anInt4390 = 1401;

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "()V")
	public static void method3567() {
		@Pc(3) int local3;
		@Pc(6) int local6;
		@Pc(9) int local9;
		if (Static195.aClass106ArrayArrayArray2 != null) {
			for (local3 = 0; local3 < Static195.aClass106ArrayArrayArray2.length; local3++) {
				for (local6 = 0; local6 < Static42.anInt4340; local6++) {
					for (local9 = 0; local9 < Static386.anInt6463; local9++) {
						if (Static195.aClass106ArrayArrayArray2[local3][local6][local9] != null) {
							Static195.aClass106ArrayArrayArray2[local3][local6][local9].method2412();
						}
						Static195.aClass106ArrayArrayArray2[local3][local6][local9] = null;
					}
				}
			}
		}
		Static195.aClass106ArrayArrayArray2 = null;
		Static263.aClass64Array2 = null;
		if (Static79.aClass106ArrayArrayArray1 != null) {
			for (local3 = 0; local3 < Static79.aClass106ArrayArrayArray1.length; local3++) {
				for (local6 = 0; local6 < Static42.anInt4340; local6++) {
					for (local9 = 0; local9 < Static386.anInt6463; local9++) {
						if (Static79.aClass106ArrayArrayArray1[local3][local6][local9] != null) {
							Static79.aClass106ArrayArrayArray1[local3][local6][local9].method2412();
						}
						Static79.aClass106ArrayArrayArray1[local3][local6][local9] = null;
					}
				}
			}
		}
		Static79.aClass106ArrayArrayArray1 = null;
		Static440.aClass64Array3 = null;
		Static440.aClass106ArrayArrayArray3 = null;
		Static58.aClass64Array1 = null;
		Static358.anInt6072 = 0;
		if (Static143.aClass210Array1 != null) {
			for (local3 = 0; local3 < Static358.anInt6072; local3++) {
				Static143.aClass210Array1[local3] = null;
			}
		}
		if (Static96.aClass3_Sub2Array2 != null) {
			for (local3 = 0; local3 < Static177.anInt3468; local3++) {
				Static96.aClass3_Sub2Array2[local3] = null;
			}
			Static177.anInt3468 = 0;
		}
		if (Static140.aClass170Array1 != null) {
			for (local3 = 0; local3 < Static48.anInt963; local3++) {
				Static140.aClass170Array1[local3] = null;
			}
			for (local6 = 0; local6 < Static254.anInt4782; local6++) {
				for (local9 = 0; local9 < Static42.anInt4340; local9++) {
					for (@Pc(160) int local160 = 0; local160 < Static386.anInt6463; local160++) {
						Static351.aLongArrayArrayArray2[local6][local9][local160] = 0L;
					}
				}
			}
			Static48.anInt963 = 0;
		}
		Static386.anIntArrayArrayArray12 = null;
		Static208.method3299();
		Static222.aClass112_8.method2549();
		Static360.aByteArrayArray56 = null;
		Static225.anIntArrayArray41 = null;
		Static74.aByteArrayArray12 = null;
		Static260.aClass37_1 = null;
		Static284.aClass35_5 = null;
		Static332.aClass49_10 = null;
	}

	@OriginalMember(owner = "client!ei", name = "j", descriptor = "(I)V")
	public static void method3568() {
		for (@Pc(3) int local3 = 0; local3 < Static121.anInt2701; local3++) {
			@Pc(9) int local9 = Static1.anIntArray67[local3];
			@Pc(13) Class3_Sub2_Sub1_Sub1 local13 = Static174.aClass3_Sub2_Sub1_Sub1Array1[local9];
			@Pc(17) int local17 = Static438.aClass2_Sub23_Sub2_2.method5495();
			if ((local17 & 0x10) != 0) {
				local17 += Static438.aClass2_Sub23_Sub2_2.method5495() << 8;
			}
			@Pc(40) int local40;
			@Pc(44) int local44;
			if ((local17 & 0x40) != 0) {
				local40 = Static438.aClass2_Sub23_Sub2_2.method5479();
				local44 = Static438.aClass2_Sub23_Sub2_2.method5495();
				local13.method4934(local40, local44, Static131.anInt2821);
			}
			if ((local17 & 0x200) != 0) {
				local13.anInt6175 = Static438.aClass2_Sub23_Sub2_2.method5471();
				local13.anInt6173 = Static438.aClass2_Sub23_Sub2_2.method5511();
				local13.anInt6189 = Static438.aClass2_Sub23_Sub2_2.method5484();
				local13.anInt6179 = Static438.aClass2_Sub23_Sub2_2.method5511();
				local13.anInt6181 = Static438.aClass2_Sub23_Sub2_2.method5493() + Static131.anInt2821;
				local13.anInt6183 = Static438.aClass2_Sub23_Sub2_2.method5460() + Static131.anInt2821;
				local13.anInt6131 = Static438.aClass2_Sub23_Sub2_2.method5495();
				local13.anInt6204 = 0;
				local13.anInt6179 += local13.anIntArray524[0];
				local13.anInt6206 = 1;
				local13.anInt6189 += local13.anIntArray525[0];
				local13.anInt6175 += local13.anIntArray525[0];
				local13.anInt6173 += local13.anIntArray524[0];
			}
			if ((local17 & 0x400) != 0) {
				local40 = Static438.aClass2_Sub23_Sub2_2.method5464();
				@Pc(151) int[] local151 = new int[local40];
				@Pc(154) int[] local154 = new int[local40];
				@Pc(157) int[] local157 = new int[local40];
				for (@Pc(159) int local159 = 0; local159 < local40; local159++) {
					@Pc(165) int local165 = Static438.aClass2_Sub23_Sub2_2.method5492();
					if (local165 == 65535) {
						local165 = -1;
					}
					local151[local159] = local165;
					local154[local159] = Static438.aClass2_Sub23_Sub2_2.method5499();
					local157[local159] = Static438.aClass2_Sub23_Sub2_2.method5493();
				}
				Static197.method3096(local154, local157, local13, local151);
			}
			if ((local17 & 0x4) != 0) {
				if (local13.aClass65_1.method1707()) {
					Static417.method5540(local13);
				}
				local13.method1426(Static219.aClass76_2.method1888(Static438.aClass2_Sub23_Sub2_2.method5460()));
				local13.method4929(local13.aClass65_1.anInt2128);
				local13.anInt6138 = local13.aClass65_1.anInt2139 << 3;
				if (local13.aClass65_1.method1707()) {
					Static54.method894(local13.anIntArray525[0], null, local13.anIntArray524[0], 0, null, local13.aByte89, local13);
				}
			}
			if ((local17 & 0x2) != 0) {
				local40 = Static438.aClass2_Sub23_Sub2_2.method5479();
				local44 = Static438.aClass2_Sub23_Sub2_2.method5495();
				local13.method4934(local40, local44, Static131.anInt2821);
				local13.anInt6156 = Static131.anInt2821 + 300;
				local13.anInt6174 = Static438.aClass2_Sub23_Sub2_2.method5499();
			}
			if ((local17 & 0x100) != 0) {
				local40 = Static438.aClass2_Sub23_Sub2_2.method5500();
				local13.anInt6142 = Static438.aClass2_Sub23_Sub2_2.method5464();
				local13.anInt6141 = Static438.aClass2_Sub23_Sub2_2.method5452();
				local13.anInt6145 = local40 & 0x7FFF;
				local13.aBoolean426 = (local40 & 0x8000) != 0;
				local13.anInt6140 = Static131.anInt2821 + local13.anInt6145 + local13.anInt6142;
			}
			@Pc(366) int local366;
			if ((local17 & 0x20) != 0) {
				local40 = Static438.aClass2_Sub23_Sub2_2.method5492();
				local44 = Static438.aClass2_Sub23_Sub2_2.method5505();
				if (local40 == 65535) {
					local40 = -1;
				}
				local366 = Static438.aClass2_Sub23_Sub2_2.method5495();
				local13.method4924(local366, false, local40, local44);
			}
			if ((local17 & 0x8) != 0) {
				local13.anInt6167 = Static438.aClass2_Sub23_Sub2_2.method5493();
				if (local13.anInt6167 == 65535) {
					local13.anInt6167 = -1;
				}
			}
			if ((local17 & 0x1) != 0) {
				local13.aString54 = Static438.aClass2_Sub23_Sub2_2.method5494();
				local13.anInt6151 = 100;
			}
			if ((local17 & 0x1000) != 0) {
				local13.anInt1720 = Static438.aClass2_Sub23_Sub2_2.method5493();
				local13.anInt1733 = Static438.aClass2_Sub23_Sub2_2.method5492();
			}
			if ((local17 & 0x800) != 0) {
				local40 = Static438.aClass2_Sub23_Sub2_2.method5500();
				local44 = Static438.aClass2_Sub23_Sub2_2.method5472();
				if (local40 == 65535) {
					local40 = -1;
				}
				local366 = Static438.aClass2_Sub23_Sub2_2.method5452();
				local13.method4924(local366, true, local40, local44);
			}
			if ((local17 & 0x2000) != 0) {
				local13.lb = Static438.aClass2_Sub23_Sub2_2.method5484();
				local13.aByte91 = Static438.aClass2_Sub23_Sub2_2.method5484();
				local13.aByte90 = Static438.aClass2_Sub23_Sub2_2.method5511();
				local13.aByte92 = (byte) Static438.aClass2_Sub23_Sub2_2.method5499();
				local13.anInt6148 = Static131.anInt2821 + Static438.aClass2_Sub23_Sub2_2.method5492();
				local13.anInt6132 = Static131.anInt2821 + Static438.aClass2_Sub23_Sub2_2.method5460();
			}
			if ((local17 & 0x80) != 0) {
				local40 = Static438.aClass2_Sub23_Sub2_2.method5500();
				if (local40 == 65535) {
					local40 = -1;
				}
				local44 = Static438.aClass2_Sub23_Sub2_2.method5464();
				Static182.method2924(local13, local44, local40);
			}
		}
	}
}
