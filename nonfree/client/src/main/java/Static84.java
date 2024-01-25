import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static84 {

	@OriginalMember(owner = "client!dba", name = "u", descriptor = "Lclient!vo;")
	public static Class348 aClass348_28;

	@OriginalMember(owner = "client!dba", name = "z", descriptor = "Lclient!g;")
	public static Class13 aClass13_1;

	@OriginalMember(owner = "client!dba", name = "s", descriptor = "I")
	public static int anInt2249 = 0;

	@OriginalMember(owner = "client!dba", name = "w", descriptor = "Lclient!tl;")
	public static final Class4_Sub48 aClass4_Sub48_1 = new Class4_Sub48(0, 0);

	@OriginalMember(owner = "client!dba", name = "A", descriptor = "[S")
	private static final short[] aShortArray20 = new short[] { 952, 20413, -21592, 11204, -10305 };

	@OriginalMember(owner = "client!dba", name = "B", descriptor = "[S")
	private static final short[] aShortArray21 = new short[] { 957, 20418, -21587, 11209, -10300 };

	@OriginalMember(owner = "client!dba", name = "C", descriptor = "[S")
	private static final short[] aShortArray22 = new short[] { 967, 20428, -21577, 11219, -10290 };

	@OriginalMember(owner = "client!dba", name = "D", descriptor = "[S")
	private static final short[] aShortArray23 = new short[] { 962, 20423, -21582, 11214, -10295 };

	@OriginalMember(owner = "client!dba", name = "E", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray5 = new String[200];

	@OriginalMember(owner = "client!dba", name = "F", descriptor = "[[S")
	public static final short[][] aShortArrayArray1 = new short[][] { aShortArray22, aShortArray23, aShortArray21, aShortArray20 };

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "(IZ)V")
	public static void method1789(@OriginalArg(1) boolean arg0) {
		if (Static437.aString173.length() == 0) {
			return;
		}
		Static47.method1139("--> " + Static437.aString173);
		Static299.method4762(arg0, false, Static437.aString173);
		Static437.aString173 = "";
		Static50.anInt1334 = 0;
		Static241.anInt5029 = 0;
	}

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;I)V")
	public static void method1791(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4, @OriginalArg(5) String arg5) {
		Static128.method2313(arg4, arg0, null, arg2, -1, arg3, arg1, arg5);
	}
}
