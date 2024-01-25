import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static89 {

	@OriginalMember(owner = "client!de", name = "Oc", descriptor = "I")
	public static int anInt1594;

	@OriginalMember(owner = "client!de", name = "Qc", descriptor = "I")
	public static int anInt1595;

	@OriginalMember(owner = "client!de", name = "E", descriptor = "Lclient!iba;")
	public static final Class154 aClass154_17 = new Class154(31, 16);

	@OriginalMember(owner = "client!de", name = "oc", descriptor = "I")
	public static int anInt1576 = 100;

	@OriginalMember(owner = "client!de", name = "Pc", descriptor = "Ljava/lang/String;")
	public static String aString21 = null;

	@OriginalMember(owner = "client!de", name = "Sc", descriptor = "[F")
	public static final float[] aFloatArray5 = new float[16];

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(ILclient!uca;ILjava/lang/String;)Lclient!lk;")
	public static Class210 method1337(@OriginalArg(1) Class162_Sub3 arg0, @OriginalArg(3) String arg1) {
		@Pc(5) int local5 = OpenGL.glGenProgramARB();
		OpenGL.glBindProgramARB(34336, local5);
		OpenGL.glProgramStringARB(34336, 34933, arg1);
		OpenGL.glGetIntegerv(34379, Static153.anIntArray208, 0);
		if (Static153.anIntArray208[0] == -1) {
			OpenGL.glBindProgramARB(34336, 0);
			return new Class210(arg0, 34336, local5);
		} else {
			OpenGL.glBindProgramARB(34336, 0);
			return null;
		}
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(IIILclient!uca;II)Lclient!ei;")
	public static Class3_Sub1_Sub1 method1338(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class162_Sub3 arg3, @OriginalArg(5) int arg4) {
		if (arg3.aBoolean739 || Static259.method3656(arg2) && Static259.method3656(arg0)) {
			return new Class3_Sub1_Sub1(arg3, 3553, arg1, arg4, arg2, arg0, true);
		} else if (arg3.aBoolean735) {
			return new Class3_Sub1_Sub1(arg3, 34037, arg1, arg4, arg2, arg0, true);
		} else {
			return new Class3_Sub1_Sub1(arg3, arg1, arg4, arg2, arg0, Static355.method5078(arg2), Static355.method5078(arg0), true);
		}
	}

	@OriginalMember(owner = "client!de", name = "c", descriptor = "(B)V")
	public static void method1342() {
		if (Static541.aFloat128 < 1024.0F) {
			Static541.aFloat128 = 1024.0F;
		}
		if (Static541.aFloat128 > 3072.0F) {
			Static541.aFloat128 = 3072.0F;
		}
		while (Static313.aFloat157 >= 16384.0F) {
			Static313.aFloat157 -= 16384.0F;
		}
		while (Static313.aFloat157 < 0.0F) {
			Static313.aFloat157 += 16384.0F;
		}
		@Pc(41) int local41 = Static14.anInt328 >> 9;
		@Pc(50) int local50 = Static47.anInt873 >> 9;
		@Pc(56) int local56 = Static24.method347(Static47.anInt873, Static14.anInt328, Static402.anInt6620);
		@Pc(58) int local58 = 0;
		@Pc(80) int local80;
		if (local41 > 3 && local50 > 3 && Static281.anInt4822 - 4 > local41 && Static29.anInt491 - 4 > local50) {
			for (local80 = local41 - 4; local80 <= local41 + 4; local80++) {
				for (@Pc(86) int local86 = local50 - 4; local86 <= local50 + 4; local86++) {
					@Pc(90) int local90 = Static402.anInt6620;
					if (local90 < 3 && Static562.method7350(local80, local86)) {
						local90++;
					}
					@Pc(103) int local103 = 0;
					if (Static370.aClass50_Sub1_1.aByteArrayArrayArray11 != null && Static370.aClass50_Sub1_1.aByteArrayArrayArray11[local90] != null) {
						local103 = (Static370.aClass50_Sub1_1.aByteArrayArrayArray11[local90][local80][local86] & 0xFF) * 8;
					}
					if (Static114.aClass151Array1 != null && Static114.aClass151Array1[local90] != null) {
						@Pc(143) int local143 = local56 + local103 - Static114.aClass151Array1[local90].method7676(local86, local80);
						if (local58 < local143) {
							local58 = local143;
						}
					}
				}
			}
		}
		local80 = (local58 >> 2) * 1536;
		if (local80 > 786432) {
			local80 = 786432;
		}
		if (local80 < 262144) {
			local80 = 262144;
		}
		if (local80 > Static542.anInt6417) {
			Static542.anInt6417 += (local80 - Static542.anInt6417) / 24;
		} else if (local80 < Static542.anInt6417) {
			Static542.anInt6417 += (local80 - Static542.anInt6417) / 80;
			return;
		}
	}

	@OriginalMember(owner = "client!de", name = "g", descriptor = "(I)V")
	public static void method1345() {
		if (Static87.anInt9596 < 0) {
			return;
		}
		@Pc(7) long local7 = Static362.method5133();
		Static87.anInt9596 = (int) ((long) Static87.anInt9596 + Static459.aLong201 - local7);
		if (Static87.anInt9596 > 0) {
			@Pc(27) int local27 = (Static87.anInt9596 << 8) / Static529.anInt8482;
			@Pc(32) int local32 = 255 - local27;
			@Pc(37) float local37 = (float) local27 / 255.0F;
			Static366.anInt6169 = (local27 * (Static88.anInt1496 & 0xFF00FF) + local32 * (Static175.aClass75_4.anInt1722 & 0xFF00FF) & 0xFF00FF00) + ((Static88.anInt1496 & 0xFF00) * local27 + (local32 * (Static175.aClass75_4.anInt1722 & 0xFF00)) & 0xFF0000) >>> 8;
			@Pc(74) float local74 = 1.0F - local37;
			Static77.aFloat31 = Static183.aFloat61 + (Static175.aClass75_4.aFloat41 - Static183.aFloat61) * local74;
			Static384.aFloat180 = local74 * (Static175.aClass75_4.aFloat40 - Static558.aFloat239) + Static558.aFloat239;
			Static327.anInt5512 = Static175.aClass75_4.anInt1719 * local32 + Static98.anInt1736 * local27 >> 8;
			Static159.aFloat58 = Static5.aFloat5 + local74 * (Static175.aClass75_4.aFloat37 - Static5.aFloat5);
			Static87.aFloat260 = local74 * (Static175.aClass75_4.aFloat38 - Static75.aFloat30) + Static75.aFloat30;
			Static498.aFloat204 = Static443.aFloat191 + (Static175.aClass75_4.aFloat42 - Static443.aFloat191) * local74;
			Static532.anInt8756 = (local32 * (Static175.aClass75_4.anInt1716 & 0xFF00) + local27 * (Static388.anInt6398 & 0xFF00) & 0xFF0000) + ((Static175.aClass75_4.anInt1716 & 0xFF00FF) * local32 + local27 * (Static388.anInt6398 & 0xFF00FF) & 0xFF00FF00) >>> 8;
			Static57.aFloat26 = Static146.aFloat55 + local74 * (Static175.aClass75_4.aFloat39 - Static146.aFloat55);
			if (Static576.aClass17_4 != Static175.aClass75_4.aClass17_1) {
				Static496.aClass17_3 = Static15.aClass162_1.method6882(Static576.aClass17_4, Static175.aClass75_4.aClass17_1, local74, Static496.aClass17_3);
			}
		} else {
			Static87.aFloat260 = Static175.aClass75_4.aFloat38;
			Static496.aClass17_3 = Static175.aClass75_4.aClass17_1;
			Static366.anInt6169 = Static175.aClass75_4.anInt1722;
			Static532.anInt8756 = Static175.aClass75_4.anInt1716;
			Static498.aFloat204 = Static175.aClass75_4.aFloat42;
			Static87.anInt9596 = -1;
			Static159.aFloat58 = Static175.aClass75_4.aFloat37;
			Static327.anInt5512 = Static175.aClass75_4.anInt1719;
			Static384.aFloat180 = Static175.aClass75_4.aFloat40;
			Static57.aFloat26 = Static175.aClass75_4.aFloat39;
			Static77.aFloat31 = Static175.aClass75_4.aFloat41;
		}
		Static459.aLong201 = local7;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(IBIIIIII)V")
	public static void method1349(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(11) int local11 = Static290.method4092(Static48.anInt898, arg0, Static275.anInt4756);
		@Pc(17) int local17 = Static290.method4092(Static48.anInt898, arg4, Static275.anInt4756);
		@Pc(23) int local23 = Static290.method4092(anInt1576, arg2, Static130.anInt2131);
		@Pc(29) int local29 = Static290.method4092(anInt1576, arg6, Static130.anInt2131);
		@Pc(37) int local37 = Static290.method4092(Static48.anInt898, arg0 + arg3, Static275.anInt4756);
		@Pc(46) int local46 = Static290.method4092(Static48.anInt898, arg4 - arg3, Static275.anInt4756);
		for (@Pc(48) int local48 = local11; local48 < local37; local48++) {
			Static437.method5735(local23, Static238.anIntArrayArray36[local48], local29, arg5);
		}
		for (@Pc(64) int local64 = local17; local64 > local46; local64--) {
			Static437.method5735(local23, Static238.anIntArrayArray36[local64], local29, arg5);
		}
		@Pc(90) int local90 = Static290.method4092(anInt1576, arg3 + arg2, Static130.anInt2131);
		@Pc(99) int local99 = Static290.method4092(anInt1576, arg6 - arg3, Static130.anInt2131);
		for (@Pc(106) int local106 = local37; local106 <= local46; local106++) {
			@Pc(112) int[] local112 = Static238.anIntArrayArray36[local106];
			Static437.method5735(local23, local112, local90, arg5);
			Static437.method5735(local90, local112, local99, arg1);
			Static437.method5735(local99, local112, local29, arg5);
		}
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method1351(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static448.method1155(0, arg4, arg2, arg5, arg0, arg1, arg3);
	}
}
