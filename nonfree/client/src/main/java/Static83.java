import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static83 {

	@OriginalMember(owner = "client!du", name = "e", descriptor = "I")
	public static int anInt1147;

	@OriginalMember(owner = "client!du", name = "d", descriptor = "Lclient!kn;")
	public static final Class142 aClass142_20 = new Class142("purple:", "lila:", "violet:", "roxo:");

	@OriginalMember(owner = "client!du", name = "f", descriptor = "I")
	public static int anInt1148 = 0;

	@OriginalMember(owner = "client!du", name = "g", descriptor = "S")
	public static short aShort28 = 256;

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(Lclient!kf;Z)V")
	public static void method1014(@OriginalArg(0) Class111_Sub3 arg0) {
		arg0.aClass11_1 = null;
		@Pc(12) int local12 = arg0.aClass111_Sub8Array1.length;
		for (@Pc(14) int local14 = 0; local14 < local12; local14++) {
			arg0.aClass111_Sub8Array1[local14].aBoolean631 = false;
		}
		@Pc(28) Class63[] local28 = Class139.aClass63Array4;
		synchronized (Class139.aClass63Array4) {
			if (local12 < Class139.aClass63Array4.length && Static160.anIntArray215[local12] < 200) {
				Class139.aClass63Array4[local12].method1024(arg0);
				@Pc(49) int local49 = Static160.anIntArray215[local12]++;
			}
		}
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(II)V")
	public static void method1015(@OriginalArg(0) int arg0) {
		@Pc(8) Class1_Sub3_Sub1 local8 = Static427.method5426(arg0, 16);
		local8.method385();
	}
}
