import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static89 {

	@OriginalMember(owner = "client!ec", name = "A", descriptor = "[I")
	public static final int[] anIntArray156 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

	@OriginalMember(owner = "client!ec", name = "B", descriptor = "[I")
	public static final int[] anIntArray157 = new int[] { 0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4 };

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(BI)Lclient!go;")
	public static Class91_Sub1 method1639(@OriginalArg(1) int arg0) {
		return Static43.aBoolean46 && arg0 >= Static18.anInt3463 && Static204.anInt7303 >= arg0 ? Static444.aClass91_Sub1Array2[arg0 - Static18.anInt3463] : null;
	}

	@OriginalMember(owner = "client!ec", name = "e", descriptor = "(I)V")
	public static void method1640() {
		@Pc(5) Class222 local5 = null;
		try {
			@Pc(11) Class9 local11 = Static77.aClass180_1.method4083("2", true);
			while (local11.anInt368 == 0) {
				Static224.method3441(1L);
			}
			if (local11.anInt368 == 1) {
				local5 = (Class222) local11.anObject2;
				@Pc(35) Class1_Sub5 local35 = new Class1_Sub5(Static69.anInt1592 * 6 + 3);
				local35.method5396(1);
				local35.method5393(Static69.anInt1592);
				for (@Pc(45) int local45 = 0; local45 < Static266.anIntArray630.length; local45++) {
					if (Static32.aBooleanArray1[local45]) {
						local35.method5393(local45);
						local35.method5417(Static266.anIntArray630[local45]);
					}
				}
				local5.method4986(local35.anInt6475, local35.aByteArray89, 0);
			}
		} catch (@Pc(75) Exception local75) {
		}
		try {
			if (local5 != null) {
				local5.method4988();
			}
		} catch (@Pc(87) Exception local87) {
		}
		Static209.aLong120 = Static279.method4058();
		Static359.aBoolean414 = false;
	}
}
