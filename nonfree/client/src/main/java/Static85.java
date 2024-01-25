import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static85 {

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "I")
	public static int anInt1773;

	@OriginalMember(owner = "client!dd", name = "c", descriptor = "I")
	public static int anInt1775;

	@OriginalMember(owner = "client!dd", name = "i", descriptor = "I")
	public static int anInt1779;

	@OriginalMember(owner = "client!dd", name = "j", descriptor = "Lclient!fw;")
	public static Class120 aClass120_2;

	@OriginalMember(owner = "client!dd", name = "e", descriptor = "Lclient!ek;")
	public static final Class94 aClass94_1 = new Class94();

	@OriginalMember(owner = "client!dd", name = "g", descriptor = "Z")
	public static volatile boolean aBoolean151 = true;

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(BLclient!ha;IZ)Lclient!io;")
	public static Class164 method1547(@OriginalArg(1) Class87 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		if (arg1 == -1) {
			return null;
		}
		if (Static340.anIntArray413 != null) {
			for (@Pc(13) int local13 = 0; local13 < Static340.anIntArray413.length; local13++) {
				if (Static340.anIntArray413[local13] == arg1) {
					return Static41.aClass164Array1[local13];
				}
			}
		}
		@Pc(39) Class164 local39 = (Class164) Static267.aClass233_36.method5669((long) arg1);
		if (local39 != null) {
			if (arg2 && local39.aClass114_20 == null) {
				@Pc(51) Class114 local51 = Static528.method7370(Static51.aClass97_7, arg1);
				if (local51 == null) {
					return null;
				}
				local39.aClass114_20 = local51;
			}
			return local39;
		}
		@Pc(64) Class120[] local64 = Static647.method3073(Static40.aClass97_5, arg1);
		if (local64 == null) {
			return null;
		}
		@Pc(78) Class114 local78 = Static528.method7370(Static51.aClass97_7, arg1);
		if (local78 == null) {
			return null;
		}
		if (arg2) {
			local39 = new Class164(arg0.method7965(local78, local64), local78);
		} else {
			local39 = new Class164(arg0.method7965(local78, local64));
		}
		Static267.aClass233_36.method5662(local39, (long) arg1);
		return local39;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(I)[Lclient!jha;")
	public static Class176[] method1548() {
		return new Class176[] { Static126.aClass176_5, Static519.aClass176_12, Static527.aClass176_13 };
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "([Lclient!gn;Lclient!oea;I)Lclient!as;")
	public static Class23 method1550(@OriginalArg(0) Class134[] arg0, @OriginalArg(1) Class87_Sub2 arg1) {
		for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
			if (arg0[local5] == null || arg0[local5].aLong108 <= 0L) {
				return null;
			}
		}
		@Pc(26) long local26 = OpenGL.glCreateProgramObjectARB();
		for (@Pc(28) int local28 = 0; local28 < arg0.length; local28++) {
			OpenGL.glAttachObjectARB(local26, arg0[local28].aLong108);
		}
		OpenGL.glLinkProgramARB(local26);
		OpenGL.glGetObjectParameterivARB(local26, 35714, Static573.anIntArray658, 0);
		if (Static573.anIntArray658[0] == 0) {
			if (Static573.anIntArray658[0] == 0) {
				System.out.println("Shader linking failed:");
			}
			OpenGL.glGetObjectParameterivARB(local26, 35716, Static573.anIntArray658, 1);
			if (Static573.anIntArray658[1] > 1) {
				@Pc(87) byte[] local87 = new byte[Static573.anIntArray658[1]];
				OpenGL.glGetInfoLogARB(local26, Static573.anIntArray658[1], Static573.anIntArray658, 0, local87, 0);
				System.out.println(new String(local87));
			}
			if (Static573.anIntArray658[0] == 0) {
				for (@Pc(111) int local111 = 0; local111 < arg0.length; local111++) {
					OpenGL.glDetachObjectARB(local26, arg0[local111].aLong108);
				}
				OpenGL.glDeleteObjectARB(local26);
				return null;
			}
		}
		return new Class23(arg1, local26, arg0);
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(Z)Lclient!jp;")
	public static Class2_Sub5_Sub10 method1551() {
		@Pc(13) Class2_Sub5_Sub10 local13 = (Class2_Sub5_Sub10) Static627.aClass175_13.method4280();
		if (local13 != null) {
			local13.method8599();
			local13.method8464();
			return local13;
		}
		do {
			local13 = (Class2_Sub5_Sub10) Static81.aClass175_3.method4280();
			if (local13 == null) {
				return null;
			}
			if (local13.method4386() > Static438.method6517()) {
				return null;
			}
			local13.method8599();
			local13.method8464();
		} while ((local13.aLong283 & Long.MIN_VALUE) == 0L);
		return local13;
	}
}
