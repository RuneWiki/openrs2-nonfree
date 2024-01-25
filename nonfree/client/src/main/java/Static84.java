import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static84 {

	@OriginalMember(owner = "client!cu", name = "u", descriptor = "I")
	public static int anInt2565;

	@OriginalMember(owner = "client!cu", name = "v", descriptor = "Lclient!oaa;")
	public static final Class234 aClass234_5 = new Class234(14, 0, 4, 1);

	@OriginalMember(owner = "client!cu", name = "x", descriptor = "Z")
	public static final boolean aBoolean217 = false;

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(I[BLclient!bga;I)Lclient!qr;")
	public static Class283 method2411(@OriginalArg(1) byte[] arg0, @OriginalArg(2) Class20_Sub2_Sub2 arg1) {
		if (arg0 == null) {
			return null;
		}
		@Pc(9) int local9 = OpenGL.glGenProgramARB();
		OpenGL.glBindProgramARB(34336, local9);
		OpenGL.glProgramRawARB(34336, 34933, arg0);
		OpenGL.glGetIntegerv(34379, Static348.anIntArray435, 0);
		if (Static348.anIntArray435[0] == -1) {
			OpenGL.glBindProgramARB(34336, 0);
			return new Class283(arg1, 34336, local9);
		} else {
			OpenGL.glBindProgramARB(34336, 0);
			return null;
		}
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(ZLclient!kda;)V")
	public static void method2412(@OriginalArg(1) Class3_Sub1_Sub3_Sub3 arg0) {
		if (arg0.anIntArray350 == null && arg0.anIntArray354 == null) {
			return;
		}
		@Pc(14) boolean local14 = true;
		for (@Pc(16) int local16 = 0; local16 < arg0.anIntArray350.length; local16++) {
			@Pc(20) int local20 = -1;
			if (arg0.anIntArray350 != null) {
				local20 = arg0.anIntArray350[local16];
			}
			if (local20 != -1) {
				local14 = false;
				@Pc(74) int local74;
				@Pc(89) int local89;
				@Pc(59) int local59;
				if ((local20 & 0xC0000000) == -1073741824) {
					local59 = local20 & 0xFFFFFFF;
					@Pc(63) int local63 = local59 >> 14;
					local74 = arg0.anInt10303 - (local63 - anInt2565) * 512 - 256;
					@Pc(78) int local78 = local59 & 0x3FFF;
					local89 = arg0.anInt10310 - (local78 - Static32.anInt723) * 512 - 256;
				} else if ((local20 & 0x8000) == 0) {
					@Pc(102) Class2_Sub33 local102 = (Class2_Sub33) Static600.aClass99_79.method3056((long) local20);
					if (local102 == null) {
						arg0.method5201(local16, -1);
						continue;
					}
					@Pc(115) Class3_Sub1_Sub3_Sub3_Sub1 local115 = local102.aClass3_Sub1_Sub3_Sub3_Sub1_2;
					local89 = arg0.anInt10310 - local115.anInt10310;
					local74 = arg0.anInt10303 - local115.anInt10303;
				} else {
					local59 = local20 & 0x7FFF;
					@Pc(138) Class3_Sub1_Sub3_Sub3_Sub2 local138 = Static618.aClass3_Sub1_Sub3_Sub3_Sub2Array1[local59];
					if (local138 == null) {
						arg0.method5201(local16, -1);
						continue;
					}
					local89 = arg0.anInt10310 - local138.anInt10310;
					local74 = arg0.anInt10303 - local138.anInt10303;
				}
				if (local74 != 0 || local89 != 0) {
					arg0.method5201(local16, (int) (Math.atan2((double) local74, (double) local89) * 2607.5945876176133D) & 0x3FFF);
				}
			} else if (!arg0.method5201(local16, -1)) {
				local14 = false;
			}
		}
		if (local14) {
			arg0.anIntArray350 = null;
			arg0.anIntArray354 = null;
		}
	}
}
