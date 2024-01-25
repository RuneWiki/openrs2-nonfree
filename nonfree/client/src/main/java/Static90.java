import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static90 {

	@OriginalMember(owner = "client!df", name = "c", descriptor = "F")
	public static float aFloat91;

	@OriginalMember(owner = "client!df", name = "e", descriptor = "I")
	public static int anInt2314;

	@OriginalMember(owner = "client!df", name = "g", descriptor = "Lclient!uh;")
	public static Class335 aClass335_1;

	@OriginalMember(owner = "client!df", name = "b", descriptor = "Lclient!sea;")
	public static final Class304 aClass304_3 = new Class304();

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(ZBLclient!dv;)V")
	public static void method2283(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class2_Sub3_Sub1_Sub2_Sub1 arg1) {
		if (Static443.anInt8026 >= 400) {
			return;
		}
		@Pc(19) Class22 local19 = arg1.aClass22_1;
		if (local19.anIntArray29 != null) {
			local19 = local19.method425(Static514.aClass166_1);
			if (local19 == null) {
				return;
			}
		}
		if (!local19.aBoolean38) {
			return;
		}
		@Pc(37) String local37 = local19.aString4;
		if (local19.anInt413 != 0) {
			@Pc(53) String local53 = Static648.aClass62_16 == Static518.aClass62_15 ? Static287.aClass176_30.method4986(Static380.anInt7247) : Static287.aClass176_28.method4986(Static380.anInt7247);
			local37 = local37 + Static370.method5904(local19.anInt413, Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2.anInt6383) + " (" + local53 + local19.anInt413 + ")";
		}
		if (Static82.aBoolean192 && !arg0) {
			@Pc(91) Class140 local91 = Static159.anInt3866 == -1 ? null : Static513.aClass49_2.method1857(Static159.anInt3866);
			if ((Static607.anInt10027 & 0x2) != 0 && (local91 == null || local19.method430(Static159.anInt3866, local91.anInt5140) != local91.anInt5140)) {
				Static512.method7408(58, Static275.aString60 + " -> <col=ffff00>" + local37, -1, true, (long) arg1.anInt6289, Static330.aString71, (long) arg1.anInt6289, false, 0, 0, false, Static287.anInt5894);
			}
		}
		if (!arg0) {
			@Pc(142) String[] local142 = local19.aStringArray3;
			if (Static121.aBoolean568) {
				local142 = Static354.method5799(local142);
			}
			@Pc(152) int local152;
			if (local142 != null) {
				for (local152 = 4; local152 >= 0; local152--) {
					if (local142[local152] != null && (local19.aByte17 == 0 || !local142[local152].equalsIgnoreCase(Static287.aClass176_23.method4986(Static380.anInt7247)))) {
						@Pc(172) byte local172 = 0;
						@Pc(174) int local174 = Static83.anInt6965;
						if (local152 == 0) {
							local172 = 15;
						}
						if (local152 == 1) {
							local172 = 60;
						}
						if (local152 == 2) {
							local172 = 17;
						}
						if (local152 == 3) {
							local172 = 22;
						}
						if (local152 == local19.anInt409) {
							local174 = local19.anInt411;
						}
						if (local152 == 4) {
							local172 = 8;
						}
						if (local152 == local19.anInt396) {
							local174 = local19.anInt387;
						}
						Static512.method7408(local172, "<col=ffff00>" + local37, -1, true, (long) arg1.anInt6289, local142[local152], (long) arg1.anInt6289, false, 0, 0, false, local142[local152].equalsIgnoreCase(Static287.aClass176_23.method4986(Static380.anInt7247)) ? local19.anInt393 : local174);
					}
				}
			}
			if (local19.aByte17 == 1 && local142 != null) {
				for (local152 = 4; local152 >= 0; local152--) {
					if (local142[local152] != null && local142[local152].equalsIgnoreCase(Static287.aClass176_23.method4986(Static380.anInt7247))) {
						@Pc(292) short local292 = 0;
						if (local19.anInt413 > Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2.anInt6383) {
							local292 = 2000;
						}
						@Pc(305) short local305 = 0;
						if (local152 == 0) {
							local305 = 15;
						}
						if (local152 == 1) {
							local305 = 60;
						}
						if (local152 == 2) {
							local305 = 17;
						}
						if (local152 == 3) {
							local305 = 22;
						}
						if (local152 == 4) {
							local305 = 8;
						}
						if (local305 != 0) {
							local305 += local292;
						}
						Static512.method7408(local305, "<col=ffff00>" + local37, -1, true, (long) arg1.anInt6289, local142[local152], (long) arg1.anInt6289, false, 0, 0, false, local19.anInt393);
					}
				}
			}
		}
		Static512.method7408(1012, "<col=ffff00>" + local37, -1, true, (long) arg1.anInt6289, Static287.aClass176_22.method4986(Static380.anInt7247), (long) arg1.anInt6289, arg0, 0, 0, false, Static96.anInt2551);
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(B)V")
	public static void method2285() {
		Static29.anInt565 = -1;
		Static381.anInt7250 = 0;
		Static326.anInt6537 = -1;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;")
	public static String method2287(@OriginalArg(1) String arg0) {
		@Pc(12) String local12 = null;
		@Pc(16) int local16 = arg0.indexOf("--> ");
		if (local16 >= 0) {
			local12 = arg0.substring(0, local16 + 4);
			arg0 = arg0.substring(local16 + 4);
		}
		if (arg0.startsWith("directlogin ")) {
			@Pc(41) int local41 = arg0.indexOf(" ", "directlogin ".length());
			if (local41 >= 0) {
				@Pc(49) int local49 = arg0.length();
				arg0 = arg0.substring(0, local41) + " ";
				for (@Pc(65) int local65 = local41 + 1; local65 < local49; local65++) {
					arg0 = arg0 + "*";
				}
			}
		}
		return local12 == null ? arg0 : local12 + arg0;
	}
}
