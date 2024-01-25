import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static85 {

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "Lclient!tw;")
	public static final Class322 aClass322_2 = new Class322();

	@OriginalMember(owner = "client!dc", name = "h", descriptor = "I")
	public static int anInt2259 = 0;

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(BLclient!r;)V")
	public static void method1794(@OriginalArg(1) Class7 arg0) {
		Static144.aClass279Array1 = new Class279[Static459.anIntArray457.length];
		for (@Pc(16) int local16 = 0; local16 < Static459.anIntArray457.length; local16++) {
			@Pc(22) int local22 = Static459.anIntArray457[local16];
			@Pc(27) Class198 local27 = Static165.method2735(Static386.aClass348_93, local22);
			@Pc(35) Class45 local35 = arg0.method7837(local27, Static598.method2450(Static1.aClass348_53, local22));
			Static144.aClass279Array1[local16] = new Class279(local35, local27);
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(B)V")
	public static void method1795() {
		Static296.aClass324_3.method7430();
		Static432.aClass335_3.method7603();
		Static516.aClass127_2.method2859();
		Static103.aClass298_1.method6824();
		Class21_Sub1_Sub2_Sub1.lb.method4995();
		Static338.aClass29_1.method985();
		Static17.aClass254_1.method5934();
		Static342.aClass132_2.method2953();
		Static420.aClass60_1.method1596();
		Static152.aClass290_1.method6674();
		Static203.aClass230_1.method5248();
		Static259.aClass249_2.method5892();
		Static89.aClass121_1.method2680();
		Static5.aClass301_1.method6916();
		Static245.aClass107_2.method2501();
		Static145.aClass56_1.method1559();
		Static240.aClass175_1.method4136();
		Static207.aClass201_1.method4806();
		Static198.aClass338_1.method7711();
		Static288.aClass47_1.method1271();
		Static491.method7119();
		Static265.method4160();
		Static3.method35();
		Static556.method7887();
		Static418.method6589();
		Static365.aClass167_34.method3975();
		Static278.aClass167_20.method3975();
		Static499.aClass167_44.method3975();
		Static107.aClass167_7.method3975();
		Static471.aClass167_53.method3975();
	}
}
