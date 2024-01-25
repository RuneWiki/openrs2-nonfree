import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static94 {

	@OriginalMember(owner = "client!dh", name = "b", descriptor = "I")
	public static int anInt2525;

	@OriginalMember(owner = "client!dh", name = "c", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray11;

	@OriginalMember(owner = "client!dh", name = "k", descriptor = "[I")
	public static int[] anIntArray96;

	@OriginalMember(owner = "client!dh", name = "g", descriptor = "Z")
	public static boolean aBoolean204 = false;

	@OriginalMember(owner = "client!dh", name = "i", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger1 = new BigInteger("10001", 16);

	@OriginalMember(owner = "client!dh", name = "j", descriptor = "I")
	public static int anInt2529 = 0;

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(B)Z")
	public static boolean method2466() {
		@Pc(9) Hashtable local9 = new Hashtable();
		@Pc(12) Enumeration local12 = Static595.aHashtable12.keys();
		while (local12.hasMoreElements()) {
			@Pc(22) Object local22 = local12.nextElement();
			local9.put(local22, Static595.aHashtable12.get(local22));
		}
		try {
			@Pc(35) Class local35 = Class.forName("java.lang.reflect.AccessibleObject");
			@Pc(38) Class local38 = Class.forName("java.lang.ClassLoader");
			@Pc(42) Field local42 = local38.getDeclaredField("nativeLibraries");
			@Pc(52) Method local52 = local35.getDeclaredMethod("setAccessible", Boolean.TYPE);
			local52.invoke(local42, Boolean.TRUE);
			try {
				local12 = Static595.aHashtable12.keys();
				while (local12.hasMoreElements()) {
					@Pc(71) String local71 = (String) local12.nextElement();
					try {
						@Pc(76) File local76 = (File) Static173.aHashtable13.get(local71);
						@Pc(81) Class local81 = (Class) Static595.aHashtable12.get(local71);
						@Pc(87) Vector local87 = (Vector) local42.get(local81.getClassLoader());
						for (@Pc(89) int local89 = 0; local89 < local87.size(); local89++) {
							try {
								@Pc(95) Object local95 = local87.elementAt(local89);
								@Pc(100) Field local100 = local95.getClass().getDeclaredField("name");
								local52.invoke(local100, Boolean.TRUE);
								try {
									@Pc(115) String local115 = (String) local100.get(local95);
									if (local115 != null && local115.equalsIgnoreCase(local76.getCanonicalPath())) {
										@Pc(127) Field local127 = local95.getClass().getDeclaredField("handle");
										@Pc(134) Method local134 = local95.getClass().getDeclaredMethod("finalize");
										local52.invoke(local127, Boolean.TRUE);
										local52.invoke(local134, Boolean.TRUE);
										try {
											local134.invoke(local95);
											local127.set(local95, Integer.valueOf(0));
											local9.remove(local71);
										} catch (@Pc(173) Throwable local173) {
										}
										local52.invoke(local134, Boolean.FALSE);
										local52.invoke(local127, Boolean.FALSE);
									}
								} catch (@Pc(195) Throwable local195) {
								}
								local52.invoke(local100, Boolean.FALSE);
							} catch (@Pc(207) Throwable local207) {
							}
						}
					} catch (@Pc(219) Throwable local219) {
					}
				}
			} catch (@Pc(225) Throwable local225) {
			}
			local52.invoke(local42, Boolean.FALSE);
		} catch (@Pc(237) Throwable local237) {
		}
		Static595.aHashtable12 = local9;
		return Static595.aHashtable12.isEmpty();
	}

	@OriginalMember(owner = "client!dh", name = "b", descriptor = "(B)V")
	public static void method2467() {
		Static13.method200(Static552.aClass3_Sub48_30.aClass23_Sub29_1.method8509());
		@Pc(24) int local24 = (Static446.anInt8090 >> 3) + (Static465.anInt8425 >> 12);
		Static552.anInt9440 = Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2.aByte128 = 0;
		@Pc(37) int local37 = (Static124.anInt3150 >> 3) + (Static289.anInt5908 >> 12);
		Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2.method5329(8, 8);
		Static475.anIntArray531 = new int[18];
		Static231.anIntArray306 = new int[18];
		Static330.anIntArray389 = new int[18];
		Static89.aByteArrayArray4 = new byte[18][];
		Static166.aByteArrayArray8 = new byte[18][];
		Static330.anIntArrayArray59 = new int[18][4];
		Static507.anIntArray563 = new int[18];
		Static492.anIntArray553 = new int[18];
		Static172.aByteArrayArray9 = new byte[18][];
		Static378.aByteArrayArray14 = new byte[18][];
		Static210.anIntArray279 = new int[18];
		Static63.aByteArrayArray3 = new byte[18][];
		@Pc(83) int local83 = 0;
		@Pc(103) int local103;
		for (@Pc(92) int local92 = (local24 - (Static394.anInt7540 >> 4)) / 8; local92 <= ((Static394.anInt7540 >> 4) + local24) / 8; local92++) {
			for (local103 = (local37 - (Static462.anInt8391 >> 4)) / 8; local103 <= (local37 + (Static462.anInt8391 >> 4)) / 8; local103++) {
				@Pc(111) int local111 = (local92 << 8) + local103;
				Static475.anIntArray531[local83] = local111;
				Static210.anIntArray279[local83] = Static123.aClass181_28.method5033("m" + local92 + "_" + local103);
				Static330.anIntArray389[local83] = Static123.aClass181_28.method5033("l" + local92 + "_" + local103);
				Static231.anIntArray306[local83] = Static123.aClass181_28.method5033("n" + local92 + "_" + local103);
				Static507.anIntArray563[local83] = Static123.aClass181_28.method5033("um" + local92 + "_" + local103);
				Static492.anIntArray553[local83] = Static123.aClass181_28.method5033("ul" + local92 + "_" + local103);
				if (Static231.anIntArray306[local83] == -1) {
					Static210.anIntArray279[local83] = -1;
					Static330.anIntArray389[local83] = -1;
					Static507.anIntArray563[local83] = -1;
					Static492.anIntArray553[local83] = -1;
				}
				local83++;
			}
		}
		for (local103 = local83; local103 < Static231.anIntArray306.length; local103++) {
			Static231.anIntArray306[local103] = -1;
			Static210.anIntArray279[local103] = -1;
			Static330.anIntArray389[local103] = -1;
			Static507.anIntArray563[local103] = -1;
			Static492.anIntArray553[local103] = -1;
		}
		@Pc(284) byte local284;
		if (Static581.anInt9720 == 3) {
			local284 = 4;
		} else {
			local284 = 8;
		}
		Static610.method8290(local37, local284, false, local24);
	}
}
