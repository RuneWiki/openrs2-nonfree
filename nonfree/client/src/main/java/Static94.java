import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static94 {

	@OriginalMember(owner = "client!dg", name = "i", descriptor = "[I")
	public static final int[] anIntArray823 = new int[13];

	@OriginalMember(owner = "client!dg", name = "k", descriptor = "Ljava/lang/String;")
	public static String aString145 = "";

	@OriginalMember(owner = "client!dg", name = "n", descriptor = "Z")
	public static boolean aBoolean828 = false;

	@OriginalMember(owner = "client!dg", name = "q", descriptor = "[Z")
	public static final boolean[] aBooleanArray59 = new boolean[8];

	@OriginalMember(owner = "client!dg", name = "v", descriptor = "Lclient!du;")
	public static final Class81 aClass81_75 = new Class81(16);

	@OriginalMember(owner = "client!dg", name = "w", descriptor = "I")
	public static int anInt10279 = 0;

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(ILclient!vfa;IB)V")
	public static void method8737(@OriginalArg(0) int arg0, @OriginalArg(1) Class357 arg1, @OriginalArg(2) int arg2) {
		Static609.anInt9976 = arg2;
		Static9.anInt145 = arg0;
		Static509.aClass357_9 = arg1;
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "()V")
	public static void method8740() {
		while (true) {
			@Pc(1) boolean local1 = true;
			@Pc(3) int local3;
			for (local3 = 0; local3 < Static311.aClass301Array1.length; local3++) {
				if (Static311.aClass301Array1[local3].method7148()) {
					Static157.aLongArray2[local3] = Static311.aClass301Array1[local3].method7149();
				} else {
					synchronized (Static311.aClass301Array1[local3]) {
						Static311.aClass301Array1[local3].notify();
					}
					local1 = false;
				}
			}
			if (local1) {
				Static311.aClass301Array1[Static311.aClass301Array1.length - 1].method7144();
				Static304.method4410(1);
				while (true) {
					local1 = true;
					for (local3 = 0; local3 < Static311.aClass301Array1.length - 1; local3++) {
						if (!Static311.aClass301Array1[local3].method7148()) {
							synchronized (Static311.aClass301Array1[local3]) {
								Static311.aClass301Array1[local3].notify();
							}
							local1 = false;
						}
					}
					if (local1) {
						for (@Pc(102) int local102 = 1; local102 < Static311.aClass301Array1.length - 2; local102++) {
							Static311.aClass301Array1[local102].method7144();
						}
						Static304.method4410(2);
						while (!Static311.aClass301Array1[0].method7148()) {
							synchronized (Static311.aClass301Array1[0]) {
								Static311.aClass301Array1[0].notify();
							}
							try {
								Static452.method7478(1L);
							} catch (@Pc(142) Exception local142) {
							}
						}
						Static311.aClass301Array1[0].method7144();
						return;
					}
					try {
						Static452.method7478(1L);
					} catch (@Pc(99) Exception local99) {
					}
				}
			}
			try {
				Static452.method7478(1L);
			} catch (@Pc(47) Exception local47) {
			}
		}
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIIBZ)Lclient!ff;")
	public static Class5_Sub15 method8742(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3) {
		@Pc(7) Class5_Sub15 local7 = new Class5_Sub15();
		local7.anInt2406 = arg0;
		local7.anInt2409 = arg1;
		Static183.aClass81_27.method1607(local7, (long) arg2);
		Static461.method6856(arg1);
		@Pc(34) Class357 local34 = Static472.method6903(arg2);
		if (local34 != null) {
			Static637.method8778(local34);
		}
		if (Static381.aClass357_7 != null) {
			Static637.method8778(Static381.aClass357_7);
			Static381.aClass357_7 = null;
		}
		Static502.method7338();
		if (local34 != null) {
			Static101.method1475(!arg3, local34);
		}
		if (!arg3) {
			Static82.method1319(arg1);
		}
		if (!arg3 && Static302.anInt4813 != -1) {
			Static499.method7310(1, Static302.anInt4813);
		}
		return local7;
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIIII[B[BII)V")
	public static void method8743(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) byte[] arg4, @OriginalArg(6) byte[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(10) int local10 = -(arg2 >> 2);
		@Pc(20) int local20 = -(arg2 & 0x3);
		for (@Pc(23) int local23 = -arg3; local23 < 0; local23++) {
			@Pc(31) int local31;
			for (@Pc(27) int local27 = local10; local27 < 0; local27++) {
				local31 = arg1++;
				arg5[local31] += arg4[arg6++];
				@Pc(43) int local43 = arg1++;
				arg5[local43] += arg4[arg6++];
				@Pc(55) int local55 = arg1++;
				arg5[local55] += arg4[arg6++];
				@Pc(67) int local67 = arg1++;
				arg5[local67] += arg4[arg6++];
			}
			for (@Pc(82) int local82 = local20; local82 < 0; local82++) {
				local31 = arg1++;
				arg5[local31] += arg4[arg6++];
			}
			arg6 += arg0;
			arg1 += arg7;
		}
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(Lclient!fha;B)I")
	public static int method8744(@OriginalArg(0) Class14_Sub1_Sub1_Sub3_Sub1 arg0) {
		@Pc(8) int local8 = arg0.anInt2746;
		@Pc(12) Class295 local12 = arg0.method2519();
		if (arg0.anInt2924 == -1 || arg0.aBoolean257) {
			local8 = arg0.anInt2742;
		} else if (local12.anInt7956 == arg0.anInt2924 || local12.anInt7959 == arg0.anInt2924 || local12.anInt7984 == arg0.anInt2924 || arg0.anInt2924 == local12.anInt7970) {
			local8 = arg0.anInt2711;
		} else if (local12.anInt7969 == arg0.anInt2924 || arg0.anInt2924 == local12.anInt8001 || local12.anInt7997 == arg0.anInt2924 || local12.anInt7958 == arg0.anInt2924) {
			local8 = arg0.anInt2726;
		}
		return local8;
	}
}
