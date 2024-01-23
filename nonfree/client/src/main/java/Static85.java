import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static85 {

	@OriginalMember(owner = "client!gf", name = "g", descriptor = "I")
	public static int anInt1982 = -1;

	@OriginalMember(owner = "client!gf", name = "p", descriptor = "[I")
	public static int[] anIntArray202 = new int[14];

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "()V")
	public static void method1463() {
		@Pc(1) GL local1 = Static294.aGL1;
		local1.glDisableClientState(32886);
		Static294.method4496(false);
		local1.glDisable(2929);
		local1.glPushAttrib(128);
		local1.glFogf(2915, 3072.0F);
		Static294.method4492();
		for (@Pc(19) int local19 = 0; local19 < Static261.aClass1_Sub28ArrayArray3[0].length; local19++) {
			@Pc(31) Class1_Sub28 local31 = Static261.aClass1_Sub28ArrayArray3[0][local19];
			if (local31.anInt5509 >= 0 && Static222.method3475(Static237.anInterface1_1.method4601(local31.anInt5509))) {
				local1.glColor4fv(Static116.method1876(local31.anInt5511), 0);
				@Pc(58) float local58 = 201.5F - (local31.aBoolean346 ? 1.0F : 0.5F);
				local31.method4172(Static7.aClass1_Sub2ArrayArrayArray1, local58, true);
			}
		}
		local1.glEnableClientState(32886);
		Static294.method4500();
		local1.glEnable(2929);
		local1.glPopAttrib();
		Static294.method4495();
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(II)Lclient!lf;")
	public static Class98 method1464(@OriginalArg(0) int arg0) {
		@Pc(10) Class98 local10 = (Class98) Static151.aClass89_19.method2268((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(26) byte[] local26 = Static313.aClass168_211.method4058(arg0, 1);
		local10 = new Class98();
		local10.anInt3515 = arg0;
		if (local26 != null) {
			local10.method2551(new Class1_Sub14(local26));
		}
		local10.method2552();
		if (local10.anInt3506 == 2 && Static6.aClass186_1.method4570((long) arg0) == null) {
			Static6.aClass186_1.method4575((long) arg0, new Class1_Sub17(Static208.anInt4501));
			Static40.aClass98Array1[Static208.anInt4501++] = local10;
		}
		Static151.aClass89_19.method2272((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(BILclient!th;)Lclient!si;")
	public static Class1_Sub3_Sub13_Sub2 method1466(@OriginalArg(1) int arg0, @OriginalArg(2) Class168 arg1) {
		return Static57.method4770(arg1, arg0) ? Static286.method4388() : null;
	}
}
