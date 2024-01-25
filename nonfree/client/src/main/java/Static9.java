import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static9 {

	@OriginalMember(owner = "client!ah", name = "E", descriptor = "F")
	public static float aFloat6;

	@OriginalMember(owner = "client!ah", name = "m", descriptor = "I")
	public static int anInt205 = 999999;

	@OriginalMember(owner = "client!ah", name = "o", descriptor = "Lclient!pn;")
	public static final Class194 aClass194_5 = new Class194(72, 6);

	@OriginalMember(owner = "client!ah", name = "q", descriptor = "Z")
	public static boolean aBoolean30 = false;

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(I[Lclient!o;)V")
	public static void method160(@OriginalArg(1) Class49[] arg0) {
		Static215.anInt3590 = arg0.length;
		Static324.aClass49Array11 = new Class49[Static215.anInt3590 + 10];
		Static417.anIntArray475 = new int[Static215.anInt3590 + 10];
		Static468.method3860(arg0, 0, Static324.aClass49Array11, 0, Static215.anInt3590);
		for (@Pc(26) int local26 = 0; local26 < Static215.anInt3590; local26++) {
			Static417.anIntArray475[local26] = Static324.aClass49Array11[local26].Q();
		}
		for (@Pc(45) int local45 = Static215.anInt3590; local45 < Static324.aClass49Array11.length; local45++) {
			Static417.anIntArray475[local45] = 12;
		}
	}
}
