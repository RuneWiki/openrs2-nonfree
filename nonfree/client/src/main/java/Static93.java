import java.awt.datatransfer.Clipboard;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static93 {

	@OriginalMember(owner = "client!dl", name = "c", descriptor = "Z")
	public static boolean aBoolean180;

	@OriginalMember(owner = "client!dl", name = "i", descriptor = "Ljava/awt/datatransfer/Clipboard;")
	public static Clipboard aClipboard1;

	@OriginalMember(owner = "client!dl", name = "r", descriptor = "Lclient!on;")
	public static Class246 aClass246_1;

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray10 = new String[100];

	@OriginalMember(owner = "client!dl", name = "m", descriptor = "F")
	public static float aFloat25 = 0.25F;

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(BILclient!sa;Lclient!pca;ILclient!dg;II)V")
	public static void method2098(@OriginalArg(1) int arg0, @OriginalArg(2) Class292 arg1, @OriginalArg(3) Class2_Sub2_Sub1_Sub2 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class2_Sub2_Sub1_Sub1 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(11) Class3_Sub37 local11 = new Class3_Sub37();
		local11.anInt7019 = arg6 << 9;
		local11.anInt7023 = arg0 << 9;
		local11.anInt7029 = arg5;
		if (arg1 != null) {
			local11.aClass292_1 = arg1;
			@Pc(32) int local32 = arg1.anInt8734;
			@Pc(35) int local35 = arg1.anInt8775;
			if (arg3 == 1 || arg3 == 3) {
				local32 = arg1.anInt8775;
				local35 = arg1.anInt8734;
			}
			local11.anInt7024 = arg1.anInt8756;
			local11.aBoolean593 = arg1.aBoolean731;
			local11.anIntArray449 = arg1.anIntArray572;
			local11.anInt7016 = arg1.anInt8764;
			local11.anInt7025 = arg1.anInt8747;
			local11.aBoolean592 = arg1.aBoolean734;
			local11.anInt7018 = arg1.anInt8748 << 9;
			local11.anInt7027 = arg6 + local35 << 9;
			local11.anInt7017 = arg1.anInt8787;
			local11.anInt7020 = arg0 + local32 << 9;
			if (arg1.anIntArray571 != null) {
				local11.aBoolean594 = true;
				local11.method5842();
			}
			if (local11.anIntArray449 != null) {
				local11.anInt7021 = (int) (Math.random() * (double) (local11.anInt7016 - local11.anInt7017)) + local11.anInt7017;
			}
			Static516.aClass183_18.method4792(local11);
		} else if (arg2 != null) {
			local11.aClass2_Sub2_Sub1_Sub2_1 = arg2;
			@Pc(190) Class169 local190 = arg2.aClass169_1;
			if (local190.anIntArray306 != null) {
				local11.aBoolean594 = true;
				local190 = local190.method4177(Static588.aClass322_1);
			}
			if (local190 != null) {
				local11.anInt7020 = arg0 + local190.anInt4979 << 9;
				local11.anInt7027 = local190.anInt4979 + arg6 << 9;
				local11.anInt7024 = Static79.method8447(arg2);
				local11.anInt7025 = local190.anInt4999;
				local11.aBoolean592 = local190.aBoolean421;
				local11.anInt7018 = local190.anInt5001 << 9;
			}
			Static22.aClass183_1.method4792(local11);
		} else if (arg4 != null) {
			local11.aClass2_Sub2_Sub1_Sub1_1 = arg4;
			local11.anInt7020 = arg0 + arg4.method6311() << 9;
			local11.anInt7027 = arg6 + arg4.method6311() << 9;
			local11.anInt7024 = Static569.method8163(arg4);
			local11.anInt7018 = arg4.anInt2198 << 9;
			local11.anInt7025 = arg4.anInt2214;
			local11.aBoolean592 = arg4.aBoolean173;
			Static521.aClass25_39.method945(local11, (long) arg4.anInt7603);
			return;
		}
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "([Lclient!tc;BIIIZ)V")
	public static void method2101(@OriginalArg(0) Class305[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		for (@Pc(6) int local6 = 0; local6 < arg0.length; local6++) {
			@Pc(11) Class305 local11 = arg0[local6];
			if (local11 != null && arg2 == local11.anInt9199) {
				Static149.method2487(arg3, arg1, arg4, local11);
				Static368.method6034(arg3, arg1, local11);
				if (local11.anInt9215 > local11.anInt9161 - local11.anInt9242) {
					local11.anInt9215 = local11.anInt9161 - local11.anInt9242;
				}
				if (local11.anInt9178 - local11.anInt9160 < local11.anInt9233) {
					local11.anInt9233 = local11.anInt9178 - local11.anInt9160;
				}
				if (local11.anInt9215 < 0) {
					local11.anInt9215 = 0;
				}
				if (local11.anInt9233 < 0) {
					local11.anInt9233 = 0;
				}
				if (local11.anInt9211 == 0) {
					Static194.method3313(arg4, local11);
				}
			}
		}
	}
}
