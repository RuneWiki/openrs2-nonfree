import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static84 {

	@OriginalMember(owner = "client!es", name = "F", descriptor = "I")
	public static int anInt1555;

	@OriginalMember(owner = "client!es", name = "x", descriptor = "Lclient!ap;")
	public static final Class11 aClass11_25 = new Class11(51, 11);

	@OriginalMember(owner = "client!es", name = "C", descriptor = "Lclient!rc;")
	public static final Class205 aClass205_39 = new Class205(73, -1);

	@OriginalMember(owner = "client!es", name = "E", descriptor = "Lclient!ch;")
	public static final Class32 aClass32_28 = new Class32(" from your friend list first.", " zuerst von deiner Freunde-Liste!", " de votre liste d'amis.", " da sua lista de amigos primeiro.");

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(Lclient!cf;IZLclient!vc;I)V")
	public static void method1288(@OriginalArg(0) Class30 arg0, @OriginalArg(3) Class63 arg1) {
		Static224.aClass30_32.method692();
		if (Static323.aBoolean407) {
			return;
		}
		for (@Pc(16) Class2_Sub23 local16 = (Class2_Sub23) arg0.method694(); local16 != null; local16 = (Class2_Sub23) arg0.method682()) {
			@Pc(24) Class243 local24 = Static338.aClass226_3.method4913(local16.anInt2801);
			if (Static225.method3690(local24)) {
				@Pc(36) boolean local36 = Static267.method4111(local16, local24, arg1);
				if (local36) {
					Static324.method4793(local24, local16, arg1);
				}
			}
		}
	}

	@OriginalMember(owner = "client!es", name = "b", descriptor = "(I)I")
	public static int method1289() {
		if (Static242.aClass4_22 == null) {
			if (!Static269.aBoolean349 && Static285.anInt4946 > 0) {
				if (Static250.aBoolean335 && Static48.aClass69_1.method2261(81) && Static285.anInt4946 > 2) {
					return ((Class2_Sub26) Static195.aClass30_28.aClass2_41.aClass2_244.aClass2_244).anInt3595;
				}
				return ((Class2_Sub26) Static195.aClass30_28.aClass2_41.aClass2_244).anInt3595;
			}
			@Pc(23) int local23 = Static311.aClass129_1.method2997();
			@Pc(27) int local27 = Static311.aClass129_1.method2989();
			@Pc(29) int local29 = Static236.anInt2045;
			@Pc(31) int local31 = Static255.anInt4503;
			@Pc(33) int local33 = Static108.anInt5290;
			if (local29 < local23 && local23 < local33 + local29) {
				@Pc(51) int local51 = -1;
				@Pc(71) int local71;
				for (@Pc(53) int local53 = 0; local53 < Static285.anInt4946; local53++) {
					if (Static284.aBoolean372) {
						local71 = local31 + (-local53 + -1 + Static285.anInt4946) * 16 + 33;
						if (local27 > local71 - 13 && local71 + 3 >= local27) {
							local51 = local53;
						}
					} else {
						local71 = local31 + (Static285.anInt4946 + -1 + -local53) * 16 + 31;
						if (local27 > local71 - 13 && local27 <= local71 + 3) {
							local51 = local53;
						}
					}
				}
				if (local51 != -1) {
					local71 = 0;
					@Pc(133) Class83 local133 = new Class83(Static195.aClass30_28);
					for (@Pc(138) Class2_Sub26 local138 = (Class2_Sub26) local133.method2274(); local138 != null; local138 = (Class2_Sub26) local133.method2277()) {
						if (local71++ == local51) {
							return local138.anInt3595;
						}
					}
				}
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(Z)I")
	public static int method1290() {
		if (Static389.aBoolean472) {
			return 0;
		} else if (Static231.method3740()) {
			return Static272.aBoolean352 ? 2 : 1;
		} else {
			return 1;
		}
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(III)V")
	public static void method1291(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = arg0 * Static322.anInt5529 >> 8;
		if (arg1 == -1 && !Static221.aBoolean428) {
			Static293.method5579();
		} else if (arg1 != -1 && (arg1 != Static220.anInt3948 || !Static361.method5260()) && local9 != 0 && !Static221.aBoolean428) {
			Static281.method4296(local9, Static233.aClass171_53, arg1);
		}
		Static220.anInt3948 = arg1;
	}
}
