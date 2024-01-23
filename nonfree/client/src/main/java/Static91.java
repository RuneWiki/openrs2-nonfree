import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static91 {

	@OriginalMember(owner = "client!gl", name = "f", descriptor = "Lclient!bn;")
	public static Class8_Sub1_Sub3 aClass8_Sub1_Sub3_6;

	@OriginalMember(owner = "client!gl", name = "k", descriptor = "[Lclient!nn;")
	public static Class13_Sub1[] aClass13_Sub1Array2;

	@OriginalMember(owner = "client!gl", name = "l", descriptor = "Ljava/lang/String;")
	public static String aString73 = " is already on your ignore list.";

	@OriginalMember(owner = "client!gl", name = "m", descriptor = "Ljava/lang/String;")
	public static String aString74 = "K";

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(Lclient!le;II)V")
	public static void method1472(@OriginalArg(0) Class8_Sub2_Sub1 arg0) {
		while (true) {
			@Pc(18) Class8_Sub30 local18 = (Class8_Sub30) Static235.aClass182_26.method4319();
			if (local18 == null) {
				return;
			}
			@Pc(23) boolean local23 = false;
			@Pc(25) int local25;
			for (local25 = 0; local25 < local18.anInt5001; local25++) {
				if (local18.aClass163Array1[local25] != null) {
					if (local18.aClass163Array1[local25].anInt5259 == 2) {
						local18.anIntArray388[local25] = -5;
					}
					if (local18.aClass163Array1[local25].anInt5259 == 0) {
						local23 = true;
					}
				}
				if (local18.aClass163Array2[local25] != null) {
					if (local18.aClass163Array2[local25].anInt5259 == 2) {
						local18.anIntArray388[local25] = -6;
					}
					if (local18.aClass163Array2[local25].anInt5259 == 0) {
						local23 = true;
					}
				}
			}
			if (local23) {
				return;
			}
			arg0.method2398(127);
			arg0.method2340(0);
			local25 = arg0.anInt2955;
			arg0.method2330(local18.anInt5002);
			for (@Pc(118) int local118 = 0; local118 < local18.anInt5001; local118++) {
				if (local18.anIntArray388[local118] == 0) {
					try {
						@Pc(142) int local142 = local18.anIntArray389[local118];
						@Pc(160) Field local160;
						@Pc(163) int local163;
						if (local142 == 0) {
							local160 = (Field) local18.aClass163Array1[local118].anObject7;
							local163 = local160.getInt(null);
							arg0.method2340(0);
							arg0.method2330(local163);
						} else if (local142 == 1) {
							local160 = (Field) local18.aClass163Array1[local118].anObject7;
							local160.setInt(null, local18.anIntArray387[local118]);
							arg0.method2340(0);
						} else if (local142 == 2) {
							local160 = (Field) local18.aClass163Array1[local118].anObject7;
							local163 = local160.getModifiers();
							arg0.method2340(0);
							arg0.method2330(local163);
						}
						@Pc(222) Method local222;
						if (local142 == 3) {
							local222 = (Method) local18.aClass163Array2[local118].anObject7;
							@Pc(227) byte[][] local227 = local18.aByteArrayArrayArray14[local118];
							@Pc(231) Object[] local231 = new Object[local227.length];
							for (@Pc(233) int local233 = 0; local233 < local227.length; local233++) {
								@Pc(251) ObjectInputStream local251 = new ObjectInputStream(new ByteArrayInputStream(local227[local233]));
								local231[local233] = local251.readObject();
							}
							@Pc(264) Object local264 = local222.invoke(null, local231);
							if (local264 == null) {
								arg0.method2340(0);
							} else if (local264 instanceof Number) {
								arg0.method2340(1);
								arg0.method2378(((Number) local264).longValue());
							} else if (local264 instanceof String) {
								arg0.method2340(2);
								arg0.method2331((String) local264);
							} else {
								arg0.method2340(4);
							}
						} else if (local142 == 4) {
							local222 = (Method) local18.aClass163Array2[local118].anObject7;
							local163 = local222.getModifiers();
							arg0.method2340(0);
							arg0.method2330(local163);
						}
					} catch (@Pc(330) ClassNotFoundException local330) {
						arg0.method2340(-10);
					} catch (@Pc(336) InvalidClassException local336) {
						arg0.method2340(-11);
					} catch (@Pc(342) StreamCorruptedException local342) {
						arg0.method2340(-12);
					} catch (@Pc(348) OptionalDataException local348) {
						arg0.method2340(-13);
					} catch (@Pc(354) IllegalAccessException local354) {
						arg0.method2340(-14);
					} catch (@Pc(360) IllegalArgumentException local360) {
						arg0.method2340(-15);
					} catch (@Pc(366) InvocationTargetException local366) {
						arg0.method2340(-16);
					} catch (@Pc(372) SecurityException local372) {
						arg0.method2340(-17);
					} catch (@Pc(378) IOException local378) {
						arg0.method2340(-18);
					} catch (@Pc(384) NullPointerException local384) {
						arg0.method2340(-19);
					} catch (@Pc(390) Exception local390) {
						arg0.method2340(-20);
					} catch (@Pc(396) Throwable local396) {
						arg0.method2340(-21);
					}
				} else {
					arg0.method2340(local18.anIntArray388[local118]);
				}
			}
			arg0.method2346(local25);
			arg0.method2321(arg0.anInt2955 - local25);
			local18.method4273();
		}
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(ILclient!aj;)V")
	public static void method1473(@OriginalArg(1) Class8_Sub2 arg0) {
		for (@Pc(7) int local7 = 0; local7 < Static94.anInt1963; local7++) {
			@Pc(22) int local22 = arg0.method2382();
			@Pc(26) int local26 = arg0.method2375();
			if (local26 == 65535) {
				local26 = -1;
			}
			if (aClass13_Sub1Array2[local22] != null) {
				aClass13_Sub1Array2[local22].anInt3517 = local26;
			}
		}
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(ILclient!tk;)Ljava/lang/String;")
	public static String method1475(@OriginalArg(1) Class159 arg0) {
		if (Static42.method668(arg0).method3350() == 0) {
			return null;
		} else if (arg0.aString182 == null || arg0.aString182.trim().length() == 0) {
			return Static104.aBoolean169 ? "Hidden-use" : null;
		} else {
			return arg0.aString182;
		}
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(IIIIIII)I")
	public static int method1476(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if ((arg2 & 0x1) == 1) {
			@Pc(13) int local13 = arg1;
			arg1 = arg5;
			arg5 = local13;
		}
		@Pc(21) int local21 = arg3 & 0x3;
		if (local21 == 0) {
			return arg0;
		} else if (local21 == 1) {
			return 1 + 7 - arg1 - arg4;
		} else if (local21 == 2) {
			return 7 + 1 - arg0 - arg5;
		} else {
			return arg4;
		}
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(IZ)V")
	public static void method1477() {
		Static114.aClass61_18.method1381(5);
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(ZLclient!pk;)V")
	public static void method1478(@OriginalArg(1) Class132 arg0) {
		Static249.aClass132_85 = arg0;
	}

	@OriginalMember(owner = "client!gl", name = "c", descriptor = "(I)[F")
	public static float[] method1479() {
		@Pc(7) float local7 = Static233.method3549() + Static233.method3552();
		@Pc(16) int local16 = Static233.method3555();
		@Pc(25) float local25 = (float) (local16 >> 8 & 0xFF) / 255.0F;
		Static35.aFloatArray2[3] = 1.0F;
		@Pc(38) float local38 = (float) (local16 >> 16 & 0xFF) / 255.0F;
		@Pc(45) float local45 = (float) (local16 & 0xFF) / 255.0F;
		@Pc(47) float local47 = 0.58823526F;
		Static35.aFloatArray2[2] = local47 * local45 * Static153.aFloatArray15[2] * local7;
		Static35.aFloatArray2[0] = local7 * local38 * Static153.aFloatArray15[0] * local47;
		Static35.aFloatArray2[1] = local7 * local47 * local25 * Static153.aFloatArray15[1];
		return Static35.aFloatArray2;
	}
}
