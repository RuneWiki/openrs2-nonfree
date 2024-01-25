import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static99 {

	@OriginalMember(owner = "client!dha", name = "b", descriptor = "I")
	public static int anInt7119;

	@OriginalMember(owner = "client!dha", name = "a", descriptor = "I")
	public static int anInt7118 = 0;

	@OriginalMember(owner = "client!dha", name = "a", descriptor = "(IZ)V")
	public static void method6065(@OriginalArg(1) boolean arg0) {
		for (@Pc(11) Class2_Sub33 local11 = (Class2_Sub33) Static371.aClass109_36.method2325(); local11 != null; local11 = (Class2_Sub33) Static371.aClass109_36.method2318()) {
			if (local11.aClass2_Sub13_Sub2_3 != null) {
				Static586.aClass2_Sub13_Sub4_2.method7226(local11.aClass2_Sub13_Sub2_3);
				local11.aClass2_Sub13_Sub2_3 = null;
			}
			if (local11.aClass2_Sub13_Sub2_2 != null) {
				Static586.aClass2_Sub13_Sub4_2.method7226(local11.aClass2_Sub13_Sub2_2);
				local11.aClass2_Sub13_Sub2_2 = null;
			}
			local11.method8653();
		}
		if (!arg0) {
			return;
		}
		for (@Pc(54) Class2_Sub33 local54 = (Class2_Sub33) Static164.aClass109_27.method2325(); local54 != null; local54 = (Class2_Sub33) Static164.aClass109_27.method2318()) {
			if (local54.aClass2_Sub13_Sub2_3 != null) {
				Static586.aClass2_Sub13_Sub4_2.method7226(local54.aClass2_Sub13_Sub2_3);
				local54.aClass2_Sub13_Sub2_3 = null;
			}
			local54.method8653();
		}
		for (@Pc(81) Class2_Sub33 local81 = (Class2_Sub33) Static221.aClass118_18.method2596(); local81 != null; local81 = (Class2_Sub33) Static221.aClass118_18.method2597()) {
			if (local81.aClass2_Sub13_Sub2_3 != null) {
				Static586.aClass2_Sub13_Sub4_2.method7226(local81.aClass2_Sub13_Sub2_3);
				local81.aClass2_Sub13_Sub2_3 = null;
			}
			local81.method8653();
		}
	}
}
