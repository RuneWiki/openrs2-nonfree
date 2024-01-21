import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static86 {

	@OriginalMember(owner = "client!pa", name = "u", descriptor = "Lclient!rc;")
	public static Class65 aClass65_3;

	@OriginalMember(owner = "client!pa", name = "z", descriptor = "[I")
	public static int[] anIntArray196;

	@OriginalMember(owner = "client!pa", name = "H", descriptor = "I")
	public static int anInt2357;

	@OriginalMember(owner = "client!pa", name = "I", descriptor = "Lclient!oc;")
	public static Class3_Sub1_Sub1_Sub4 aClass3_Sub1_Sub1_Sub4_54;

	@OriginalMember(owner = "client!pa", name = "c", descriptor = "Lclient!n;")
	public static Class52 aClass52_46 = new Class52(64);

	@OriginalMember(owner = "client!pa", name = "q", descriptor = "Z")
	public static boolean aBoolean108 = false;

	@OriginalMember(owner = "client!pa", name = "s", descriptor = "I")
	public static int anInt2354 = 0;

	@OriginalMember(owner = "client!pa", name = "t", descriptor = "I")
	public static int anInt2355 = 0;

	@OriginalMember(owner = "client!pa", name = "v", descriptor = "[I")
	public static int[] anIntArray195 = new int[200];

	@OriginalMember(owner = "client!pa", name = "w", descriptor = "Lclient!oa;")
	private static Class56 aClass56_1236 = Static33.method650("No reply from loginserver)3");

	@OriginalMember(owner = "client!pa", name = "G", descriptor = "Lclient!oa;")
	private static Class56 aClass56_1243 = Static33.method650("Connecting to friendserver");

	@OriginalMember(owner = "client!pa", name = "x", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1237 = aClass56_1243;

	@OriginalMember(owner = "client!pa", name = "y", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1238 = aClass56_1236;

	@OriginalMember(owner = "client!pa", name = "C", descriptor = "Lclient!oa;")
	private static Class56 aClass56_1241 = Static33.method650("Enter name of friend to add to list");

	@OriginalMember(owner = "client!pa", name = "A", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1239 = aClass56_1241;

	@OriginalMember(owner = "client!pa", name = "B", descriptor = "Lclient!oa;")
	private static Class56 aClass56_1240 = Static33.method650("FULL");

	@OriginalMember(owner = "client!pa", name = "J", descriptor = "Lclient!oa;")
	private static Class56 aClass56_1244 = Static33.method650("Add ignore");

	@OriginalMember(owner = "client!pa", name = "D", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1242 = aClass56_1244;

	@OriginalMember(owner = "client!pa", name = "E", descriptor = "[I")
	public static int[] anIntArray197 = new int[100];

	@OriginalMember(owner = "client!pa", name = "F", descriptor = "I")
	public static int anInt2356 = 0;

	@OriginalMember(owner = "client!pa", name = "K", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1245 = Static33.method650("Wordpack geladen)3");

	@OriginalMember(owner = "client!pa", name = "L", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1246 = aClass56_1240;

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(BII)I")
	public static int method1597(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = 0;
		while (arg0 > 0) {
			arg0--;
			local7 = arg1 & 0x1 | local7 << 1;
			arg1 >>>= 0x1;
		}
		return local7;
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(II)Z")
	public static boolean method1598(@OriginalArg(1) int arg0) {
		return (arg0 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(B)V")
	public static void method1599() {
		anIntArray195 = null;
		aClass56_1245 = null;
		aClass65_3 = null;
		aClass56_1246 = null;
		aClass56_1238 = null;
		aClass3_Sub1_Sub1_Sub4_54 = null;
		aClass56_1240 = null;
		aClass56_1243 = null;
		aClass56_1242 = null;
		anIntArray196 = null;
		anIntArray197 = null;
		aClass56_1239 = null;
		aClass56_1241 = null;
		aClass56_1237 = null;
		aClass52_46 = null;
		aClass56_1236 = null;
		aClass56_1244 = null;
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(Z[Lclient!oa;)[Lclient!oa;")
	public static Class56[] method1600(@OriginalArg(1) Class56[] arg0) {
		@Pc(8) Class56[] local8 = new Class56[5];
		for (@Pc(10) int local10 = 0; local10 < 5; local10++) {
			local8[local10] = Static84.method1524(new Class56[] { Static111.method1851(local10), Static3.aClass56_1722 });
			if (arg0 != null && arg0[local10] != null) {
				local8[local10] = Static84.method1524(new Class56[] { local8[local10], arg0[local10] });
			}
		}
		return local8;
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(I)V")
	public static void method1601() {
		Static2.aClass30_1.method813();
		Static55.method1046();
	}

	@OriginalMember(owner = "client!pa", name = "b", descriptor = "(I)V")
	public static void method1602() {
		Static50.anInt1424 = 0;
		Static60.anInt1776 = 0;
		Static35.method670();
		Static13.method245();
		Static49.method977();
		Static127.method2039();
		@Pc(25) int local25;
		for (@Pc(19) int local19 = 0; local19 < Static50.anInt1424; local19++) {
			local25 = Static7.anIntArray28[local19];
			if (Static98.anInt2566 != Static29.aClass3_Sub1_Sub2_Sub4_Sub1Array1[local25].anInt3147) {
				Static29.aClass3_Sub1_Sub2_Sub4_Sub1Array1[local25] = null;
			}
		}
		if (Static73.anInt2013 != Static31.aClass3_Sub2_Sub1_3.anInt413) {
			throw new RuntimeException("gpp1 pos:" + Static31.aClass3_Sub2_Sub1_3.anInt413 + " psize:" + Static73.anInt2013);
		}
		for (local25 = 0; local25 < Static110.anInt2767; local25++) {
			if (Static29.aClass3_Sub1_Sub2_Sub4_Sub1Array1[Static54.anIntArray108[local25]] == null) {
				throw new RuntimeException("gpp2 pos:" + local25 + " size:" + Static110.anInt2767);
			}
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(Ljava/awt/Component;Z)V")
	public static void method1603(@OriginalArg(0) Component arg0) {
		@Pc(1) Method local1 = Static58.aMethod2;
		if (local1 != null) {
			try {
				local1.invoke(arg0, Boolean.FALSE);
			} catch (@Pc(20) Throwable local20) {
			}
		}
		arg0.addKeyListener(Static119.aClass10_1);
		arg0.addFocusListener(Static119.aClass10_1);
	}
}
