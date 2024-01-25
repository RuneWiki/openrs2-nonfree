import java.io.IOException;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static84 {

	@OriginalMember(owner = "client!db", name = "e", descriptor = "Lclient!vfa;")
	public static Class350 aClass350_1;

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(B)V")
	public static void method1672() throws IOException {
		if (Static324.aClass165_2 == null || Static236.anInt4199 <= 0) {
			return;
		}
		@Pc(12) int local12 = 0;
		while (true) {
			@Pc(17) Class3_Sub42 local17 = (Class3_Sub42) Static286.aClass112_31.method3088();
			if (local17 == null) {
				Static173.anInt3427 = 0;
				Static85.anInt1843 += local12;
				break;
			}
			Static324.aClass165_2.method3975(local17.anInt7408, local17.aClass3_Sub11_Sub1_1.aByteArray62);
			local12 += local17.anInt7408;
			Static236.anInt4199 -= local17.anInt7408;
			local17.method7825();
			local17.aClass3_Sub11_Sub1_1.method5180();
			local17.method6188();
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(I)V")
	public static void method1674() {
		Static247.aClass6_26.method102();
	}
}
