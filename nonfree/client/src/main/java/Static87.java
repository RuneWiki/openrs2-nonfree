import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static87 {

	@OriginalMember(owner = "client!da", name = "r", descriptor = "Lclient!oaa;")
	public static final Class234 aClass234_24 = new Class234(2, 4, 4, 0);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(II)Lclient!at;")
	public static Class24 method8101(@OriginalArg(1) int arg0) {
		@Pc(12) int local12 = arg0 >> 16;
		@Pc(16) int local16 = arg0 & 0xFFFF;
		if (Static631.aClass24ArrayArray2[local12] == null || Static631.aClass24ArrayArray2[local12][local16] == null) {
			@Pc(30) boolean local30 = Static80.method2326(local12);
			if (!local30) {
				return null;
			}
		}
		return Static631.aClass24ArrayArray2[local12][local16];
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!bga;[Lclient!ifa;I)Lclient!lha;")
	public static Class195 method8113(@OriginalArg(0) Class20_Sub2_Sub2 arg0, @OriginalArg(1) Class150[] arg1) {
		for (@Pc(12) int local12 = 0; local12 < arg1.length; local12++) {
			if (arg1[local12] == null || arg1[local12].aLong111 <= 0L) {
				return null;
			}
		}
		@Pc(36) long local36 = OpenGL.glCreateProgramObjectARB();
		for (@Pc(38) int local38 = 0; local38 < arg1.length; local38++) {
			OpenGL.glAttachObjectARB(local36, arg1[local38].aLong111);
		}
		OpenGL.glLinkProgramARB(local36);
		OpenGL.glGetObjectParameterivARB(local36, 35714, Static495.anIntArray599, 0);
		if (Static495.anIntArray599[0] == 0) {
			if (Static495.anIntArray599[0] == 0) {
				System.out.println("Shader linking failed:");
			}
			OpenGL.glGetObjectParameterivARB(local36, 35716, Static495.anIntArray599, 1);
			if (Static495.anIntArray599[1] > 1) {
				@Pc(94) byte[] local94 = new byte[Static495.anIntArray599[1]];
				OpenGL.glGetInfoLogARB(local36, Static495.anIntArray599[1], Static495.anIntArray599, 0, local94, 0);
				System.out.println(new String(local94));
			}
			if (Static495.anIntArray599[0] == 0) {
				for (@Pc(115) int local115 = 0; local115 < arg1.length; local115++) {
					OpenGL.glDetachObjectARB(local36, arg1[local115].aLong111);
				}
				OpenGL.glDeleteObjectARB(local36);
				return null;
			}
		}
		return new Class195(arg0, local36, arg1);
	}
}
