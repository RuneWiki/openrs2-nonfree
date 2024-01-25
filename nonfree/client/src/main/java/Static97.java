import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static97 {

	@OriginalMember(owner = "client!er", name = "C", descriptor = "I")
	public static int anInt1949;

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(Lclient!fs;ZLclient!ya;)V")
	public static void method1700(@OriginalArg(0) Class76 arg0, @OriginalArg(2) Class19 arg1) {
		@Pc(10) Class18[] local10 = Static456.method327(arg0, Static336.anInt6553);
		Static349.aClass57Array14 = new Class57[local10.length];
		for (@Pc(20) int local20 = 0; local20 < local10.length; local20++) {
			Static349.aClass57Array14[local20] = arg1.method4308(local10[local20]);
		}
		local10 = Static456.method327(arg0, Static394.anInt6593);
		Static151.aClass57Array8 = new Class57[local10.length];
		for (@Pc(51) int local51 = 0; local51 < local10.length; local51++) {
			Static151.aClass57Array8[local51] = arg1.method4308(local10[local51]);
		}
		local10 = Static456.method327(arg0, Static75.anInt1532);
		Static410.aClass57Array17 = new Class57[local10.length];
		for (@Pc(78) int local78 = 0; local78 < local10.length; local78++) {
			Static410.aClass57Array17[local78] = arg1.method4308(local10[local78]);
		}
		local10 = Static456.method327(arg0, Static454.anInt4074);
		Static185.aClass57Array9 = new Class57[local10.length];
		for (@Pc(105) int local105 = 0; local105 < local10.length; local105++) {
			Static185.aClass57Array9[local105] = arg1.method4308(local10[local105]);
		}
		local10 = Static456.method327(arg0, Static145.anInt2904);
		Static107.aClass57Array6 = new Class57[local10.length];
		for (@Pc(136) int local136 = 0; local136 < local10.length; local136++) {
			Static107.aClass57Array6[local136] = arg1.method4308(local10[local136]);
		}
		local10 = Static456.method327(arg0, Static260.anInt4897);
		Static59.aClass57Array3 = new Class57[local10.length];
		for (@Pc(163) int local163 = 0; local163 < local10.length; local163++) {
			Static59.aClass57Array3[local163] = arg1.method4308(local10[local163]);
		}
		local10 = Static456.method327(arg0, Static289.anInt5213);
		Static455.aClass57Array11 = new Class57[local10.length];
		for (@Pc(194) int local194 = 0; local194 < local10.length; local194++) {
			Static455.aClass57Array11[local194] = arg1.method4308(local10[local194]);
		}
		local10 = Static456.method327(arg0, Static365.anInt6310);
		Static333.aClass57Array12 = new Class57[local10.length];
		for (@Pc(221) int local221 = 0; local221 < local10.length; local221++) {
			Static333.aClass57Array12[local221] = arg1.method4308(local10[local221]);
		}
		local10 = Static456.method327(arg0, Static223.anInt4342);
		Static342.aClass57Array13 = new Class57[local10.length];
		for (@Pc(248) int local248 = 0; local248 < local10.length; local248++) {
			Static342.aClass57Array13[local248] = arg1.method4308(local10[local248]);
		}
		local10 = Static456.method327(arg0, Static37.anInt649);
		Static126.aClass57Array7 = new Class57[local10.length];
		for (@Pc(275) int local275 = 0; local275 < local10.length; local275++) {
			Static126.aClass57Array7[local275] = arg1.method4308(local10[local275]);
		}
		local10 = Static456.method327(arg0, Static376.anInt6286);
		Static77.aClass57Array4 = new Class57[local10.length];
		for (@Pc(302) int local302 = 0; local302 < local10.length; local302++) {
			Static77.aClass57Array4[local302] = arg1.method4308(local10[local302]);
		}
		local10 = Static456.method327(arg0, Static205.anInt3910);
		Static429.aClass57Array18 = new Class57[local10.length];
		for (@Pc(333) int local333 = 0; local333 < local10.length; local333++) {
			Static429.aClass57Array18[local333] = arg1.method4308(local10[local333]);
		}
		Static163.aClass57_16 = arg1.method4308(Static456.method318(arg0, Static339.anInt5870, 0));
		Static389.aClass57_22 = arg1.method4308(Static456.method318(arg0, Static410.anInt6733, 0));
		local10 = Static456.method327(arg0, Static175.anInt3393);
		Static309.aClass57Array10 = new Class57[local10.length];
		for (@Pc(376) int local376 = 0; local376 < local10.length; local376++) {
			Static309.aClass57Array10[local376] = arg1.method4308(local10[local376]);
		}
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(Lclient!fs;I)I")
	public static int method1701(@OriginalArg(0) Class76 arg0) {
		@Pc(5) int local5 = 0;
		if (arg0.method2125(Static338.anInt5846)) {
			local5++;
		}
		if (arg0.method2125(Static367.anInt6320)) {
			local5++;
		}
		return local5;
	}
}
