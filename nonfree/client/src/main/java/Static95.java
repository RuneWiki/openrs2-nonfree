import java.awt.Color;
import java.awt.Frame;
import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static95 {

	@OriginalMember(owner = "client!el", name = "q", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame1;

	@OriginalMember(owner = "client!el", name = "s", descriptor = "I")
	public static int anInt1954;

	@OriginalMember(owner = "client!el", name = "m", descriptor = "Ljava/util/zip/CRC32;")
	public static final CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!el", name = "n", descriptor = "Z")
	public static boolean aBoolean121 = false;

	@OriginalMember(owner = "client!el", name = "u", descriptor = "[Lclient!ei;")
	public static final Class10_Sub1_Sub4[] aClass10_Sub1_Sub4Array1 = new Class10_Sub1_Sub4[14];

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(Lclient!gh;III)V")
	public static void method1721(@OriginalArg(0) Class89 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static401.aBoolean489) {
			@Pc(171) Class155 local171 = Static218.anInt4149 == -1 ? null : Static376.aClass204_1.method4526(Static218.anInt4149);
			if (Static56.method1002(arg0).method4504() && (Static46.anInt880 & 0x20) != 0 && (local171 == null || arg0.method2295(local171.anInt4302, Static218.anInt4149) != local171.anInt4302)) {
				Static260.method3744(Static312.aString52, 3, 0L, arg0.anInt2720, false, Static24.anInt394, Static70.aString10 + " -> " + arg0.aString18, true, arg0.anInt2670, arg0.anInt2677);
			}
			return;
		}
		@Pc(12) String local12;
		for (@Pc(5) int local5 = 9; local5 >= 5; local5--) {
			local12 = Static25.method334(arg0, local5);
			if (local12 != null) {
				Static260.method3744(local12, 1001, (long) (local5 + 1), arg0.anInt2720, false, Static30.method433(arg0, local5), arg0.aString18, true, arg0.anInt2670, arg0.anInt2677);
			}
		}
		local12 = Static11.method162(arg0);
		if (local12 != null) {
			Static260.method3744(local12, 30, 0L, arg0.anInt2720, false, arg0.anInt2746, arg0.aString18, true, arg0.anInt2670, arg0.anInt2677);
		}
		for (@Pc(73) int local73 = 4; local73 >= 0; local73--) {
			@Pc(80) String local80 = Static25.method334(arg0, local73);
			if (local80 != null) {
				Static260.method3744(local80, 45, (long) (local73 + 1), arg0.anInt2720, false, Static30.method433(arg0, local73), arg0.aString18, true, arg0.anInt2670, arg0.anInt2677);
			}
		}
		if (!Static56.method1002(arg0).method4506()) {
			return;
		}
		if (arg0.aString19 == null) {
			Static260.method3744(Static278.aClass182_211.method4155(Static191.anInt3842), 19, 0L, arg0.anInt2720, false, -1, "", true, arg0.anInt2670, arg0.anInt2677);
		} else {
			Static260.method3744(arg0.aString19, 19, 0L, arg0.anInt2720, false, -1, "", true, arg0.anInt2670, arg0.anInt2677);
		}
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(I)V")
	public static void method1722() {
		Static310.method4308(Static404.aClass27_95);
		Static337.aClass10_Sub8_Sub2_2.method2458(Static211.method3254());
		Static337.aClass10_Sub8_Sub2_2.method2509(Static90.anInt1891);
		Static337.aClass10_Sub8_Sub2_2.method2509(Static340.anInt5756);
		Static337.aClass10_Sub8_Sub2_2.method2458(Static361.aClass85_Sub1_1.anInt2486);
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(B)V")
	public static void method1723() {
		Static197.aClass245_1.method5908();
		Static113.aClass13_1.method4120();
		if (Static270.aClass132_1 != null) {
			Static270.aClass132_1.method3236(Static412.aCanvas7);
		}
		Static232.aClient5.method969();
		Static412.aCanvas7.setBackground(Color.black);
		Static428.anInt7198 = -1;
		Static197.aClass245_1 = Static364.method4883(Static412.aCanvas7);
		Static113.aClass13_1 = Static106.method1865(Static412.aCanvas7);
		if (Static270.aClass132_1 != null) {
			Static270.aClass132_1.method3237(Static412.aCanvas7);
		}
	}

	@OriginalMember(owner = "client!el", name = "b", descriptor = "(I)Z")
	public static boolean method1724() {
		try {
			if (Static152.anInt3124 == 2) {
				if (Static301.aClass10_Sub43_1 == null) {
					Static301.aClass10_Sub43_1 = Static470.method5642(Static285.aClass187_87, Static345.anInt5874, Static398.anInt6739);
					if (Static301.aClass10_Sub43_1 == null) {
						return false;
					}
				}
				if (Static450.aClass269_1 == null) {
					Static450.aClass269_1 = new Class269(Static226.aClass187_75, Static93.aClass187_133);
				}
				if (Static114.aClass10_Sub7_Sub4_1.method4839(Static92.aClass187_38, Static301.aClass10_Sub43_1, Static450.aClass269_1)) {
					Static114.aClass10_Sub7_Sub4_1.method4856();
					Static114.aClass10_Sub7_Sub4_1.method4849(Static212.anInt4104);
					Static114.aClass10_Sub7_Sub4_1.method4836(Static300.aBoolean350, Static301.aClass10_Sub43_1);
					Static450.aClass269_1 = null;
					Static152.anInt3124 = 0;
					Static301.aClass10_Sub43_1 = null;
					Static285.aClass187_87 = null;
					return true;
				}
			}
		} catch (@Pc(65) Exception local65) {
			local65.printStackTrace();
			Static114.aClass10_Sub7_Sub4_1.method4853();
			Static301.aClass10_Sub43_1 = null;
			Static450.aClass269_1 = null;
			Static152.anInt3124 = 0;
			Static285.aClass187_87 = null;
		}
		return false;
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(IIIIIIZIII)V")
	public static void method1725(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6) {
		if (arg6 < 128 || arg0 < 128 || arg6 > (Static2.anInt7 - 2) * 128 || arg0 > Static17.anInt315 * 128 - 256) {
			Static394.anIntArray650[0] = Static394.anIntArray650[1] = -1;
			return;
		}
		@Pc(48) int local48 = Static326.method4459(arg4, arg6, arg0) - arg2;
		Static342.aClass34_4.W(arg1, 0, 0);
		Static412.aClass50_8.SA(Static342.aClass34_4);
		Static412.aClass50_8.v(arg6, local48, arg0, Static394.anIntArray650);
		Static342.aClass34_4.W(-arg1, 0, 0);
		Static412.aClass50_8.SA(Static342.aClass34_4);
	}

	@OriginalMember(owner = "client!el", name = "c", descriptor = "(I)Lclient!mv;")
	public static Class56_Sub1 method1726() {
		return Static266.anInt4718 < Static264.aClass56_Sub1Array1.length ? Static264.aClass56_Sub1Array1[Static266.anInt4718++] : null;
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(IIIILclient!se;)V")
	public static void method1727(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class24_Sub2 arg4) {
		@Pc(4) Class11 local4 = Static21.method286(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		@Pc(8) int local8 = 0;
		arg4.anInt3060 = (arg1 << Static286.anInt5018) + Static437.anInt7214;
		arg4.anInt3063 = arg3;
		arg4.anInt3061 = (arg2 << Static286.anInt5018) + Static437.anInt7214;
		for (@Pc(28) Class1 local28 = local4.aClass1_3; local28 != null; local28 = local28.aClass1_1) {
			if (local28.aClass24_Sub3_1.aBoolean468) {
				@Pc(38) int local38 = local28.aClass24_Sub3_1.method5579();
				if (local38 != -32768 && local38 < local8) {
					local8 = local38;
				}
			}
		}
		if (local8 < 0) {
			arg4.anInt3063 += local8;
			arg4.aBoolean215 = true;
		} else if (local4.aClass24_Sub4_1 != null) {
			arg4.anInt3063 -= local4.aClass24_Sub4_1.aShort78;
		}
		local4.aClass24_Sub2_1 = arg4;
	}
}
