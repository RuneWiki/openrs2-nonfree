import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static88 {

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "Lclient!rp;")
	public static Class21 aClass21_1;

	@OriginalMember(owner = "client!fc", name = "c", descriptor = "Lclient!is;")
	public static Class111 aClass111_2;

	@OriginalMember(owner = "client!fc", name = "e", descriptor = "Lclient!tc;")
	public static Class221 aClass221_1;

	@OriginalMember(owner = "client!fc", name = "g", descriptor = "I")
	public static int anInt1684;

	@OriginalMember(owner = "client!fc", name = "h", descriptor = "[Z")
	public static boolean[] aBooleanArray13;

	@OriginalMember(owner = "client!fc", name = "f", descriptor = "[Z")
	public static final boolean[] aBooleanArray12 = new boolean[5];

	@OriginalMember(owner = "client!fc", name = "i", descriptor = "I")
	public static int anInt1685 = 0;

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(ZI)[B")
	public static synchronized byte[] method1655(@OriginalArg(1) int arg0) {
		@Pc(19) byte[] local19;
		if (arg0 == 100 && Static90.anInt1732 > 0) {
			local19 = Static292.aByteArrayArray14[--Static90.anInt1732];
			Static292.aByteArrayArray14[Static90.anInt1732] = null;
			return local19;
		} else if (arg0 == 5000 && Static28.anInt608 > 0) {
			local19 = Static67.aByteArrayArray3[--Static28.anInt608];
			Static67.aByteArrayArray3[Static28.anInt608] = null;
			return local19;
		} else if (arg0 == 30000 && Static371.anInt6282 > 0) {
			local19 = Static140.aByteArrayArray4[--Static371.anInt6282];
			Static140.aByteArrayArray4[Static371.anInt6282] = null;
			return local19;
		} else {
			return new byte[arg0];
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(B)V")
	public static void method1656() {
		@Pc(6) int local6 = Static389.aByteArrayArray22.length;
		for (@Pc(13) int local13 = 0; local13 < local6; local13++) {
			if (Static389.aByteArrayArray22[local13] != null) {
				@Pc(20) int local20 = -1;
				for (@Pc(22) int local22 = 0; local22 < Static200.anInt3687; local22++) {
					if (Static61.anIntArray262[local22] == Static68.anIntArray284[local13]) {
						local20 = local22;
						break;
					}
				}
				if (local20 == -1) {
					Static61.anIntArray262[Static200.anInt3687] = Static68.anIntArray284[local13];
					local20 = Static200.anInt3687++;
				}
				@Pc(64) Class2_Sub16 local64 = new Class2_Sub16(Static389.aByteArrayArray22[local13]);
				@Pc(66) int local66 = 0;
				while (local64.anInt6145 < Static389.aByteArrayArray22[local13].length && local66 < 511 && Static171.anInt3311 < 1023) {
					@Pc(81) int local81 = local20 | local66++ << 6;
					@Pc(85) int local85 = local64.method5312();
					@Pc(89) int local89 = local85 >> 14;
					@Pc(95) int local95 = local85 >> 7 & 0x3F;
					@Pc(99) int local99 = local85 & 0x3F;
					@Pc(113) int local113 = (Static68.anIntArray284[local13] >> 8) * 64 + local95 - Static28.anInt606;
					@Pc(126) int local126 = local99 + (Static68.anIntArray284[local13] & 0xFF) * 64 - Static319.anInt5425;
					@Pc(133) Class133 local133 = Static356.aClass48_2.method951(local64.method5312());
					if (Static299.aClass1_Sub5_Sub1_Sub2Array1[local81] == null && (local133.aByte36 & 0x1) > 0 && local89 == Static130.anInt2658 && local113 >= 0 && Static246.anInt4374 > local133.anInt3332 + local113 && local126 >= 0 && Static185.anInt3485 > local133.anInt3332 + local126) {
						Static299.aClass1_Sub5_Sub1_Sub2Array1[local81] = new Class1_Sub5_Sub1_Sub2();
						Static299.aClass1_Sub5_Sub1_Sub2Array1[local81].anInt6413 = local81;
						@Pc(189) Class1_Sub5_Sub1_Sub2 local189 = Static299.aClass1_Sub5_Sub1_Sub2Array1[local81];
						Static143.anIntArray583[Static171.anInt3311++] = local81;
						local189.anInt6422 = Static253.anInt4469;
						local189.method5566(local133);
						local189.method5544(local189.aClass133_1.anInt3332);
						local189.anInt6435 = local189.aClass133_1.anInt3347 << 3;
						if (local189.anInt6435 == 0) {
							local189.method5542(0);
						} else {
							local189.method5542(local189.aClass133_1.aByte38 + 4 << 11 & 0x3A85);
						}
						local189.method5559(local189.method5547(), local126, local113, local89, true);
					}
				}
			}
		}
	}
}
