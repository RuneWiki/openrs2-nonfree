import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static99 {

	@OriginalMember(owner = "client!dn", name = "b", descriptor = "[B")
	public static byte[] aByteArray17;

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "I")
	public static int anInt2071 = 0;

	@OriginalMember(owner = "client!dn", name = "e", descriptor = "I")
	public static int anInt2074 = 0;

	@OriginalMember(owner = "client!dn", name = "g", descriptor = "Lclient!eba;")
	public static final Class81 aClass81_55 = new Class81(105, 14);

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(I)V")
	public static void method1834() {
		if (Static583.aClass141_2 != null) {
			Static583.aClass141_2.method5530();
		}
		if (Static378.aClass141_1 != null) {
			Static378.aClass141_1.method5530();
		}
	}

	@OriginalMember(owner = "client!dn", name = "b", descriptor = "(I)V")
	public static void method1835() {
		if (Static407.anInt7000 < 0) {
			return;
		}
		@Pc(8) long local8 = Static255.method4035();
		Static407.anInt7000 = (int) ((long) Static407.anInt7000 + Static399.aLong297 - local8);
		if (Static407.anInt7000 <= 0) {
			Static169.aFloat68 = Static438.aClass278_2.aFloat201;
			Static125.aFloat60 = Static438.aClass278_2.aFloat200;
			Static403.anInt6917 = Static438.aClass278_2.anInt7752;
			Static277.aClass36_1 = Static438.aClass278_2.aClass36_2;
			Static318.aFloat137 = Static438.aClass278_2.aFloat199;
			Static407.anInt7000 = -1;
			Static398.aFloat176 = Static438.aClass278_2.aFloat203;
			Static50.anInt1272 = Static438.aClass278_2.anInt7751;
			Static47.aFloat30 = Static438.aClass278_2.aFloat204;
			Static67.aFloat32 = Static438.aClass278_2.aFloat202;
			Static50.anInt1278 = Static438.aClass278_2.anInt7754;
		} else {
			@Pc(59) int local59 = (Static407.anInt7000 << 8) / Static485.anInt8186;
			@Pc(64) int local64 = 255 - local59;
			@Pc(69) float local69 = (float) local59 / 255.0F;
			@Pc(74) float local74 = 1.0F - local69;
			Static50.anInt1278 = ((Static438.aClass278_2.anInt7754 & 0xFF00FF) * local64 + (Static372.anInt6589 & 0xFF00FF) * local59 & 0xFF00FF00) + ((Static438.aClass278_2.anInt7754 & 0xFF00) * local64 + (Static372.anInt6589 & 0xFF00) * local59 & 0xFF0000) >>> 8;
			Static169.aFloat68 = (Static438.aClass278_2.aFloat201 - Static196.aFloat179) * local74 + Static196.aFloat179;
			Static318.aFloat137 = (Static438.aClass278_2.aFloat199 - Static130.aFloat206) * local74 + Static130.aFloat206;
			Static403.anInt6917 = local59 * Static441.anInt7698 + Static438.aClass278_2.anInt7752 * local64 >> 8;
			Static50.anInt1272 = ((Static102.anInt2113 & 0xFF00) * local59 + (Static438.aClass278_2.anInt7751 & 0xFF00) * local64 & 0xFF0000) + (local59 * (Static102.anInt2113 & 0xFF00FF) + (local64 * (Static438.aClass278_2.anInt7751 & 0xFF00FF)) & 0xFF00FF00) >>> 8;
			Static47.aFloat30 = local74 * (Static438.aClass278_2.aFloat204 - Static355.aFloat157) + Static355.aFloat157;
			Static398.aFloat176 = (Static438.aClass278_2.aFloat203 - Static555.aFloat212) * local74 + Static555.aFloat212;
			Static125.aFloat60 = Static283.aFloat118 + (Static438.aClass278_2.aFloat200 - Static283.aFloat118) * local74;
			Static67.aFloat32 = local74 * (Static438.aClass278_2.aFloat202 - Static336.aFloat153) + Static336.aFloat153;
			if (Static517.aClass36_3 != Static438.aClass278_2.aClass36_2) {
				Static277.aClass36_1 = Static174.aClass12_9.method6464(Static517.aClass36_3, Static438.aClass278_2.aClass36_2, local74, Static277.aClass36_1);
			}
		}
		Static399.aLong297 = local8;
	}
}
