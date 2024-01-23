import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static98 {

	@OriginalMember(owner = "client!hm", name = "j", descriptor = "Lclient!ec;")
	public static Class46 aClass46_13 = new Class46(5);

	@OriginalMember(owner = "client!hm", name = "l", descriptor = "[Lclient!f;")
	public static Class52[] aClass52Array1 = new Class52[4];

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(BJ)V")
	public static void method1888(@OriginalArg(1) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		for (@Pc(19) int local19 = 0; local19 < Static11.anInt296; local19++) {
			if (Static281.aLongArray23[local19] == arg0) {
				Static11.anInt296--;
				for (@Pc(42) int local42 = local19; local42 < Static11.anInt296; local42++) {
					Static281.aLongArray23[local42] = Static281.aLongArray23[local42 + 1];
					Static105.aStringArray8[local42] = Static105.aStringArray8[local42 + 1];
					Static76.aBooleanArray6[local42] = Static76.aBooleanArray6[local42 + 1];
				}
				Static184.anInt3910 = Static13.anInt334;
				Static95.aClass2_Sub26_Sub1_1.method4287(210);
				Static95.aClass2_Sub26_Sub1_1.method4225(arg0);
				break;
			}
		}
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(IZIB)I")
	public static int method1889(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		@Pc(12) Class2_Sub18 local12 = (Class2_Sub18) Static50.aClass79_4.method2002((long) arg0);
		if (local12 == null) {
			return 0;
		}
		@Pc(25) int local25 = 0;
		for (@Pc(27) int local27 = 0; local27 < local12.anIntArray289.length; local27++) {
			if (local12.anIntArray289[local27] >= 0 && Static13.anInt332 > local12.anIntArray289[local27]) {
				@Pc(61) Class155 local61 = Static152.method2616(local12.anIntArray289[local27]);
				if (local61.aClass79_20 != null) {
					@Pc(73) Class2_Sub21 local73 = (Class2_Sub21) local61.aClass79_20.method2002((long) arg2);
					if (local73 != null) {
						if (arg1) {
							local25 += local12.anIntArray290[local27] * local73.anInt4234;
						} else {
							local25 += local73.anInt4234;
						}
					}
				}
			}
		}
		return local25;
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(IB)V")
	public static void method1890() {
		Static102.aClass46_14.method1068(5);
		Static261.aClass46_35.method1068(5);
		Static39.aClass46_6.method1068(5);
	}
}
