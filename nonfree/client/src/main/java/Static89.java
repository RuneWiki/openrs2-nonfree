import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static89 {

	@OriginalMember(owner = "client!fk", name = "p", descriptor = "J")
	public static long aLong58;

	@OriginalMember(owner = "client!fk", name = "r", descriptor = "Lclient!sg;")
	public static Class97 aClass97_12;

	@OriginalMember(owner = "client!fk", name = "i", descriptor = "Lclient!kn;")
	public static final Class117 aClass117_34 = new Class117("Starting 3d Library", "Starte 3D-Softwarebibliothek.", "Démarrage de la librairie 3D", "Iniciando biblioteca 3D");

	@OriginalMember(owner = "client!fk", name = "n", descriptor = "I")
	public static int anInt1600 = 0;

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(ZIZIFIII)[I")
	public static int[] method1291(@OriginalArg(4) float arg0) {
		@Pc(6) int[] local6 = new int[2048];
		@Pc(10) Class11_Sub2_Sub20 local10 = new Class11_Sub2_Sub20();
		local10.anInt3421 = 35;
		local10.anInt3424 = (int) (arg0 * 4096.0F);
		local10.aBoolean217 = true;
		local10.anInt3427 = 8;
		local10.anInt3416 = 8;
		local10.anInt3422 = 4;
		local10.method5708();
		Static243.method5702(2048, 1);
		local10.method2814(0, local6);
		return local6;
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(IIII)I")
	public static int method1292(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg2 & 0x3;
		if (local3 == 0) {
			return arg1;
		} else if (local3 == 1) {
			return 7 - arg0;
		} else if (local3 == 2) {
			return 7 - arg1;
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(Ljava/lang/String;II)V")
	public static void method1295(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		Static313.aClass11_Sub25_Sub1_5.method2454(221);
		Static313.aClass11_Sub25_Sub1_5.method5186(Static350.method5658(arg0) + 1);
		Static313.aClass11_Sub25_Sub1_5.method5214(arg1);
		Static313.aClass11_Sub25_Sub1_5.method5173(arg0);
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(II)Lclient!wh;")
	public static Class213 method1296(@OriginalArg(0) int arg0) {
		@Pc(5) Class26 local5 = Static253.aClass26_45;
		@Pc(14) Class213 local14;
		synchronized (Static253.aClass26_45) {
			local14 = (Class213) Static253.aClass26_45.method332((long) arg0);
		}
		if (local14 != null) {
			return local14;
		}
		@Pc(42) byte[] local42 = Static198.aClass144_58.method3896(Static352.method5663(arg0), Static96.method1452(arg0));
		local14 = new Class213();
		local14.anInt6657 = arg0;
		if (local42 != null) {
			local14.method5640(new Class11_Sub25(local42));
		}
		@Pc(60) Class26 local60 = Static253.aClass26_45;
		synchronized (Static253.aClass26_45) {
			Static253.aClass26_45.method330((long) arg0, local14);
			return local14;
		}
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(IIILclient!ko;II)Ljava/awt/Frame;")
	public static Frame method1297(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class118 arg2, @OriginalArg(4) int arg3) {
		if (!arg2.method2699()) {
			return null;
		}
		@Pc(20) Class53[] local20 = Static42.method635(arg2);
		if (local20 == null) {
			return null;
		}
		@Pc(26) boolean local26 = false;
		for (@Pc(28) int local28 = 0; local28 < local20.length; local28++) {
			if (local20[local28].anInt1148 == arg1 && arg3 == local20[local28].anInt1146 && (!local26 || local20[local28].anInt1152 > arg0)) {
				arg0 = local20[local28].anInt1152;
				local26 = true;
			}
		}
		if (!local26) {
			return null;
		}
		@Pc(90) Class2 local90 = arg2.method2704(arg0, arg1, arg3);
		while (local90.anInt6 == 0) {
			Static244.method4311(10L);
		}
		@Pc(109) Frame local109 = (Frame) local90.anObject1;
		if (local109 == null) {
			return null;
		} else if (local90.anInt6 == 2) {
			Static320.method5313(local109, arg2);
			return null;
		} else {
			return local109;
		}
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(IILclient!nq;IZIB)V")
	public static void method1300(@OriginalArg(0) int arg0, @OriginalArg(2) Class144 arg1, @OriginalArg(5) int arg2) {
		Static190.anInt3890 = 0;
		Static240.anInt4833 = 2;
		Static329.anInt6323 = 1;
		Static226.aBoolean305 = false;
		Static178.anInt3536 = arg2;
		Static281.anInt5587 = arg0;
		Static177.aClass144_46 = arg1;
	}
}
