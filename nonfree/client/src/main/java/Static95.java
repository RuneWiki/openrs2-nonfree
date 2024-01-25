import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static95 {

	@OriginalMember(owner = "client!eo", name = "l", descriptor = "I")
	public static int anInt1787;

	@OriginalMember(owner = "client!eo", name = "h", descriptor = "I")
	public static int anInt1783 = 0;

	@OriginalMember(owner = "client!eo", name = "j", descriptor = "I")
	public static int anInt1785 = 0;

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(I)V")
	public static void method1501() {
		Static35.aClass47_3.method1139();
		Static234.aClass107_3.method2355();
		Static46.aClass233_1.method5373();
		Static71.aClass105_6.method2337();
		Static322.aClass187_2.method4495();
		Static196.aClass139_1.method3224();
		Static191.aClass28_1.method573();
		Static168.aClass115_2.method2712();
		Static111.aClass170_1.method3954();
		Static80.aClass258_1.method5795();
		Static14.aClass193_1.method4644();
		Static231.aClass126_3.method2909();
		Static1.aClass224_1.method5307();
		Static105.aClass251_1.method5680();
		Static228.aClass243_2.method5553();
		Static141.aClass168_1.method3944();
		Static199.aClass134_1.method3029();
		Static445.aClass8_1.method235();
		Static199.aClass106_2.method2344();
		Static446.aClass89_1.method1813();
		Static163.method2623();
		Static21.method400();
		Static437.method5859();
		if (Static221.aClass176_5 != Static234.aClass176_7) {
			for (@Pc(88) int local88 = 0; local88 < Static276.aByteArrayArray96.length; local88++) {
				Static276.aByteArrayArray96[local88] = null;
			}
			Static410.anInt7174 = 0;
		}
		Static235.method3483();
		Static442.method4060();
		Static243.method3593();
		Static429.method5747();
		Static390.method5317();
		Static104.aClass83_16.method1669();
		Static276.aClass109_10.method4740();
		Static302.aClass90_1.method1864();
		Static302.method4315();
		Static220.aClass250_51.method5676();
		Static249.aClass250_55.method5676();
		Static147.aClass250_27.method5676();
		Static179.aClass250_40.method5676();
		Static235.aClass250_53.method5676();
		Static88.aClass250_19.method5676();
		Static260.aClass250_56.method5676();
		Static204.aClass250_47.method5676();
		Static384.aClass250_76.method5676();
		Static316.aClass250_61.method5676();
		Static160.aClass250_35.method5676();
		client.lb.method5676();
		Static215.aClass250_50.method5676();
		Static420.aClass250_87.method5676();
		Static334.aClass250_66.method5676();
		Static234.aClass250_52.method5676();
		Static82.aClass250_17.method5676();
		Static96.aClass250_20.method5676();
		Static181.aClass250_41.method5676();
		Static383.aClass250_75.method5676();
		Static10.aClass250_3.method5676();
		Static412.aClass250_86.method5676();
		Static84.aClass250_18.method5676();
		Static243.aClass250_54.method5676();
		Static68.aClass250_15.method5676();
		Static276.aClass250_59.method5676();
		Static48.aClass250_10.method5676();
		Static19.aClass250_4.method5676();
		Static37.aClass250_9.method5676();
		Static116.aClass250_23.method5676();
		Static387.aClass83_54.method1669();
		Static63.aClass83_9.method1669();
		Static358.aClass83_51.method1669();
		Static97.aClass83_15.method1669();
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(IZI)Z")
	public static boolean method1503(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x180) != 0;
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(CB)C")
	public static char method1506(@OriginalArg(0) char arg0) {
		if (arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-') {
			return '_';
		} else if (arg0 == '[' || arg0 == ']' || arg0 == '#') {
			return arg0;
		} else if (arg0 == 'à' || arg0 == 'á' || arg0 == 'â' || arg0 == 'ä' || arg0 == 'ã' || arg0 == 'À' || arg0 == 'Á' || arg0 == 'Â' || arg0 == 'Ä' || arg0 == 'Ã') {
			return 'a';
		} else if (arg0 == 'è' || arg0 == 'é' || arg0 == 'ê' || arg0 == 'ë' || arg0 == 'È' || arg0 == 'É' || arg0 == 'Ê' || arg0 == 'Ë') {
			return 'e';
		} else if (arg0 == 'í' || arg0 == 'î' || arg0 == 'ï' || arg0 == 'Í' || arg0 == 'Î' || arg0 == 'Ï') {
			return 'i';
		} else if (arg0 == 'ò' || arg0 == 'ó' || arg0 == 'ô' || arg0 == 'ö' || arg0 == 'õ' || arg0 == 'Ò' || arg0 == 'Ó' || arg0 == 'Ô' || arg0 == 'Ö' || arg0 == 'Õ') {
			return 'o';
		} else if (arg0 == 'ù' || arg0 == 'ú' || arg0 == 'û' || arg0 == 'ü' || arg0 == 'Ù' || arg0 == 'Ú' || arg0 == 'Û' || arg0 == 'Ü') {
			return 'u';
		} else if (arg0 == 'ç' || arg0 == 'Ç') {
			return 'c';
		} else if (arg0 == 'ÿ' || arg0 == 'Ÿ') {
			return 'y';
		} else if (arg0 == 'ñ' || arg0 == 'Ñ') {
			return 'n';
		} else if (arg0 == 'ß') {
			return 'b';
		} else {
			return Character.toLowerCase(arg0);
		}
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method1510(@OriginalArg(0) String arg0) {
		System.out.println("Error: " + Static276.method4001("%0a", arg0, "\n"));
	}
}
