import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static92 {

	@OriginalMember(owner = "client!eg", name = "H", descriptor = "[I")
	public static int[] anIntArray162;

	@OriginalMember(owner = "client!eg", name = "K", descriptor = "I")
	public static int anInt1946;

	@OriginalMember(owner = "client!eg", name = "L", descriptor = "Lclient!ph;")
	public static Class191 aClass191_1;

	@OriginalMember(owner = "client!eg", name = "G", descriptor = "Lclient!ah;")
	public static final Class1_Sub5_Sub1 aClass1_Sub5_Sub1_1 = new Class1_Sub5_Sub1(5000);

	@OriginalMember(owner = "client!eg", name = "J", descriptor = "Lclient!qu;")
	public static final Class204 aClass204_8 = new Class204(14, 0, 4, 1);

	@OriginalMember(owner = "client!eg", name = "M", descriptor = "I")
	public static int anInt1947 = -1;

	@OriginalMember(owner = "client!eg", name = "N", descriptor = "Lclient!ob;")
	public static final Class179 aClass179_20 = new Class179(57, 4);

	@OriginalMember(owner = "client!eg", name = "O", descriptor = "I")
	public static int anInt1948 = -1;

	@OriginalMember(owner = "client!eg", name = "b", descriptor = "(B)V")
	public static void method1681() {
		Static300.aClass1_Sub3_5 = new Class1_Sub3(Static144.aClass7_61.method331(Static341.anInt5770), "", Static221.anInt2659, 1001, -1, 0L, 0, 0, true, false);
	}

	@OriginalMember(owner = "client!eg", name = "c", descriptor = "(B)V")
	public static void method1683() {
		if (Static229.aClass66_1 != null) {
			Static229.aClass66_1.method5630();
		}
		if (Static253.aClass66_2 != null) {
			Static253.aClass66_2.method5630();
		}
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(ZLjava/lang/String;Lclient!kd;I)Lclient!sn;")
	public static Class224 method1684(@OriginalArg(1) String arg0, @OriginalArg(2) Class39_Sub2 arg1, @OriginalArg(3) int arg2) {
		@Pc(6) long local6 = OpenGL.glCreateShaderObjectARB(arg2);
		OpenGL.glShaderSourceARB(local6, arg0);
		OpenGL.glCompileShaderARB(local6);
		OpenGL.glGetObjectParameterivARB(local6, 35713, Static313.anIntArray465, 0);
		if (Static313.anIntArray465[0] == 0) {
			if (Static313.anIntArray465[0] == 0) {
				System.out.println("Shader compile failed:");
			}
			OpenGL.glGetObjectParameterivARB(local6, 35716, Static313.anIntArray465, 1);
			if (Static313.anIntArray465[1] > 1) {
				@Pc(47) byte[] local47 = new byte[Static313.anIntArray465[1]];
				OpenGL.glGetInfoLogARB(local6, Static313.anIntArray465[1], Static313.anIntArray465, 0, local47, 0);
				System.out.println(new String(local47));
			}
			if (Static313.anIntArray465[0] == 0) {
				OpenGL.glDeleteObjectARB(local6);
				return null;
			}
		}
		return new Class224(arg1, local6, arg2);
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(II)I")
	public static int method1685(@OriginalArg(1) int arg0) {
		return arg0 >>> 7;
	}

	@OriginalMember(owner = "client!eg", name = "i", descriptor = "(I)[Lclient!tr;")
	public static Class237[] method1686() {
		return new Class237[] { Static386.aClass237_14, Static416.aClass237_16, Static240.aClass237_11, Static276.aClass237_12, Static387.aClass237_15, Static432.aClass237_20, Static340.aClass237_13, Static118.aClass237_7, Static378.aClass237_10, Static180.aClass237_17, Static428.aClass237_18, Static193.aClass237_9, Static55.aClass237_19, Static8.aClass237_1, Static456.aClass237_21 };
	}

	@OriginalMember(owner = "client!eg", name = "b", descriptor = "(II)V")
	public static void method1687(@OriginalArg(1) int arg0) {
		@Pc(12) Class1_Sub2_Sub6 local12 = Static371.method5808(4, arg0);
		local12.method1775();
	}
}
