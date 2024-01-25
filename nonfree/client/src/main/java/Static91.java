import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static91 {

	@OriginalMember(owner = "client!eh", name = "c", descriptor = "Lclient!s;")
	public static final Class217 aClass217_43 = new Class217(100, -1);

	@OriginalMember(owner = "client!eh", name = "i", descriptor = "Lclient!mf;")
	public static final Class163 aClass163_16 = new Class163();

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(IIIII)V")
	public static void method1692(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		Static28.anInt450 = arg2;
		Static426.anInt7179 = arg0;
		Static73.anInt1515 = arg3;
		Static203.anInt4008 = arg1;
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(ZLclient!da;[Lclient!rs;)Lclient!vo;")
	public static Class261 method1694(@OriginalArg(1) Class50_Sub1 arg0, @OriginalArg(2) Class214[] arg1) {
		for (@Pc(12) int local12 = 0; local12 < arg1.length; local12++) {
			if (arg1[local12] == null || arg1[local12].aLong213 <= 0L) {
				return null;
			}
		}
		@Pc(38) long local38 = OpenGL.glCreateProgramObjectARB();
		for (@Pc(40) int local40 = 0; local40 < arg1.length; local40++) {
			OpenGL.glAttachObjectARB(local38, arg1[local40].aLong213);
		}
		OpenGL.glLinkProgramARB(local38);
		OpenGL.glGetObjectParameterivARB(local38, 35714, Static195.anIntArray391, 0);
		if (Static195.anIntArray391[0] == 0) {
			if (Static195.anIntArray391[0] == 0) {
				System.out.println("Shader linking failed:");
			}
			OpenGL.glGetObjectParameterivARB(local38, 35716, Static195.anIntArray391, 1);
			if (Static195.anIntArray391[1] > 1) {
				@Pc(98) byte[] local98 = new byte[Static195.anIntArray391[1]];
				OpenGL.glGetInfoLogARB(local38, Static195.anIntArray391[1], Static195.anIntArray391, 0, local98, 0);
				System.out.println(new String(local98));
			}
			if (Static195.anIntArray391[0] == 0) {
				for (@Pc(122) int local122 = 0; local122 < arg1.length; local122++) {
					OpenGL.glDetachObjectARB(local38, arg1[local122].aLong213);
				}
				OpenGL.glDeleteObjectARB(local38);
				return null;
			}
		}
		return new Class261(arg0, local38, arg1);
	}
}
