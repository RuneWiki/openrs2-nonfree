import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static87 {

	@OriginalMember(owner = "client!fg", name = "n", descriptor = "Lclient!qe;")
	public static Class132 aClass132_1;

	@OriginalMember(owner = "client!fg", name = "p", descriptor = "I")
	public static int anInt1556;

	@OriginalMember(owner = "client!fg", name = "b", descriptor = "[I")
	public static final int[] anIntArray104 = new int[250];

	@OriginalMember(owner = "client!fg", name = "o", descriptor = "[I")
	public static final int[] anIntArray105 = new int[5];

	@OriginalMember(owner = "client!fg", name = "r", descriptor = "[Z")
	public static final boolean[] aBooleanArray9 = new boolean[200];

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/Class;")
	public static Class method1245(@OriginalArg(1) String arg0) throws ClassNotFoundException {
		if (arg0.equals("B")) {
			return Byte.TYPE;
		} else if (arg0.equals("I")) {
			return Integer.TYPE;
		} else if (arg0.equals("S")) {
			return Short.TYPE;
		} else if (arg0.equals("J")) {
			return Long.TYPE;
		} else if (arg0.equals("Z")) {
			return Boolean.TYPE;
		} else if (arg0.equals("F")) {
			return Float.TYPE;
		} else if (arg0.equals("D")) {
			return Double.TYPE;
		} else if (arg0.equals("C")) {
			return Character.TYPE;
		} else {
			return Class.forName(arg0);
		}
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(ILclient!kh;)Lclient!bp;")
	public static Class27_Sub1 method1246(@OriginalArg(1) Class11_Sub25 arg0) {
		return new Class27_Sub1(arg0.method5220(), arg0.method5220(), arg0.method5220(), arg0.method5220(), arg0.method5221(), arg0.method5221(), arg0.method5185());
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(IIIIZZ)V")
	public static void method1247(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) boolean arg4) {
		Static232.anInt4703 = arg0;
		Static300.anInt5931 = arg1;
		Static209.anInt4263 = arg2;
		Static293.aClass106ArrayArrayArray3 = new Class106[4][Static232.anInt4703][Static300.anInt5931];
		Static129.aClass77Array3 = new Class77[4];
		if (arg3) {
			Static118.aClass106ArrayArrayArray1 = new Class106[1][Static232.anInt4703][Static300.anInt5931];
			Static303.anIntArrayArray55 = new int[Static232.anInt4703][Static300.anInt5931];
			Static79.aClass77Array5 = new Class77[1];
		} else {
			Static118.aClass106ArrayArrayArray1 = null;
			Static303.anIntArrayArray55 = null;
			Static79.aClass77Array5 = null;
		}
		if (arg4) {
			Static117.anIntArrayArrayArray9 = new int[4][arg0][arg1];
			Static171.aClass11_Sub5_Sub1Array2 = new Class11_Sub5_Sub1[255];
			Static117.aBooleanArray10 = new boolean[255];
			Static219.anInt4457 = 0;
		} else {
			Static117.anIntArrayArrayArray9 = null;
			Static171.aClass11_Sub5_Sub1Array2 = null;
			Static117.aBooleanArray10 = null;
			Static219.anInt4457 = 0;
		}
		Static355.method5699(false);
		Static135.aClass177Array2 = new Class177[500];
		Static339.anInt6547 = 0;
		Static23.aClass177Array1 = new Class177[500];
		Static274.anInt5509 = 0;
		Static171.anIntArrayArrayArray11 = new int[4][Static232.anInt4703 + 1][Static300.anInt5931 + 1];
		Static220.aClass67_Sub3Array3 = new Class67_Sub3[5000];
		Static249.anInt4974 = 0;
		Static8.aBooleanArrayArray1 = new boolean[Static209.anInt4263 + Static209.anInt4263 + 1][Static209.anInt4263 + Static209.anInt4263 + 1];
		Static195.aBooleanArrayArray6 = new boolean[Static209.anInt4263 + Static209.anInt4263 + 2][Static209.anInt4263 + Static209.anInt4263 + 2];
		Static74.aClass38_1 = null;
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(IIIIII)V")
	public static void method1248(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(16) int local16;
		for (@Pc(7) int local7 = arg0; local7 < arg0 + arg1; local7++) {
			for (local16 = arg3; local16 < arg4 + arg3; local16++) {
				if (local16 >= 0 && local16 < Static24.anInt454 && local7 >= 0 && Static240.anInt4832 > local7) {
					Static263.anIntArrayArrayArray13[arg2][local16][local7] = arg2 <= 0 ? 0 : Static263.anIntArrayArrayArray13[arg2 - 1][local16][local7] - 240;
				}
			}
		}
		if (arg3 > 0 && Static24.anInt454 > arg3) {
			for (local16 = arg0 + 1; local16 < arg1 + arg0; local16++) {
				if (local16 >= 0 && Static240.anInt4832 > local16) {
					Static263.anIntArrayArrayArray13[arg2][arg3][local16] = Static263.anIntArrayArrayArray13[arg2][arg3 - 1][local16];
				}
			}
		}
		if (arg0 > 0 && Static240.anInt4832 > arg0) {
			for (local16 = arg3 + 1; local16 < arg3 + arg4; local16++) {
				if (local16 >= 0 && local16 < Static24.anInt454) {
					Static263.anIntArrayArrayArray13[arg2][local16][arg0] = Static263.anIntArrayArrayArray13[arg2][local16][arg0 - 1];
				}
			}
		}
		if (arg3 < 0 || arg0 < 0 || Static24.anInt454 <= arg3 || arg0 >= Static240.anInt4832) {
			return;
		}
		if (arg2 != 0) {
			if (arg3 > 0 && Static263.anIntArrayArrayArray13[arg2][arg3 - 1][arg0] != Static263.anIntArrayArrayArray13[arg2 - 1][arg3 - 1][arg0]) {
				Static263.anIntArrayArrayArray13[arg2][arg3][arg0] = Static263.anIntArrayArrayArray13[arg2][arg3 - 1][arg0];
				return;
			}
			if (arg0 > 0 && Static263.anIntArrayArrayArray13[arg2 - 1][arg3][arg0 - 1] != Static263.anIntArrayArrayArray13[arg2][arg3][arg0 - 1]) {
				Static263.anIntArrayArrayArray13[arg2][arg3][arg0] = Static263.anIntArrayArrayArray13[arg2][arg3][arg0 - 1];
				return;
			}
			if (arg3 > 0 && arg0 > 0 && Static263.anIntArrayArrayArray13[arg2][arg3 - 1][arg0 - 1] != Static263.anIntArrayArrayArray13[arg2 - 1][arg3 - 1][arg0 - 1]) {
				Static263.anIntArrayArrayArray13[arg2][arg3][arg0] = Static263.anIntArrayArrayArray13[arg2][arg3 - 1][arg0 - 1];
				return;
			}
			return;
		}
		if (arg3 > 0 && Static263.anIntArrayArrayArray13[arg2][arg3 - 1][arg0] != 0) {
			Static263.anIntArrayArrayArray13[arg2][arg3][arg0] = Static263.anIntArrayArrayArray13[arg2][arg3 - 1][arg0];
			return;
		}
		if (arg0 > 0 && Static263.anIntArrayArrayArray13[arg2][arg3][arg0 - 1] != 0) {
			Static263.anIntArrayArrayArray13[arg2][arg3][arg0] = Static263.anIntArrayArrayArray13[arg2][arg3][arg0 - 1];
			return;
		}
		if (arg3 > 0 && arg0 > 0 && Static263.anIntArrayArrayArray13[arg2][arg3 - 1][arg0 - 1] != 0) {
			Static263.anIntArrayArrayArray13[arg2][arg3][arg0] = Static263.anIntArrayArrayArray13[arg2][arg3 - 1][arg0 - 1];
			return;
		}
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(B)V")
	public static void method1249() {
		@Pc(15) Class26 local15 = Static34.aClass26_4;
		synchronized (Static34.aClass26_4) {
			Static34.aClass26_4.method333();
		}
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(BLjava/lang/String;)I")
	public static int method1250(@OriginalArg(1) String arg0) {
		return Static17.method226(10, arg0);
	}

	@OriginalMember(owner = "client!fg", name = "b", descriptor = "(ILjava/lang/String;)Z")
	public static boolean method1251(@OriginalArg(1) String arg0) {
		return Static225.method4018(arg0);
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(IIILjava/lang/String;BIJLjava/lang/String;)V")
	public static void method1252(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(5) int arg4, @OriginalArg(6) long arg5, @OriginalArg(7) String arg6) {
		if (!Static38.aBoolean40 && Static13.anInt245 < 500) {
			@Pc(16) int local16 = arg4 == -1 ? Static288.anInt5695 : arg4;
			@Pc(27) Class11_Sub14 local27 = new Class11_Sub14(arg6, arg3, local16, arg2, arg5, arg1, arg0);
			Static119.aClass16_21.method190(local27);
			Static13.anInt245++;
		}
	}
}
