import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static99 {

	@OriginalMember(owner = "client!de", name = "e", descriptor = "[I")
	public static int[] anIntArray140 = new int[4];

	@OriginalMember(owner = "client!de", name = "h", descriptor = "Lclient!vl;")
	public static final Class376 aClass376_29 = new Class376(42, 7);

	@OriginalMember(owner = "client!de", name = "l", descriptor = "I")
	public static int anInt2127 = 0;

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/Class;)Z")
	public static boolean method1964(@OriginalArg(1) String arg0, @OriginalArg(2) Class arg1) {
		@Pc(8) Class local8 = (Class) Static679.aHashtable7.get(arg0);
		if (local8 != null) {
			return local8.getClassLoader() == arg1.getClassLoader();
		}
		@Pc(29) File local29 = null;
		if (local29 == null) {
			local29 = (File) Static647.aHashtable6.get(arg0);
		}
		if (local29 != null) {
			try {
				local29 = new File(local29.getCanonicalPath());
				@Pc(47) Class local47 = Class.forName("java.lang.Runtime");
				@Pc(50) Class local50 = Class.forName("java.lang.reflect.AccessibleObject");
				@Pc(60) Method local60 = local50.getDeclaredMethod("setAccessible", Boolean.TYPE);
				@Pc(76) Method local76 = local47.getDeclaredMethod("load0", Class.forName("java.lang.Class"), Class.forName("java.lang.String"));
				local60.invoke(local76, Boolean.TRUE);
				local76.invoke(Runtime.getRuntime(), arg1, local29.getPath());
				local60.invoke(local76, Boolean.FALSE);
				Static679.aHashtable7.put(arg0, arg1);
				return true;
			} catch (@Pc(119) NoSuchMethodException local119) {
				System.load(local29.getPath());
				Static679.aHashtable7.put(arg0, w.class);
				return true;
			} catch (@Pc(137) Throwable local137) {
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!de", name = "b", descriptor = "(B)V")
	public static void method1965() {
		@Pc(7) short local7 = 1024;
		@Pc(9) short local9 = 3072;
		if (Static148.aBoolean221) {
			if (Static207.aBoolean296) {
				local7 = 2048;
			}
			local9 = 4096;
		}
		if (Static461.aFloat178 < (float) local7) {
			Static461.aFloat178 = (float) local7;
		}
		if ((float) local9 < Static461.aFloat178) {
			Static461.aFloat178 = (float) local9;
		}
		while (Static204.aFloat82 >= 16384.0F) {
			Static204.aFloat82 -= 16384.0F;
		}
		while (Static204.aFloat82 < 0.0F) {
			Static204.aFloat82 += 16384.0F;
		}
		@Pc(57) int local57 = Static429.anInt7552 >> 9;
		@Pc(61) int local61 = Static647.anInt9959 >> 9;
		@Pc(71) int local71 = Static194.method5133(Static429.anInt7552, Static647.anInt9959, Static576.anInt9136);
		@Pc(73) int local73 = 0;
		@Pc(101) int local101;
		if (local57 > 3 && local61 > 3 && Static251.anInt4680 - 4 > local57 && Static406.anInt6924 - 4 > local61) {
			for (local101 = local57 - 4; local101 <= local57 + 4; local101++) {
				for (@Pc(107) int local107 = local61 - 4; local107 <= local61 + 4; local107++) {
					@Pc(111) int local111 = Static576.anInt9136;
					if (local111 < 3 && Static190.method3051(local107, local101)) {
						local111++;
					}
					@Pc(124) int local124 = 0;
					if (Static196.aClass67_Sub1_2.aByteArrayArrayArray7 != null && Static196.aClass67_Sub1_2.aByteArrayArrayArray7[local111] != null) {
						local124 = (Static196.aClass67_Sub1_2.aByteArrayArrayArray7[local111][local101][local107] & 0xFF) * 8 << 2;
					}
					if (Static343.aClass104Array2 != null && Static343.aClass104Array2[local111] != null) {
						@Pc(166) int local166 = local124 + local71 - Static343.aClass104Array2[local111].method8279(local107, local101);
						if (local73 < local166) {
							local73 = local166;
						}
					}
				}
			}
		}
		local101 = (local73 >> 2) * 1536;
		if (local101 > 786432) {
			local101 = 786432;
		}
		if (local101 < 262144) {
			local101 = 262144;
		}
		if (Static559.anInt9018 < local101) {
			Static559.anInt9018 += (local101 - Static559.anInt9018) / 24;
		} else if (local101 < Static559.anInt9018) {
			Static559.anInt9018 += (local101 - Static559.anInt9018) / 80;
		}
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(II)I")
	public static int method1966(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;BIIZZ)V")
	public static void method1967(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) boolean arg5) {
		Static160.aClass143_39.anInt3570 = 1;
		@Pc(11) String local11 = arg0.toLowerCase();
		@Pc(14) short[] local14 = new short[16];
		@Pc(16) int local16 = -1;
		@Pc(18) String local18 = null;
		if (arg2 != -1) {
			@Pc(27) Class328 local27 = Static145.aClass165_1.method3812(arg2);
			if (local27 == null || local27.method7566() != arg5) {
				return;
			}
			if (local27.method7566()) {
				local18 = local27.aString108;
			} else {
				local16 = local27.anInt8911;
			}
		}
		@Pc(48) int local48 = 0;
		for (@Pc(50) int local50 = 0; local50 < Static237.aClass371_2.anInt9754; local50++) {
			@Pc(59) Class146 local59 = Static237.aClass371_2.method8305(local50);
			if ((!arg4 || local59.aBoolean290) && local59.anInt3673 == -1 && local59.anInt3727 == -1 && local59.anInt3726 == -1 && local59.anInt3698 == 0 && local59.aString46.toLowerCase().indexOf(local11) != -1) {
				if (arg2 != -1) {
					if (arg5) {
						if (!arg1.equals(local59.method3193(arg2, local18))) {
							continue;
						}
					} else if (local59.method3206(local16, arg2) != arg3) {
						continue;
					}
				}
				if (local48 >= 250) {
					Static505.aShortArray168 = null;
					Static380.anInt6678 = -1;
					return;
				}
				if (local14.length <= local48) {
					@Pc(135) short[] local135 = new short[local14.length * 2];
					for (@Pc(137) int local137 = 0; local137 < local48; local137++) {
						local135[local137] = local14[local137];
					}
					local14 = local135;
				}
				local14[local48++] = (short) local50;
			}
		}
		Static380.anInt6678 = local48;
		Static505.aShortArray168 = local14;
		Static341.anInt6164 = 0;
		@Pc(175) String[] local175 = new String[Static380.anInt6678];
		for (@Pc(177) int local177 = 0; local177 < Static380.anInt6678; local177++) {
			local175[local177] = Static237.aClass371_2.method8305(local14[local177]).aString46;
		}
		Static523.method4774(Static505.aShortArray168, local175);
		Static160.aClass143_39.method3141();
		Static160.aClass143_39.anInt3570 = 2;
	}
}
