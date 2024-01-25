import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static94 {

	@OriginalMember(owner = "client!dea", name = "b", descriptor = "I")
	public static int anInt9085;

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "(Lclient!bga;[BII)Lclient!ifa;")
	public static Class150 method7631(@OriginalArg(0) Class20_Sub2_Sub2 arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2) {
		if (arg1 == null || arg1.length == 0) {
			return null;
		}
		@Pc(16) long local16 = OpenGL.glCreateShaderObjectARB(arg2);
		OpenGL.glShaderSourceRawARB(local16, arg1);
		OpenGL.glCompileShaderARB(local16);
		OpenGL.glGetObjectParameterivARB(local16, 35713, Static175.anIntArray216, 0);
		if (Static175.anIntArray216[0] == 0) {
			if (Static175.anIntArray216[0] == 0) {
				System.out.println("Shader compile failed:");
			}
			OpenGL.glGetObjectParameterivARB(local16, 35716, Static175.anIntArray216, 1);
			if (Static175.anIntArray216[1] > 1) {
				@Pc(64) byte[] local64 = new byte[Static175.anIntArray216[1]];
				OpenGL.glGetInfoLogARB(local16, Static175.anIntArray216[1], Static175.anIntArray216, 0, local64, 0);
				System.out.println(new String(local64));
			}
			if (Static175.anIntArray216[0] == 0) {
				OpenGL.glDeleteObjectARB(local16);
				return null;
			}
		}
		return new Class150(arg0, local16, arg2);
	}

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "(II)Lclient!jk;")
	public static Class2_Sub6_Sub11 method7632(@OriginalArg(1) int arg0) {
		@Pc(10) Class2_Sub6_Sub11 local10 = (Class2_Sub6_Sub11) Static8.aClass379_1.method9219((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static38.aClass157_28.method4564(arg0, 0);
		if (local20 == null || local20.length <= 1) {
			return null;
		}
		try {
			local10 = Static257.method4730(local20);
		} catch (@Pc(34) Exception local34) {
			throw new RuntimeException(local34.getMessage() + " S: " + arg0);
		}
		Static8.aClass379_1.method9222((long) arg0, local10);
		return local10;
	}
}
