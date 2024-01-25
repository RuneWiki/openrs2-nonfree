import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static96 {

	@OriginalMember(owner = "client!dh", name = "n", descriptor = "J")
	public static long aLong58 = -1L;

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(BLjava/lang/String;Lclient!rda;I)Lclient!rd;")
	public static Class300 method1439(@OriginalArg(1) String arg0, @OriginalArg(2) Class126_Sub3 arg1) {
		@Pc(10) int local10 = OpenGL.glGenProgramARB();
		OpenGL.glBindProgramARB(34336, local10);
		OpenGL.glProgramStringARB(34336, 34933, arg0);
		OpenGL.glGetIntegerv(34379, Static324.anIntArray409, 0);
		if (Static324.anIntArray409[0] == -1) {
			OpenGL.glBindProgramARB(34336, 0);
			return new Class300(arg1, 34336, local10);
		} else {
			OpenGL.glBindProgramARB(34336, 0);
			return null;
		}
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(BLclient!laa;[Lclient!lf;)Lclient!kga;")
	public static Class187 method1447(@OriginalArg(1) Class126_Sub2_Sub1 arg0, @OriginalArg(2) Class206[] arg1) {
		for (@Pc(12) int local12 = 0; local12 < arg1.length; local12++) {
			if (arg1[local12] == null || arg1[local12].aLong161 <= 0L) {
				return null;
			}
		}
		@Pc(36) long local36 = OpenGL.glCreateProgramObjectARB();
		for (@Pc(38) int local38 = 0; local38 < arg1.length; local38++) {
			OpenGL.glAttachObjectARB(local36, arg1[local38].aLong161);
		}
		OpenGL.glLinkProgramARB(local36);
		OpenGL.glGetObjectParameterivARB(local36, 35714, Static70.anIntArray713, 0);
		if (Static70.anIntArray713[0] == 0) {
			if (Static70.anIntArray713[0] == 0) {
				System.out.println("Shader linking failed:");
			}
			OpenGL.glGetObjectParameterivARB(local36, 35716, Static70.anIntArray713, 1);
			if (Static70.anIntArray713[1] > 1) {
				@Pc(87) byte[] local87 = new byte[Static70.anIntArray713[1]];
				OpenGL.glGetInfoLogARB(local36, Static70.anIntArray713[1], Static70.anIntArray713, 0, local87, 0);
				System.out.println(new String(local87));
			}
			if (Static70.anIntArray713[0] == 0) {
				for (@Pc(108) int local108 = 0; local108 < arg1.length; local108++) {
					OpenGL.glDetachObjectARB(local36, arg1[local108].aLong161);
				}
				OpenGL.glDeleteObjectARB(local36);
				return null;
			}
		}
		return new Class187(arg0, local36, arg1);
	}
}
