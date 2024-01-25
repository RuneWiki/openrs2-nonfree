import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static93 {

	@OriginalMember(owner = "client!fm", name = "O", descriptor = "Lclient!ij;")
	public static Class93 aClass93_37;

	@OriginalMember(owner = "client!fm", name = "V", descriptor = "I")
	public static int anInt1795;

	@OriginalMember(owner = "client!fm", name = "X", descriptor = "I")
	public static int anInt1797;

	@OriginalMember(owner = "client!fm", name = "N", descriptor = "I")
	public static int anInt1788 = 0;

	@OriginalMember(owner = "client!fm", name = "P", descriptor = "I")
	public static int anInt1789 = 0;

	@OriginalMember(owner = "client!fm", name = "ab", descriptor = "Z")
	public static boolean aBoolean128 = false;

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(ZLclient!vg;III)V")
	public static void method1721(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class201 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(10) int local10 = arg1.anInt6505;
		@Pc(13) int local13 = arg1.anInt6510;
		if (arg1.aByte71 == 0) {
			arg1.anInt6505 = arg1.anInt6513;
		} else if (arg1.aByte71 == 1) {
			arg1.anInt6505 = arg2 - arg1.anInt6513;
		} else if (arg1.aByte71 == 2) {
			arg1.anInt6505 = arg2 * arg1.anInt6513 >> 14;
		}
		if (arg1.aByte69 == 0) {
			arg1.anInt6510 = arg1.anInt6482;
		} else if (arg1.aByte69 == 1) {
			arg1.anInt6510 = arg3 - arg1.anInt6482;
		} else if (arg1.aByte69 == 2) {
			arg1.anInt6510 = arg3 * arg1.anInt6482 >> 14;
		}
		if (arg1.aByte71 == 4) {
			arg1.anInt6505 = arg1.anInt6531 * arg1.anInt6510 / arg1.anInt6545;
		}
		if (arg1.aByte69 == 4) {
			arg1.anInt6510 = arg1.anInt6505 * arg1.anInt6545 / arg1.anInt6531;
		}
		if (Static346.aBoolean577 && (Static45.method707(arg1).anInt6436 != 0 || arg1.anInt6559 == 0)) {
			if (arg1.anInt6510 < 5 && arg1.anInt6505 < 5) {
				arg1.anInt6510 = 5;
				arg1.anInt6505 = 5;
			} else {
				if (arg1.anInt6505 <= 0) {
					arg1.anInt6505 = 5;
				}
				if (arg1.anInt6510 <= 0) {
					arg1.anInt6510 = 5;
				}
			}
		}
		if (arg1.anInt6555 == 1337) {
			Static257.aClass201_10 = arg1;
		}
		if (arg0 && arg1.anObjectArray34 != null && (arg1.anInt6505 != local10 || arg1.anInt6510 != local13)) {
			@Pc(181) Class5_Sub17 local181 = new Class5_Sub17();
			local181.anObjectArray1 = arg1.anObjectArray34;
			local181.aClass201_3 = arg1;
			Static144.aClass103_74.method2745(local181);
		}
	}
}
